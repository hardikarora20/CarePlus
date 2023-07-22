
package careplusapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import careplusapp.dbutil.DBConnection;
import careplusapp.pojo.User;
import careplusapp.pojo.UserPojo;

public class UserDao {
     public static String validateUser(User user) throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs=ps.executeQuery();
         System.out.println(ps);
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");
         }
         return name;
   }
     public static void updateName(String currName,String newName)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
        ps.setString(1, newName);
        ps.setString(2, currName);
        ps.executeUpdate();
   }
     public static boolean addUser(UserPojo user)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
        ps.setString(1,user.getLoginId());
        ps.setString(2,user.getUserName());
        ps.setString(3,user.getPassword());
        ps.setString(4, user.getUserType().toUpperCase());
        return ps.executeUpdate()==1;
   }
     public static void deleteUserByName(String name)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
        ps.setString(1, name);
        ps.executeUpdate();
   }
     public static String getLoginIdbyName(String name)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select login_id from users where user_name=?");
        ps.setString(1, name);
        ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getString(1);
     }

    public static boolean updateLoginPass(String loginID, String pwd1, String newLogin)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set login_id=?,password=? where login_id=?");
        ps.setString(1,newLogin);
        ps.setString(2,pwd1);
        ps.setString(3,loginID);
        return ps.executeUpdate()==1;
    }
}
