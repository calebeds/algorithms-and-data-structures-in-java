package splaytree;

public class SplayTree<T extends Comparable<T>> implements Tree<T> {
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
        if(node.getData().compareTo(data) > 0) {
            if(node.getLeftChild() != null) {
                insert(data, node.getLeftChild());
            }
            else {
                Node<T> newNode = new Node<>(data, node);
                node.setLeftChild(newNode);
                // we have to do splaying (have to make rotations)
                splay(newNode);
            }
        } else {
            if(node.getRightChild() != null) {
                insert(data, node.getRightChild());
            }
            else {
                Node<T> newNode = new Node<>(data, node);
                node.setRightChild(newNode);
                splay(newNode);
            }
        }
    }

    @Override
    public T find(T data) {
        if(root == null) {
            return null;
        }

        return find(data, root);
    }

    public T getRoot() {
        if(root == null) {
            return null;
        }

        return root.getData();
    }

    private T find(T data, Node<T> node) {
        // this is when we look for a given item in the tree
        if(data.compareTo(node.getData()) < 0) {
            find(data, node.getLeftChild());
        } else if(data.compareTo(node.getData()) > 0) {
            find(data, node.getRightChild());
        } else {
            // WE HAVE FOUND THE ITEM WE ARE LOOKING FOR
            splay(node);
            return data;
        }

        return null;
    }

    // this is when we make rotations on the new node to become the root node
    private void splay(Node<T> node) {
        // while the node is not the root node
        while (node.getParentNode() != null) {
            // if the grandparent is null it means that we have to make a simple rotation
            // ZIG CASE
            if(node.getParentNode().getParentNode() == null) {
                // if the node is the left child of root then RIGHT ROTATE on the root
                if(node.getParentNode().getLeftChild() == node) {
                    rightRotation(node);
                // if the node is the right child of root then RIGHT ROTATE on the root
                } else {
                    leftRotation(node);
                }
            // ZIG-ZIG SITUATION
            } else if(node.getParentNode().getLeftChild() == node
                    && node.getParentNode().getParentNode().getLeftChild() == node.getParentNode()) {
                rightRotation(node.getParentNode().getParentNode());
                rightRotation(node.getParentNode());
            // this is the symmetric partner of the zig-zig situation
            } else if(node.getParentNode().getRightChild() == node
                    && node.getParentNode().getParentNode().getRightChild() == node.getParentNode()) {
                leftRotation(node.getParentNode().getParentNode());
                leftRotation(node.getParentNode());
            // ZIG-ZAG SITUATION
            } else if(node.getParentNode().getLeftChild() == node
                    && node.getParentNode().getParentNode().getRightChild() == node.getParentNode()) {
                rightRotation(node.getParentNode());
                leftRotation(node.getParentNode());
            // symmetric partner of the ZIG-ZAG SITUATION
            } else {
                leftRotation(node.getParentNode());
                rightRotation(node.getParentNode());
            }
        }
    }

    @Override
    public void traverse() {
        if(root != null) {
            traverse(root);
        }
    }

    private void traverse(Node<T> node) {
        if(node.getLeftChild() != null) {
            traverse(node.getLeftChild());
        }

        System.out.println(node + " ");

        if(node.getRightChild() != null) {
            traverse(node.getRightChild());
        }
    }

    // it can be done in O(1)
    private void rightRotation(Node<T> node) {
        System.out.println("Rotating right on node: " + node);
        // this is  the new root node after rotation (node B)
        Node<T> tempLeftChild = node.getLeftChild();
        // Node C
        Node<T> grandChild = tempLeftChild.getRightChild();

        // make the rotation - the new root node will be the tempLeftChild
        tempLeftChild.setRightChild(node);
        node.setLeftChild(grandChild);

        // we have to handle the parents
        if(grandChild != null) {
            grandChild.setParentNode(node);
        }

        // we have to handle the parents for the node
        Node<T> tempParent = node.getParentNode();
        node.setParentNode(tempLeftChild);
        tempLeftChild.setParentNode(tempParent);

        // we have to handle the parent
        if(tempLeftChild.getParentNode() != null &&
                tempLeftChild.getParentNode().getRightChild() == node) {
            tempLeftChild.getParentNode().setRightChild(tempLeftChild);
        }

        if(tempLeftChild.getParentNode() != null &&
                tempLeftChild.getParentNode().getLeftChild() == node) {
            tempLeftChild.getParentNode().setLeftChild(tempLeftChild);
        }

        // no parent after rotation because it has become the root node
        if(node == root) {
            root = tempLeftChild;
        }

    }

    private void leftRotation(Node<T> node) {
        System.out.println("Rotating left on node: " + node);

        // this is  the new root node after rotation (node B)
        Node<T> tempRightChild = node.getRightChild();
        // Node C
        Node<T> grandChild = tempRightChild.getLeftChild();

        // make the rotation - the new root node will be the tempRightChild
        tempRightChild.setLeftChild(node);
        node.setRightChild(grandChild);

        // we have to handle the parents
        if(grandChild != null) {
            grandChild.setParentNode(node);
        }

        // we have to handle the parents for the node
        Node<T> tempParent = node.getParentNode();
        node.setParentNode(tempRightChild);
        tempRightChild.setParentNode(tempParent);

        // we have to handle the parent
        if(tempRightChild.getParentNode() != null &&
                tempRightChild.getParentNode().getRightChild() == node) {
            tempRightChild.getParentNode().setRightChild(tempRightChild);
        }

        if(tempRightChild.getParentNode() != null &&
                tempRightChild.getParentNode().getLeftChild() == node) {
            tempRightChild.getParentNode().setLeftChild(tempRightChild);
        }

        // no parent after rotation because it has become the root node
        if(node == root) {
            root = tempRightChild;
        }
    }
}
