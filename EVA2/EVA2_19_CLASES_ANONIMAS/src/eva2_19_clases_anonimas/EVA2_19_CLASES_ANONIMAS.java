/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author liar4
 */
public class EVA2_19_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Mensajes mensajes = new Mensajes(){//clase anonima
            @Override
            public void mostrarMensajes() {
                System.out.println("Hola Mundo!");
            }
            
        };
        mensajes.mostrarMensajes();
    }
    
}

interface Mensajes{
    public void mostrarMensajes();
}