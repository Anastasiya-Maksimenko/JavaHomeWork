
import java.util.Objects;

public class Horse extends Animal {
    String kind;
    String size;

    public Horse(){
        super("Лошадь", "сено");
    }

    @Override
    public void makeNoise (){
        System.out.print(getAnimal());
        super.makeNoise();
        System.out.println(" иго-го");
    }

    @Override
    public void eat () {
        System.out.print(getAnimal());
        super.eat();
        System.out.println(getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(kind, horse.kind) && Objects.equals(size, horse.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, size);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "kind='" + kind + '\'' +
                ", allure='" + size + '\'' +
                '}';
    }
}