import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Advisor advisor = new DayAdvisor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть день тижня англійською (наприклад, MONDAY, FRIDAY, SUNDAY):");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            Day day = Day.valueOf(input);
            advisor.advise(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: некоректний день тижня. Перевірте правильність написання.");
        } finally {
            scanner.close();
        }
    }
}
