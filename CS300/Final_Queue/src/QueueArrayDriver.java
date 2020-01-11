import java.util.Scanner;

public class QueueArrayDriver {
  
  private static void printMenu() {
    System.out.print("\nCOMMAND MENU:\n"
        + " [A] peek\n"
        + " [E <int>] enqueue\n"
        + " [D] dequeue\n"
        + " [S] print queue\n"
        + " [Q]uit the application\n\n" + "ENTER COMMAND: ");
  }

  public static void main(String[] args) {
    // Define final parameters
    Scanner scnr = new Scanner(System.in);
    String userInput;
    char userInputCommand;
    int userInputInt = 0;
    QueueArray myQueueArray = new QueueArray(5);
    boolean done = false;

    do {
      printMenu();

      // read and parse user input; assume valid user input
      userInput = scnr.nextLine();
      userInput = userInput.toUpperCase();
      userInput = userInput.replace(" ", "");
      userInputCommand = userInput.charAt(0);
      if (userInput.length() > 1) {
        userInputInt = Integer.parseInt(userInput.substring(1));
      }

      switch (userInputCommand) {
        case 'A':
          try {
            System.out.println(myQueueArray.peek());
            break;
          } catch (IllegalArgumentException e) {
            System.err.println("Error: queue is empty");
            break;
          }
        case 'E':
          try {
            myQueueArray.enqueue(userInputInt);
            break;
          } catch (IllegalStateException e) {
            System.err.println("Error: queue is full");
            break;
          }
        case 'D':
          try {
            myQueueArray.dequeue();
            break;
          } catch (IllegalArgumentException e) {
            System.err.println("Error: queue is empty");
            break;
          }
        case 'S':
          System.err.println(myQueueArray);
          break;
        case 'Q': // quit
          done = true;
          break;
        default: // assume valid user input, not putting anything here
          break;
      }

    } while (!done);
  }
}
