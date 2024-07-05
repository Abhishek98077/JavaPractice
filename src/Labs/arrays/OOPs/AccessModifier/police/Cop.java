package Labs.arrays.OOPs.AccessModifier.police;

public class Cop {
    public int gun;


    public Cop(int gun) {
        this.gun =gun;
    }

    protected void canIShoot(){
        System.out.println("yes You can Shoot");
    }
}
