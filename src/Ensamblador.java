public class Ensamblador extends Thread {
    public static final String ANSI_GREEN = "\u001B[32m";

    private String nombre;
    private Cesto cesto_mangas;
    private Cesto cesto_cuerpos;

    public Ensamblador(String nombre, Cesto cesto_mangas, Cesto cesto_cuerpos) {
        this.nombre = nombre;
        this.cesto_mangas = cesto_mangas;
        this.cesto_cuerpos = cesto_cuerpos;
    }

    @Override
    public void run() {
        for(;;) {
            cesto_cuerpos.cogerPiezas(1); // Coge 1 cuerpo
            cesto_mangas.cogerPiezas(2); // Coge 2 mangas

            System.out.println("\n" + ANSI_GREEN + nombre + " ha cogido 2 mangas y 1 cuerpo...");

            try {
                Thread.sleep ((int) ((Math.random()*2000)+2000));
            }catch (InterruptedException e){ e.printStackTrace();}

            System.out.println(ANSI_GREEN + nombre + " ha cosido un jersey.");
        }
    }
}
