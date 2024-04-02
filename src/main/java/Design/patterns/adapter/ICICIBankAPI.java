package Design.patterns.adapter;

public class ICICIBankAPI {
    public void signup(String name,String PanNumber){
        System.out.println(name +", your account has been created in ICICIBank");
    }
    public void sendMoney(int amount,String from,String to){
        System.out.println(amount + " has been transfered from "+from+" to "+to+" via ICICIBank");
    }
    public void getBalance(String accountNumber){
        System.out.println("Your current balance is XXX in ICICIBank");
    }
}
