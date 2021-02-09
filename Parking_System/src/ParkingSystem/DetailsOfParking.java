/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingSystem;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Calendar;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author PRABHANJAN
 */
public class DetailsOfParking extends javax.swing.JFrame {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String URL="jdbc:mysql://localhost:3306/Parking_System?zeroDateTimeBehavior=convertToNull";
    public static Connection conn = null;
    
    
    
    public DetailsOfParking() {
        initComponents();
        //setIcon();
        addData();
     }
    
   
    
    public void addData(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                String query = "select * from Parking_Details";
                PreparedStatement psmt = conn.prepareStatement(query);
                ResultSet rs = psmt.executeQuery(query);
                
                
                tblInformation.setModel(DbUtils.resultSetToTableModel(rs));
               
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(DetailsOfParking.this, "Sorry Application cannot start");
            }
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        cmbdate = new javax.swing.JComboBox<>();
        cmbMonth = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInformation = new javax.swing.JTable();
        btnanalysisBike = new javax.swing.JButton();
        cmbyear = new javax.swing.JComboBox<>();
        anaylisiCars = new javax.swing.JButton();
        SelectYearForAnylsis = new javax.swing.JComboBox<>();
        lblAnylisis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parking Details");
        setBackground(new java.awt.Color(204, 204, 255));
        setName("ParkingDetailFrame"); // NOI18N

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("         PARKING DETAILS");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Select Date       :");

        cmbdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblInformation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Number", "Vehicle Type", "Rupess", "Contact Number", "Parked Time", "Date", "Depart Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInformation);

        btnanalysisBike.setText("Analysis Bikes");
        btnanalysisBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanalysisBikeActionPerformed(evt);
            }
        });

        cmbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        anaylisiCars.setText("Analysis Cars");
        anaylisiCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaylisiCarsActionPerformed(evt);
            }
        });

        SelectYearForAnylsis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        lblAnylisis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAnylisis.setText("Select year for Anylsis ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblDate)
                        .addGap(18, 18, 18)
                        .addComponent(cmbdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAnylisis)
                .addGap(18, 18, 18)
                .addComponent(SelectYearForAnylsis, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnanalysisBike, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(anaylisiCars, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnanalysisBike, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anaylisiCars, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectYearForAnylsis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnylisis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FindDate(int chk, int date){
        String select = (chk == 1) ? "day" : (chk == 2) ? "month" : (chk == 3) ? "year" : "none"; 
         try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                
                PreparedStatement stmt = conn.prepareStatement("select * from Parking_Details where "+select+"=?");
                stmt.setInt(1,date);
                ResultSet rs = stmt.executeQuery();
                
                
                tblInformation.setModel(DbUtils.resultSetToTableModel(rs));
               
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(DetailsOfParking.this, "Sorry Application cannot start");
            }
    }
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
       int day =  Integer.parseInt(cmbdate.getSelectedItem().toString());
       int month = Integer.parseInt(cmbMonth.getSelectedItem().toString()); 
       int year = Integer.parseInt(cmbyear.getSelectedItem().toString());
       DefaultTableModel model = (DefaultTableModel) tblInformation.getModel();
       model.setRowCount(0);
       
       if(day == 0 && month == 0 && year == 0){
           JOptionPane.showMessageDialog(DetailsOfParking.this, "Please Select Date, month or year");
           return;
       }
       else if(day !=0 && month !=0 && year !=0){
           try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                
                PreparedStatement stmt = conn.prepareStatement("select * from Parking_Details where day=? and month=? and year=?");
                stmt.setInt(1,day);
                stmt.setInt(2,month);
                stmt.setInt(3,year);
                ResultSet rs = stmt.executeQuery();
                
                
                tblInformation.setModel(DbUtils.resultSetToTableModel(rs));
               
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(DetailsOfParking.this, "Sorry data can not be showen !");
            }
       }
       else{
           if(day != 0 && month == 0 && year == 0){
              FindDate(1,day);
           }
           else if(month != 0 && day == 0 && year ==0){
               FindDate(2,month);
           }
           else if(year != 0 && day == 0 && month == 0){
               FindDate(3,year);
           }
           else{
               JOptionPane.showMessageDialog(DetailsOfParking.this, "Select Appropriate Date");
           }
       }
       
    }//GEN-LAST:event_btnSearchActionPerformed

    int[] getData(int...year){
        int len = year.length, i=0;
        int[] cnt = new int[len];
        try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                while(len!=0){
                    PreparedStatement stmt = conn.prepareStatement("select Count(*) from Parking_Details where year=?");
                    stmt.setInt(1,year[i]);
                    ResultSet rs = stmt.executeQuery();
                    while(rs.next()){
                    cnt[i] = rs.getInt(1);
                    }
                    i++; len--;
                }
               
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(DetailsOfParking.this, "Sorry data can not be showen !");
                 return null;
            }
        return cnt;
    }
    
    public int getData(int month,String type){
        int year = Integer.parseInt(SelectYearForAnylsis.getSelectedItem().toString());
        year = (year == 0) ? Calendar.getInstance().get(Calendar.YEAR) : year; 
         try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("select Count(*) from Parking_Details where month=? and VehicleType=? and year=?");
                stmt.setInt(1,month);
                stmt.setString(2,type);
                stmt.setInt(3, year);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    int total =  (type=="Bike") ? rs.getInt(1)*5 : rs.getInt(1)*10;
                    System.out.println(total);
                    return total;
                }
         } catch(Exception e){
             return 0;
         }   
        return 0;
    }
    
    private void btnanalysisBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanalysisBikeActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //dataset.setValue(getData(1),"","January");
        //dataset.setValue(1000,"Amount","February");
        //dataset.setValue(1200,"Amount","March");
        //dataset.setValue(16000,"Amount","April");
        int jan_bike = getData(1,"Bike");
        
        int feb_bike = getData(2,"Bike");
        
        int mar_bike = getData(3,"Bike");
        
        int april_bike = getData(4,"Bike");
       
        int may_bike = getData(5,"Bike");
        
        int june_bike = getData(6,"Bike");
       
        int july_bike = getData(7,"Bike");
       
        int aug_bike = getData(8,"Bike");
        
        int sep_bike = getData(9,"Bike");
       
        int oct_bike = getData(10,"Bike");
       
        int nov_bike = getData(11,"Bike");
       
        int dec_bike = getData(12,"Bike");
        
        
        
        if(jan_bike != 0){
           dataset.addValue(jan_bike, "Total", "January");
        }
        
        
        if(feb_bike != 0){
           dataset.addValue(feb_bike, "Total", "February");
        }
        
        
        if(mar_bike != 0){
           dataset.addValue(mar_bike, "Total", "March");
        }
        
        
        if(april_bike != 0){
           dataset.addValue(april_bike, "Total", "April");
        }
       
        
        if(may_bike != 0){
           dataset.addValue(may_bike, "Total", "May");
        }
        
        
        if(june_bike != 0){
           dataset.addValue(june_bike, "Total", "June");
        }
        
        
        if(july_bike != 0){
           dataset.addValue(july_bike, "Total", "July");
        }
        
        
        if(aug_bike != 0){
           dataset.addValue(aug_bike, "Total", "August");
        }
        
        
        if(sep_bike != 0){
           dataset.addValue(sep_bike, "Total", "September");
        }
        
        
        if(oct_bike != 0){
           dataset.addValue(oct_bike, "Total", "October");
        }
        
        
        if(nov_bike != 0){
           dataset.addValue(nov_bike, "Total", "November");
        }
        
        
        if(dec_bike != 0){
           dataset.addValue(dec_bike, "Total", "December");
        }
       
        JFreeChart chart = ChartFactory.createBarChart("Bikes", "Month", "Total Profit", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.GREEN);
        ChartFrame frame = new ChartFrame("Bikes Anylisis",chart);
        frame.setVisible(true);
        frame.setSize(750,950);
    }//GEN-LAST:event_btnanalysisBikeActionPerformed

    private void anaylisiCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaylisiCarsActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int jan_Car = getData(1,"Car");
        int feb_Car = getData(2,"Car");
        int mar_Car = getData(3,"Car");
        int april_Car = getData(4,"Car");
        int may_Car = getData(5,"Car");
        int june_Car = getData(6,"Car");
        int july_Car = getData(7,"Car");
        int aug_Car = getData(8,"Car");
        int sep_Car = getData(9,"Car");
        int oct_Car = getData(10,"Car");
        int nov_Car = getData(11,"Car");
        int dec_Car = getData(12,"Car");
        
        if(jan_Car != 0){
            dataset.addValue(jan_Car, "Total", "January");
        }
        
        if(feb_Car != 0){
            dataset.addValue(feb_Car, "Total", "February");
        }
        
        if(mar_Car != 0){
            dataset.addValue(mar_Car, "Total", "March");
        }
        
        if(april_Car != 0){
            dataset.addValue(april_Car, "Total", "April");
        }
        
        if(may_Car != 0){
            dataset.addValue(may_Car, "Total", "May");
        }
        
        if(june_Car != 0){
            dataset.addValue(june_Car, "Total", "June");
        }
        
        if(july_Car != 0){
            dataset.addValue(july_Car, "Total", "July");
        }
        
        if(aug_Car != 0){
            dataset.addValue(aug_Car, "Total", "August");
        }
        
        if(sep_Car != 0){
            dataset.addValue(sep_Car, "Total", "September");
        }
        
        if(oct_Car != 0){
            dataset.addValue(oct_Car, "Total", "October");
        }
        
        if(nov_Car != 0){
            dataset.addValue(nov_Car, "Total", "November");
        }
        
        if(dec_Car != 0){
            dataset.addValue(dec_Car, "Total", "December");
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Cars", "Month", "Total Profit", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.RED);
        ChartFrame frame = new ChartFrame("Car Anylisis",chart);
        frame.setVisible(true);
        frame.setSize(750,850);
    }//GEN-LAST:event_anaylisiCarsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetailsOfParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsOfParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsOfParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsOfParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsOfParking().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelectYearForAnylsis;
    private javax.swing.JButton anaylisiCars;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnanalysisBike;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbdate;
    private javax.swing.JComboBox<String> cmbyear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnylisis;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblInformation;
    // End of variables declaration//GEN-END:variables
}
