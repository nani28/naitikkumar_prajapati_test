public class CacheEntry {
	private Object key;
	private Object value;
	private long expirationTime;

	public CacheEntry(Object key, Object value, long expirationTime) {
		this.key = key;
		this.value = value;
		this.expirationTime = expirationTime;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public long getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}
}

