/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_14_throw_p2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_14_THROW_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Juan Perez");
        try{
        persona.setEdad(20);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        try {
            Persona persona2 = new Persona("Juan Perez", 50);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
        class Persona{
        private String Nombre;
        private int edad;
        
        public Persona(){
        
        }

    public Persona(String Nombre, int edad) throws Exception {
        this.Nombre = Nombre;
        setEdad(edad);
    }

            public String getNombre() {
                return Nombre;
            }

            public void setNombre(String Nombre) {
                this.Nombre = Nombre;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) throws Exception {
                if((edad >= 0) && (edad <= 130))
                this.edad = edad;
                else
                    //System.out.println("Rango de edad incorrecto"); //lanzar un mensaje no siempre es bueno, puede causar cnflicto, descartado
                    //try catch tampoco nos ayuda mucho en este caso porque no se hace nada
                    throw new Exception("Rango de edad incorrecto");
            }
        
        }