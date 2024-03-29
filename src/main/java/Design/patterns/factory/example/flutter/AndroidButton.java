package Design.patterns.factory.example.flutter;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android Button clicked");
    }

    @Override
    public void rightClick() {
        System.out.println("Android Button right clicked");
    }
}
