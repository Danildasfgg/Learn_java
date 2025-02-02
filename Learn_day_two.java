public class Learn_day_two {
    public static void main(String[] args) {
        String name = "Danil";
        System.out.println("Hello " + name);
        //First exercise
        String first_name = "Danil ";
        String last_name = "Chernaev";
        String full_name = first_name + last_name;
        System.out.println(full_name);
        //Two exercise
        int three = 3;
        int twenty = 12;
        System.out.println(three + twenty);
        //Three exercise
        int one = 1;
        int two = 2;
        int four = 4;
        System.out.println(one + two + four); //No, no, no, no
        //It should be like this
        int one_1 = 1, two_1 = 2, three_1 = 3;
        System.out.println(one_1 + two_1 + three_1); //Yes, yes, yes, yes
        int x, y, z;
        //Four exercise
        x = y = z = 50;
        System.out.println(x + y + z); //Letter saver
        //Exercise to calculate the area
        int lenght = 9;
        int width = 17;
        int area;
        area = lenght * width;
        System.out.println(area);
    }
}
