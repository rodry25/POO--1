/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_excepciones;

import java.util.Scanner;


/**
 *
 * @author liar4
 */
public class EVA3_2_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int iedad = input.nextInt();
        System.out.println("Tu edad:" + iedad);
        //input mismatch error da cando los datos no son compatibles con lo que se pide
        //cuando se dan errores no se producen excepciones las cuales no dejan que el programa avance por lo cual termina
        
        
        
       
    }
    
}