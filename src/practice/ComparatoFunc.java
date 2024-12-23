package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Comparato {
    int age;
    String name;

    Comparato(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comparato{" + "age=" + age + ", name=" + name + '}';
    }
}
public class ComparatoFunc {
    public static void main(String[] args) {
        ArrayList<Comparato> comparatos = new ArrayList<Comparato>();
        comparatos.add(new Comparato(18, "john"));
        comparatos.add(new Comparato(19, "alex"));
        comparatos.add(new Comparato(20, "zack"));

        Comparator<Comparato> nameComparator = (e1, e2) -> e1.name.compareTo(e2.name);
        comparatos.sort(nameComparator);
        System.out.println(comparatos);
    }
}
