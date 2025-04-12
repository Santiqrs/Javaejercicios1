import java.util.Scanner;
public class operacionesbasicas {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       public class operacionesbasicas {



       //solicitar los numeros al usuario
       System.out.print("ingrese el primer numero: ");
       double numero1 = scanner.nextDouble();
       
       System.out.print("ingrese el segundo numer: ");
       double numero2 = scanner.nextDouble();
       
       double suma = numero1 + numero2;
       double resta = numero1 - numero2;
       double multiplicacion = numero1 * numero2;
       double division = numero1 / numero2;
       double modulo = numero1 % numero2;
       
      System.out.println ("suma: " + suma); 
      System.out.println ("resta: " + resta);
      System.out.println("multiplicacion" + multiplicacion);
      System.out.println ("division: "+ division);
      System.out.println ("modulo: "+ modulo);
      
    } 
}
