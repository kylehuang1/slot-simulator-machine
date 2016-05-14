package slot;


	import java.util.Random;
import java.util.Scanner;
	/**
	* This class simulates a slot machine.
	*/
	public class SlotMachine
	{
	   /**
	    * This is the main method.
	    * 
	    * @param args
	    */
	   public static void main(String[] args)
	   {
	       Scanner keyboard = new Scanner(System.in);
	       Random random = new Random();
	       String cont = "n";
	 
	       int coin = 0;
	       int totalEntered = 0;
	       /*yet to be complete
	        */
	       int a;
	       int b;
	       int c;
	       int n;
	       int amountWon = 0;
	       /*yet to be complete
	        */
	       int dubs = coin * 2;
	       int trips = coin * 4;

	       while (cont.equals("n"))
	       {
	           a = random.nextInt(6);
	           b = random.nextInt(6);
	           c = random.nextInt(6);
	           n = random.nextInt(991) +10;
	           totalEntered += coin;
	           System.out.println("Welcome to Slots (Test Your Luck!!!)");
	           System.out.println("Two in a row =2x the amount you put in, 3 of a kind = 3x the amountd put in, 3 cherries in a row = Jackpot ");
	           System.out.println("Currently Only accepting whole dollar bills Input your money amount and press enter. Press any letter to terminate. ");
	           System.out.println("Enter your ammount twice to confirm for your first draw, otherwise your second number will be the inputed number ");
	           coin = keyboard.nextInt();
	           int x, d;
        	   Scanner in = new Scanner(System.in);
        	      x = in.nextInt();
	           

	           switch (a) 
	           {
	           case 0:
            	   System.out.println(" ________");
            	   System.out.println("|        |");
                   System.out.println("| Cherry |");
                   System.out.println("|________|");
                   break;
               case 1:
            	   System.out.println(" ________");
            	   System.out.println("|        |");
                   System.out.println("| Orange |");
                   System.out.println("|________|");
                   break;
               case 2:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|  Plum  |");
                   System.out.println("|________|");
                   break;
               case 3:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|  Bell  |");
                   System.out.println("|________|");
                   break;
               case 4:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|  Melon |");
                   System.out.println("|________|");
                   break;
               default:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|   Bar  |");
                   System.out.println("|________|");
	           }

	           switch (b) 
	           {
	           case 0:
            	   System.out.println(" ________");
            	   System.out.println("|        |");
                   System.out.println("| Cherry |");
                   System.out.println("|________|");
                   break;
               case 1:
            	   System.out.println(" ________");
            	   System.out.println("|        |");
                   System.out.println("| Orange |");
                   System.out.println("|________|");
                   break;
               case 2:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|  Plum  |");
                   System.out.println("|________|");
                   break;
               case 3:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|  Bell  |");
                   System.out.println("|________|");
                   break;
               case 4:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|  Melon |");
                   System.out.println("|________|");
                   break;
               default:
                   System.out.println(" ________");
                   System.out.println("|        |");
                   System.out.println("|   Bar  |");
                   System.out.println("|________|");
	           }

	           switch (c) 
	           {
	               case 0:
	            	   System.out.println(" ________");
	            	   System.out.println("|        |");
	                   System.out.println("| Cherry |");
	                   System.out.println("|________|");
	                   break;
	               case 1:
	            	   System.out.println(" ________");
	            	   System.out.println("|        |");
	                   System.out.println("| Orange |");
	                   System.out.println("|________|");
	                   break;
	               case 2:
	                   System.out.println(" ________");
	                   System.out.println("|        |");
	                   System.out.println("|  Plum  |");
	                   System.out.println("|________|");
	                   break;
	               case 3:
	                   System.out.println(" ________");
	                   System.out.println("|        |");
	                   System.out.println("|  Bell  |");
	                   System.out.println("|________|");
	                   break;
	               case 4:
	                   System.out.println(" ________");
	                   System.out.println("|        |");
	                   System.out.println("|  Melon |");
	                   System.out.println("|________|");
	                   break;
	               default:
	                   System.out.println(" ________");
	                   System.out.println("|        |");
	                   System.out.println("|   Bar  |");
	                   System.out.println("|________|");
	                   
	                 
	           }

	           if (a != b && a != c && b != c)
	           {
	        
	        	      
	        	   
	              
	        	  
	               System.out.println("Sorry!You have lost your money. - $"+x+"times");
	               for ( d = -1 ; d <= -1 ; d++ )
	                	  System.out.println(x+"*"+d+" = "+(x*d));
	           }
	           else if (a == b || a == c || b == c)
	           {
	        	   
	        	   
	        	      
	        	     
	        	      
	               System.out.println("Congratulations, you have won $"+x+"times");
	                  amountWon += dubs; 
	                  for ( d = 2 ; d <= 2 ; d++ )
	                	  System.out.println(x+"*"+d+" = "+(x*d));
	        	  
	           }
	           else if (a == b && a == c && a != 0)
	           {
	        	  
	        	      
	        	 
	             
	        	  
	               System.out.println("Congratulations, you have won 3$"+x+"times" + trips);
	                  amountWon += trips;
	                  for ( d = 3 ; d <= 3 ; d++ )
	                	  System.out.println(x+"*"+d+" = "+(x*d));
	           }
	           else if (a == 0 && b == 0 && c == 0)
	           {
	        	   
	        	      
	               System.out.println("Congratulations! You have won the jackpot of $"+x+"times" 
	                   + (coin * n));
	               for ( d = 20 ; d <= 20 ; d++ )
	                	  System.out.println(x+"*"+d+" = "+(x*d));
	           }

	           System.out.println("Continue? y/n Type any number if yes ");
	           cont = keyboard.nextLine();
	         coin = keyboard.nextInt();
		      
		           cont = keyboard.nextLine();
		           while (true){
		        	     {
		 		           a = random.nextInt(6);
				           b = random.nextInt(6);
				           c = random.nextInt(6);
				           n = random.nextInt(991) +10;
				           totalEntered += coin;
				           System.out.println("How much would you like to bet?  Enter any letter to terminate");
				           coin = keyboard.nextInt();
				           int y, e;
			        	   
			        	      y = in.nextInt();
				           switch (a) 
				           {
				           case 0:
			            	   System.out.println(" ________");
			            	   System.out.println("|        |");
			                   System.out.println("| Cherry |");
			                   System.out.println("|________|");
			                   break;
			               case 1:
			            	   System.out.println(" ________");
			            	   System.out.println("|        |");
			                   System.out.println("| Orange |");
			                   System.out.println("|________|");
			                   break;
			               case 2:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Plum  |");
			                   System.out.println("|________|");
			                   break;
			               case 3:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Bell  |");
			                   System.out.println("|________|");
			                   break;
			               case 4:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Melon |");
			                   System.out.println("|________|");
			                   break;
			               default:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|   Bar  |");
			                   System.out.println("|________|");
				           }

				           switch (b) 
				           {
				           case 0:
			            	   System.out.println(" ________");
			            	   System.out.println("|        |");
			                   System.out.println("| Cherry |");
			                   System.out.println("|________|");
			                   break;
			               case 1:
			            	   System.out.println(" ________");
			            	   System.out.println("|        |");
			                   System.out.println("| Orange |");
			                   System.out.println("|________|");
			                   break;
			               case 2:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Plum  |");
			                   System.out.println("|________|");
			                   break;
			               case 3:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Bell  |");
			                   System.out.println("|________|");
			                   break;
			               case 4:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Melon |");
			                   System.out.println("|________|");
			                   break;
			               default:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|   Bar  |");
			                   System.out.println("|________|");
				           }

				           switch (c) 
				           {
				           case 0:
			            	   System.out.println(" ________");
			            	   System.out.println("|        |");
			                   System.out.println("| Cherry |");
			                   System.out.println("|________|");
			                   break;
			               case 1:
			            	   System.out.println(" ________");
			            	   System.out.println("|        |");
			                   System.out.println("| Orange |");
			                   System.out.println("|________|");
			                   break;
			               case 2:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Plum  |");
			                   System.out.println("|________|");
			                   break;
			               case 3:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Bell  |");
			                   System.out.println("|________|");
			                   break;
			               case 4:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|  Melon |");
			                   System.out.println("|________|");
			                   break;
			               default:
			                   System.out.println(" ________");
			                   System.out.println("|        |");
			                   System.out.println("|   Bar  |");
			                   System.out.println("|________|");
				           }

				           if (a != b && a != c && b != c)
				           {
				        	   
				        	      
				        	   
				              
				        	  
				               System.out.println("Sorry!You have lost your money. - $"+x+"times");
				               for ( e = -1 ; e <= -1 ; e++ )
				                	  System.out.println(y+"*"+e+" = "+(y*e));
				           }
				           else if (a == b || a == c || b == c)
				           {
				        	   
				        	   
				        	      
				        	     
				        	      
				               System.out.println("Congratulations, you have won $"+x+"times");
				                  amountWon += dubs; 
				                  for ( e = 2 ; e <= 2 ; e++ )
				                	  System.out.println(y+"*"+e+" = "+(y*e));
				        	  
				           }
				           else if (a == b && a == c && a != 0)
				           {
				        	   
				        	 
				             
				        	  
				               System.out.println("Congratulations, you have won 3$"+x+"times" + trips);
				                  amountWon += trips;
				                  for ( e = 3 ; e <= 3 ; e++ )
				                	  System.out.println(y+"*"+e+" = "+(y*e));
				           }
				           else if (a ==0 && b == 0 && c == 0)
				           {
				        	   
				        	      
				               System.out.println("Congratulations! You have won the jackpot of $"+x+"times" 
				                   + (coin * n));
				               for ( e = 20 ; e <= 20 ; e++ )
				                	  System.out.println(y+"*"+e+" = "+(y*e));
				           }

				           System.out.println("Continue? y/n  Enter any number and enter to continue ");
				           cont = keyboard.nextLine();
					         coin = keyboard.nextInt();
						      
						           cont = keyboard.nextLine();
						           /*will later add in pop outs and colored slots that are animated
						            * 
						            */
		        	}
					
				
						
	       }
	   }
	
	}
	}
	

	 

