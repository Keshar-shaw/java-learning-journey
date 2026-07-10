import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the subject1 marks:");
            int math = sc.nextInt();
            System.out.println("Enter the subject2 marks:");
            int physics =sc.nextInt();
            System.out.println("Enter the subject3 marks:");
            int chem = sc.nextInt();
            System.out.println("Enter the subject4 marks:");
            int bio = sc.nextInt();
            System.out.println("Enter the subject5 marks:");
            int language= sc.nextInt();
            double Persentage=((subject1+subject2+subject3+subject4+subject5)/500.0)*100;

            System.out.println("subject1=" +math);
            System.out.println("subject2=" +physics);
            System.out.println("subject3=" +chem);
            System.out.println("subject4" +bio);
            System.out.println("subject5=" +language);
            System.out.print("the persentage is: ");
            System.out.println(Persentage);

    }
}
