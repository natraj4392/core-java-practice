
class CircleReturnRef {
    double area(){
        final double pi = 3.142;
        int r = 10;
        double result = pi * r * r;
        return result;
    }
    public static void main (String[] args) {
       CircleReturnRef C1 = new CircleReturnRef();
       double newRes = C1.area();
       System.out.println(newRes);
    }
}