public class Main {
    public static void main(String[] args) {
        Cesto cesto_mangas = new Cesto(8);
        Cesto cesto_cuerpos = new Cesto(5);

        Cosedor cose_mangas = new Cosedor("Sergio", cesto_mangas, "mangas");
        Cosedor cose_cuerpos = new Cosedor("Fabián", cesto_cuerpos, "cuerpos");

        Ensamblador ensamblador = new Ensamblador("Miguel", cesto_mangas, cesto_cuerpos);

        cose_mangas.start();
        cose_cuerpos.start();

        ensamblador.start();
    }
}
