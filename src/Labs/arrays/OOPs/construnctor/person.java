package Labs.arrays.OOPs.construnctor;

public class person {
    String name;
    person(){
        System.out.println("Default Constructor");

    }

    person( String name){
        this.name = name;
        System.out.println("Parameter Constructor");

    }

    void printDetails(){
        System.out.println("Name : " + this.name);
    }
}
