class CalculateVolumeStatic {
    static double volume() {
        final double pi = 3.142;
        int r = 10;
        int h = 20;
        double result = pi*r*r*h;
        return result;
    }
}
class VolumeBet {
    public static void main(String[] args) {
        double newResult = CalculateVolumeStatic.volume();
        System.out.println(newResult);
    }

}