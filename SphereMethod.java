class SphereMethod {
    static void volume(){
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 * pi * r * r * r ;
        System.out.println(result);
    }
    public static void main(String[] args) {
        volume();
    }
}