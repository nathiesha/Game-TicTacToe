/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yas
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import main.UserData;
 
public class DataBase 
{
    private static DataBase instance = null;
    int next=1;
        String DATABASE_URL;
      Connection connection ;
      Statement statement ;
      ResultSet resultSet;
      public DataBase(){
            DATABASE_URL = "jdbc:mysql://localhost:3306/win_games";
            connection = null;
            statement = null;
            resultSet = null;
            
      }
      
   public  void init(String str )
   {int tem=0;
 
      try
      {   Class.forName("com.mysql.jdbc.Driver"); 
         connection = DriverManager.getConnection( DATABASE_URL, "root", "sri" ); 
         statement = connection.createStatement();           
            resultSet = statement.executeQuery("select * from records");
            if(resultSet.next()) {
                if(str.compareTo(resultSet.getString("player"))==0){
                    tem=resultSet.getInt("wins");
                    tem++;
                    String updateTableSQL = "UPDATE records"
				+ " SET wins = "+ tem
				+ " WHERE player = 'user'";
                    statement.executeUpdate(updateTableSQL);
                  
                }
                else{
                resultSet.next();                   
                 tem=resultSet.getInt("wins");
                 tem++;
                 //   System.out.println(resultSet.getInt("wins"));
                 String updateTableSQL = "UPDATE records"
				+ " SET wins = "+ tem
				+ " WHERE player = 'computer'";
                statement.executeUpdate(updateTableSQL);
               // System.out.println(resultSet.getInt("wins"));
                }
            }
            resultSet.close();
      } 
      catch ( SQLException sqlException )                                
      {                                                                  
         sqlException.printStackTrace();
      } catch (ClassNotFoundException ex) {                                                 
          Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
       }                                                 
                                          
   } 
   
  public int result(String str){
       try
      {   Class.forName("com.mysql.jdbc.Driver"); 
         connection = DriverManager.getConnection( DATABASE_URL, "root", "sri" ); 
         statement = connection.createStatement();           
            resultSet = statement.executeQuery("select * from records");
            if(resultSet.next()) {
                if(str.compareTo(resultSet.getString("player"))==0){
                    return resultSet.getInt("wins");          
                }
                else{
                resultSet.next();                   
                 return resultSet.getInt("wins");                
                }
            }
            resultSet.close();
      } 
      catch ( SQLException sqlException )                                
      {                                                                  
         sqlException.printStackTrace();
      } catch (ClassNotFoundException ex) {                                                 
          Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
       }  
       
    return 100;
  }
  //=======================================================================================
  public void clear (){
       try
      {   Class.forName("com.mysql.jdbc.Driver"); 
        connection = DriverManager.getConnection( DATABASE_URL, "root", "sri" ); 
         statement = connection.createStatement();           
            resultSet = statement.executeQuery("select * from records");
            if(resultSet.next()) {
                if(resultSet.next()) {
                 String updateTableSQL = "UPDATE records"
				+ " SET wins =  0"
				+ " WHERE player = 'computer'";
                statement.executeUpdate(updateTableSQL);                                 
                 updateTableSQL = "UPDATE records"
				+ " SET wins =  0"
				+ " WHERE player = 'user'";
                statement.executeUpdate(updateTableSQL);                             
            }
            }
            resultSet.close();
      } 
      catch ( SQLException sqlException )                                
      {                                                                  
         sqlException.printStackTrace();
      } catch (ClassNotFoundException ex) {                                                 
          Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
       }                                                   
  }
  //=======================================================================================
   public static DataBase getInstance() {
      if(instance == null) {
         instance = new DataBase();
      }
      return instance;
   }
}
/*
public static void main(String args[]) {
        DataBase db= getInstance();
        db.init("user");
       
    }
}*/