public class Savings extends Account {

    // Lister les proprietes due a la sauvegarde
    private int safetyDepositBoxID;
    private int safetyDepositBoxKEY;

    // Constructor initialisation save
    public Savings(String name, String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "1"+accountNumber;

        setSafetyDepositBox();

    }

    @Override
    public void setRate(){
        rate = getBaseRate()-.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random()*Math.pow(10,3));
//        System.out.println(safetyDepositBoxID);
        safetyDepositBoxKEY = (int) (Math.random()*Math.pow(10,4));
    }

    // Lister methode spe
    public void showInfo(){
        System.out.println("ACCOUNT TYPE : Savings");
        super.showInfo(); // Ici je peu rappeler la methode de ma super class pour appliquer les deux comportement, l'initial et l'overrite
        System.out.println("Your saving account features" +
                "\n Safety Deposit Box ID : " + safetyDepositBoxID+
                "\n Safety Deposit Box Key : " + safetyDepositBoxKEY);
    }



}
