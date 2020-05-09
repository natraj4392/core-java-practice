
class CircleMethodArgRef {
    void area(int r) {
        final double pi = 3.142;
        double result = pi * r * r;
        System.out.println(result);
    }
    public static void main (String[] args){
        CircleMethodArgRef C1 = new CircleMethodArgRef();
        C1.area(10);
        C1.area(20);
    }

}