package Design.patterns.adapter;

public class Phonepe {
    public static void main(String[] args) {
        BankAPI api = new IciciBankAdapter();
        //BankAPI api = new YesBankAdapter();
        api.register("Dino Chakraborty","122121C");
        api.transferMoney("12345","54321",5000);
        api.checkBalance("12345");
    }
}
