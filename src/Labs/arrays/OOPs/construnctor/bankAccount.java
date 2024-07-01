package Labs.arrays.OOPs.construnctor;

public class bankAccount {

    String bankName;
    double balance;
    String Bankcode;


    bankAccount(){
        bankName = "sbi";
        balance = 100;
        Bankcode= "SBIN0010727";
        System.out.println("Default constructor");
    }

    bankAccount(String bName, String Bcode){
        this.bankName = bName;
        this.Bankcode = Bcode;
        System.out.println("param constructor");
    }


    void printDetails(){
        System.out.println("bankname: " + bankName);
        System.out.println("balance: " + balance);
        System.out.println("Bankcode: " + Bankcode);
    }
}
