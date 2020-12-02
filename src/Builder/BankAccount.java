package Builder;

public class BankAccount {

    private String accountNumber;
    private String name;
    private double balance;

    private BankAccount() {
    }

    public static class Builder {

        private String accountNumber;
        private String name;
        private double balance;

        public Builder(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankAccount build() {

            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.name = this.name;
            bankAccount.balance = this.balance;
            return bankAccount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
