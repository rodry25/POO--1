/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_try_catch;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author liar4
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad: (numero entero)");
        int iedad=0;
        try{
            //codigo que puede fallar
            int iedad = input.nextInt();
        } catch(InputMismatchException e){
            //(excepcion a capturar)
            //codigo que ejecutamos si ocurre una falla 
            
            //e.printStackTrace();
            System.out.println("FALLO la captura");
        }
        System.out.println("Tu edad: " + iedad);
    }
    
}