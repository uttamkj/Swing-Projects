import java.sql.*;
class Test{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","23mmci80","uttam");
			if(con != null){
				System.out.println("Connected....");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}