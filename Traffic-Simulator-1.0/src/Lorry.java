public class Lorry extends Car {

    public Lorry(String id) {
        this.id = ("lorry_" + id);
        length = super.getLength() * 4;
    }

}