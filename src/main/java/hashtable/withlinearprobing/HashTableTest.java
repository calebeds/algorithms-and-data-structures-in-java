package hashtable.withlinearprobing;


public class HashTableTest {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(1, 10);
        table.put(21, 20);
        table.put(31, 30);
        table.put(41, 40);
        table.put(51, 50);

        System.out.println(table.get(51));
    }
}
