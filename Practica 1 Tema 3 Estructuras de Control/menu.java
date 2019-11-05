//Ahora vamos a hacer un programa usando parte de todo el c�digo anterior. El funcionamiento ser� el siguiente:
Saldr� un peque�o men� por pantalla que pida elegir entre las siguientes opciones: 
1) Calculo Hora
2) Calculo Mes
3) Par o Impar
4) Salir
Tomaremos de pantalla el n�mero que haya elegido el usuario, y dependiendo de �ste haremos lo siguiente:
Si ha pulsado 1: pedir� un n�mero por pantalla (n�mero de hora del d�a), y devolver� si es "Buenos d�as", "Buenas tardes", "Buenas noches" (es el c�digo que hab�is hecho en el ejercicio 1).
Si ha pulsado 2: pedir� un n�mero por pantalla (n�mero de mes), y devolver� el nombre del mes correspondiente (es el c�digo que hab�is hecho en el ejercicio 3).
Si ha pulsado 3: pedir� un n�mero por pantalla , y devolver� si es par o impar (es el c�digo que hab�is hecho en el ejercicio 5).
Si ha pulsado 4: Finalizar� el programa.
Si ha pulsado cualquier otra cosa: Decimos por pantalla "Error en la elecci�n"
El men� funcionar� en bucle, es decir, salvo que pulsemos el 4 para salir del programa, siempre volver� a la pantalla principal para elegir otra opci�n de las posibles.//
import java.util.Scanner;
	public class menu{
public static void main(String[] args){
Scanner entradaEscaner=new Scanner(System.in);
int opcion=0;
do{
System.out.println("Indica la opci�n que prefieras");
System.out.println("1)Calculo Hora");
System.out.println("2)Calculo Mes");
System.out.println("3)Par o Impar");
System.out.println("4)Salir");
opcion=entradaEscaner.nextInt();
	switch (opcion){
	case 1:
		System.out.println("Calculo Hora");
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
		break;

	case 2:
		System.out.println("Calculo Mes");
		int mes=0;
		System.out.println("Introduce un n�mero, correspondiente al mes");
		mes=entradaEscaner.nextInt();
		switch ( mes){
		case 1:
		System.out.println("El n�mero introducido corresponde al mes de Enero");
		break;
		case 2:
		System.out.println("El n�mero introducido corresponde al mes de Febrero");
		break;
		case 3:
		System.out.println("El n�mero introducido corresponde al mes de Marzo");
		break;
		case 4:
		System.out.println("El n�mero introducido corresponde al mes de Abril");
		break;
		case 5:
		System.out.println("El n�mero introducido corresponde al mes de Mayo");
		break;
		case 6:
		System.out.println("El n�mero introducido corresponde al mes de Junio");
		break;
		case 7:
		System.out.println("El n�mero introducido corresponde al mes de Julio");
		break;
		case 8:
		System.out.println("El n�mero introducido corresponde al mes de Agosto");
		break;
		case 9:
		System.out.println("El n�mero introducido corresponde al mes de Septiembre");
		break;
		case 10:
		System.out.println("El n�mero introducido corresponde al mes de Octubre");
		break;
		case 11:
		System.out.println("El n�mero introducido corresponde al mes de Noviembre");
		break;
		case 12:
		System.out.println("El n�mero introducido corresponde al mes de Diciembre");
		break;
		default:
		System.out.println("El n�mero introducido no se corresponde con ning�n mes");
		}
		break;
	case 3:
		System.out.println("Par o Impar");
		int numero=0;
		System.out.println("Introduce un n�mero");
		numero=entradaEscaner.nextInt();
			if (numero%2==0){
				System.out.println("El numero es par");
			}
		else {
		System.out.println("El numero es impar");
		}
		break;
	case 4:
		System.exit(0);
		break;
	default:
		System.out.println("La opci�n introducida no es ninguna de las indicadas");
		break;
	}
}while(opcion>5);
}
}