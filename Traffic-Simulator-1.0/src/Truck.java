public class Truck extends Car {

    public Truck(String id) {
        this.id = ("truck_" + id);
        length = super.getLength() * 5;
    }

}