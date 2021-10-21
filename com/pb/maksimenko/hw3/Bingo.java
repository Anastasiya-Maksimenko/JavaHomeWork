
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class Bingo {
   public static void main(String[] args) {
       Random random = new Random();
       
       int x = random.nextInt(101);       
       int y;
       int counter=0;
       System.out.println("Привет! Для завершения игры напишите '111'");
       System.out.println("Если хочешь поиграть, попробуй угадать число от 0 до 100, укажи его: ");
       
       
      while(true)
      {
        counter++;
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt(); 
        if (y==111){        
        break;
        }
        
        if (y<x) {
          System.out.print("Не верно, укажите число больше: ");
          continue;
        }  
        else if (y>x) {
          System.out.print("Не верно, укажите число меньше: ");
          continue;
       }
       else {
        System.out.println("Ура, Вы угадали, загаданное число " + x + ", c " + counter + " попытки.");
       }
         break;
      }
      
      System.out.print("Конец игры!");

   }
}
