package Design.patterns.factory.example.flutter;

public class Flutter {
    public UIFactory getPlatform(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUI();
        }
        else if(platform.equals(SupportedPlatforms.IOS)){
            return new IOSUI();
        }
        return null;
    }
}
