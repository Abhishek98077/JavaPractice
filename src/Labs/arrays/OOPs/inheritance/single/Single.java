package Labs.arrays.OOPs.inheritance.single;

public class Single {
    public static void main(String[] args) {
        // inheritance
        //provides a way to cerate a class from existing class
        Pragramming p = new Pragramming(); // this is paremt /super/base class
//                  Pragramming --> class
//                p -> reference to object
//                new Pragramming() --> object

        Pragramming p1 = new Pragramming(1 ,"Perl");
        p1.printInfo();


    }
}
