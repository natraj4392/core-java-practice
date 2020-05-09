package programusingmethods;
class SphereReturn {
    static double volume(){
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 *pi*r*r*r;
        return result;
    }
    public static void main(String[] args){
        double newResult = volume();
        System.out.println(newResult);
    }
}