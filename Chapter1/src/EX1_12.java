public class EX1_12 {
    public static void main(String[] args){
        int miles = 24;

        double seconds = (1 * 60 * 60 ) + (40 * 60) + 35;
        double minutes = seconds / 60;
        double hours = (minutes) / 60;

        int kilometers = (int) (miles * 1.6);

        double speed = kilometers / hours;

        System.out.println("The runner went " +speed+ " miles per hour");

    }
}
