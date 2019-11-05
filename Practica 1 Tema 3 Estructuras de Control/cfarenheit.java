/*Programa que muestra una tabla de equivalencias entre grados Fahrenheit y grados celsius, mostrando los valores entre 10 y 100, de 10 en 10.*/
public class cfarenheit{
public static void main(String[] args){
	int celsius=0;
	//Sacamos un bucle for 

	for (int farenheit=0; farenheit<=100 ;farenheit=farenheit+10){
		celsius =(farenheit-32)*5/9;
	System.out.println( +farenheit+" grados farenheit son"+celsius+" grados celsius");
	}
}
}