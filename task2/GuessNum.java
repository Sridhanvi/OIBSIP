import java.util.Random;
import java.util.*;
public class GuessNum {
     public static void guessingNum() {
     Scanner rn=new Scanner(System.in);
     Random random = new Random();
     int original_num = random.nextInt(100);
     original_num+=1;
     int yourGuess,playAgain;
     int no_attempt=0,pnts=0;    
     System.out.println("\nWELCOME TO  NUMBER GUESSING GAME!");
     while( no_attempt<5 ){
          System.out.println("\nGuess the Number: ");
          yourGuess=rn.nextInt();
          if(yourGuess>original_num) {
             System.out.println("\nThe original number is less than "+yourGuess);
             }
          else if(yourGuess<original_num) {
             System.out.println("\nThe original number is greater than "+yourGuess);
             }
          else {
             pnts+=200-25*(no_attempt);
             System.out.println("\nYour guess is correct!!");
             System.out.println("\nThe number is "+yourGuess);
             System.out.println("\nYour score: "+pnts);
             System.out.println("\nif you want to play again press 1 ");
         playAgain=rn.nextInt();
         
         if(playAgain==1) {
        guessingNum();
        }
         
         else {
        System.out.println("\nThank you!!");
         break;
         }  
    }
 no_attempt+=1;
 }
     if(no_attempt==5) {
          pnts=0;
          System.out.println("\nYour score: "+pnts);
          System.out.println("\nThe original number is "+original_num);
          System.out.println("\nDo you want to play again? if Yes press 1 else press 2!");
          playAgain=rn.nextInt();
          if(playAgain==1) {
                guessingNum();
             }
          else {
               System.out.println("Thank You!!");
            }
         }
          rn.close();
     }
      public static void main(String args[]) {
          guessingNum();
      }
}