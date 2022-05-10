/* notas:
 * revisar InputMismatchException
 * no olvidar el import
 */

package eva3_7_uso_excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       boolean datoErroneo = true; //el usuario siempre se equivoca
       do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad(Numero entero): ");
        int edad = input.nextInt();
        System.out.println("Tu edad: " + edad);
        datoErroneo = false;
        } catch(InputMismatchException e){
            System.out.println("El dato introducido no es un numero valido");
        }
       }while(datoErroneo);
    }  
}
