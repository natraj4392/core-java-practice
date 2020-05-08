class CylinderVol {
    float m = 20.258f;
    double volume() {
        final double pi = 3.142;
        int r = 10;
        int h = 20;
        double result = pi*r*r*h;
        return result;
    }
    public static void main(String[] args) {
        CylinderVol V1 = new CylinderVol();
        double newResult = V1.volume();
        System.out.println(newResult);
        System.out.println(new CylinderVol().m);
    }
}

