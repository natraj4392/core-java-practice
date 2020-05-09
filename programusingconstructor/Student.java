package programusingconstructor;
class Student {
    static String schoolName = "raj";
    int stdid;
    String stdName;
    Student(int a,String b) {
        stdid = a;
        stdName = b;
    }
    public static void main (String[] args) {
        Student S1 = new Student(100, "nat");
        System.out.println(S1.stdid);
        System.out.println(S1.stdName);
        System.out.println(schoolName);
    }
}