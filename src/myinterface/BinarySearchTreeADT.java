package myinterface;

public class BinarySearchTreeADT <e extends Comparable<E>>{
    void insert(E data);
    boolean search(E searchElement);
        void insert(E data);
        boolean search(E searchElement);
        void inOrder(Node<E> node);
        void preOrder(Node<E> node);
        void postOrder(Node<E> node);
        void reverseOrder(Node<E> node);
        void delete(Node<E> node);
        int height(Node<E> node);
    }

