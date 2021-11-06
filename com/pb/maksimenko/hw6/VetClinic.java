import java.lang.reflect.Constructor;


public class VetClinic {

    private static Object obj;

    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Horse horse1 = new Horse();
        dog1.setLocation("будка");
        cat1.setLocation("квартира");
        horse1.setLocation("хлев");

        System.out.println("Методы класов Dog, Cat, Horse:\n");
        dog1.makeNoise();
        dog1.eat();
        System.out.println("");
        cat1.makeNoise();
        cat1.eat();
        System.out.println("");
        horse1.makeNoise();
        horse1.eat();
        System.out.println("");

        cat1.eat();
        System.out.println(" ");
        System.out.println(" на прием к ветеринару:");
        Animal[] animals = new Animal[]{dog1, cat1, horse1};
        for (Animal a : animals) {
            Veterinarian.treatAnimal(a);
        }

        Class vet = Class.forName("com.pb.maksimenko.hw6.Veterinarian");
        Constructor constr = vet.getConstructor (new Class[]{String.class} );
        obj = constr.newInstance("Максименко");
        if (obj instanceof Veterinarian) {
            System.out.println("Объект класса Veterinarian: ");
            ((Veterinarian) obj).veterinar();

        }

    }
}
