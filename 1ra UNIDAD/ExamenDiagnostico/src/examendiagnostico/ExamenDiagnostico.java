/*
 * Azul Siret Cordero Gonzalez
 * 21550381
 */
package examendiagnostico;
import java.util.Scanner;
/**
 *
 * @author liar4
 */
public class ExamenDiagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num = 0;
        
        while (num != -1){
        System.out.println("Ingresa un numero del 1 al 7");
        num = scn.nextInt();
        
        switch (num){
                
                case 1:
                    System.out.println("Numero seleccionado 1, LUNES");
                    break;
                    
                case 2:
                    System.out.println("Numero seleccionado 2, MARTES");
                    break;
                    
                case 3:
                    System.out.println("Numero seleccionado 3, MIERCOLES");
                    break;
                    
                case 4:
                    System.out.println("Numero seleccionado 4, JUEVES");
                    break;
                    
                case 5:
                    System.out.println("Numero seleccionado 5, VIERNES");
                    break;
                
                case 6:
                    System.out.println("Numero seleccionado 6, SABADO");
                    break;
                    
                case 7:
                    System.out.println("Numero seleccionado 7, DOMINGO");
                    break;
                    
                case -1:
                    System.out.println("Numero seleccionado -1, Hasta luego!");
                    break;    
                    
                   
        }
        }
    }
    
}

