package codebrush.ADT;

public class Queue{

    LinkedList linkedList = new LinkedList();

    public int size(){
        return linkedList.size();
    }

    public void add(int value){
        linkedList.addElement(value);
    }

    public int pop(){
        return linkedList.popElementAtLast();
    }

    public Boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public Boolean contains(int value){
        return linkedList.contains(value);
    }
}