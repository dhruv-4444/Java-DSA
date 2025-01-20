package Hashing;

import java.util.*;


public class HashMapImplement {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Usa", 123);

        System.out.println(hm);


        int population = hm.get("India");
        System.out.println(population);
    }
}
