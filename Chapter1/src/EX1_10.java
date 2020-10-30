public class EX1_10 {
    public static void main(String[] args){
        int kilometers = 14;

        double seconds = (45 * 60) + 30;
        double minutes = seconds / 60;
        double hours = minutes / 60;

        int miles = (int) (kilometers / 1.6);

        double speed = miles / hours;

        System.out.println("The runner went " +speed+ " miles per hour");

    }
}
