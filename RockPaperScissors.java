import java.util.Scanner;
class Main {
    // Returns either "rock", "paper" or "scissors" by computer
    String GetComputerChoice(){

        String computerChoice;
        //get a random integer from 1 to 3;
        int RandomNumber=(int)(Math.random() * 3) + 1;

        if(RandomNumber==1) computerChoice="rock";
        else if(RandomNumber==2) computerChoice="paper";
        else computerChoice="scissors";

        return computerChoice;
    }
    // Returns user input choices "rock", "paper" or "scissors"
        String getUserInput(){
        Scanner input = new Scanner (System.in);
        //user input
        System.out.println("Enter rock, paper or scissors");
        String userInput=input.nextLine();
        //converting into the lower case
        userInput=userInput.toLowerCase();
        input.close();
        return userInput;
        
    }
    //return either "Win", "loss" or "Draw"

    String getResult(String userInput,String computerChoice){

        //condition for user to draw
        if(userInput.equals(computerChoice)) return "It's Draw !!";

        //Condition for user to Win
        else if(userInput.equals("paper") && computerChoice.equals("rock")) return "you win !!";

        else if (userInput.equals("rock") && computerChoice.equals("scissors")) return "you win !!";

        else if (userInput.equals("scissors") && computerChoice.equals("paper")) return "you win !!";

        //All other conditions result in the user losing;
        else return "you loss !!";
    }
    public static void main(String args[]){

        //creating object for main class
        Main obj = new Main ();
        //Get users input
        String userInput = obj.getUserInput();
        System.out.println(userInput);
        //Get computers choice
        String computerChoice= obj.GetComputerChoice();
        //Get results
        String  result = obj.getResult(userInput,computerChoice);

        System.out.println("User Input: " + userInput);
        System.out.println("Computer Choice: " + computerChoice);
        System.out.println(result);    
    }

}