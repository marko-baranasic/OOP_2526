package pckg_uml_abs;

public class SportCar implements veh{

    private static int cntID = 20;

    private int id;

    private String brand;

    private String model;

    public SportCar(String brand, String model) {
        this.id = cntID++;

    }

    @Override
    public void startVehicle() {
        System.out.println("Starting in specific car way" + this.getClass().getSimpleName() + "-" + this.id);
    }

    @Override
    public void stopVehicle() {
        System.out.println("Stopping in specific car way" + this.getClass().getSimpleName() + "-" + this.id);

    }

    @Override
    public void vehInfo() {

    }


    @Override
    public String toString() {
        return "SportCar{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void vehInfo
}
