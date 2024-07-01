package Labs.arrays.OOPs.construnctor;

import java.sql.SQLOutput;

public class Dog {
    String name;

    Dog(){
        System.out.println("DC");
    }

    Dog(String name){
        this.name = name;
        System.out.println("PC");
    }

    void bark(){
        int age = 10;
        System.out.println("Bark");
        System.out.println("name" +name);
    }
}
