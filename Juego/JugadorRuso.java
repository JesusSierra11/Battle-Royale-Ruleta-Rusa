/**
 *
 * @author Jesús
 */
public class JugadorRuso {

    private int id;
    private String nombre;
    private boolean vivo;

    public JugadorRuso(int id) {
        this.id = id;
        vivo = true;
    }

    public JugadorRuso(String nombre) {
        this.nombre = nombre;
        vivo = true;
    }

    public JugadorRuso(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        vivo = true;
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean seDispara(Revolver r) {
        System.out.println("El jugador ruso con id=" + id + "/nombre=" + nombre + " se apunta con el revolver");

        if (r.disparar()) {
            System.out.println("<Bala disparada>");
            vivo = false;
        } else {
            System.out.println("Esta ronda he tenido suerte");
        }
        return vivo;
    }

    public boolean isVivo() {
        return vivo;
    }
}
