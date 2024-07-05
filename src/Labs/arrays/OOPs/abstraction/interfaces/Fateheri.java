package Labs.arrays.OOPs.abstraction.interfaces;

interface Fateheri {
    void load5k();

    default void print(){
        System.out.println("iam default");
    }
}
