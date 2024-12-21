package practice;

public interface InterfaceTest {
    void fly();

    String display();

    public default String displayName(){
        return name();
    }
    static String displayId(){
        return id();
    }
    private String name(){
        return  "Hello default interface";
    }
    private static String id(){
        return  "4384732bjefdf";
    }

}
