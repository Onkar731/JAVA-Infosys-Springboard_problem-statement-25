import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        char performanceIndex = sc.next().charAt(0);

        // finding bouns according to given performance index
        // using performanceBonus() method of EmployeeBonus class
        System.out.println(EmployeeBonus.performancedBouns(performanceIndex));

        // closing resource
        sc.close();
    }
}
