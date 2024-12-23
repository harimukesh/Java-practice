package practice;

import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main implements  InterfaceTest{
    public String display(){
        return "Hello World";
    }

    public void fly(){
        System.out.println("I'm flying");
    }

    @MyInterface(name="hello",size=2)
    public void displayCustomAnnotaion(){
        System.out.println("I'm custom annotation");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {

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

        //POJO
        /*POJO pojo = new POJO();
        System.out.println(pojo.getter());
        pojo.setter(24);
        System.out.println(pojo.getter());*/

        //Enum
        /*Enum weedDays = Enum.getEnumCmdsByVal(103);
        weedDays.print();
        System.out.print(weedDays.getName());*/

        //interface
        /*System.out.println(InterfaceTest.displayId());
        InterfaceTest main1=new Main();
        main1.fly();
        System.out.println(main1.display());
        System.out.println(main1.displayName());*/


        //singleton
        /*singleton singleObj = singleton.getinstance();
        System.out.println(singleObj.str);*/


        //reflection
        /*Class<Reflection> reflectionClass = Reflection.class;
        Object ReflectObj = reflectionClass.newInstance();
        Method[] methodsList = reflectionClass.getDeclaredMethods();
        for(Method method : methodsList){
            System.out.println(method.getName());
            method.setAccessible(true);   //changing modifiers from private to public (badass guy)
            System.out.println(method.getModifiers());
            if(method.getName().equals("print2")) method.invoke(ReflectObj,"harimukesh"); //private method in reflection class called here, because of reflection
        }*/

        //customInterface
        /*Main obj1 = new Main();
        obj1.displayCustomAnnotaion();*/


        //Exception
        /*try{
            Exception.ExceptionMethod();
        }catch(RuntimeException e){
            System.out.println(e);
        }finally{
            System.out.println("finally");
        }*/

        //Collections

        //forEach

        /*ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.replaceAll((val -> val*2));
        list.forEach(val -> System.out.println(val));
        list.forEach(System.out::println);*/

        //comparable vs comparator
        /*Use Comparable if:

        The class has a natural order (e.g., sorting integers in ascending order).
        Only one sorting logic is required.
        Use Comparator if:

        The class requires multiple sorting criteria (e.g., sorting by ID, name, or age).
        The class cannot be modified to implement Comparable.*/

        Integer arr[]={1,2,3,4,5,6,7,8,9,10};

        Arrays.sort(arr);  //compareTo - comparable
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(Integer a,Integer b) -> b-a);    // compare - comparator
        // Arrays.sort(arr,(int a,int b) -> b-a); it not possible compare only do for wrapper
        System.out.println(Arrays.toString(arr));
        
    }
}