
class CircleMethodRef {
    void area() {
        final double pi = 3.142;
        int r = 10;
        double result = pi * r * r;
        System.out.println(result);
    }
    public static void main (String[] args){
        CircleMethodRef C1 = new CircleMethodRef();
        C1.area();
        C1.area();
    }
}