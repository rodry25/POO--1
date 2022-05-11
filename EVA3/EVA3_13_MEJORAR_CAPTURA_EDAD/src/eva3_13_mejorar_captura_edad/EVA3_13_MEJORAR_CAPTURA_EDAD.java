/*
 * 2 catch InputMismatchException y Exception
 */

package eva3_13_mejorar_captura_edad;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean datoErroneo = true; //el usuario siempre se equivoca
       do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad(Numero entero): ");
        int edad = input.nextInt();
        if(edad < 0)
                    throw new Exception("El valor: " + edad + " no es una edad valida");
        System.out.println("Tu edad: " + edad);
        datoErroneo = false;
        } catch(Exception e){
            System.out.println("El dato introducido no es un numero valido");
        }
       }while(datoErroneo);
    }
    
}
