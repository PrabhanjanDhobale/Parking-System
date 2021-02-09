/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingSystem;

import java.sql.*;
import java.util.Arrays;
/**
 *
 * @author PRABHANJAN
 */
public class DatabaseConnection {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String URL="jdbc:mysql://localhost:3306/Parking_System?zeroDateTimeBehavior=convertToNull";
    public static Connection conn = null;
   
    
    public boolean Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch(Exception ex){
            return false;
        } 
        return true;

    }
    
    public boolean insertAdminData(String n, String s, String pl, String d, int bike_rs, int car_rs, String p){
        if(Connect()){
            try{
                PreparedStatement preparedStmt = conn.prepareStatement("insert into Admin values(?,?,?,?,?,?,?)");
                preparedStmt.setString(1, n);
                preparedStmt.setString(2, s);
                preparedStmt.setString(3, pl);
                preparedStmt.setString(4, d);
                preparedStmt.setInt(5, bike_rs);
                preparedStmt.setInt(6, car_rs);
                preparedStmt.setString(7, p);
                
                preparedStmt.executeUpdate();
                
            } catch(Exception ex){
                CloseConnection();
                return false;
            } 
        }
        else{
            CloseConnection();
            return false;
        }
        CloseConnection();
        return true;
    }
    
    public int CheckDatainAdmin(){
        //DatabaseConnection cn = new DatabaseConnection();
        if(Connect()){
            try{
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery("select * from Admin");
               boolean b = rs.last();
               int i = rs.getRow();
               if(i == 0){
                   CloseConnection();
                   return 0;
               }
               
            }catch(SQLException ex){
                CloseConnection();
                return -1;
            }
        }
        else {
            CloseConnection();
            return -1;
        }
        CloseConnection();
        return 1;
    }
    
    public String getDestination(){
        String destination = "none";
        if(Connect()){
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select destination from admin");
                while(rs.next()){
                    destination = rs.getString("destination");
                }
            } catch(SQLException ex){
                CloseConnection();
                return "none";
            }
        }
        CloseConnection();
        return destination;
    }
    
    
    public boolean updatePassword(String password){
        if(Connect()){
            try{
                PreparedStatement preparedStmt = conn.prepareStatement("update admin set password = ?");
                preparedStmt.setString(1, password);
                
                preparedStmt.executeUpdate();
            } catch(SQLException ex){
                return false;
            }
        } else{
            return false;
        }
        CloseConnection();
        return true;
    }
    
    boolean Validate(String user, String pass, String Username, String Password){
        if(user.equals(Username) && pass.equals(Password)){
            return true;
        }
        return false;
    }
    
    public boolean ValidateLogIn(String user, String pass){
        String username="none", password="none";
        if(Connect()){
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select Name, password from admin");
                while(rs.next()){
                username = rs.getString("Name");
                
                password = rs.getString("password");
                }
                //System.out.println("Username is "+username+" password is "+password);
            } catch(SQLException ex){
                CloseConnection();
                //System.out.println("not connected");
                return false;
            }
        } else{
            //System.out.println("not connected 3");
            return false;
        }
        if(Validate(user,pass,username,password)){
            //System.out.println("Login successfull");
            return true;
        }
        return false;
    }
    
    int getRupess(String VehicleType){
        if(Connect()){
            try{
                Statement stmt = conn.createStatement();
                String query = "select "+VehicleType+"_price from admin";
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                return rs.getInt(VehicleType+"_price");
                }
            } catch(SQLException ex){
                CloseConnection();
                //return false;
                
            }
        }
        return 0;
    }
    
    
    public boolean insertDataintoParkingInfo(String VehicleNumber, String VehicleType, long ContactNumber,int rupess, String date, String Parkedtime){
            String[] Alldate = date.split("-");
            int year = Integer.parseInt(Alldate[0]);
            int month = Integer.parseInt(Alldate[1]);
            int day = Integer.parseInt(Alldate[2]);
            String DepartTime = "none";
            
            if(Connect()){
                try{
                  PreparedStatement stmt = conn.prepareStatement("select * from Parking_Info where VehicleNumber=?");
                  stmt.setString(1,VehicleNumber);
                  ResultSet rs = stmt.executeQuery();  
                  if(rs.next() == false){
                    PreparedStatement preparedStmt = conn.prepareStatement("insert into Parking_Info values(?)");
                    preparedStmt.setString(1, VehicleNumber);
                
                    preparedStmt.executeUpdate();
                  }
                 
                PreparedStatement preparedStmt2 = conn.prepareStatement("insert into Parking_Details values(?,?,?,?,?,?,?,?,?)");
                preparedStmt2.setString(1, VehicleNumber);
                preparedStmt2.setString(2, VehicleType);
                preparedStmt2.setInt(3, rupess);
                preparedStmt2.setLong(4, ContactNumber);
                preparedStmt2.setString(5, Parkedtime);
                preparedStmt2.setString(6, DepartTime);
                preparedStmt2.setInt(7, day);
                preparedStmt2.setInt(8, month);
                preparedStmt2.setInt(9, year);
                
                preparedStmt2.executeUpdate();
            } catch(Exception ex){
                CloseConnection();
                return false;
                } 
            } else{
                return false;
            }
            CloseConnection();
       return true;
    }
    

    
    public String[] SearchinParkingDetails(String Number){
        String[] details = new String[7];
        if(Connect()){
            try{
                //String qry = ;
                PreparedStatement stmt = conn.prepareStatement("select * from Parking_Details where VehicleNumber=?");
                stmt.setString(1,Number);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    //System.out.println(rs.getString("VehicleNumber"));
                    details[0] = rs.getString("VehicleNumber");
                    //System.out.println(details[0]);
                    details[1] = rs.getString("VehicleType");
                    //System.out.println(details[1]);
                    details[2] = Integer.toString(rs.getInt("Rupess"));
                    //System.out.println(details[2]);
                    details[3] = Long.toString(rs.getLong("ContactNumber"));
                    //System.out.println(details[3]);
                    details[4] = rs.getString("ParkedTime");
                    //System.out.println(details[4]);
                    details[5] = rs.getString("DepartTime");
                    //System.out.println(details[5]);
                    details[6] = Integer.toString(rs.getInt("day")) + "-" + Integer.toString(rs.getInt("month")) + "-" + Integer.toString(rs.getInt("year"));
                    //System.out.println(details[6]);
                }
                
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }else{
            System.out.println("Sorry");
            details[0]="none";
        }
        return details;
    }
    
    public boolean UpdateDepartTime(String time, String VehicleNumber){
        if(Connect()){
            try{
                PreparedStatement preparedStmt = conn.prepareStatement("update Parking_Details set DepartTime = ? where VehicleNumber = ?");
                preparedStmt.setString(1, time);
                preparedStmt.setString(2, VehicleNumber);
                
                preparedStmt.executeUpdate();
            } catch(SQLException ex){
                return false;
            }
        }
        else {
            return false;
        }
        return true;
    }
    
    public String getParkingName(){
        if(Connect()){
            try{
                Statement stmt = conn.createStatement();
                String query = "select place from admin";
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                return rs.getString("place");
                }
            } catch(Exception ex){
                return "null";
            }
        }
        return "null";
    }
    
    /*public static void main(String[] args){
        DatabaseConnection cn = new DatabaseConnection();
        cn.getParkingName();
        //cn.getRupess("Car");
        //boolean chk = cn.ValidateLogIn("Ra","1234");
    }*/
    
    
    
    public void CloseConnection(){
        try{
            conn.close();
        } catch(SQLException ex){
            /*Connection not close*/
        }
    }
    
}

