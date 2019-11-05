/*Programa que muestra un mensaje en pantalla según el valor de una variable numérica:*/
/*- "Buenos días" si la hora está entre las 0 y las 12*/
/*- "Buenas tardes" si la hora es menor de las 21*/
/*- "Buenas noches" si la hora es menor de las 24*/
/*- "Hora inválida" en caso contrario*/
import java.util.Scanner;
public class horas{
	public static void main(String[] args){
	Scanner entradaEscaner=new Scanner(System.in);
	int horas=0;
	System.out.println("Introduce las horas");
	horas=entradaEscaner.nextInt();
	if (horas<=12)
	{
	System.out.println("Buenos dias");
	}
	else if (horas>12&&horas<=21)
	{
	System.out.println("Buenas tardes");
	}
	else if (horas>21&&horas<=24)
	{
	System.out.println("Buenas noches");
	}
	else
	{
	System.out.println("La hora es incorrecta");
	}
}
}