package Builder;

public class Client {

    private BankAccount bankAccount;

    public Client(){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount= new BankAccount.Builder("12312332")
                        .setName("randima")
                        .setBalance(120.00)
                        .build();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount = new BankAccount.Builder("654234090")
                        .setName("Dilupa")
                        .setBalance(1420000.00)
                        .build();
            }
        });

        thread1.run();
        thread2.run();

    }

    public BankAccount getBankAccountInstance(){
        return this.bankAccount;
    }

}
