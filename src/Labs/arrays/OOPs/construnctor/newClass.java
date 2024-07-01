package Labs.arrays.OOPs.construnctor;

public class newClass {
    public static void main(String[] args) {
        bankAccount sbi = new bankAccount();
        sbi.printDetails();

        bankAccount hdfc = new bankAccount("hdfc","1000hdfc");
        hdfc.Bankcode = "dekhlo";
        hdfc.printDetails();

        bankAccount icici = new bankAccount("icici" ,"288icici");
        icici.printDetails();


    }
}
