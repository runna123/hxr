import java.util.Scanner;

public class Age {
	public static void main (String[] args){
		final String younger = "cute angel";
		final String young = "beautiful angel";
		final String jiejie = "xu~";
		Scanner scan = new Scanner(System.in);
		System.out.print("pleas input your age: ");
		int age = scan.nextInt();
		
		String nickname = jiejie;
		if(age<20){
			nickname = younger;
		}
		if(age>=20){
			nickname = young;
		}
		switch(nickname){
			case younger:
			    System.out.print("hello cute angel");
				break;
			case young:
				System.out.print("hello beautiful angel");
				break;
			default:
			    System.out.print("pless input again");
		}
	}
}
