abstract class vehicle {
    String brand;
    String model;
    double price;

    abstract void applyBreak();

    vehicle(){
        this.brand = "";
        this.model = "";
        this.price = 0.0;
    }
    vehicle(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setModel(String model){
        this.model = model;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    String getBrand(){
        return this.brand;
    }
    String getModel(){
        return this.model;
    }
    double getPrice(){
        return this.price;
    }

    void Display(){
        System.out.println("Vehical Brand: "+this.brand);
        System.out.println("Vehical Model: "+this.model);
        System.out.println("Vehical Price: "+this.price);
    }

}//vehical class ends

class Car extends vehicle{
    int seatingCapacity;
    String fuelType;

    Car(){
        super();
        this.seatingCapacity = 0;
        this.fuelType = "no specified";
    }

    Car(String brand,String model,double price,int seatingCapacity,String fuelType){
        super(brand,model,price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    void setSeatingCapacity(int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }
    void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    int getSeatingCapacity(){
        return this.seatingCapacity;
    }
    String getFuelType(){
        return this.fuelType;
    }
    void Display(){
        super.Display();
        System.out.println("Car Seating Capacity: "+this.seatingCapacity);
        System.out.println("Car Fuel Type: "+this.fuelType);
    }

    void applyBreak(){
        System.out.println("Car is applying brakes.");
    }
}//Car class ends

class Bike extends vehicle{
    boolean hasCarrier;
    String bikeType;

    Bike(){
        super();
        this.hasCarrier = 0.0;
        this.bikeType = "no type";
    }

    Bike(String brand,String model,double price,boolean hasCarrier,String bikeType){
        super(brand,model,price);
        this.hasCarrier = hasCarrier;
        this.bikeType = bikeType;
    }
    void setHasCarrier(boolean hasCarrier){
        this.hasCarrier = hasCarrier;
    }
    void setBikeType(String bikeType){
        this.bikeType = bikeType;
    }
    boolean getHasCarrier(){
        return this.hasCarrier;
    }
    String getBikeType(){
        return this.bikeType;
    }
    void Display(){
        super.Display();
        System.out.println("Bike Has Carrier: "+this.hasCarrier);
        System.out.println("Bike Type: "+this.bikeType);
    }
    void applyBreak(){
        System.out.println("Bike is applying brakes.");
    }
}//Bike class ends
class Bus {
    int passengerCapacity;
    int numberOfDoors;

    Bus() {
        super();
        this.passengerCapacity = 0;
        this.numberOfDoors = 0;
    }
    Bus(int passengerCapacity, int numberOfDoors) {
        super(brand, model, price);
        this.passengerCapacity = passengerCapacity;
        this.numberOfDoors = numberOfDoors;
    }
    void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    int getPassengerCapacity() {
        return this.passengerCapacity;
    }
    int getNumberOfDoors() {
        return this.numberOfDoors;
    }
    void Display() {
        super.Display();
        System.out.println("Bus Passenger Capacity: " + this.passengerCapacity);
        System.out.println("Bus Number of Doors: " + this.numberOfDoors);
    }
    void applyBreak(){
        System.out.println("Bus is applying brakes.");
    }

}

class testVehical {
    public static void main(String[] args){
        Car car1 = new Car("Toyota","Camry",30000,5,"Petrol");
        Bike bike1 = new Bike("Yamaha","FZ",1500,true,"Sport");
        Bus b1 = new Bus(50,2);
        bike1.Display();
        b1.Display();
        car1.Display();
    }
}