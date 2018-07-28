package zad8_1;

public class Car extends Vehicle {
    private boolean airCon;

    public Car(String name, double capacity, double spalanie, boolean airCon) {
        super(name, capacity, spalanie);
        this.airCon = airCon;
    }

    public boolean isAirCon() {
        return airCon;
    }

    public void setAirCon(boolean airCon) {
        this.airCon = airCon;
    }


    @Override
    public String toString() {
        return super.toString() + " " + airCon;
    }

    public void enableAirCon() {
        airCon = true;
    }

    public void disableAirCon() {
        airCon = false;
    }

    public double spalanie() {
        if (isAirCon()) {
            return getSpalanie() + 0.8;
        } else
            return getSpalanie();
    }

    public int range() {
        return (int) ((getCapacity() * 100) / spalanie());
    }
}
