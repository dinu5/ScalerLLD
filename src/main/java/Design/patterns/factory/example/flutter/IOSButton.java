package Design.patterns.factory.example.flutter;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("iPhone button clicked");
    }

    @Override
    public void rightClick() {
        System.out.println("iPhone button right clicked");
    }
}
