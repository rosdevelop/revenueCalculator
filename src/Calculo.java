

import java.text.DecimalFormat;
import java.util.Scanner;
public class Calculo
{
	private static Scanner scanner;
	
	//Capture and return the amount of earnings
	public static long getEarnings(){
		scanner = new Scanner(System.in);
		System.out.print("Introduzca los Ingresos ");
		long earnings = scanner.nextLong();
		return earnings;
	}
	
	//Capture and return the amount of expenses
	public static long getExpenses(){
		scanner = new Scanner(System.in);
		System.out.print("Introduzca el Gastos ");
		long expenses = scanner.nextLong();
		return expenses;
	}
	
	//Capture and return the number of employee
	public static int getEmployee(){
		scanner = new Scanner(System.in);
		System.out.print("Total de Colaboradores: ");
		int colaborador = scanner.nextInt();
		return colaborador;
	}
	
	public static long calculateSellings(long argEarnings, long argExpenses){
		long tmpResults = argEarnings - argExpenses;
		return tmpResults;
	}
	
	public static double getSplittedComission(long argErnings, int argNumberExployees){
		double tmpComissions = (argErnings/argNumberExployees);
		return tmpComissions;
	}

	public static void main( String args[] )
	{
		System.out.print("Bienvenidos a calculo de Ventas");
		System.out.println(".");

		long tmpEarnings = getEarnings();
		long tmpExpenses = getExpenses();
		long tmpResult = calculateSellings(tmpEarnings, tmpExpenses);
		
		System.out.println("Monto Total de Ventas:\n " + tmpResult);
		System.out.println("Calculo de Comisiones según Ventas ");
		System.out.print("Monto Final de Ventas: ");
		System.out.println(tmpResult);
		System.out.print("Porcentaje de comisión: ");
		double porcentaje = 0.2;
		System.out.println(porcentaje + "%");

		double tmpResultAfterComissions = (tmpResult*porcentaje)/100;
		System.out.println("El resultado es: " + tmpResultAfterComissions);

		int tmpNumberEmployees = getEmployee();
		System.out.print("Monto Total para C/U: ");
		double tmpSplittedComission = getSplittedComission(tmpEarnings, tmpNumberEmployees);
		DecimalFormat tmpFormatter = new DecimalFormat("#.##");
		System.out.println(tmpFormatter.format(tmpSplittedComission));

		System.out.println("La recompensa llega a los que trabajan duro y no se detienen");
		System.out.println("Developer Rosbin Vasquez");
	}
}

