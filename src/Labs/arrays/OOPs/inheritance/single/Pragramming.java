package Labs.arrays.OOPs.inheritance.single;

public class Pragramming {
    int version;
    String AuthorName;

    Pragramming(){
        System.out.println("DEfault Constructor");
    }

    Pragramming(int version, String AuthorName){
        this.version = version;
        this.AuthorName = AuthorName;
        System.out.println("Parameter Constructor");
    }

    void printInfo(){
        System.out.println("Version: " + this.version);
        System.out.println("Author Name: " + this.AuthorName);

    }
}
