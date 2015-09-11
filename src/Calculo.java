

import java.util.Scanner;
public class Calculo
{
	public static void main( String args[] )
	{
		System.out.print("Bienvenidos a calculo de Ventas");
		System.out.println(".");
		
		Scanner teclado, person;
		teclado = new Scanner(System.in);
		person = new Scanner(System.in);
		long primerNumero,segundoNumero;
	   	  
	     System.out.print("Introduzca los Ingresos ");
	     primerNumero= teclado.nextLong();
	     System.out.print("Introduzca el Gastos ");
	     segundoNumero = teclado.nextLong();
	     
	     System.out.print("Monto Total de Ventas: ");
	     System.out.println(primerNumero - segundoNumero);
	     System.out.println("Calculo de Comisiones según Ventas ");
	     
	     long numero = primerNumero - segundoNumero;
	     System.out.print("Monto Final de Ventas: ");
	     System.out.println(numero);
	     System.out.print("Porcentaje de comisión: ");
	     double porcentaje = 0.2;
	     System.out.println(porcentaje + "%");
	     
	     double resultado = (numero*porcentaje)/100;
	     System.out.println("El resultado es: "+resultado);
	    
	     System.out.print("Total de Colaboradores: ");
	     int colaborador = person.nextInt(); 
	     System.out.print("Monto Total para C/U: ");
	     double comision = (resultado / colaborador);
	     System.out.println(comision);
	     
	     System.out.println("La recompensa llega a los que trabajan duro y no se detienen");
	     System.out.println("Developer Rosbin Vasquez");
	}
}

