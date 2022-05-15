/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_polimorfismo_int;

/**
 *
 * @author liar4
 */
public class Prueba implements Mensaje{

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void otroMetodo(){
        System.out.println("Metodo Adicional");
    }
}