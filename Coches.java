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

public static void main(String args[]){
	System.out.println("Venta de carros");
	System.out.println("1.- Mercedez");
	System.out.println("2.-Ferrari");

x = entrada.nextInt();

switch(x){

	case 1: Mercedez(); break;
	case 2: Ferrari(); break;

default: System.out.println("Numero erroneo"); break;

}

}


}
