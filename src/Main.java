import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Main {
  
  public static void main (String[] args) {
    Dog d = new Dog();
    Cat c = new Cat();

    // Use instances of to ensure both of our new class is an instances of Pet
    // If true, then we need to check to play() method of our newly created instance
    
    if (c instanceof Pet) {
      c.play();
    }

    if (d instanceof Pet) {
      d.play();
    }

    Pet p;
    Random rand = new Random();
    int n = rand.nextInt(2);

    if (n == 0) {
      p = new Dog();
    } else {
      p = new Cat();
    }

    p.play();

  }

}