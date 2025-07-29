import java.util.ArrayList;  

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}