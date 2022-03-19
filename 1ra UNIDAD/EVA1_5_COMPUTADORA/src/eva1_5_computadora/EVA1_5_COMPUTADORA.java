/*
 * Azul Siret Cordero Gonzalez
 * 21550381
 */
package eva1_5_computadora;

/**
 *
 * @author liar4
 */
public class EVA1_5_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        computadora comp1 = new computadora();
    comp1.setAño(2011);
    comp1.setMarca("ASUS");
    comp1.setPrecio(7000.00);
    comp1.setProce("PENTIUM"); 
    comp1.setVerWin(10);
    
    System.out.println("Año: " + comp1.getAño());
    System.out.println("Marca: " + comp1.getMarca()); 
    System.out.println("Procesador: " + comp1.getProce());
    System.out.println("Versión de windows: " + comp1.getVerWin());
    System.out.println("Precio NETO: $" + comp1.getPrecio());
    System.out.println("Precio total: &" + (comp1.getPrecio() + comp1.getPrecio() * 0.16));
    }
    
    
    
}

class computadora {
private String marca;
private String proce;
private int año;
private int vWindows;
private double precio;


//MARCA DE LA COMPUTADORA 

public void setMarca (String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }

//Tarjeta gráfica DE L COMPUTADORA 
    
public void setProce (String valor){
        proce = valor;
    }
    public String getProce(){
        return proce;
    }

//Año
public void setAño (int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }

//Version de Windows
public void setVerWin (int valor){
        vWindows = valor;
    }
    public int getVerWin(){
        return vWindows;
    }
    
//Precio
public void setPrecio (double valor){
        precio = valor;
    }
    public double getPrecio(){
        return precio;
    }
}
    
