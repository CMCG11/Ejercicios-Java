//Programa que dado un número, devuelva si es "PAR" o "IMPAR"//
import java.util.Scanner;
	public class pareimpar{
public static void main(String[] args){
Scanner entradaEscaner=new Scanner(System.in);
int numero=0;
System.out.println("Introduce un número");
numero=entradaEscaner.nextInt();

if (numero%2==0){
	System.out.println("El numero es par");
	}
else {
	System.out.println("El numero es impar");
}
}
}
