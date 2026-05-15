// 21)“Treasure Hunt Adventure” (Story-Based Game):- 
import java.util.Scanner;
class AdventureGame{
    public static void main (String [] Atul){
        Scanner obj = new Scanner(System.in);

        System.out.println("===== TREASURE HUNT GAME ====="); 
        System.out.println("You are at the starting point..."); 
        System.out.println("1. Enter Forest"); 
        System.out.println("2. Enter Cave"); 
        System.out.print("Choose your path: ");

        int choice1 = obj.nextInt();

        switch (choice1) {
        // FOREST PATH 
        case 1: 
            System.out.println("\nYou entered the forest..."); 
            System.out.println("1. Climb a Tree"); 
            System.out.println("2. Follow the River"); 
            System.out.print("Your choice: ");

            int choice2 = obj.nextInt(); 

            switch (choice2) {
            case 1: 
                System.out.println("\nYou climbed the tree..."); 
                System.out.println("You found a hidden treasure!  YOU WIN!"); 
                break;

            case 2: 
                System.out.println("\nYou followed the river..."); 
                System.out.println("A crocodile attacked you!  GAME OVER!"); 
                break; 
            default: 
                System.out.println("Invalid choice!"); 
            } 
                break;

                //  CAVE PATH 

        case 2: 
            System.out.println("\nYou entered the cave..."); 
            System.out.println("1. Light a Torch"); 
            System.out.println("2. Walk in Darkness"); 
            System.out.print("Your choice: "); 
            int choice3 = obj.nextInt();

            switch (choice3) { 
            case 1: 
                System.out.println("\nTorch is lit..."); 
                System.out.println("You scared away a monster and found treasure!  YOU WIN!"); 
                break; 

            case 2: 
                System.out.println("\nWalking in darkness..."); 
                System.out.println("You fell into a pit! GAME OVER!"); 
                break; 

            default: 
                System.out.println("Invalid choice!"); 
                } 
                break;

        default: 
             System.out.println("Invalid starting choice!"); 
        } 

        obj.close();

    }

}