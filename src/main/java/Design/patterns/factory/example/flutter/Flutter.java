package Design.patterns.factory.example.flutter;

public class Flutter {
    public UIFactory getPlatform(String platform){
        switch(platform){
            case "ANDROID" :
                return new AndroidUI();
            case "IOS" :
                return new IOSUI();
        }
        return null;
    }
}
