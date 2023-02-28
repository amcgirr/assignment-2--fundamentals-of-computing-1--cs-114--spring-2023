import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer");
    int num = input.nextInt();

    if(num % 2 == 1) {
      for(int row = 0; row < num; row++) {
        for(int col = 0; col < Math.abs(row - (num / 2)); col++){
          System.out.print(" ");
        }
        for(int col = 0; col < (-1 * (Math.abs(2 * (row - (num / 2))))) + (num -1); col++) {
          System.out.print("*");
        }
        System.out.println("*");
      }
    } else {
      for(int i = 0; i < (num - 1); i++){
        System.out.print(" ");
      }
      System.out.println("*");
      for(int row = 1; row < num; row++) {
        for(int col = 0; col < Math.abs(row - (num / 2)); col++){
          System.out.print("  ");
        }
        for(int col = 0; col < (-1 * (Math.abs(2 * (row - (num / 2))))) + (num -1); col++) {
          System.out.print("* ");
        }
        System.out.println("*");
      }
      for(int i = 0; i < (num - 1); i++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
    input.close();
    }

  }

