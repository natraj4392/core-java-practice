
class CircleMethodArgN {
    void area(int r) {
        final double pi = 3.142;
        double result = pi * r * r;
        System.out.println(result);
    }
    public static void main (String[] args) {
        new CircleMethodArgN().area(10);
    }
}