/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_multiples_catch;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXCEPCIONES {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero 1: ");
        int entero = input.nextInt();
        System.out.println("Introduce un numero entero 2;");
        int entero2 = input.nextInt();
        //--------
        try{
            System.out.println("Division: " + (entero/entero2));
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Termina el programa");
    }
    
}
    