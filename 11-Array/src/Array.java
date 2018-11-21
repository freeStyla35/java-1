import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] myIntArray=new int[10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<myIntArray2.length;i++) {
			System.out.println(myIntArray2[i]);
		}

		
		 System.out.println("---------------------");
		
		int[] myIntegers=getIntegers(5);
		for(int i=0;i<myIntegers.length;i++) {
			System.out.println("Element " + i +" ,typed value was " + myIntegers[i]);
		}
		System.out.println("The average is " + getAverage(myIntegers));
	

	}
	
	
	
	//create an array
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter" + number + " integer values");
		int[] values=new int[number];
		
		for(int i=0;i<values.length;i++) {
			values[i]=scanner.nextInt();
		}
		
		return values;
		
	}
	
	//create array
	public static double getAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return (double)sum/array.length;
	}
	
	
	
	
	
	
	
	
	
	
	
}
