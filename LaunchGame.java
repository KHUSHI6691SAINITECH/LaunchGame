/******************************************************************************

                           Guesser Game which have three rounds each round decide who is winner and who is loser.
                           In this Game it will tell you who pridict wrong number and who type out of given number Area..

*******************************************************************************/

import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		
		return guessNum;
		
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}


class Umpire
{
	
	int count1 = 0; 
	int count2 = 0; 
	int count3 = 0;	
	void compare()
	{ 
	     System.out.println();
	      System.out.println();
	    
	 
	        
	       System.out.println(" ...........HERE IS THREE ROUND......");
	        System.out.println(" ...YOU HAVE TO ENTER NUMBER BETWEEN 0 TO 9 ...");
	       
	       
	       System.out.println();
	       System.out.println();
	       System.out.println();
	       
	       
	       //***Round 1**********
	       System.out.println("START ROUND : 1");
	       System.out.println();
	       System.out.println();
	       
	       
	       
	    //****Object of Guesser Class*****
	    Guesser g=new Guesser();
	    int numFromGuesser=g.guessNum();
	    
	    
	    
	    if(numFromGuesser<10){
	        
	        //********Object of Players*****
	        	Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
	    int numFromPlayer1=p1.guessNum();
		int numFromPlayer2=p2.guessNum();
 	    int numFromPlayer3=p3.guessNum();
 	    
 	    //****If one condition true then******
	       if(numFromPlayer1<10 || numFromPlayer2<10 || numFromPlayer3<10){
	           
	            //*****When PLAYER 1 Won IN EVERY CONDITION*****************
	         if(numFromPlayer1<10 &&  numFromGuesser ==numFromPlayer1){
	             if (numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser){
	                 System.out.println("All won");
	                 count1++;
	                  count2++;
	                  count3++;
	                 System.out.println(count1+" WON TIMES" );
	                 System.out.println(count2+" WON TIMES" );
	                 System.out.println(count3+" WON TIMES" );
	                 
	                 
	             }
	             else if(numFromGuesser==numFromPlayer2){
	                 if(numFromPlayer3<10){
	                     System.out.println("Won : Player 1 and Player 2");
	                     System.out.println("Lose : Player 3 better luck next time.");
	                     count1++;
	                     count2++;
	                     System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 else{
	                     System.out.println("Won : Player 1 and Player 2 ");
	                     System.out.println("Player 3 you have to guess between 0 to 9.");
	                     count1++;
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	             }
	             else if(numFromGuesser==numFromPlayer3){
	                 
	                 if(numFromPlayer2<10){
	                     System.out.println("Won : Player 1 and Player 3");
	                     System.out.println("Lose : Player 2 better luck next time.");
	                     count1++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 else{
	                     System.out.println("Won : Player 1 and Player 3 ");
	                     System.out.println("Player 2 you have to guess between 0 to 9.");
	                     count1++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	             }
	                    else{
	                       if(numFromPlayer2<10 && numFromPlayer3<10){
	                    System.out.println("Won : Player 1 ");
	                      System.out.println("Lose : Player 2 and Player 3 better luck next time.");
	                      count1++;
	                       System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                    else if(numFromPlayer2>10 && numFromPlayer3<10){
	                     System.out.println("Won : Player 1  ");
	                     System.out.println("Lose : Player 2  you have to guess between 0 to 9.");
	                       System.out.println("Lose : Player 3 better luck next time.");
	                       count1++;
	                        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                   else if(numFromPlayer3>10 && numFromPlayer2<10){
	                     System.out.println("Won : Player 1  ");
	                     System.out.println("Lose : Player 3  you have to guess between 0 to 9.");
	                       System.out.println("Lose : Player 2 better luck next time.");
	                       count1++;
	                        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                   else{
	                     System.out.println("Won : Player 1 ");
	                     System.out.println("Lose : Player 2 and Player 3 you have to guess between 0 to 9. ");
	                     count1++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 }
	             
	         }
	           
	             
	        //*****For Player 2 Won IN EVERY CONDITION ********/
	         
	        else if(numFromPlayer2<10 && numFromGuesser ==numFromPlayer2){
	           if(numFromGuesser==numFromPlayer3){
	               if(numFromPlayer1<10){
	                   System.out.println("Won : Player 2  and Player 3");
	                     System.out.println("Lose: Player 1 better luck next time.");
	                     count2++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	               else {
	                   System.out.println("Won : Player 2  and Player 3");
	                     System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	                     count2++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	           
	           }
	              else if(numFromPlayer3<10 && numFromPlayer1<10){
	                    System.out.println("Won : Player 2  ");
	                     System.out.println("Lose: Player 1 and Player 3 better luck next time.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	              }
	               else if(numFromPlayer1>10 && numFromPlayer3<10){
	                   System.out.println("Won : Player 2  ");
	                     System.out.println("Lose:  Player 3 better luck next time.");
	                     System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	                else if(numFromPlayer1<10 && numFromPlayer3>10){
	                   System.out.println("Won : Player 2  ");
	                     System.out.println("Lose:  Player 1 better luck next time.");
	                     System.out.println("Lose: Player 3 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	                else{
	                   System.out.println("Won : Player 2 ");
	                     System.out.println("Lose: Player 1 and Player 3 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	           }
	            
	            
	  
	         

	        //******WHEN PLAYER 3 WON IN EVERY CONDITION****
	else if(numFromGuesser==numFromPlayer3){
	   
	   if(numFromPlayer1<10 && numFromPlayer2<10){
	        System.out.println("Won : Player 3  ");
	        System.out.println("Lose: Player 1 and Player 2 better luck next time.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else if(numFromPlayer1<10  && numFromPlayer2>10 && numFromGuesser==numFromPlayer3){
	        System.out.println("Won : Player 3");
	         System.out.println("Lose:  Player 1 better luck next time.");
	        System.out.println("Lose: Player 2 you have to guess between 0 to 9.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else if(numFromPlayer1>10  && numFromPlayer2<10 && numFromGuesser==numFromPlayer3){
	        System.out.println("Won : Player 3");
	         System.out.println("Lose:  Player 2 better luck next time.");
	        System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else{
	       System.out.println("Won : Player 3");
	       System.out.println("Lose: Player 1 and Player 2 you have to guess between 0 to 9.");
	       count3++;
	        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	}   
	             
	      
	}
	
	
	
	
	          //******WHEN NO ONE PRIDICT RIGHT ANSWER*****  
	   else if(numFromPlayer1<10 || numFromPlayer2<10 || numFromPlayer3<10){
	       if(numFromPlayer1<10 && numFromPlayer2>10 && numFromPlayer3>10){
	           System.out.println("Lose : Player 1 ");
	           System.out.println("Lose: Player 2 and Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer2<10 && numFromPlayer1<10 && numFromPlayer3>10){
	           System.out.println(" Lose : Player 1 and Player 2");
	           System.out.println("Lose: Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       } 
	       else if(numFromPlayer1<10 && numFromPlayer2>10 && numFromPlayer3<10){
	           System.out.println(" Lose : Player 1  and Player 3");
	           System.out.println("Lose: Player 2  you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2<10 && numFromPlayer3>10){
	           System.out.println("Lose : Player 2 ");
	           System.out.println("Lose: Player 1 and Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2<10 && numFromPlayer3<10){
	           System.out.println(" Lose : Player 2 and Player 3 ");
	           System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2>10 && numFromPlayer3<10){
	           System.out.println("Lose :  Player 3 ");
	           System.out.println("Lose: Player 2 and Player 1 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else{
	            System.out.println("Lose: Player1 and Player 2 and Player3.");
	             System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	   }        
	
	//********All players when guess out of numberArea *********
	else{
	   System.out.println("Lose: Players you have to guess between 0 to 9.");
	    System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	}
	}
    

    //*********When guesser enter out of numberArea **********
	else{
	    System.out.println("guesser please guess between 0 to 9");
	    System.out.println("Guesser you destroy a Round");
	    
	     System.out.println(count1+" WON TIMES" );
	     System.out.println(count2+" WON TIMES" );
	     System.out.println(count3+" WON TIMES" );
	}
	




System.out.println();
System.out.println();
System.out.println();


      //***Round 2**********************************************

	 numFromGuesser=g.guessNum();
	    
	    
System.out.println();
System.out.println();
System.out.println();

	      
	       System.out.println("START ROUND : 2");
	    if(numFromGuesser<10){
	        
	        //********Object of Players*****
	        	Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
	    int numFromPlayer1=p1.guessNum();
		int numFromPlayer2=p2.guessNum();
 	    int numFromPlayer3=p3.guessNum();
 	    
 	    //****If one condition true then******
	       if(numFromPlayer1<10 || numFromPlayer2<10 || numFromPlayer3<10){
	           
	            //*****When PLAYER 1 Won in every condition******
	         if(numFromPlayer1<10 &&  numFromGuesser ==numFromPlayer1){
	             if (numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser){
	                 System.out.println("All won");
	                 count1++;
	                  count2++;
	                  count3++;
	                 System.out.println(count1+" WON TIMES" );
	                 System.out.println(count2+" WON TIMES" );
	                 System.out.println(count3+" WON TIMES" );
	                 
	                 
	             }
	             else if(numFromGuesser==numFromPlayer2){
	                 if(numFromPlayer3<10){
	                     System.out.println("Won : Player 1 and Player 2");
	                     System.out.println("Lose : Player 3 better luck next time.");
	                     count1++;
	                     count2++;
	                     System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 else{
	                     System.out.println("Won : Player 1 and Player 2 ");
	                     System.out.println("Player 3 you have to guess between 0 to 9.");
	                     count1++;
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	             }
	             else if(numFromGuesser==numFromPlayer3){
	                 
	                 if(numFromPlayer2<10){
	                     System.out.println("Won : Player 1 and Player 3");
	                     System.out.println("Lose : Player 2 better luck next time.");
	                     count1++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 else{
	                     System.out.println("Won : Player 1 and Player 3 ");
	                     System.out.println("Player 2 you have to guess between 0 to 9.");
	                     count1++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	             }
	                    else{
	                       if(numFromPlayer2<10 && numFromPlayer3<10){
	                    System.out.println("Won : Player 1 ");
	                      System.out.println("Lose : Player 2 and Player 3 better luck next time.");
	                      count1++;
	                       System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                    else if(numFromPlayer2>10 && numFromPlayer3<10){
	                     System.out.println("Won : Player 1  ");
	                     System.out.println("Lose : Player 2  you have to guess between 0 to 9.");
	                       System.out.println("Lose : Player 3 better luck next time.");
	                       count1++;
	                        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                   else if(numFromPlayer3>10 && numFromPlayer2<10){
	                     System.out.println("Won : Player 1  ");
	                     System.out.println("Lose : Player 3  you have to guess between 0 to 9.");
	                       System.out.println("Lose : Player 2 better luck next time.");
	                       count1++;
	                        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                   else{
	                     System.out.println("Won : Player 1 ");
	                     System.out.println("Lose : Player 2 and Player 3 you have to guess between 0 to 9. ");
	                     count1++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 }
	             
	         }
	           
	             
	        //*****When Player 2 Won IN EVERY CONDITION ********/
	         
	        else if(numFromPlayer2<10 && numFromGuesser ==numFromPlayer2){
	           if(numFromGuesser==numFromPlayer3){
	               if(numFromPlayer1<10){
	                   System.out.println("Won : Player 2  and Player 3");
	                     System.out.println("Lose: Player 1 better luck next time.");
	                     count2++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	               else {
	                   System.out.println("Won : Player 2  and Player 3");
	                     System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	                     count2++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	           
	           }
	              else if(numFromPlayer3<10 && numFromPlayer1<10){
	                    System.out.println("Won : Player 2  ");
	                     System.out.println("Lose: Player 1 and Player 3 better luck next time.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	              }
	               else if(numFromPlayer1>10 && numFromPlayer3<10){
	                   System.out.println("Won : Player 2  ");
	                     System.out.println("Lose:  Player 3 better luck next time.");
	                     System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	                else if(numFromPlayer1<10 && numFromPlayer3>10){
	                   System.out.println("Won : Player 2  ");
	                     System.out.println("Lose:  Player 1 better luck next time.");
	                     System.out.println("Lose: Player 3 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	                else{
	                   System.out.println("Won : Player 2 ");
	                     System.out.println("Lose: Player 1 and Player 3 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	           }
	          
	        //******WHEN PLAYER 3 WON IN EVERY CONDITION****
	else if(numFromPlayer3<10 && numFromGuesser==numFromPlayer3){
	   
	   if(numFromPlayer1<10 && numFromPlayer2<10){
	        System.out.println("Won : Player 3  ");
	        System.out.println("Lose: Player 1 and Player 2 better luck next time.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else if(numFromPlayer1<10  && numFromPlayer2>10){
	        System.out.println("Won : Player 3");
	         System.out.println("Lose:  Player 1 better luck next time.");
	        System.out.println("Lose: Player 2 you have to guess between 0 to 9.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else if(numFromPlayer1>10  && numFromPlayer2<10){
	        System.out.println("Won : Player 3");
	         System.out.println("Lose:  Player 2 better luck next time.");
	        System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else{
	       System.out.println("Won : Player 3");
	       System.out.println("Lose: Player 1 and Player 2 you have to guess between 0 to 9.");
	       count3++;
	        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	}   
	             
	      
	}
	
	          //******WHEN NO ONE PRIDICT RIGHT ANSWER*****  
	   else if(numFromPlayer1<10 || numFromPlayer2<10 || numFromPlayer3<10){
	       if(numFromPlayer1<10 && numFromPlayer2>10 && numFromPlayer3>10){
	           System.out.println("Lose : Player 1 ");
	           System.out.println("Lose: Player 2 and Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer2<10 && numFromPlayer1<10 && numFromPlayer3>10){
	           System.out.println(" Lose : Player 1 and Player 2");
	           System.out.println("Lose: Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       } 
	       else if(numFromPlayer1<10 && numFromPlayer2>10 && numFromPlayer3<10){
	           System.out.println(" Lose : Player 1  and Player 3");
	           System.out.println("Lose: Player 2  you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2<10 && numFromPlayer3>10){
	           System.out.println("Lose : Player 2 ");
	           System.out.println("Lose: Player 1 and Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2<10 && numFromPlayer3<10){
	           System.out.println(" Lose : Player 2 and Player 3 ");
	           System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2>10 && numFromPlayer3<10){
	           System.out.println("Lose :  Player 3 ");
	           System.out.println("Lose: Player 2 and Player 1 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else{
	            System.out.println("Lose: Player1 and Player 2 and Player3.");
	             System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	   }        
	//********All players when guess out of numberArea *********
	else{
	   System.out.println("Lose: Players you have to guess between 0 to 9.");
	    System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	}
	}
    

    //*********When guesser enter out of numberArea **********
	else{
	    System.out.println("guesser please guess between 0 to 9");
	     System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	}
	



System.out.println();
System.out.println();
System.out.println();


	   numFromGuesser=g.guessNum();
	    
	    
System.out.println();
System.out.println();
System.out.println();

	       //***Round 3**********
	       System.out.println("START ROUND : 3");
	    if(numFromGuesser<10){
	        
	        //********Object of Players*****
	        	Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
	    int numFromPlayer1=p1.guessNum();
		int numFromPlayer2=p2.guessNum();
 	    int numFromPlayer3=p3.guessNum();
 	    
 	    //****If one condition true then******
	       if(numFromPlayer1<10 || numFromPlayer2<10 || numFromPlayer3<10){
	           
	            //*****When PLAYER 1 Won******
	         if(numFromPlayer1<10 &&  numFromGuesser ==numFromPlayer1){
	             if (numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser){
	                 System.out.println("All won");
	                 count1++;
	                  count2++;
	                  count3++;
	                 System.out.println(count1+" WON TIMES" );
	                 System.out.println(count2+" WON TIMES" );
	                 System.out.println(count3+" WON TIMES" );
	                 
	                 
	             }
	             else if(numFromGuesser==numFromPlayer2){
	                 if(numFromPlayer3<10){
	                     System.out.println("Won : Player 1 and Player 2");
	                     System.out.println("Lose : Player 3 better luck next time.");
	                     count1++;
	                     count2++;
	                     System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 else{
	                     System.out.println("Won : Player 1 and Player 2 ");
	                     System.out.println("Player 3 you have to guess between 0 to 9.");
	                     count1++;
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	             }
	             else if(numFromGuesser==numFromPlayer3){
	                 
	                 if(numFromPlayer2<10){
	                     System.out.println("Won : Player 1 and Player 3");
	                     System.out.println("Lose : Player 2 better luck next time.");
	                     count1++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 else{
	                     System.out.println("Won : Player 1 and Player 3 ");
	                     System.out.println("Player 2 you have to guess between 0 to 9.");
	                     count1++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	             }
	                    else{
	                       if(numFromPlayer2<10 && numFromPlayer3<10){
	                    System.out.println("Won : Player 1 ");
	                      System.out.println("Lose : Player 2 and Player 3 better luck next time.");
	                      count1++;
	                       System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                    else if(numFromPlayer2>10 && numFromPlayer3<10){
	                     System.out.println("Won : Player 1  ");
	                     System.out.println("Lose : Player 2  you have to guess between 0 to 9.");
	                       System.out.println("Lose : Player 3 better luck next time.");
	                       count1++;
	                        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                   else if(numFromPlayer3>10 && numFromPlayer2<10){
	                     System.out.println("Won : Player 1  ");
	                     System.out.println("Lose : Player 3  you have to guess between 0 to 9.");
	                       System.out.println("Lose : Player 2 better luck next time.");
	                       count1++;
	                        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                   else{
	                     System.out.println("Won : Player 1 ");
	                     System.out.println("Lose : Player 2 and Player 3 you have to guess between 0 to 9. ");
	                     count1++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	                 }
	                 }
	             
	         }
	           
	             
	        //*****When Player 2 Won IN EVERY CONDITION ********/
	         
	        else if(numFromPlayer2<10 && numFromGuesser ==numFromPlayer2){
	           if(numFromGuesser==numFromPlayer3){
	               if(numFromPlayer1<10){
	                   System.out.println("Won : Player 2  and Player 3");
	                     System.out.println("Lose: Player 1 better luck next time.");
	                     count2++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	               else {
	                   System.out.println("Won : Player 2  and Player 3");
	                     System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	                     count2++;
	                     count3++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	           
	           }
	              else if(numFromPlayer3<10 && numFromPlayer1<10){
	                    System.out.println("Won : Player 2  ");
	                     System.out.println("Lose: Player 1 and Player 3 better luck next time.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	              }
	               else if(numFromPlayer1>10 && numFromPlayer3<10){
	                   System.out.println("Won : Player 2  ");
	                     System.out.println("Lose:  Player 3 better luck next time.");
	                     System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	                else if(numFromPlayer1<10 && numFromPlayer3>10){
	                   System.out.println("Won : Player 2  ");
	                     System.out.println("Lose:  Player 1 better luck next time.");
	                     System.out.println("Lose: Player 3 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	                else{
	                   System.out.println("Won : Player 2 ");
	                     System.out.println("Lose: Player 1 and Player 3 you have to guess between 0 to 9.");
	                     count2++;
	                      System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	               }
	           }
	            
	            
	         

	        //******WHEN PLAYER 3 WON IN EVERY CONDITION****
	else if(numFromPlayer3<10 && numFromGuesser==numFromPlayer3){
	   
	   if(numFromPlayer1<10 && numFromPlayer2<10){
	        System.out.println("Won : Player 3  ");
	        System.out.println("Lose: Player 1 and Player 2 better luck next time.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else if(numFromPlayer1<10  && numFromPlayer2>10){
	        System.out.println("Won : Player 3");
	         System.out.println("Lose:  Player 1 better luck next time.");
	        System.out.println("Lose: Player 2 you have to guess between 0 to 9.");
	        count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else if(numFromPlayer1>10  && numFromPlayer2<10){
	        System.out.println("Won : Player 3");
	         System.out.println("Lose:  Player 2 better luck next time.");
	        System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	         count3++;
	         System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	   else{
	       System.out.println("Won : Player 3");
	       System.out.println("Lose: Player 1 and Player 2 you have to guess between 0 to 9.");
	       count3++;
	        System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	   }
	}   
	             
	      
	}
	
	          //******WHEN NO ONE PRIDICT RIGHT ANSWER*****  
	   else if(numFromPlayer1<10 || numFromPlayer2<10 || numFromPlayer3<10){
	       if(numFromPlayer1<10 && numFromPlayer2>10 && numFromPlayer3>10){
	           System.out.println("Lose : Player 1 ");
	           System.out.println("Lose: Player 2 and Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer2<10 && numFromPlayer1<10 && numFromPlayer3>10){
	           System.out.println(" Lose : Player 1 and Player 2");
	           System.out.println("Lose: Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       } 
	       else if(numFromPlayer1<10 && numFromPlayer2>10 && numFromPlayer3<10){
	           System.out.println(" Lose : Player 1  and Player 3");
	           System.out.println("Lose: Player 2  you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2<10 && numFromPlayer3>10){
	           System.out.println("Lose : Player 2 ");
	           System.out.println("Lose: Player 1 and Player 3 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2<10 && numFromPlayer3<10){
	           System.out.println(" Lose : Player 2 and Player 3 ");
	           System.out.println("Lose: Player 1 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else if(numFromPlayer1>10 && numFromPlayer2>10 && numFromPlayer3<10){
	           System.out.println("Lose :  Player 3 ");
	           System.out.println("Lose: Player 2 and Player 1 you have to guess between 0 to 9.");
	            System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	       else{
	            System.out.println("Lose: Player1 and Player 2 and Player3.");
	             System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	       }
	   }        
	
	//********All players when guess out of numberArea *********
	else{
	   System.out.println("Lose: Players you have to guess between 0 to 9.");
	    System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	}
	}
    

    //*********When guesser enter out of numberArea **********
	else{
	    System.out.println("guesser please guess between 0 to 9");
	     System.out.println(count1+" WON TIMES" );
	                     System.out.println(count2+" WON TIMES" );
	                     System.out.println(count3+" WON TIMES" );
	}
	




System.out.println();
System.out.println();
System.out.println();


//**For count the final Result ************************


if(count1>count2 && count1>count3){
    System.out.println("Final Result : Player 1 Won the Game...");
}
else if (count2>count3 && count2>count1){
    System.out.println("Final Result : Player 2 Won the Game...");
}
else if (count3>count2 && count3>count1){
    System.out.println("Final Result : Player 3 Won the Game...");
}
else if(count1==count2 && count1>count3){
    System.out.println("Final Result : (TIE MATCH) Player 1 and Player 2 ");
}
else if(count1==count3 && count1>count2){
    System.out.println("Final Result : (TIE MATCH) Player 1 and Player 3 ");
}
else if(count2==count3 && count2>count1){
    System.out.println("Final Result :  (TIE MATCH) Player 2 and Player 3 ");
}
else if(count1==count2 && count1==count3 && count1>0){
    System.out.println("Final Result : (TIE MATCH) Player 1 and Player 2 and Player 3 ");
}
else{
     System.out.println("Final Result :  All Lose ");
}





	}
	

}



   //****Main class******
public class LaunchGame {
    
    //****Main Method ********

	public static void main(String[] args) {
		
		//***** Umpire Object ******
			Umpire u=new Umpire();
			
			//**call Umpire Method *********
			  u.compare();
		    
			
	}

}