package pckg_zad3;

public class Vehicle {

    protected String model;

    protected String brand;

    protected String date;

    protected int vehID;

    protected static int outInc = 10;



    public Vehicle(){

    }



    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
        this.vehID = ++outInc;
    }



    public void setDate(String stringDate){
        this.date = date;
    }



    public void startVehicle(){
        System.out.println("Starting: " + this.getClass().getSimpleName());
    }


    public void stopVehicle(){
        System.out.println("Stopping: " + this.getClass().getSimpleName());
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", date='" + date + '\'' +
                ", vehID=" + vehID +
                '}';
    }


    protected void vehInfo(){
        System.out.println(this.toString());
    }



}
