import java.sql.*;
import java.util.Scanner;
public class Two{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","uttam");
			if(con!= null){
				System.out.println("Connection done...");
			}
			System.out.println("Enter eid: ");
			int eid = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter mobile number: ");
			//int mobile = Integer.parseInt(sc.nextLine());
			String  mobile = sc.nextLine();
			
			System.out.println("Enter email: ");
			String email = sc.nextLine();
			
			System.out.println("Enter dept name: ");
			String dept_name = sc.nextLine();
			
			System.out.println("Enter salary: ");
			int salary = Integer.parseInt(sc.nextLine());
			
			//String qry = "INSERT into Employee1 values("+eid+",'"+name+"',"+mobile+",'"+email+"','"+dept_name+"',"+salary+")";
			String qry = "INSERT into Employee1 values("+eid+",'"+name+"','"+mobile+"','"+email+"','"+dept_name+"',"+salary+")";
			
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
			if(i>0){
				System.out.println(i+ "row inserted...");
			}
			
			smt.close();
			con.close();
		}catch(NumberFormatException ne){
			System.out.println(ne);
		}catch(ClassNotFoundException ce){
			System.out.println(ce);
		}catch(SQLException se){
			System.out.println(se);
		}catch(Exception e){
			System.out.println(e);
		}
		sc.close();
	}
}