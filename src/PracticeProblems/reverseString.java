package PracticeProblems;

public class reverseString {
    public static void main(String[] args) {
        String name = "Abhishek";
        char[] chars = name.toCharArray();
        System.out.println(chars.length);
        int left =0;
        int right = chars.length-1;
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left ++;
            right --;
        }
        String rev = new String(chars);
        System.out.println(rev);

    }
}
