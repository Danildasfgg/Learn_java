public class Learn_day_sixteen {
    static int add(int age){
        return age + 2;
    }
    static void check(int ages){
        if (ages >= 18){
            System.out.println("good");
        } else{
            System.out.println("bad");
        }
    }
    public static void main(String[] args){
        int a = 15;
        int b = 16;
        check(add(a));
        check(add(b));
    }
}
