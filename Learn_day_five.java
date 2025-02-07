public class Learn_day_five {
    public static void main(String[] args){
        String first_name = "Danil";
        String last_name = "Chernaev";
        System.out.println("is name \"" + first_name + "\" \f \"" + last_name + "\"");
        double root = Math.sqrt(64);
        int rootint = (int) root;
        System.out.println(rootint);
        int min_number = Math.min(1, 2);
        int max_number = Math.max(1,2);
        System.out.println("min: " + min_number + "\n max: " + max_number);
        double random_number = Math.random() * 101;
        int random_numberint = (int) random_number;
        String progres = "%";
        System.out.println("Your progres is: " + random_numberint + progres);
        System.out.println(random_numberint == 93);
        int my_age = 15;
        int voge_age = 18;
        System.out.println(my_age >= voge_age);
    }
}
