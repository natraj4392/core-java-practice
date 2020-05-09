package programusingmethods;
class CalculateVolumeArg {
    static void volume(int r) {
        final double pi = 3.142;
        double result = 1.33 *pi*r*r*r;
        System.out.println(result);
    }
}
class SphereArgO {
    public static void main(String[] args) {
        CalculateVolumeArg.volume(10);
    }
}