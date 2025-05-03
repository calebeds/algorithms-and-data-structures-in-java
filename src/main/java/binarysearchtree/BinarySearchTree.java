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
        // in-order traversal in O(N) linear running time
        if(root == null) {
            return;
        }

        traversal(root);
    }

    // O(N)
    private void traversal(Node<T> node) {
        if(node.getLeftChild() != null) {
            traversal(node.getLeftChild());
        }

        System.out.print(node + "  ");

        if(node.getRightChild() != null) {
            traversal(node.getRightChild());
        }
    }

    @Override
    public T getMin() {
        if(root == null) {
            return null;
        }

        return getMin(root);
    }

    private T getMin(Node<T> node) {
        if(node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        } else {
            return node.getData();
        }
    }

    @Override
    public T getMax() {
        if(root == null) {
            return null;
        }

        //the max item is the rightmost item the tree
        return getMax(root);
    }

    private T getMax(Node<T> node) {
        if(node.getRightChild() != null) {
            return getMax(node.getRightChild());
        } else {
            return node.getData();
        }
    }
}
