package codebrush.Problems.Easy;
import codebrush.ADT.LinkedList;

public class LinkedListProblems {

    public void elementaryImplementation(){
        LinkedList properties = new LinkedList();

        properties.addElement(1);
        properties.addElement(2);
        properties.printList();
        // 2 <- 1

        properties.addElementAtLast(4);
        properties.addElementAtLast(3);
        properties.printList();
        // 2 <- 1 <- 4 <- 3

        properties.addElementAtIndex(5, 1);
        properties.printList();
        // 2 <- 5 <- 1 <- 4 <- 3

        properties.addElementAtIndex(6, 3);
        properties.printList();
        // 2 <- 5 <- 1 <- 6 <- 4 <- 3

        int popElement = properties.popElementAtIndex(3);
        System.out.println("Element Removed at 3 is "+popElement);
        properties.printList();
        // 2 <- 5 <- 1 <- 4 <- 3

        popElement = properties.popElementAtLast();
        System.out.println("Last Element is "+popElement);
        properties.printList();
        // 2 <- 5 <- 1 <- 4

        popElement = properties.pop();
        System.out.println("Element Removed at start is "+popElement);
        properties.printList();
        // 5 <- 1 <- 4

        System.out.println(properties.size());
        //3

        if(properties.contains(5)) System.out.println("Yes");
        // Yes

        if(!properties.isEmpty()) System.out.println("No");
        // No

        System.out.println("First Element is " + properties.getFirstElement()); //5

        System.out.println("Last Element is " + properties.getLastElement()); //4
    }


}
