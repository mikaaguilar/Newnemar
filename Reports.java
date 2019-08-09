
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.BasicConfigurator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSC-MITS
 */
public class Reports extends javax.swing.JFrame {
public Connection con,conn;
public PreparedStatement st;
public ResultSet rs; 
public String sql;
public String ct,cd,br,dp,ow,cond,ed,sd;

    public Reports() {
        initComponents();
    ButtonGroup bg1 = new ButtonGroup( );
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    bg1.add(jRadioButton1);
    bg1.add(jRadioButton2);
    bg1.add(jRadioButton3);
    bg1.add(jRadioButton4);
    sort();
    SortAll();
    branch();
    setIcon();    
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height*12/25-this.getSize().height/2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        history = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inventory = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setForeground(new java.awt.Color(0, 0, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inventory", "History" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jScrollPane1.setViewportView(tbl);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel1.setLayout(new java.awt.CardLayout());

        history.setBackground(new java.awt.Color(255, 255, 255));
        history.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("from");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("to");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Computer", "CCTV", "Printer", "Others" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Purchased", "Repaired", "Transfered", "Disposed" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Branch");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Search by Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Category");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Action");

        javax.swing.GroupLayout historyLayout = new javax.swing.GroupLayout(history);
        history.setLayout(historyLayout);
        historyLayout.setHorizontalGroup(
            historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, 96, Short.MAX_VALUE))
                .addGroup(historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(historyLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(456, Short.MAX_VALUE))))
        );
        historyLayout.setVerticalGroup(
            historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(history, "card3");

        inventory.setBackground(new java.awt.Color(255, 255, 255));
        inventory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Computer");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("CCTV");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Printer");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Working", "Disposed", "For Shipping", "In Repair", "Pending" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Others");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Device:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Status:");

        javax.swing.GroupLayout inventoryLayout = new javax.swing.GroupLayout(inventory);
        inventory.setLayout(inventoryLayout);
        inventoryLayout.setHorizontalGroup(
            inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inventoryLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inventoryLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(21, 21, 21)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        inventoryLayout.setVerticalGroup(
            inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(inventory, "card2");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(13, 13, 129));
        jLabel10.setText("Preview:");

        jPanel8.setBackground(new java.awt.Color(0, 0, 103));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Get Report");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel103)
                .addContainerGap())
        );

        jButton3.setText("Try");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(83, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(972, 972, 972)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(99, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(636, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
SortAll();     
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
SortAll();       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
SortAll();     
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
SortAll();     
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
SortAll();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
sort();       
    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
SortAll1();       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
SortAll1();  
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
SortAll1();
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
SortDate();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
MessageFormat header = new MessageFormat("New Nemar Development Corporation");
MessageFormat footer = new MessageFormat("Page - {0}");
try{
    boolean complete = tbl.print(JTable.PrintMode.FIT_WIDTH,header,footer);
    if (complete) {
    JOptionPane.showMessageDialog(null,"Print Successful");
    this.dispose();
    }
}
catch(java.awt.print.PrinterException e){
JOptionPane.showMessageDialog(null, e);
System.err.format("Cannot print %s%n", e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
pAll1("SELECT dbo.invPC.Branch,dbo.invPC.Dept,dbo.invPC.Owner,dbo.invPC.Proce,dbo.invPC.MBoard,dbo.invPC.Ram,dbo.invPC.HDD,dbo.invPC.Moni,dbo.invPC.UPS,dbo.invPC.KeyB,dbo.invPC.Mouse FROM dbo.invPC");

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BasicConfigurator.configure();
//String log4jConfPath = System.getProperty("user.dir")+File.separator+"log4j.properties";
    //PropertyConfigurator.configure(log4jConfPath);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel history;
    private javax.swing.JPanel inventory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
public void sort(){
String choice = jComboBox1.getSelectedItem().toString();
if(choice.equals("Inventory")){
jRadioButton1.isSelected();
inventory.setVisible(true);
history.setVisible(false);
SortAll();
}
else if(choice.equals("History")){
inventory.setVisible(false);
history.setVisible(true);  
SortAll1();
}
}
public void showTbl(String command){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();               
ResultSet rs=st.executeQuery(command); 
tbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void SortAll(){
cond = jComboBox2.getSelectedItem().toString();
    if(jRadioButton1.isSelected()){
if(cond.equals("Working")) {     
showTbl("SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk FROM dbo.invPC WHERE Stat = 'WORKING' ORDER by Branch");
}
if(cond.equals("Disposed")) {     
showTbl("SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk FROM dbo.invPC WHERE Stat = 'DISPOSED' ORDER by Branch");
}
if(cond.equals("For Shipping")) {     
showTbl("SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk FROM dbo.invPC WHERE Stat = 'FOR SHIPPING' ORDER by Branch");
}
if(cond.equals("In Repair")) {     
showTbl("SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk FROM dbo.invPC WHERE Stat = 'FOR REPAIR' ORDER by Branch");
}
if(cond.equals("Pending")) {     
showTbl("SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk FROM dbo.invPC WHERE Stat = 'PENDING' ORDER by Branch");
}
if(cond.equals("All")) {     
showTbl("SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk,Stat as Status FROM dbo.invPC ORDER by Branch");
}
 setJTableColumnsWidth(tbl, 480, 1, 1, 1, 80, 80, 1, 1,1);
Reports.setCellsAlignment1(tbl, SwingConstants.CENTER);
   }
   if(jRadioButton2.isSelected()){
if(cond.equals("Working")) { 
showTbl("SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password FROM dbo.invCC WHERE Stat = 'WORKING' ORDER by Branch");   
}
if(cond.equals("Disposed")) { 
showTbl("SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password FROM dbo.invCC WHERE Stat = 'DISPOSED' ORDER by Branch");     
} 
if(cond.equals("For Shipping")) { 
showTbl("SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password FROM dbo.invCC WHERE Stat = 'FOR SHIPPING' ORDER by Branch");     
} 
if(cond.equals("In Repair")) { 
showTbl("SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password FROM dbo.invCC WHERE Stat = 'FOR REPAIR' ORDER by Branch");      
} 
if(cond.equals("Pending")) { 
showTbl("SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password FROM dbo.invCC WHERE Stat = 'PENDING' ORDER by Branch");      
} 
if(cond.equals("All")) { 
showTbl("SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password,Stat as Status FROM dbo.invCC ORDER by Branch");     
} 
   }
  if(jRadioButton3.isSelected()){
if(cond.equals("Working")) { 
showTbl("SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name FROM dbo.invPR WHERE Stat = 'WORKING' ORDER by Branch");   
}
if(cond.equals("Disposed")) { 
showTbl("SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name FROM dbo.invPR WHERE Stat = 'DISPOSED' ORDER by Branch");    
} 
if(cond.equals("For Shipping")) { 
showTbl("SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name FROM dbo.invPR WHERE Stat = 'FOR SHIPPING' ORDER by Branch");    
} 
if(cond.equals("In Repair")) { 
showTbl("SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name FROM dbo.invPR WHERE Stat = 'FOR REPAIR' ORDER by Branch");     
} 
if(cond.equals("Pending")) { 
showTbl("SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name FROM dbo.invPR WHERE Stat = 'PENDING' ORDER by Branch");     
} 
if(cond.equals("All")) { 
showTbl("SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name,Stat as Status FROM dbo.invPR ORDER by Branch");     
} 
   }
  if(jRadioButton4.isSelected()){
if(cond.equals("Working")) { 
showTbl("SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality FROM dbo.invOT WHERE Stat = 'WORKING' ORDER by Branch");   
}
if(cond.equals("Disposed")) { 
showTbl("SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality FROM dbo.invOT WHERE Stat = 'DISPOSED' ORDER by Branch");    
} 
if(cond.equals("For Shipping")) { 
showTbl("SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality FROM dbo.invOT WHERE Stat = 'FOR SHIPPING' ORDER by Branch");    
} 
if(cond.equals("In Repair")) { 
showTbl("SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality FROM dbo.invOT WHERE Stat = 'FOR REPAIR' ORDER by Branch");     
}
if(cond.equals("Pending")) { 
showTbl("SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality FROM dbo.invOT WHERE Stat = 'PENDING' ORDER by Branch");    
}
if(cond.equals("All")) { 
showTbl("SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality,Stat as Status FROM dbo.invOT ORDER by Branch");     
} 
   } 
}
public void SortAll1(){
ct = jComboBox3.getSelectedItem().toString();
cd = jComboBox4.getSelectedItem().toString();
br = jComboBox5.getSelectedItem().toString();
        if(ct.equals("All")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received' AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired' ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired' AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Branch = '"+br+"'  ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Branch = '"+br+"' ORDER BY SDate DESC");
}
    }
        }
        
        
        
        
        
    if(ct.equals("Computer")){
if(cd.equals("Any")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'PC' ORDER BY SDate DESC");
}
if(cd.equals("Purchased")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received' AND Categ = 'PC' ORDER BY SDate DESC");
}
if(cd.equals("Repaired")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired' AND Categ = 'PC' ORDER BY SDate DESC");
}
if(cd.equals("Transfered")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'PC' ORDER BY SDate DESC");
}
if(cd.equals("Disposed")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'PC' ORDER BY SDate DESC");
}      
    }
        if(ct.equals("CCTV")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'CC' ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND Categ = 'CC' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'CC' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'CC'  AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'CC'  ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'CC'  AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}

if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Categ = 'CC'  ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'CC' AND Branch = '"+br+"'  ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'CC'  ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Branch = '"+br+"' AND Categ = 'CC' ORDER BY SDate DESC");
}
}
            
    }
         if(ct.equals("Printer")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'PR' ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND Categ = 'PR' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'PR' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'PR'  AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'PR'  ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'PR'  AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}

if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Categ = 'PR'  ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'PR' AND Branch = '"+br+"'  ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'PR'  ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Branch = '"+br+"' AND Categ = 'PR' ORDER BY SDate DESC");
}
}
            
    }
         
 if(ct.equals("Others")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'OT' ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND Categ = 'OT' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'OT' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'OT'  AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'OT'  ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'OT'  AND Branch = '"+br+"' ORDER BY SDate DESC");
}
}

