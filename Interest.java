import java.util.Scanner;
public class Interest{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt();
	int r=sc.nextInt();
	int t=sc.nextInt();
	double S=(p*r*t)/100.0;
	System.out.println(S);

}
}