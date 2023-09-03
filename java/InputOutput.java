import java.util.Scanner;

public class InputOutput {
  public static void main(String args[]) {
    // Instansiasi objek scanner
    Scanner sc = new Scanner(System.in);

    // Input dengan objek scanner
    String name = sc.nextLine();
    int age = Integer.parseInt(sc.nextLine());

    // Output dengan System.out
    System.out.println("\nThy shall know i as " + name);
    System.out.println("for i am " + age + " years old.");

    // Menutup objek scanner supaya tidak terjadi memory leak
    sc.close();
  }
}
