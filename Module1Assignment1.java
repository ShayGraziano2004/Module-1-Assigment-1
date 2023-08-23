public class Conversion {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("----------------|----------------");

        for (double feet = 1, meters = 20; feet <= 10 && meters <= 65; feet++, meters += 5) {
            System.out.printf("%.2f\t%.2f\t|\t%.2f\t%.2f%n", feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }
}
