import java.util.HashMap;
import java.util.Map;

public class IdentityMap {

    private Map<Integer,Person> internalMap;
    private PersonMapper externalStorage;

    public IdentityMap(PersonMapper storage) {
        this.internalMap = new HashMap<>();
        this.externalStorage = storage;
    }

    public Person retreive(int key) {
        if(!internalMap.containsKey(key)) {
            internalMap.put(key,externalStorage.findById(key));
        }
        return internalMap.get(key);
    }

}