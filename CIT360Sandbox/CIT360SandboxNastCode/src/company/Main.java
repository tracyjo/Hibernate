package company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

        Character man1 = new Character("John", "Smith", 23);


// set creature list using hashmap
        HashMap<String, Integer> animals = new HashMap<String,Integer>();
        animals.put("Dog",      1);
        animals.put("Cat",      2);
        animals.put("Tiger",    3);
        animals.put("Elephant", 4);
        animals.put("Lizard",   5);



// set inventory using arraylist
        ArrayList inventory = new ArrayList();

        inventory.add("Sword");
        inventory.add("Armor");
        inventory.add("Shield");
        inventory.add("Potions");
        inventory.add("Magic Item");



// set arena using hashset
        Set<String> arenas = new HashSet<>();

        arenas.add("Rome");
        arenas.add("Sparta");
        arenas.add("Athens");


// set armor list using treemap
        TreeMap<String, Integer> armor = new TreeMap<>();

        armor.put("Cloth", 1);
        armor.put("Leather", 2);
        armor.put("Chain Mail", 3);
        armor.put("Plate", 4);

        System.out.println(man1.toStringSimple());
        System.out.println(man1.toString());
        System.out.println("Animals " +     animals);
        System.out.println("Inventory " +   inventory);
        System.out.println("Arenas " +      arenas);
        System.out.println("Armor " +       armor);
    }
}
