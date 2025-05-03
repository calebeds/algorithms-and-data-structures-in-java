package binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        // this is when we insert the first node into the BST (parent is null)
        if(root == null) {
            this.root = new Node<>(data, null);
        } else {
            // there are already item in the BST
            insert(data, root);
        }

    }

    private void insert(T data, Node<T> node) {
        // this is the case when the data is SMALLER than the value in the node
        // GO TO THE LEFT SUBTREE
        if(node.getData().compareTo(data) > 0) {
            // there is a valid (not NULL left child so we go there)
            if(node.getLeftChild() != null) {
                insert(data, node.getLeftChild());
            } // the left child is a NULL so we create a left child
            else {
                node.setLeftChild(new Node<>(data, node));
            }
            // this is the case when the data is GREATER than the value in the node
            // GO TO THE RIGHT SUBTREE
        } else {
            // there is a valid (not NULL right child so we go there)
            if(node.getRightChild() != null) {
                insert(data, node.getRightChild());
            } // the right child is a NULL so we create a left child
            else {
                node.setRightChild(new Node<>(data, node));
            }
        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void traversal() {

    }

    @Override
    public T getMin() {
        return null;
    }

    @Override
    public T getMax() {
        return null;
    }
}
