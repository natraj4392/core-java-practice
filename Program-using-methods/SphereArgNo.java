class CalculateVolumeArgNo {
    float p = 28.888f;
    void volume(int r) {
        final double pi = 3.142;
        double result = 1.33 *pi*r*r*r;
        System.out.println(result);
    }
}
class SphereArgNo {
    public static void main(String[] args){
        new CalculateVolumeArgNo().volume(10);
        System.out.println(new CalculateVolumeArgNo().p);
    }
}