import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you like Java? (true/false): ");
        boolean likesJava = sc.nextBoolean();

        System.out.println("Your answer: " + likesJava);
    }
}
