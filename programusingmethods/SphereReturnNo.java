package programusingmethods;
class CalculateVolumeRetNo {
    double volume(){
        final double pi = 3.142;
        int r = 10;
        double result = 1.33 *pi*r*r*r;
        return result;
    }
}
class SphereReturnNo {
    public static void main(String[] args){
        double newResult = new CalculateVolumeRetNo().volume();
        System.out.println(newResult);
    }
}