package pckg_uml_abs;

public class TestClient {

    public static void main(String[] args) {
        SportGPMotor mot1 = new SportGPMotor("Ducati", "H100");
        SportCar spc = new SportCar("mercedes", "slk");
        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();

        spc.startVeh();
        spc.startVehicle();
        spc.vehInfo();

    }
}
