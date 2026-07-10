import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
                System.out.println("to convert meter to kilometer");
                System.out.println("enter a no(meter):");
                Scanner sc= new Scanner(System.in);
                float meter= sc.nextFloat();
             float kilometer = meter*100000;
                System.out.print("converted no in kilometer is:" +kilometer);
        }
}
