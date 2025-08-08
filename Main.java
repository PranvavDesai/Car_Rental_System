class Car{

    private  String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;


    public Car(String carId, String brand, String model, double basePricePerDay, boolean isAvailable){
        this.carId = carId;
        this.brand =brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = isAvailable;
    }

    public String getcarId()
    {
        return carId;
    }
    public String getBrand()
    {
        return brand;
    }

    public String getmodel()
    {
        return model;
    }

    public double calculatePrice(int rentalDays)
    {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void rent()
    {
        isAvailable =false;
    }

    public void isreturn()
    {
        isAvailable =true;
    }

}



class Customer{

    private String customerId;
    private String name;

    public Customer(String Customerid,String name)
    {
        this.customerId = customerId;
        this.name = name;
    }

    public String getcustomerId()
    {
        return customerId;
    }

    public String getcustomerName()
    {
        return name;
    }
}