//STEP 1. Import required packages
import java.sql.*;

public class JDBCDemo {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/Program1";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT COUNT(*) `count` FROM Student";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int count  = rs.getInt("count");
         //Display values
         System.out.println("Total Number of Students: " + count);
      }
      
      System.out.println("Average Marks of Students");

      stmt = conn.createStatement();
      sql = "SELECT AVG(marks) `avg`,name FROM Results  LEFT JOIN Student ON Student.id = student_id GROUP BY student_id";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         float avg  = rs.getFloat("avg");
         String name = rs.getString("name");
         //Display values
         System.out.println("Avg Marks of " + name +" : " + avg);
      }

      System.out.println("Student Scoring Max Marks");

      stmt = conn.createStatement();
      sql = "SELECT SUM(marks) `total_marks` , name FROM Results  LEFT JOIN Student ON Student.id = student_id GROUP BY student_id ORDER BY `total_marks` DESC LIMIT 1";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int max  = rs.getInt("total_marks");
         String name = rs.getString("name");
         //Display values
         System.out.println("Max Marks Obtained by: " + name +" : " + max);
      }

      System.out.println("Subject Wise Toppers");

      stmt = conn.createStatement();
      sql = "SELECT MAX(marks) `top_marks`,name,subject FROM Results LEFT JOIN Student ON Student.id = student_id GROUP BY subject";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int max  = rs.getInt("top_marks");
         String name = rs.getString("name");
         String subject = rs.getString("subject");
         //Display values
         System.out.println(subject + " Max Marks Obtained by: " + name +" : " + max);
      }

      System.out.println("Average Marks of Students in all subjects");

      stmt = conn.createStatement();
      sql = "SELECT AVG(marks) `avg` FROM Results";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         float avg  = rs.getFloat("avg");
         //Display values
         System.out.println("Avg Marks : " + avg);
      }

      System.out.println("Student Scoring Second Highest Marks");

      stmt = conn.createStatement();
      sql = "SELECT SUM(marks) `total_marks` , name FROM Results  LEFT JOIN Student ON Student.id = student_id GROUP BY student_id  ORDER BY `total_marks` DESC LIMIT 1,1";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int max  = rs.getInt("total_marks");
         String name = rs.getString("name");
         //Display values
         System.out.println("Second Highest Marks Obtained by: " + name +" : " + max);
      }

      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end FirstExample