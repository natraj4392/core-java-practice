package programusingmethods;
class CalculateVolumeRet {
    static double volume() {
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 *pi*r*r*r;
        return result;
    }
}
class SphereReturnO {
    public static void main(String[] args) {
        double newResult = CalculateVolumeRet.volume();
        System.out.println(newResult);
    }
}