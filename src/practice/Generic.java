package practice;

import java.util.List;

public class Generic<T> {
    T value;
    public T getter(){
        System.out.println(value);
        return value;
    }
    public void setter(T value){
        this.value = value;
    }

    public void print(List<? extends Number> val){
        System.out.print(val);
    }
}
