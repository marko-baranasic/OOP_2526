package pckg_zad3;

public class VehClient {

    private static Vehicle veh;

    private static SportCar sc1;

    private static SportCar sc2;


    public static void main(String[] args) { // void ne vraća vrijednost, main ne treba objekt jer ima main
        veh = new Vehicle("X4", "BMW");
        sc1 = new SportCar("Carrera", "Porche");
        sc2 = new SportCar("Spider", "Ferari");
        veh.startVehicle();
        veh.setDate("23-11-2008.");
        veh.vehInfo();
        sc1.setDate("10-10-2023");
        sc2.setDate("05-15-2024");
        sc1.startVehicle();
        sc2.startVehicle();
        sc1.vehInfo();
}
