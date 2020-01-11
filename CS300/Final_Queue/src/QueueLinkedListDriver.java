import java.util.Scanner;

public class QueueLinkedListDriver {

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
    QueueLinkedList<Integer> myQueue = new QueueLinkedList<Integer>();
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
            System.out.println(myQueue.peek());
            break;
          } catch (IllegalArgumentException e) {
            System.err.println("Error: queue is empty");
            break;
          }
        case 'E':
          myQueue.enqueue(userInputInt);
          break;
        case 'D':
          try {
            myQueue.dequeue();
            break;
          } catch (IllegalArgumentException e) {
            System.err.println("Error: queue is empty");
            break;
          }
        case 'S':
          System.err.println(myQueue);
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
