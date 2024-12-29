package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmap {
    public static void main(String[] args) {
        //HashMap
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Apple");
        map1.put(2,"World");
        map1.putIfAbsent(null,"Hi");
        map1.putIfAbsent(3,null);
        System.out.println(map1);  //{null=Hi, 1=Hello, 2=World, 3=null}

        for(HashMap.Entry<Integer,String> entryMap:map1.entrySet()){
            System.out.println(entryMap.getKey() + " " + entryMap.getValue());
        }

        for(Integer entryKey:map1.keySet()){
            System.out.println(entryKey);
        }

        for(String entryVal:map1.values()){
            System.out.println(entryVal);
        }

        //LinkedHashMap - retain the insertion order

        LinkedHashMap<Integer,String> LinkedMap = new LinkedHashMap<>();
        LinkedMap.put(1,"Apple");
        LinkedMap.put(2,"World");
        LinkedMap.put(-1,"sdfdfs");
        LinkedMap.get(2);
        System.out.println("LinkedMap : " + LinkedMap);  //{1=Apple, 2=World, -1=sdfdfs}

        LinkedHashMap<Integer,String> LinkedMapAccess = new LinkedHashMap<>(16,.75f,true);
        LinkedMapAccess.put(1,"Apple");
        LinkedMapAccess.put(2,"World");
        LinkedMapAccess.put(-1,"sdfdfs");
        LinkedMapAccess.get(2);
        System.out.println("LinkedMapAccess : " + LinkedMapAccess);  //{1=Apple, -1=sdfdfs, 2=World}  freq used value will be in end


        //TreeMap - sorted order
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Apple");
        treeMap.put(2,"World");
        treeMap.put(-1,"sdfdfs");
        System.out.println("treeMap : " + treeMap); //{-1=sdfdfs, 1=Apple, 2=World}

        TreeMap<Integer,String> treeMap1 = new TreeMap<>((Integer i1, Integer i2) -> i2 - i1);
        treeMap1.put(1,"Apple");
        treeMap1.put(2,"World");
        treeMap1.put(-1,"sdfdfs");
        System.out.println("treeMapDesc : " + treeMap1);
    }

}
