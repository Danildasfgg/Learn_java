public class Learn_day_seven {
    public static void main(String[] args) {
            int time = 15;
            if(time < 10){
                System.out.println("Good morning");
            } else if(time == 12){
                System.out.println("Good day");
            } else {
                System.out.println("Good evening");
            }
            String small_condition = (time == 12) ? "Good day" : "Good evening"; //testin
            System.out.println(small_condition);
            while (time == 15){
                System.out.println("oops");
            }
    }
}
