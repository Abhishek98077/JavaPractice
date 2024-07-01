package Labs.arrays.OOPs.inheritance.single;

public class java extends Pragramming {
    String newFeature;

    java() {
        System.out.println("Default constructor");
    }
    java(String newFeature) {
        this.newFeature = newFeature;
    }
    void print() {
        System.out.println("new Feature"+newFeature);
    }
}
