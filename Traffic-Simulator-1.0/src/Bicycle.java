public class Bicycle extends Car {

    public Bicycle(String id) {
        this.id = ("bicycle_" + id);
        length = super.getLength() * 0.25f;
    }

}