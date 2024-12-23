package practice;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee a){
        return this.age - a.age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + this.name + ", age=" + this.age + "]";
    }
}
public class ComparableFunc {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(new Employee("John Doe", 20));
        employeeArrayList.add(new Employee("Alex", 24));

        Collections.sort(employeeArrayList);
        System.out.print(employeeArrayList);
    }
}
