package Labs.arrays.OOPs.Polumorphism.methodOverriding;

public class rc {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        System.out.println(d);

        hound h = new hound();
        h.bark();
        System.out.println(h);

        dog d2 = new hound();
        d2.bark();



    }
}
