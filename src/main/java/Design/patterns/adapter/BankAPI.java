package Design.patterns.adapter;

public interface BankAPI {
    public void register(String name,String PanNumber);
    public void transferMoney(String from,String to,int amount);
    public void checkBalance(String accountNumber);

}
