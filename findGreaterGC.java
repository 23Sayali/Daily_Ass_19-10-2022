import java.util.Scanner;

public class findGreaterGC {

	public static void main(String[] args) 
	{
		
		findGreaterGC obj=new findGreaterGC();
		obj.greater();  //calling method
		obj=null;
		System.gc();  //calling gc method to free memory
		
	}
	
	public void greater()
	{
		int n1,n2;
	
		System.out.println("Enter the two numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if (n1>n2) {
			System.out.println(n1+" is the greatest number");
		}
		else {
			System.out.println(n2+" is the greatest number");
		}
	}

}