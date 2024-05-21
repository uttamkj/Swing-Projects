import java.sql.*;
public class First {
    public static void main(String[] args) {
       try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","uttam");
        String sql = "create table Employee(eid number,name varchar2(20),mobile number,email varchar2(30),dept_name varchar2(10),salary number)";
        Statement smt = con.createStatement();
        int i = smt.executeUpdate(sql);

        if(i == 0){
            System.out.println("Table created in DataBase ...");
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
    }
}
