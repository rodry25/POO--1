/*
 * Azul Siret Cordero Gonzalez
 * 21550381
 */
package eva1_18_sobrecarga;

/**
 *
 * @author liar4
 */
public class EVA1_18_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        Prueba obj = new Prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Area Rectangulo de 15 X 20 " + calcularArea(15, 20));
        System.out.println("Area Rectangulo de 15 X 20 " + calcularArea(15.0, 20.0, 1));
        System.out.println("Area Circulo de radio 100 " + calcularArea(100.0));
        System.out.println("Area Circulo de radio 100 " + calcularArea(100));

    }
    
    public static double calcularArea(double largo, double ancho){
        return largo * ancho;
    }
    public static double calcularArea(double base, double altura, int esTriangulo){
        return (base * altura)/2;
    }
    public static double calcularArea(int esTriangulo,double base, double altura ){
        return (base * altura)/2;
    }
    public static double calcularArea(double radio){
        System.out.println("Double");
        return Math.PI * Math.pow(radio, 2);
    }
     public static double calcularArea(int radio){
        System.out.println("Entero");
        return Math.PI * Math.pow(radio, 2);
    }
    
}
class Prueba{

}