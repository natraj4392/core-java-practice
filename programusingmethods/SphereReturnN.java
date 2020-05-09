package programusingmethods;
class SphereReturnN {
    double m = 10.12;
    double volume() {
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 *pi*r*r*r;
        return result;
    }
    public static void main(String[] args) {
       double newResult = new SphereReturnN().volume();
       System.out.println(newResult);
       System.out.println(new SphereReturnN().m);
    }
}