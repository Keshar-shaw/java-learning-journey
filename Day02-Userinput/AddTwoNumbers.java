import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Digit:");
        int a = sc.nextInt();
        System.out.println("Enter Second Digit:");
        int b = sc.nextInt();
        int sum = a+ b;
        System.out.print("The sum of these number is:");
        System.out.println(sum);

}
}
