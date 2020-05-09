package programusingmethods;
class VolumeWithin {
    static void volume(int r,int h) {
        final double pi = 3.142;
        double result = pi*r*r*h;
        System.out.println(result);
    }
    public static void main(String[] args) {
        volume(10, 20); 
    }
}