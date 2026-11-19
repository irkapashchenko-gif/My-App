public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада для продуктивності: складіть список пріоритетних завдань на день, вимкніть зайві сповіщення та робіть короткі перерви кожні 50 хвилин.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендація на вихідні: відвідайте місцевий ботанічний сад, затишну кав'ярню в центрі міста або сходіть у музей.");
                break;
        }
    }
}
