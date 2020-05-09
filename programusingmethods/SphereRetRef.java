package programusingmethods;
class SphereRetRef {
    double volume() {
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 *pi*r*r*r;
        return result;
    }
    public static void main(String[] args){
        SphereRetRef S1 = new SphereRetRef();
        double newResult = S1.volume();
        System.out.println(newResult);
    }
}