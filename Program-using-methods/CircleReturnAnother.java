
class CalculateAreaReturn {
    static float num = 21.38f;
    static double area() {
        final double pi = 3.142;
        int r = 10;
        double result = pi * r * r;
        return result;
    }
    public static void main(String[] args) {
        double newRes = CalculateAreaReturn.area();
        System.out.println(newRes);
        System.out.println(CalculateAreaReturn.num);
    }
}