package Design.patterns.Singleton;

public class MySingleton {
    static MySingleton mySingleton = null;
    private MySingleton(){};
    public static MySingleton getInstance(){
        if(mySingleton==null){
            synchronized (MySingleton.class){
                if(mySingleton==null){
                    mySingleton = new MySingleton();
                }
            }
        }
        return mySingleton;
    }
}
