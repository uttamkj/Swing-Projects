import java.sql.*;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "uttam");
            int eid = Integer.parseInt(sc.nextLine());
            

            String sql = "create table Employee(eid number,name varchar2(20),mobile number,email varchar2(30),dept_name varchar2(10),salary number)";
            Statement smt = con.createStatement();
            int i = smt.executeUpdate(sql);


            smt.close();
            con.close();
        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        } catch (SQLException se) {
            System.out.println(se);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
