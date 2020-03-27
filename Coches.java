import java.util.*;

public class Coche{

	public static int x;
	public static Scanner entrada=new Scanner(System.in);
public static void Mercedez(){
	System.out.println("Automovil Mercedez");
	System.out.println("Cuatro caballos de fuerza");
	System.out.println("Costo :$700,500");	
 }
public static void Ferrari(){ 
        System.out.println("Automovil Ferrari");
        System.out.println("Cuatro caballos de fuerza");
        System.out.println("Costo :$1,700,500");  
 }

public static void Audi(){ 
        System.out.println("Automovil Audi");
        System.out.println("Cuatro caballos de fuerza");
        System.out.println("Costo :$2,800,200");  
 }
public static void BMW(){ 
        System.out.println("Automovil BMW");
        System.out.println("Seis caballos de fuerza");
        System.out.println("Costo :$1,560,899");  
 }


public static void main(String args[]){
	System.out.println("Venta de carros");
	System.out.println("1.- Mercedez");
	System.out.println("2.-Ferrari");
	System.out.println("3.- Audi");
System.out.println("4.- BMW");

x = entrada.nextInt();

switch(x){

	case 1: Mercedez(); break;
	case 2: Ferrari(); break;
	case 3: Audi(); break;
case 4: BMW(); break;

default: System.out.println("Numero erroneo"); break;

}

}


}
