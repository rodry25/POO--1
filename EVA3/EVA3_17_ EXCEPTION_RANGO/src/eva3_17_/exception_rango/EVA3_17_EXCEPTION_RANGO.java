/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_17_.exception_rango;

/**
 *
 * @author invitado
 */
public class EVA3_17_EXCEPTION_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws exceptionDeRango {
        // TODO code application logic here
        Persona persona = new Persona("Juan Perez", 50);
    }
    
}

class exceptionDeRango extends Exception{

    public exceptionDeRango() {
    }

    public exceptionDeRango(String message) {
        super(message);
    }
    
}

class Persona{
        private String Nombre;
        private int edad;
        
        public Persona(){
        
        }

    public Persona(String Nombre, int edad) throws exceptionDeRango {
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

            public void setEdad(int edad) throws exceptionDeRango {
                if((edad >= 0) && (edad <= 130))
                this.edad = edad;
                else
                    //System.out.println("Rango de edad incorrecto"); //lanzar un mensaje no siempre es bueno, puede causar cnflicto, descartado
                    //try catch tampoco nos ayuda mucho en este caso porque no se hace nada
                    throw new exceptionDeRango("Rango de edad incorrecto");
            }
        
        }
