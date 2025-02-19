public class Learn_day_eight {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        for (int i = 1; i <= 10; i++) {
            // Внутренний цикл: для каждого i перебираем числа от 1 до 10
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t"); // Выводим результат умножения
            }
            System.out.println(); // Переход на новую строку после завершения внутреннего цикла
        }
    }
}
