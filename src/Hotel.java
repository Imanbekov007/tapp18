public class Hotel extends Families implements Pay{
    public Hotel(String name, int age) {
        super(name, age);
    }

    @Override
    public void Comusluga() {

    }

    @Override
    public void Arenda() {
        System.out.println(getName()+" will pay for rent");

    }
}
