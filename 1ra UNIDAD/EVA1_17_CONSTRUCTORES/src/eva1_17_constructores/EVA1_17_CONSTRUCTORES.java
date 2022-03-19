/*
 * Azul Siret Cordero Gonzalez
 * 21550381
 */
package eva1_17_constructores;

/**
 *
 * @author liar4
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
        Persona persona2 = new Persona();
        System.out.println("Nombre 2: " + persona2.getNombre());
        System.out.println("Edad 2: " + persona2.getEdad());
        
        Persona persona3 = new Persona("Ruben", 40);
        System.out.println("Nombre 3: " + persona3.getNombre());
        System.out.println("Edad 3: " + persona3.getEdad());
        
        Persona persona4 = new Persona(5.0);
        System.out.println("Nombre 4: " + persona3.getNombre());
        System.out.println("Edad 4: " + persona3.getEdad());
    
    }
    
}

class Persona{
    private String nombre;
    private int edad;
    //Constructor
    //Inicializar valores
    public Persona() {
        System.out.println("Creando el objeto");
        nombre = "Juan Peres";
        edad = 100;
        
    }
    //Sobrecarga de metodos
    public Persona(String nombre, int edad){
        System.out.println("Creando el objeto con contructor que acepta valores");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(double valor){
        System.out.println("Creando objeto que crea doubles");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
