/* Programa que saque por pantalla los números pares hasta el 50 (con los tres tipos de bucles).*/
public class buclenumerospares{
public static void main(String[] args){
//Numeros pares del 1 al 50 con los tres bucles while
      System.out.println("A continuacion se muestran los numeros pares hasta el 50");
      for(int i=1;i<51;i++){
	if(i%2==0){
		System.out.println("El numero par:"+i);
	}
}
	int x=1;
	while((x%2==0)&&(x<51)){
		
		System.out.println("El numero par:"+x);
		x ++;
	}
	int y=1;
	do {
		if(x%2==0){
			System.out.println("El numero par:"+y);
		}
	}
	while(y<51);
}
}