/*Dentro de una clase joven tenemos las variables enteras edad, nivel_de_estudios e ingresos./*
/*Necesitamos almacenar en la variable booleana jasp el valor:*/
/*– Verdadero. Si la edad es menor o igual a 28 y el nivel_de_estudios es mayor que tres, o bien, la edad es menor de 30 y los ingresos superan los 28.000 (euros)./* 
/*– Falso. En caso contrario.*/
public class joven{
public static void main(String[] args){
	/*Definimos las variables que nos da el enunciado*/
	int edad=28;
	int nivel_de_estudios=2;
	int ingresos=38;
	boolean jasp=false;
	/*Planteamos las condiciones*/
	jasp=(edad<=28&&nivel_de_estudios>3)||(edad<30&&ingresos>28000);
	System.out.println(+jasp);
	}
}
	