package practice;

// Define the interface
interface shape {
    public void square();
}

class OuterClass extends Generic<Integer> {
    class InnerClass {
        public void Innersquare() {
            System.out.println("Inside InnerClass");
        }
    }
}

// Define the Rectangle class
public class Rectangle extends OuterClass.InnerClass implements shape {
    // Inner class
    Rectangle(){
        new OuterClass().super();
    }
    static class Spade{
        public void draw() {
            System.out.println("spade");
        }

    }

    public class Diamond extends Spade{

       Diamond(){
           draw();
       }
        public void hear() {
            Innersquare();
        }
    }


    // Implement the 'square()' method from the interface
    @Override
    public void square() {
        System.out.println("Square");
    }
}