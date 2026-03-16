package pckg_uml_abs;

public class SportGPMotor {

    private String brand;

    private String model;

    private int id;



    private static int cntID = 35;

    public SportGPMotor(String brand, String model) {
        this.id = cntID++;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void startVeh(){
        System.out.println("gp motor startinf" + this.model);
    }


    @Override
    public void stopVeh(){
        System.out.println("gp motor stopped" + this.model);
    }

    @Override
    public String toString() {
        return "SportGPMotor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
