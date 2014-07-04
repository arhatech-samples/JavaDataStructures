package com.arhatech.java.ds.custom_data_structures.impl;

import com.arhatech.java.ds.custom_data_structures.interfaces.LinkedList;

/**
 * @author ankit.
 */
public class LinkedListImpl implements LinkedList {

    Node head;

    public LinkedListImpl(){
        head = new Node(null, null);
    }

    @Override
    public void addFirst(Object element) {
        Node currentNode = new Node(element, head.getNextNode());

        head.setNextNode(currentNode);
    }

    @Override
    public void addLast(Object element) {
        Node tail = getLast();
        Node newTail = new Node(element, tail.getNextNode());

        tail.setNextNode(newTail);
    }

    @Override
    public void remove(Object key) {
        Node currentNode = head;
        Node previousNode = null;
        while(!isEmpty() && currentNode.getNextNode()!=null ){
            if(currentNode.getValue() != null && currentNode.getValue().equals(key)){

                previousNode.setNextNode(currentNode.getNextNode());
                currentNode.setValue(null);
                currentNode.setNextNode(null);
                currentNode = null;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public void traverse() {
        Node currentNode = head;
        while(currentNode.getNextNode()!=null){
            currentNode = currentNode.getNextNode();
            System.out.println(currentNode);
        }

    }

    @Override
    public boolean isEmpty() {
        return (head.getNextNode()==null);
    }

    @Override
    public void insertAfter(Object key, Object element) {
        Node currentNode = search(key);
        Node newNode = new Node(element, currentNode.getNextNode());
        currentNode.setNextNode(newNode);
    }

    @Override
    public void insertBefore(Object key, Object element) {
        Node currentNode = head;
        Node previousNode = null;
        while(!isEmpty() && currentNode.getNextNode()!=null ){
            if(currentNode.getValue() != null && currentNode.getValue().equals(key)){
                Node newNode = new Node(element, previousNode.getNextNode());
                previousNode.setNextNode(newNode);
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public Node search(Object element) {
        Node currentNode = head;
        while(!isEmpty() && currentNode.getNextNode()!=null ){
            if(currentNode.getValue() != null && currentNode.getValue().equals(element)){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    public Node getLast(){
        Node currentNode = head;
        while(currentNode.getNextNode()!=null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public Node getFirst(){
        return head.getNextNode();
    }

}
