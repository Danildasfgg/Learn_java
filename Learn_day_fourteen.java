import java.util.Scanner;

public class Learn_day_fourteen {
    static void ageAndName(String name, int age){
        if (age < 18){
            System.out.println("мелкий");
        } else {
            System.out.println("старый");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        ageAndName(name, age);
    }
}
