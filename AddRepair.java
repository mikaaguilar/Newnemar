
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER-PC
 */
public class AddRepair extends javax.swing.JFrame {
    public Connection con;
    public String it = null;
    public int cam =0;
    private Statement st1;
    public int id = 0;
    public int id1 = 0;
     public String stcam;
    /**
     * Creates new form AddRepair1
     */
    public AddRepair() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        repSort();
        initBranch();
        select.setVisible(false);
        sss1.setVisible(false);
        ca.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddPC = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rep = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        repDevtype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        repTbl = new javax.swing.JTable();
        repSearch = new javax.swing.JTextField();
        repBranch = new javax.swing.JComboBox<>();
        repSelect = new javax.swing.JButton();
        select = new javax.swing.JPanel();
        pccard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pccombo = new javax.swing.JComboBox<>();
        cccard = new javax.swing.JPanel();
        cccombo = new javax.swing.JComboBox<>();
        sss = new javax.swing.JLabel();
        sss1 = new javax.swing.JLabel();
        ca = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddPC.setBackground(new java.awt.Color(255, 255, 255));
        AddPC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setForeground(new java.awt.Color(0, 0, 51));

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Device to Repair");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        rep.setBackground(new java.awt.Color(204, 204, 204));
        rep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Device Type:");

