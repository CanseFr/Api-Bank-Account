public abstract class Account implements IBaseRate {

    // lister les propriete poursave et check le compte
    private String name;
    private String sSN;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index = 10000;

    // Constructor pour set les proprete et et initialiser le compte
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest  = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest : " +accruedInterest + " €");
        printBlance();
        System.out.println("***");
    }


    // Methode transaction

    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing : " + amount +" €");
        printBlance();
        System.out.println("***");
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing : " + amount + " €");
        printBlance();
        System.out.println("***");
    }
    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transfering : " + amount+ " € to ->" + toWhere);
        printBlance();
        System.out.println("***");
    }

    public void printBlance(){
        System.out.println("Your balance is nouw : " + balance + " €");
    }



    public void showInfo(){
        System.out.println("NAME : " + name+
                        "\nACCOUNT NUMBER : " + accountNumber+
                        "\nBALANCE : "+balance +
                        "\n RATE : " + rate + " %");
    }


}
