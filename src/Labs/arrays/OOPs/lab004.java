package Labs.arrays.OOPs;

public class lab004 {
    public static void main(String[] args) {
        String name ="ABhishek";
        System.out.println(name.contains("B"));
        System.out.println(name.toUpperCase());


        String Actuel = "Password";
        String exoected = "password";
        if (Actuel.equalsIgnoreCase(exoected)){
            System.out.println("Yes");
        }

        StringBuilder builder = new StringBuilder("ab");
        builder.append("cd");
        System.out.println(builder);
    }
}
