/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_20_escribir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author saeol
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path ruta = Paths.get("c:/Archivo/texto1.txt") 
                OutputStream abrirArchivo;
                OUtputStreamWriter escribirArh;
                BufferedWriter excribirtexto;
                try{
                abrirArchivo = Files.newOutputStream(ruta);
                escribirArchivo = new OutputStreamWriter(abrirArchivo);
                
                excribirtexto = new BufferedWriter(escribirArh);
                excribirtexto.write("Hola mundooo");
                excribirtexto.flush();
                excribirtexto.fush();
                excribirtexto.close();
                
                
                        
                
    }  
                catch(IOException ex){
                    ex.printStacktTrace;
                }
    }
                
    
}