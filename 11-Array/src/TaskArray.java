
public class TaskArray {

	public static void main(String[] args) {
		
		int[] myArray=new int[11];
		
		for(int i=1;i<myArray.length;i++) {
			myArray[i]=i;
		}
		
		for(int i=1;i<myArray.length;i++) {
			myArray[i]=myArray[i]*19;
		}
		
		for(int i=1;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		
		
	}

}
