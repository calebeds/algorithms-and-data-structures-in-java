package binarysearchtree;

public interface Tree<T> {
    Node<T> getRoot();
    void insert(T data);
    void remove(T data);
    //in-order traversal yields the natural ordering
    void traversal();
    T getMin();
    T getMax();

}
