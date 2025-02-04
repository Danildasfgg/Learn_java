public class Learn_day_three {
    public static void main(String[] args) {
        //Real life project
        byte items = 50;
        float constPerItem = 9.99f;
        float totalConst = items * constPerItem;
        char iconConst = '$';
        System.out.println("Total const is " + totalConst + iconConst);
        //Translation of primitive data types
        int num = 9;
        double myDouble = num;
        System.out.println(myDouble);
        float num2 = 9.0f;
        int myInt = (int) num2;
        System.out.println(myInt);
    }
}
