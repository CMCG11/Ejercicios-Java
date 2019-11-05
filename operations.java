/*Haz un programa que tenga dos valores numéricos de entrada (con el valor que desees), muestra por consola la suma, resta, multiplicación, división, módulo, y cual de los los dos valores es mayor.*/
public class Operations{
	public static void main(String[] args){
	/*Definimos las variables*/
	int a=12;
	int b=15;
	int suma=a+b;
	int resta=a-b;
	int multiplicacion=a*b;
	double division=a/b;
	int modulo=a%b;
	boolean mayor=a>b;

	/*Mostramos el resultado por pantalla*/
	System.out.println("El resultado de la suma es "+(suma));
	System.out.println("El resultado de la resta es "+(resta));
	System.out.println("El resultado de la multiplicacion es "+(multiplicacion));
	System.out.println("El resultado de la division es "+(division));
	System.out.println("El resultado del modulo es "+(modulo));
	System.out.println("Que a sea mayor que b "+(mayor));
	}
}

