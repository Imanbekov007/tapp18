public class Apartment extends Families implements  Pay{
    public Apartment(String name, int age) {
        super(name, age);
    }

    @Override
    public void Comusluga() {
        System.out.println(getName()+"will pay utilities");

    }

    @Override
    public void Arenda() {

    }
}
