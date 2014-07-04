package com.arhatech.java.ds.custom_data_structures.interfaces;

/**
 * @author ankit.
 */
public interface LinkedList {
    //TODO Add iterator interface implementation. Also add other methods as: clone, etc

    /**
     * adds element at the head of list
     * @param element
     */
    public void addFirst(Object element);

    /**
     * adds element at the tail of list
     * @param element
     */
    public void addLast(Object element);

    /**
     * removes an element from list
     * @param key
     */
    public void remove(Object key);

    /**
     * Traverses the list begin at the head
     */
    public void traverse();

    /**
     * Checks if the list is empty
     * @return
     */
    public boolean isEmpty();

    /**
     * inserts the element after key
     * @param key
     * @param element
     */
    public void insertAfter(Object key, Object element);
    /**
     * inserts the element before key
     * @param key
     * @param element
     */
    public void insertBefore(Object key, Object element);

    /**
     * Search the list for element
     * @param element
     * @return node representing the element searched
     */
    public Node search(Object element);

    /**
     * Returns the last node of the list.
     * @return node
     */
    public Node getLast();

    /**
     * returns the first node of the list.
     * @return node
     */
    public Node getFirst();

    public class Node{
        private Object value;
        private Node nextNode;

        public Node(){

        }

        public Node(Object value, Node nextNode){
            this.value = value;
            this.nextNode = nextNode;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }
    }
}
