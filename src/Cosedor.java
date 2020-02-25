public class Cosedor extends Thread {
    public static final String ANSI_BLUE = "\u001B[34m";

    private String nombre;
    private Cesto cesto;
    private String tipoPieza;

    public Cosedor(String nombre, Cesto cesto, String tipoPieza) {
        this.nombre = nombre;
        this.cesto = cesto;
        this.tipoPieza = tipoPieza;
    }

    @Override
    public void run() {
        for(;;) {
            System.out.println(ANSI_BLUE + nombre + " está cosiendo " + tipoPieza + ".");

            try {
                Thread.sleep ((int) ((Math.random()*1000)+1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cesto.dejarPieza();
            System.out.println(ANSI_BLUE + nombre + " ha dejado en el cesto " + tipoPieza + ".");
        }
    }
}
