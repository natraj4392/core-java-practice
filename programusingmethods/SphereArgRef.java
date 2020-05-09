package programusingmethods;
class SphereArgRef {
    double q = 58.87;
    void volume(int r) {
        final double pi = 3.142;
        double result = 1.33 *pi*r*r*r;
        System.out.println(result);
    }
    public static void main(String[] args){
        SphereArgRef S1 = new SphereArgRef();
        S1.volume(10);
        System.out.println(S1.q);
    }
}