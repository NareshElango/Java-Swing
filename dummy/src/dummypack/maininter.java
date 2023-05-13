package dummypack;
import java.io.*;
import java.util.*;
interface percentagecalculator {
	int totalmaximummarks=8000;
	public float calcpercentage();
}
class intern implements percentagecalculator{

	private int marks,gracemarks;
	public intern(int marks,int gracemarks) {
		this.marks=marks;
		this.gracemarks=gracemarks;
	}
	public float calcpercentage() {
		return((marks+gracemarks)*100)/totalmaximummarks;
	}
	
	
}
class trainee implements percentagecalculator{
	private int marks;
	public  trainee(int marks) {
		this.marks=marks;
	}
	public float calcpercentage() {
		return(marks+totalmaximummarks)*100;
	}
}
public class maininter{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			int t1,t2;
			t1=sc.nextInt();
			t2=sc.nextInt();
			intern i=new intern(t1,t2);
			System.out.println(i.calcpercentage());
		}
		else
		{
			int t3;
			t3=sc.nextInt();
			trainee t=new trainee(t3);
			System.out.print(t.calcpercentage());
		}
		
	}
}