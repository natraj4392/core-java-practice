package programusingmethods;
class CalculateVolume {
    void volume(int r, int h) {
        final double pi = 3.142;
        double result = pi*r*r*h;
        System.out.println(result);
    }
}
class VolumeNBet {
    public static void main(String[] args) {
        new CalculateVolume().volume(10, 20);
    }
}