/*
Joud Talal Alharbi 
 */

package project;
import java.io.File;
import java.util.Scanner;

public class PokemonGame {

    public static void main(String[] args) throws Exception {
PokemonLL pokemon= new PokemonLL();
PokemonBST BST= new PokemonBST();


         File file= new File ("Pokemons.txt");
        Scanner in= new Scanner(file);


          
        while(in.hasNext()){
            Pokemon p= new Pokemon();
            p.SetId(in.nextInt());
            p.SetName(in.next());
            p.SetType(in.next());
            p.SetAttack(in.nextInt());
            p.SetDefence(in.nextInt());
            p.SetTotal(in.nextInt());
            pokemon.addNode(p);
            BST.insert(p);
        }
      
        
System.out.println("**************************************************************************" );
System.out.println("****                     Welcome to Pokemon Game                      ****");
System.out.println("**************************************************************************");

//pokemon information
System.out.println("Pokemons Information...");
 pokemon.printList();
  System.out.println("");
  
 //Total number of pokemons
System.out.println("Total number of pokemons = "+pokemon.NumOfPokemons());

//pokemon of each type
System.out.println(pokemon.NumOfPokemonType());
  
  //strongest
System.out.println("The strongest pokemon is :"+pokemon.StrongestPokemon());

//avg
System.out.println("The average of all pokemons power is :"+pokemon.AvgPower());
  System.out.println("");
  
 //Pokemons from weakest to strongest..
 System.out.println("Pokemons from weakest to strongest..");
 //bst tree
BST.preorder();

 System.out.println("*********************************");
    
 
   //start
Scanner input=new Scanner(System.in);
System.out.println("\nWe want to make a competition between 2 players \n Each player should choose 3 pokemons to fight with");
//names
System.out.println("Enter the name of the first player: ");
String name1= input.nextLine();
System.out.println("Enter the name of the Secound player: ");
String name2= input.nextLine();

//choice
System.out.println("Now, each player should choose 3 pokemons\n your first choice will play the first round and so on..");

//1st player
System.out.println("Start with "+name1);
//create queue to store pokemons
PokemonQueue queue=new PokemonQueue(3);
int count=1;
while(count<=3){
    System.out.println("Enter the id of pokemon "+count);
    int id= input.nextInt();
    //method search return the pokemon using its id
    if(pokemon.search(id)!=null){
   // enqueue will store the pokemons of each player in the queue
queue.enqueue(pokemon.search(id));
   count++;
}
    else{//if the id is not found
  System.out.println("Wrong pokemon id!!");
}}
System.out.println("Do you want to reverse your pokemons (y/n)?");
char choice=input.next().charAt(0);
if (choice=='y'||choice=='Y'){
//stack reverse
PokemonStack stack=new PokemonStack(queue.size());
stack.reverse(queue);

}


//2nd player
System.out.println("Now, "+name2+" turn");
//create queue to store pokemons
PokemonQueue queue2=new PokemonQueue(3);
count=1;
while(count<=3){
    System.out.println("Enter the id of pokemon "+count);
    int id= input.nextInt();
    if(pokemon.search(id)!=null){
// enqueue will store the pokemons of each player in the queue
queue2.enqueue(pokemon.search(id));
   count++;
}
    else{
  System.out.println("Wrong pokemon id!!");
}
}
System.out.println("Do you want to reverse your pokemons (y/n)?");
choice=input.next().charAt(0);
if (choice=='y'||choice=='Y'){
//stack reverse
PokemonStack stack2=new PokemonStack(queue2.size());
stack2.reverse(queue2);
}

//print each player army
 System.out.println("\n"+name1+" Army...");
 //print queue using void method PrintQueue();
 queue.PrintQueue();
 
  System.out.println("\n"+name2+" Army...");
  //print queue using void method PrintQueue();
 queue2.PrintQueue();
  
 
  /*
  start
      PokémonA wins the round over PokémonB if: PokémonA attack power > PokémonB defense power AND
    PokémonA defense power > PokémonB attack power, otherwise it is a tie.
    The player who wins the most rounds wins the game. In case they have the same number of wins it will be a tie.
  */
  
   System.out.println("\n\n"+"Let The Battle Starts...");
    count=1;
    int first=0; //wins for first player
    int secound=0; //wins for secound player
    
  while(count<=3){ //count =3 rounds
      System.out.println("Round "+count);
      if(queue.peek().GetAttack()>queue2.peek().GetDefence()&& queue.peek().GetDefence()>queue2.peek().GetAttack()){// the first win
          System.out.println(queue.peek().GetName()+" wins!!");
      first++;}
      else if(queue2.peek().GetAttack()>queue.peek().GetDefence()&& queue2.peek().GetDefence()>queue.peek().GetAttack()){// the secound win
          System.out.println(queue2.peek().GetName()+" wins!!");
          
      secound++;}
      else //tie
  System.out.println("it is a Tie..");
  queue.dequeue(); //to change the peek 
  queue2.dequeue(); // to change the peek
  count++; //next round
  }
   System.out.println("The Final Result of Battle...");
   if (first>secound)
       System.out.println(name1+" Wins...");
   else if (first<secound)
       System.out.println(name2+" Wins...");
   else
       System.out.println("It's a tie...");
   
   
   System.out.println("\n Hope you enjoy our Pokemon game:)\n" +
"See you in next games..");
   
    }
 
    }