if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Categ = 'OT'  ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE  Action = Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'OT' AND Branch = '"+br+"'  ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'OT'  ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History  WHERE Action = 'Disposed' AND Branch = '"+br+"' AND Categ = 'OT' ORDER BY SDate DESC");
}
}
            
    }
}
public void SortDate(){
ct = jComboBox3.getSelectedItem().toString();
cd = jComboBox4.getSelectedItem().toString();
br = jComboBox5.getSelectedItem().toString();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
sd = sdf.format(jDateChooser1.getDate());
ed = sdf.format(jDateChooser2.getDate()); 
        if(ct.equals("All")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"'ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"'  ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received' AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired' AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Branch = '"+br+"'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed'AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"'  ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
    }
        }
        
        
        
        
        
    if(ct.equals("Computer")){
if(cd.equals("Any")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'PC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
if(cd.equals("Purchased")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received' AND Categ = 'PC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
if(cd.equals("Repaired")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired' AND Categ = 'PC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
if(cd.equals("Transfered")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'PC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
if(cd.equals("Disposed")) {     
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'PC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}      
    }
        if(ct.equals("CCTV")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'CC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND Categ = 'CC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'CC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'CC'  AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'CC'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'CC'  AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}

if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Categ = 'CC'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'CC' AND Branch = '"+br+"'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'CC'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Branch = '"+br+"' AND Categ = 'CC' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
            
    }
         if(ct.equals("Printer")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'PR' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND Categ = 'PR' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'PR' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'PR'  AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'PR'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'PR'  AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}

if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Categ = 'PR'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'PR' AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'PR' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Branch = '"+br+"' AND Categ = 'PR' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
            
    }
         
 if(ct.equals("Others")){
    if(cd.equals("Any")){    
if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Categ = 'OT' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Branch = '"+br+"' AND Categ = 'OT' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");    
    }
}
if(cd.equals("Purchased")) { 
if(br.equals("Any")){       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'OT' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{       
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Received'  AND Categ = 'OT'  AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
if(cd.equals("Repaired")) { 
if(br.equals("Any")){ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'OT' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"'  ORDER BY SDate DESC");
}
else{ 
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Repaired'  AND Categ = 'OT'  AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}

if(cd.equals("Transfered")) { 
if(br.equals("Any")){  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Transmitted' OR Action LIKE 'Replaced%'  AND Categ = 'OT'  AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
else{  
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE  Action = Action = 'Transmitted' OR Action LIKE 'Replaced%' AND Categ = 'OT' AND Branch = '"+br+"' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER SDate DESC");
}
}
if(cd.equals("Disposed")) {   
    if(br.equals("Any")){
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History WHERE Action = 'Disposed' AND Categ = 'OT' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
    else{
showTbl("SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks FROM dbo.History  WHERE Action = 'Disposed' AND Branch = '"+br+"' AND Categ = 'OT' AND CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+sd+"' AND '"+ed+"' ORDER BY SDate DESC");
}
}
            
    }
}
public void branch(){
    try { 
Connection con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
Statement st1=con1.createStatement();         
String sql1 = "SELECT BRANCH FROM dbo.Branch WHERE STAT = 'RUNNING' ";         
rs=st1.executeQuery(sql1);
while(rs.next()){
String Branch = rs.getString("BRANCH");
jComboBox5.addItem(Branch);

      }
     }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLOpt22 : " + ex.getSQLState()); 
 }
}
public void printAll() throws PrinterException{
MessageFormat header = new MessageFormat("New Nemar Development Corporation");
MessageFormat footer = new MessageFormat("Page - {0}");
    
try{
    boolean complete = tbl.print(JTable.PrintMode.FIT_WIDTH,header,footer);
    if (complete) {
    JOptionPane.showMessageDialog(null,"Print Successful");
    }
}
catch(java.awt.print.PrinterException e){
JOptionPane.showMessageDialog(null, e);
System.err.format("Cannot print %s%n", e.getMessage());
}
}



public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth,
        double... percentages) {
    double total = 0;
    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
        total += percentages[i];
    }
 
    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
        TableColumn column = table.getColumnModel().getColumn(i);
        column.setPreferredWidth((int)
                (tablePreferredWidth * (percentages[i] / total)));
    }
}

public static void setCellsAlignment1(JTable table1, int alignment)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel1 = table1.getModel();

        for (int columnIndex = 0; columnIndex < tableModel1.getColumnCount(); columnIndex++)
        {
            table1.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
    
       
        }
        
        ((DefaultTableCellRenderer)table1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }

private void setIcon() {
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/NEMAR LOGO 2.png")));
    }
public void pAll1(String Query){
 try
            {
               conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");     
               JasperDesign jd=JRXmlLoader.load("C:\\Users\\CSC-MITS\\Documents\\NetBeansProjects\\Try\\src\\reports\\pcInvetory.jrxml");                          // Full address of you Report in between the “”
             
// sql is the query to get data from database   

               System.out.println(Query);
               JRDesignQuery newQuery=new JRDesignQuery();
               newQuery.setText(Query);
               jd.setQuery(newQuery);
               JasperReport jasperReport = JasperCompileManager.compileReport(jd);
               JasperPrint jasperprint = JasperFillManager.fillReport(jasperReport, null,conn);
               JasperViewer.viewReport(jasperprint,false);
                   }
            catch(SQLException | JRException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Message",JOptionPane.PLAIN_MESSAGE);
                System.out.println(ex);
            }

}
}