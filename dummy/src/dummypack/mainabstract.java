package dummypack;
import java.io.*;
import java.util.*;
abstract class student{
	private String name,result;
	private int[] test;
	public student (String name) {
		this.name=name;
		result="NULL";
		test=new int[4];	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int[] gettest() {
		return test;
	}
	public void setresult(String result) {
		this.result=result;
	}
	public String getresult() {
		return result;
	}
	public void settestscore(int tn,int testscore) {
		test[tn]=testscore;
	}
	public abstract void generateresults();
}
class undergraduate extends student{
	public undergraduate(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	public void undergraduate(String name) {
//		super(name);
//	}
	public void generateresults() {
		int[] t=gettest();
		double avgmark=0;
		for(int i=0;i<4;i++) {
			avgmark+=t[i];
		}
		avgmark/=4;
		if(avgmark>60)setresult("pass");
		else
			setresult("fail");
	}
	
}
class graduate extends student{
	public graduate(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	public void graduate(String name) {
//		super(name);
//	}
	public void generateresults() {
		int[] t=gettest();
		double avgmark=0;
		for(int i=0;i<4;i++) {
			avgmark+=t[i];
		}
		avgmark/=4;
		if(avgmark>70)setresult("pass");
		else
			setresult("fail");
	}
	
}
public class mainabstract{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			undergraduate u=new undergraduate(sc.nextLine());
			sc.next();
			u.settestscore(0,sc.nextInt());
			u.settestscore(1,sc.nextInt());
			u.settestscore(2,sc.nextInt());
			u.settestscore(3,sc.nextInt());
			u.generateresults();
			System.out.println(u.getname());
			System.out.println(u.getresult());
			
			
		}
		else
		{
			graduate g=new graduate(sc.nextLine());
			sc.next();
			g.settestscore(0,sc.nextInt());
			g.settestscore(1,sc.nextInt());
			g.settestscore(2,sc.nextInt());
			g.settestscore(3,sc.nextInt());
			g.generateresults();
			System.out.println(g.getname());
			System.out.println(g.getresult());
		}
	}
}

