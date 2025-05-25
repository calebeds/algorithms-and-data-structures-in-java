package datastructures.splaytree;

public interface Tree<T> {
    void insert(T data);
    T find(T data);
    void traverse();
    T getRoot();
}
