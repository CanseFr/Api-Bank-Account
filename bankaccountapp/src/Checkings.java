public class Checkings extends Account {

    // Lister les proprietes specific pour check le compte
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor initialisation checking account
    public Checkings(String name, String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate()*.15;
    }

    // Liste des methode
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));

    }

    public void showInfo(){
        super.showInfo(); // Ici je peu rappeler la methode de ma super class pour appliquer les deux comportement, l'initial et l'overrite
        System.out.println("Your Checking Account Features" +
                            "\n Debit Card Number : " + debitCardNumber +
                            "\n Debit Card PIN : " + debitCardPIN);
    }



}
