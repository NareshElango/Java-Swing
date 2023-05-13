package connpack;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
class db{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		try {
			//DataInputStream din=new DataInputStream(System.in);
			int roll,age,n;
			String name;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","root");
			Statement st=con.createStatement();
			while(true) {
				System.out.println("insert");
				System.out.println("update");
				System.out.println("delete");
				System.out.println("display");
				System.out.println("exit");
				System.out.println("enter your choice");
				//n=Integer.parseInt(din.readLine());
				n=sc.nextInt();
				switch(n) {
				case 1:
//				roll=Integer.parseInt(din.readLine());
//				name=din.readLine();
//				age=Integer.parseInt(din.readLine());
					roll=sc.nextInt();
					name =sc.next();
					age=sc.nextInt();
				//st.executeUpdate("insert into stu1 values"+roll+","+name+","+age);
					String query="insert into stu1 values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setInt(1,roll);
					ps.setString(2, name);
					ps.setInt(3, age);
					ps.execute();
				break;
				case 2:
					//roll=Integer.parseInt(din.readLine());
//					roll=sc.nextInt();
//					//name=din.readLine();
//					name =sc.next();
					//age=Integer.parseInt(din.readLine());
					//st.executeUpdate("update stu1 set name="+name+"where roll="+roll);
//					String qu="update stu1 set name=? where roll=  "+roll;
//					ps=con.prepareStatement(qu);
//					ps.setInt(1, roll);
//					ps.setString(2,name);
					PreparedStatement ps1 = con.prepareStatement("update stul set name = ?,age=? where roll=?");
					System.out.println("Enter name : ");
					ps1.setString(1,sc.nextLine());
					System.out.println("Enter age : ");
					ps1.setInt(2, sc.nextInt());
					System.out.println("Where rollno is ");
					ps1.setInt(3, sc.nextInt());
					ps1.execute();
					break;
				case 3:
					//roll=Integer.parseInt(din.readLine());
					roll=sc.nextInt();
					st.executeUpdate("delete from stu1 where roll="+roll);
					
					break;
				case 4:
					ResultSet rs=st.executeQuery("select * from stu1");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
						
					}
					break;
				case 5:
					System.exit(0);
					st.close();
					con.close();
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}