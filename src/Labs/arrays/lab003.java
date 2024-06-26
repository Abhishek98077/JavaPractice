package Labs.arrays;

public class lab003 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,4,5};
        System.out.println(arr1 == arr2);

        int[] arr3 = arr1;
        System.out.println(arr1 == arr3);
        System.out.println(arr1.equals(arr2));

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }



    }
}
