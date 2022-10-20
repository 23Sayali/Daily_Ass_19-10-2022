import java.util.Scanner;

public class boxUnBox {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Box();
		Unbox();
	}
	
	public static void Box() {
		System.out.println("This is Box Method :\n");
		System.out.println("Enter a number");  //taking input as int datatype
		int num=sc.nextInt();
		Integer it=new Integer(num);
		if(it>0) {
			System.out.println(+it+" is Positive Value");
		}
		else if(it==0) {
			System.out.println(+it+" is Neither Positive Nor Negative Value");
		}
		else {
			System.out.println(+it+" is Negative Value");
		}
	}
	public static void Unbox() {
		System.out.println("\nThis is UnBox Method :\n");
		System.out.println("Enter the value");
		Integer obj=sc.nextInt();
		int num=obj;
		if(num%3==0) {
			System.out.println(+num+" is Divisible by 3");
		}
		else {
			System.out.println(+num+" is Not Divisible by 3");
		}
		
	}

}