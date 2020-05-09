
class SphereArgN {
    int y =20;
    void volume(int r){
        final double pi = 3.142;
        double result = 1.33 *pi*r*r*r;
        System.out.println(result);
    }
    public static void main(String[] args){
        new SphereArgN().volume(10);
        System.out.println(new SphereArgN().y);
        }
}