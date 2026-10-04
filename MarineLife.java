public class MarineLife {
    public static void main(String[] args) {
        int dolphins = 11;
        int octopuses = 4;
        int mattaRays = 2;
        int seaOtters = 4;

        dolphins += 2;
        mattaRays--;
        octopuses += 4;
        System.out.println(dolphins > octopuses);
        System.out.println(mattaRays == seaOtters);
        System.out.println("Number of Animals: " + (dolphins + octopuses + mattaRays + seaOtters));
        System.out.println(seaOtters < 4 && mattaRays < 4);
    }
}
