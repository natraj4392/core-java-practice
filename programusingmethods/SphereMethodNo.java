package programusingmethods;
class CalculateVolumeNo {
    double n = 22.45;
    void volume() {
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 * pi * r * r * r ;
        System.out.println(result);
    }
}
class SphereMethodNo {
    public static void main(String[] args){
        new CalculateVolumeNo().volume();
        System.out.println(new CalculateVolumeNo().n);
    }
}