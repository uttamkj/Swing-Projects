import java.sql.*;
class Three{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","uttam");
			if(con != null){
				System.out.println("Connected....");
			}
			
			String qry = "select * from Employee1";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(qry);
			// while(rs.next()){
			// 	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
			// }
			while(rs.next()){
				int eid = rs.getInt("eid"); 
				String name = rs.getString("name");
				String mobile = rs.getString("mobile");
				String email = rs.getString("email");
				String dept_name = rs.getString("dept_name");
				int salary = rs.getInt("salary");

				System.out.println(eid + "\t" + name + "\t" + mobile + "\t" + email + "\t" + dept_name + "\t" + salary);
			}
			
			rs.close();
			smt.close();
			con.close();
			
		}catch(ClassNotFoundException ce){
			System.out.println(ce);
		}catch(SQLException se){
			System.out.println(se);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}