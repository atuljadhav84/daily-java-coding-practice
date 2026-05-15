
// 23) Job Interview Day 
import java.util.Scanner;

class JobInterviewDay {
    public static void main(String[] Atul) {
        Scanner obj = new Scanner(System.in);
        int choice1 = obj.nextInt();

        switch (choice1) {
            // PREPARED PATH
            case 1:
                System.out.println("\nYou decided to prepare...");
                System.out.println("1. Revise Topics");
                System.out.println("2. Skip Revision");
                System.out.print("Choose: ");

                int choice2 = obj.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("\nYou revised all topics...");
                        System.out.println("1. Stay Confident");
                        System.out.println("2. Get Nervous");
                        System.out.print("Choose: ");

                        int choice3 = obj.nextInt();

                        switch (choice3) {
                            case 1:
                                System.out.println("\nYou answered confidently!");
                                System.out.println(" SUCCESS: You got the job!");
                                break;
                            case 2:
                                System.out.println("\nYou got nervous...");
                                System.out.println(" RESULT: Interview Failed!");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;

                    case 2:
                        System.out.println("\nYou skipped revision...");
                        System.out.println("You couldn't answer properly.");
                        System.out.println(" RESULT: Interview Failed!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            // NO PREPARATION PATH
            case 2:
                System.out.println("\nYou went without preparation...");
                System.out.println("1. Try Anyway");
                System.out.println("2. Cancel Interview");
                System.out.print("Choose: ");

                int choice4 = obj.nextInt();

                switch (choice4) {
                    case 1:
                        System.out.println("\nInterview started...");
                        System.out.println("1. Easy Questions");
                        System.out.println("2. Hard Questions");
                        System.out.print("Choose: ");

                        int choice5 = obj.nextInt();
                        switch (choice5) {
                            case 1:
                                System.out.println("\nQuestions were easy!");
                                System.out.println(" LUCKY: You got selected!");
                                break;

                            case 2:
                                System.out.println("\nQuestions were difficult...");
                                System.out.println(" RESULT: Interview Failed!");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;

                    case 2:
                        System.out.println("\nYou canceled the interview...");
                        System.out.println(" RESULT: Missed Opportunity!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;

            default:
                System.out.println("Invalid starting choice");
        }
        obj.close();

    }

}
