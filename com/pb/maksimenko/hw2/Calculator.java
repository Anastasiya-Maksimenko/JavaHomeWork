import java.util.Scanner;


public class Calculator {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int operand1;
    int operand2; 
    int result;
    String symbol;

    System.out.print("Введите любое целое число: ");
    operand1 = scanner.nextInt();  

    System.out.print("Введите любое целое число: ");
    operand2 = scanner.nextInt();

    System.out.print("Выберите арифметическое действие: ");
    symbol = scanner.next();

    switch (symbol) {
        case "+":
            result= operand1+operand2;
            System.out.println("Ответ:"+ result);  
            break;

        case "-":
            result= operand1-operand2;
            System.out.println("Ответ:"+ result);
            break; 
     
        case "/":
            if ( operand2 !=0 ) {
                result=operand1/operand2; 
                System.out.println("Ответ:"+ result); 
            }
            else {System.out.println("Нет, нет, на 0 делить нельзя.");
            }
            break;
        
        case "*":
            result=operand1*operand2;        
            System.out.println("Ответ:"+ result);
            break;
        }
    }
}


