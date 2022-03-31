package IdeaProjects;

public class Main {

    public static void main(String[] args) {
        byte a = -100;
        short b = 32766;
        int c = 19;
        long d = 5225;
        float e = (float) 1.2;
        double f = 3.1415926;
        char g = 33;
        boolean h = false;
        float boxerOne = (float) 78.2;
        float boxerTwo = (float) 82.7;
        float boxers = boxerOne + boxerTwo;
        float diffBoxers = boxerTwo - boxerOne;
        System.out.println(boxers + " kg");
        System.out.println(diffBoxers + " kg");
        short bananWeight = 80;
        short milkWeight = 105;
        short icecreamWeight = 100;
        short eggsWeight = 70;
        int receipt = (bananWeight * 5 + milkWeight * 2 + icecreamWeight * 2 + eggsWeight * 4)/1000;
        System.out.println(receipt + " kg");
        short weigtToLoose = 7000;
        short dietOne = 250;
        short dietTwo = 500;
        int daysLeftOne = weigtToLoose / dietOne;
        int daysLeftTwo = weigtToLoose / dietTwo;
        float daysAverage = (daysLeftOne + daysLeftTwo) / 2;
        System.out.println(daysAverage + " dney");
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        double povishenie = 1.1;
        double masha1 = masha * povishenie;
        double denis1 = denis * povishenie;
        double christina1 = christina * povishenie;
        double mashaDiff = 12 * masha1 - 12 * masha;
        double denisDiff = 12 * denis1 - 12 * denis;
        double christinaDiff = 12 * christina1 - 12 * christina;
        System.out.println("Masha earns now " + masha1 + " rub. " + " Annual income increased by " + mashaDiff + " rub.");
        System.out.println("Denis earns now " + denis1 + " rub. " + " Annual income increased by " + denisDiff + " rub.");
        System.out.println("Cristina earns now " + christina1 + " rub. " + " Annual income increased by " + christinaDiff + " rub.");

    }
}
