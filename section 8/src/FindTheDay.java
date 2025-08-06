public class FindTheDay {
    public static void main(String[] args) {
        String whatIsToday = "Tuesday";

        if(whatIsToday.equals("Monday")){
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Tuesday")) {
            System.out.println("It is weekday");
        }else{
            System.out.println("It is weekend");
        }

        if(whatIsToday.equals("Monday") || whatIsToday.equals("Tuesday")){
            System.out.println("It is weekday");
        } else {
            System.out.println("It is weekend");
        }
    }
}
