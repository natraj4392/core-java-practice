package programusingmethods;
class CalculateAreaArg {
    static double y = 20.25;
    static void area(int r) {
        final double pi = 3.142;
        double result = pi * r * r;
        System.out.println(result);
    }
    public static void main(String[] args) {
        CalculateAreaArg.area(10);
        System.out.println(CalculateAreaArg.y);
    }
}