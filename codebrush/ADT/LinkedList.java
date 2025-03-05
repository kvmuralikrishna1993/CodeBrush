package codebrush.ADT;

public class LinkedList{

    Node first, last;
    int size = 0;

    public int getFirstElement(){
        return first.value;
    }

    public int getLastElement(){
        return last.value;
    }

    public Node getFirstNode(){
        return first;
    }

    public Node getLastNode(){
        return last;
    }

    public int size(){
        return size;
    }

    public Boolean isEmpty(){
        return size==0;
    }

    public void addElement(int value){
        //default: adds element at first
        Node old = first;
        first = new Node(value);
        if (isEmpty()) last = first;
        else first.next =old;
        size++;
    }

    public int pop(){
        //default: pops element at first
        int value = first.value;
        first = first.next;
        size--;
        return value;
    }

    public void addElementAtLast(int value) {
        Node old = last;
        last = new Node(value);
        if (isEmpty()) first = last;
        else old.next = last;
        size++;
    }

    public int popElementAtLast(){
        int value = last.value;
        Node temp = first;
        while(temp.next.next != null) temp = temp.next;
        last = temp;
        last.next = null;
        size--;
        return value;
    }

    public void addElementAtIndex(int value, int index){
        if(index < 0 || index > size) return;
        if(index==0) addElement(value);
        if(index==size) addElementAtLast(value);
        Node left = first;
        for(int i=0; i < index-1; i++) left = left.next;
        Node right = left.next;
        left.next = new Node(value);
        left.next.next =right;
        size++;
    }

    public int popElementAtIndex(int index){
        if(size==0 || index < 0 || index >= size) return -1;
        if(index ==0) return pop();
        if(index == size-1) return popElementAtLast();
        Node left = first;
        for(int i=0; i<index-1; i++) left =left.next;
        Node right = left.next;
        int value = right.value;
        right = right.next;
        left.next =right;
        size--;
        return value;
    }

    public Boolean contains(int value){
        if (isEmpty()) return false;
        Node temp = first;
        for(int i =0; i < size; i++){
            if (temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }

    public void printList(){
        if (size==0) return;
        Node temp = first;
        for(int i =0; i < size; i++){
            System.out.print(temp.value+ " <-");
            temp = temp.next;
        }
        System.out.println();
    }


}