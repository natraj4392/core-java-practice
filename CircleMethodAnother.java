class CalculateArea {
    static int z = 10;
    static void area() {
        final double pi = 3.142;
        int r = 10;
        double result = pi * r * r ;
        System.out.println(result);
    }
    public static void main (String[] args) {
        CalculateArea.area();
        System.out.println(CalculateArea.z);
    }
}