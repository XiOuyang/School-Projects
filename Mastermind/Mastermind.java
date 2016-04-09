import java.util.*;
public class Mastermind {

    
    public static void main(String[] args) {
        System.out.println("Welcome to MASTERMIND.");
        System.out.println("I'm thinking of a 4 digit code");
        //intialize variables
        int match = 0;
        int close = 0;
        //Generates random code
        Random randomNumGen = new Random();    
        int numCode = randomNumGen.nextInt(8999)+1000;
        //converts it to String
        String code = String.valueOf(numCode);
        
            while(match !=4){
                
                     //prints out random number for debugging purposes
                     Scanner scan = new Scanner(System.in);
                     //prompts user for guess
                     System.out.println("What is your guess?");
                     String guess = scan.nextLine();
                    //initialize String buffers in order to change into X
                    StringBuffer Code = new StringBuffer(code);
                    StringBuffer Guess = new StringBuffer(guess);
                    //resets match and close each time
                    match = 0;
                    close = 0;
                    //if user inputs '*' will output secret code
                    if(guess.equals("*") ){
                    System.out.printf("Cheater! The code is %s\n",code );
                    }
                    //checks specific value at each position using double for loop
                    else {
                        for( int i = 0; i < Code.length(); ++i){
                                //loops through secret code to check for matches
                                if(Code.charAt(i)== Guess.charAt(i)){ //checks value
                                         match++;
                                         //if a 'match' is implemented, change values at those positions
                                         
                                         Code.setCharAt(i,'X');
                                         Guess.setCharAt(i,'X');
                                }
                            
                                        //loops through user input to check for close
                                        else{
                                          for(int j = 0; j < Guess.length(); ++j){
                                                if(Code.charAt(i)== Guess.charAt(j)){ 
                                            close++; 
                                            //break to make sure overflow of close does not happen
                                            break;
                                                 }       
                                          }
                               
                               
                        
                                        }
                        }                     
            
              
               
            
                    
                     System.out.printf("Match: %d Close: %d\n", match, close);
                     System.out.printf("Updated Guess is: %s\n",Guess );
                        if(match == 4){
                     System.out.print("YOU GOT IT!\n");
                
                        }
  

                    }       
    
                
            }
    }
}

