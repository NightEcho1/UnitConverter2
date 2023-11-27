public class PhysicalConverter {
    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    public static double centimetersToKilometers(double centimeters) {
        return centimeters / 100000;
    }

    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static double kilometersToCentimeters(double kilometers) {
        return kilometers * 100000;
    }

    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }
}