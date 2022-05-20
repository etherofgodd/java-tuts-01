import utils.Helpers;

import java.math.BigDecimal;

public class BankAccount implements  IBankFunction{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private BigDecimal accountBalance;
    private String accountNumber;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    private String getName() {
        return getFirstName() + " " + getLastName();
    }

    public String getBankDetails() {
        return ("Account has been created for " + getName() +
                " \nAnd here is your account number: " + getAccountNumber() +
                " \nAnd here is your account balance: " + getAccountBalance() +
                " \nAnd here is your phone number: " + getPhoneNumber()
        );
    }

    @Override
    public String makeDeposit(BigDecimal funds) {
        BigDecimal temp = this.getAccountBalance();
        this.accountBalance = temp.add(funds);
        return "Account Credited";
    }

    @Override
    public String makeWithdrawal(BigDecimal funds) {
        BigDecimal temp = this.getAccountBalance();
        Boolean valid = Helpers.compareBigDecimal(temp, funds);
        if (valid) {
            this.accountBalance = temp.subtract(funds);
            return "Withdrawal Successful";
        } else {
            return "Invalid Transaction, balance too low!";
        }
    }

}
