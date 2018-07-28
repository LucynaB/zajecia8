package zad8_1;

public class Vehicle {
    private String name;
    private double capacity;
    private double spalanie;

    public Vehicle(String name, double capacity, double spalanie) {
        this.name = name;
        this.capacity = capacity;
        this.spalanie = spalanie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }



    public String toString(){
        return name+" "+capacity+" "+spalanie;
    }
}
