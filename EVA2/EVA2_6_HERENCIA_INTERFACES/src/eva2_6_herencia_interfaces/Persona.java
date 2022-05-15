/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_herencia_interfaces;

/**
 *
 * @author liar4
 */
public class Persona{
    private String nombre;
    private int Edad;
    
    public Persona(){
        this.nombre = "";
        this.Edad = 0;
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
    
    
}
    

