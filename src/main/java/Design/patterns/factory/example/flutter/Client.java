package Design.patterns.factory.example.flutter;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiplatform = flutter.getPlatform("IOS");
        Button btn = uiplatform.createButton();
        btn.click();
    }
}
