package Labs.arrays.OOPs;

public class blockClass {

    blockClass(){
        System.out.println("Defsult Constroctor");
    }
    {
        //IIB Instance initialization block
        System.out.println("iam an ITB");
    }

    static { //SIB static initialization block
        System.out.println("Iam static block");
    }
}
