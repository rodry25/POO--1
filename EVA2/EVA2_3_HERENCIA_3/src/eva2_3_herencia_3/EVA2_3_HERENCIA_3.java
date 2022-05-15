/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia_3;

/**
 *
 * @author liar4
 */
public class EVA2_3_HERENCIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Animal animal = new Animal();
        animal.Mover();

        Vertebrado verte = new Vertebrado();
        verte.Equeleto();
        verte.Mover();
        System.out.println("");
        
        Mamifero mamifero = new Mamifero();
        mamifero.Pelo();
        mamifero.Equeleto();
        mamifero.Mover();
        System.out.println("");

        Primate primate = new Primate();
        primate.AgarrarObjetos();
        primate.Pelo();
        primate.Equeleto();
        primate.Mover();
        System.out.println("");
        
        Humanos human = new Humanos();
        human.Pensar();
        human.AgarrarObjetos();
        human.Pelo();
        human.Equeleto();
        human.Mover();
        System.out.println("");

    }
}

class Humanos extends Primate {

    public Humanos() {
        System.out.println("HUMANOS");
    }

    public void Pensar() {
        System.out.println("Pensar");
    }
}

class Primate extends Mamifero {

    public Primate() {
        System.out.println("PRIMATES");
    }

    public void AgarrarObjetos() {
        System.out.println("Agarra Objetos");
    }
}

class Mamifero extends Vertebrado {

    public Mamifero() {
        System.out.println("MAMIFERO");
    }

    public void Pelo() {
        System.out.println("Pelo");
    }
}

class Vertebrado extends Animal {

    public Vertebrado() {
        System.out.println("VERTEBRADO");
    }

    public void Equeleto() {
        System.out.println("Esqueleto");
    }
}

class Animal {

    public Animal() {
        System.out.println("ANIMAL");
    }

    public void Mover() {
        System.out.println("Movimiento");
    }
}
