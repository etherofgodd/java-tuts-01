import utils.Helpers;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

//        Main.defaultStart();

        Main.accessBankStart();

    }

    public static void defaultStart() {
        BankAccount bankAccount = BankManager.createBank();

        String firstName = BankManager.getFirstName();
        Boolean isFirstNameOk = Helpers.verifyInput(firstName);
        while (!isFirstNameOk) {
            System.out.println("Please enter a valid credential");
            firstName = BankManager.getFirstName();
            if (firstName.length() > 0) break;
        }

        String lastName = BankManager.getLastName();
        Boolean isLastNameOk = Helpers.verifyInput(lastName);
        while (!isLastNameOk) {
            System.out.println("Please enter a valid credential");
            lastName = BankManager.getLastName();
            if (lastName.length() > 0) break;
        }

        String phoneNumber = BankManager.getPhoneNumber();
        Boolean isPhoneNumberOk = Helpers.validatePhoneNumber(phoneNumber);
        while (!isPhoneNumberOk) {
            System.out.println("Please enter a valid credential");
            phoneNumber = BankManager.getPhoneNumber();
            if (phoneNumber.length() == 11) break;
        }


        BankManager.setFirstName(bankAccount, firstName);
        BankManager.setLastName(bankAccount, lastName);
        BankManager.setPhoneNumber(bankAccount, phoneNumber);

        BankManager.createDefault(bankAccount);

        BankManager.getUserDetails(bankAccount);

        BigDecimal fundD = BankManager.getDepositAmount();
        BankManager.makeDeposit(bankAccount, fundD);

        BigDecimal fundW = BankManager.getWithdrawalAmount();
        BankManager.makeWithdrawal(bankAccount, fundW);

        BankManager.getBalance(bankAccount);
    }

    public static void accessBankStart() {
        AccessBank accessbankAccount = AccessBankManager.createAccessbankAccount();

        String fathername = AccessBankManager.getUsersfatherName();
        AccessBankManager.setFatherName(accessbankAccount, fathername);


        System.out.println(AccessBankManager.createDefault(accessbankAccount));


        AccessBankManager.getBalance(accessbankAccount);
    }
}
