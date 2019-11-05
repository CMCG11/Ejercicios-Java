/*Programa que lee dos números por teclado, los resta, y comprueba si el resultado de la resta es un número negativo. Si es así, el programa finaliza, en caso contrario, pide un número de nuevo y lo resta al resultado anterior, y así sucesivamente hasta que el resultado de la resta sea un número negativo.*/
import java.util.Scanner;
	public class leerdosnumeros{
public static void main(String[] args){
Scanner entradaEscaner=new Scanner(System.in);
int numero1=0;
int numero2=0;
int numero3=0;
int resultado=0;
System.out.println("Introduce los numeros que deseas restar");
numero1=entradaEscaner.nextInt();
numero2=entradaEscaner.nextInt();
resultado=numero1-numero2;
System.out.println("La resta es " + numero1 + " - " + numero2 + " = " + resultado);
for (;resultado>=0;){
	System.out.println("Introduceme otro numero");
	numero3=entradaEscaner.nextInt();
	resultado=resultado-numero3;
	System.out.println("El resultado de la nueva resta es"+resultado);
	
}

}
}
