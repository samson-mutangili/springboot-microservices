package com.samson;

import java.nio.charset.IllegalCharsetNameException;

public class QueueDemo {
//
//    Operations on Queue:
//    Mainly the following four basic operations are performed on queue:
//
//    Enqueue: Adds an item to the queue. If the queue is full, then it is said to be an Overflow condition.
//            Dequeue: Removes an item from the queue. The items are popped in the same order in which they are pushed. If the queue is empty, then it is said to be an Underflow condition.
//            Front: Get the front item from queue.
//     Rear: Get the last item from queue.
//

    private int capacity, size, rear, front;
    private int[] my_array;

    public QueueDemo(int capacity){

        //initialize variables
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = capacity -1;
        this.my_array = new int[capacity];

    }

     boolean isEmpty(QueueDemo queue){
        return (queue.size == 0);
    }

     boolean ifFull(QueueDemo queueDemo){
        return (queueDemo.size == queueDemo.capacity);
    }

     void enqueue(int element){
        //check if queue is full
        if(ifFull(this)){
            System.out.println(("Queue is full"));
        } else{
            //find the new rear
            this.rear = (this.rear +1) % this.capacity;
            //insert the element
            this.my_array[this.rear] = element;
            this.size++;
            System.out.println("Element successfully added to the queue");
        }
    }

    int dequeue(){
        if(isEmpty(this)){
            System.out.println("Cannot dequeue! queue is empty");
            return Integer.MIN_VALUE;
        } else{
            //get the element
            int num = this.my_array[this.front];
            //calculate the new front
            this.front = (this.front + 1) % this.capacity;
            //return the value
            this.size--;
            return num;
        }

    }

    int rear (){
        if(isEmpty(this)){
            System.out.println("Rear error! Queue is empty");
            return Integer.MIN_VALUE;
        } else{
            //get the element at the top of the queue
            return this.my_array[this.rear];
        }
    }

    int front(){
        if (isEmpty(this)){
            System.out.println("Front error: Queue is empty");
            return Integer.MIN_VALUE;
        } else{
            //return the element at the rear of the queue
            return this.my_array[this.front];
        }
    }


    public  static void main(String[] args){


        QueueDemo queue = new QueueDemo(7);
        queue.enqueue(21);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);

        System.out.println("Element at front is: "+ queue.front());
        System.out.println("Element at the rear is: "+ queue.rear());
        System.out.println("Element "+queue.dequeue() +" has been dequeued");
        System.out.println("Element at front is: "+ queue.front());
    }
}
