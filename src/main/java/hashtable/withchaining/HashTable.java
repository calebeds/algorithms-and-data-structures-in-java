package hashtable.withchaining;

public class HashTable {
    private static final int TABLE_SIZE = 10;
    private HashItem[] hashTable;

    public HashTable() {
        this.hashTable = new HashItem[TABLE_SIZE];
    }

    public int get(int key) {
        int index = hash(key);

        // this is search miss - the item with the given key
        // is not present in the HashTable
        if(hashTable[index] == null) {
            return -1;
        }

        HashItem item = hashTable[index];

        // we have to find the item we are looking for in a LinkedList essentially
        // again this is why it may have O(N) linear running time complexity
        while (item != null && item.getKey() != key) {
            item = item.getNextItem();
        }

        if(item == null) {
            return -1;
        }

        return item.getValue();
    }

    public void put(int key, int value) {
        int index = hash(key);

        // there is no collision (the 'index' is empty)
        if(hashTable[index] == null) {
            System.out.println("No collision - simple insertion");
            hashTable[index] = new HashItem(key, value);
        } else {
            // we know there is already an item at 'index'
            System.out.printf("Collision when inserting with key%s%n", key);
            HashItem item = hashTable[index];

            // this is why the running time may be O(N)
            while (item.getNextItem() != null) {
                System.out.println("Considering the next item in LinkedList " + item.getValue());
                item = item.getNextItem();
            }

            System.out.println("Finally we have found the place to insert");
            item.setNextItem(new HashItem(key, value));
        }
    }

    // it transforms the key into an index of the underlying array
    private int hash(int key) {
        return key % TABLE_SIZE;
    }
}
