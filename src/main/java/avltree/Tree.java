package avltree;

public interface Tree<T> {
    void insert(T data);
    void remove(T data);
    void traverse();
}
