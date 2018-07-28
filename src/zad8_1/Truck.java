package zad8_1;

public class Truck extends Car{
    private double loadWeight;

    public Truck(String name, double capacity, double spalanie, boolean airCon, double loadWeight) {
        super(name, capacity, spalanie, airCon);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }



    @Override
    public String toString() {
        return super.toString()+" "+loadWeight;
    }

    @Override
    public double spalanie() {
        if(isAirCon()){
            return getSpalanie()+1.6+0.5*(int)(getLoadWeight()/100);
        }else
            return getSpalanie()+0.5*(int)(getLoadWeight()/100);
    }
}
