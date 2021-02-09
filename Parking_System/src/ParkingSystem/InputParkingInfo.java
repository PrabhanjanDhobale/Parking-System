/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingSystem;
import java.awt.HeadlessException;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
/**
 *
 * @author PRABHANJAN
 */
public class InputParkingInfo extends javax.swing.JFrame {

    DatabaseConnection cn = new DatabaseConnection();
    DefaultTableModel model;
    /**
     * Creates new form InputParkingInfo
     */
    public InputParkingInfo() {
        initComponents();
        model = (DefaultTableModel)tblInputedData.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVehiclenumber = new javax.swing.JLabel();
        txtVehicalnumberinput = new javax.swing.JTextField();
        btnSearchVehicalNumber = new javax.swing.JButton();
        btnVehicleInfo = new javax.swing.JButton();
        sepretor = new javax.swing.JSeparator();
        lblParkingInfo = new javax.swing.JLabel();
        lblVehiclenum = new javax.swing.JLabel();
        txtVehiclenumber = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblSelectVehicle = new javax.swing.JLabel();
        cmbSelectVehicle = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInputedData = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnDepart = new javax.swing.JButton();
        btnVehicleParked = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking Info");
        setBackground(new java.awt.Color(204, 204, 255));
        setName("ParkingInfo"); // NOI18N

        lblVehiclenumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVehiclenumber.setText("Enter Vehicle Number   :");

        btnSearchVehicalNumber.setText("Search");
        btnSearchVehicalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchVehicalNumberActionPerformed(evt);
            }
        });

        btnVehicleInfo.setBackground(new java.awt.Color(204, 204, 255));
        btnVehicleInfo.setText("See all Vehicle info");
        btnVehicleInfo.setBorderPainted(false);
        btnVehicleInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleInfoActionPerformed(evt);
            }
        });

        sepretor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), null));

        lblParkingInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParkingInfo.setText("               PARKING INFORMATION");

        lblVehiclenum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVehiclenum.setText("Enter Vehicle Number        :");

        lblContactNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContactNumber.setText("Enter Contact Number       :");

        lblSelectVehicle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectVehicle.setText("Select Vehicle        :");

        cmbSelectVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<----Select---->", "Bike", "Car" }));

        tblInputedData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblInputedData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblInputedData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Number", "Vehicle Type", "Rupess", "Contact Number", "Parked Time", "Date", "Depart Time"
            }
        ));
        jScrollPane1.setViewportView(tblInputedData);

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnDepart.setText("Vehicle Depart");
        btnDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartActionPerformed(evt);
            }
        });

        btnVehicleParked.setText("Vehicle Parked");
        btnVehicleParked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleParkedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(lblParkingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblVehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVehicalnumberinput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnSearchVehicalNumber)))
                .addGap(363, 363, 363)
                .addComponent(btnVehicleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(sepretor, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblVehiclenum)
                .addGap(16, 16, 16)
                .addComponent(txtVehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(lblSelectVehicle)
                .addGap(18, 18, 18)
                .addComponent(cmbSelectVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277)
                .addComponent(btnVehicleParked, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(589, 589, 589)
                .addComponent(btnDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblParkingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtVehicalnumberinput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnSearchVehicalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnVehicleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(sepretor, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVehiclenum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtVehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblSelectVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cmbSelectVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVehicleParked, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchVehicalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchVehicalNumberActionPerformed
        // TODO add your handling code here:
        if(txtVehicalnumberinput.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(InputParkingInfo.this, "Please enter Vehicle Number");
            return;
        }
        
        String[] details = cn.SearchinParkingDetails(txtVehicalnumberinput.getText().trim().replaceAll("\\s", "").toUpperCase());
        if(details[0] != null){
            model.addRow(new Object[]{details[0],details[1],details[2],details[3],details[4],details[6],details[5]});
        }
        else{
            JOptionPane.showMessageDialog(InputParkingInfo.this,"Data not found");
        }
    }//GEN-LAST:event_btnSearchVehicalNumberActionPerformed

    private void btnVehicleParkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleParkedActionPerformed
        // TODO add your handling code here:
        boolean chk=true;
        if(txtVehiclenumber.getText().trim().isEmpty()){
            chk=false;
            JOptionPane.showMessageDialog(InputParkingInfo.this, "Please enter Vehicle Number");
            return;
        }
        
        if(cmbSelectVehicle.getSelectedIndex() == 0){
                chk=false;
                JOptionPane.showMessageDialog(InputParkingInfo.this, "Please Select Vehicle");
                return;
        }
        
        if(txtContactNumber.getText().trim().isEmpty()){
                    chk=false;
                    JOptionPane.showMessageDialog(InputParkingInfo.this, "Please enter Contact Number");
                    return;
        }
        
        if(chk == true){
            String VehicleNumber = txtVehiclenumber.getText().trim().replaceAll("\\s", "").toUpperCase();
            String Vehicle = cmbSelectVehicle.getSelectedItem().toString();
            long ContactNumber = Long.parseLong(txtContactNumber.getText());
            String date = java.time.LocalDate.now().toString();
            String currenttime = java.time.LocalTime.now().toString();
            int Rupess = cn.getRupess(Vehicle);
      
            if(cn.insertDataintoParkingInfo(VehicleNumber, Vehicle, ContactNumber,Rupess, date, currenttime)){
                model.insertRow(tblInputedData.getRowCount(), new Object[]{
                    VehicleNumber,
                    Vehicle,
                    Rupess,
                    ContactNumber,
                    currenttime,
                    date
                });
                txtVehiclenumber.setText("");
                cmbSelectVehicle.setSelectedIndex(0);
                txtContactNumber.setText("");
                SendMessage(VehicleNumber,Long.toString(ContactNumber),currenttime,date);
            }
            else{
                JOptionPane.showMessageDialog(InputParkingInfo.this, "Sorry Data can not be inserted");
                return;
            }
        }
        
    }//GEN-LAST:event_btnVehicleParkedActionPerformed

    private void SendMessage(String...a){
        // Construct data
                        String api = "ssA9Wg5mPeM-SuqDb0Au1LWoikX3Dks4WcemVgYBbl";
			String apiKey = "apikey=" + api;
			String message = "&message=" + "Your bike "+a[0]+" has parked at "+a[3]+" at time "+a[2];
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + a[1];
			
        		try {
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
                            try (BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                                final StringBuffer stringBuffer = new StringBuffer();
                                String line;
                                while ((line = rd.readLine()) != null) {
                                    //stringBuffer.append(line);
                                    JOptionPane.showMessageDialog(InputParkingInfo.this, "message sent successfully");
                                }
                               rd.close();
                                //return stringBuffer.toString();
                            }
		} catch (HeadlessException | IOException e) {
			JOptionPane.showMessageDialog(InputParkingInfo.this, "Message sent successfully");
		}
    }
    
    private void btnVehicleInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleInfoActionPerformed
        // TODO add your handling code here:
        //DetailsOfParking dp = new DetailsOfParking();
        //dp.addData();
        new DetailsOfParking().setVisible(true);
        
    }//GEN-LAST:event_btnVehicleInfoActionPerformed

    private void btnDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartActionPerformed

        int row = tblInputedData.getSelectedRow();
        String date = tblInputedData.getModel().getValueAt(0,5).toString();
        String time = java.time.LocalTime.now().toString();
        String VehicleNumber = tblInputedData.getModel().getValueAt(row, 0).toString();
        Long Number = Long.parseLong(tblInputedData.getModel().getValueAt(row, 3).toString());
        System.out.println(VehicleNumber);
        if(cn.UpdateDepartTime(time, VehicleNumber)){
            model.setValueAt(time, row, 6);
            SendMessage(VehicleNumber,Long.toString(Number),time,time);
        }else{
            JOptionPane.showMessageDialog(InputParkingInfo.this, "Depart time con not updated");
        }
        
    }//GEN-LAST:event_btnDepartActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String data[] = new String[4];
        int row = tblInputedData.getSelectedRow();
        data[0] = tblInputedData.getModel().getValueAt(0, 0).toString();
        
        data[1] = tblInputedData.getModel().getValueAt(0, 2).toString();
        
        data[2] = tblInputedData.getModel().getValueAt(0, 5).toString();
        
        data[3] = tblInputedData.getModel().getValueAt(0, 6).toString();
        
        //ReciptFrame fr = new ReciptFrame();
        //fr.Printdata(data);
        new ReciptFrame(data).setVisible(true);
        
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(InputParkingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputParkingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputParkingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputParkingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputParkingInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepart;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearchVehicalNumber;
    private javax.swing.JButton btnVehicleInfo;
    private javax.swing.JButton btnVehicleParked;
    private javax.swing.JComboBox<String> cmbSelectVehicle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblParkingInfo;
    private javax.swing.JLabel lblSelectVehicle;
    private javax.swing.JLabel lblVehiclenum;
    private javax.swing.JLabel lblVehiclenumber;
    private javax.swing.JSeparator sepretor;
    private javax.swing.JTable tblInputedData;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtVehicalnumberinput;
    private javax.swing.JTextField txtVehiclenumber;
    // End of variables declaration//GEN-END:variables
}
