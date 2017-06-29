/**
 * Created by tousifchowdhury on 2/17/15.
 */


public class LinkedQueue<T extends Prioritizable> extends java.lang.Object implements PriorityQueue<T>{
   private Node <T>  head;
    private int size;

    public LinkedQueue(Node head, int size ){

        this.head = head;
        this.size = size;

    }
    public LinkedQueue(){
        this(null, 0);
    }

    /**
     * returns the first node
     * @return data of the first node
     */


    public T dequeue(){
        if (isEmpty()){
            return null;
        }
        else{
            Node <T> n =  this.head;
            this.head = this.head.getNext();

            this.size--;
            return n.getData();

        }

    }


    /**
     * inserts an item
     * @param toInsert Item to be added
     */

     public void insert(T toInsert){
         Node <T> newNode = new Node<T>(toInsert, null);


        if (isEmpty() || this.head.getData().getPriority()<newNode.getData().getPriority()) {

            newNode.setNext(this.head);

            this.head = newNode;


         }
         else{

            Node <T> current = this.head;
            Node<T> previous = this.head;
            while (current != null && current.getData().getPriority()>newNode.getData().getPriority()){
                previous = current;
                current = current.getNext();




            }
            newNode.setNext(current);
            previous.setNext(newNode);

        }
        this.size++;
     }

    /**
     * checks if the list is empty
     * @return
     */

    public boolean isEmpty(){
        if (this.head == null){
            return true;
        }
        else{
            return false;
        }
    }
}