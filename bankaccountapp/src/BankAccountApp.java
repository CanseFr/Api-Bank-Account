import java.util.LinkedList;
import java.util.List;


public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        String file = "C:\\C:\\Users\\julie\\OneDrive\\Documents\\Java\\3 API OOP\\Bank Account App\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings"))
            {
                accounts.add(new Savings(name,sSN, initDeposit));
            } else if ( accountType.equals("Checking"))
            {
                accounts.add(new Checkings(name,sSN, initDeposit));
            } else
            {
                System.out.println("Error Reading Account Type");
            }

        }

//        accounts.get(5).showInfo(); // voir un

        for (Account acc : accounts){
            System.out.println("******");
            acc.showInfo();
        }






        //        Checkings chkAcc1 = new Checkings("Julien Cansell","654987325",1500);
//        Savings savacc1 = new Savings("Rick Lowe","987654321",2500);
//
//        savacc1.showInfo();
//        System.out.println("********");
//        chkAcc1.showInfo();
//        System.out.println("********");
//        savacc1.compound();

        // read csv file et creer compte

    }
}