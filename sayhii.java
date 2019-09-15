public class sayhii{
	public static void main(String[] args){
		System.out.println("Say hii!");
	    sayhii(sum());
	}
	public static void sayhii(int sum){
		System.out.println("Say hii!"+sum);
		
	}
	public static int sum(){
		int sum = 0;
		for(int i =0;i<=100;i++){
			sum+=i;
		}
		return sum;
	}
}