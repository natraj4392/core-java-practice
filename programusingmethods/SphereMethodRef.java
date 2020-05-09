package programusingmethods;
class SphereMethodRef {
    int m = 25;
    void volume(){
        final double pi = 3.142;
        int r = 10;
        double result = 1.33*pi*r*r*r;
        System.out.println(result);
    }
    public static void main(String[] args){
        SphereMethodRef S1 = new SphereMethodRef();
        S1.volume();
        System.out.println(S1.m);
    }
}