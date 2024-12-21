package practice;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;

public class Main implements  InterfaceTest{
    public String display(){
        return "Hello World";
    }

    public void fly(){
        System.out.println("I'm flying");
    }

    public static void main(String[] args) {

        /*Rectangle rect1 = new Rectangle();
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

        gen.print(list);*/


        //Enum
        /*Enum weedDays = Enum.getEnumCmdsByVal(103);
        weedDays.print();
        System.out.print(weedDays.getName());*/

        //interface
        System.out.println(InterfaceTest.displayId());
        InterfaceTest main1=new Main();
        main1.fly();
        System.out.println(main1.display());
        System.out.println(main1.displayName());



    }
}