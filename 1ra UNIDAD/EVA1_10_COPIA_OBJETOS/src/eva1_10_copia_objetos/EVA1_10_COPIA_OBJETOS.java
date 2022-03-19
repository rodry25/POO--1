/*
 * Azul Siret Cordero Gonzalez
 * 21550381
 */
package eva1_10_copia_objetos;

/**
 *
 * @author liar4
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        System.out.println("Direccion: " + obj);
        obj.x = 100;
        System.out.println("Valor de x = " + obj.x);
    
    }
    
}
class Prueba{
    public int x;

}