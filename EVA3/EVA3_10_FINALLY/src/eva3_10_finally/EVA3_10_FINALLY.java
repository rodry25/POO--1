/*
 * El costo de una excepcion es detener el programa
 */

package eva3_10_finally;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un dato entero:");
            int valor = input.nextInt();
            System.out.println("el valor es: " + valor);
        }catch(InputMismatchException e){ //puede haber multiples catch que PUEDEN ejecutarse O NO, depende de la excepcion
            e.printStackTrace();
        }finally{ //esta SIEMPRE se va a ejecutar
                  // se utiliza en ocasiones muy particulares
        System.out.println("ESTA LINEA SIEMRE DEBE EJECUTARSE");        
        }
        System.out.println("Fin del programa");
    }   
}
