package Design.patterns.adapter;

public class YesBankAPI {
    public void signup(String name,String PanNumber){
        System.out.println(name +", your account has been created in YesBank");
    }
    public void sendMoney(int amount,String from,String to){
        System.out.println(amount + " has been transfered from "+from+" to "+to+" via YesBank");
    }
    public void getBalance(String accountNumber){
        System.out.println("Your current balance is XXX int YesBank");
    }
}
