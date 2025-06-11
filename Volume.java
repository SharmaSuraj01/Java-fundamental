import java.util.Scanner;
public class Volume{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int h=sc.nextInt();
	double v=3.14*(r*r)*h;
	System.out.println(v);

}
}