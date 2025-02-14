public class Learn_day_six {
    public static void main(String[] args){
        int age = 19;
        if(age == 15){
            System.out.println("Happy");
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.println("NO NO NO  NO NO ");
            }
        int hour = 5;
            String hour_name = " ";
            switch (hour) {
                case 1:
                    hour_name = "One";
                    break;
                case 2:
                    hour_name = "two";
                    break;
                case 3:
                    hour_name = "Three";
                    break;
                case 4:
                    hour_name = "Four";
                    break;
                case 5:
                    hour_name = "Five";
                    break;
                default:
                    System.out.println("LOL");
                    break;
            }
            System.out.println(hour_name);
        }
    }
}
