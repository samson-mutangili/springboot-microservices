package com.samson;

import java.util.Stack;

public class StackDemo {

    static void stack_push(Stack<Integer> stack){
        for( int i=1; i<5; i++){
            stack.push(i);
        }
        System.out.println("pushed elements to the stack");
    }

    static void stack_pop(Stack<Integer> stack){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped: "+stack.pop());
        }

    }

    static void stack_peek(Stack<Integer> stack) {

        System.out.println( "Element at the top of the stack is : " +stack.peek());
    }

    static void stack_search(Stack<Integer> stack, int element){

        int search_result = stack.search(element);
        if (search_result == -1){
            System.out.println("Element " + element +" not found");
        } else{
            System.out.println(" Element found at index: " +search_result);
        }
    }


    public static void main(String[] args){


        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_peek(stack);
        stack_pop(stack);
        stack_search(stack, 3);

    }
}
