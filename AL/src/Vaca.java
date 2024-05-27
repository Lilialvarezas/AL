public class Vaca implements Herbivoro {

    @Override
    public void respirar() {
        System.out.println("Vaca que respira");
    }

    @Override
    public void comer() {
        System.out.println("Vaca que come");
    }

    @Override
    public void dormir() {
        System.out.println("Vaca que duerme");
    }

    @Override
    public void rumiar() {
        System.out.println("Vaca que rumia");
    }
}