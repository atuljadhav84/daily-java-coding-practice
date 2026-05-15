
// 22) College Day Adventure
import java.util.Scanner;

class CollegeDayAdventure {
    public static void main (String [] Atul){
        Scanner obj = new Scanner(System.in);
        System.out.println("===== COLLEGE DAY GAME ====="); 
        System.out.println("You reached college..."); 
        System.out.println("1. Go to Class"); 
        System.out.println("2. Go to Canteen"); 
        System.out.print("Choose: "); 

        int choice1 = obj.nextInt();

        switch (choice1) { 
        //  CLASS PATH 
            case 1: 
                System.out.println("\nYou entered the classroom..."); 
                System.out.println("1. Listen to Lecture"); 
                System.out.println("2. Sleep in Class"); 
                System.out.print("Choose: "); 
                 
                int choice2 = obj.nextInt();

                switch (choice2) { 
                    case 1: 
                        System.out.println("\nYou learned new concepts!"); 
                        System.out.println(" SUCCESS: Productive Day!"); 
                        break; 

                    case 2: 
                        System.out.println("\nYou slept..."); 
                        System.out.println(" Teacher caught you!"); 
                        System.out.println(" RESULT: Bad Day!"); 
                        break; 

                    default: 
                        System.out.println("Invalid choice"); 
                        } 
                        break;

                //  CANTEEN PATH 
            case 2: 
                System.out.println("\nYou went to canteen..."); 
                System.out.println("1. Eat Food"); 
                System.out.println("2. Skip Food"); 
                System.out.print("Choose: ");

                int choice3 = obj.nextInt();

                switch (choice3) { 
                    case 1: 
                        System.out.println("\nFood was good!"); 
                        System.out.println(" RESULT: Chill Day!"); 
                        break; 
                    case 2: 
                        System.out.println("\nYou stayed hungry..."); 
                        System.out.println(" RESULT: Regret Later!"); 
                        break; 
                    default: 
                        System.out.println("Invalid choice"); 
                        break; 
                }

            default: 
            System.out.println("Invalid starting choice"); 
            }
            obj.close();
            
    }
}
    

