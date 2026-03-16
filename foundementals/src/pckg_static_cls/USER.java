package pckg_static_cls;

public  class USER {
    protected String name;
    protected String mail;

    private static int cntID = 100; //znaci da je nesto staticno, znaci na nivou klase, ako nebi stavio cnt svi bi imali isto tj za sve objekte te klase, trik pomoću kojem koristimo id bez dda se autokrementira.

    private static final int MAX_VAL = 200; //

    protected int id;

    public USER(String name, String mail) {//kostruktor
        this.name = name;
        this.mail = mail;
        this.id = cntID++;  // dodaje se svaki put kad se izvrsi metoda jedan cntID,, ako je ++cntid, onda je ptvi 101, ovako je 100
        this.id = cntID++;
    }

    public void performSomeStudyAction(){ // ako je finalna znaci da je ne mozemo overridati,
        System.out.println(name + " performing some study action!");
    }

    @Override
    public String toString() {
        return "USER{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                '}';
    }
}
