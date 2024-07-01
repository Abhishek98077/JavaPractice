package Labs.arrays.OOPs.inheritance.hierarchical;

public class Vehicle {

     Vehicle(){
        System.out.println("Vehicle Constroctor");
    }


    void topSpeed(){
        System.out.println("Top speed"+getClass().getSimpleName());
    }
}
