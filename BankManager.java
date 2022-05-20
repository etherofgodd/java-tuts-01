import java.math.BigDecimal;

import java.util.Scanner;

/**
 * Bank manage class that allows different banking instances to be created.
 *
 * @Methods createBank();
 */
public class BankManager  {

    /**
     * A static method that returns a banking instance.
     *
     * @return a bank account instance;
     */
    static BankAccount createBank() {
        return new BankAccount();
    }


    /**
     * A static method that returns the user's first name ;
     * gotten from the user input.
     *
     * @return banking firstname
     */
    static String getFirstName() {
        System.out.println("Please Enter your first name: ");
        Scanner firstNameInput = new Scanner(System.in);

        return firstNameInput.nextLine();
    }

    /**
     * A static method that returns the user's first name ;
     * gotten from the user input.
     *
     * @return banking lastname
     */
    static String getLastName() {
        System.out.println("Please Enter your last name: ");
        Scanner lastNameInput = new Scanner(System.in);

        return lastNameInput.nextLine();
    }

    /**
     * A static method that returns the user's phone number;
     * <p>
     * Gotten from the user input.
     *
     * @return banking phone number
     */
    static String getPhoneNumber() {
        System.out.println("Please Enter your Phone Number: ");
        Scanner phoneNumberInput = new Scanner(System.in);

        return phoneNumberInput.nextLine();
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
     * A static method to set the firstname for each individual banking instance.
     *
     * @param bankAccount
     * @param firstName
     */
    static void setFirstName(BankAccount bankAccount, String firstName) {
        bankAccount.setFirstName(firstName);
    }

    /**
     * A static method to set the lastname for each individual banking instance.
     *
     * @param bankAccount
     * @param lastName
     */
    static void setLastName(BankAccount bankAccount, String lastName) {
        bankAccount.setLastName(lastName);
    }

    /**
     * A static method to set the phone number for each individual banking instance.
     *
     * @param bankAccount
     * @param phoneNumber
     */
    static void setPhoneNumber(BankAccount bankAccount, String phoneNumber) {
        bankAccount.setPhoneNumber(phoneNumber);
    }

    /**
     * A static method to get bank details for each individual banking instance.
     *
     * @param bankAccount
     */
    static void getUserDetails(BankAccount bankAccount) {
        System.out.println(bankAccount.getBankDetails());
    }

    /**
     * A static method to create banking default for each individual banking instance.
     *
     * @param bankAccount
     */
    static void createDefault(BankAccount bankAccount) {
        bankAccount.setAccountBalance(new BigDecimal("0"));
        bankAccount.setAccountNumber();
    }

    /**
     * A static methods that takes in the params to enable users make deposit for each individual banking instance.
     *
     * @param bankAccount
     * @param funds
     */
    static void makeDeposit(BankAccount bankAccount, BigDecimal funds) {
        System.out.println(bankAccount.makeDeposit(funds));
    }

    /**
     * A static methods that takes in the params to enable users make withdrawals for each individual banking instance.
     *
     * @param bankAccount Type of BankAccount
     * @param funds       Type of BigDecimal
     */
    static void makeWithdrawal(BankAccount bankAccount, BigDecimal funds) {
        System.out.println(bankAccount.makeWithdrawal(funds));
    }

    /**
     * A static method that returns the balance of a banking instance.
     *
     * @param bankAccount
     */
    static void getBalance(BankAccount bankAccount) {
        System.out.println("Account balance for account number: "
                + bankAccount.getAccountNumber()
                + " is "
                + bankAccount.getAccountBalance());
    }



}
