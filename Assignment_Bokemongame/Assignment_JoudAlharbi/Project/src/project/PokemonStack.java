
package project;


public class PokemonStack {

    private Pokemon[] stack;
    private int maxSize;
    private int top;
    // Constructor

    public PokemonStack(int size) {
        maxSize = size;             // set array size
        stack = new Pokemon [maxSize];   // create array for stack
        top = -1;                   // set top to -1 (no items in stack yet)
    }

    //----------isFull----------
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    //----------isEmpty----------
    public boolean isEmpty() {
        return (top == -1);
    }

    //----------pop----------
    public Pokemon pop() {
          if(isEmpty()){
     System.out.println("Cannot Pop; stack is full."); 
    return null;
  }
     else{
    return stack[top--];
    }
    }
    //----------push----------
    public void push(Pokemon value) {
        if (isFull()){
         System.out.println("Cannot PUSH; stack is full.");
        }
         else{
        stack[++top] = value;
    }}
    //--------top------------
    public Pokemon top(){
      if(isEmpty()){
    System.out.println("Cannot top; stack is full.");
    return null;
    }
          else{
        return stack[top];
    }
    }
    
     public static void reverse(PokemonQueue myQueue) {
        PokemonStack stack = new PokemonStack(10);
        while (!myQueue.isEmpty()){
            Pokemon a = myQueue.dequeue();
            stack.push(a);
        }
        while (!stack.isEmpty()) {
           Pokemon a = stack.pop();
            myQueue.enqueue(a);
        }
    }
} 