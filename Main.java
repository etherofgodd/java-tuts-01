import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Main.start();


//        System.out.println("\n Line break, new user :) ");
//        DataBank dataBank = new DataBank("Ade","09026524442");
//        System.out.println(dataBank.getBankDetails());
//        System.out.println(dataBank.getData());
//
//        dataBank.consumeSuperClassMethod();
    }

    public static void start() {
        String firstName = BankManager.getFirstName();
        String lastName = BankManager.getLastName();
        String phoneNumber = BankManager.getPhoneNumber();
        BankManager.setFirstName(firstName);
        BankManager.setLastName(lastName);
        BankManager.setPhoneNumber(phoneNumber);
        BankManager.createDefault();

        BankManager.getUserDetails();

        BigDecimal fundD = BankManager.getDepositAmount();
        BankManager.makeDeposit(fundD);

        BigDecimal fundW = BankManager.getWithdrawalAmount();
        BankManager.makeWithdrawal(fundW);

        BankManager.getBalance();


    }
}
