import utils.Helpers;

import java.math.BigDecimal;

public class Bank {
    private static String firstName;
    private static String lastName;
    private static String phoneNumber;

    private static BigDecimal accountBalance;
    private static String accountNumber;


    Bank(String inputtedFirstName, String inputtedLastName, String inputtedPhoneNumber) {
        this.firstName = inputtedFirstName;

        this.lastName = inputtedLastName;

        boolean isPhoneNumberValid = Helpers.validatePhoneNumber(inputtedPhoneNumber);
        if (!isPhoneNumberValid) return;

        this.phoneNumber = inputtedPhoneNumber;
        this.accountBalance = BigDecimal.valueOf(0);

        accountNumber = Helpers.generateAccountNumber();
    }

    Bank() {
    }

    public static String getName() {
        return firstName + " " + lastName;
    }


    public static String getAccountNumber() {
        return accountNumber;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        boolean res = Helpers.verifyInput(firstName);
        if (res)
            this.firstName = firstName;
        else {
            System.out.println("Input cant be empty");
            return;
        }
    }

    public void setLastName(String lastName) {
        boolean res = Helpers.verifyInput(lastName);
        if (res)
            this.lastName = lastName;
        else {
            System.out.println("Input cant be empty");
            return;
        }

    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = Helpers.generateAccountNumber();
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }


    public static BigDecimal getAccountBalance() {
        return accountBalance;
    }


    public static String getBankDetails() {
        return ("Account has been created for " + getName() +
                " \nAnd here is your account number: " + getAccountNumber() +
                " \nAnd here is your account balance: " + getAccountBalance() +
                " \nAnd here is your phone number: " + getPhoneNumber()
        );
    }


    String makeDeposit(BigDecimal funds) {
        BigDecimal temp = this.getAccountBalance();
        this.accountBalance = temp.add(funds);
        return "Account Credited";
    }

    String makeWithdrawal(BigDecimal funds) {
        BigDecimal temp = this.getAccountBalance();
        boolean valid = Helpers.compareBigInt(temp, funds);
        if (valid) {
            this.accountBalance = temp.subtract(funds);
            return "Withdrawal Successful";
        } else {
            return "Invalid Transaction, balance too low!";
        }
    }

}
