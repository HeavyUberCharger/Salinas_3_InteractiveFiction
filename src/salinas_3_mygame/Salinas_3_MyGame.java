/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salinas_3_mygame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HUC
 */
public class Salinas_3_MyGame {
    static int HP;
    static boolean IsAlive;
    static String name;
    static int Potions;
    static int Class;
    static int ogreHP;
    
    static class mage {
        String name;
        int hp;
        int charisma;
        int damage;
        int mana =40;
        int dexterity = 16;
        
  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mage andres = new mage();
        andres.name = "Andres the Mighty";
        
        Potions = 0;
        IsAlive = true;
        HP = 100; 
        ogreHP = 100;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello brave adventurer! What is your name?");
        name = input.nextLine();
        System.out.println("Chose a class young "+name+ "!");
        Scanner classinput = new Scanner(System.in);
        System.out.println(" Press 1 for Mage, 2 for Archer, and 3 for Warrior");    
        Class = classinput.nextInt();
        if(Class < 1 || Class > 3){
            System.out.println("You dint pick a number between 1 and 3, so im just going to make you a mage.");
            Class = 1;
        }
        if(Class ==1){
            System.out.println("Ok!You Picked the Mage class!");
        }else if(Class == 2){
            System.out.println("Ok!You Picked the Archer class!");
        }else if(Class == 3){
            System.out.println("Ok!You Picked the Warrior class!");
        }
        System.out.println("You have embarked on a journey in search of the lost treasure In the dungeon keep");
        System.out.println("You find the dungeon entrance, Do you want to search the area first or go in?");
        Scanner choiceinput = new Scanner(System.in);
        System.out.println("Type 1 to enter the dungeon, or type 2 to look around first");
        int choice = choiceinput.nextInt();
        //check if the choice is not a number specified  and makes you chose a path
        if(choice < 1 || choice > 2){
            System.out.println("I TOLD YOU TO TYPE EITHER 1 OR 2, IM CHOOSING 1 FOR YOU THEN");
            choice = 1;
        } 
        if(choice == 2){
            System.out.println("You look around and find a health potion lying on the dirt");
            Potions = Potions +1;
            //#HERO
            //I used this so the player has some way to heal health
            System.out.println("You now have " + Potions + " Potion/s!");
            choice = 1;
        }
        //it all go to this anyways, potion is a additional item for being adventurous 
        if(choice == 1){
            //System.out.println();
            System.out.println("You Enter the dungeon and find a ogre blocking you way, What will you do?");
            //enemyobject
        //check statement of hp and if game should still be running
        }
        if(Class == 1){
            //#while
            //I use this while loop to check if the player is alive, otherwise it wont run
        while(IsAlive){
        
            isRunningMage();
        
    }
        }
        if(Class == 2){
        while(IsAlive){
        
            isRunningArcher();
        
    }
        }
        if(Class == 3){
        while(IsAlive){
        
            isRunningWarrior();
        
    }
        }
        
    }
    //START OF MAGE CLASS 
    //#METHOD1()
    static void isRunningMage(){
        
            if(Class == 1){
                //new input, i dont know how to reuse them, maybe i will later and change this
                Scanner choiceinput2 = new Scanner(System.in);
                System.out.println("type 1 to fight, 2 to drink potion, 3 to run away");
                int choice2 = choiceinput2.nextInt();
                //checker
                if(choice2 < 1 || choice2 > 3){
                    System.out.println("I TOLD YOU TO TYPE EITHER 1 2 OR 3, IM CHOING 3 FOR YOU THEN");
                    choice2 = 3;
                }
                if(choice2 == 3){
                    System.out.println("You turn the other way and run for your life, but soon meet a wall and are forced to fight");
                    HP = HP -20;
   
                    if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich");
                    IsAlive = false;
                    }else{         
                     System.out.println("YOU NOW HAVE:" +HP + " HEALTH.");
                    choice2 = 1;
                    }
                    //end of run away choice for mage 
                }
                if(choice2 == 2){
                    if(Potions >= 1){
                        System.out.println("You take a potion from your pouch and drink it! you restore 20 health and ready to fight!");
                        HP = HP + 20;
                        Potions = Potions -1;
                        System.out.println("YOU NOW HAVE:" + HP + " HEALTH");
                        System.out.println("You now have " + Potions + " Potion/s!");
                        choice2 =1;
                    }else if(Potions < 1){
                    System.out.println("You look in yur pouch but only see dust! The ogre hits you with his giant club.");
                    HP = HP - 20;
                    if(HP <= 0){
                        //#lose
                        //I used this statement so if the player has no hp, he dies and the while loop stops
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich");
                    IsAlive = false;
                    //#fortheloss
                    //this states the player has died and the game ended
                    }else{
                    System.out.println("YOU NOW HAVE:" +HP+ " HEALTH.");
                    choice2 =1;
                    }
                }
                    //end of drink potion choice for mage
                }
                // both of the other two options make you go to the fight
                //FIGHT CHOICE START
                if(choice2 == 1){
                    System.out.println("You will fight! but what spell should you cast?");
                    Scanner choiceinput3 = new Scanner(System.in);
                    System.out.println("type 1 for 'ola invisium!', 2 for 'forus ignitus!', or 3 for 'turtus cratoris!' ");
                    int choice3 = choiceinput3.nextInt();
                    if(choice3 < 1 || choice3 > 3){
                        System.out.println("I TOLD YOU TO TYPE EITHER 1 2 OR 3, IM CHOING 2 FOR YOU THEN");
                        choice3 = 2;
                    }
                    if(choice3 == 3){
                        Random randomnumber = new Random(10);
                        int magicnumber = randomnumber.nextInt(10);
                        if(magicnumber < 5){
                        System.out.println("You cast a spell that turns the ogre to a frog, but it failed!");
                        System.out.println("You awkardly look at the ogre as he hits you with his giant club");
                        HP = HP - 20;
                        if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        }else if(magicnumber > 5){
                            System.out.println("You cast a spell that turns the ogre to a frog, And it worked!");
                            System.out.println("you turn the ogre into a frog. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                        }
                        //end of frog spell
                    }
                    if(choice3 == 1){
                        System.out.println("You cast a spell that makes you invisibe unless you attack!");
                        System.out.println("What will you do now?");
                        Scanner choiceinput5 = new Scanner(System.in);
                        System.out.println("Type 1 for forus ignitus!' or 2 for 'turtus cratoris!', or 3 to drink potion");
                        int choice5 = choiceinput5.nextInt();
                        if(choice5 < 1 || choice5 > 3){
                            System.out.println("I TOLD YOU TO TYPE EITHER 1 OR 2, IM CHOSING 1 FOR YOU THEN");
                            choice5 = 1;
                        }
                        if(choice5 == 1){
                           
                            System.out.println("You summon a fireball that strikes the ogre,doing 25% of his health.The ogre swings at you and does 20 damage.");
                         HP = HP - 20;
                         ogreHP = ogreHP -25;
                         if(ogreHP <= 0){
                             //#win
                             //when the enemys hp is 0, the game says the player won
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                            //#forthewin
                            //the player wins and the game is over, so the while loop stops
                         }
                         else if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        }else if(choice5 == 2){
                            Random randomnumber = new Random();
                        int magicnumber = randomnumber.nextInt(10);
                        if(magicnumber < 5){
                        System.out.println("You cast a spell that turns the ogre to a frog, but it failed!");
                        System.out.println("You awkardly look at the ogre as he hits you with his giant club");
                        HP = HP - 20;
                        if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        }else if(magicnumber > 5){
                            System.out.println("You cast a spell that turns the ogre to a frog, And it worked!");
                            System.out.println("you turn the ogre into a frog. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                        }
                            
                            
                            
                            
                        }else if(choice5 ==3){
                           if(Potions >= 1){
                        System.out.println("You take a potion from your pouch and drink it! you restore 20 health and ready to fight!");
                        HP = HP + 20;
                        Potions = Potions -1;
                        System.out.println("YOU NOW HAVE:" + HP + " HEALTH");
                        System.out.println("You now have " + Potions + " Potion/s!");
                        choice3 =1;
                    }else if(Potions < 1){
                    System.out.println("You look in yur pouch but only see dust!Try a different attack");
                   //goes to the top again
                } 
                        }     
                        //end of invisible spell
                    }
                    if(choice3 == 2){
                        System.out.println("You summon a fireball that strikes the ogre,doing 25% of his health.The ogre swings at you and does 20 damage.");
                         HP = HP - 20;
                         ogreHP = ogreHP -25;
                         if(ogreHP <= 0){
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                         }
                         else if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        
                        //end of fireball spell
                    }
                    
                    
                    //end of spell choice
                }
                
               //end of mage class stuff 
            }
                
        }
    //START OF ARCHER CLASS
    //#method2()
    //second class method
        static void isRunningArcher(){
            if(Class == 2){
                //new input, i dont know how to reuse them, maybe i will later and change this
                Scanner choiceinput2 = new Scanner(System.in);
                System.out.println("type 1 to fight, 2 to drink potion, 3 to run away");
                int choice2 = choiceinput2.nextInt();
                //checker
                if(choice2 < 1 || choice2 > 3){
                    System.out.println("I TOLD YOU TO TYPE EITHER 1 2 OR 3, IM CHOING 3 FOR YOU THEN");
                    choice2 = 3;
                }
                if(choice2 == 3){
                    System.out.println("You turn the other way and run for your life, but soon meet a wall and are forced to fight");
                    HP = HP -20;
   
                    if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich");
                    IsAlive = false;
                    }else{         
                     System.out.println("YOU NOW HAVE:" +HP + " HEALTH.");
                    choice2 = 1;
                    }
                    //end of run away choice for archer 
                }
                if(choice2 == 2){
                    if(Potions >= 1){
                        System.out.println("You take a potion from your pouch and drink it! you restore 20 health and ready to fight!");
                        HP = HP + 20;
                        Potions = Potions -1;
                        System.out.println("YOU NOW HAVE:" + HP + " HEALTH");
                        System.out.println("You now have " + Potions + " Potion/s!");
                        choice2 =1;
                    }else if(Potions < 1){
                    System.out.println("You look in yur pouch but only see dust! The ogre hits you with his giant club.");
                    HP = HP - 20;
                    if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich");
                    IsAlive = false;
                    }else{
                    System.out.println("YOU NOW HAVE:" +HP+ " HEALTH.");
                    choice2 =1;
                    }
                }
                    //end of drink potion choice for archer
                }
                // both of the other two options make you go to the fight
                //FIGHT CHOICE START
              if(choice2 == 1){
                  System.out.println("You will fight! but what will you do?");
                    Scanner choiceinput3 = new Scanner(System.in);
                    System.out.println("type 1 to set a trap, or 2 to shoot arrow");
                    int choice3 = choiceinput3.nextInt();
                    if(choice3 < 1 || choice3 > 2){
                        System.out.println("I TOLD YOU TO TYPE EITHER 1 OR 2, IM CHOING 2 FOR YOU THEN");
                        choice3 = 2;                      
                    }
                    if(choice3 == 1){
                        Random randomnumber = new Random();
                        int magicnumber = randomnumber.nextInt(10);
                        if(magicnumber < 5){
                        System.out.println("You try to setup a trap,but the ogre hits you before you place it in time!");        
                        HP = HP - 20;
                        if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        }else if(magicnumber >= 5){
                            System.out.println("You set up the trap in time and the ogre falls into it, you hail arrows at him and do 50% of his health");
                            ogreHP = ogreHP -50;
                         if(ogreHP <= 0){
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                         }else{
                             //goes up again
                         }
                         
                        }
                        
                        
                        
                        
                        
                        
                        
                    }else if(choice3 == 2){
                        System.out.println("You shoot a arrow at the ogre and it hits him doing 25% of his health, he inturn hits you with his giant club");
                        
                        HP = HP - 20;
                         ogreHP = ogreHP -25;
                         if(ogreHP <= 0){
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                         }
                         else if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        //end of shoot arrow choice for archer, goes up again
                    }
                  
                  
               
                  
                  
                  //end of fight choice for archer
              }
            }
         //end of archer class stuff
        }
        //START OF WARRIOR CLASS
        //#method3()
        //third class method
        static void isRunningWarrior(){
            if(Class == 3){
                //new input, i dont know how to reuse them, maybe i will later and change this
                Scanner choiceinput2 = new Scanner(System.in);
                System.out.println("type 1 to fight, 2 to drink potion, 3 to run away");
                int choice2 = choiceinput2.nextInt();
                //checker
                if(choice2 < 1 || choice2 > 3){
                    System.out.println("I TOLD YOU TO TYPE EITHER 1 2 OR 3, IM CHOING 3 FOR YOU THEN");
                    choice2 = 3;
                }
                if(choice2 == 3){
                    System.out.println("You turn the other way and run for your life, but soon meet a wall and are forced to fight");
                    HP = HP -20;
   
                    if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich");
                    IsAlive = false;
                    }else{         
                     System.out.println("YOU NOW HAVE:" +HP + " HEALTH.");
                    choice2 = 1;
                    }
                    //end of run away choice for warrior 
                }
                if(choice2 == 2){
                    if(Potions >= 1){
                        System.out.println("You take a potion from your pouch and drink it! you restore 20 health and ready to fight!");
                        HP = HP + 20;
                        Potions = Potions -1;
                        System.out.println("YOU NOW HAVE:" + HP + " HEALTH");
                        System.out.println("You now have " + Potions + " Potion/s!");
                        choice2 =1;
                    }else if(Potions < 1){
                    System.out.println("You look in yur pouch but only see dust! The ogre hits you with his giant club.");
                    HP = HP - 20;
                    if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich");
                    IsAlive = false;
                    }else{
                    System.out.println("YOU NOW HAVE:" +HP+ " HEALTH.");
                    choice2 =1;
                    }
                }
                    //end of drink potion choice for warrior
                }
                // both of the other two options make you go to the fight
                //FIGHT CHOICE START
                
              if(choice2 == 1){
                  System.out.println("You will fight! but what will you do?");
                    Scanner choiceinput3 = new Scanner(System.in);
                    System.out.println("type 1 to block,2 to swing sword, or 3 to throw knifes");
                    int choice3 = choiceinput3.nextInt();
                    if(choice3 < 1 || choice3 > 3){
                        System.out.println("I TOLD YOU TO TYPE EITHER 1, 2 OR 3, IM CHOING 2 FOR YOU THEN");
                        choice3 = 2;                      
                    }
                    if(choice3 == 1){
                        Random randomnumber = new Random();
                        int magicnumber = randomnumber.nextInt(10);
                        if(magicnumber < 5){
                        System.out.println("You try to block,but the ogre overwhelms you before you can act!");        
                        HP = HP - 20;
                        if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        }else if(magicnumber > 5){
                            System.out.println("You sucessfully block a ogre hit and start striking him down, your sword does 50% of his health");
                            ogreHP = ogreHP -50;
                         if(ogreHP <= 0){
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                         }else{
                             //goes up again
                         }
                         
                        }              
                        
                    }else if(choice3 == 2){
                        System.out.println("You swing your sword at the ogre doing 25% of his health, he inturn hits you with his giant club");
                        
                        HP = HP - 20;
                         ogreHP = ogreHP -25;
                         if(ogreHP <= 0){
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                         }
                         else if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        //end of swing sword choice for warrior, goes up again
                    }else if(choice3 == 3){
                        Random randomnumber = new Random();
                        int magicnumber = randomnumber.nextInt(10);
                        if(magicnumber < 2){
                        System.out.println("You try to throw your knifes,but the ogre overwhelms you before you can act!");        
                        HP = HP - 20;
                        if(HP <= 0){
                        System.out.println("You have died!Now you will never fill your dreams of becoming rich.LOSER");
                    IsAlive = false;
                    }else{
                        System.out.println("YOU NOW HAVE:" + HP+ " HEALTH." );
                        //goes up again
                       
                        }
                        }else if(magicnumber >= 2){
                            System.out.println("You sucessfully throw your knifes at the ogre, doing 25% of his health");
                            ogreHP = ogreHP -25;
                         if(ogreHP <= 0){
                             System.out.println("The ogre tumbles down to the ground and dies. You happily walk to the dungeon treasure and claim it. ");
                            System.out.println("You swiftly escape the dungeon and return home rich, CONGRATULATIONS "+ name+", YOU HAVE WON!");
                            IsAlive = false;
                         }else{
                             //goes up again
                         }
                         
                        }
 
                    }
                    //end of throw knifes choice
                    
                  
                  
               
                  
                  
                  //end of fight choice for Warrior
              }
            }
            //end of warrior stuff
        }
    }
    

