
class VolumeNWithin {
    void volume() {
        final double pi = 3.142;
        int r = 10;
        int h = 20;
        double result = pi*r*r*h;
        System.out.println(result);
    }
    public static void main(String[] args) {
        new VolumeNWithin().volume();
    }
}