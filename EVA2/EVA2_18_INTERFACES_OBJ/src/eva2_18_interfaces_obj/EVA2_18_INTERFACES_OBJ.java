/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_interfaces_obj;

/**
 *
 * @author liar4
 */
public class EVA2_18_INTERFACES_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Persona persona = new Persona();
        persona.setNombre("Ana");
        
        Mensajes mensajes = persona;
        mensajes.mostrarMensajes();
    }
    
}

interface Mensajes{
    public void mostrarMensajes();
}

class Persona implements Mensajes{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarMensajes() {
        System.out.println(nombre);
    }
    
}
    