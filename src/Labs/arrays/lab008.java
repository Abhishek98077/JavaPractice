package Labs.arrays;

public class lab008 {
    public static void main(String[] args){

        //2d arrays

        int arr[][]= new int[3][3];
        arr[0][0]=14;
        arr[0][1]=24;
        arr[0][2]=34;


        arr[1][0]=48;
        arr[1][1]=59;
        arr[1][2]=61;


        arr[2][0]=78;
        arr[2][1]=89;
        arr[2][2]=92;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

                //[1,2,3]
                //[3,4,5]
                //[6,7,8]

    }
}
