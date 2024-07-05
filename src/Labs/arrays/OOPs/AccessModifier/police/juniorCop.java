package Labs.arrays.OOPs.AccessModifier.police;

public class juniorCop {
    public static void main(String[] args) {
        Cop cop = new Cop(2);

        System.out.println(cop.gun);
        cop.canIShoot();

    }
}
