/*Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer este tiempo pero expresado en horas, minutos y segundos.*/
/*Ejemplo:*/
/*Horas: 5*/
/*Minutos:15*/

Segundos:8 
public class Time{
	public static void main(String[] args){
	/*Definimos las variables*/
	int m=3470;
	int horas=0;
	int minutos=0;
	int segundos=0;
	horas=m/3600; 
	minutos=(m%3600)/60;
	segundos=(m%3600)%60;
	System.out.println("Las horas son:"+horas);
	System.out.println("Los minutos son:"+minutos);
	System.out.println("Las segundos son:"+segundos);
	}
}