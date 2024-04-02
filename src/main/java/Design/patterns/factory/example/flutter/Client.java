package Design.patterns.factory.example.flutter;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiplatform = flutter.getPlatform(SupportedPlatforms.IOS);

        Button btn = uiplatform.createButton();
        btn.click();

        Menu menu = uiplatform.createMenu();
        menu.show();
    }
}
