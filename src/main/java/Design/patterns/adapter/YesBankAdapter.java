package Design.patterns.adapter;

public class YesBankAdapter implements BankAPI{
    YesBankAPI api = new YesBankAPI();
    @Override
    public void register(String name, String PanNumber) {
        api.signup(name,PanNumber);
    }

    @Override
    public void transferMoney(String from, String to, int amount) {
        api.sendMoney(amount,from,to);
    }

    @Override
    public void checkBalance(String accountNumber) {
        api.getBalance(accountNumber);
    }
}
