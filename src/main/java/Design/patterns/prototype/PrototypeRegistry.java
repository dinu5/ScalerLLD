package Design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    Map<String,Student> registryMap = new HashMap();
    public void addtoRegistry(String key,Student student){
        registryMap.put(key,student);
    }
    public Student get(String key){
        return registryMap.get(key);
    }
}
