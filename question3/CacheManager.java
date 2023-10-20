import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CacheManager {
    private final ConcurrentMap<String, LRUCache<Object, CacheEntry>> cacheMap = new ConcurrentHashMap<>();

    public void put(String region, Object key, Object value, long expirationTime) {
        CacheEntry entry = new CacheEntry(key, value, expirationTime);
        cacheMap.computeIfAbsent(region, r -> new LRUCache<>(1000)).put(key, entry);
        // You may need to handle synchronization depending on your environment
    }

    public Object get(String region, Object key) {
        CacheEntry entry = cacheMap.get(region).get(key);
        if (entry != null && System.currentTimeMillis() <= entry.getExpirationTime()) {
            return entry.getValue();
        } else {
            cacheMap.get(region).remove(key);
            return null;
        }
    }
}

