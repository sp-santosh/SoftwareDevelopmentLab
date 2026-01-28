public class Conversions {
    public static void main(String[] args) {
        double weight = 10;
        double pints = 3;
        double century = 1;
        double cm = 180;
        System.out.println("The weight of " + weight + "kg in pound is " + weightConversion(weight));
        System.out.println("The " + pints + "pints in liter will be "+ pintsconversion(pints));
        System.out.println("The " + century + "century in Hours will be "+ centuryconversion(century));
        System.out.println("The " + cm + "cm in feet will be "+ cmconversion(cm));
    }

    static double weightConversion(double weight) {

        return weight * 2.202;
    }

    static double pintsconversion(double pints){
        return pints * 0.473176;
    }

    static double centuryconversion(double century){
        return century * 876000;
    }
    static double cmconversion(double cm){
        return cm / 30.48;
    }
}
