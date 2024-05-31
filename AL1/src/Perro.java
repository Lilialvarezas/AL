public class Perro implements Carnivoro {

    @Override
    public void respirar() {
        System.out.println("Perro que respira");
    }

    @Override
    public void comer() {
        System.out.println("Pero que come");
    }

    @Override
    public void dormir() {
        System.out.println("Perro que duerme");
    }

    @Override
    public void acechar() {
        System.out.println("Perro que acecha");
    }
}