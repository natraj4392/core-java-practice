package programusingmethods;
class SphereArg {
    static void volume(int r) {
        final double pi = 3.142;
        double result = 1.33 *pi*r*r*r;
        System.out.println(result);
    }
    public static void main (String[] args) {
        volume(10);
    }
}