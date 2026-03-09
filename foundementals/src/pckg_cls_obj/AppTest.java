package pckg_cls_obj;

public class AppTest {
    public static void main(String[] args) {
        Student s1 = new Student("Petar","Petrić", 12);
        Student s2 = new Student("sa", "s", 4);
        s1.subscribeToStudentService();

    }
}
