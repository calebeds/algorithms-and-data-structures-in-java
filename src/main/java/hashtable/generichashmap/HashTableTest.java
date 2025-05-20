package hashtable.generichashmap;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("Calebe", 27);
        hashTable.put("Adam", 28);
        hashTable.put("Daniel", 30);

        System.out.println(hashTable.get("Calebe"));
    }
}
