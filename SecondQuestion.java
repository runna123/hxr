public class SecondQuestion{
    public static void main(String[] args){
	    System.out.println("Below is the function of SecondQuestion");
		SecondQuestion();
	}
	public static void SecondQuestion(){
	    System.out.println("Second Question:"+count());
	}
	public static int count(){
	    int count=10;
		count*=count+2;
		count/=100;
		count++;
		return count;
	}
}