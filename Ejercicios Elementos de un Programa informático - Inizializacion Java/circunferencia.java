/*Realiza un programa que calcule la longitud y también el área, de una circunferencia de radio 3 metros.*/
public class circunferencia{
	public static void main(String[] args){
	/*Definimos las variables que vamos a utilizar*/
		double radio=3;
		double longitud=0;
		double area=0;
		double pi=3.1486;
	/*Realizamos las operaciones que queremos hacer*/
		area=pi*radio*radio;
		longitud=pi*pi*radio;
	/*Sacamos por pantalla el resultado de nuestras operaciones*/
		System.out.println("El area de la circunferencia es :"+area);
		System.out.println("La longitud de la circunferencia es :"+longitud);
	}
}
