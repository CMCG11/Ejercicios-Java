//2. Programa que dado un número (correspondiente al número de mes), devuelva por pantalla el nombre del mes en texto, o "Mes inválido" en caso contrario.//
import java.util.Scanner;
	public class mes{
public static void main(String[] args){
Scanner entradaEscaner=new Scanner(System.in);
int mes=0;
System.out.println("Introduce un número, correspondiente al mes");
mes=entradaEscaner.nextInt();
switch ( mes){
	case 1:
		System.out.println("El número introducido corresponde al mes de Enero");
		break;

	case 2:
		System.out.println("El número introducido corresponde al mes de Febrero");
		break;
	case 3:
		System.out.println("El número introducido corresponde al mes de Marzo");
		break;
	case 4:
		System.out.println("El número introducido corresponde al mes de Abril");
		break;
	case 5:
		System.out.println("El número introducido corresponde al mes de Mayo");
		break;
	case 6:
		System.out.println("El número introducido corresponde al mes de Junio");
		break;
	case 7:
		System.out.println("El número introducido corresponde al mes de Julio");
		break;
	case 8:
		System.out.println("El número introducido corresponde al mes de Agosto");
		break;
	case 9:
		System.out.println("El número introducido corresponde al mes de Septiembre");
		break;
	case 10:
		System.out.println("El número introducido corresponde al mes de Octubre");
		break;
	case 11:
		System.out.println("El número introducido corresponde al mes de Noviembre");
		break;
	case 12:
		System.out.println("El número introducido corresponde al mes de Diciembre");
		break;
	default:
	System.out.println("El número introducido no se corresponde con ningun mes");
}
}
}


