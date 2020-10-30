public class EX1_11 {
    public static void main(String[] args){
        long currentPopulation = 312032486;
        int year = 365;

        int secondsInAYear = year * 24 * 60 * 60;

        int births = secondsInAYear / 7;
        int deaths = secondsInAYear / 13;
        int immigrants = secondsInAYear/ 45;

        long addPopulation = births - deaths + immigrants;

        System.out.println("The population in the first year is " + currentPopulation);
        System.out.println("The population in the second year is " + (currentPopulation + addPopulation));
        System.out.println("The population in the third year is " + (currentPopulation + (addPopulation * 2)));
        System.out.println("The population in the fourth year is " + (currentPopulation + (addPopulation * 3)));
        System.out.println("The population in the fifth year is " + (currentPopulation + (addPopulation * 4)));

    }
}
