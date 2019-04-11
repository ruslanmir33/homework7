public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Ксандер"),
                new Dog("Борбос"),
                new Cat("Мурзик"),
                new Dog("Тимка")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].jump(1);
            animals[i].swim(5);
            animals[i].run(100);
        }
    }

}
