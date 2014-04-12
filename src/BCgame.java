import java.util.Random;
import java.util.Scanner;

public class BCgame{
    public static void main(String[] args){
        Random r= new Random();
        int number= 0;
        int trynum = 0;
        while(uniq(number= (r.nextInt(9000) + 1000)));
        String targetStr = number +"";
        boolean game = true;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println(number);
            int bulls = 0;
            int cows = 0;
            System.out.print("Guess a number: ");
            int guess;
            guess = input.nextInt();
            if (uniq(guess)  || guess < 1000) continue;
            trynum++;
            String guessStr = guess + "";
            for(int i= 0;i < 4;i++){
                if(guessStr.charAt(i) == targetStr.charAt(i)){
                    bulls++;
                }else if(targetStr.contains(guessStr.charAt(i)+"")){
                    cows++;
                }
            }
            if(bulls == 4){
                game = false;
            }else{
                System.out.println(cows+" Cows and "+bulls+" Bulls.");
            }
        }while(game);
        System.out.println("You won after "+trynum+" guesses!");
    }

    public static boolean uniq(int num){
        String checknum = num+"";
        if(checknum.charAt(1) == checknum.charAt(2)) return false;
            else if(checknum.charAt(2) == checknum.charAt(3)) return false;
                else if(checknum.charAt(3) == checknum.charAt(4)) return false;
    return true;
    };
}