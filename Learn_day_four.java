import java.util.Locale;

public class Learn_day_four {
    public static void main(String[] args) {
        //Calculating the number of characters
        String text = "I am learning java";
        System.out.println(text.length());
        System.out.println(text.toUpperCase(Locale.ROOT));
        System.out.println(text.toLowerCase());
        //Search world or symbol
        System.out.println(text.indexOf("java"));
        //Collecting my initials
        String first_name = "Danil";
        String last_name = "Chernaev";
        System.out.println(first_name + " " + last_name);
        System.out.println(first_name.toUpperCase(Locale.ROOT) + " " + last_name.toUpperCase());
        System.out.println(first_name.concat(last_name));
        
    }
}
