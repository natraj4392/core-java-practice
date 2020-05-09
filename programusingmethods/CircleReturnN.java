package programusingmethods;
class CircleReturnN {
    double area() {
        final double pi = 3.142;
        int r = 10;
        double result = pi * r * r;
        return result;
    }
    public static void main(String[] args) {
        double newRes = new CircleReturnN().area();
        System.out.println(newRes);
    }
}