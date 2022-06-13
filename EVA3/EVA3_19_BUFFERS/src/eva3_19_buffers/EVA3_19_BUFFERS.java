/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author liar4
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definir la ruta       //paths te ayuda a definir rutas en diferentes formatos,permite relaizar muchas funciones
        Path ruta = Paths.get("c:/archivo/texton.txt");
        //abrimos el archivo
        InputStream abrirArch;
        //leemos el archivo
        InputStreamReader leerArch;
        //convertimos bytes a caracteres
        BufferedReader leerTexto = null;
        
        try{
        abrirArch = Files.newInputStream(ruta);
        leerArch  = new InputStreamReader(abrirArch);
        String linea = leerTexto.readLine();
        while(linea !=null){
            System.out.println(linea);
            linea = leerTexto.readLine();
        }
        leerTexto.close();//siempre es muy importante cerrar el stream
        }catch(IOException ex){
    
}
  }
  }