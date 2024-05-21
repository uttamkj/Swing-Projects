import java.sql.*;
import java.util.Scanner;
class Five{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter the eid: ");
			int id = Integer.parseInt(sc.nextLine());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","uttam");
			
			
			String qry = "delete  Employee1 where eid = "+id+"";
			
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
			
			if(i>0){
				System.out.println(i+"row deleted....");
			}
			smt.close();
			con.close();
			
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