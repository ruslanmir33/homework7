import java.util.Random;

public class Dog extends Animal{
    Random random = new Random();
    public Dog(String name) {
        super("Собакен", name, 500, (int) 0.5,10);
    }


}
