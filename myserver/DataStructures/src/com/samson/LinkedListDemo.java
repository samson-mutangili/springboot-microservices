package com.samson;

import java.util.LinkedList;

public class LinkedListDemo {


    public static void main(String[] args){

        LinkedList<Integer> ll = new LinkedList<Integer>();

        //adding elements to the list
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(5);
        ll.addFirst(10);
        ll.addLast(20);
        ll.add(30);
//        ll.addAll(31, 32, 33, 54);
//        ll.a

        //clear() method removes all the elements from the list
        //contains(Object 0) This method returns true if this list contains the specified element.
        // descendingIterator() - This method returns an iterator over the elements in this deque in reverse sequential order.

        //add an element at a specific index
        ll.add(5, 6);

        //print the list
        System.out.println("Initial list\n" + ll +"\n");

        //changing elements, set method takes an index and the element to be replaced at that index
        ll.set(0, 100);

        System.out.println("First element changed \n" + ll + "\n");


        //remove elements, remove method can either take an object to be removed or the index of the object
        ll.remove(1);
//        ll.remove(5);
//        ll.removeFirst();
//        ll.removeLast();
        System.out.println("After removing an element at index 1\n" + ll + "\n");

        //iterating a list using for loop and get method

        System.out.println("Using for loop to iterate through the linked list");
        for (int i=0; i<ll.size(); i++){
            System.out.println("Element at position " + i +" is: " +ll.get(i));
        }

        System.out.println("\nUsing for each loop to iterate through the linked list");
        for (int element : ll){
            System.out.println(element);
        }





    }
}
