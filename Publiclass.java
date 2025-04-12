import java.util.Scanner;
public class DatosUsuario {         
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //solicitar nombre
    System.out.print ("ingresa el nombre ");
    String nombre = scanner.nextLine();
    
    
    System.out.print("ingresar edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine();        
    
    //solicitar correo electronico
    System.out.print("ingresa tu correo electronico:");
    String correo = scanner.nextLine();
    
    
    
    
    System.out.print ("numero de datos ingresados");
    System.out.print ("nombre" + nombre);
    System.out.print ("edad" + edad);
    System.out.print ("correo electronico"+ correo);
    
    scanner.close();
    
    }
}
