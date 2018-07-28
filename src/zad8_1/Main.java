package zad8_1;

public class Main {
    public static void main(String[] args) {
        Car[] vehicles = new Car[3];
        vehicles[0] = new Car("Audi",50,5.6,false);
        vehicles[1] = new Truck("Jelcz",100,10.5,false,0);
        vehicles[2] = new Truck("Scania",150,13.5,false,250);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].toString()+" zasięg: "+vehicles[i].range()+" km\n");
            vehicles[i].enableAirCon();
            System.out.println("Po włączeniu klimatyzacji: ");
            System.out.println(vehicles[i].toString()+" zasięg: "+vehicles[i].range()+" km\n");
        }




    }
}
