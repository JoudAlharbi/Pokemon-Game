/*
Joud Talal Alharbi
 */

package pokemongame;

public class Pokemon {
   private int id;
   private String name;
   private String type; 
   private int attack;
   private int defence;
   private int total;
   
   
    //constructor
   public void pokemon(){}
   
   public void pokemon(int id,String name,String type,int attack,int defence, int total){
   this.id=id;this.name=name;this.type=type;this.attack=attack;this.defence=defence;this.total=total;
   }
   
   //Getters And Setters
   
   //Id get and set
   public int GetId(){return id;}
    public void SetId(int i){this.id=i ;}
    
    //name get and set
    public String GetName(){return name;}
    public void SetName(String n){this.name=n;}
    
    //type get and set
    public String GetType(){return type;}
    public void SetType(String T){this.type=T;}
    
    //attack get and set
    public int GetAttack(){return attack;}
    public void SetAttack(int a){this.attack=a;}
    
    //defence get and set
    public int GetDefence(){ return defence;}
    public void SetDefence(int d){this.defence=d;}
    //total get and set
    public int GetTotal(){return total;}
    public void SetTotal(int t){this.total=t;}
   
   //toString method
   public String ToString(){
       return ("ID:"+GetId()+", Name: "+GetName()+", Type: "+GetType()+", Attack: "+GetAttack()+", Defense: "+GetDefence()+", Total: "+GetTotal());
   }
}
