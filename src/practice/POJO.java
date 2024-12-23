package practice;

/*
* 1. contains variable and its getter and setter
* 2. class should be public
* 3. public default constructor
* 4.No annotations should be used like @Table , @Entity, @Id
* 5. It should not extend any class or implement
* */

public class POJO {
    public int id;
    private String name;
    protected int age;
    public int getter(){
        return age;
    }
    public void setter(int age){
        this.age = age;
    }
}
