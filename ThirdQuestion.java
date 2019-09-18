public class ThirdQuestion{
    public static void main(String[] args){
	    System.out.println("Below is the function of ThirdQuestion");
		ThirdQuestion();
	}
	public static void ThirdQuestion(){
	    System.out.println("Third Question:"+x());
		System.out.println("Third Question:"+y());
		System.out.println("Third Question:"+a());
		System.out.println("Third Question:"+b());
		System.out.println("Third Question:"+m());
		System.out.println("Third Question:"+z());
		System.out.println("Third Question:"+s());
		System.out.println("Third Question:"+t());
		System.out.println("Third Question:"+c());
		System.out.println("Third Question:"+k());
	}
	public static int x(){
		int x,res,n1=12,n4=3;
		x=res=n1/n4;
		return x;
	}
	public static double y(){
	    int n1=12,n4=3;
	    double y,d;
		y=d=n1/n4;
		return y;
	}
	public static int a(){
		int a,res,n3=16,n4=3;
		a=res=n3/n4;
		return a;
	}
	public static double b(){
	    int n3=16,n4=3;
	    double b,d;	
		b=d=n3/n4;
		return b;
	}
	public static double m(){
		int n4=3;
	    double m,d,v1=10.0;
		m=d=v1/n4;
		return m;
	}
	public static double z(){
	    double z,d,v1=10.0,v2=3.1416;
		z=d=v1/v2;
		return z;
	}
	public static int s(){
		int s,res,n1=12,n2=24;
	    s=res=n1/n2;
		return s;
	}
	public static double t(){
		int n1=12,n2=24;
	    double t,d;
		t=d=(double)n1/n2;
		return t;
	}
	public static double c(){
		int n1=12,n2=24;
	    double c,d;
		c=d=n1/(double)n2;
		return c;
	}
	public static double k(){
		int n1=12,n2=24;
	    double k,d;
		k=d=(double)(n1/n2);
		return k;
	}
}