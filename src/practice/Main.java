package practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle.Spade shade = new Rectangle.Spade();
        shade.draw();
        Rectangle.Diamond diamond = rect1.new Diamond();
        diamond.draw();
        diamond.hear();// Output: diamond
        rect1.square();  // Output: Square

        Generic<Integer> gen =new Generic<Integer>();
        gen.setter(3);
        gen.getter();

        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        gen.print(list);

    }
}