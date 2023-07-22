
package careplusapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import careplusapp.dbutil.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import careplusapp.pojo.ReceptionistPojo;

public class ReceptionistDao {
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
public static String getNewRecId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(receptionist_id) from receptionists");
   rs.next();
   int recId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       recId=Integer.parseInt(num)+1;
    }
   return "REC"+recId;
}      
  public static boolean addReceptionist(ReceptionistPojo rec)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into receptionists values(?,?,?)");
     ps.setString(1,rec.getReceptionistId());
     ps.setString(2,rec.getReceptionistName());
     ps.setString(3,rec.getGender());
     
     return ps.executeUpdate()==1;
}
  public static List<ReceptionistPojo> getAllReceptionistDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from receptionists order by receptionist_id");
    List<ReceptionistPojo>recList=new ArrayList<>();
    while(rs.next()){
        ReceptionistPojo recep=new ReceptionistPojo();
        recep.setReceptionistId(rs.getString(1));
        recep.setReceptionistName(rs.getString(2));
        recep.setGender(rs.getString(3));
        recList.add(recep);
    }
    return recList;
} 
  public static boolean deleteRecById(String recID)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
     ps.setString(1, recID);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.deleteUserByName(docName);
     ps=conn.prepareStatement("Delete from receptionists where receptionist_id=?");
     ps.setString(1, recID);
     return ps.executeUpdate()==1;
}
  public static List<String> getAllRecId()throws SQLException
{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select receptionist_id from receptionists");
    List <String> recList=new ArrayList<>();
    while(rs.next())
    {
        recList.add(rs.getString(1));
    }
    return recList;
}
  public static String getRecNameById(String docId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
    ps.setString(1,docId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    return rs.getString(1);
    
 } 
  public static ReceptionistPojo getDetailsbyId(String recID)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from receptionists where receptionist_id=?");
    ps.setString(1, recID);
    ResultSet rs=ps.executeQuery();
    ReceptionistPojo recep=new ReceptionistPojo();
    while(rs.next()){
        recep.setReceptionistId(rs.getString(1));
        recep.setReceptionistName(rs.getString(2));
        recep.setGender(rs.getString(3));
    }
    return recep;
  }
  
 public static boolean updateRec(String recId, String gender)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set gender=? where receptionist_id=?");
     ps.setString(1, gender);
     ps.setString(2, recId);
     return ps.executeUpdate()==1;   
 }
}