package Design.patterns.factory.example.flutter;

public class IOSMenu implements Menu{

    @Override
    public void show() {
        System.out.println("Showing IOS Menu");
    }
}
