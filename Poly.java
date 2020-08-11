/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PARUL KALRA
 */
//Method Overloading
class Multiply {
    void mul(int a, int b) {
        System.out.println("Sum of two=" + (a * b));
    }

    void mul(int a, int b, int c) {
        System.out.println("Sum of three=" + (a * b * c));
    }
}
public class Poly {
    public static void main(String args[]) {
        Multiply m = new Multiply();
        m.mul(6, 10);
        m.mul(10, 6, 5);
    }
}
// Method overriding
class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   public void Info() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.Info();
   }
}
                  
      
    
