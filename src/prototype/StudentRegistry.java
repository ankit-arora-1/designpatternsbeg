package prototype;

import java.util.HashMap;
import java.util.Map;

// Should be ideally singleton
public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student student) {
        map.put(key, student);
    }

    public Student get(String key) {
        return map.get(key);
    }
}
