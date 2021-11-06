
public class Veterinarian {
    private String name;

    public Veterinarian (String name){
        this.name = name;
    }
    public void veterinar() {
        System.out.println("Ветеринар: " + name);
    }

    public static void treatAnimal (Animal animal){
        System.out.println("Животное: " + animal.getAnimal() +"\nпроживает в: " + animal.getLocation());
        System.out.println("Питание: " + animal.getFood());
        System.out.println(" ");
    }

}