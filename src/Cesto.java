public class Cesto {
    int capacidadCesto;
    int cantidad;

    public Cesto(int capacidadCesto) {
        this.capacidadCesto = capacidadCesto;
        cantidad = 0;
    }

    // Está dejando mangas
    public synchronized void dejarPieza() {
        try {
            while(cantidad >= capacidadCesto) {
                wait();
            }
            cantidad++;
            notifyAll();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Está cogiendo cuerpos
    public synchronized void cogerPiezas(int n) {
        try {
            while((cantidad - n) <= 0) {
                wait();
            }
            cantidad -= n;
            notifyAll();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
