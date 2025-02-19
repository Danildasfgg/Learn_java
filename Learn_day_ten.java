public class Learn_day_ten {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            if (i == 8){
                break;
            } System.out.println(i);
        }
        int[] ageInt = {1, 2, 3, 4, 5};
        String[] ageString = {"oe", "two", "three", "four", "five"};
        for (String o : ageString){
            System.out.println(o);
        }
        ageString[0] = "one";
        for (String age_normal : ageString){
            System.out.println(age_normal);
        }
        for (int ageNormal : ageInt){
            System.out.println(ageNormal);
        }
        System.out.println(ageInt.length);
        System.out.println(ageString.length);
    }
}