        repDevtype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repDevtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Computer", "CCTV", "Printer" }));
        repDevtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repDevtypeActionPerformed(evt);
            }
        });

        repTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        repTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(repTbl);

        repBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        repBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repBranchActionPerformed(evt);
            }
        });

        repSelect.setText("Select");
        repSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repSelectActionPerformed(evt);
            }
        });

        select.setBackground(new java.awt.Color(204, 204, 204));
        select.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Select:");

        pccombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pccombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unit", "Processor", "Motherboard", "Harddrive", "Monitor", "RAM", "UPS", "Keyboard", "Mouse" }));

        javax.swing.GroupLayout pccardLayout = new javax.swing.GroupLayout(pccard);
        pccard.setLayout(pccardLayout);
        pccardLayout.setHorizontalGroup(
            pccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pccardLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pccombo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 412, Short.MAX_VALUE))
        );
        pccardLayout.setVerticalGroup(
            pccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pccardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pccombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        select.add(pccard, "card2");

        cccard.setBackground(new java.awt.Color(204, 204, 204));

        cccombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cccombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CCTV", "Camera", "DVR", "HDD" }));
        cccombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cccomboActionPerformed(evt);
            }
        });

        sss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sss.setText("Select:");

        sss1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sss1.setText("Number of Cameras:");

        javax.swing.GroupLayout cccardLayout = new javax.swing.GroupLayout(cccard);
        cccard.setLayout(cccardLayout);
        cccardLayout.setHorizontalGroup(
            cccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cccardLayout.createSequentialGroup()
                .addComponent(sss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cccombo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(sss1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );
        cccardLayout.setVerticalGroup(
            cccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cccardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sss1)
                        .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cccardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cccardLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(cccombo))
                        .addComponent(sss, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );

        select.add(cccard, "card3");

        javax.swing.GroupLayout repLayout = new javax.swing.GroupLayout(rep);
        rep.setLayout(repLayout);
        repLayout.setHorizontalGroup(
            repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, repLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(repDevtype, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(repLayout.createSequentialGroup()
                            .addComponent(repBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(repSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repLayout.createSequentialGroup()
                            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        repLayout.setVerticalGroup(
            repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(repDevtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(repLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(repLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(repSelect))
                    .addGroup(repLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddPCLayout = new javax.swing.GroupLayout(AddPC);
        AddPC.setLayout(AddPCLayout);
        AddPCLayout.setHorizontalGroup(
            AddPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPCLayout.createSequentialGroup()
                .addGroup(AddPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        AddPCLayout.setVerticalGroup(
            AddPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPCLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AddPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddPC, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void repSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repSelectActionPerformed
       repUpdate();
    }//GEN-LAST:event_repSelectActionPerformed

    private void repDevtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repDevtypeActionPerformed
        repSort();        // TODO add your handling code here:
    }//GEN-LAST:event_repDevtypeActionPerformed

    private void repBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repBranchActionPerformed
        repSort();
    }//GEN-LAST:event_repBranchActionPerformed

    private void repTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repTblMouseClicked
        int selectedRowIndex = repTbl.getSelectedRow();
        String Categ = repTbl.getValueAt(selectedRowIndex,0).toString();
        if (Categ.equals("PC")){
            select.setVisible(true);
            pccard.setVisible(true);
            cccard.setVisible(false);
        }
        else if (Categ.equals("CC")){
            select.setVisible(true);
            pccard.setVisible(false);
            cccard.setVisible(true);
        }
        else {select.setVisible(false);}
    }//GEN-LAST:event_repTblMouseClicked

    private void cccomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cccomboActionPerformed
        if (cccombo.getSelectedItem().equals("Camera")){
        sss1.setVisible(true);
        ca.setVisible(true);}
    }//GEN-LAST:event_cccomboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AddRepair AR = new AddRepair();
                AR.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPC;
    private javax.swing.JSpinner ca;
    private javax.swing.JPanel cccard;
    private javax.swing.JComboBox<String> cccombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pccard;
    private javax.swing.JComboBox<String> pccombo;
    private javax.swing.JPanel rep;
    private javax.swing.JComboBox<String> repBranch;
    private javax.swing.JComboBox<String> repDevtype;
    private javax.swing.JTextField repSearch;
    private javax.swing.JButton repSelect;
    private javax.swing.JTable repTbl;
    private javax.swing.JPanel select;
    private javax.swing.JLabel sss;
    private javax.swing.JLabel sss1;
    // End of variables declaration//GEN-END:variables


//FOR REPAIR
public void FilterREP( final JTable jTable,  final JTextField jtfFilter) {
    final TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable.getModel());
    jTable.setRowSorter(rowSorter);
    jtfFilter.getDocument().addDocumentListener(new DocumentListener(){


        @Override
        public void insertUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
                 jTable.convertRowIndexToModel(jTable.getSelectedRow());
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                AddRepair.setCellsAlignment(repTbl, SwingConstants.CENTER);
}
public void showInv(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
String sql = "SELECT Categ AS Category, Branch, Dept as Department, Owner as Name,Dev_ID as ID FROM dbo.Inv";         
ResultSet rs=st.executeQuery(sql); 
repTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterREP(repTbl,repSearch);
}
public void repSort(){
String Type = repDevtype.getSelectedItem().toString();    
String Branch = repBranch.getSelectedItem().toString();
if(Type.equals("All")&&Branch.equals("All")){
showInv();
select.setVisible(false);
}
else
{
if (Type.equals("All")){
try {
 select.setVisible(false);
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();  
select.setVisible(false);
String sql = "SELECT Categ AS Category, Branch, Dept as Department, Owner as Name,Dev_ID as ID  FROM dbo.Inv WHERE Status = 'WORKING' AND Branch='"+Branch+"' ";         
ResultSet rs=st.executeQuery(sql); 
repTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
}   
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterREP(repTbl,repSearch);
}    
    
if(Type.equals("Computer")){
Dev(Branch, "PC");
sss1.setVisible(false);
ca.setVisible(false);
FilterREP(repTbl,repSearch);
select.setVisible(true);
pccard.setVisible(true);
cccard.setVisible(false);
} 
else if(Type.equals("CCTV")){
 sss1.setVisible(false);
 ca.setVisible(false);
Dev(Branch, "CC");
FilterREP(repTbl,repSearch);
select.setVisible(true);
pccard.setVisible(false);
cccard.setVisible(true);
}
else if(Type.equals("Printer")){
Dev(Branch, "PR");
FilterREP(repTbl,repSearch);
select.setVisible(false);

}
}} 
public void Dev(String Branch, String Categ){
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();  
if(Branch.equals("All")){
String sql = "SELECT Categ AS Category, Branch, Dept as Department, Owner as Name,Dev_ID as ID  FROM dbo.Inv WHERE Status = 'WORKING' AND Categ='"+Categ+"' ";         
ResultSet rs=st.executeQuery(sql); 
repTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
}
else{
String sql = "SELECT Categ AS Category, Branch, Dept as Department, Owner as Name,Dev_ID as ID FROM dbo.Inv WHERE Branch = '"+Branch+"' AND Status = 'WORKING' AND Categ='"+Categ+"' ";         
ResultSet rs=st.executeQuery(sql); 
repTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
}   
    
    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }

}



public void repUpdate() {
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = repTbl.getValueAt(selectedRowIndex,0).toString();
String Dev = repTbl.getValueAt(selectedRowIndex,4).toString();
String Bra = repTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = repTbl.getValueAt(selectedRowIndex,2).toString();
String Own = repTbl.getValueAt(selectedRowIndex,3).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
 String sel, item = null;

try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){  
    String Try = pccombo.getSelectedItem().toString();
    if(Try.equals("Unit")){
    // Statement sta = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','Unit Malfunctioned')";
    st.execute(newsql1);
     String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+Dev+"', 'Unit', 'N/A', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
    String sql ="UPDATE dbo.invPC SET Stat = 'FOR REPAIR' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql3 ="UPDATE dbo.Inv SET Status = 'FOR REPAIR' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
   
     JOptionPane.showMessageDialog(null,"Device sent to Repair!");
    new Homepage().showRep();
    this.dispose();
    }
    else {
    sel = pccombo.getSelectedItem().toString();
    if (sel.equals("Processor")){
        item = "Proce";
    }
     else if (sel.equals("Motherboard")){
        item = "MBoard";
    }
     else if (sel.equals("RAM")){
        item = "Ram";
    }
     else if (sel.equals("Harddrive")){
        item = "HDD";
    }
     else if (sel.equals("UPS")){
        item = "UPS";
    }
     else if (sel.equals("Keyboard")){
        item = "KeyB";
    }
     else if (sel.equals("Mouse")){
        item = "Mouse";
    }
     else if (sel.equals("Monitor")){
        item = "Moni";
    }
     st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);                    
    String sql2 = "SELECT "+item+" FROM dbo.invPC WHERE ID = '"+Dev+"'";         
    ResultSet rs=st1.executeQuery(sql2); 
    rs = st1.executeQuery(sql2);             
            if (rs.next()) { 
             it = rs.getString(item);   
            }
     if(it.equals("IN REPAIR")){
         JOptionPane.showMessageDialog(null,"Item already in repair!");
     }
     else{
      Statement sta = con.createStatement();
     String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
     sta.execute(newsql);
     String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', '0.00', '"+sel+" Malfunctioned' )";
     sta.execute(newsql1);
     String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2=st1.executeQuery(sql4); 
    rs2 = st1.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+Dev+"', '"+sel+"', '"+it+"', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
     String sql ="UPDATE dbo.invPC SET "+item+" = 'IN REPAIR' WHERE ID = '"+Dev+"'";         
     st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"Device sent to Repair!");
     new Homepage().showRep();
    this.dispose();
    }}
}

else if (Categ.equals("CC")){  
    if(cccombo.getSelectedItem().toString().equals("CCTV")){
      Statement sta = con.createStatement();
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    sta.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0.00','CCTV Malfunctioned')";
    sta.execute(newsql1);
      String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2=st1.executeQuery(sql4); 
    rs2 = st1.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+Dev+"', 'Unit', 'N/A', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
    String sql ="UPDATE dbo.invCC SET Stat = 'FOR REPAIR' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql3 ="UPDATE dbo.Inv SET Status = 'FOR REPAIR' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
     JOptionPane.showMessageDialog(null,"Device sent to Repair!");
    new Homepage().showRep();
    this.dispose();}
    else {
    sel = cccombo.getSelectedItem().toString();
    if (sel.equals("Camera")){
        item = "Camera";
        cam =(int) ca.getValue();
        if (cam >1){ stcam="CAMERAS";}
        else {stcam="CAMERA";}
            
    }
     else if (sel.equals("DVR")){
        item = "DVR";
    }
     else if (sel.equals("HDD")){
        item = "HDD";
    }
    if (sel.equals("Camera")){
         st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
        String sql5 = "SELECT Cnum FROM dbo.invCC WHERE ID= "+Dev+" ";         
        ResultSet rs3=st1.executeQuery(sql5); 
        rs3 = st1.executeQuery(sql5);             
            if (rs3.next()) { 
             id1 = rs3.getInt("Cnum");   
            }
     st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);                    
    String sql2 = "SELECT "+item+" FROM dbo.invCC WHERE ID = '"+Dev+"'";         
    ResultSet rs=st1.executeQuery(sql2); 
    rs = st1.executeQuery(sql2);             
            if (rs.next()) { 
             it = rs.getString(item);   
            }
     if(it.equals("WORKING")){
      if (cam > id1 ) {
          JOptionPane.showMessageDialog(null,"Invalid number!");
     }
     else{
      Statement sta = con.createStatement();
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    sta.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', '0.00', '"+cam+" "+stcam+" Malfunctioned' )";
   sta.execute(newsql1);
   String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2=st1.executeQuery(sql4); 
    rs2 = st1.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat,Rep_ID) Values ('"+Dev+"', '"+sel+"', '"+cam+"', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
     String sql ="UPDATE dbo.invCC SET "+item+" = '"+cam+" "+stcam+" IN REPAIR' WHERE ID = '"+Dev+"'";         
     st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"Device sent to Repair!");
    new Homepage().showRep();
    this.dispose();
    }   }
     else{
              JOptionPane.showMessageDialog(null,"Item already in repair!");
     }
    }
    else{
     st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);                    
    String sql2 = "SELECT "+item+" FROM dbo.invCC WHERE ID = '"+Dev+"'";         
    ResultSet rs=st1.executeQuery(sql2); 
    rs = st1.executeQuery(sql2);             
            if (rs.next()) { 
             it = rs.getString(item);   
            }
     if(it.equals("IN REPAIR")){
         JOptionPane.showMessageDialog(null,"Item already in repair!");
     }
     else{
     Statement sta = con.createStatement();
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    sta.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', '0.00', '"+sel+" Malfunctioned' )";
   sta.execute(newsql1);
    String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2=st1.executeQuery(sql4); 
    rs2 = st1.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+Dev+"', '"+sel+"', '"+it+"', 'For Repair', '"+id+"' )";        
     st.executeUpdate(sql1);
     String sql ="UPDATE dbo.invCC SET "+item+" = 'IN REPAIR' WHERE ID = '"+Dev+"'";         
     st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"Device sent to Repair!");
    new Homepage().showRep();
    this.dispose();
    }}}
}

else if (Categ.equals("PR")){  
    Statement sta = con.createStatement();
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    sta.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'N/A')";
    sta.execute(newsql1);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2; 
    rs2 = st1.executeQuery(sql6);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql5 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+Dev+"', 'Printer', 'N/A', 'For Repair', "+id+" )";        
     st.executeUpdate(sql5);
     String sql ="UPDATE dbo.invPR SET Stat = 'FOR REPAIR' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql3 ="UPDATE dbo.Inv SET Status = 'FOR REPAIR' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    
    JOptionPane.showMessageDialog(null,"Device sent to Repair!");
    new Homepage().showRep();
    this.dispose();
}
}

 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void initBranch(){
try { 
Connection con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
Statement st1=con1.createStatement();         
String sql1 = "SELECT BRANCH FROM dbo.Branch";         
ResultSet rs1=st1.executeQuery(sql1);
while(rs1.next()){
String Branch = rs1.getString("BRANCH");
repBranch.addItem(Branch);




      }
     }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLOpt22 : " + ex.getSQLState()); 
 }
}
public static void setCellsAlignment(JTable table, int alignment)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        }
        
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
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
}
