/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_excepciones;
import java.util.Scanner;
/**
 *
 * @author liar4
 */
public class EVA3_9_EXCEPCIONES {

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