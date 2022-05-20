import java.math.BigDecimal;
import java.util.Scanner;

public class AccessBankManager {

    static AccessBank createAccessbankAccount() {
        return new AccessBank();
    }

    /**
     * A static method to create banking default
     * for each individual banking instance in access bank.
     *
     * @param accessBankAccount
     */
    static String createDefault(AccessBank accessBankAccount) {
        if (accessBankAccount.getHasBvn() == false) {
            return "Can't create bank default without a bvn";
        } else {
            accessBankAccount.setAccountBalance(new BigDecimal("0"));
            accessBankAccount.setAccountNumber();
            return "Defaults created";
        }
    }

    /**
     * A static method that returns the user's first name ;
     * gotten from the user input.
     *
     * @return banking bvn
     */
    static String getUserBvn() {
        System.out.println("Please Enter your Bvn: ");
        Scanner bvnInput = new Scanner(System.in);

        return bvnInput.nextLine();
    }


    /**
     * A static method that returns the user's first name ;
     * gotten from the user input.
     *
     * @return banking father's name
     */
    static String getUsersfatherName() {
        System.out.println("Please Enter your Father's name: ");
        Scanner fatherNameInput = new Scanner(System.in);

        return fatherNameInput.nextLine();
    }

    static void setFatherName(AccessBank accessBank, String fatherName) {
        accessBank.setFatherName(fatherName);
    }

    static void setBvn(AccessBank accessBank, String bvn) {
        if (bvn.length() > 0) {
            accessBank.setBvn(bvn);
            accessBank.setHasBvn();
        }
    }

    /**
     * A static method that returns the user's deposit amount ;
     * Gotten from the user input.
     *
     * @return banking deposit amount
     */
    static BigDecimal getDepositAmount() {
        System.out.println("Enter Money to Deposit: ");
        Scanner fundsInput = new Scanner(System.in);

        return fundsInput.nextBigDecimal();
    }

    /**
     * A static method that returns the user's withdrawal amount ;
     * Gotten from the user input.
     *
     * @return banking withdrawal amount
     */
    static BigDecimal getWithdrawalAmount() {
        System.out.println("Enter Money to Withdraw: ");
        Scanner fundsInput = new Scanner(System.in);
        return fundsInput.nextBigDecimal();
    }

    /**
     * A static method that returns the balance of a banking instance.
     *
     * @param accessBankAccount
     */
    static void getBalance(AccessBank accessBankAccount) {
        System.out.println("Account balance for account number: "
                + accessBankAccount.getAccountNumber()
                + " is "
                + accessBankAccount.getAccountBalance());
    }



}
