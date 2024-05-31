public class MainAnimal {
    public static void main(String[] args) {
        Carnivoro perro = new Perro();
        perro.respirar();
        perro.comer();
        perro.dormir();
        perro.acechar();

        Herbivoro vaca = new Vaca();
        vaca.respirar();
        vaca.comer();
        vaca.dormir();
        vaca.rumiar();
    }
}
