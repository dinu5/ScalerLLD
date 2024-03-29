package Design.patterns.factory.example.flutter;

public class IOSUI implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
