/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saeol
 */
public class EVA3_21_SERIALIZABLE {

    private static final long serialVersionUID = 1L;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //existen archivos binarios y de texto
        //especidfocar que clases van a ser serializables
        //debemos hacer que la clase implemente la interfaz serealizable
        persona per = new persona("Andres", "Saenz");
        escribirObj(per);
    }
    //GUARDAR OBJETOS
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/Archivo/archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eva3_21_serailizable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Eva3_21_serailizable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
        //LEER OBJETOS
    public static void LeerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/Archivo/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            leerObjeto.readObject();//siempre regresa un objeto de la clase object
            
            persona per1 = (persona)leerObjeto.readObject();
            
            System.out.println("Nombre" + persona.getNombre() + "" + persona.getApellido());
            leerObjeto.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eva3_21_serailizable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Eva3_21_serailizable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Eva3_21_serailizable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

class persona implements Serializable{
    private String nombre;
    private String apellido;

    public persona() {
    }

    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    }
}