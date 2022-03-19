/*
 * Azul Siret Cordero Gonzalez
 * 21550381
 */
package eva1_9_memoria_heap;

/**
 *
 * @author liar4
 */
public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        Object obj= new Object();
          System.out.println(obj);
          System.out.println(obj.valor);
         Object obj2= new Object();
           System.out.println(obj2);
           System.out.println(obj2.valor);
        obj2=null;
    }
    
}

class Object {
 int valor=100;

    }
