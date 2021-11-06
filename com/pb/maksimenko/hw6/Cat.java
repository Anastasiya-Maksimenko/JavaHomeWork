import java.util.Objects;

public class Cat extends Animal {
   
    private String color;
    private String breed;

    public Cat() {
        super("Кот", "корм");
    }



    @Override
    public void makeNoise (){
        System.out.print(getAnimal());
        super.makeNoise();
        System.out.println(" мяу");
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
        Cat cat = (Cat) o;
        return  Objects.equals(color, cat.color) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash( color, breed);
    }

    @Override
    public String toString() {
        return "Cat{" +               
                ", color='" + color + '\'' +
                ", character='" + breed + '\'' +
                '}';
    }
}