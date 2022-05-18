import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BankManager {
    private static Bank bank = new Bank();

    public BankManager(Bank bank) {
        bank.setAccountBalance(BigDecimal.valueOf(0));
        bank.setPhoneNumber("09098776335");
    }


    static String getFirstName() {
        System.out.println("Please Enter your first name: ");
        Scanner firstNameInput = new Scanner(System.in);
        String firstName = firstNameInput.nextLine();

        return firstName;
    }

    static String getLastName() {
        System.out.println("Please Enter your last name: ");
        Scanner lastNameInput = new Scanner(System.in);
        String lastName = lastNameInput.nextLine();

        return lastName;
    }

    static String getPhoneNumber() {
        System.out.println("Please Enter your Phone Number: ");
        Scanner phoneNumberInput = new Scanner(System.in);
        String phoneNumber = phoneNumberInput.nextLine();

        return phoneNumber;
    }

    static BigDecimal getDepositAmount() {
        System.out.println("Enter Money to Deposit: ");
        Scanner fundsInput = new Scanner(System.in);
        BigDecimal funds = fundsInput.nextBigDecimal();

        return funds;
    }

    static BigDecimal getWithdrawalAmount() {
        System.out.println("Enter Money to Withdraw: ");
        Scanner fundsInput = new Scanner(System.in);
        BigDecimal funds = fundsInput.nextBigDecimal();

        return funds;
    }

    static void setFirstName(String firstName) {
        bank.setFirstName(firstName);
    }

    static void setLastName(String lastName) {
        bank.setLastName(lastName);
    }

    static void setPhoneNumber(String phoneNumber) {
        bank.setPhoneNumber(phoneNumber);
    }

    static void getUserDetails() {
        System.out.println(bank.getBankDetails());
    }

    static void createDefault() {
        bank.setAccountBalance(new BigDecimal("0"));
        bank.setAccountNumber();
    }

    static void makeDeposit(BigDecimal funds) {
        System.out.println(bank.makeDeposit(funds));
    }

    static void makeWithdrawal(BigDecimal funds) {
        System.out.println(bank.makeWithdrawal(funds));
    }

    static void getBalance() {
        System.out.println(bank.getAccountBalance());
    }

}
