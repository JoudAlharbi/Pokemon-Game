/*
Joud Talal Alharbi
 */

package pokemongame;


public class PokemonQueue {
    private Pokemon[] queue;
    private int maxSize;
    private int front;
    private int numItems;

    public PokemonQueue(int size) {
         maxSize = size;             
        queue = new Pokemon[maxSize];  
        front = 0;
        numItems = 0;
    }

    public void enqueue (Pokemon pokemon){
        queue[(front+numItems)%maxSize]=pokemon;
        numItems++;
    }
    
    //----------dequeue----------
    public Pokemon dequeue() {
        Pokemon temp = queue[front];
        // update the location of front
        front = (front + 1) % maxSize;
        // decrement numItems
        numItems--;
        // return the previous front value
        return temp;
    }


    public boolean isFull() {
        return (numItems == maxSize);
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }
    public Pokemon peek(){
        return queue[front];
    }
    public int size (){
        return numItems;
    }


    //----------PrintQueue----------
    public void PrintQueue() {
        for (int i = 0; i < numItems; i++) {
            System.out.print(queue[(front + i) % queue.length].GetName()+ ", ");
        }
    }
}
