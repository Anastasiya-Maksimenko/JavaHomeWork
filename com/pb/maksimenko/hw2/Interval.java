import java.util.Scanner;


public class Interval {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int x;
    int result;

    System.out.print("Введите любое целое число: ");
    x = scanner.nextInt();  
    
    
    
        if 
     (x>=0 && x<=14) {
        System.out.println("Вы находитесь в промежутке  [0-14]");}

        if 
     (x>=15 && x<=35) {
        System.out.println("Вы находитесь в промежутке  [15-35]");}

        if 
        (x>=36 && x<=50) {
           System.out.println("Вы находитесь в промежутке  [36-50]");}

        if 
           (x>=51 && x<=100) {
            System.out.println("Вы находитесь в промежутке  [51-100]");}
        
        if (x<0 || x>100) {
            System.out.println("Такой промежуток отсутсвует"); }
    }

        
    

    
    
}
