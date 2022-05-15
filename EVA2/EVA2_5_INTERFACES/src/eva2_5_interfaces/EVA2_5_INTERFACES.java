/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_interfaces;

/**
 *
 * @author liar4
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona perso = new Persona("Fredy", 29);
        perso.setNombre("Fredy");
        perso.setEdad(29);
        perso.imprimirDatos();
        
        
        Vehículo vehiculo = new Vehículo("Ford", "Mustang");
        vehiculo.imprimirDatos();
        vehiculo.mostrarMensaje();
        
       // MuestraDatos datos = new MuestraDatos() {
    }
    
}

class Persona implements MuestraDatos{
    private String nombre;
    private int Edad;
    
    public Persona(){
        
    }

    public Persona(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println();
        
    }
    
}

class Vehículo implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehículo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Vehículo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
    @Override
    public void mostrarMensaje(){
         System.out.println("Hola Mundo");
    }
}

interface MuestraDatos{
    //SOLO ACEPTAN MÉTODOS PUBLICOS
    //ACEPTA DECLARACIÓNES DE MÉTODOS --- SOLO ACEPTA METODOS ABSTRACTOS
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();    
}
