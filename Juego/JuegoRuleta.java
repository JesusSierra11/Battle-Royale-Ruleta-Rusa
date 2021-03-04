import java.util.Scanner;

/**
 *
 * @author Jesús
 */
public class JuegoRuleta {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        byte menu = 0, seleccionPersonaje = 0;
        int girarCilindro;
        boolean seguir = false;

        Revolver revolver1 = new Revolver();
        Revolver revolver2 = new Revolver();

        JugadorRuso jugador1 = new JugadorRuso("Agata", 1);
        JugadorRuso jugador2 = new JugadorRuso("Varya", 2);
        JugadorRuso jugador3 = new JugadorRuso("Vladimir", 3);
        JugadorRuso jugador4 = new JugadorRuso("Boris", 4);
        JugadorRuso jugador5 = new JugadorRuso("Lenin", 5);
        JugadorRuso jugador6 = new JugadorRuso("Lagertha", 6);

        while (!seguir) {
            System.out.println("Bienvenido al juego de la ruleta Rusa:\n"
                    + "1-Seleccione un jugador/a\n"
                    + "2-Disparar revolver\n"
                    + "3-Girar cilindro\n"
                    + "4-Comprobar quien esta vivo.\n"
                    + "5-Salir");
            menu = sc.nextByte();
            switch (menu) {
                case 1:
                    System.out.println("Seleccione el jugador que desee:\n"
                            + "1-Agata\n"
                            + "2-Varya\n"
                            + "3-Vladimir\n"
                            + "4-Boris\n"
                            + "5-Lenin\n"
                            + "6-Lagertha");
                    seleccionPersonaje = sc.nextByte();
                    switch (seleccionPersonaje) {
                        case 1 ->
                            System.out.println("Has seleccionado a: " + jugador1.getNombre());
                        case 2 -> {
                            System.out.println("Has seleccionado a: " + jugador2.getNombre());
                        }
                        case 3 -> {
                            System.out.println("Has seleccionado a: " + jugador3.getNombre());
                        }
                        case 4 -> {
                            System.out.println("Has seleccionado a: " + jugador4.getNombre());
                        }
                        case 5 -> {
                            System.out.println("Has seleccionado a: " + jugador5.getNombre());
                        }
                        case 6 -> {
                            System.out.println("Has seleccionado a: " + jugador6.getNombre());
                        }
                        default -> {
                        }
                    }
                    break;

                case 2:
                    switch (seleccionPersonaje) {
                        case 1 ->
                            jugador1.seDispara(revolver1);
                        case 2 ->
                            jugador2.seDispara(revolver1);
                        case 3 ->
                            jugador3.seDispara(revolver1);
                        case 4 ->
                            jugador4.seDispara(revolver1);
                        case 5 ->
                            jugador5.seDispara(revolver1);
                        case 6 ->
                            jugador6.seDispara(revolver1);
                        default -> {
                        }
                    }
                    break;

                case 3:
                    System.out.println("¿Cuantos posiciones quieres girar el cilindro?");
                    girarCilindro = sc.nextByte();
                    revolver1.girarCilindro(girarCilindro);
                    break;
                case 4:
                    System.out.println("Agata: " + jugador1.isVivo() + "\nVarya: "
                            + jugador2.isVivo() + "\nVladimir: " + jugador3.isVivo()
                            + "\nBoris: "
                            + jugador4.isVivo() + "\nLenin: " + jugador5.isVivo()
                            + "\nLagertha: " + jugador6.isVivo()
                    );
                    break;
                case 5:
                    System.out.println("Espero que haya disfrutado de la partida.");
                    seguir = true;
                    break;
                default:

            }
        }
    }
}
