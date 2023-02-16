import java.nio.CharBuffer;

public class EmployeeBonus {
    public static int performancedBouns(char performance) {
        int bonus = 0;

        if(performance == 'A') {
            bonus = 5000;
        } else if(performance == 'B') {
            bonus = 4500;
        } else if(performance == 'C') {
            bonus = 3000;
        } else if(performance == 'D') {
            bonus = 1500;
        } else {
            bonus = 500;
        }

        return bonus;
    }
}