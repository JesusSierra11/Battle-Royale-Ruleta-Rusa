import java.util.Random;

/**
 *
 * @author Jesús
 */
public class Revolver {

    private int posRealBala;
    private int posActualDisparo;
    public final int POSICIONES = 6;

    public Revolver() {
        Random r = new Random();
        posRealBala = r.nextInt(POSICIONES);
        girarCilindro();
    }

    public void mirarPosiciones() {
        System.out.println("Pista: la bala estÃ¡ en la pos: " + posRealBala);
        System.out.println("Pista: la posicion actual a disparar es: " + posActualDisparo);
    }

    public boolean disparar() {
        boolean exito = false;

        if (posRealBala == posActualDisparo) {
            exito = true;
        }

        avanzarCilindro();
        return exito;
    }

    private void avanzarCilindro() {
        posActualDisparo++;
        //
        if (posActualDisparo == 6) {
            posActualDisparo = 0;
        }

    }

    public void girarCilindro() {
        Random r = new Random();
        posActualDisparo = r.nextInt(POSICIONES);
    }

    public void girarCilindro(int nPosiciones) {
        posActualDisparo = (posActualDisparo + nPosiciones) % POSICIONES;
    }
}
