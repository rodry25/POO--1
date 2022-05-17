/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_16_custom_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_16_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    System.out.println("Captura la edad:");
    int valor;   
    try{
        valor = input.nextInt();
    }catch(InputMismatchException e){
        throw new Exception("Introdujiste una cadena de texto, no es una edad");
    }
    
    }
    
}

//EXCEPCION PERSONALIZADA
//LO MEJOR ES HEREDAR DE EXCEPTION
class ExcepcionDeCaptura extends Exception{

    public ExcepcionDeCaptura() {
    }

    public ExcepcionDeCaptura(String message) {
        super(message);
    }
    
}