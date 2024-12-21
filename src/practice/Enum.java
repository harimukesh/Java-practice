package practice;

interface week{
    public void print();
}

public enum Enum implements week{
    MONDAY(101,"Hello"),
    TUESDAY(102,"Hello"),
    WEDNESDAY(103,"Hello"),
    THRUSDAY(104,"Hello"),
    FRIDAY(105,"Hello"),
    SATURDAY(106,"Hello"),
    SUNDAY(107,"Hello");

    int value;
    String name;
    Enum(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getVal(){
        return value;
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println(name);
    }

    public  static Enum getEnumCmdsByVal(int val){
            for(Enum e : Enum.values()){
                if(e.value == val){
                    return e;
                }
            }
            return null;
    }


}
