package hashtable.generichashmap;

@SuppressWarnings("unchecked")
public class HashMap<Key, Value> {
    private Key[] keys;
    private Value[] values;
    // number of items (default value 0)
    private int n;
    // it manages the resize operation
    private int capacity;

    public HashMap() {
        this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
        this.values = (Value[]) new Object[Constants.TABLE_SIZE];
        this.capacity = Constants.TABLE_SIZE;
    }

    public HashMap(int capacity) {
        this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
        this.values = (Value[]) new Object[Constants.TABLE_SIZE];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }


}
