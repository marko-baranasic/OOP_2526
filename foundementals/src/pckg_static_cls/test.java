package pckg_static_cls;

public class test {
    public static void main(String[] args) {
        USER us1 = new USER("Ivona", "ivona@gmail.com" );
        System.out.println(us1);
        us1.performSomeStudyAction();
        AUX_CLS.printSomeMSG("This is goog msg");
        SuperUser sup1 = new SuperUser("Petar Spasitelj", "Petar.spasitelj@gmail.com", 23);
        sup1.performSomeStudyAction();

    }
}
