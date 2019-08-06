import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.BasicConfigurator;
import static org.jfree.layout.FormatLayout.C;
import org.apache.log4j.PropertyConfigurator;


public class Homepage extends javax.swing.JFrame {
public Connection con;
public PreparedStatement st, st1, st2,sta;
public ResultSet rs, rs1, rs2; 
public static String z;
public String tr;
public boolean g = false;
public int hisid;
public String pu,Categ,cItem, it, hm;
public String br,dp,ow,pr,mb,rm,hd,up,kb,ms,re,mn,ty,na,un,pw,cn;
public String purName,item,cName,word, name, devname = null;
public int id,tempid,cnt,dID;

    public Homepage() {
        initComponents();
        initEdit();
        initialize();
        
        //PC*TEMPORARY*//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
     
       //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height*12/25-this.getSize().height/2);

    }
    
    public void initialize() {
    //initialize
    initEdit(); 
    initBranch();
    setIcon();
    groupButton();
    showDate();
    showTime(); 
    Done.setVisible(false);
    branchcard.setVisible(false);
    deptcard.setVisible(false);
    HOM.setBackground(Color.ORANGE);
    showHP();
    }

    private void groupButton( ) {

    ButtonGroup bg1 = new ButtonGroup( );

    bg1.add(jRadioButton1);
    bg1.add(jRadioButton2);
    bg1.add(jRadioButton3);
    
      ButtonGroup bg2 = new ButtonGroup( );

    bg2.add(jRadioButton4);
    bg2.add(jRadioButton5);
    bg2.add(jRadioButton6);
    
    if(jRadioButton1.isSelected()){
    unitSelect.setVisible(true);
    jLabel18a.setVisible(true);
    String se = unitSelect.getSelectedItem().toString();
    if("Unit".equals(se)){
    Unit.setVisible(true);
    Others.setVisible(false);
    CCTV.setVisible(false);
    Printer.setVisible(false);
    }
    else {Unit.setVisible(false);
    Others.setVisible(true);
    CCTV.setVisible(false);
    Printer.setVisible(false);}
    }
    else if(jRadioButton2.isSelected()){
    unitSelect.setVisible(false);
    jLabel18a.setVisible(false);
    Unit.setVisible(false);
    Others.setVisible(false);
    CCTV.setVisible(true);
    Printer.setVisible(false);
    }
    else if(jRadioButton3.isSelected()){
    unitSelect.setVisible(false);
    jLabel18a.setVisible(false);
    Unit.setVisible(false);
    Others.setVisible(false);
    CCTV.setVisible(false);
    Printer.setVisible(true);
    }

}

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        datefield.setText(s.format(d));
    }
    
    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                timefield.setText(s.format(d));
            }
        }).start();}
    
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Maincard = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        repTbl = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        shipTbl = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        reqTbl = new javax.swing.JTable();
        repDone = new javax.swing.JButton();
        repAdd = new javax.swing.JButton();
        repSearch = new javax.swing.JTextField();
        shipSearch = new javax.swing.JTextField();
        shipDone = new javax.swing.JButton();
        shipAdd = new javax.swing.JButton();
        reqSearch = new javax.swing.JTextField();
        reqDone = new javax.swing.JButton();
        reqAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Done = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        INVmaincard = new javax.swing.JPanel();
        PC = new javax.swing.JButton();
        CC = new javax.swing.JButton();
        PR = new javax.swing.JButton();
        INVcard = new javax.swing.JPanel();
        PCcard = new javax.swing.JPanel();
        PCinfo = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        compName = new javax.swing.JTextField();
        compBran = new javax.swing.JTextField();
        compDept = new javax.swing.JTextField();
        compProc = new javax.swing.JTextField();
        compRam = new javax.swing.JTextField();
        compHdd = new javax.swing.JTextField();
        compUps = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        compRem = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        compKeyb = new javax.swing.JTextField();
        compMou = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        compMboard = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        compMoni = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        pcSearchtxt = new javax.swing.JTextField();
        pcSort = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        countPC = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        hisTbl = new javax.swing.JTable();
        PCtable = new javax.swing.JScrollPane();
        compTbl = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        countHis = new javax.swing.JLabel();
        pcDel = new javax.swing.JButton();
        pcEdit = new javax.swing.JButton();
        pcUpdate = new javax.swing.JButton();
        pcTransfer = new javax.swing.JButton();
        pcPurchase = new javax.swing.JButton();
        pcRepair = new javax.swing.JButton();
        CCcard = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        ccTbl = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        ccSearchtxt = new javax.swing.JTextField();
        ccSort = new javax.swing.JComboBox();
        jScrollPane18 = new javax.swing.JScrollPane();
        hisTbl2 = new javax.swing.JTable();
        ccDel = new javax.swing.JButton();
        CCinfo = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        ccSupp = new javax.swing.JTextField();
        ccBran = new javax.swing.JTextField();
        ccUN = new javax.swing.JTextField();
        ccPW = new javax.swing.JTextField();
        ccNum = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ccRem = new javax.swing.JTextArea();
        jLabel101 = new javax.swing.JLabel();
        ccHDD = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        ccDVR = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        countHis3 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        countCC = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        ccTransfer = new javax.swing.JButton();
        ccEdit = new javax.swing.JButton();
        ccUpdate = new javax.swing.JButton();
        ccRepair = new javax.swing.JButton();
        ccPurchase = new javax.swing.JButton();
        PRcard = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        prSearchtxt = new javax.swing.JTextField();
        prSort = new javax.swing.JComboBox();
        prPurchase = new javax.swing.JButton();
        prDispose = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        PRinfo = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        prDept = new javax.swing.JTextField();
        prBran = new javax.swing.JTextField();
        prName = new javax.swing.JTextField();
        prManu = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        prRem = new javax.swing.JTextArea();
        jLabel89 = new javax.swing.JLabel();
        countPR = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        prTransfer = new javax.swing.JButton();
        prUpdate = new javax.swing.JButton();
        prEdit = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        hisTbl3 = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        prTbl = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        countHis2 = new javax.swing.JLabel();
        prRepair = new javax.swing.JButton();
        OTcard = new javax.swing.JPanel();
        otherTbl = new javax.swing.JScrollPane();
        otTbl = new javax.swing.JTable();
        otherSort = new javax.swing.JComboBox();
        otherSearchtxt = new javax.swing.JTextField();
        otherRefresh = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        hisTbl4 = new javax.swing.JTable();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        countHis4 = new javax.swing.JLabel();
        prRepair1 = new javax.swing.JButton();
        prTransfer1 = new javax.swing.JButton();
        prPurchase1 = new javax.swing.JButton();
        prDispose1 = new javax.swing.JButton();
        PR1 = new javax.swing.JButton();
        Adding = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Request = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reqBranch = new javax.swing.JComboBox<>();
        jLabel1a = new javax.swing.JLabel();
        jLabel8a = new javax.swing.JLabel();
        unitDept = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        Unit = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        unitTbl = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        unitPro = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        unitRam = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        unitHar = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        unitMot = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        unitUPS = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        unitMon = new javax.swing.JTextField();
        unitSearch = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        unitKey = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        unitQty = new javax.swing.JSpinner();
        unitAdd = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        unitMou = new javax.swing.JTextField();
        Others = new javax.swing.JPanel();
        othersSearch = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        othersTbl = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        othersField = new javax.swing.JTextField();
        othersQty = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        othersAdd = new javax.swing.JButton();
        CCTV = new javax.swing.JPanel();
        cctvSearch = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        cctvTbl = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        cctvField = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        cctvQty = new javax.swing.JSpinner();
        cctvAdd = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        una = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        Printer = new javax.swing.JPanel();
        printerSearch = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        printerTbl = new javax.swing.JTable();
        jLabel54a = new javax.swing.JLabel();
        printerField = new javax.swing.JTextField();
        jLabel55a = new javax.swing.JLabel();
        printerQty = new javax.swing.JSpinner();
        printerAdd = new javax.swing.JButton();
        jLabel18a = new javax.swing.JLabel();
        unitSelect = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel16a = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Cart = new javax.swing.JTable();
        reqRemove = new javax.swing.JButton();
        reqCheckout = new javax.swing.JButton();
        reqCancel = new javax.swing.JButton();
        unitKey2 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel8a1 = new javax.swing.JLabel();
        reqOwn = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        HISmaincard = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        allHisTbl = new javax.swing.JTable();
        HISsearchf = new javax.swing.JTextField();
        HISfilter = new javax.swing.JButton();
        HISdetails = new javax.swing.JPanel();
        HISpc = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        pcHisName = new javax.swing.JTextField();
        pcHisBran = new javax.swing.JTextField();
        pcHisPric = new javax.swing.JTextField();
        pcHisAct = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        pcHisPerf = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        pcHisRem = new javax.swing.JTextArea();
        pcHisSTime = new javax.swing.JTextField();
        pcHisETime = new javax.swing.JTextField();
        pcHisUpdate = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        pcHisSDate = new javax.swing.JTextField();
        pcHisEDate = new javax.swing.JTextField();
        pcHisUpdate2 = new javax.swing.JButton();
        HIScc = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        ccHisName = new javax.swing.JTextField();
        ccHisBran = new javax.swing.JTextField();
        ccHisPric = new javax.swing.JTextField();
        ccHisAct = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        ccHisPerf = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        ccHisRem = new javax.swing.JTextArea();
        ccHisSTime = new javax.swing.JTextField();
        ccHisETime = new javax.swing.JTextField();
        ccHisUpdate = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        ccHisSDate = new javax.swing.JTextField();
        ccHisEDate = new javax.swing.JTextField();
        ccHisUpdate2 = new javax.swing.JButton();
        HISpr = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        prHisName = new javax.swing.JTextField();
        prHisBran = new javax.swing.JTextField();
        prHisPric = new javax.swing.JTextField();
        prHisAct = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        prHisPerf = new javax.swing.JTextField();
        jScrollPane26 = new javax.swing.JScrollPane();
        prHisRem = new javax.swing.JTextArea();
        prHisSTime = new javax.swing.JTextField();
        prHisETime = new javax.swing.JTextField();
        prHisUpdate = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        prHisSDate = new javax.swing.JTextField();
        prHisEDate = new javax.swing.JTextField();
        prHisUpdate2 = new javax.swing.JButton();
        HISpc1 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        pcHisName1 = new javax.swing.JTextField();
        pcHisBran1 = new javax.swing.JTextField();
        pcHisPric1 = new javax.swing.JTextField();
        pcHisAct1 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        pcHisPerf1 = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        pcHisRem1 = new javax.swing.JTextArea();
        pcHisSTime1 = new javax.swing.JTextField();
        pcHisETime1 = new javax.swing.JTextField();
        pcHisSDate1 = new com.toedter.calendar.JDateChooser();
        pcHisEDate1 = new com.toedter.calendar.JDateChooser();
        pcHisUpdate1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        pcHisSDate2 = new javax.swing.JTextField();
        pcHisEDate2 = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        HIScc1 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        ccHisName1 = new javax.swing.JTextField();
        ccHisBran1 = new javax.swing.JTextField();
        ccHisPric1 = new javax.swing.JTextField();
        ccHisAct1 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        ccHisPerf1 = new javax.swing.JTextField();
        jScrollPane28 = new javax.swing.JScrollPane();
        ccHisRem1 = new javax.swing.JTextArea();
        ccHisSTime1 = new javax.swing.JTextField();
        ccHisETime1 = new javax.swing.JTextField();
        ccHisSDate1 = new com.toedter.calendar.JDateChooser();
        ccHisEDate1 = new com.toedter.calendar.JDateChooser();
        ccHisUpdate1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        ccHisSDate2 = new javax.swing.JTextField();
        ccHisEDate2 = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        HISpr1 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        prHisName1 = new javax.swing.JTextField();
        prHisBran1 = new javax.swing.JTextField();
        prHisPric1 = new javax.swing.JTextField();
        prHisAct1 = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        prHisPerf1 = new javax.swing.JTextField();
        jScrollPane29 = new javax.swing.JScrollPane();
        prHisRem1 = new javax.swing.JTextArea();
        prHisSTime1 = new javax.swing.JTextField();
        prHisETime1 = new javax.swing.JTextField();
        prHisSDate1 = new com.toedter.calendar.JDateChooser();
        prHisEDate1 = new com.toedter.calendar.JDateChooser();
        prHisUpdate1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        prHisSDate2 = new javax.swing.JTextField();
        prHisEDate2 = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        Filter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hisSortCateg = new javax.swing.JComboBox<>();
        hisSortSDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        hisSortEDate = new com.toedter.calendar.JDateChooser();
        hisHide = new javax.swing.JButton();
        hisGo = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        countHis5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        HisAdd = new javax.swing.JButton();
        AddHistory = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        PCinfo4 = new javax.swing.JPanel();
        hisAddCan = new javax.swing.JButton();
        hisSave = new javax.swing.JButton();
        jLabel142 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        hisETimeAdd = new javax.swing.JTextField();
        hisSDateAdd = new com.toedter.calendar.JDateChooser();
        jLabel136 = new javax.swing.JLabel();
        hisPerfAdd = new javax.swing.JTextField();
        hisActAdd = new javax.swing.JTextField();
        hisPricAdd = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        hisEDateAdd = new com.toedter.calendar.JDateChooser();
        jLabel137 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        hisSTimeAdd = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        hisRemAdd = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Log = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        actlogTbl = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        userlogTbl = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ActLogSearch = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        UserLogSearch = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        alogrefresh = new javax.swing.JButton();
        ulogrefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        actLogCnt = new javax.swing.JLabel();
        uLogCnt = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Sys = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        brTbl = new javax.swing.JTable();
        jScrollPane32 = new javax.swing.JScrollPane();
        dpTbl = new javax.swing.JTable();
        branchAddbtn = new javax.swing.JButton();
        deptAddbtn = new javax.swing.JButton();
        branchEditbtn = new javax.swing.JButton();
        deptDeletebtn = new javax.swing.JButton();
        branchcard = new javax.swing.JPanel();
        addBranch = new javax.swing.JPanel();
        PCinfo2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        branchAdd = new javax.swing.JTextField();
        branchLoc = new javax.swing.JTextField();
        branchCancel = new javax.swing.JButton();
        branchSave = new javax.swing.JButton();
        branchName = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        editBranch = new javax.swing.JPanel();
        PCinfo3 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        branchAddedit = new javax.swing.JTextField();
        branchLocedit = new javax.swing.JTextField();
        branchCancel1 = new javax.swing.JButton();
        branchSave1 = new javax.swing.JButton();
        branchNameedit = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        deptcard = new javax.swing.JPanel();
        addDept = new javax.swing.JPanel();
        PCinfo1 = new javax.swing.JPanel();
        jLabel18b = new javax.swing.JLabel();
        deptName = new javax.swing.JTextField();
        deptCancel = new javax.swing.JButton();
        deptSave = new javax.swing.JButton();
        jLabel66a = new javax.swing.JLabel();
        deptBranch = new javax.swing.JComboBox<>();
        adddd = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        editDept = new javax.swing.JPanel();
        PCinfo5 = new javax.swing.JPanel();
        jLabel18b1 = new javax.swing.JLabel();
        deptNameedit = new javax.swing.JTextField();
        deptCancel1 = new javax.swing.JButton();
        deptSave1 = new javax.swing.JButton();
        jLabel66a1 = new javax.swing.JLabel();
        deptBranchedit = new javax.swing.JComboBox<>();
        adddd1 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        deptEditbtn = new javax.swing.JButton();
        branchDeletebtn = new javax.swing.JButton();
        dpSearchtxt = new javax.swing.JTextField();
        brSearchtxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        Transfer = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        toTbl = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        transBR = new javax.swing.JComboBox<>();
        toSearchtxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        UnitCard = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        unitPro1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        unitMot1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        unitHar1 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        unitMon1 = new javax.swing.JTextField();
        unitUPS1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        unitRam1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        unitKey1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        unitMou1 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        unitPro2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        transTbl = new javax.swing.JTable();
        transferSelect = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        transSearchtxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pcBR = new javax.swing.JComboBox<>();
        PrCard = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        unitPro4 = new javax.swing.JTextField();
        jScrollPane23 = new javax.swing.JScrollPane();
        transTbl1 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        prBR = new javax.swing.JComboBox<>();
        trSearchtxt1 = new javax.swing.JTextField();
        CcCard = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        unitPro5 = new javax.swing.JTextField();
        jScrollPane31 = new javax.swing.JScrollPane();
        transTbl2 = new javax.swing.JTable();
        jLabel85 = new javax.swing.JLabel();
        ccBR = new javax.swing.JComboBox<>();
        trSearchtxt2 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        toBranch = new javax.swing.JTextField();
        toDept = new javax.swing.JTextField();
        toOwner = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        INV = new javax.swing.JButton();
        HIS = new javax.swing.JButton();
        LOG = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        HOM = new javax.swing.JButton();
        System = new javax.swing.JButton();
        datefield = new javax.swing.JLabel();
        timefield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Maincard.setPreferredSize(new java.awt.Dimension(1700, 982));
        Maincard.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

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
        repTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane6.setViewportView(repTbl);

        shipTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        shipTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane7.setViewportView(shipTbl);

        reqTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        reqTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane8.setViewportView(reqTbl);

        repDone.setBackground(new java.awt.Color(255, 255, 255));
        repDone.setText("Done");
        repDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repDoneActionPerformed(evt);
            }
        });

        repAdd.setBackground(new java.awt.Color(255, 255, 255));
        repAdd.setText("Add");
        repAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repAddActionPerformed(evt);
            }
        });

        repSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repSearchActionPerformed(evt);
            }
        });

        shipDone.setBackground(new java.awt.Color(255, 255, 255));
        shipDone.setText("Delivered");
        shipDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipDoneActionPerformed(evt);
            }
        });

        shipAdd.setBackground(new java.awt.Color(255, 255, 255));
        shipAdd.setText("Ship");
        shipAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipAddActionPerformed(evt);
            }
        });

        reqDone.setBackground(new java.awt.Color(255, 255, 255));
        reqDone.setText("Received");
        reqDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqDoneActionPerformed(evt);
            }
        });

        reqAdd.setBackground(new java.awt.Color(255, 255, 255));
        reqAdd.setText("Request");
        reqAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 13, 129));
        jLabel9.setText("Devices to Repair");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(13, 13, 129));
        jLabel10.setText("Devices to Return");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 13, 129));
        jLabel11.setText("Purchases");

        Done.setBackground(new java.awt.Color(255, 153, 0));
        Done.setForeground(new java.awt.Color(0, 0, 102));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Repaired");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Dispose");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Purchase New");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Replace w/ Reserve");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DoneLayout = new javax.swing.GroupLayout(Done);
        Done.setLayout(DoneLayout);
        DoneLayout.setHorizontalGroup(
            DoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DoneLayout.setVerticalGroup(
            DoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jButton9.setText("Print PC Inventory");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(shipSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shipDone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shipAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reqSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reqDone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reqAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomeLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(repSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(repDone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(repAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton9)))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repAdd)
                            .addComponent(repDone)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipDone)
                    .addComponent(shipAdd)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reqAdd)
                    .addComponent(reqDone)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        Maincard.add(Home, "card7");

        INVmaincard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        INVmaincard.setMaximumSize(new java.awt.Dimension(1700, 982));
        INVmaincard.setMinimumSize(new java.awt.Dimension(1700, 982));
        INVmaincard.setName(""); // NOI18N
        INVmaincard.setPreferredSize(new java.awt.Dimension(1700, 982));

        PC.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PC.setForeground(new java.awt.Color(0, 51, 51));
        PC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2pc_1.jpg"))); // NOI18N
        PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCActionPerformed(evt);
            }
        });

        CC.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        CC.setForeground(new java.awt.Color(0, 51, 51));
        CC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2cctv_1.jpg"))); // NOI18N
        CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCActionPerformed(evt);
            }
        });

        PR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PR.setForeground(new java.awt.Color(0, 51, 51));
        PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2pr_1.jpg"))); // NOI18N
        PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRActionPerformed(evt);
            }
        });

        INVcard.setPreferredSize(new java.awt.Dimension(1700, 933));
        INVcard.setLayout(new java.awt.CardLayout());

        PCcard.setBackground(new java.awt.Color(255, 255, 255));
        PCcard.setMaximumSize(new java.awt.Dimension(1700, 933));
        PCcard.setPreferredSize(new java.awt.Dimension(1700, 933));

        PCinfo.setBackground(new java.awt.Color(204, 204, 204));
        PCinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PCinfo.setPreferredSize(new java.awt.Dimension(486, 409));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("PC User:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Branch:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Processor:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("RAM:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Hard Drive Size:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("UPS:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Department:");

        compName.setEditable(false);
        compName.setForeground(new java.awt.Color(102, 102, 102));
        compName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compBran.setEditable(false);
        compBran.setForeground(new java.awt.Color(102, 102, 102));
        compBran.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compDept.setEditable(false);
        compDept.setForeground(new java.awt.Color(102, 102, 102));
        compDept.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compProc.setEditable(false);
        compProc.setForeground(new java.awt.Color(102, 102, 102));
        compProc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compRam.setEditable(false);
        compRam.setForeground(new java.awt.Color(102, 102, 102));
        compRam.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compHdd.setEditable(false);
        compHdd.setForeground(new java.awt.Color(102, 102, 102));
        compHdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compUps.setEditable(false);
        compUps.setForeground(new java.awt.Color(102, 102, 102));
        compUps.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Remarks:");

        compRem.setEditable(false);
        compRem.setColumns(20);
        compRem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        compRem.setRows(5);
        jScrollPane13.setViewportView(compRem);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Keyboard:");

        compKeyb.setEditable(false);
        compKeyb.setForeground(new java.awt.Color(102, 102, 102));
        compKeyb.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        compMou.setEditable(false);
        compMou.setForeground(new java.awt.Color(102, 102, 102));
        compMou.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Mouse:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Motherboard:");

        compMboard.setEditable(false);
        compMboard.setForeground(new java.awt.Color(102, 102, 102));
        compMboard.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Monitor:");

        compMoni.setEditable(false);
        compMoni.setForeground(new java.awt.Color(102, 102, 102));
        compMoni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout PCinfoLayout = new javax.swing.GroupLayout(PCinfo);
        PCinfo.setLayout(PCinfoLayout);
        PCinfoLayout.setHorizontalGroup(
            PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfoLayout.createSequentialGroup()
                        .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PCinfoLayout.createSequentialGroup()
                                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel37))
                                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PCinfoLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(compKeyb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43)
                                        .addGap(15, 15, 15)
                                        .addComponent(compMou, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PCinfoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compMboard))))
                            .addGroup(PCinfoLayout.createSequentialGroup()
                                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel34))
                                .addGap(69, 69, 69)
                                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PCinfoLayout.createSequentialGroup()
                                        .addComponent(compRam, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(compHdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PCinfoLayout.createSequentialGroup()
                                        .addComponent(compUps, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compMoni, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(3, 3, 3))
                    .addGroup(PCinfoLayout.createSequentialGroup()
                        .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PCinfoLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                            .addGroup(PCinfoLayout.createSequentialGroup()
                                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addGap(30, 30, 30)
                                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PCinfoLayout.createSequentialGroup()
                                        .addComponent(compBran, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compDept, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                    .addComponent(compName)
                                    .addComponent(compProc, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        PCinfoLayout.setVerticalGroup(
            PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(compBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(compDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(compName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(13, 13, 13)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compMboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(compHdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(compUps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel56)
                        .addComponent(compMoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compKeyb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(compMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(PCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(46, 46, 46))
        );

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(13, 13, 129));
        jLabel28.setText("Computer Information");

        pcSearchtxt.setForeground(new java.awt.Color(51, 51, 51));

        pcSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        pcSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcSortActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(13, 13, 129));
        jLabel42.setText("Computer History");

        jLabel47.setText("Computer/s Found:");

        countPC.setBackground(new java.awt.Color(255, 255, 255));
        countPC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        hisTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        hisTbl.setSelectionBackground(new java.awt.Color(0, 0, 102));
        jScrollPane14.setViewportView(hisTbl);

        compTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "null", "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        compTbl.setSelectionBackground(new java.awt.Color(0, 0, 102));
        compTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compTblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                compTblMousePressed(evt);
            }
        });
        compTbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                compTblKeyTyped(evt);
            }
        });
        PCtable.setViewportView(compTbl);

        jLabel46.setText("History Found:");

        countHis.setBackground(new java.awt.Color(255, 255, 255));
        countHis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pcDel.setBackground(new java.awt.Color(255, 255, 255));
        pcDel.setForeground(new java.awt.Color(0, 0, 103));
        pcDel.setText("Dispose");
        pcDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcDelActionPerformed(evt);
            }
        });

        pcEdit.setBackground(new java.awt.Color(255, 255, 255));
        pcEdit.setForeground(new java.awt.Color(0, 0, 102));
        pcEdit.setText("Edit");
        pcEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcEditActionPerformed(evt);
            }
        });

        pcUpdate.setBackground(new java.awt.Color(255, 255, 255));
        pcUpdate.setForeground(new java.awt.Color(0, 0, 102));
        pcUpdate.setText("Update");
        pcUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcUpdateActionPerformed(evt);
            }
        });

        pcTransfer.setBackground(new java.awt.Color(255, 255, 255));
        pcTransfer.setForeground(new java.awt.Color(0, 0, 102));
        pcTransfer.setText("Transfer");
        pcTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcTransferActionPerformed(evt);
            }
        });

        pcPurchase.setBackground(new java.awt.Color(255, 255, 255));
        pcPurchase.setForeground(new java.awt.Color(0, 0, 102));
        pcPurchase.setText("Purchase");
        pcPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcPurchaseActionPerformed(evt);
            }
        });

        pcRepair.setBackground(new java.awt.Color(255, 255, 255));
        pcRepair.setForeground(new java.awt.Color(0, 0, 102));
        pcRepair.setText("For Repair");
        pcRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcRepairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PCcardLayout = new javax.swing.GroupLayout(PCcard);
        PCcard.setLayout(PCcardLayout);
        PCcardLayout.setHorizontalGroup(
            PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PCcardLayout.createSequentialGroup()
                        .addComponent(pcSort, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1000, 1000, 1000)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countPC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PCcardLayout.createSequentialGroup()
                            .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28)
                                .addComponent(PCinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pcTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pcRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pcPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pcDel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PCcardLayout.createSequentialGroup()
                                    .addComponent(pcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pcEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PCcardLayout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel46)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(countHis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(PCtable, javax.swing.GroupLayout.PREFERRED_SIZE, 1607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PCcardLayout.setVerticalGroup(
            PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCcardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countHis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel42)
                        .addComponent(jLabel46)))
                .addGap(7, 7, 7)
                .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PCinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PCcardLayout.createSequentialGroup()
                        .addComponent(pcRepair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pcTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pcPurchase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pcDel)
                        .addGap(11, 11, 11)
                        .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcEdit)
                            .addComponent(pcUpdate))))
                .addGap(26, 26, 26)
                .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countPC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pcSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pcSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(10, 10, 10)
                .addComponent(PCtable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        INVcard.add(PCcard, "card2");

        CCcard.setBackground(new java.awt.Color(255, 255, 255));
        CCcard.setMaximumSize(new java.awt.Dimension(1700, 933));
        CCcard.setPreferredSize(new java.awt.Dimension(1700, 933));

        ccTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        ccTbl.setSelectionBackground(new java.awt.Color(0, 0, 102));
        ccTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccTblMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(ccTbl);

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(13, 13, 129));
        jLabel68.setText("CCTV Information");

        ccSearchtxt.setForeground(new java.awt.Color(51, 51, 51));

        ccSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        ccSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccSortActionPerformed(evt);
            }
        });

        hisTbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        hisTbl2.setSelectionBackground(new java.awt.Color(0, 0, 102));
        jScrollPane18.setViewportView(hisTbl2);

        ccDel.setBackground(new java.awt.Color(255, 255, 255));
        ccDel.setForeground(new java.awt.Color(0, 0, 102));
        ccDel.setText("Dispose");
        ccDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccDelActionPerformed(evt);
            }
        });

        CCinfo.setBackground(new java.awt.Color(204, 204, 204));
        CCinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CCinfo.setForeground(new java.awt.Color(204, 204, 204));
        CCinfo.setMaximumSize(new java.awt.Dimension(486, 409));
        CCinfo.setPreferredSize(new java.awt.Dimension(486, 409));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("Supplier:");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText("Branch:");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("Username:");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 51));
        jLabel72.setText("Password:");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setText("Number of Cameras:");

        ccSupp.setEditable(false);
        ccSupp.setForeground(new java.awt.Color(102, 102, 102));
        ccSupp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ccBran.setEditable(false);
        ccBran.setForeground(new java.awt.Color(102, 102, 102));
        ccBran.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ccUN.setEditable(false);
        ccUN.setForeground(new java.awt.Color(102, 102, 102));
        ccUN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ccPW.setEditable(false);
        ccPW.setForeground(new java.awt.Color(102, 102, 102));
        ccPW.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ccNum.setEditable(false);
        ccNum.setForeground(new java.awt.Color(102, 102, 102));
        ccNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 51));
        jLabel74.setText("Remarks:");

        ccRem.setEditable(false);
        ccRem.setColumns(20);
        ccRem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ccRem.setRows(5);
        jScrollPane1.setViewportView(ccRem);

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(51, 51, 51));
        jLabel101.setText("HDD:");

        ccHDD.setEditable(false);
        ccHDD.setForeground(new java.awt.Color(102, 102, 102));
        ccHDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 51, 51));
        jLabel102.setText("DVR:");

        ccDVR.setEditable(false);
        ccDVR.setForeground(new java.awt.Color(102, 102, 102));
        ccDVR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout CCinfoLayout = new javax.swing.GroupLayout(CCinfo);
        CCinfo.setLayout(CCinfoLayout);
        CCinfoLayout.setHorizontalGroup(
            CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(CCinfoLayout.createSequentialGroup()
                        .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CCinfoLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(42, 42, 42)
                                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CCinfoLayout.createSequentialGroup()
                                        .addComponent(ccBran, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel73)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ccSupp)))
                            .addGroup(CCinfoLayout.createSequentialGroup()
                                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel101))
                                .addGap(18, 18, 18)
                                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CCinfoLayout.createSequentialGroup()
                                        .addComponent(ccHDD, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel102)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ccDVR))
                                    .addComponent(ccUN)
                                    .addComponent(ccPW)))
                            .addComponent(jLabel65)
                            .addComponent(jLabel74))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CCinfoLayout.setVerticalGroup(
            CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCinfoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(ccBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(ccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(ccSupp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(ccUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(ccPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(ccHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(ccDVR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(13, 13, 129));
        jLabel70.setText("CCTV History");

        countHis3.setBackground(new java.awt.Color(255, 255, 255));
        countHis3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel76.setText("History Found:");

        jLabel77.setText("CCTV/s Found:");

        countCC.setBackground(new java.awt.Color(255, 255, 255));
        countCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        ccTransfer.setBackground(new java.awt.Color(255, 255, 255));
        ccTransfer.setForeground(new java.awt.Color(0, 0, 102));
        ccTransfer.setText("Transfer");
        ccTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccTransferActionPerformed(evt);
            }
        });

        ccEdit.setBackground(new java.awt.Color(255, 255, 255));
        ccEdit.setForeground(new java.awt.Color(0, 0, 102));
        ccEdit.setText("Edit");
        ccEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccEditActionPerformed(evt);
            }
        });

        ccUpdate.setBackground(new java.awt.Color(255, 255, 255));
        ccUpdate.setForeground(new java.awt.Color(0, 0, 102));
        ccUpdate.setText("Update");

        ccRepair.setBackground(new java.awt.Color(255, 255, 255));
        ccRepair.setForeground(new java.awt.Color(0, 0, 102));
        ccRepair.setText("For Repair");
        ccRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccRepairActionPerformed(evt);
            }
        });

        ccPurchase.setBackground(new java.awt.Color(255, 255, 255));
        ccPurchase.setForeground(new java.awt.Color(0, 0, 102));
        ccPurchase.setText("Purchase");
        ccPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccPurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CCcardLayout = new javax.swing.GroupLayout(CCcard);
        CCcard.setLayout(CCcardLayout);
        CCcardLayout.setHorizontalGroup(
            CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CCcardLayout.createSequentialGroup()
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CCcardLayout.createSequentialGroup()
                                .addComponent(ccSort, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CCcardLayout.createSequentialGroup()
                                .addComponent(CCinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ccTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ccDel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ccRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ccPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CCcardLayout.createSequentialGroup()
                                        .addComponent(ccUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ccEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(28, 28, 28)
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(CCcardLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countHis3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CCcardLayout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel68)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CCcardLayout.setVerticalGroup(
            CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCcardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CCcardLayout.createSequentialGroup()
                        .addComponent(ccRepair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ccTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ccPurchase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ccDel)
                        .addGap(13, 13, 13)
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccEdit)
                            .addComponent(ccUpdate)))
                    .addGroup(CCcardLayout.createSequentialGroup()
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel68)
                                .addComponent(jLabel70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(countHis3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(7, 7, 7)
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(CCinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))))
                .addGap(16, 16, 16)
                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton7))
                    .addGroup(CCcardLayout.createSequentialGroup()
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77)
                            .addComponent(countCC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        INVcard.add(CCcard, "card2");

        PRcard.setBackground(new java.awt.Color(255, 255, 255));
        PRcard.setForeground(new java.awt.Color(51, 51, 51));
        PRcard.setMaximumSize(new java.awt.Dimension(1700, 933));
        PRcard.setPreferredSize(new java.awt.Dimension(1700, 933));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(13, 13, 129));
        jLabel86.setText("Printer Information");

        prSearchtxt.setForeground(new java.awt.Color(51, 51, 51));
        prSearchtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prSearchtxtMouseClicked(evt);
            }
        });

        prSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        prSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prSortActionPerformed(evt);
            }
        });

        prPurchase.setBackground(new java.awt.Color(255, 255, 255));
        prPurchase.setForeground(new java.awt.Color(0, 0, 102));
        prPurchase.setText("Purchase");
        prPurchase.setMaximumSize(new java.awt.Dimension(103, 26));
        prPurchase.setMinimumSize(new java.awt.Dimension(103, 26));
        prPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prPurchaseActionPerformed(evt);
            }
        });

        prDispose.setBackground(new java.awt.Color(255, 255, 255));
        prDispose.setForeground(new java.awt.Color(0, 0, 102));
        prDispose.setText("Dispose");
        prDispose.setMaximumSize(new java.awt.Dimension(103, 26));
        prDispose.setMinimumSize(new java.awt.Dimension(103, 26));
        prDispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prDisposeActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(13, 13, 129));
        jLabel88.setText("Printer History");

        PRinfo.setBackground(new java.awt.Color(204, 204, 204));
        PRinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PRinfo.setMaximumSize(new java.awt.Dimension(486, 409));
        PRinfo.setPreferredSize(new java.awt.Dimension(486, 407));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setText("Department:");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 51));
        jLabel78.setText("Branch:");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 51, 51));
        jLabel79.setText("Printer Name:");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 51));
        jLabel81.setText("Manufacturer:");

        prDept.setEditable(false);
        prDept.setForeground(new java.awt.Color(102, 102, 102));
        prDept.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prBran.setEditable(false);
        prBran.setForeground(new java.awt.Color(102, 102, 102));
        prBran.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prName.setEditable(false);
        prName.setForeground(new java.awt.Color(102, 102, 102));
        prName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prManu.setEditable(false);
        prManu.setForeground(new java.awt.Color(102, 102, 102));
        prManu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("Remarks:");

        prRem.setEditable(false);
        prRem.setColumns(20);
        prRem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prRem.setRows(5);
        jScrollPane16.setViewportView(prRem);

        javax.swing.GroupLayout PRinfoLayout = new javax.swing.GroupLayout(PRinfo);
        PRinfo.setLayout(PRinfoLayout);
        PRinfoLayout.setHorizontalGroup(
            PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRinfoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PRinfoLayout.createSequentialGroup()
                        .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel78))
                        .addGap(25, 25, 25)
                        .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prBran)
                            .addComponent(prDept, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PRinfoLayout.createSequentialGroup()
                        .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel82)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prName)
                            .addComponent(prManu)))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        PRinfoLayout.setVerticalGroup(
            PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRinfoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78)
                    .addComponent(prBran, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prDept, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addGap(18, 18, 18)
                .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(prName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(prManu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel89.setText("Printer/s found:");

        countPR.setBackground(new java.awt.Color(255, 255, 255));
        countPR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        prTransfer.setBackground(new java.awt.Color(255, 255, 255));
        prTransfer.setForeground(new java.awt.Color(0, 0, 102));
        prTransfer.setText("Transfer");
        prTransfer.setMaximumSize(new java.awt.Dimension(103, 26));
        prTransfer.setMinimumSize(new java.awt.Dimension(103, 26));
        prTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prTransferActionPerformed(evt);
            }
        });

        prUpdate.setBackground(new java.awt.Color(255, 255, 255));
        prUpdate.setForeground(new java.awt.Color(0, 0, 102));
        prUpdate.setText("Update");
        prUpdate.setMaximumSize(new java.awt.Dimension(103, 26));
        prUpdate.setMinimumSize(new java.awt.Dimension(103, 26));
        prUpdate.setPreferredSize(new java.awt.Dimension(103, 26));

        prEdit.setBackground(new java.awt.Color(255, 255, 255));
        prEdit.setForeground(new java.awt.Color(0, 0, 102));
        prEdit.setText("Edit");
        prEdit.setMaximumSize(new java.awt.Dimension(103, 26));
        prEdit.setMinimumSize(new java.awt.Dimension(103, 26));
        prEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prEditActionPerformed(evt);
            }
        });

        hisTbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        hisTbl3.setSelectionBackground(new java.awt.Color(0, 0, 102));
        jScrollPane15.setViewportView(hisTbl3);

        prTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        prTbl.setSelectionBackground(new java.awt.Color(0, 0, 102));
        prTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prTblMouseClicked(evt);
            }
        });
        jScrollPane27.setViewportView(prTbl);

        jLabel48.setText("History Found:");

        countHis2.setBackground(new java.awt.Color(255, 255, 255));
        countHis2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        prRepair.setBackground(new java.awt.Color(255, 255, 255));
        prRepair.setForeground(new java.awt.Color(0, 0, 102));
        prRepair.setText("For Repair");
        prRepair.setMaximumSize(new java.awt.Dimension(103, 26));
        prRepair.setMinimumSize(new java.awt.Dimension(103, 26));
        prRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prRepairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PRcardLayout = new javax.swing.GroupLayout(PRcard);
        PRcard.setLayout(PRcardLayout);
        PRcardLayout.setHorizontalGroup(
            PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PRcardLayout.createSequentialGroup()
                        .addComponent(prSort, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countPR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PRcardLayout.createSequentialGroup()
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRcardLayout.createSequentialGroup()
                                .addComponent(PRinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prDispose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prRepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PRcardLayout.createSequentialGroup()
                                        .addComponent(prUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel86))
                        .addGap(18, 18, 18)
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRcardLayout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countHis2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane15))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PRcardLayout.setVerticalGroup(
            PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRcardLayout.createSequentialGroup()
                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRcardLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jLabel88)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRcardLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countHis2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PRcardLayout.createSequentialGroup()
                        .addComponent(prRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prDispose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PRinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(countPR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel89)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        INVcard.add(PRcard, "card2");

        OTcard.setBackground(new java.awt.Color(255, 255, 255));

        otTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "null", "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        otTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        otTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otTblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                otTblMousePressed(evt);
            }
        });
        otTbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otTblKeyTyped(evt);
            }
        });
        otherTbl.setViewportView(otTbl);

        otherSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "Processor", "Motherboard", "RAM", "Harddisk", "Monitor", "UPS", "Keyboard-Mouse" }));

        otherSearchtxt.setForeground(new java.awt.Color(51, 51, 51));

        otherRefresh.setBorderPainted(false);
        otherRefresh.setContentAreaFilled(false);
        otherRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRefreshActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(13, 13, 129));
        jLabel93.setText("IT Reserve");

        hisTbl4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        hisTbl4.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane33.setViewportView(hisTbl4);

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(13, 13, 129));
        jLabel99.setText("Reserve History");

        jLabel100.setText("History Found:");

        countHis4.setBackground(new java.awt.Color(255, 255, 255));
        countHis4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        prRepair1.setBackground(new java.awt.Color(255, 255, 255));
        prRepair1.setForeground(new java.awt.Color(0, 0, 102));
        prRepair1.setText("For Repair");
        prRepair1.setMaximumSize(new java.awt.Dimension(103, 26));
        prRepair1.setMinimumSize(new java.awt.Dimension(103, 26));
        prRepair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prRepair1ActionPerformed(evt);
            }
        });

        prTransfer1.setBackground(new java.awt.Color(255, 255, 255));
        prTransfer1.setForeground(new java.awt.Color(0, 0, 102));
        prTransfer1.setText("Transfer");
        prTransfer1.setMaximumSize(new java.awt.Dimension(103, 26));
        prTransfer1.setMinimumSize(new java.awt.Dimension(103, 26));
        prTransfer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prTransfer1ActionPerformed(evt);
            }
        });

        prPurchase1.setBackground(new java.awt.Color(255, 255, 255));
        prPurchase1.setForeground(new java.awt.Color(0, 0, 102));
        prPurchase1.setText("Purchase");
        prPurchase1.setMaximumSize(new java.awt.Dimension(103, 26));
        prPurchase1.setMinimumSize(new java.awt.Dimension(103, 26));
        prPurchase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prPurchase1ActionPerformed(evt);
            }
        });

        prDispose1.setBackground(new java.awt.Color(255, 255, 255));
        prDispose1.setForeground(new java.awt.Color(0, 0, 102));
        prDispose1.setText("Dispose");
        prDispose1.setMaximumSize(new java.awt.Dimension(103, 26));
        prDispose1.setMinimumSize(new java.awt.Dimension(103, 26));
        prDispose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prDispose1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OTcardLayout = new javax.swing.GroupLayout(OTcard);
        OTcard.setLayout(OTcardLayout);
        OTcardLayout.setHorizontalGroup(
            OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OTcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addGroup(OTcardLayout.createSequentialGroup()
                        .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OTcardLayout.createSequentialGroup()
                                .addComponent(otherSort, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel99)
                            .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OTcardLayout.createSequentialGroup()
                                    .addComponent(otherTbl, javax.swing.GroupLayout.DEFAULT_SIZE, 1493, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(prDispose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prTransfer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prRepair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prPurchase1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane33)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OTcardLayout.createSequentialGroup()
                                    .addComponent(jLabel100)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(countHis4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61)
                        .addComponent(otherRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        OTcardLayout.setVerticalGroup(
            OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OTcardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93)
                .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OTcardLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(otherRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OTcardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(otherSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otherSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(otherTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OTcardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OTcardLayout.createSequentialGroup()
                                .addComponent(prRepair1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prTransfer1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(prDispose1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OTcardLayout.createSequentialGroup()
                                .addComponent(prPurchase1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))))
                .addGap(26, 26, 26)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel100)
                    .addComponent(countHis4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        INVcard.add(OTcard, "card5");

        PR1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PR1.setForeground(new java.awt.Color(0, 51, 51));
        PR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2others.jpg"))); // NOI18N
        PR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout INVmaincardLayout = new javax.swing.GroupLayout(INVmaincard);
        INVmaincard.setLayout(INVmaincardLayout);
        INVmaincardLayout.setHorizontalGroup(
            INVmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INVmaincardLayout.createSequentialGroup()
                .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PR1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(INVcard, javax.swing.GroupLayout.DEFAULT_SIZE, 1813, Short.MAX_VALUE)
        );
        INVmaincardLayout.setVerticalGroup(
            INVmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INVmaincardLayout.createSequentialGroup()
                .addGroup(INVmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PR1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(INVcard, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE))
        );

        Maincard.add(INVmaincard, "card6");

        Adding.setBackground(new java.awt.Color(255, 255, 255));
        Adding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jPanel2.setLayout(new java.awt.CardLayout());

        Request.setBackground(new java.awt.Color(255, 255, 255));
        Request.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setForeground(new java.awt.Color(0, 0, 51));

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Request Device");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        reqBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBranchActionPerformed(evt);
            }
        });

        jLabel1a.setText("Branch:");

        jLabel8a.setText("Department:");

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        jPanel19.setLayout(new java.awt.CardLayout());

        Unit.setBackground(new java.awt.Color(204, 204, 204));

        unitTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        unitTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        unitTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unitTblMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(unitTbl);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Processor:");

        unitPro.setForeground(new java.awt.Color(102, 102, 102));
        unitPro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("RAM:");

        unitRam.setForeground(new java.awt.Color(102, 102, 102));
        unitRam.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Hard Drive:");

        unitHar.setForeground(new java.awt.Color(102, 102, 102));
        unitHar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Motherboard:");

        unitMot.setForeground(new java.awt.Color(102, 102, 102));
        unitMot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("UPS:");

        unitUPS.setForeground(new java.awt.Color(102, 102, 102));
        unitUPS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("Monitor:");

        unitMon.setForeground(new java.awt.Color(102, 102, 102));
        unitMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Mouse:");

        unitKey.setForeground(new java.awt.Color(102, 102, 102));
        unitKey.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Quantity:");

        unitQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        unitAdd.setBackground(new java.awt.Color(255, 255, 255));
        unitAdd.setText("Add to Cart");
        unitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitAddActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(51, 51, 51));
        jLabel107.setText("Keyboard:");

        unitMou.setForeground(new java.awt.Color(102, 102, 102));
        unitMou.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout UnitLayout = new javax.swing.GroupLayout(Unit);
        Unit.setLayout(UnitLayout);
        UnitLayout.setHorizontalGroup(
            UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnitLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(UnitLayout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(7, 7, 7)
                                    .addComponent(unitMot, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(UnitLayout.createSequentialGroup()
                                    .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel33))
                                    .addGap(24, 24, 24)
                                    .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(unitPro, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                        .addComponent(unitHar)))
                                .addComponent(unitMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unitUPS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel50)
                            .addComponent(jLabel39)
                            .addComponent(unitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UnitLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(unitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(unitAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UnitLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(44, 44, 44)
                                .addComponent(unitRam))
                            .addGroup(UnitLayout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unitKey))
                            .addGroup(UnitLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(29, 29, 29)
                                .addComponent(unitMou)))))
                .addGap(46, 46, 46))
        );
        UnitLayout.setVerticalGroup(
            UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnitLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(unitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel35)
                    .addComponent(unitRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unitMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel107)
                        .addComponent(unitKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(unitHar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(unitMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(unitMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(unitUPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(unitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(unitAdd))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel19.add(Unit, "card2");

        Others.setBackground(new java.awt.Color(204, 204, 204));

        othersTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        othersTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        othersTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersTblMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(othersTbl);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Device:");

        othersField.setForeground(new java.awt.Color(102, 102, 102));
        othersField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        othersQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        othersQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setText("Quantity:");

        othersAdd.setBackground(new java.awt.Color(255, 255, 255));
        othersAdd.setText("Add to Cart");
        othersAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OthersLayout = new javax.swing.GroupLayout(Others);
        Others.setLayout(OthersLayout);
        OthersLayout.setHorizontalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OthersLayout.createSequentialGroup()
                        .addComponent(othersSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(779, 779, 779))
                    .addGroup(OthersLayout.createSequentialGroup()
                        .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OthersLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(24, 24, 24)
                                .addComponent(othersField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(othersQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(othersAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        OthersLayout.setVerticalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(othersSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(othersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel51)
                    .addComponent(othersQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(othersAdd))
                .addGap(69, 69, 69))
        );

        jPanel19.add(Others, "card3");

        CCTV.setBackground(new java.awt.Color(204, 204, 204));

        cctvTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        cctvTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        cctvTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cctvTblMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(cctvTbl);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("CCTV:");

        cctvField.setForeground(new java.awt.Color(102, 102, 102));
        cctvField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Camera Quantity:");

        cctvQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cctvQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        cctvAdd.setBackground(new java.awt.Color(255, 255, 255));
        cctvAdd.setText("Add to Cart");
        cctvAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cctvAddActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel111.setText("Username:");

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel182.setText("Password:");

        javax.swing.GroupLayout CCTVLayout = new javax.swing.GroupLayout(CCTV);
        CCTV.setLayout(CCTVLayout);
        CCTVLayout.setHorizontalGroup(
            CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCTVLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CCTVLayout.createSequentialGroup()
                        .addComponent(cctvSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(779, 789, Short.MAX_VALUE))
                    .addGroup(CCTVLayout.createSequentialGroup()
                        .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CCTVLayout.createSequentialGroup()
                                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CCTVLayout.createSequentialGroup()
                                        .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel111)
                                            .addComponent(jLabel52))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(CCTVLayout.createSequentialGroup()
                                        .addComponent(jLabel182)
                                        .addGap(10, 10, 10)))
                                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                    .addComponent(cctvField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                    .addComponent(una, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cctvQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(cctvAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        CCTVLayout.setVerticalGroup(
            CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCTVLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cctvSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cctvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(cctvQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cctvAdd))
                .addGap(18, 18, 18)
                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(una, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel182)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel19.add(CCTV, "card4");

        Printer.setBackground(new java.awt.Color(204, 204, 204));

        printerTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        printerTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        printerTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printerTblMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(printerTbl);

        jLabel54a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54a.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54a.setText("Printer:");

        printerField.setForeground(new java.awt.Color(102, 102, 102));
        printerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel55a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55a.setText("Quantity:");

        printerQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        printerQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        printerAdd.setBackground(new java.awt.Color(255, 255, 255));
        printerAdd.setText("Add to Request");
        printerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrinterLayout = new javax.swing.GroupLayout(Printer);
        Printer.setLayout(PrinterLayout);
        PrinterLayout.setHorizontalGroup(
            PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrinterLayout.createSequentialGroup()
                        .addComponent(printerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(779, 779, 779))
                    .addGroup(PrinterLayout.createSequentialGroup()
                        .addGroup(PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane19)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrinterLayout.createSequentialGroup()
                                .addComponent(jLabel54a)
                                .addGap(24, 24, 24)
                                .addComponent(printerField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addComponent(jLabel55a)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(printerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(printerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        PrinterLayout.setVerticalGroup(
            PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(printerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54a)
                    .addComponent(jLabel55a)
                    .addComponent(printerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printerAdd))
                .addGap(69, 69, 69))
        );

        jPanel19.add(Printer, "card5");

        jLabel18a.setText("Select:");

        unitSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unit", "Processor", "Motherboard", "Harddrive", "Monitor", "RAM", "UPS", "Keyboard", "Mouse", " " }));
        unitSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel18a)
                .addGap(61, 61, 61)
                .addComponent(unitSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(661, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unitSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18a))
                .addContainerGap(509, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                    .addGap(0, 58, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        jLabel16a.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16a.setText("Devices to Request");

        Cart.setModel(new javax.swing.table.DefaultTableModel(
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
        Cart.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane10.setViewportView(Cart);

        reqRemove.setText("Remove");
        reqRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqRemoveActionPerformed(evt);
            }
        });

        reqCheckout.setText("Check-out");
        reqCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqCheckoutActionPerformed(evt);
            }
        });

        reqCancel.setText("Cancel");
        reqCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqCancelActionPerformed(evt);
            }
        });

        unitKey2.setForeground(new java.awt.Color(102, 102, 102));
        unitKey2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Total Price:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel16a)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitKey2)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reqCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reqRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reqCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(7, 7, 7)
                        .addComponent(unitKey2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(reqCheckout)
                        .addGap(7, 7, 7)
                        .addComponent(reqRemove)
                        .addGap(11, 11, 11)
                        .addComponent(reqCancel)))
                .addGap(57, 57, 57))
        );

        jLabel8a1.setText("Owner:");

        jCheckBox1.setText("FOR IT RESERVE");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestLayout = new javax.swing.GroupLayout(Request);
        Request.setLayout(RequestLayout);
        RequestLayout.setHorizontalGroup(
            RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestLayout.createSequentialGroup()
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestLayout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RequestLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RequestLayout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RequestLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RequestLayout.createSequentialGroup()
                                        .addComponent(jLabel8a1)
                                        .addGap(18, 18, 18)
                                        .addComponent(reqOwn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox1))
                                    .addGroup(RequestLayout.createSequentialGroup()
                                        .addComponent(jLabel1a)
                                        .addGap(18, 18, 18)
                                        .addComponent(reqBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel8a)
                                        .addGap(18, 18, 18)
                                        .addComponent(unitDept, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        RequestLayout.setVerticalGroup(
            RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1a)
                    .addComponent(reqBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8a)
                    .addComponent(unitDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqOwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8a1)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(11, 11, 11)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(Request, "card2");

        javax.swing.GroupLayout AddingLayout = new javax.swing.GroupLayout(Adding);
        Adding.setLayout(AddingLayout);
        AddingLayout.setHorizontalGroup(
            AddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddingLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        AddingLayout.setVerticalGroup(
            AddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddingLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        Maincard.add(Adding, "card5");

        HISmaincard.setBackground(new java.awt.Color(255, 255, 255));
        HISmaincard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        allHisTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        allHisTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        allHisTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        allHisTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allHisTblMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(allHisTbl);

        HISsearchf.setForeground(new java.awt.Color(0, 0, 102));
        HISsearchf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HISsearchfKeyReleased(evt);
            }
        });

        HISfilter.setForeground(new java.awt.Color(0, 0, 102));
        HISfilter.setText("Filter");
        HISfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HISfilterActionPerformed(evt);
            }
        });

        HISdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HISdetails.setLayout(new java.awt.CardLayout());

        jLabel113.setText("PC Name:");

        jLabel115.setText("Start Date:");

        jLabel116.setText("Action:");

        jLabel117.setText("End Date:");

        jLabel118.setText("Start Time:");

        jLabel119.setText("End Time:");

        jLabel120.setText("Remarks:");

        jLabel121.setText("Performed by:");

        jLabel122.setText("Price:");

        pcHisRem.setColumns(20);
        pcHisRem.setRows(5);
        jScrollPane21.setViewportView(pcHisRem);

        pcHisUpdate.setBackground(new java.awt.Color(255, 255, 255));
        pcHisUpdate.setForeground(new java.awt.Color(0, 0, 102));
        pcHisUpdate.setText("Edit");
        pcHisUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcHisUpdateActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(0, 0, 103));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Computer Repair & Maintenance History");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel103)
                .addContainerGap())
        );

        jLabel141.setText("Branch:");

        pcHisUpdate2.setBackground(new java.awt.Color(255, 255, 255));
        pcHisUpdate2.setForeground(new java.awt.Color(0, 0, 102));
        pcHisUpdate2.setText("Update");
        pcHisUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcHisUpdate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HISpcLayout = new javax.swing.GroupLayout(HISpc);
        HISpc.setLayout(HISpcLayout);
        HISpcLayout.setHorizontalGroup(
            HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpcLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
            .addGroup(HISpcLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(jLabel118))
                        .addGap(34, 34, 34)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addComponent(pcHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel117))
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addComponent(pcHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel119)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pcHisETime, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(pcHisSDate)))
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel116))
                                .addGap(43, 43, 43)
                                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(HISpcLayout.createSequentialGroup()
                                        .addComponent(pcHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel122)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pcHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pcHisName)))
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addGap(18, 18, 18)
                                .addComponent(pcHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 72, Short.MAX_VALUE)
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addComponent(jLabel141)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pcHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel120))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpcLayout.createSequentialGroup()
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pcHisUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pcHisUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        HISpcLayout.setVerticalGroup(
            HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpcLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpcLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pcHisName))
                        .addGap(17, 17, 17)))
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116)
                            .addComponent(pcHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122)
                            .addComponent(pcHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(pcHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel115)
                                    .addComponent(pcHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))
                            .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel117)
                                .addComponent(pcHisSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel119)
                            .addComponent(pcHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel118))))
                .addGap(18, 18, 18)
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcHisUpdate)
                    .addComponent(pcHisUpdate2))
                .addGap(18, 18, 18))
        );

        HISdetails.add(HISpc, "card1");

        jLabel114.setText("Service Provider:");

        jLabel143.setText("Start Date:");

        jLabel144.setText("Action:");

        jLabel145.setText("End Date:");

        jLabel146.setText("Start Time:");

        jLabel147.setText("End Time:");

        jLabel148.setText("Remarks:");

        jLabel149.setText("Performed by:");

        jLabel150.setText("Price:");

        ccHisRem.setColumns(20);
        ccHisRem.setRows(5);
        jScrollPane24.setViewportView(ccHisRem);

        ccHisUpdate.setBackground(new java.awt.Color(255, 255, 255));
        ccHisUpdate.setForeground(new java.awt.Color(0, 0, 102));
        ccHisUpdate.setText("Edit");
        ccHisUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccHisUpdateActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(0, 0, 103));

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("CCTV Repair & Maintenance History");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel112)
                .addContainerGap())
        );

        jLabel151.setText("Branch:");

        ccHisUpdate2.setBackground(new java.awt.Color(255, 255, 255));
        ccHisUpdate2.setForeground(new java.awt.Color(0, 0, 102));
        ccHisUpdate2.setText("Update");
        ccHisUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccHisUpdate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HISccLayout = new javax.swing.GroupLayout(HIScc);
        HIScc.setLayout(HISccLayout);
        HISccLayout.setHorizontalGroup(
            HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISccLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
            .addGroup(HISccLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114)
                            .addComponent(jLabel144)
                            .addComponent(jLabel149)
                            .addComponent(jLabel146))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(HISccLayout.createSequentialGroup()
                                    .addComponent(ccHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel150)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ccHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ccHisName, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ccHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HISccLayout.createSequentialGroup()
                                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ccHisSDate, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(ccHisSTime))
                                .addGap(27, 27, 27)
                                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HISccLayout.createSequentialGroup()
                                        .addComponent(jLabel145)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ccHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(HISccLayout.createSequentialGroup()
                                        .addComponent(jLabel147)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ccHisETime)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISccLayout.createSequentialGroup()
                                .addComponent(jLabel151)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel148))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISccLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ccHisUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccHisUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        HISccLayout.setVerticalGroup(
            HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISccLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccHisName)
                    .addComponent(ccHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151))
                .addGap(16, 16, 16)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144)
                    .addComponent(ccHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(ccHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148))
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel149)
                            .addComponent(ccHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISccLayout.createSequentialGroup()
                                .addComponent(jLabel143)
                                .addGap(2, 2, 2))
                            .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel145)
                                .addComponent(ccHisSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ccHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(ccHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel146))
                .addGap(14, 14, 14)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccHisUpdate)
                    .addComponent(ccHisUpdate2))
                .addContainerGap())
        );

        HISdetails.add(HIScc, "card1");

        jLabel152.setText("Manufacturer:");

        jLabel153.setText("Start Date:");

        jLabel154.setText("Action:");

        jLabel155.setText("End Date:");

        jLabel156.setText("Start Time:");

        jLabel157.setText("End Time:");

        jLabel158.setText("Remarks:");

        jLabel159.setText("Performed by:");

        jLabel160.setText("Price:");

        prHisRem.setColumns(20);
        prHisRem.setRows(5);
        jScrollPane26.setViewportView(prHisRem);

        prHisUpdate.setBackground(new java.awt.Color(255, 255, 255));
        prHisUpdate.setForeground(new java.awt.Color(0, 0, 102));
        prHisUpdate.setText("Edit");
        prHisUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prHisUpdateActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 0, 103));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("Printer Repair & Maintenance History");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel104)
                .addContainerGap())
        );

        jLabel161.setText("Branch:");

        prHisUpdate2.setBackground(new java.awt.Color(255, 255, 255));
        prHisUpdate2.setForeground(new java.awt.Color(0, 0, 102));
        prHisUpdate2.setText("Update");
        prHisUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prHisUpdate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HISprLayout = new javax.swing.GroupLayout(HISpr);
        HISpr.setLayout(HISprLayout);
        HISprLayout.setHorizontalGroup(
            HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISprLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
            .addGroup(HISprLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(HISprLayout.createSequentialGroup()
                                    .addComponent(jLabel154)
                                    .addGap(63, 63, 63))
                                .addComponent(jLabel152, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel159))
                        .addGap(7, 7, 7)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HISprLayout.createSequentialGroup()
                                .addComponent(prHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel160)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisPric, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(prHisPerf)
                            .addComponent(prHisName)))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel153)
                            .addComponent(jLabel156))
                        .addGap(37, 37, 37)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prHisSDate, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(prHisSTime))
                        .addGap(18, 18, 18)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel157, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addComponent(jLabel161)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel158))
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(prHisUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prHisUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane26))
                        .addGap(30, 30, 30))))
        );
        HISprLayout.setVerticalGroup(
            HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISprLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel161))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisUpdate)
                            .addComponent(prHisUpdate2)))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prHisName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel160)
                                    .addComponent(prHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel159)
                                    .addComponent(prHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(HISprLayout.createSequentialGroup()
                                        .addComponent(jLabel153)
                                        .addGap(2, 2, 2))
                                    .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel155)
                                        .addComponent(prHisSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel157)
                                    .addComponent(prHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel156)))
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel154)))))
                .addGap(35, 35, 35))
        );

        HISdetails.add(HISpr, "card1");

        jLabel123.setText("PC Name:");

        jLabel124.setText("Start Date:");

        jLabel125.setText("Action:");

        jLabel126.setText("End Date:");

        jLabel127.setText("Start Time:");

        jLabel128.setText("End Time:");

        jLabel129.setText("Remarks:");

        jLabel130.setText("Performed by:");

        jLabel131.setText("Price:");

        pcHisRem1.setColumns(20);
        pcHisRem1.setRows(5);
        jScrollPane22.setViewportView(pcHisRem1);

        pcHisSDate1.setDateFormatString("yyyy-MM-dd");

        pcHisEDate1.setDateFormatString("yyyy-MM-dd");

        pcHisUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        pcHisUpdate1.setForeground(new java.awt.Color(0, 0, 102));
        pcHisUpdate1.setText("Update");

        jPanel11.setBackground(new java.awt.Color(0, 0, 103));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Computer Repair & Maintenance History");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel105)
                .addContainerGap())
        );

        jLabel162.setText("Branch:");

        jLabel183.setText("jLabel183");

        javax.swing.GroupLayout HISpc1Layout = new javax.swing.GroupLayout(HISpc1);
        HISpc1.setLayout(HISpc1Layout);
        HISpc1Layout.setHorizontalGroup(
            HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpc1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pcHisUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(HISpc1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123)
                            .addComponent(jLabel125))
                        .addGap(43, 43, 43)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HISpc1Layout.createSequentialGroup()
                                .addComponent(pcHisAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel131)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pcHisPric1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pcHisName1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel124)
                            .addComponent(jLabel127))
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpc1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pcHisEDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel126))
                            .addGroup(HISpc1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(pcHisSTime1)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel128)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pcHisETime1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HISpc1Layout.createSequentialGroup()
                                .addComponent(pcHisEDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pcHisSDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pcHisSDate2)
                            .addComponent(pcHisPerf1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpc1Layout.createSequentialGroup()
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pcHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel129))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
            .addGroup(HISpc1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel183)
                .addGap(50, 50, 50))
        );
        HISpc1Layout.setVerticalGroup(
            HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpc1Layout.createSequentialGroup()
                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpc1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pcHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel162)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpc1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pcHisName1))
                                .addGap(17, 17, 17))))
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel183)))
                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pcHisUpdate1))
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel125)
                            .addComponent(pcHisAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel131)
                            .addComponent(pcHisPric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel130)
                            .addComponent(pcHisPerf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pcHisSDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel124)
                                        .addComponent(pcHisSDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel126)
                                    .addComponent(pcHisEDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pcHisEDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcHisSTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel128)
                            .addComponent(jLabel127)
                            .addComponent(pcHisETime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        HISdetails.add(HISpc1, "card1");

        jLabel132.setText("Service Provider:");

        jLabel163.setText("Start Date:");

        jLabel164.setText("Action:");

        jLabel165.setText("End Date:");

        jLabel166.setText("Start Time:");

        jLabel167.setText("End Time:");

        jLabel168.setText("Remarks:");

        jLabel169.setText("Performed by:");

        jLabel170.setText("Price:");

        ccHisRem1.setColumns(20);
        ccHisRem1.setRows(5);
        jScrollPane28.setViewportView(ccHisRem1);

        ccHisUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        ccHisUpdate1.setForeground(new java.awt.Color(0, 0, 102));
        ccHisUpdate1.setText("Update");

        jPanel12.setBackground(new java.awt.Color(0, 0, 103));

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("CCTV Repair & Maintenance History");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel133)
                .addContainerGap())
        );

        jLabel171.setText("Branch:");

        jLabel184.setText("jLabel184");

        javax.swing.GroupLayout HIScc1Layout = new javax.swing.GroupLayout(HIScc1);
        HIScc1.setLayout(HIScc1Layout);
        HIScc1Layout.setHorizontalGroup(
            HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HIScc1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ccHisUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(HIScc1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163)
                            .addComponent(jLabel166))
                        .addGap(52, 52, 52)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HIScc1Layout.createSequentialGroup()
                                .addComponent(ccHisSTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel167)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccHisETime1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HIScc1Layout.createSequentialGroup()
                                .addComponent(ccHisSDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccHisEDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(jLabel164)
                            .addComponent(jLabel169))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HIScc1Layout.createSequentialGroup()
                                .addComponent(ccHisAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel170)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccHisPric1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ccHisName1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(HIScc1Layout.createSequentialGroup()
                                    .addComponent(jLabel165)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ccHisEDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ccHisSDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ccHisPerf1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 85, Short.MAX_VALUE)
                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HIScc1Layout.createSequentialGroup()
                                .addComponent(jLabel171)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel168))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
            .addGroup(HIScc1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel184)
                .addGap(77, 77, 77))
        );
        HIScc1Layout.setVerticalGroup(
            HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HIScc1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel184))
                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel171)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HIScc1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccHisName1))
                        .addGap(16, 16, 16)))
                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccHisUpdate1))
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel164)
                            .addComponent(ccHisAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel170)
                            .addComponent(ccHisPric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel169)
                            .addComponent(ccHisPerf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ccHisEDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ccHisSDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel163)
                                    .addComponent(ccHisSDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel165)
                            .addComponent(ccHisEDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccHisSTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel167)
                            .addComponent(jLabel166)
                            .addComponent(ccHisETime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        HISdetails.add(HIScc1, "card1");

        jLabel172.setText("Manufacturer:");

        jLabel173.setText("Start Date:");

        jLabel174.setText("Action:");

        jLabel175.setText("End Date:");

        jLabel176.setText("Start Time:");

        jLabel177.setText("End Time:");

        jLabel178.setText("Remarks:");

        jLabel179.setText("Performed by:");

        jLabel180.setText("Price:");

        prHisRem1.setColumns(20);
        prHisRem1.setRows(5);
        jScrollPane29.setViewportView(prHisRem1);

        prHisUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        prHisUpdate1.setForeground(new java.awt.Color(0, 0, 102));
        prHisUpdate1.setText("Update");

        jPanel13.setBackground(new java.awt.Color(0, 0, 103));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Printer Repair & Maintenance History");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel106)
                .addContainerGap())
        );

        jLabel181.setText("Branch:");

        jLabel185.setText("jLabel185");

        javax.swing.GroupLayout HISpr1Layout = new javax.swing.GroupLayout(HISpr1);
        HISpr1.setLayout(HISpr1Layout);
        HISpr1Layout.setHorizontalGroup(
            HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpr1Layout.createSequentialGroup()
                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HISpr1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prHisUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(HISpr1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(jLabel174)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpr1Layout.createSequentialGroup()
                                .addComponent(jLabel172)
                                .addGap(18, 18, 18)))
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(prHisAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel180)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisPric1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(prHisName1)))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel173)
                            .addComponent(jLabel176))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(prHisSTime1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel177))
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(prHisSDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prHisEDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel175)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prHisETime1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(prHisEDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(prHisSDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addComponent(jLabel179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prHisPerf1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(jLabel181)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel185))
                            .addComponent(jLabel178))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        HISpr1Layout.setVerticalGroup(
            HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpr1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel181)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpr1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prHisName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel185))
                        .addGap(8, 8, 8)))
                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel178)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prHisUpdate1))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel180)
                            .addComponent(prHisPric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel179)
                            .addComponent(prHisPerf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prHisEDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(prHisSDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel173)
                                    .addComponent(prHisSDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel175)
                                .addComponent(prHisEDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisSTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel177)
                            .addComponent(jLabel176)
                            .addComponent(prHisETime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel174)))
                .addGap(18, 18, 18))
        );

        HISdetails.add(HISpr1, "card1");

        Filter.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Device Type:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Filter");

        jLabel6.setText("Start Date:");

        hisSortCateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Computer", "CCTV", "Printer" }));

        hisSortSDate.setDateFormatString("yyyy-MM-dd");

        jLabel7.setText("End Date:");

        hisSortEDate.setDateFormatString("yyyy-MM-dd");

        hisHide.setBackground(new java.awt.Color(255, 255, 255));
        hisHide.setText("Hide");
        hisHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisHideActionPerformed(evt);
            }
        });

        hisGo.setBackground(new java.awt.Color(255, 255, 255));
        hisGo.setText("Go");
        hisGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FilterLayout = new javax.swing.GroupLayout(Filter);
        Filter.setLayout(FilterLayout);
        FilterLayout.setHorizontalGroup(
            FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilterLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FilterLayout.createSequentialGroup()
                        .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FilterLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hisSortCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FilterLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(hisSortSDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilterLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hisSortEDate, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(hisGo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hisHide)))))
                .addContainerGap())
        );
        FilterLayout.setVerticalGroup(
            FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilterLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FilterLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(hisSortCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hisSortSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel7)
                    .addComponent(hisSortEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hisHide)
                    .addComponent(hisGo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel49.setText("History Found:");

        countHis5.setBackground(new java.awt.Color(255, 255, 255));
        countHis5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        HisAdd.setBackground(new java.awt.Color(255, 255, 255));
        HisAdd.setForeground(new java.awt.Color(0, 0, 102));
        HisAdd.setText("Add History");
        HisAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HisAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HISmaincardLayout = new javax.swing.GroupLayout(HISmaincard);
        HISmaincard.setLayout(HISmaincardLayout);
        HISmaincardLayout.setHorizontalGroup(
            HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISmaincardLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(HISmaincardLayout.createSequentialGroup()
                        .addComponent(HISdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(HISmaincardLayout.createSequentialGroup()
                            .addComponent(HISsearchf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(HISfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 1570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HISmaincardLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countHis5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HisAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        HISmaincardLayout.setVerticalGroup(
            HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISmaincardLayout.createSequentialGroup()
                .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISmaincardLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(HISdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISmaincardLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HISfilter)
                        .addComponent(HISsearchf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HisAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(countHis5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49)))
                .addGap(51, 51, 51))
        );

        Maincard.add(HISmaincard, "card3");

        AddHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PCinfo4.setBackground(new java.awt.Color(255, 255, 255));
        PCinfo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PCinfo4.setPreferredSize(new java.awt.Dimension(486, 409));

        hisAddCan.setBackground(new java.awt.Color(255, 255, 255));
        hisAddCan.setForeground(new java.awt.Color(0, 0, 102));
        hisAddCan.setText("Cancel");
        hisAddCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisAddCanActionPerformed(evt);
            }
        });

        hisSave.setBackground(new java.awt.Color(255, 255, 255));
        hisSave.setForeground(new java.awt.Color(0, 0, 102));
        hisSave.setText("Save");
        hisSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisSaveActionPerformed(evt);
            }
        });

        jLabel142.setText("Remarks:");

        jLabel138.setText("End Date:");

        jLabel136.setText("Price:");

        jLabel135.setText("Performed by:");

        jLabel139.setText("Start Time:");

        jLabel137.setText("Start Date:");

        jLabel140.setText("End Time:");

        jLabel134.setText("Action:");

        hisRemAdd.setColumns(20);
        hisRemAdd.setRows(5);
        jScrollPane25.setViewportView(hisRemAdd);

        javax.swing.GroupLayout PCinfo4Layout = new javax.swing.GroupLayout(PCinfo4);
        PCinfo4.setLayout(PCinfo4Layout);
        PCinfo4Layout.setHorizontalGroup(
            PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCinfo4Layout.createSequentialGroup()
                        .addComponent(hisSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hisAddCan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel142)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCinfo4Layout.createSequentialGroup()
                                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel137)
                                    .addComponent(jLabel139))
                                .addGap(39, 39, 39)
                                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hisSTimeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hisSDateAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PCinfo4Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel140))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfo4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel138)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hisEDateAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hisETimeAdd)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCinfo4Layout.createSequentialGroup()
                                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel134)
                                    .addComponent(jLabel135)
                                    .addComponent(jLabel136))
                                .addGap(18, 18, 18)
                                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hisPerfAdd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hisPricAdd)
                                    .addComponent(hisActAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        PCinfo4Layout.setVerticalGroup(
            PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(hisActAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(hisPerfAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCinfo4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(hisPricAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfo4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel136)))
                .addGap(24, 24, 24)
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel137)
                        .addComponent(jLabel138))
                    .addComponent(hisSDateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hisEDateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hisSTimeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140)
                    .addComponent(jLabel139)
                    .addComponent(hisETimeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hisAddCan)
                    .addComponent(hisSave))
                .addGap(25, 25, 25))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 103));
        jPanel7.setForeground(new java.awt.Color(0, 0, 51));

        jLabel14.setBackground(new java.awt.Color(0, 51, 255));
        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Add Device History");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PCinfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PCinfo4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddHistoryLayout = new javax.swing.GroupLayout(AddHistory);
        AddHistory.setLayout(AddHistoryLayout);
        AddHistoryLayout.setHorizontalGroup(
            AddHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddHistoryLayout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(487, 487, 487))
        );
        AddHistoryLayout.setVerticalGroup(
            AddHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddHistoryLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        Maincard.add(AddHistory, "card4");

        Log.setBackground(new java.awt.Color(255, 255, 255));
        Log.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        actlogTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        actlogTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane4.setViewportView(actlogTbl);

        userlogTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        userlogTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane5.setViewportView(userlogTbl);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(13, 13, 129));
        jLabel22.setText("Activity Log");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(13, 13, 129));
        jLabel23.setText("User Log");

        ActLogSearch.setText("Search");
        ActLogSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActLogSearchMouseClicked(evt);
            }
        });
        ActLogSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ActLogSearchKeyReleased(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(227, 225, 225));

        jLabel24.setText("From:");

        jDateChooser2.setDateFormatString("MMM/dd/yy");

        jLabel25.setText("To:");

        jDateChooser1.setDateFormatString("MMM/dd/yy");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(227, 225, 225));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Open in PDF");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        UserLogSearch.setText("Search");
        UserLogSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLogSearchMouseClicked(evt);
            }
        });
        UserLogSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserLogSearchKeyReleased(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(227, 225, 225));

        jLabel27.setText("From:");

        jDateChooser3.setDateFormatString("MMM/dd/yy");

        jLabel29.setText("To:");

        jDateChooser4.setDateFormatString("MMM/dd/yy");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(227, 225, 225));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Open in PDF");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        alogrefresh.setBorderPainted(false);
        alogrefresh.setContentAreaFilled(false);
        alogrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alogrefreshActionPerformed(evt);
            }
        });

        ulogrefresh.setBorderPainted(false);
        ulogrefresh.setContentAreaFilled(false);
        ulogrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulogrefreshActionPerformed(evt);
            }
        });

        jLabel4.setText("Activity Log Count:");

        actLogCnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uLogCnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel44.setText("User Log Count:");

        javax.swing.GroupLayout LogLayout = new javax.swing.GroupLayout(Log);
        Log.setLayout(LogLayout);
        LogLayout.setHorizontalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1264, 1264, 1264))
                            .addGroup(LogLayout.createSequentialGroup()
                                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ulogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(alogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(UserLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ActLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(LogLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(LogLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(alogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(actLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LogLayout.createSequentialGroup()
                        .addComponent(ActLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ulogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogLayout.createSequentialGroup()
                        .addComponent(UserLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(LogLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Maincard.add(Log, "card6");

        Sys.setBackground(new java.awt.Color(255, 255, 255));
        Sys.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        brTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        brTbl.setMaximumSize(new java.awt.Dimension(1013, 437));
        brTbl.setMinimumSize(new java.awt.Dimension(1013, 437));
        brTbl.setPreferredSize(new java.awt.Dimension(1013, 437));
        brTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane3.setViewportView(brTbl);

        dpTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        dpTbl.setMaximumSize(new java.awt.Dimension(582, 437));
        dpTbl.setMinimumSize(new java.awt.Dimension(582, 437));
        dpTbl.setPreferredSize(new java.awt.Dimension(582, 437));
        dpTbl.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane32.setViewportView(dpTbl);

        branchAddbtn.setBackground(new java.awt.Color(255, 255, 255));
        branchAddbtn.setText("Add");
        branchAddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchAddbtnActionPerformed(evt);
            }
        });

        deptAddbtn.setBackground(new java.awt.Color(255, 255, 255));
        deptAddbtn.setText("Add");
        deptAddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptAddbtnActionPerformed(evt);
            }
        });

        branchEditbtn.setBackground(new java.awt.Color(255, 255, 255));
        branchEditbtn.setText("Edit");
        branchEditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchEditbtnActionPerformed(evt);
            }
        });

        deptDeletebtn.setBackground(new java.awt.Color(255, 255, 255));
        deptDeletebtn.setText("Delete");

        branchcard.setLayout(new java.awt.CardLayout());

        addBranch.setBackground(new java.awt.Color(204, 204, 204));

        PCinfo2.setBackground(new java.awt.Color(204, 204, 204));
        PCinfo2.setPreferredSize(new java.awt.Dimension(486, 409));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Address:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setText("Branch Name:");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(51, 51, 51));
        jLabel90.setText("Location:");

        branchAdd.setForeground(new java.awt.Color(102, 102, 102));
        branchAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        branchLoc.setForeground(new java.awt.Color(102, 102, 102));
        branchLoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        branchCancel.setBackground(new java.awt.Color(255, 255, 255));
        branchCancel.setForeground(new java.awt.Color(0, 0, 102));
        branchCancel.setText("Cancel");
        branchCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchCancelActionPerformed(evt);
            }
        });

        branchSave.setBackground(new java.awt.Color(255, 255, 255));
        branchSave.setForeground(new java.awt.Color(0, 0, 102));
        branchSave.setText("Save");
        branchSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchSaveActionPerformed(evt);
            }
        });

        branchName.setForeground(new java.awt.Color(102, 102, 102));
        branchName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout PCinfo2Layout = new javax.swing.GroupLayout(PCinfo2);
        PCinfo2.setLayout(PCinfo2Layout);
        PCinfo2Layout.setHorizontalGroup(
            PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCinfo2Layout.createSequentialGroup()
                        .addComponent(branchSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branchCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCinfo2Layout.createSequentialGroup()
                        .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel90)
                            .addComponent(jLabel18))
                        .addGap(15, 15, 15)
                        .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(branchLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(branchName)
                            .addComponent(branchAdd))))
                .addGap(70, 70, 70))
        );
        PCinfo2Layout.setVerticalGroup(
            PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(branchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(branchAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PCinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchCancel)
                    .addComponent(branchSave))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(0, 0, 102));
        jPanel25.setForeground(new java.awt.Color(0, 0, 51));

        jLabel91.setBackground(new java.awt.Color(0, 51, 255));
        jLabel91.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Add Branch");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel91)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel91)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addBranchLayout = new javax.swing.GroupLayout(addBranch);
        addBranch.setLayout(addBranchLayout);
        addBranchLayout.setHorizontalGroup(
            addBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCinfo2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(addBranchLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addBranchLayout.setVerticalGroup(
            addBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBranchLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PCinfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        branchcard.add(addBranch, "card2");

        editBranch.setBackground(new java.awt.Color(204, 204, 204));

        PCinfo3.setBackground(new java.awt.Color(204, 204, 204));
        PCinfo3.setPreferredSize(new java.awt.Dimension(486, 409));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(51, 51, 51));
        jLabel92.setText("Address:");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(51, 51, 51));
        jLabel94.setText("Branch Name:");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Location:");

        branchAddedit.setForeground(new java.awt.Color(102, 102, 102));
        branchAddedit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        branchLocedit.setForeground(new java.awt.Color(102, 102, 102));
        branchLocedit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        branchCancel1.setBackground(new java.awt.Color(255, 255, 255));
        branchCancel1.setForeground(new java.awt.Color(0, 0, 102));
        branchCancel1.setText("Cancel");
        branchCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchCancel1ActionPerformed(evt);
            }
        });

        branchSave1.setBackground(new java.awt.Color(255, 255, 255));
        branchSave1.setForeground(new java.awt.Color(0, 0, 102));
        branchSave1.setText("Save");
        branchSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchSave1ActionPerformed(evt);
            }
        });

        branchNameedit.setForeground(new java.awt.Color(102, 102, 102));
        branchNameedit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout PCinfo3Layout = new javax.swing.GroupLayout(PCinfo3);
        PCinfo3.setLayout(PCinfo3Layout);
        PCinfo3Layout.setHorizontalGroup(
            PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCinfo3Layout.createSequentialGroup()
                        .addComponent(branchSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branchCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCinfo3Layout.createSequentialGroup()
                        .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95)
                            .addComponent(jLabel92))
                        .addGap(15, 15, 15)
                        .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(branchLocedit, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(branchNameedit)
                            .addComponent(branchAddedit))))
                .addGap(70, 70, 70))
        );
        PCinfo3Layout.setVerticalGroup(
            PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(branchNameedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(branchAddedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchLocedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PCinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchCancel1)
                    .addComponent(branchSave1))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(0, 0, 102));
        jPanel27.setForeground(new java.awt.Color(0, 0, 51));

        jLabel96.setBackground(new java.awt.Color(0, 51, 255));
        jLabel96.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Edit Branch");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel96)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel96)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editBranchLayout = new javax.swing.GroupLayout(editBranch);
        editBranch.setLayout(editBranchLayout);
        editBranchLayout.setHorizontalGroup(
            editBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCinfo3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(editBranchLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editBranchLayout.setVerticalGroup(
            editBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBranchLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PCinfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        branchcard.add(editBranch, "card2");

        deptcard.setLayout(new java.awt.CardLayout());

        addDept.setBackground(new java.awt.Color(204, 204, 204));

        PCinfo1.setBackground(new java.awt.Color(204, 204, 204));
        PCinfo1.setPreferredSize(new java.awt.Dimension(486, 409));

        jLabel18b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18b.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18b.setText("Department Name:");

        deptName.setForeground(new java.awt.Color(102, 102, 102));
        deptName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        deptCancel.setBackground(new java.awt.Color(255, 255, 255));
        deptCancel.setForeground(new java.awt.Color(0, 0, 102));
        deptCancel.setText("Cancel");
        deptCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptCancelActionPerformed(evt);
            }
        });

        deptSave.setBackground(new java.awt.Color(255, 255, 255));
        deptSave.setForeground(new java.awt.Color(0, 0, 102));
        deptSave.setText("Save");
        deptSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptSaveActionPerformed(evt);
            }
        });

        jLabel66a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66a.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66a.setText("Branch:");

        javax.swing.GroupLayout PCinfo1Layout = new javax.swing.GroupLayout(PCinfo1);
        PCinfo1.setLayout(PCinfo1Layout);
        PCinfo1Layout.setHorizontalGroup(
            PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfo1Layout.createSequentialGroup()
                .addGroup(PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCinfo1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deptSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deptCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCinfo1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18b)
                            .addComponent(jLabel66a))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptName)
                            .addGroup(PCinfo1Layout.createSequentialGroup()
                                .addComponent(deptBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        PCinfo1Layout.setVerticalGroup(
            PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66a)
                    .addComponent(deptBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18b)
                    .addComponent(deptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(PCinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptSave)
                    .addComponent(deptCancel))
                .addGap(8, 8, 8))
        );

        adddd.setBackground(new java.awt.Color(0, 0, 102));
        adddd.setForeground(new java.awt.Color(0, 0, 51));

        jLabel87.setBackground(new java.awt.Color(0, 51, 255));
        jLabel87.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Add Department");

        javax.swing.GroupLayout addddLayout = new javax.swing.GroupLayout(adddd);
        adddd.setLayout(addddLayout);
        addddLayout.setHorizontalGroup(
            addddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addddLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel87)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addddLayout.setVerticalGroup(
            addddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addddLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel87)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addDeptLayout = new javax.swing.GroupLayout(addDept);
        addDept.setLayout(addDeptLayout);
        addDeptLayout.setHorizontalGroup(
            addDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCinfo1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addGroup(addDeptLayout.createSequentialGroup()
                .addComponent(adddd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addDeptLayout.setVerticalGroup(
            addDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDeptLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(adddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCinfo1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );

        deptcard.add(addDept, "card2");

        editDept.setBackground(new java.awt.Color(204, 204, 204));

        PCinfo5.setBackground(new java.awt.Color(204, 204, 204));
        PCinfo5.setPreferredSize(new java.awt.Dimension(486, 409));

        jLabel18b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18b1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18b1.setText("Department Name:");

        deptNameedit.setForeground(new java.awt.Color(102, 102, 102));
        deptNameedit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        deptCancel1.setBackground(new java.awt.Color(255, 255, 255));
        deptCancel1.setForeground(new java.awt.Color(0, 0, 102));
        deptCancel1.setText("Cancel");
        deptCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptCancel1ActionPerformed(evt);
            }
        });

        deptSave1.setBackground(new java.awt.Color(255, 255, 255));
        deptSave1.setForeground(new java.awt.Color(0, 0, 102));
        deptSave1.setText("Save");
        deptSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptSave1ActionPerformed(evt);
            }
        });

        jLabel66a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66a1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66a1.setText("Branch:");

        javax.swing.GroupLayout PCinfo5Layout = new javax.swing.GroupLayout(PCinfo5);
        PCinfo5.setLayout(PCinfo5Layout);
        PCinfo5Layout.setHorizontalGroup(
            PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCinfo5Layout.createSequentialGroup()
                .addGroup(PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCinfo5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deptSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deptCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCinfo5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18b1)
                            .addComponent(jLabel66a1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptNameedit)
                            .addGroup(PCinfo5Layout.createSequentialGroup()
                                .addComponent(deptBranchedit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        PCinfo5Layout.setVerticalGroup(
            PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCinfo5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66a1)
                    .addComponent(deptBranchedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18b1)
                    .addComponent(deptNameedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(PCinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptSave1)
                    .addComponent(deptCancel1))
                .addGap(8, 8, 8))
        );

        adddd1.setBackground(new java.awt.Color(0, 0, 102));
        adddd1.setForeground(new java.awt.Color(0, 0, 51));

        jLabel97.setBackground(new java.awt.Color(0, 51, 255));
        jLabel97.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Edit Department");

        javax.swing.GroupLayout adddd1Layout = new javax.swing.GroupLayout(adddd1);
        adddd1.setLayout(adddd1Layout);
        adddd1Layout.setHorizontalGroup(
            adddd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddd1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel97)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adddd1Layout.setVerticalGroup(
            adddd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddd1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel97)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editDeptLayout = new javax.swing.GroupLayout(editDept);
        editDept.setLayout(editDeptLayout);
        editDeptLayout.setHorizontalGroup(
            editDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCinfo5, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addGroup(editDeptLayout.createSequentialGroup()
                .addComponent(adddd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editDeptLayout.setVerticalGroup(
            editDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDeptLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(adddd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCinfo5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );

        deptcard.add(editDept, "card2");

        deptEditbtn.setBackground(new java.awt.Color(255, 255, 255));
        deptEditbtn.setText("Edit");
        deptEditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptEditbtnActionPerformed(evt);
            }
        });

        branchDeletebtn.setBackground(new java.awt.Color(255, 255, 255));
        branchDeletebtn.setText("Delete");
        branchDeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchDeletebtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(13, 13, 129));
        jLabel13.setText("Branches");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(13, 13, 129));
        jLabel98.setText("Departments");

        javax.swing.GroupLayout SysLayout = new javax.swing.GroupLayout(Sys);
        Sys.setLayout(SysLayout);
        SysLayout.setHorizontalGroup(
            SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SysLayout.createSequentialGroup()
                            .addComponent(brSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(branchAddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(branchEditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(branchDeletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(branchcard, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(SysLayout.createSequentialGroup()
                            .addComponent(dpSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deptAddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deptEditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deptDeletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane32)
                        .addComponent(deptcard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel98))
                .addGap(39, 39, 39))
        );
        SysLayout.setVerticalGroup(
            SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchAddbtn)
                    .addComponent(deptAddbtn)
                    .addComponent(branchEditbtn)
                    .addComponent(deptDeletebtn)
                    .addComponent(deptEditbtn)
                    .addComponent(branchDeletebtn)
                    .addComponent(dpSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(SysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(branchcard, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptcard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Maincard.add(Sys, "card8");

        Transfer.setBackground(new java.awt.Color(255, 255, 255));
        Transfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(13, 13, 129));
        jLabel12.setText("Transfer Device");

        jLabel1.setText("Device Type:");

        toTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        toTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toTblMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(toTbl);

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel83.setText("To:");

        transBR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL" }));
        transBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transBRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transBR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(transBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel6.setLayout(new java.awt.CardLayout());

        jPanel23.setLayout(new java.awt.CardLayout());

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Processor:");

        unitPro1.setEditable(false);
        unitPro1.setBackground(new java.awt.Color(231, 231, 231));
        unitPro1.setForeground(new java.awt.Color(102, 102, 102));
        unitPro1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Motherboard:");

        unitMot1.setEditable(false);
        unitMot1.setBackground(new java.awt.Color(231, 231, 231));
        unitMot1.setForeground(new java.awt.Color(102, 102, 102));
        unitMot1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Hard Drive:");

        unitHar1.setEditable(false);
        unitHar1.setBackground(new java.awt.Color(231, 231, 231));
        unitHar1.setForeground(new java.awt.Color(102, 102, 102));
        unitHar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Monitor:");

        unitMon1.setEditable(false);
        unitMon1.setBackground(new java.awt.Color(231, 231, 231));
        unitMon1.setForeground(new java.awt.Color(102, 102, 102));
        unitMon1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        unitUPS1.setEditable(false);
        unitUPS1.setBackground(new java.awt.Color(231, 231, 231));
        unitUPS1.setForeground(new java.awt.Color(102, 102, 102));
        unitUPS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("UPS:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("RAM:");

        unitRam1.setEditable(false);
        unitRam1.setBackground(new java.awt.Color(231, 231, 231));
        unitRam1.setForeground(new java.awt.Color(102, 102, 102));
        unitRam1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Keyboard:");

        unitKey1.setEditable(false);
        unitKey1.setBackground(new java.awt.Color(231, 231, 231));
        unitKey1.setForeground(new java.awt.Color(102, 102, 102));
        unitKey1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setText("Mouse:");

        unitMou1.setEditable(false);
        unitMou1.setBackground(new java.awt.Color(231, 231, 231));
        unitMou1.setForeground(new java.awt.Color(102, 102, 102));
        unitMou1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel54)
                                .addComponent(jLabel57)
                                .addComponent(jLabel58)
                                .addComponent(jLabel61)
                                .addComponent(jLabel63))
                            .addGap(24, 24, 24)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unitMou1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addComponent(unitKey1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addComponent(unitRam1)
                                .addComponent(unitUPS1)
                                .addComponent(unitMon1)
                                .addComponent(unitHar1)
                                .addComponent(unitPro1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addGap(7, 7, 7)
                            .addComponent(unitMot1))))
                .addGap(15, 15, 15))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(16, 16, 16)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel55))
                    .addComponent(unitMot1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(unitHar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(unitMon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(unitUPS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(unitRam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitKey1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(unitMou1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel23.add(jPanel22, "card2");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("Device:");

        unitPro2.setEditable(false);
        unitPro2.setBackground(new java.awt.Color(231, 231, 231));
        unitPro2.setForeground(new java.awt.Color(102, 102, 102));
        unitPro2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(24, 24, 24)
                .addComponent(unitPro2)
                .addGap(25, 25, 25))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jPanel23.add(jPanel24, "card3");

        transTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        transTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(transTbl);

        transferSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unit", "Processor", "Motherboard", "Harddrive", "Monitor", "UPS", "RAM", "Keyboard", "Mouse" }));
        transferSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferSelectActionPerformed(evt);
            }
        });

        jLabel8.setText("Select:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("From:");

        pcBR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL" }));
        pcBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcBRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UnitCardLayout = new javax.swing.GroupLayout(UnitCard);
        UnitCard.setLayout(UnitCardLayout);
        UnitCardLayout.setHorizontalGroup(
            UnitCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnitCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UnitCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UnitCardLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(62, 62, 62)
                        .addComponent(transferSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UnitCardLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pcBR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        UnitCardLayout.setVerticalGroup(
            UnitCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnitCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UnitCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transferSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(UnitCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UnitCardLayout.createSequentialGroup()
                        .addGroup(UnitCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(transSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.add(UnitCard, "card2");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 51));
        jLabel69.setText("Printer:");

        unitPro4.setEditable(false);
        unitPro4.setBackground(new java.awt.Color(231, 231, 231));
        unitPro4.setForeground(new java.awt.Color(102, 102, 102));
        unitPro4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        transTbl1.setModel(new javax.swing.table.DefaultTableModel(
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
        transTbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transTbl1MouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(transTbl1);

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel80.setText("From:");

        prBR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL" }));
        prBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prBRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrCardLayout = new javax.swing.GroupLayout(PrCard);
        PrCard.setLayout(PrCardLayout);
        PrCardLayout.setHorizontalGroup(
            PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrCardLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(690, 690, 690)
                        .addComponent(prBR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trSearchtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitPro4, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PrCardLayout.setVerticalGroup(
            PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrCardLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trSearchtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel69)
                        .addComponent(unitPro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel6.add(PrCard, "card3");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 51));
        jLabel84.setText("CCTV:");

        unitPro5.setEditable(false);
        unitPro5.setBackground(new java.awt.Color(231, 231, 231));
        unitPro5.setForeground(new java.awt.Color(102, 102, 102));
        unitPro5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        transTbl2.setModel(new javax.swing.table.DefaultTableModel(
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
        transTbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transTbl2MouseClicked(evt);
            }
        });
        jScrollPane31.setViewportView(transTbl2);

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel85.setText("From:");

        ccBR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL" }));
        ccBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccBRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CcCardLayout = new javax.swing.GroupLayout(CcCard);
        CcCard.setLayout(CcCardLayout);
        CcCardLayout.setHorizontalGroup(
            CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CcCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CcCardLayout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addGap(690, 690, 690)
                        .addComponent(ccBR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trSearchtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitPro5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CcCardLayout.setVerticalGroup(
            CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CcCardLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trSearchtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ccBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CcCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84)
                        .addComponent(unitPro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel6.add(CcCard, "card3");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Computer");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("CCTV");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Printer");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton14.setText("Transfer");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Cancel");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(51, 51, 51));
        jLabel108.setText("Branch:");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Department:");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(51, 51, 51));
        jLabel110.setText("Owner:");

        toBranch.setEditable(false);
        toBranch.setBackground(new java.awt.Color(231, 231, 231));

        toDept.setEditable(false);
        toDept.setBackground(new java.awt.Color(231, 231, 231));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(toOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(toDept, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(toBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(toBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(toDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(toOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout TransferLayout = new javax.swing.GroupLayout(Transfer);
        Transfer.setLayout(TransferLayout);
        TransferLayout.setHorizontalGroup(
            TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransferLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton6))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransferLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TransferLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        TransferLayout.setVerticalGroup(
            TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Maincard.add(Transfer, "card3");

        jPanel1.add(Maincard, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1, 1700, 982));
        Maincard.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        INV.setBackground(new java.awt.Color(0, 0, 51));
        INV.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        INV.setForeground(new java.awt.Color(255, 255, 255));
        INV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/whiteinv.png"))); // NOI18N
        INV.setText("INVENTORY");
        INV.setBorderPainted(false);
        INV.setOpaque(false);
        INV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVActionPerformed(evt);
            }
        });

        HIS.setBackground(new java.awt.Color(0, 0, 51));
        HIS.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        HIS.setForeground(new java.awt.Color(255, 255, 255));
        HIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dbhis.png"))); // NOI18N
        HIS.setText("HISTORY");
        HIS.setBorderPainted(false);
        HIS.setOpaque(false);
        HIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HISActionPerformed(evt);
            }
        });

        LOG.setBackground(new java.awt.Color(0, 0, 51));
        LOG.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        LOG.setForeground(new java.awt.Color(255, 255, 255));
        LOG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wlog.png"))); // NOI18N
        LOG.setText("LOGS");
        LOG.setBorderPainted(false);
        LOG.setOpaque(false);
        LOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGActionPerformed(evt);
            }
        });

        LOGOUT.setBackground(new java.awt.Color(0, 0, 51));
        LOGOUT.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wsign.png"))); // NOI18N
        LOGOUT.setText("SIGNOUT");
        LOGOUT.setBorderPainted(false);
        LOGOUT.setMaximumSize(new java.awt.Dimension(103, 61));
        LOGOUT.setMinimumSize(new java.awt.Dimension(103, 61));
        LOGOUT.setOpaque(false);
        LOGOUT.setPreferredSize(new java.awt.Dimension(103, 61));
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.jpg"))); // NOI18N

        HOM.setBackground(new java.awt.Color(0, 0, 51));
        HOM.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        HOM.setForeground(new java.awt.Color(255, 255, 255));
        HOM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/whome.png"))); // NOI18N
        HOM.setText("HOMEPAGE");
        HOM.setBorderPainted(false);
        HOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMActionPerformed(evt);
            }
        });

        System.setBackground(new java.awt.Color(0, 0, 51));
        System.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        System.setForeground(new java.awt.Color(255, 255, 255));
        System.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sys.png"))); // NOI18N
        System.setText("SYSTEM");
        System.setBorderPainted(false);
        System.setOpaque(false);
        System.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HOM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(LOG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(HIS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(INV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(System, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel19)
                .addGap(53, 53, 53)
                .addComponent(HOM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(INV, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HIS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LOG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(System, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        datefield.setFont(new java.awt.Font("Yu Gothic Medium", 0, 20)); // NOI18N
        datefield.setForeground(new java.awt.Color(255, 255, 51));
        datefield.setText("07/11/2019");
        jPanel1.add(datefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 940, -1, -1));

        timefield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        timefield.setForeground(new java.awt.Color(255, 255, 255));
        timefield.setText("23:23:00");
        jPanel1.add(timefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 900, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
   logoutLog();
   LoginOpen();
   
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void LOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGActionPerformed
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(true);
       HISmaincard.setVisible(false);
       Adding.setVisible(false);
       AddHistory.setVisible(false);
       Transfer.setVisible(false);
       Sys.setVisible(false);
       //Design
      LOG.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HIS.setBackground(new Color(0,0,51, 61));
     HOM.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
     //Functions
     showActLog();
     showUserLog();
     ALogcount();
     ULogcount();
    }//GEN-LAST:event_LOGActionPerformed

    private void HISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HISActionPerformed
       Filter.setVisible(false);
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(false);
       HISmaincard.setVisible(true);
       Adding.setVisible(false);
       AddHistory.setVisible(false);
       Transfer.setVisible(false);
       Sys.setVisible(false);
       //Design
     HIS.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HOM.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
     //Functions
     showHis();
     Hiscount();
    }//GEN-LAST:event_HISActionPerformed

    private void INVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVActionPerformed
     INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
      Sys.setVisible(false);
     PCcard.setVisible(true);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     //Design
     HOM.setBackground(new Color(0,0,51, 61));
     INV.setBackground(Color.ORANGE);
     HIS.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
     //Functions
     showPC();
     pcSet();
     PCcount();
    }//GEN-LAST:event_INVActionPerformed

    private void CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCActionPerformed
     PCcard.setVisible(false);
     CCcard.setVisible(true);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
     //Functions
     showCC();
     ccSet();
     CCcount();
    }//GEN-LAST:event_CCActionPerformed

    private void PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRActionPerformed
     PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(true);
     OTcard.setVisible(false);
     //Functions
     showPR();
     prSet();
     PRcount();
    }//GEN-LAST:event_PRActionPerformed

    private void HISfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HISfilterActionPerformed
      Filter.setVisible(true);
    }//GEN-LAST:event_HISfilterActionPerformed

    private void PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCActionPerformed
     PCcard.setVisible(true);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
     //Functions
     showPC();
     pcSet();
     PCcount();
    }//GEN-LAST:event_PCActionPerformed

    private void hisHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisHideActionPerformed
     Filter.setVisible(false);
     Filter.setVisible(false);
     hisSortCateg.setSelectedItem("ALL");
     hisSortSDate.setCalendar(null);
     hisSortEDate.setCalendar(null);
    }//GEN-LAST:event_hisHideActionPerformed

    private void compTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compTblMouseClicked
// TODO add your handling code here:
    }//GEN-LAST:event_compTblMouseClicked

    private void ccTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccTblMouseClicked
     ccSet();  
     CChiscount();  
    }//GEN-LAST:event_ccTblMouseClicked

    private void prTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prTblMouseClicked
     prSet();  
     PRhiscount();  
    }//GEN-LAST:event_prTblMouseClicked

    private void prSearchtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prSearchtxtMouseClicked
prSearchtxt.setText("");     
    }//GEN-LAST:event_prSearchtxtMouseClicked

    private void allHisTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allHisTblMouseClicked
hisSet();        // TODO add your handling code here:
    }//GEN-LAST:event_allHisTblMouseClicked

    private void ccHisUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccHisUpdateActionPerformed
 hisEditable();       
    }//GEN-LAST:event_ccHisUpdateActionPerformed

    private void prHisUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prHisUpdateActionPerformed
 hisEditable();          

    }//GEN-LAST:event_prHisUpdateActionPerformed

    private void HISsearchfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HISsearchfKeyReleased
    Hiscount();
    }//GEN-LAST:event_HISsearchfKeyReleased

    private void hisGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisGoActionPerformed
     hisFilter();
     Hiscount();
    }//GEN-LAST:event_hisGoActionPerformed

    private void ActLogSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActLogSearchKeyReleased
    ALogcount();
    }//GEN-LAST:event_ActLogSearchKeyReleased

    private void ActLogSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActLogSearchMouseClicked
      ActLogSearch.setText("");
    }//GEN-LAST:event_ActLogSearchMouseClicked

    private void UserLogSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserLogSearchKeyReleased
    ULogcount();
    }//GEN-LAST:event_UserLogSearchKeyReleased

    private void UserLogSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLogSearchMouseClicked
     UserLogSearch.setText("");
    }//GEN-LAST:event_UserLogSearchMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    ALogcount();
    alogSort();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ULogcount();
    ulogSort();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alogrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alogrefreshActionPerformed
    refreshALog();
    ALogcount();
    }//GEN-LAST:event_alogrefreshActionPerformed

    private void ulogrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulogrefreshActionPerformed
    refreshULog();
    ULogcount();
    }//GEN-LAST:event_ulogrefreshActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    refreshPC();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    refreshCC();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     refreshPR();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     refreshHIS();
     showHis();
     hisSet();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void compTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compTblMousePressed
 pcSet();  
 PChiscount();        // TODO add your handling code here:
    }//GEN-LAST:event_compTblMousePressed

    private void compTblKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compTblKeyTyped

    }//GEN-LAST:event_compTblKeyTyped

    private void HOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMActionPerformed
     INVmaincard.setVisible(false);
     Home.setVisible(true);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Done.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
      jRadioButton4.setEnabled(true);
     jRadioButton5.setEnabled(true);
     jRadioButton6.setEnabled(true);
     showHP();
     HOM.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HIS.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
    }//GEN-LAST:event_HOMActionPerformed

    private void repAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repAddActionPerformed
     AddRepair AR = new AddRepair();
     AR.setVisible(true);
    }//GEN-LAST:event_repAddActionPerformed

    private void PR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PR1ActionPerformed
      PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(true);
     showOT();
     showHisOT();
    OThiscount();
    }//GEN-LAST:event_PR1ActionPerformed

    private void otTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otTblMouseClicked
    showHisOT();
    OThiscount();
    }//GEN-LAST:event_otTblMouseClicked

    private void otTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otTblMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_otTblMousePressed

    private void otTblKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otTblKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_otTblKeyTyped

    private void otherRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherRefreshActionPerformed

    private void repSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repSearchActionPerformed

    private void reqAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqAddActionPerformed
     jCheckBox1.setVisible(true);
     pu = "Req";     
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
     Sys.setVisible(false);
     Transfer.setVisible(false);
     jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
     jRadioButton3.setEnabled(true);
     jRadioButton1.setSelected(true);
      showPurUnit();
       try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "TRUNCATE TABLE dbo.Cart";         
st.execute(sql);
sql1 = "TRUNCATE TABLE dbo.invTEMP";         
st.execute(sql1);
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
       showCart();
    }//GEN-LAST:event_reqAddActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    unitSelect.setSelectedIndex(0);
    unitSelect.setVisible(true);
    jLabel18a.setVisible(true);
    Unit.setVisible(true);
    Others.setVisible(false);
    CCTV.setVisible(false);
    Printer.setVisible(false);
    showPurUnit();
    unitDept.setVisible(true);
    jLabel8a.setVisible(true);
    jLabel8a1.setVisible(true);
    reqOwn.setVisible(true);
    jCheckBox1.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    jCheckBox1.setVisible(false);
    unitSelect.setVisible(false);
    jLabel18a.setVisible(false);
    Unit.setVisible(false);
    Others.setVisible(false);
    CCTV.setVisible(true);
    Printer.setVisible(false);
    showPurCC();
    unitDept.setVisible(false);
    jLabel8a.setVisible(false);
    jLabel8a1.setVisible(false);
    reqOwn.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    jCheckBox1.setVisible(true);
    unitSelect.setVisible(false);
    jLabel18a.setVisible(false);
    Unit.setVisible(false);
    Others.setVisible(false);
    CCTV.setVisible(false);
    Printer.setVisible(true);
    showPurPR();
    unitDept.setVisible(true);
    jLabel8a.setVisible(true);
    jLabel8a1.setVisible(true);
    reqOwn.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void unitSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitSelectActionPerformed
    String se = unitSelect.getSelectedItem().toString();
    pcSortpr();
    if(se.equals("Unit")){
    Unit.setVisible(true);
    Others.setVisible(false);
    CCTV.setVisible(false);
    Printer.setVisible(false);
  
    }
    else {Unit.setVisible(false);
    Others.setVisible(true);
    CCTV.setVisible(false);
     Printer.setVisible(false);
   }
    }//GEN-LAST:event_unitSelectActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     pu = "Req";  
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
     
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
     UnitCard.setVisible(true);
     transferSelect.setSelectedIndex(0);
     jPanel22.setVisible(true);
     jPanel24.setVisible(false);
     CcCard.setVisible(false);
     PrCard.setVisible(false);
     tr = "Ship";
     showPCtr();
     showdp();
     toOwner.setVisible(true);
     toDept.setVisible(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
    UnitCard.setVisible(false);
     jPanel22.setVisible(false);
     jPanel24.setVisible(false);
     CcCard.setVisible(true);
     PrCard.setVisible(false);
     tr = "Ship";
     showCCtr();
     toOwner.setVisible(false);
     toDept.setVisible(false);

   
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
     UnitCard.setVisible(false);
     jPanel22.setVisible(false);
     jPanel24.setVisible(false);
     CcCard.setVisible(false);
     PrCard.setVisible(true);
     tr = "Ship";
     showPRtr();
     showdp();
     toOwner.setVisible(true);
     toDept.setVisible(true);
     toOwner.setEditable(true);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void repDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repDoneActionPerformed
      Done.setVisible(true);
    }//GEN-LAST:event_repDoneActionPerformed

    private void pcTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcTransferActionPerformed
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
      Transfer.setVisible(false);
      Sys.setVisible(false);
     jRadioButton4.setSelected(true);
     Transfer.setVisible(true);
     UnitCard.setVisible(true);
     transferSelect.setSelectedIndex(0);
     jPanel22.setVisible(true);
     jPanel24.setVisible(false);
    CcCard.setVisible(false);
    PrCard.setVisible(false);
    jRadioButton4.setSelected(true);
    jRadioButton4.setEnabled(true);
    jRadioButton5.setEnabled(false);
    jRadioButton6.setEnabled(false);
    tr = "PCtransfer";
    }//GEN-LAST:event_pcTransferActionPerformed

    private void ccTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccTransferActionPerformed
     tr = "CCtransfer";
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
      Transfer.setVisible(false);
      Sys.setVisible(false);
     Adding.setVisible(false);
     UnitCard.setVisible(false);
     transferSelect.setSelectedIndex(0);
     CcCard.setVisible(true);
    PrCard.setVisible(false);
     AddHistory.setVisible(false);
     jRadioButton5.setSelected(true);
     Transfer.setVisible(true);
    jRadioButton4.setEnabled(false);
    jRadioButton5.setEnabled(true);
    jRadioButton6.setEnabled(false);
    }//GEN-LAST:event_ccTransferActionPerformed

    private void prTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prTransferActionPerformed
     tr = "PRtransfer";
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     UnitCard.setVisible(false);
     transferSelect.setSelectedIndex(0);
     CcCard.setVisible(false);
     PrCard.setVisible(true);
     jRadioButton6.setSelected(true);
     Transfer.setVisible(true);
     jRadioButton6.setSelected(true);
    jRadioButton4.setEnabled(false);
    jRadioButton5.setEnabled(false);
    jRadioButton6.setEnabled(true);
    }//GEN-LAST:event_prTransferActionPerformed

    private void SystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemActionPerformed
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(false);
       HISmaincard.setVisible(false);
       Adding.setVisible(false);
       AddHistory.setVisible(false);
       Transfer.setVisible(false);
       Sys.setVisible(true);
       branchcard.setVisible(false);
       deptcard.setVisible(false);
     System.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HIS.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     HOM.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
     showBra();
     showDep();
    }//GEN-LAST:event_SystemActionPerformed

    private void deptSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptSaveActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(false);
       dpAdd();
    }//GEN-LAST:event_deptSaveActionPerformed

    private void branchCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchCancelActionPerformed
    branchcard.setVisible(false);
    deptcard.setVisible(false);
    }//GEN-LAST:event_branchCancelActionPerformed

    private void branchSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchSaveActionPerformed
    branchcard.setVisible(false);
    deptcard.setVisible(false);
     brAdd();
    }//GEN-LAST:event_branchSaveActionPerformed

    private void branchCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchCancel1ActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(false);
    }//GEN-LAST:event_branchCancel1ActionPerformed

    private void branchSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchSave1ActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(false);
    }//GEN-LAST:event_branchSave1ActionPerformed

    private void deptSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptSave1ActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(false);
    }//GEN-LAST:event_deptSave1ActionPerformed

    private void branchAddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchAddbtnActionPerformed
       branchcard.setVisible(true);
       deptcard.setVisible(false);
       addBranch.setVisible(true);
       editBranch.setVisible(false);
    }//GEN-LAST:event_branchAddbtnActionPerformed

    private void branchDeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchDeletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchDeletebtnActionPerformed

    private void deptCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptCancelActionPerformed
        branchcard.setVisible(false);
       deptcard.setVisible(false);
    }//GEN-LAST:event_deptCancelActionPerformed

    private void deptCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptCancel1ActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(false);
    }//GEN-LAST:event_deptCancel1ActionPerformed

    private void deptAddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptAddbtnActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(true);
       addDept.setVisible(true);
       editDept.setVisible(false);
    }//GEN-LAST:event_deptAddbtnActionPerformed

    private void branchEditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchEditbtnActionPerformed
       branchcard.setVisible(true);
       deptcard.setVisible(false);
       addBranch.setVisible(false);
       editBranch.setVisible(true);
    }//GEN-LAST:event_branchEditbtnActionPerformed

    private void deptEditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptEditbtnActionPerformed
       branchcard.setVisible(false);
       deptcard.setVisible(true);
       addDept.setVisible(false);
       editDept.setVisible(true);
    }//GEN-LAST:event_deptEditbtnActionPerformed

    private void shipAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipAddActionPerformed
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     jRadioButton4.setSelected(true);
     Transfer.setVisible(true);
     UnitCard.setVisible(true);
     transferSelect.setSelectedIndex(0);
     jPanel22.setVisible(true);
     jPanel24.setVisible(false);
     CcCard.setVisible(false);
     PrCard.setVisible(false);
     tr = "Ship";
     showPCtr();
     showdp();
    }//GEN-LAST:event_shipAddActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    if(tr.equals("Ship")){
     INVmaincard.setVisible(false);
     Home.setVisible(true);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Done.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
    }
    else if (tr.equals("PCtransfer")){
      INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(true);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
    }
     else if (tr.equals("CCtransfer")){
      INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(false);
     CCcard.setVisible(true);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
    }
     else if (tr.equals("PRtransfer")){
      INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(true);
     OTcard.setVisible(false);
    }
    else if (tr.equals("ORtransfer")){
      INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(true);
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void pcPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcPurchaseActionPerformed
     pu = "pcPurchase";
     jRadioButton1.setSelected(true);
     jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(false);
     jRadioButton3.setEnabled(false);
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
     Sys.setVisible(false);
     Transfer.setVisible(false);
    }//GEN-LAST:event_pcPurchaseActionPerformed

    private void pcRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcRepairActionPerformed
     String DevID = compTbl.getValueAt(compTbl.getSelectedRow(), 7).toString();
      String Bra = compTbl.getValueAt(compTbl.getSelectedRow(), 0).toString();
      String Dep = compTbl.getValueAt(compTbl.getSelectedRow(), 1).toString();
      String Own = compTbl.getValueAt(compTbl.getSelectedRow(), 2).toString();
      DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
     Date date = new Date();
     DateFormat tm = new SimpleDateFormat("HH:mm:ss");
     Date time = new Date();
      try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', 'PC', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', 'PC','"+Dep+"-"+Own+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','Unit Malfunctioned')";
    st.execute(newsql1);
     String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Waiting for Action', 'PC','"+Dep+"-"+Own+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','Unit Malfunctioned')";
    st.execute(newsql4);
     String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+DevID+"', 'PC Unit', 'N/A', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
    String sql ="UPDATE dbo.invPC SET Stat = 'FOR REPAIR' WHERE ID = '"+DevID+"'";         
    st.executeUpdate(sql);
    String sql3 ="UPDATE dbo.Inv SET Status = 'FOR REPAIR' WHERE Dev_ID = '"+DevID+"'";         
    st.executeUpdate(sql3);
   
     JOptionPane.showMessageDialog(null,"Computer sent to Repair!");
     showPC();
    }
      catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
    }//GEN-LAST:event_pcRepairActionPerformed

    private void ccRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccRepairActionPerformed
      String DevID = ccTbl.getValueAt(ccTbl.getSelectedRow(), 8).toString();
      String Bra = ccTbl.getValueAt(ccTbl.getSelectedRow(), 0).toString();
      DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
     Date date = new Date();
     DateFormat tm = new SimpleDateFormat("HH:mm:ss");
     Date time = new Date();
      try{
    Statement sta = con.createStatement();             
    String sql2 = "SELECT HDD FROM dbo.invCC WHERE ID = '"+DevID+"'";         
    ResultSet rs=st.executeQuery(sql2); 
    rs = st.executeQuery(sql2);             
            if (rs.next()) { 
             it = rs.getString("HDD");   
            }
   
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', '"+Categ+"', '"+Bra+" HDD','"+dt.format(date)+"','"+tm.format(time)+"')";
    sta.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', '"+Categ+"','HDD','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', '0.00', 'HDD Malfunctioned' )";
     st.execute(newsql1);
     String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Waiting for Action', '"+Categ+"','HDD-"+it+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0.00', 'HDD Malfunctioned' )";
     st.execute(newsql4);
    String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2=st.executeQuery(sql4); 
    rs2 = st.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+DevID+"', 'HDD', '"+it+"', 'For Repair', '"+id+"' )";        
     st.executeUpdate(sql1);
     String sql ="UPDATE dbo.invCC SET HDD = 'IN REPAIR' WHERE ID = '"+DevID+"'";         
     st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"CCTV HDD sent to Repair!");
    showCC();
    }
      catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
                                        
    }//GEN-LAST:event_ccRepairActionPerformed

    private void ccPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccPurchaseActionPerformed
     pu = "ccPurchase";
     jRadioButton2.setSelected(true);
     jRadioButton2.setEnabled(true);
     jRadioButton1.setEnabled(false);
     jRadioButton3.setEnabled(false);
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
     Sys.setVisible(false);
     Transfer.setVisible(false);
    }//GEN-LAST:event_ccPurchaseActionPerformed

    private void prRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prRepairActionPerformed
      String DevID = prTbl.getValueAt(prTbl.getSelectedRow(), 4).toString();
      String Bra = prTbl.getValueAt(prTbl.getSelectedRow(), 0).toString();
      String Dep = prTbl.getValueAt(prTbl.getSelectedRow(), 1).toString();
      String Own = prTbl.getValueAt(prTbl.getSelectedRow(), 3).toString();
      DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
     Date date = new Date();
     DateFormat tm = new SimpleDateFormat("HH:mm:ss");
     Date time = new Date();
      try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', 'PR', '"+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', 'PR','"+Dep+"-"+Own+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','Printer Malfunctioned')";
    st.execute(newsql1);
     String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Waiting for Action', 'PR','"+Dep+"-"+Own+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','Printer Malfunctioned')";
    st.execute(newsql4);
     String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+DevID+"', 'Printer', 'N/A', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
    String sql ="UPDATE dbo.invPR SET Stat = 'FOR REPAIR' WHERE ID = '"+DevID+"'";         
    st.executeUpdate(sql);
    String sql3 ="UPDATE dbo.Inv SET Status = 'FOR REPAIR' WHERE Dev_ID = '"+DevID+"'";         
    st.executeUpdate(sql3);
   
     JOptionPane.showMessageDialog(null,"Printer sent to Repair!");
   showPR();
    }
      catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
    }//GEN-LAST:event_prRepairActionPerformed

    private void prPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prPurchaseActionPerformed
     pu = "prPurchase";
     jRadioButton3.setSelected(true);
     jRadioButton3.setEnabled(true);
     jRadioButton1.setEnabled(false);
     jRadioButton2.setEnabled(false);
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
     Sys.setVisible(false);
     Transfer.setVisible(false);
    }//GEN-LAST:event_prPurchaseActionPerformed

    private void reqCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqCancelActionPerformed
     if(pu.equals("pcPurchase")){
     INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
      Sys.setVisible(false);
     PCcard.setVisible(true);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
     }
     else if(pu.equals("ccPurchase")){
     INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(false);
     CCcard.setVisible(true);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
     }
     else if(pu.equals("prPurchase")){
     INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(true);
     OTcard.setVisible(false);
     }
     else if(pu.equals("Req")){
     INVmaincard.setVisible(false);
     Home.setVisible(true);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Done.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     }
     else if(pu.equals("otPurchase")){
   INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(true);
     }
     try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "TRUNCATE TABLE dbo.invTEMP";         
st.execute(sql);
sql1 = "TRUNCATE TABLE dbo.Cart";         
st.execute(sql1);
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
     
     
    }//GEN-LAST:event_reqCancelActionPerformed

    private void HisAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HisAddActionPerformed
       Filter.setVisible(false);
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(false);
       HISmaincard.setVisible(false);
       Adding.setVisible(false);
       AddHistory.setVisible(true);
       Transfer.setVisible(false);
       Sys.setVisible(false);
    }//GEN-LAST:event_HisAddActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Replace AR = new Replace();
        AR.setVisible(true);
        int selectedRowIndex = repTbl.getSelectedRow();
        String Dev = repTbl.getValueAt(selectedRowIndex,4).toString();
        String Categ = repTbl.getValueAt(selectedRowIndex,0).toString();
        int id = (int) repTbl.getValueAt(selectedRowIndex,5);
        int hisid = (int) repTbl.getValueAt(selectedRowIndex,6);
        if(Dev.equals("PC Unit")){AR.showUnit(id,hisid);}
        else if(Dev.equals("HDD")&&Categ.equals("CC")){AR.showCC(id,hisid);}
        else if(Dev.equals("Printer")){AR.showPR(id,hisid);}
        else{
        AR.showOT(Dev, id,hisid, Categ);}
    }//GEN-LAST:event_jButton13ActionPerformed

    private void pcSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcSortActionPerformed
pcSort();       
    }//GEN-LAST:event_pcSortActionPerformed

    private void ccSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccSortActionPerformed
ccSort();      
    }//GEN-LAST:event_ccSortActionPerformed

    private void prSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prSortActionPerformed
prSort();  
    }//GEN-LAST:event_prSortActionPerformed

    private void pcEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcEditActionPerformed
pcEditable();        // TODO add your handling code here:
    }//GEN-LAST:event_pcEditActionPerformed

    private void ccEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccEditActionPerformed
ccEditable();        // TODO add your handling code here:
    }//GEN-LAST:event_ccEditActionPerformed

    private void prEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prEditActionPerformed
prEditable();// TODO add your handling code here:
    }//GEN-LAST:event_prEditActionPerformed

    private void pcDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcDelActionPerformed
pcDel();        // TODO add your handling code here:
    }//GEN-LAST:event_pcDelActionPerformed

    private void ccDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccDelActionPerformed
ccDel();        // TODO add your handling code here:
    }//GEN-LAST:event_ccDelActionPerformed

    private void prDisposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prDisposeActionPerformed
prDel();
// TODO add your handling code here:
    }//GEN-LAST:event_prDisposeActionPerformed

    private void pcUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcUpdateActionPerformed
pcUpdate();
    }//GEN-LAST:event_pcUpdateActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
repRepaired();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   repDisposed();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void shipDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipDoneActionPerformed
    shipDel();
    }//GEN-LAST:event_shipDoneActionPerformed

    private void transTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transTblMouseClicked
      pcSettr();
    }//GEN-LAST:event_transTblMouseClicked

    private void transferSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferSelectActionPerformed
   String se = transferSelect.getSelectedItem().toString();
    if("Unit".equals(se)){
    UnitCard.setVisible(true);
     jPanel22.setVisible(true);
     jPanel24.setVisible(false);
    CcCard.setVisible(false);
    PrCard.setVisible(false);
    }
    else {
     UnitCard.setVisible(true);
     jPanel22.setVisible(false);
     jPanel24.setVisible(true);
    CcCard.setVisible(false);
    PrCard.setVisible(false);
    }
    transTbl.setRowSelectionInterval(0,0);
    pcSorttr();  
    refreshPCtr();
    }//GEN-LAST:event_transferSelectActionPerformed

    private void pcBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcBRActionPerformed
pcSorttr();  
refreshPCtr();
    }//GEN-LAST:event_pcBRActionPerformed

    private void transBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transBRActionPerformed
showdp();
    }//GEN-LAST:event_transBRActionPerformed

    private void transTbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transTbl2MouseClicked
ccSettr();
    }//GEN-LAST:event_transTbl2MouseClicked

    private void transTbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transTbl1MouseClicked
prSettr();  
    }//GEN-LAST:event_transTbl1MouseClicked

    private void ccBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccBRActionPerformed
    ccSorttr();   
    }//GEN-LAST:event_ccBRActionPerformed

    private void prBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prBRActionPerformed
prSorttr();  
    }//GEN-LAST:event_prBRActionPerformed

    private void unitTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitTblMouseClicked
pcSetpr(); 
    }//GEN-LAST:event_unitTblMouseClicked

    private void othersTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersTblMouseClicked
 otSetpr();
    }//GEN-LAST:event_othersTblMouseClicked

    private void reqBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBranchActionPerformed
showDepPur();   
    }//GEN-LAST:event_reqBranchActionPerformed

    private void cctvTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cctvTblMouseClicked
  ccSetpr(); 
    }//GEN-LAST:event_cctvTblMouseClicked

    private void printerTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerTblMouseClicked
  prSetpr(); 
    }//GEN-LAST:event_printerTblMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 if(jCheckBox1.isSelected()){
        reqOwn.setEditable(false);
        reqBranch.setSelectedItem("ADMIN");
        unitDept.setSelectedItem("IT");
        reqOwn.setText("IT RESERVE");
        reqBranch.setEnabled(false);
        unitDept.setEnabled(false);
 }
 else{
     reqOwn.setEditable(true);
     reqBranch.setEnabled(true);
     unitDept.setEnabled(true);
 }
 
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void toTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTblMouseClicked
      int selected = toTbl.getSelectedRow();
     if (jRadioButton4.isSelected()){ 
         if(transferSelect.getSelectedItem().toString().equals("Unit"))
            { toBranch.setText(toTbl.getValueAt(selected, 0).toString());
            toDept.setText(toTbl.getValueAt(selected, 1).toString());
            toOwner.setText("");
            toOwner.setEditable(true);}
        else 
            { toBranch.setText(toTbl.getValueAt(selected, 0).toString());
             toDept.setText(toTbl.getValueAt(selected, 1).toString());
             toOwner.setText(toTbl.getValueAt(selected, 2).toString());
             toOwner.setEditable(false);
     }}
     else
     {     toBranch.setText(toTbl.getValueAt(selected, 0).toString());
            toDept.setText(toTbl.getValueAt(selected, 1).toString());
            toOwner.setText("");
            toOwner.setEditable(true);}

    }//GEN-LAST:event_toTblMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
     if (jRadioButton4.isSelected()) {
     if(transferSelect.getSelectedItem().toString().equals("Unit")){transferPC();}
     else {transferPCUnit();}}
     else if(jRadioButton6.isSelected()){transferPR();}
     else if (jRadioButton5.isSelected()){transferCCUnit();}
     INVmaincard.setVisible(false);
     Home.setVisible(true);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Done.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     showRep();
     showShip();
     HOM.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HIS.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void reqDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqDoneActionPerformed
     purReceiv(); 
    }//GEN-LAST:event_reqDoneActionPerformed

    private void reqCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqCheckoutActionPerformed
        itemPurchase(); 
     INVmaincard.setVisible(false);
     Home.setVisible(true);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Done.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     showHP();
     HOM.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HIS.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
    }//GEN-LAST:event_reqCheckoutActionPerformed

    private void unitAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitAddActionPerformed
        cartAdd();  
    }//GEN-LAST:event_unitAddActionPerformed

    private void othersAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersAddActionPerformed
       cartAdd();   
    }//GEN-LAST:event_othersAddActionPerformed

    private void reqRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqRemoveActionPerformed
      cartDel();
    }//GEN-LAST:event_reqRemoveActionPerformed

    private void cctvAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cctvAddActionPerformed
       cartAdd(); 
    }//GEN-LAST:event_cctvAddActionPerformed

    private void printerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerAddActionPerformed
        cartAdd(); 
    }//GEN-LAST:event_printerAddActionPerformed

    private void prRepair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prRepair1ActionPerformed
      String DevID = otTbl.getValueAt(otTbl.getSelectedRow(), 7).toString();
      String Bra = otTbl.getValueAt(otTbl.getSelectedRow(), 0).toString();
      String Dep = otTbl.getValueAt(otTbl.getSelectedRow(), 1).toString();
      String Own = otTbl.getValueAt(otTbl.getSelectedRow(), 2).toString();
      String Dev = otTbl.getValueAt(otTbl.getSelectedRow(), 3).toString();
      String Nam = otTbl.getValueAt(otTbl.getSelectedRow(), 4).toString();
      DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
     Date date = new Date();
     DateFormat tm = new SimpleDateFormat("HH:mm:ss");
     Date time = new Date();
      try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Sent to Repair', 'OT', '"+Dev+"-"+Nam+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Malfunctioned', 'OT','"+Dev+"-"+Nam+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','"+Dev+" Malfunctioned')";
    st.execute(newsql1);
     String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Waiting for Action', 'OT','"+Dev+"-"+Nam+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','"+Nam+" Malfunctioned')";
    st.execute(newsql4);
     String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql4);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
     String sql1 ="INSERT INTO dbo.Rep (Dev_ID, Rep_Item, Rep_Name, Rep_Stat, Rep_ID) Values ('"+DevID+"', '"+Dev+"', '"+Nam+"', 'For Repair', '"+id+"' )";         
     st.executeUpdate(sql1);
    String sql ="UPDATE dbo.invOT SET Stat = 'FOR REPAIR' WHERE ID = '"+DevID+"'";         
    st.executeUpdate(sql);
    String sql3 ="UPDATE dbo.Inv SET Status = 'FOR REPAIR' WHERE Dev_ID = '"+DevID+"'";         
    st.executeUpdate(sql3);
   
     JOptionPane.showMessageDialog(null,""+Dev+" sent to Repair!");
    showOT();
    }
      catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
    }//GEN-LAST:event_prRepair1ActionPerformed

    private void prTransfer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prTransfer1ActionPerformed
      tr = "OTtransfer";
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     Transfer.setVisible(false);
     Sys.setVisible(false);
     UnitCard.setVisible(false);
     transferSelect.setSelectedIndex(0);
     CcCard.setVisible(false);
     PrCard.setVisible(true);
     jRadioButton6.setSelected(true);
     Transfer.setVisible(true);
     jRadioButton6.setSelected(true);
    jRadioButton4.setEnabled(false);
    jRadioButton5.setEnabled(false);
    jRadioButton6.setEnabled(true);
    }//GEN-LAST:event_prTransfer1ActionPerformed

    private void prPurchase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prPurchase1ActionPerformed
          pu = "otPurchase";
     jRadioButton1.setSelected(true);
     jRadioButton3.setEnabled(true);
     jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
     Sys.setVisible(false);
     Transfer.setVisible(false);
    }//GEN-LAST:event_prPurchase1ActionPerformed

    private void prDispose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prDispose1ActionPerformed
      otDel();
    }//GEN-LAST:event_prDispose1ActionPerformed

    private void hisSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisSaveActionPerformed
        hisAdd();
       Filter.setVisible(false);
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(false);
       HISmaincard.setVisible(true);
       Adding.setVisible(false);
       AddHistory.setVisible(false);
       Transfer.setVisible(false);
       Sys.setVisible(false);
       //Design
     HIS.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HOM.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
     //Functions
     showHis();
     Hiscount();
    }//GEN-LAST:event_hisSaveActionPerformed

    private void hisAddCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisAddCanActionPerformed
   Filter.setVisible(false);
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(false);
       HISmaincard.setVisible(true);
       Adding.setVisible(false);
       AddHistory.setVisible(false);
       Transfer.setVisible(false);
       Sys.setVisible(false);
       //Design
     HIS.setBackground(Color.ORANGE);
     INV.setBackground(new Color(0,0,51, 61));
     HOM.setBackground(new Color(0,0,51, 61));
     LOG.setBackground(new Color(0,0,51, 61));
     System.setBackground(new Color(0,0,51, 61));
     LOGOUT.setBackground(new Color(0,0,51, 61));
     //Functions
     showHis();
     Hiscount();   
    }//GEN-LAST:event_hisAddCanActionPerformed

    private void pcHisUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcHisUpdate2ActionPerformed
        hisUpdate();
        hisNonEditable();
    }//GEN-LAST:event_pcHisUpdate2ActionPerformed

    private void pcHisUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcHisUpdateActionPerformed
       hisEditable();   
    }//GEN-LAST:event_pcHisUpdateActionPerformed

    private void ccHisUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccHisUpdate2ActionPerformed
      hisUpdate();
      hisNonEditable();
    }//GEN-LAST:event_ccHisUpdate2ActionPerformed

    private void prHisUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prHisUpdate2ActionPerformed
      hisUpdate();
      hisNonEditable();
    }//GEN-LAST:event_prHisUpdate2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    try {
        printReport();
    } catch (JRException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       BasicConfigurator.configure();;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActLogSearch;
    private javax.swing.JPanel Add;
    private javax.swing.JPanel AddHistory;
    private javax.swing.JPanel Adding;
    private javax.swing.JButton CC;
    private javax.swing.JPanel CCTV;
    private javax.swing.JPanel CCcard;
    private javax.swing.JPanel CCinfo;
    private javax.swing.JTable Cart;
    private javax.swing.JPanel CcCard;
    private javax.swing.JPanel Done;
    private javax.swing.JPanel Filter;
    private javax.swing.JButton HIS;
    private javax.swing.JPanel HIScc;
    private javax.swing.JPanel HIScc1;
    private javax.swing.JPanel HISdetails;
    private javax.swing.JButton HISfilter;
    private javax.swing.JPanel HISmaincard;
    private javax.swing.JPanel HISpc;
    private javax.swing.JPanel HISpc1;
    private javax.swing.JPanel HISpr;
    private javax.swing.JPanel HISpr1;
    private javax.swing.JTextField HISsearchf;
    private javax.swing.JButton HOM;
    private javax.swing.JButton HisAdd;
    private javax.swing.JPanel Home;
    private javax.swing.JButton INV;
    private javax.swing.JPanel INVcard;
    private javax.swing.JPanel INVmaincard;
    private javax.swing.JButton LOG;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JPanel Log;
    private javax.swing.JPanel Maincard;
    private javax.swing.JPanel OTcard;
    private javax.swing.JPanel Others;
    private javax.swing.JButton PC;
    private javax.swing.JPanel PCcard;
    private javax.swing.JPanel PCinfo;
    private javax.swing.JPanel PCinfo1;
    private javax.swing.JPanel PCinfo2;
    private javax.swing.JPanel PCinfo3;
    private javax.swing.JPanel PCinfo4;
    private javax.swing.JPanel PCinfo5;
    private javax.swing.JScrollPane PCtable;
    private javax.swing.JButton PR;
    private javax.swing.JButton PR1;
    private javax.swing.JPanel PRcard;
    private javax.swing.JPanel PRinfo;
    private javax.swing.JPanel PrCard;
    private javax.swing.JPanel Printer;
    private javax.swing.JPanel Request;
    private javax.swing.JPanel Sys;
    private javax.swing.JButton System;
    private javax.swing.JPanel Transfer;
    private javax.swing.JPanel Unit;
    private javax.swing.JPanel UnitCard;
    private javax.swing.JTextField UserLogSearch;
    private javax.swing.JLabel actLogCnt;
    private javax.swing.JTable actlogTbl;
    private javax.swing.JPanel addBranch;
    private javax.swing.JPanel addDept;
    private javax.swing.JPanel adddd;
    private javax.swing.JPanel adddd1;
    private javax.swing.JTable allHisTbl;
    private javax.swing.JButton alogrefresh;
    private javax.swing.JTextField brSearchtxt;
    private javax.swing.JTable brTbl;
    private javax.swing.JTextField branchAdd;
    private javax.swing.JButton branchAddbtn;
    private javax.swing.JTextField branchAddedit;
    public static javax.swing.JButton branchCancel;
    public static javax.swing.JButton branchCancel1;
    private javax.swing.JButton branchDeletebtn;
    private javax.swing.JButton branchEditbtn;
    private javax.swing.JTextField branchLoc;
    private javax.swing.JTextField branchLocedit;
    private javax.swing.JTextField branchName;
    private javax.swing.JTextField branchNameedit;
    public static javax.swing.JButton branchSave;
    public static javax.swing.JButton branchSave1;
    private javax.swing.JPanel branchcard;
    private javax.swing.JComboBox<String> ccBR;
    private javax.swing.JTextField ccBran;
    private javax.swing.JTextField ccDVR;
    private javax.swing.JButton ccDel;
    public static javax.swing.JButton ccEdit;
    private javax.swing.JTextField ccHDD;
    private javax.swing.JTextField ccHisAct;
    private javax.swing.JTextField ccHisAct1;
    private javax.swing.JTextField ccHisBran;
    private javax.swing.JTextField ccHisBran1;
    private javax.swing.JTextField ccHisEDate;
    private com.toedter.calendar.JDateChooser ccHisEDate1;
    private javax.swing.JTextField ccHisEDate2;
    private javax.swing.JTextField ccHisETime;
    private javax.swing.JTextField ccHisETime1;
    private javax.swing.JTextField ccHisName;
    private javax.swing.JTextField ccHisName1;
    private javax.swing.JTextField ccHisPerf;
    private javax.swing.JTextField ccHisPerf1;
    private javax.swing.JTextField ccHisPric;
    private javax.swing.JTextField ccHisPric1;
    private javax.swing.JTextArea ccHisRem;
    private javax.swing.JTextArea ccHisRem1;
    private javax.swing.JTextField ccHisSDate;
    private com.toedter.calendar.JDateChooser ccHisSDate1;
    private javax.swing.JTextField ccHisSDate2;
    private javax.swing.JTextField ccHisSTime;
    private javax.swing.JTextField ccHisSTime1;
    private javax.swing.JButton ccHisUpdate;
    private javax.swing.JButton ccHisUpdate1;
    private javax.swing.JButton ccHisUpdate2;
    private javax.swing.JTextField ccNum;
    private javax.swing.JTextField ccPW;
    public static javax.swing.JButton ccPurchase;
    private javax.swing.JTextArea ccRem;
    public static javax.swing.JButton ccRepair;
    private javax.swing.JTextField ccSearchtxt;
    public static javax.swing.JComboBox ccSort;
    private javax.swing.JTextField ccSupp;
    private javax.swing.JTable ccTbl;
    public static javax.swing.JButton ccTransfer;
    private javax.swing.JTextField ccUN;
    public static javax.swing.JButton ccUpdate;
    private javax.swing.JButton cctvAdd;
    private javax.swing.JTextField cctvField;
    private javax.swing.JSpinner cctvQty;
    private javax.swing.JTextField cctvSearch;
    private javax.swing.JTable cctvTbl;
    private javax.swing.JTextField compBran;
    private javax.swing.JTextField compDept;
    private javax.swing.JTextField compHdd;
    private javax.swing.JTextField compKeyb;
    private javax.swing.JTextField compMboard;
    private javax.swing.JTextField compMoni;
    private javax.swing.JTextField compMou;
    private javax.swing.JTextField compName;
    private javax.swing.JTextField compProc;
    private javax.swing.JTextField compRam;
    private javax.swing.JTextArea compRem;
    private javax.swing.JTable compTbl;
    private javax.swing.JTextField compUps;
    private javax.swing.JLabel countCC;
    private javax.swing.JLabel countHis;
    private javax.swing.JLabel countHis2;
    private javax.swing.JLabel countHis3;
    private javax.swing.JLabel countHis4;
    private javax.swing.JLabel countHis5;
    private javax.swing.JLabel countPC;
    private javax.swing.JLabel countPR;
    private javax.swing.JLabel datefield;
    private javax.swing.JButton deptAddbtn;
    private javax.swing.JComboBox<String> deptBranch;
    private javax.swing.JComboBox<String> deptBranchedit;
    public static javax.swing.JButton deptCancel;
    public static javax.swing.JButton deptCancel1;
    private javax.swing.JButton deptDeletebtn;
    private javax.swing.JButton deptEditbtn;
    private javax.swing.JTextField deptName;
    private javax.swing.JTextField deptNameedit;
    public static javax.swing.JButton deptSave;
    public static javax.swing.JButton deptSave1;
    private javax.swing.JPanel deptcard;
    private javax.swing.JTextField dpSearchtxt;
    private javax.swing.JTable dpTbl;
    private javax.swing.JPanel editBranch;
    private javax.swing.JPanel editDept;
    private javax.swing.JTextField hisActAdd;
    public static javax.swing.JButton hisAddCan;
    private com.toedter.calendar.JDateChooser hisEDateAdd;
    private javax.swing.JTextField hisETimeAdd;
    private javax.swing.JButton hisGo;
    private javax.swing.JButton hisHide;
    private javax.swing.JTextField hisPerfAdd;
    private javax.swing.JTextField hisPricAdd;
    private javax.swing.JTextArea hisRemAdd;
    private com.toedter.calendar.JDateChooser hisSDateAdd;
    private javax.swing.JTextField hisSTimeAdd;
    public static javax.swing.JButton hisSave;
    private javax.swing.JComboBox<String> hisSortCateg;
    private com.toedter.calendar.JDateChooser hisSortEDate;
    private com.toedter.calendar.JDateChooser hisSortSDate;
    private javax.swing.JTable hisTbl;
    private javax.swing.JTable hisTbl2;
    private javax.swing.JTable hisTbl3;
    private javax.swing.JTable hisTbl4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel16a;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel18a;
    private javax.swing.JLabel jLabel18b;
    private javax.swing.JLabel jLabel18b1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1a;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel54a;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel55a;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel66a;
    private javax.swing.JLabel jLabel66a1;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel8a;
    private javax.swing.JLabel jLabel8a1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable otTbl;
    private javax.swing.JButton otherRefresh;
    private javax.swing.JTextField otherSearchtxt;
    public static javax.swing.JComboBox otherSort;
    private javax.swing.JScrollPane otherTbl;
    private javax.swing.JButton othersAdd;
    private javax.swing.JTextField othersField;
    private javax.swing.JSpinner othersQty;
    private javax.swing.JTextField othersSearch;
    private javax.swing.JTable othersTbl;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox<String> pcBR;
    private javax.swing.JButton pcDel;
    public static javax.swing.JButton pcEdit;
    private javax.swing.JTextField pcHisAct;
    private javax.swing.JTextField pcHisAct1;
    private javax.swing.JTextField pcHisBran;
    private javax.swing.JTextField pcHisBran1;
    private javax.swing.JTextField pcHisEDate;
    private com.toedter.calendar.JDateChooser pcHisEDate1;
    private javax.swing.JTextField pcHisEDate2;
    private javax.swing.JTextField pcHisETime;
    private javax.swing.JTextField pcHisETime1;
    private javax.swing.JTextField pcHisName;
    private javax.swing.JTextField pcHisName1;
    private javax.swing.JTextField pcHisPerf;
    private javax.swing.JTextField pcHisPerf1;
    private javax.swing.JTextField pcHisPric;
    private javax.swing.JTextField pcHisPric1;
    private javax.swing.JTextArea pcHisRem;
    private javax.swing.JTextArea pcHisRem1;
    private javax.swing.JTextField pcHisSDate;
    private com.toedter.calendar.JDateChooser pcHisSDate1;
    private javax.swing.JTextField pcHisSDate2;
    private javax.swing.JTextField pcHisSTime;
    private javax.swing.JTextField pcHisSTime1;
    private javax.swing.JButton pcHisUpdate;
    private javax.swing.JButton pcHisUpdate1;
    private javax.swing.JButton pcHisUpdate2;
    public static javax.swing.JButton pcPurchase;
    public static javax.swing.JButton pcRepair;
    private javax.swing.JTextField pcSearchtxt;
    public static javax.swing.JComboBox pcSort;
    public static javax.swing.JButton pcTransfer;
    public static javax.swing.JButton pcUpdate;
    private javax.swing.JComboBox<String> prBR;
    private javax.swing.JTextField prBran;
    private javax.swing.JTextField prDept;
    private javax.swing.JButton prDispose;
    private javax.swing.JButton prDispose1;
    public static javax.swing.JButton prEdit;
    private javax.swing.JTextField prHisAct;
    private javax.swing.JTextField prHisAct1;
    private javax.swing.JTextField prHisBran;
    private javax.swing.JTextField prHisBran1;
    private javax.swing.JTextField prHisEDate;
    private com.toedter.calendar.JDateChooser prHisEDate1;
    private javax.swing.JTextField prHisEDate2;
    private javax.swing.JTextField prHisETime;
    private javax.swing.JTextField prHisETime1;
    private javax.swing.JTextField prHisName;
    private javax.swing.JTextField prHisName1;
    private javax.swing.JTextField prHisPerf;
    private javax.swing.JTextField prHisPerf1;
    private javax.swing.JTextField prHisPric;
    private javax.swing.JTextField prHisPric1;
    private javax.swing.JTextArea prHisRem;
    private javax.swing.JTextArea prHisRem1;
    private javax.swing.JTextField prHisSDate;
    private com.toedter.calendar.JDateChooser prHisSDate1;
    private javax.swing.JTextField prHisSDate2;
    private javax.swing.JTextField prHisSTime;
    private javax.swing.JTextField prHisSTime1;
    private javax.swing.JButton prHisUpdate;
    private javax.swing.JButton prHisUpdate1;
    private javax.swing.JButton prHisUpdate2;
    private javax.swing.JTextField prManu;
    private javax.swing.JTextField prName;
    private javax.swing.JButton prPurchase;
    private javax.swing.JButton prPurchase1;
    private javax.swing.JTextArea prRem;
    public static javax.swing.JButton prRepair;
    public static javax.swing.JButton prRepair1;
    private javax.swing.JTextField prSearchtxt;
    public static javax.swing.JComboBox prSort;
    private javax.swing.JTable prTbl;
    public static javax.swing.JButton prTransfer;
    public static javax.swing.JButton prTransfer1;
    public static javax.swing.JButton prUpdate;
    private javax.swing.JButton printerAdd;
    private javax.swing.JTextField printerField;
    private javax.swing.JSpinner printerQty;
    private javax.swing.JTextField printerSearch;
    private javax.swing.JTable printerTbl;
    private javax.swing.JButton repAdd;
    private javax.swing.JButton repDone;
    private javax.swing.JTextField repSearch;
    private javax.swing.JTable repTbl;
    private javax.swing.JButton reqAdd;
    private javax.swing.JComboBox<String> reqBranch;
    private javax.swing.JButton reqCancel;
    private javax.swing.JButton reqCheckout;
    private javax.swing.JButton reqDone;
    private javax.swing.JTextField reqOwn;
    private javax.swing.JButton reqRemove;
    private javax.swing.JTextField reqSearch;
    private javax.swing.JTable reqTbl;
    private javax.swing.JButton shipAdd;
    private javax.swing.JButton shipDone;
    private javax.swing.JTextField shipSearch;
    private javax.swing.JTable shipTbl;
    private javax.swing.JLabel timefield;
    private javax.swing.JTextField toBranch;
    private javax.swing.JTextField toDept;
    private javax.swing.JTextField toOwner;
    private javax.swing.JTextField toSearchtxt;
    private javax.swing.JTable toTbl;
    private javax.swing.JTextField trSearchtxt1;
    private javax.swing.JTextField trSearchtxt2;
    private javax.swing.JComboBox<String> transBR;
    private javax.swing.JTextField transSearchtxt;
    private javax.swing.JTable transTbl;
    private javax.swing.JTable transTbl1;
    private javax.swing.JTable transTbl2;
    private javax.swing.JComboBox<String> transferSelect;
    private javax.swing.JLabel uLogCnt;
    private javax.swing.JButton ulogrefresh;
    private javax.swing.JTextField una;
    private javax.swing.JButton unitAdd;
    private javax.swing.JComboBox<String> unitDept;
    private javax.swing.JTextField unitHar;
    private javax.swing.JTextField unitHar1;
    private javax.swing.JTextField unitKey;
    private javax.swing.JTextField unitKey1;
    private javax.swing.JTextField unitKey2;
    private javax.swing.JTextField unitMon;
    private javax.swing.JTextField unitMon1;
    private javax.swing.JTextField unitMot;
    private javax.swing.JTextField unitMot1;
    private javax.swing.JTextField unitMou;
    private javax.swing.JTextField unitMou1;
    private javax.swing.JTextField unitPro;
    private javax.swing.JTextField unitPro1;
    private javax.swing.JTextField unitPro2;
    private javax.swing.JTextField unitPro4;
    private javax.swing.JTextField unitPro5;
    private javax.swing.JSpinner unitQty;
    private javax.swing.JTextField unitRam;
    private javax.swing.JTextField unitRam1;
    private javax.swing.JTextField unitSearch;
    private javax.swing.JComboBox<String> unitSelect;
    private javax.swing.JTable unitTbl;
    private javax.swing.JTextField unitUPS;
    private javax.swing.JTextField unitUPS1;
    private javax.swing.JTable userlogTbl;
    // End of variables declaration//GEN-END:variables
    public String sql,sql1; 
    public String utype,Parts1;
//FUNCTIONS-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void addArchives(String Categ,String ID, String Nam){
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="INSERT INTO dbo.Archives (Categ, Dev_ID,Dev_Name, Date, Time) VALUES ('"+Categ+"','"+ID+"', '"+Nam+"','"+dt.format(date)+"','"+tm.format(time)+"')";         
st.execute(sql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
//refreshPC();
}
public void FilterPC( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 pcSet();
                 PCcount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 pcSet();
                 PCcount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 pcSet();
                 PCcount();
                 setJTableColumnsWidth(jTable, 480, 1, 1, 1, 80, 80, 1, 1,1);
                 Homepage.setCellsAlignment(compTbl, SwingConstants.CENTER);
}
public void FilterCC( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 ccSet();
                 CCcount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 ccSet();
                 CCcount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 ccSet();
                 CCcount();
                 setJTableColumnsWidth(ccTbl, 480, 2, 30, 2, 10, 10, 8, 10, 10, 2);
                 Homepage.setCellsAlignment1(ccTbl, SwingConstants.CENTER);
}
public void FilterPR( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 prSet();
                 PRcount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 prSet();
                 PRcount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 prSet();
                 PRcount();
                 setJTableColumnsWidth(prTbl, 480, 10, 20, 25, 40, 5);
                 Homepage.setCellsAlignment1(prTbl, SwingConstants.CENTER);
}
public void FilterOT( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 prSet();
                 PRcount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 prSet();
                 PRcount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 setJTableColumnsWidth(otTbl, 480, 5, 10, 15, 10, 50,5,10, 5);
                 Homepage.setCellsAlignment1(otTbl, SwingConstants.CENTER);
}
public void FilterHIS( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 hisSet();
                 Hiscount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 hisSet();
                 Hiscount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 hisSet();
                 Hiscount();
                 Homepage.setCellsAlignment(allHisTbl, SwingConstants.CENTER);
}
public void FilterAL( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 ALogcount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 ALogcount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 ALogcount();
                 setJTableColumnsWidth(actlogTbl, 480, 10, 20, 25, 40, 5);
                 Homepage.setCellsAlignment1(actlogTbl, SwingConstants.CENTER);
}
public void FilterUL( final JTable jTable,  final JTextField jtfFilter) {
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
                 jTable.setRowSelectionInterval(0,0);
                 ULogcount();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfFilter.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
                 jTable.setRowSelectionInterval(0,0);
                 ULogcount();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    });
                 jTable.setRowSelectionInterval(0,0);
                 ULogcount();
                 setJTableColumnsWidth(userlogTbl, 480, 10, 20, 25, 40, 5);
                 Homepage.setCellsAlignment1(userlogTbl, SwingConstants.CENTER);
}


//DISPOSAL
public void DisposePC(){
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = "PC";
String Bra = compTbl.getValueAt(selectedRowIndex,0).toString();
String Dep = compTbl.getValueAt(selectedRowIndex,1).toString();
String Own = compTbl.getValueAt(selectedRowIndex,2).toString();
String ID = compTbl.getValueAt(selectedRowIndex,7).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
Statement sta = con.createStatement();
String sql ="UPDATE dbo.invPC SET Stat = 'DISPOSED' WHERE ID = '"+ID+"'";         
st.executeUpdate(sql);
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Disposed', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"',"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
String newsql4 = "INSERT INTO dbo.Archives (Categ,Dev_ID,Dev_Name,Date,Time) VALUES ('"+Categ+"','"+ID+"','PC Unit - "+Bra+"-"+Dep+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
 st.execute(newsql4);
  String newsql12 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Disposed', 'PC','PC Unit from "+Dep+" - "+Own+"','IT DEPARTMENT','"+ID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
            sta.execute(newsql12);
JOptionPane.showMessageDialog(null,"Computer Successfully Disposed!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
public void DisposeCC(){
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = "CC";
String Bra = cctvTbl.getValueAt(selectedRowIndex,0).toString();
String SP = cctvTbl.getValueAt(selectedRowIndex,1).toString();
String ID = cctvTbl.getValueAt(selectedRowIndex,8).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
Statement sta = con.createStatement();
String sql ="UPDATE dbo.invCC SET Stat = 'DISPOSED' WHERE ID = '"+ID+"'";         
st.executeUpdate(sql);
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Disposed', '"+Categ+"', '"+Bra+"-"+SP+"',"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
String newsql4 = "INSERT INTO dbo.Archives (Categ,Dev_ID,Dev_Name,Date,Time) VALUES ('"+Categ+"','"+ID+"','CCTV Unit - "+Bra+"-"+SP+"','"+dt.format(date)+"','"+tm.format(time)+"')";
 st.execute(newsql4);
 String newsql12 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Disposed', 'CC','CCTV Unit','IT DEPARTMENT','"+ID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
            sta.execute(newsql12);
JOptionPane.showMessageDialog(null,"CCTV Successfully Disposed!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
public void DisposePR(){
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = "PR";
String Bra = prTbl.getValueAt(selectedRowIndex,0).toString();
String Dep = prTbl.getValueAt(selectedRowIndex,1).toString();
String SP = prTbl.getValueAt(selectedRowIndex,2).toString();
String Own= prTbl.getValueAt(selectedRowIndex,3).toString();
String ID = prTbl.getValueAt(selectedRowIndex,4).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
Statement sta = con.createStatement();
String sql ="UPDATE dbo.invPR SET Stat = 'DISPOSED' WHERE ID = '"+ID+"'";         
st.executeUpdate(sql);
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Disposed', '"+Categ+"', '"+Bra+"-"+Dep+"-"+SP+"-"+Own+"',"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
String newsql4 = "INSERT INTO dbo.Archives (Categ,Dev_ID,Dev_Name,Date,Time) VALUES ('"+Categ+"','"+ID+"','Printer Unit - "+Bra+"-"+Dep+"-"+SP+"-"+Own+"','"+dt.format(date)+"','"+tm.format(time)+"')";
 st.execute(newsql4);
  String newsql12 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Disposed', 'PR','Printer "+Dep+" - "+Own+"','IT DEPARTMENT','"+ID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
 sta.execute(newsql12);
JOptionPane.showMessageDialog(null,"Printer Successfully Disposed!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}

//FOR PC-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//INVENTORY----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showPC(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk, ID FROM dbo.invPC WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
compTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 //compTbl.setRowSelectionInterval(0,0);
 //setJTableColumnsWidth(compTbl, 480, 1, 1, 1, 80, 80, 1, 1,1);
// Homepage.setCellsAlignment(compTbl, SwingConstants.CENTER);
 
 FilterPC(compTbl,pcSearchtxt);
}    
public void pcSet(){
        int selectedRowIndex = compTbl.getSelectedRow();
        compBran.setText(compTbl.getValueAt(selectedRowIndex,0).toString());
        compDept.setText(compTbl.getValueAt(selectedRowIndex,1).toString());
        compName.setText(compTbl.getValueAt(selectedRowIndex,2).toString());
        compProc.setText(compTbl.getValueAt(selectedRowIndex,3).toString());
        compMboard.setText(compTbl.getValueAt(selectedRowIndex,4).toString());
        compRam.setText(compTbl.getValueAt(selectedRowIndex,5).toString());
        compHdd.setText(compTbl.getValueAt(selectedRowIndex,6).toString());
        showHisPC();
        PChiscount();
        setPCRem();
}  
public void setPCRem(){
        int selectedRowIndex = compTbl.getSelectedRow();
        String ID = compTbl.getValueAt(selectedRowIndex,7).toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT UPS, Rem, KeyB, Mouse,Moni FROM dbo.invPC WHERE ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql); 
if(rs.next()){
String UPS = rs.getString("UPS");
String Rem = rs.getString("Rem");
String Keyb = rs.getString("KeyB");
String MOUSE = rs.getString("Mouse");
String Monitor = rs.getString("Moni");

compUps.setText(UPS);
compRem.setText(Rem);
compKeyb.setText(Keyb);
compMou.setText(MOUSE);
compMoni.setText(Monitor);
      }
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void PCcount(){
int rowCount = compTbl.getRowCount();
countPC.setText(String.valueOf(rowCount));
}
public void pcSort(){
String Branch = pcSort.getSelectedItem().toString();    
if(Branch.equals("ALL")){
showPC();
}
else
{
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor,MBoard as Motherboard, Ram as Memory,HDD as HardDisk, ID  FROM dbo.invPC WHERE Branch = '"+Branch+"' AND Stat = 'WORKING' ORDER BY Branch ";         
rs=st.executeQuery(sql); 
compTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();

      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPC(compTbl,pcSearchtxt);
}
//compTbl.setRowSelectionInterval(0,0);
}    
public void showHisPC(){;
        int selectedRowIndex = compTbl.getSelectedRow();
        String ID = compTbl.getValueAt(selectedRowIndex,7).toString();
        //format([SalesDate], 'yyyy-MM-dd')
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,SDate as StartDate,EDate as EndDate,Price,HIS_ID as HistoryID, ITEM_ID as ID FROM dbo.History WHERE Categ = 'PC' AND ITEM_ID = '"+ID+"'";         
rs=st.executeQuery(sql); 
hisTbl.setModel(DbUtils.resultSetToTableModel(rs));
   }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void PChiscount(){
int rowCount = hisTbl.getRowCount();
countHis.setText(String.valueOf(rowCount));
}
public void pcUpdate(){ 
int selectedRowIndex = compTbl.getSelectedRow();
String ID = compTbl.getValueAt(selectedRowIndex,7).toString();
String s1 = compBran.getText();
String s2 = compDept.getText();
String s3 = compName.getText();
String s4 = compProc.getText();
String s5 = compRam.getText();
String s6 = compHdd.getText();
String s7 = compUps.getText();
String s8 = compKeyb.getText();
String s9 = compMou.getText();
String s10 = compRem.getText();
String s11 = compMboard.getText();
String s12 = compMoni.getText();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
String sql ="UPDATE dbo.invPC SET Branch = '"+s1+"',Dept = '"+s2+"',Owner = '"+s3+"',Proce = '"+s4+"',MBoard = '"+s11+"', Ram = '"+s5+"',HDD = '"+s6+"',UPS = '"+s7+"',KeyB = '"+s8+"',Mouse = '"+s9+"',Moni = '"+s12+"' ,Rem = '"+s10+"' WHERE ID = '"+ID+"'";         
st.executeUpdate(sql);

String sql1 ="UPDATE dbo.Inv SET Branch = '"+s1+"',Dept = '"+s2+"',Owner = '"+s3+"' WHERE ID = '"+ID+"'";         
st.executeUpdate(sql1);
JOptionPane.showMessageDialog(null,"Information Updated!"); 

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'PC','"+s1+"-"+s2+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
//refreshPC();
}
public void pcEditable(){
compBran.setEditable(true);
compMboard.setEditable(true);
compDept.setEditable(true);
compName.setEditable(true);
compProc.setEditable(true);
compRam.setEditable(true);
compHdd.setEditable(true);
compRem.setEditable(true);
compUps.setEditable(true);
compKeyb.setEditable(true);
compMou.setEditable(true);  
pcUpdate.setVisible(true);
pcEdit.setVisible(false);
}
public void pcNonEditable(){
compBran.setEditable(false);
compMboard.setEditable(false);
compDept.setEditable(false);
compName.setEditable(false);
compProc.setEditable(false);
compRam.setEditable(false);
compHdd.setEditable(false);
compRem.setEditable(false);
compUps.setEditable(false); 
compKeyb.setEditable(false);
compMou.setEditable(false);  
pcUpdate.setVisible(false);
pcEdit.setVisible(true);
}
public void pcDel(){
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
String s1 = compBran.getText();
String s2 = compDept.getText();
String s3 = compName.getText();
String s4 = compProc.getText();
String s5 = compRam.getText();
String s6 = compHdd.getText();
String s7 = compUps.getText();
String s8 = compKeyb.getText();
String s9 = compMou.getText();
String s10 = compRem.getText();
String s11 = compMboard.getText();
String s12 = compMoni.getText();
        int selectedRowIndex = compTbl.getSelectedRow();
        String ID = compTbl.getValueAt(selectedRowIndex,7).toString();
        Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invPC SET Stat = 'DISPOSED' WHERE ID = '"+ID+"'"; 
st.execute(sql);
 String sql1 ="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+ID+"'"; 
st.execute(sql1);

Statement sta = con.createStatement();
            String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+s1+"','Disposed', 'PC','"+s2+"-"+s3+"','IT DEPARTMENT','"+ID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
            sta.execute(newsql1);

            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Disposed', 'PC','"+s1+"-"+s2+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Device Disposed!"); 
addArchives("PC",ID, s1+"-"+s2+"-"+s3);
showPC();
}
    if(n == JOptionPane.NO_OPTION){ 
/*
jDateChooser1.setCalendar(null);
jTextField13.setText("");
*/
    }
    if(n == JOptionPane.CLOSED_OPTION){
/*
jDateChooser1.setCalendar(null);
jTextField3.setText("");
*/
    }
}
public void pcTransfer(String sb){  
                int selectedRowIndex = compTbl.getSelectedRow();
                String ID = compTbl.getValueAt(selectedRowIndex,7).toString();
                String s2 = compDept.getText();
                String s3 = compName.getText();
                String s4 = compProc.getText();
                String s5 = compRam.getText();
                String s6 = compHdd.getText();
                String s7 = compUps.getText();
                String s8 = compRem.getText();
                try{
                    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");
                    DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = new Date();
                    DateFormat tm = new SimpleDateFormat("HH:mm:ss");
                    Date time = new Date();
                    Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    String sql ="UPDATE dbo.invPC SET BRANCH = '"+sb+"' WHERE ID = '"+ID+"'";
                    st.executeUpdate(sql);
                    
                    Statement sta = con.createStatement();
                    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transfered', 'Computer','"+sb+"-"+s2+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')"; 
                    sta.execute(newsql);
                    JOptionPane.showMessageDialog(null,"Device transfered!");
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage());
                    JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());
                }              
                //refreshPC();
                //showPC();


}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//PC HISTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void pcHisEditable(){
pcHisBran.setEditable(true);
pcHisName.setEditable(true);
pcHisAct.setEditable(true);
pcHisSDate.setEnabled(true);
pcHisEDate.setEnabled(true);
pcHisSTime.setEditable(true);
pcHisETime.setEditable(true);
pcHisPric.setEditable(true);
pcHisRem.setEditable(true); 
}
public void pcHisNonEditable(){
pcHisBran.setEditable(false);
pcHisName.setEditable(false);
pcHisAct.setEditable(false);
pcHisSDate.setEnabled(false);
pcHisEDate.setEnabled(false);
pcHisSTime.setEditable(false);
pcHisETime.setEditable(false);
pcHisPric.setEditable(false);
pcHisRem.setEditable(false); 
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//END OF ALL PC------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//FOR CC------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//INVENTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showCC(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password, ID FROM dbo.invCC WHERE Stat != 'DISPOSED' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
ccTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterCC(ccTbl,ccSearchtxt);
}
public void ccSet(){
        int selectedRowIndex = ccTbl.getSelectedRow();
        ccBran.setText(ccTbl.getValueAt(selectedRowIndex,0).toString());
        ccSupp.setText(ccTbl.getValueAt(selectedRowIndex,1).toString());
        ccNum.setText(ccTbl.getValueAt(selectedRowIndex,2).toString());
        ccDVR.setText(ccTbl.getValueAt(selectedRowIndex,4).toString());
        ccHDD.setText(ccTbl.getValueAt(selectedRowIndex,5).toString());
        ccUN.setText(ccTbl.getValueAt(selectedRowIndex,6).toString());
        ccPW.setText(ccTbl.getValueAt(selectedRowIndex,7).toString());
        showHisCC();
        CChiscount();
        setCCRem();
}
public void setCCRem(){
        int selectedRowIndex = ccTbl.getSelectedRow();
        String ID = ccTbl.getValueAt(selectedRowIndex,8).toString();
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Rem FROM dbo.invCC WHERE ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql); 
if(rs.next()){
String Rem = rs.getString("Rem");
ccRem.setText(Rem);
      }
   }
      
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void CCcount(){
int rowCount = ccTbl.getRowCount();
countCC.setText(String.valueOf(rowCount));
}
public void ccSort(){
String Branch1 = ccSort.getSelectedItem().toString();    
if(Branch1.equals("ALL")){
showCC();
}
else
{
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password, ID FROM dbo.invCC WHERE Branch = '"+Branch1+"' AND Stat != 'DISPOSED'";   
ResultSet rs=st.executeQuery(sql); 
ccTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
FilterCC(ccTbl,ccSearchtxt);
}
public void showHisCC(){
        int selectedRowIndex = ccTbl.getSelectedRow();
        String ID = ccTbl.getValueAt(selectedRowIndex,8).toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,SDate as StartDate,EDate as EndDate,Price,HIS_ID as HistoryID, ITEM_ID as ID FROM dbo.History WHERE Categ = 'CC' AND ITEM_ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql);
hisTbl2.setModel(DbUtils.resultSetToTableModel(rs));
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void CChiscount(){
int rowCount = hisTbl2.getRowCount();
countHis3.setText(String.valueOf(rowCount));
}
public void ccUpdate(){
int selectedRowIndex = ccTbl.getSelectedRow();
String ID = ccTbl.getValueAt(selectedRowIndex,5).toString();
String s1 = ccBran.getText();
String s2 = ccSupp.getText();
String s3 = ccUN.getText();
String s4 = ccPW.getText();
String s5 = ccNum.getText();
String s6 = ccRem.getText();
String s7 = ccHDD.getText();
String s8 = ccDVR.getText();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invCC SET Branch = '"+s1+"',SP = '"+s2+"',CAM = '"+s3+"',uN = '"+s4+"',pW ='"+s5+"',REM = '"+s6+"', HDD='"+s7+"', DVR='"+s8+"' WHERE ID = '"+ID+"'";         
st.execute(sql);
 String sql1 ="UPDATE dbo.Inv SET Branch = '"+s1+"',Owner = '"+s2+"',Dept = 'N/A' WHERE ID = '"+ID+"'";         
st.execute(sql1);
JOptionPane.showMessageDialog(null,"Information Updated!"); 
Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'CC','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }

//refreshCC();    
}
public void ccEditable(){
ccBran.setEditable(true);
ccSupp.setEditable(true);
ccUN.setEditable(true);
ccPW.setEditable(true);
ccNum.setEditable(true);
ccHDD.setEditable(true);
ccDVR.setEditable(true);
ccRem.setEditable(true);
ccUpdate.setVisible(true);
ccEdit.setVisible(false);
}
public void ccNonEditable(){
ccBran.setEditable(false);
ccSupp.setEditable(false);
ccUN.setEditable(false);
ccPW.setEditable(false);
ccNum.setEditable(false);
ccRem.setEditable(false); 
ccHDD.setEditable(false);
ccDVR.setEditable(false);
ccUpdate.setVisible(false);
ccEdit.setVisible(true);
}
public void ccDel(){
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
String s1 = ccBran.getText();
String s2 = ccSupp.getText();
String s3 = ccUN.getText();
String s4 = ccPW.getText();
String s5 = ccNum.getText();
String s6 = ccRem.getText();
       int selectedRowIndex = ccTbl.getSelectedRow();
       String ID = ccTbl.getValueAt(selectedRowIndex,8).toString();

Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invCC SET Stat = 'DISPOSED' WHERE ID = '"+ID+"'"; 
st.execute(sql);
 String sql1 ="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+ID+"'"; 
st.execute(sql1);


Statement sta = con.createStatement();
            String newsql1 ="INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+s1+"','Disposed', 'CC','"+s2+"','IT DEPARTMENT','"+ID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
            sta.execute(newsql1);
            
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Disposed', 'CC','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Device Disposed!"); 
addArchives("CC",ID, s1+"-"+s2);
showCC();
}
    if(n == JOptionPane.NO_OPTION){ 
/*
jDateChooser1.setCalendar(null);
jTextField13.setText("");
*/
    }
    if(n == JOptionPane.CLOSED_OPTION){
/*
jDateChooser1.setCalendar(null);
jTextField3.setText("");
*/
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//CC HISTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void ccHisEditable(){
ccHisBran.setEditable(true);
ccHisName.setEditable(true);
ccHisAct.setEditable(true);
ccHisSDate.setEnabled(true);
ccHisEDate.setEnabled(true);
ccHisSTime.setEditable(true);
ccHisETime.setEditable(true);
ccHisPric.setEditable(true);
ccHisRem.setEditable(true); 
}
public void ccHisNonEditable(){
ccHisBran.setEditable(false);
ccHisName.setEditable(false);
ccHisAct.setEditable(false);
ccHisSDate.setEnabled(false);
ccHisEDate.setEnabled(false);
ccHisSTime.setEditable(false);
ccHisETime.setEditable(false);
ccHisPric.setEditable(false);
ccHisRem.setEditable(false); 
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//FOR PR------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//INVENTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showPR(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name, ID FROM dbo.invPR WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
prTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPR(prTbl,prSearchtxt);
}
public void prSet(){
        int selectedRowIndex = prTbl.getSelectedRow();
        prBran.setText(prTbl.getValueAt(selectedRowIndex,0).toString());
        prDept.setText(prTbl.getValueAt(selectedRowIndex,1).toString());
        prManu.setText(prTbl.getValueAt(selectedRowIndex,2).toString());
        prName.setText(prTbl.getValueAt(selectedRowIndex,3).toString());
        showHisPR();
        setPRRem();
}
public void setPRRem(){
        int selectedRowIndex = prTbl.getSelectedRow();
        String ID = prTbl.getValueAt(selectedRowIndex,4).toString();
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Rem FROM dbo.invPR WHERE ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql); 
if(rs.next()){
String Rem = rs.getString("Rem");
prRem.setText(Rem);
      }
   }
      
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void PRcount(){
int rowCount = prTbl.getRowCount();
countPR.setText(String.valueOf(rowCount));
}
public void prSort(){
String Branch2 = prSort.getSelectedItem().toString();    
if(Branch2.equals("ALL")){
showPR(); 
}
else
{
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Manufacturer,Printername as Name,Department, ID FROM dbo.invPR  WHERE Branch = '"+Branch2+"' AND Stat = 'WORKING'";  
ResultSet rs=st.executeQuery(sql); 
prTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }  
}
FilterPR(prTbl,prSearchtxt);
}
public void showHisPR(){
        int selectedRowIndex = prTbl.getSelectedRow();
        String ID = prTbl.getValueAt(selectedRowIndex,4).toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,SDate as StartDate,EDate as EndDate,Price,HIS_ID as HistoryID, ITEM_ID as ID FROM dbo.History WHERE Categ = 'PR' AND ITEM_ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql);
hisTbl3.setModel(DbUtils.resultSetToTableModel(rs));
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void PRhiscount(){
int rowCount = hisTbl3.getRowCount();
countHis2.setText(String.valueOf(rowCount));
}
public void prUpdate(){
int selectedRowIndex = prTbl.getSelectedRow();
String ID = prTbl.getValueAt(selectedRowIndex,4).toString();   
String s1 = prBran.getText();
String s2 = prManu.getText();
String s3 = prName.getText();
String s4 = prDept.getText();
String s5 = prRem.getText();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invPR Branch = '"+s1+"',Manu = '"+s2+"',Owner = '"+s3+"' ,Dept = '"+s4+"',Rem = '"+s5+"' WHERE ID = '"+ID+"'";         
st.execute(sql);
 String sql1 ="UPDATE dbo.Inv Branch = '"+s1+"',Owner = '"+s3+"' ,Dept = '"+s4+"' WHERE ID = '"+ID+"'";         
st.execute(sql1);

JOptionPane.showMessageDialog(null,"Information Updated!"); 
Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'PR','"+s1+"-"+s4+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
//refreshPR();    
}
public void prEditable(){
prBran.setEditable(true);
prManu.setEditable(true);
prName.setEditable(true);
prDept.setEditable(true);
prRem.setEditable(true);
prUpdate.setVisible(true);
prEdit.setVisible(false);
}
public void prNonEditable(){
prBran.setEditable(false);
prManu.setEditable(false);
prName.setEditable(false);
prDept.setEditable(false);
prRem.setEditable(false);
prEdit.setVisible(true);
prUpdate.setVisible(false);
}
public void prDel(){
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
String s1 = prBran.getText();
String s2 = prManu.getText();
String s3 = prName.getText();
String s4 = prDept.getText();
String s5 = prRem.getText();
       int selectedRowIndex = prTbl.getSelectedRow();
       String ID = prTbl.getValueAt(selectedRowIndex,4).toString();

Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invPR SET Stat = 'DISPOSED' WHERE ID = '"+ID+"'"; 
st.execute(sql);
 String sql1 ="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+ID+"'"; 
st.execute(sql1);

Statement sta = con.createStatement();
            String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+s1+"','Disposed', 'PR','"+s3+"','IT DEPARTMENT','"+ID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
            sta.execute(newsql1);
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Dispose', 'PR','"+s1+"-"+s4+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Device Deleted!"); 
addArchives("PR",ID, s1+"-"+s4+"-"+s3+"-"+s2);
showPR();
}
    if(n == JOptionPane.NO_OPTION){ 
/*
jDateChooser1.setCalendar(null);
jTextField13.setText("");
*/
    }
    if(n == JOptionPane.CLOSED_OPTION){
/*
jDateChooser1.setCalendar(null);
jTextField3.setText("");
*/
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//PR HISTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void prHisEditable(){
prHisBran.setEditable(true);
prHisName.setEditable(true);
prHisAct.setEditable(true);
prHisSDate.setEnabled(true);
prHisEDate.setEnabled(true);
prHisSTime.setEditable(true);
prHisETime.setEditable(true);
prHisPric.setEditable(true);
prHisRem.setEditable(true); 
}
public void prHisNonEditable(){
prHisBran.setEditable(false);
prHisName.setEditable(false);
prHisAct.setEditable(false);
prHisSDate.setEnabled(false);
prHisEDate.setEnabled(false);
prHisSTime.setEditable(false);
prHisETime.setEditable(false);
prHisPric.setEditable(false);
prHisRem.setEditable(false); 
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//FOR PR------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//INVENTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showOT(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept AS Department, Owner as Name,Device, Name, Qty as Quantity, Qlt as Quality, ID FROM dbo.invOT WHERE Stat != 'DISPOSED' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
otTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterOT(otTbl,otherSearchtxt);
}
public void otDel(){
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
 String DevID = otTbl.getValueAt(otTbl.getSelectedRow(), 7).toString();
      String Bra = otTbl.getValueAt(otTbl.getSelectedRow(), 0).toString();
      String Dep = otTbl.getValueAt(otTbl.getSelectedRow(), 1).toString();
      String Own = otTbl.getValueAt(otTbl.getSelectedRow(), 2).toString();
      String Dev = otTbl.getValueAt(otTbl.getSelectedRow(), 3).toString();
      String Nam = otTbl.getValueAt(otTbl.getSelectedRow(), 4).toString();
       int selectedRowIndex = prTbl.getSelectedRow();
       String ID = prTbl.getValueAt(selectedRowIndex,4).toString();

Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invOT SET Stat = 'DISPOSED' WHERE ID = '"+DevID+"'"; 
st.execute(sql);
 String sql1 ="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+DevID+"'"; 
st.execute(sql1);

Statement sta = con.createStatement();
            String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Disposed', 'OT','"+Dev+" - "+Nam+"','IT DEPARTMENT','"+DevID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0','N/A')";
            sta.execute(newsql1);
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Dispose', 'OT','"+Dev+"-"+Nam+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"OT "+Dev+" Deleted!"); 
addArchives("OT",DevID, Dev+"-"+Nam);
showOT();
}
    if(n == JOptionPane.NO_OPTION){ 
/*
jDateChooser1.setCalendar(null);
jTextField13.setText("");
*/
    }
    if(n == JOptionPane.CLOSED_OPTION){
/*
jDateChooser1.setCalendar(null);
jTextField3.setText("");
*/
    }
}
public void showHisOT(){
        int selectedRowIndex = otTbl.getSelectedRow();
        String ID = otTbl.getValueAt(selectedRowIndex,7).toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,SDate as StartDate,EDate as EndDate,Price,HIS_ID as HistoryID, ITEM_ID as ID FROM dbo.History WHERE Categ = 'OT' AND ITEM_ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql);
hisTbl4.setModel(DbUtils.resultSetToTableModel(rs));
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void OThiscount(){
int rowCount = hisTbl4.getRowCount();
countHis4.setText(String.valueOf(rowCount));
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//FOR HISTORY------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//INVENTORY---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showHis(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History ORDER BY SDate DESC;";         
ResultSet rs=st.executeQuery(sql); 
allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterHIS(allHisTbl,HISsearchf);
}
public void hisSet(){
        int selectedRowIndex = allHisTbl.getSelectedRow();
        String categ = allHisTbl.getValueAt(selectedRowIndex,2).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(categ.equals("PC")){
        HISdetails.setVisible(true);
        HISpc.setVisible(true);
        HIScc.setVisible(false);
        HISpr.setVisible(false);
        pcHisBran.setText(allHisTbl.getValueAt(selectedRowIndex,0).toString());
       pcHisName.setText(allHisTbl.getValueAt(selectedRowIndex,3).toString());
        pcHisAct.setText(allHisTbl.getValueAt(selectedRowIndex,1).toString());
        pcHisPerf.setText(allHisTbl.getValueAt(selectedRowIndex,4).toString());
        pcHisSDate.setText(allHisTbl.getValueAt(selectedRowIndex,5).toString());
        pcHisEDate.setText(allHisTbl.getValueAt(selectedRowIndex,6).toString());
        pcHisSTime.setText(allHisTbl.getValueAt(selectedRowIndex,7).toString());
        pcHisETime.setText(allHisTbl.getValueAt(selectedRowIndex,8).toString());
        pcHisPric.setText(allHisTbl.getValueAt(selectedRowIndex,9).toString());
        pcHisRem.setText(allHisTbl.getValueAt(selectedRowIndex,10).toString());
   
        }
        else if(categ.equals("CC")){
        HISdetails.setVisible(true);
        HISpc.setVisible(false);
        HIScc.setVisible(true);
        HISpr.setVisible(false);
        ccHisBran.setText(allHisTbl.getValueAt(selectedRowIndex,0).toString());
         ccHisName.setText(allHisTbl.getValueAt(selectedRowIndex,3).toString());
        ccHisAct.setText(allHisTbl.getValueAt(selectedRowIndex,1).toString());
        ccHisPerf.setText(allHisTbl.getValueAt(selectedRowIndex,4).toString());
        ccHisSDate.setText(allHisTbl.getValueAt(selectedRowIndex,5).toString());
        ccHisEDate.setText(allHisTbl.getValueAt(selectedRowIndex,6).toString());
        ccHisSTime.setText(allHisTbl.getValueAt(selectedRowIndex,7).toString());
        ccHisETime.setText(allHisTbl.getValueAt(selectedRowIndex,8).toString());
        ccHisPric.setText(allHisTbl.getValueAt(selectedRowIndex,9).toString());
        ccHisRem.setText(allHisTbl.getValueAt(selectedRowIndex,10).toString());
        }
        else if(categ.equals("PR")){
        HISdetails.setVisible(true);
        HISpc.setVisible(false);
        HIScc.setVisible(false);
        HISpr.setVisible(true);
        prHisBran.setText(allHisTbl.getValueAt(selectedRowIndex,0).toString());
        prHisName.setText(allHisTbl.getValueAt(selectedRowIndex,3).toString());
        prHisAct.setText(allHisTbl.getValueAt(selectedRowIndex,1).toString());
        prHisPerf.setText(allHisTbl.getValueAt(selectedRowIndex,4).toString());
        prHisSDate.setText(allHisTbl.getValueAt(selectedRowIndex,5).toString());
        prHisEDate.setText(allHisTbl.getValueAt(selectedRowIndex,6).toString());
        prHisSTime.setText(allHisTbl.getValueAt(selectedRowIndex,7).toString());
        prHisETime.setText(allHisTbl.getValueAt(selectedRowIndex,8).toString());
        prHisPric.setText(allHisTbl.getValueAt(selectedRowIndex,9).toString());
        prHisRem.setText(allHisTbl.getValueAt(selectedRowIndex,10).toString());
        }
        
}
public void hisEditable(){

        pcHisBran.setEditable(true);
        pcHisName.setEditable(true);
        pcHisAct.setEditable(true);
        pcHisPerf.setEditable(true);
        pcHisSDate.setEditable(true);
        pcHisEDate.setEditable(true);
        pcHisSTime.setEditable(true);
        pcHisETime.setEditable(true);
        pcHisPric.setEditable(true);
        pcHisRem.setEditable(true);
   

        ccHisBran.setEditable(true);
        ccHisName.setEditable(true);
        ccHisAct.setEditable(true);
        ccHisPerf.setEditable(true);
        ccHisSDate.setEditable(true);
        ccHisEDate.setEditable(true);
        ccHisSTime.setEditable(true);
        ccHisETime.setEditable(true);
        ccHisPric.setEditable(true);
        ccHisRem.setEditable(true);
        
        prHisBran.setEditable(true);
        prHisName.setEditable(true);
        prHisAct.setEditable(true);
        prHisPerf.setEditable(true);
        prHisSDate.setEditable(true);
        prHisEDate.setEditable(true);
        prHisSTime.setEditable(true);
        prHisETime.setEditable(true);
        prHisPric.setEditable(true);
        prHisRem.setEditable(true);
        
        pcHisUpdate.setVisible(false);
        pcHisUpdate2.setVisible(true);
}
public void hisNonEditable(){
        pcHisBran.setEditable(false);
        pcHisName.setEditable(false);
        pcHisAct.setEditable(false);
        pcHisPerf.setEditable(false);
        pcHisSDate.setEditable(false);
        pcHisEDate.setEditable(false);
        pcHisSTime.setEditable(false);
        pcHisETime.setEditable(false);
        pcHisPric.setEditable(false);
        pcHisRem.setEditable(false);
        ccHisBran.setEditable(false);
        ccHisName.setEditable(false);
        ccHisAct.setEditable(false);
        ccHisPerf.setEditable(false);
        ccHisSDate.setEditable(false);
        ccHisEDate.setEditable(false);
        ccHisSTime.setEditable(false);
        ccHisETime.setEditable(false);
        ccHisPric.setEditable(false);
        ccHisRem.setEditable(false);
        prHisBran.setEditable(false);
        prHisName.setEditable(false);
        prHisAct.setEditable(false);
        prHisPerf.setEditable(false);
        prHisSDate.setEditable(false);
        prHisEDate.setEditable(false);
        prHisSTime.setEditable(false);
        prHisETime.setEditable(false);
        prHisPric.setEditable(false);
        prHisRem.setEditable(false);
        pcHisUpdate.setVisible(true);
        pcHisUpdate2.setVisible(false);
        
}
public void hisUpdate(){ 
        int selectedRowIndex = allHisTbl.getSelectedRow();
        String categ = allHisTbl.getValueAt(selectedRowIndex,2).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(categ.equals("PC")){
        String s1 = pcHisBran.getText();
        String s2 =pcHisName.getText();
        String s3 =pcHisAct.getText();
        String s4 =pcHisPerf.getText();
        String s5 =pcHisSDate.getText();
        String s6 =pcHisEDate.getText();
        String s7 =pcHisSTime.getText();
        String s8 =pcHisETime.getText();
        String s9 =pcHisPric.getText();
        String s10 =pcHisRem.getText();
        String ID = (allHisTbl.getValueAt(selectedRowIndex,11).toString());
        try{
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
String sql ="UPDATE dbo.History SET Branch = '"+s1+"',Name = '"+s2+"',Action = '"+s3+"',Perf = '"+s4+"',SDate = '"+s5+"',EDate = '"+s6+"',STime = '"+s7+"',ETime = '"+s8+"',Price = '"+s9+"',Remarks = '"+s10+"'  WHERE HIS_ID = '"+ID+"'";         
st.executeUpdate(sql);

JOptionPane.showMessageDialog(null,"Information Updated!"); 

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'History','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
        
        }
        else if(categ.equals("CC")){
        String s1 = ccHisBran.getText();
        String s2 =ccHisName.getText();
        String s3 =ccHisAct.getText();
        String s4 =ccHisPerf.getText();
        String s5 =ccHisSDate.getText();
        String s6 =ccHisEDate.getText();
        String s7 =ccHisSTime.getText();
        String s8 =ccHisETime.getText();
        String s9 =ccHisPric.getText();
        String s10 =ccHisRem.getText();
        String ID = (allHisTbl.getValueAt(selectedRowIndex,11).toString());
               try{
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
String sql ="UPDATE dbo.History SET Branch = '"+s1+"',Name = '"+s2+"',Action = '"+s3+"',Perf = '"+s4+"',SDate = '"+s5+"',EDate = '"+s6+"',STime = '"+s7+"',ETime = '"+s8+"',Price = '"+s9+"',Remarks = '"+s10+"'  WHERE HIS_ID = '"+ID+"'";         
st.executeUpdate(sql);

JOptionPane.showMessageDialog(null,"Information Updated!"); 

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'History','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
        }
        else if(categ.equals("PR")){
        String s1 = prHisBran.getText();
        String s2 = prHisName.getText();
        String s3 = prHisAct.getText();
        String s4 = prHisPerf.getText();
        String s5 = prHisSDate.getText();
        String s6 = prHisEDate.getText();
        String s7 = prHisSTime.getText();
        String s8 = prHisETime.getText();
        String s9 = prHisPric.getText();
        String s10 = prHisRem.getText();
         String ID = (allHisTbl.getValueAt(selectedRowIndex,11).toString());
        try{
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
String sql ="UPDATE dbo.History SET Branch = '"+s1+"',Name = '"+s2+"',Action = '"+s3+"',Perf = '"+s4+"',SDate = '"+s5+"',EDate = '"+s6+"',STime = '"+s7+"',ETime = '"+s8+"',Price = '"+s9+"',Remarks = '"+s10+"'  WHERE HIS_ID = '"+ID+"'";         
st.executeUpdate(sql);

JOptionPane.showMessageDialog(null,"Information Updated!"); 

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'History','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
        }
        
showHis();
Hiscount();
//refreshPC();
}
public void hisAdd(){
        int selectedRowIndex = allHisTbl.getSelectedRow();
        String categ = allHisTbl.getValueAt(selectedRowIndex,2).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
                String br = (allHisTbl.getValueAt(selectedRowIndex,0).toString());
                String nm = (allHisTbl.getValueAt(selectedRowIndex,3).toString());
                String devid = (allHisTbl.getValueAt(selectedRowIndex,11).toString());
                String ac = hisActAdd.getText();
                String pf = hisPerfAdd.getText();
                String pr = hisPricAdd.getText();
                Date sd = hisSDateAdd.getDate();
                Date ed = hisEDateAdd.getDate();
                String st = hisSTimeAdd.getText();
                String et = hisETimeAdd.getText();
                String rm = hisRemAdd.getText();
            try {  
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
                Statement st12=con.createStatement(); 
                String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+br+"','"+ac+"', '"+categ+"','"+nm+"','"+pf+"','"+devid+"','"+sdf.format(sd)+"','"+sdf.format(ed)+"','"+st+"','"+et+"','"+pr+"','"+rm+"')";
                st12.execute(newsql1);
                
                JOptionPane.showMessageDialog(null,"Information Updated!"); 

                Statement sta = con.createStatement();
                String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'History','"+br+"-"+nm+"','"+dt.format(date)+"','"+tm.format(time)+"')";
                sta.execute(newsql);
            } 
             catch (SQLException ex) {    
                JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
                JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
                }
}
public void Hiscount(){
int rowCount = allHisTbl.getRowCount();
countHis5.setText(String.valueOf(rowCount));
}
public void hisFilter(){
String Branch2 = hisSortCateg.getSelectedItem().toString();
        if (hisSortSDate.getDate() == null && hisSortEDate.getDate() == null){ 
           if(hisSortCateg.getSelectedItem()=="ALL"){
            showHis(); 
            }
            else
            {
            if(Branch2.equals("Computer")){
                String Type = "PC";
            try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE Categ = '"+Type+"'";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());           
             }FilterHIS(allHisTbl,HISsearchf);
            }
                        if(Branch2.equals("CCTV")){
                String Type = "CC";
            try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE Categ = '"+Type+"'";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());           
             }FilterHIS(allHisTbl,HISsearchf);
            }
                        
            if(Branch2.equals("Printer")){
            String Type = "PR";
            try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE Categ = '"+Type+"'";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());           
             }FilterHIS(allHisTbl,HISsearchf);
            }

            }       
        }
        
        
        else {
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String startD = sdf.format(hisSortSDate.getDate());
String endD = sdf.format(hisSortEDate.getDate());           
           if(hisSortCateg.getSelectedItem()=="ALL"){
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+startD+"' AND '"+endD+"' ORDER BY HIS_ID";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
            FilterHIS(allHisTbl,HISsearchf);
        }
            else
            {
             if(Branch2.equals("Computer")){
             String Type = "PC";
             try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' AND Categ = '"+Type+"' ORDER BY HIS_ID";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
}FilterHIS(allHisTbl,HISsearchf);}
           if(Branch2.equals("CCTV")){
             String Type = "CC";
             try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' AND Categ = '"+Type+"' ORDER BY HIS_ID";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
}FilterHIS(allHisTbl,HISsearchf);}
if(Branch2.equals("Printer")){
             String Type = "PR";
             try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' AND Categ = '"+Type+"' ORDER BY HIS_ID";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
}FilterHIS(allHisTbl,HISsearchf);}

      
}
        }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//FOR ACTIVITY LOG------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showActLog(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Action, Categ as Category, Item, Date, Time FROM dbo.Logs ORDER by Log_ID";         
ResultSet rs=st.executeQuery(sql); 
actlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterAL(actlogTbl,ActLogSearch);
}
public void ALogcount(){
int rowCount = actlogTbl.getRowCount();
actLogCnt.setText(
        String.valueOf(rowCount));
}
public void alogSort(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String startD = sdf.format(jDateChooser2.getDate());
        String endD = sdf.format(jDateChooser1.getDate());

        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");; 
            ResultSet rs;
            Statement st=con.createStatement();
            String sql = "SELECT Action, Categ as Category, Item, Date, Time FROM dbo.Logs WHERE CONVERT(VARCHAR(50),Date, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' ORDER BY Log_ID";
            rs=st.executeQuery(sql);
            ///SELECT SalesDate AS Date , SalesLipa AS Lipa , SalesBats AS Batangas  FROM dbo.tbl_chart ORDER BY SalesDate DESC
            actlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());
        }
        FilterAL(actlogTbl,ActLogSearch);
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//FOR USER LOG------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showUserLog(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Laction as Action, Ldate as Date, Ltime as Time FROM dbo.userLogs ORDER by LOG_ID";         
ResultSet rs=st.executeQuery(sql); 
userlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterUL(userlogTbl,UserLogSearch);
}
public void ulogSort(){ 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String startD = sdf.format(jDateChooser3.getDate());
        String endD = sdf.format(jDateChooser4.getDate());
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");; 
            ResultSet rs;
            Statement st=con.createStatement();
            String sql = "SELECT Laction as Action, Ldate as Date, Ltime as Time FROM dbo.userLogs WHERE CONVERT(VARCHAR(50),Ldate, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' ORDER BY LOG_ID";
            rs=st.executeQuery(sql);
            userlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());
        }
        FilterUL(userlogTbl,UserLogSearch);
}
public void ULogcount(){
int rowCount = userlogTbl.getRowCount();
uLogCnt.setText(String.valueOf(rowCount));
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



//Initializing Content------------------------------------------------------------------------------------------------------------------------------------------------------------------------

private void setIcon() {
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/NEMAR LOGO 2.png")));
    }
public void initEdit(){
pcNonEditable();
ccNonEditable();
prNonEditable();
}
//End of Initialization------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//HOMEPAGE---------------------------------------
public void showRep(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Categ as DeviceCode, Branch, Dept as Department, Owner, Rep_Item as Device, Rep.Dev_ID as DevID, Rep_ID as ID FROM dbo.Inv, dbo.Rep WHERE Inv.Dev_ID = Rep.Dev_ID AND Rep_Stat = 'FOR REPAIR';";         
ResultSet rs=st.executeQuery(sql); 
repTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterHP(repTbl,repSearch);
}
public void repRepaired() {
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = repTbl.getValueAt(selectedRowIndex,0).toString();
String Bra = repTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = repTbl.getValueAt(selectedRowIndex,2).toString();
String Own = repTbl.getValueAt(selectedRowIndex,3).toString();
String Ite = repTbl.getValueAt(selectedRowIndex,4).toString();
String Dev = repTbl.getValueAt(selectedRowIndex,5).toString();
String His= repTbl.getValueAt(selectedRowIndex,6).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){        
    if(Ite.equals("PC Unit")){
    String sql ="UPDATE dbo.invPC SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);

    
    }
    else {
    String sel = Ite; 
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
    String sql ="UPDATE dbo.invPC SET "+item+" = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"' AND Rep_Item = '"+Ite+"' AND Rep_ID = '"+His+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
   
    }
 }

else if (Categ.equals("CC")){        
    if(Ite.equals("CCTV")){
     String sql ="UPDATE dbo.invCC SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    }
    else {
    String sel = Ite; 
    if (sel.equals("Camera")){
        item = "Cnum";
    }
     else if (sel.equals("HDD")){
        item = "HDD";
    }
     else if (sel.equals("DVR")){
        item = "DVR";
    }
    
    String sql ="UPDATE dbo.invCC SET "+item+" = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"' AND Rep_Item = '"+Ite+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    }
 }

else if (Categ.equals("PR")){        
    String sql ="UPDATE dbo.invPR SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
}
else if (Categ.equals("OT")){        
    String sql ="UPDATE dbo.invOT SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
}

Statement sta = con.createStatement();
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Repaired', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"-"+Ite+"','"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
  String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Ready for Transmittal', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'"+Ite+" For shipping')";
    sta.execute(newsql1);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2 = st.executeQuery(sql6);     
      if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
            
     String sql7 = "SELECT  Rep_Name FROM dbo.Rep WHERE Rep_ID = '"+His+"'";         
    ResultSet rs3; 
    rs3 = st.executeQuery(sql7);             
            if (rs3.next()) { 
             name = rs3.getString("Rep_Name");   
            }
     String sql5 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+Dev+"', '"+Ite+"', '"+name+"', 'FOR SHIPPING', "+id+" )";        
     st.executeUpdate(sql5);
JOptionPane.showMessageDialog(null,"Device for Transmittal!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void repDisposed() {
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = repTbl.getValueAt(selectedRowIndex,0).toString();
String Bra = repTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = repTbl.getValueAt(selectedRowIndex,2).toString();
String Own = repTbl.getValueAt(selectedRowIndex,3).toString();
String Ite = repTbl.getValueAt(selectedRowIndex,4).toString();
String Dev = repTbl.getValueAt(selectedRowIndex,5).toString();
String His= repTbl.getValueAt(selectedRowIndex,6).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
 Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){        
    if(Ite.equals("PC Unit")){
    String sql ="UPDATE dbo.invPC SET Stat = 'DISPOSED' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Disposed' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    addArchives("PC",Dev,Bra+Dep+Own);
    
    }
    else {
    String sel = Ite; 
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
    String sql ="UPDATE dbo.invPC SET "+item+" = 'N/A' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DISPOSED' WHERE Dev_ID = '"+Dev+"' AND Rep_Item = '"+Ite+"' AND Rep_ID = '"+His+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Disposed' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
     String newsql1 = "INSERT INTO dbo.Inv (Categ, Branch, Owner, Dept, Status) VALUES ('OT', 'ADMIN', 'IT RESERVE','IT','DISPOSED')";
     st.execute(newsql1);
    String sql5 = "SELECT TOP 1 Dev_ID FROM dbo.Inv ORDER BY Dev_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql5);             
            if (rs2.next()) { 
             hm = rs2.getString("Dev_ID");   
            }
    String sql7 = "SELECT  Rep_Name FROM dbo.Rep WHERE Rep_ID = '"+His+"'";         
    ResultSet rs3; 
    rs3 = st.executeQuery(sql7);             
            if (rs3.next()) { 
             devname = rs3.getString("Rep_Name");   
            }
     String newsql = "INSERT INTO dbo.invOT (Branch, Dept, Owner,Categ, Device, Name, Qty, Rem, ID, Qlt, Stat) VALUES ('ADMIN', 'IT', 'IT RESERVE','OT','"+sel+"', '"+devname+"', 1, 'Transfered "+dt.format(date)+"', "+hm+", 'USED', 'DISPOSED' )";
     st.execute(newsql);
     String newsql9 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('ADMIN','Add to Reserve', '"+Categ+"','"+sel+" - "+devname+" from "+Bra+"-"+Dep+"-"+Own+"','IT DEPARTMENT','"+hm+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0.00', '"+sel+" Malfunctioned' )";
     st.execute(newsql9);
    showRep();
    addArchives("OT",hm,sel+devname);
    }
 }

else if (Categ.equals("CC")){        
    if(Ite.equals("CCTV")){
     String sql ="UPDATE dbo.invCC SET Stat = 'DISPOSED' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Disposed' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
      addArchives("CC",Dev,Bra);
    }
    else {
    String sel = Ite; 
    if (sel.equals("Camera")){
        item = "Cnum";
    }
     else if (sel.equals("HDD")){
        item = "HDD";
    }
     else if (sel.equals("DVR")){
        item = "DVR";
    }
    
    String sql ="UPDATE dbo.invCC SET "+item+" = 'N/A' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DISPOSED' WHERE Dev_ID = '"+Dev+"' AND Rep_Item = '"+Ite+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Disposed' WHERE HIS_ID  = '"+His+"'";         
    st.executeUpdate(sql4);
    String newsql1 = "INSERT INTO dbo.Inv (Categ, Branch, Owner, Dept, Status) VALUES ('OT', 'ADMIN', 'IT RESERVE','IT','DISPOSED')";
     st.execute(newsql1);
    String sql5 = "SELECT TOP 1 Dev_ID FROM dbo.Inv ORDER BY Dev_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql5);             
            if (rs2.next()) { 
             hm = rs2.getString("Dev_ID");   
            }
    String sql7 = "SELECT  Rep_Name FROM dbo.Rep WHERE Rep_ID = '"+His+"'";         
    ResultSet rs3; 
    rs3 = st.executeQuery(sql7);             
            if (rs3.next()) { 
             devname = rs3.getString("Rep_Name");   
            }
     String newsql = "INSERT INTO dbo.invOT (Branch, Dept, Owner,Categ, Device, Name, Qty, Rem, ID, Qlt, Stat) VALUES ('ADMIN', 'IT', 'IT RESERVE','OT','"+sel+"', '"+devname+"', 1, 'Transfered "+dt.format(date)+"', "+hm+", 'USED', 'DISPOSED' )";
     st.execute(newsql);
      String newsql9 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('ADMIN','Add to Reserve', '"+Categ+"','"+sel+" - "+devname+" from "+Bra+"-"+Dep+"-"+Own+"','IT DEPARTMENT','"+hm+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','0.00', '"+sel+" Malfunctioned' )";
     st.execute(newsql9);
    showRep();
    addArchives("OT",hm,sel+devname);
    }
 }

else if (Categ.equals("PR")){        
    String sql ="UPDATE dbo.invPR SET Stat = 'DISPOSED' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Disposed' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    addArchives("PR",Dev, Bra+Dep+Own);
}

else if (Categ.equals("OT")){        
    String sql ="UPDATE dbo.invOT SET Stat = 'DISPOSED' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'DISPOSED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Disposed' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    addArchives("OT",Dev,"");
}

Statement sta = con.createStatement();
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Disposed', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"-"+Ite+"','"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);

JOptionPane.showMessageDialog(null,"Device successfully disposed!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
    if(n == JOptionPane.NO_OPTION){ 
/*
jDateChooser1.setCalendar(null);
jTextField13.setText("");
*/
    }
    if(n == JOptionPane.CLOSED_OPTION){
/*
jDateChooser1.setCalendar(null);
jTextField3.setText("");
*/
    }
}
public void showShip(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Categ as DeviceCode, Branch, Dept as Department, Owner, Ship_Item as Device, Ship_Name as Name, Ship.Dev_ID as DevID, Ship_ID as ID FROM dbo.Inv, dbo.Ship WHERE Inv.Dev_ID = Ship.Dev_ID AND Ship_Stat = 'FOR SHIPPING';";         
ResultSet rs=st.executeQuery(sql); 
shipTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterHP(shipTbl, shipSearch);
}
public void showPur(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Categ as DeviceCode, Branch, Dept as Department, Owner, Pur_Item as Device, Pur_Name as Name, Pur.Dev_ID as DevID, Pur_ID as ID FROM dbo.Inv, dbo.Pur WHERE Inv.Dev_ID = Pur.Dev_ID AND Pur_Stat = 'PENDING';";         
ResultSet rs=st.executeQuery(sql); 
reqTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterHP(reqTbl, reqSearch);
}
public void showHP(){
//REPAIR
showRep();
//SHIPPED
showShip();
//PURCHASE
showPur();
}
public void shipDeliv() {
int selectedRowIndex = shipTbl.getSelectedRow();
String Categ = shipTbl.getValueAt(selectedRowIndex,0).toString();
String Bra = shipTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = shipTbl.getValueAt(selectedRowIndex,2).toString();
String Own = shipTbl.getValueAt(selectedRowIndex,3).toString();
String Ite = shipTbl.getValueAt(selectedRowIndex,4).toString();
String Nam = shipTbl.getValueAt(selectedRowIndex,5).toString();
String Dev = shipTbl.getValueAt(selectedRowIndex,6).toString();
String His= shipTbl.getValueAt(selectedRowIndex,7).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){        
    if(Ite.equals("Unit")){
    String sql ="UPDATE dbo.invPC SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'SHIPPED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Shipped' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);

    
    }
    else {
    String sel = Ite; 
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
    String sql ="UPDATE dbo.invPC SET "+item+" = '"+Nam+"' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'SHIPPED' WHERE Ship_ID = '"+His+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Shipped' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    }
 }

else if (Categ.equals("CC")){        
    if(Ite.equals("CCTV")){
     String sql ="UPDATE dbo.invCC SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'SHIPPED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Shipped' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    }
    else {
    String sel = Ite; 
    if (sel.equals("Camera")){
        item = "Cnum";
    }
     else if (sel.equals("HDD")){
        item = "HDD";
    }
     else if (sel.equals("DVR")){
        item = "DVR";
    }
    
    String sql ="UPDATE dbo.invCC SET "+item+" = '"+Nam+"' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'SHIPPED' WHERE Dev_ID = '"+Dev+"' AND Ship_Item = '"+Ite+"' AND Ship_ID = '"+His+"'";      
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Shipped' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    }
 }

else if (Categ.equals("PR")){        
    String sql ="UPDATE dbo.invPR SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Ship_Stat = 'SHIPPED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Shipped' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
}
else if (Categ.equals("OT")){        
    String sql ="UPDATE dbo.invOT SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Ship_Stat = 'SHIPPED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Shipped' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
}

Statement sta = con.createStatement();
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Shipped', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"-"+Ite+"','"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
JOptionPane.showMessageDialog(null,"Device Shipped!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void repTransfer() {
int selectedRowIndex = repTbl.getSelectedRow();
String Categ = repTbl.getValueAt(selectedRowIndex,0).toString();
String Bra = repTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = repTbl.getValueAt(selectedRowIndex,2).toString();
String Own = repTbl.getValueAt(selectedRowIndex,3).toString();
String Ite = repTbl.getValueAt(selectedRowIndex,4).toString();
String Dev = repTbl.getValueAt(selectedRowIndex,5).toString();
String His= repTbl.getValueAt(selectedRowIndex,6).toString();
String Pr, Mot, Ra, Mon, Hd, Ke, Mou, Up;
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){        
    if(Ite.equals("Unit")){
    String sql ="UPDATE dbo.invPC SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);

    
    }
    else {
    String sel = Ite; 
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
    String sql ="UPDATE dbo.invPC SET "+item+" = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"' AND Rep_Item = '"+Ite+"' AND Rep_ID = '"+His+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
   
    }
 }

else if (Categ.equals("CC")){        
    if(Ite.equals("CCTV")){
     String sql ="UPDATE dbo.invCC SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    }
    else {
    String sel = Ite; 
    if (sel.equals("Camera")){
        item = "Cnum";
    }
     else if (sel.equals("HDD")){
        item = "HDD";
    }
     else if (sel.equals("DVR")){
        item = "DVR";
    }
    
    String sql ="UPDATE dbo.invCC SET "+item+" = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"' AND Rep_Item = '"+Ite+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    }
 }

else if (Categ.equals("PR")){        
    String sql ="UPDATE dbo.invPR SET Stat = 'FOR SHIPPING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Rep_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'FOR SHIPPING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Repaired' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
}

Statement sta = con.createStatement();
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Repaired', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"-"+Ite+"','"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
  String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+Bra+"','Ready for Transmittal', '"+Categ+"','"+Dep+"-"+Own+"','IT DEPARTMENT','"+Dev+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'"+Ite+" For shipping')";
    sta.execute(newsql1);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2; 
    rs2 = st.executeQuery(sql6);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
            
     String sql7 = "SELECT  Rep_Name FROM dbo.Rep WHERE Rep_ID = '"+His+"'";         
    ResultSet rs3; 
    rs3 = st.executeQuery(sql7);             
            if (rs3.next()) { 
             name = rs3.getString("Rep_Name");   
            }
     String sql5 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+Dev+"', '"+Ite+"', '"+name+"', 'FOR SHIPPING', "+id+" )";        
     st.executeUpdate(sql5);
JOptionPane.showMessageDialog(null,"Device for Transmittal!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void shipDel() {
int selectedRowIndex = shipTbl.getSelectedRow();
String Categ = shipTbl.getValueAt(selectedRowIndex,0).toString();
String Bra = shipTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = shipTbl.getValueAt(selectedRowIndex,2).toString();
String Own = shipTbl.getValueAt(selectedRowIndex,3).toString();
String Ite = shipTbl.getValueAt(selectedRowIndex,4).toString();
String Nam = shipTbl.getValueAt(selectedRowIndex,5).toString();
String Dev = shipTbl.getValueAt(selectedRowIndex,6).toString();
String His= shipTbl.getValueAt(selectedRowIndex,7).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){        
    if(Ite.equals("PC Unit")){
    String sql ="UPDATE dbo.invPC SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Transmitted' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
     JOptionPane.showMessageDialog(null,"PC Unit Transmitted!");
    showShip();
    }
    else {
    String sel = Ite; 
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
    String sql ="UPDATE dbo.invPC SET "+item+" = '"+Nam+"' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"' AND Ship_Item = '"+Ite+"' AND Ship_ID = '"+His+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Transmitted' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
      JOptionPane.showMessageDialog(null,""+sel+" Transmitted!");
    showShip();
   
    }
 }

else if (Categ.equals("CC")){        
    
    String sql ="UPDATE dbo.invCC SET HDD = '"+Nam+"', Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"' AND Ship_Item = '"+Ite+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Transmitted' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showShip();
     JOptionPane.showMessageDialog(null,"CCTV HDD Transmitted!");
    }
 

else if (Categ.equals("PR")){        
    String sql ="UPDATE dbo.invPR SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Transmitted' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showShip();
         JOptionPane.showMessageDialog(null,"Printer Transmitted!");
}

else if (Categ.equals("OT")){        
    String sql ="UPDATE dbo.invOT SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Ship_Stat = 'DONE' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Transmitted' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showShip();
         JOptionPane.showMessageDialog(null,""+Ite+" Transmitted!");
}

Statement sta = con.createStatement();
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transmitted', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"-"+Ite+"','"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}



//Refreshing Screen Content------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void refreshPC(){
pcSearchtxt.setText("");
pcSort.setSelectedItem("ALL");
//compTbl.setRowSelectionInterval(0,0);

}
public void refreshCC(){
ccSearchtxt.setText("");
ccSort.setSelectedItem("ALL");
//ccTbl.setRowSelectionInterval(0,0);
}
public void refreshPR(){
prSearchtxt.setText("");
prSort.setSelectedItem("ALL");
//prTbl.setRowSelectionInterval(0,0);
}
public void refreshHIS(){
     //allHisTbl.setRowSelectionInterval(0,0);
     Filter.setVisible(false);
     hisSortCateg.setSelectedItem("ALL");
     hisSortSDate.setCalendar(null);
     hisSortEDate.setCalendar(null);
}
public void refreshALog(){
ActLogSearch.setText("");
jDateChooser2.setCalendar(null);
jDateChooser1.setCalendar(null);
//showActLog();
}
public void refreshULog(){
UserLogSearch.setText("");
jDateChooser3.setCalendar(null);
jDateChooser4.setCalendar(null);
//showUserLog();
}
//End of Screen Content Refresh------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Opening Other Window------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void LoginOpen(){
        Login l = new Login();
        l.setVisible(true);
        this.dispose();   
}
public void AddRepOpen(){
        AddRepair l = new AddRepair();
        l.setVisible(true);  
}
//Opening of Window Opening------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Logs----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void logoutLog(){
    Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Logout",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
        try {
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        Statement sta = con.createStatement();
        String newsql = "INSERT INTO dbo.userLogs(Laction,Ldate,Ltime) VALUES ('Logout','"+dt.format(date)+"','"+tm.format(time)+"')";					
        sta.execute(newsql);        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    if(n == JOptionPane.CANCEL_OPTION){ 
/*
jDateChooser1.setCalendar(null);
jTextField13.setText("");
*/
    }
    if(n == JOptionPane.CLOSED_OPTION){
/*
jDateChooser1.setCalendar(null);
jTextField3.setText("");
*/
    }
}
//End Of Logs----------------------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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

public static void setCellsAlignment(JTable table, int alignment)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
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

//TRANSFER FUNCTIONS------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showdp(){
    String Branch = transBR.getSelectedItem().toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
if(Branch.equals("ALL")){sql = "SELECT Branch, Dept as Department,ID FROM dbo.Departments ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
toTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();}
else{
sql = "SELECT Branch, Dept as Department,ID FROM dbo.Departments WHERE Branch = '"+Branch+"' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
toTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();}
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterPCtr(toTbl,toSearchtxt);
} 
public void showPCtr(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk,Moni as Monitor,KeyB as Keyboard, Mouse,UPS, ID FROM dbo.invPC WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
transTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterPCtr(transTbl,transSearchtxt);
}  
public void pcSettr(){
        String Parts = transferSelect.getSelectedItem().toString();   
        int selectedRowIndex = transTbl.getSelectedRow();
        if(Parts.equals("Unit")){
        unitPro1.setText(transTbl.getValueAt(selectedRowIndex,3).toString());
        unitMot1.setText(transTbl.getValueAt(selectedRowIndex,4).toString());
        unitRam1.setText(transTbl.getValueAt(selectedRowIndex,5).toString());
        unitHar1.setText(transTbl.getValueAt(selectedRowIndex,6).toString());
        unitMon1.setText(transTbl.getValueAt(selectedRowIndex,7).toString());
        unitKey1.setText(transTbl.getValueAt(selectedRowIndex,8).toString());
        unitMou1.setText(transTbl.getValueAt(selectedRowIndex,9).toString());
        unitUPS1.setText(transTbl.getValueAt(selectedRowIndex,10).toString());
        }
        else
        unitPro2.setText(transTbl.getValueAt(selectedRowIndex,3).toString());
        
}
public void pcSorttr(){
String Branch = pcBR.getSelectedItem().toString();   
String Parts = transferSelect.getSelectedItem().toString();   
if(Branch.equals("ALL")){
    if(Parts.equals("Unit")){
    showPCtr(); 
    jPanel22.setVisible(true);
    jPanel24.setVisible(false);
     toOwner.setEditable(true);
    showdp();
    }
    else
    {jPanel22.setVisible(false);
    jPanel24.setVisible(true);
    toOwner.setEditable(false);
    if(Parts.equals("Processor")){
    Parts1 = "Proce";
    }
    if(Parts.equals("Motherboard")){
    Parts1 = "MBoard";
    }
    if(Parts.equals("Harddrive")){
    Parts1 = "HDD";
    }
    if(Parts.equals("RAM")){
    Parts1 = "Ram";
    }
    if(Parts.equals("Monitor")){
    Parts1 = "Moni";
    }
    if(Parts.equals("UPS")){
    Parts1 = "UPS";
    }
    if(Parts.equals("Mouse")){
    Parts1 = "Mouse";
    }
    if(Parts.equals("Keyboard")){
    Parts1 = "KeyB";
    }
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department, Owner as CurrentUser, "+Parts1+" as Device,  ID FROM dbo.invPC WHERE Stat = 'WORKING' AND "+Parts1+" != 'N/A' AND "+Parts1+" != 'IN REPAIR' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
transTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
sql1 = "SELECT Branch, Dept as Department, Owner as CurrentUser,"+Parts1+" as Device, ID FROM dbo.invPC WHERE Stat = 'WORKING'  ORDER by Branch";         
ResultSet rs1=st.executeQuery(sql1); 
toTbl.setModel(DbUtils.resultSetToTableModel(rs1));
rs1.close();
st.close();

      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterPCtr(transTbl,transSearchtxt);
 FilterPCtr(toTbl,toSearchtxt);
    
}  
}
else
{
if(Parts.equals("Unit")){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk,Moni as Monitor,KeyB as Keyboard, Mouse,UPS, ID FROM dbo.invPC WHERE Branch = '"+Branch+"' AND Stat = 'WORKING' ORDER BY Branch ";         
rs=st.executeQuery(sql); 
transTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
showdp();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPCtr(transTbl,transSearchtxt);
}
else
    {
    if(Parts.equals("Processor")){
    Parts1 = "Proce";
    }
    if(Parts.equals("Motherboard")){
    Parts1 = "MBoard";
    }
    if(Parts.equals("Harddrive")){
    Parts1 = "HDD";
    }
    if(Parts.equals("RAM")){
    Parts1 = "Ram ";
    }
    if(Parts.equals("Monitor")){
    Parts1 = "Moni";
    }
    if(Parts.equals("UPS")){
    Parts1 = "UPS";
    }
    if(Parts.equals("Mouse")){
    Parts1 = "Mouse";
    }
    if(Parts.equals("Keyboard")){
    Parts1 = "KeyB";
    }
    
        try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,"+Parts1+",ID FROM dbo.invPC WHERE Branch = '"+Branch+"' AND Stat = 'WORKING' AND "+Parts1+" != 'N/A' AND "+Parts1+" != 'IN REPAIR' ORDER BY Branch ";         
rs=st.executeQuery(sql); 
transTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
sql1 = "SELECT Branch, Dept as Department,Owner as CurrentUser,"+Parts1+", ID FROM dbo.invPC WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs1=st.executeQuery(sql1); 
toTbl.setModel(DbUtils.resultSetToTableModel(rs1));
rs1.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPCtr(transTbl,transSearchtxt);   
 FilterPCtr(toTbl,toSearchtxt);


    }
//compTbl.setRowSelectionInterval(0,0);
}
}
public void refreshPCtr(){
        unitPro1.setText("");
        unitMot1.setText("");
        unitRam1.setText("");
        unitHar1.setText("");
        unitMon1.setText("");
        unitKey1.setText("");
        unitMou1.setText("");
        unitUPS1.setText("");
}

public void showCCtr(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider, HDD, ID FROM dbo.invCC WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
transTbl2.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
  sql1 = "SELECT Branch, SP as ServiceProvider,HDD, ID FROM dbo.invCC WHERE  Stat = 'WORKING'";   
ResultSet rs1=st.executeQuery(sql1); 
toTbl.setModel(DbUtils.resultSetToTableModel(rs1));
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterCCtr(transTbl2,trSearchtxt2);
  FilterCCtr(toTbl,toSearchtxt);
}
public void ccSettr(){
        int selectedRowIndex = transTbl2.getSelectedRow();
        unitPro5.setText(transTbl2.getValueAt(selectedRowIndex,1).toString());
}
public void ccSorttr(){
String Branch1 = ccBR.getSelectedItem().toString();    
if(Branch1.equals("ALL")){
showCCtr();
}
else
{
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,HDD, ID FROM dbo.invCC WHERE Branch = '"+Branch1+"' AND Stat = 'WORKING'";   
ResultSet rs=st.executeQuery(sql); 
transTbl2.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
sql1 = "SELECT Branch, SP as ServiceProvider,HDD, ID FROM dbo.invCC WHERE Branch = '"+Branch1+"' AND Stat = 'WORKING'";   
ResultSet rs1=st1.executeQuery(sql1); 
toTbl.setModel(DbUtils.resultSetToTableModel(rs1));
rs1.close();
st1.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
FilterCCtr(transTbl2,trSearchtxt2);
 FilterCCtr(toTbl,toSearchtxt);
}

public void showPRtr(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name, ID FROM dbo.invPR WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
transTbl1.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPRtr(transTbl1,trSearchtxt1);
}
public void prSettr(){
        int selectedRowIndex = transTbl1.getSelectedRow();
        unitPro4.setText(transTbl1.getValueAt(selectedRowIndex,2).toString());
}
public void prSorttr(){
String Branch2 = prBR.getSelectedItem().toString();    
if(Branch2.equals("ALL")){
showPRtr(); 
}
else
{
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Manu AS Manufacturer,Owner as Name,Dept AS Department, ID FROM dbo.invPR  WHERE Branch = '"+Branch2+"' AND Stat = 'WORKING'";  
ResultSet rs=st.executeQuery(sql); 
transTbl1.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }  
}
FilterPRtr(transTbl1,trSearchtxt1);
}

public void transferPC() {
int selectedRowIndex = transTbl.getSelectedRow();
String Pro = unitPro1.getText();
String Mot = unitMot1.getText();
String Har = unitHar1.getText();
String Mon = unitMon1.getText();
String Ups = unitUPS1.getText();
String Key = unitKey1.getText();
String Ram = unitRam1.getText();
String Mou = unitMou1.getText();
String frID = transTbl.getValueAt(selectedRowIndex, 11).toString();
String toBra = toBranch.getText();
String toDep = toDept.getText();
String toOwn = toOwner.getText();
String frBra = transTbl.getValueAt(selectedRowIndex, 0).toString();
String frDep = transTbl.getValueAt(selectedRowIndex, 1).toString();
String frOwn = transTbl.getValueAt(selectedRowIndex, 2).toString();
String toID = toTbl.getValueAt(toTbl.getSelectedRow(), 2).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    if(toBranch.getText().equals("")||toBranch.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Branch, Department and Owner Fields cannot be empty!");
    }
    else{
    String sql ="UPDATE dbo.invPC SET Branch = '"+toBra+"', Dept = '"+toDep+"', Owner = '"+toOwn+"', Stat = 'FOR SHIPPING' WHERE ID = '"+frID+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Inv SET Branch = '"+toBra+"', Dept = '"+toDep+"', Owner = '"+toOwn+"', Status = 'FOR SHIPPING' WHERE Dev_ID = '"+frID+"'";         
    st.executeUpdate(sql2);
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transferred', 'PC', '"+frBra+"-"+frDep+"-"+frOwn+" TO "+toBra+"-"+toDep+"-"+toOwn+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
    String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+frBra+"','Transferred PC Unit', 'PC','"+frDep+"-"+frOwn+"','IT DEPARTMENT','"+frID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To "+toBra+"- "+toDep+"- "+toOwn+"')";
    st.execute(newsql4);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Ready for Transmittal', 'PC','"+toDep+"-"+toOwn+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql1);
     String newsql3 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Waiting for Action', 'PC','"+toDep+"-"+toOwn+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql3);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2; 
    rs2 = st.executeQuery(sql6);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
    String sql5 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+frID+"', 'PC Unit', 'N/A', 'FOR SHIPPING', "+id+" )";        
     st.executeUpdate(sql5);
    showRep();
JOptionPane.showMessageDialog(null,"Computer for Transmittal!");
Homepage hp = new Homepage();
hp.showRep();
    }
    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void transferPR() {
int selectedRowIndex = transTbl1.getSelectedRow();
String Man = unitPro4.getText();
String frID = transTbl1.getValueAt(selectedRowIndex, 4).toString();
String toBra = toBranch.getText();
String toDep = toDept.getText();
String toOwn = toOwner.getText();
String frBra = transTbl1.getValueAt(selectedRowIndex, 0).toString();
String frDep = transTbl1.getValueAt(selectedRowIndex, 1).toString();
String frOwn = transTbl1.getValueAt(selectedRowIndex, 3).toString();
String toID = toTbl.getValueAt(toTbl.getSelectedRow(), 2).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    if(toBranch.getText().equals("")||toBranch.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Branch, Department and Owner Fields cannot be empty!");
    }
    else{
    String sql ="UPDATE dbo.invPR SET Branch = '"+toBra+"', Dept = '"+toDep+"', Owner = '"+toOwn+"', Stat = 'FOR SHIPPING' WHERE ID = '"+frID+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Inv SET Branch = '"+toBra+"', Dept = '"+toDep+"', Owner = '"+toOwn+"', Status = 'FOR SHIPPING' WHERE Dev_ID = '"+frID+"'";         
    st.executeUpdate(sql2);
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transferred', 'PR', '"+frBra+"-"+frDep+"-"+frOwn+" TO "+toBra+"-"+toDep+"-"+toOwn+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
      String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+frBra+"','Transferred Printer', 'PR','"+frDep+"-"+frOwn+"','IT DEPARTMENT','"+frID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To "+toBra+"- "+toDep+"- "+toOwn+"')";
    st.execute(newsql4);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Ready for Transmittal', 'PR','"+toDep+"-"+toOwn+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql1);
     String newsql3 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Waiting for Action', 'PR','"+toDep+"-"+toOwn+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql3);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2; 
    rs2 = st.executeQuery(sql6);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
    String sql5 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+frID+"', 'Printer', 'N/A', 'FOR SHIPPING', "+id+" )";        
     st.executeUpdate(sql5);
    showRep();
JOptionPane.showMessageDialog(null,"Printer for Transmittal!");
Homepage hp = new Homepage();
hp.showRep();
    }
    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void transferPCUnit() {
int selectedRowIndex = transTbl.getSelectedRow();
String Nam = unitPro2.getText();
String Parts = transferSelect.getSelectedItem().toString();
String frID = transTbl.getValueAt(selectedRowIndex, 4).toString();
String toBra = toBranch.getText();
String toDep = toDept.getText();
String toOwn = toOwner.getText();
String frBra = transTbl.getValueAt(selectedRowIndex, 0).toString();
String frDep = transTbl.getValueAt(selectedRowIndex, 1).toString();
String frOwn = transTbl.getValueAt(selectedRowIndex, 2).toString();
String toID = toTbl.getValueAt(toTbl.getSelectedRow(), 4).toString();
String toNam=toTbl.getValueAt(toTbl.getSelectedRow(), 3).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
if(toBranch.getText().equals("")||toBranch.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Select where to send to!");
    }
else{
if(!toNam.equals("N/A")){
Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "The selected receiver already has "+Parts+". Continue and send it to reserve?", "Conflict",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    
     if(Parts.equals("Processor")){
    Parts1 = "Proce";
    }
    if(Parts.equals("Motherboard")){
    Parts1 = "MBoard";
    }
    if(Parts.equals("Harddrive")){
    Parts1 = "HDD";
    }
    if(Parts.equals("RAM")){
    Parts1 = "Ram ";
    }
    if(Parts.equals("Monitor")){
    Parts1 = "Moni";
    }
    if(Parts.equals("UPS")){
    Parts1 = "UPS";
    }
    if(Parts.equals("Mouse")){
    Parts1 = "Mouse";
    }
    if(Parts.equals("Keyboard")){
    Parts1 = "KeyB";
    }
    String newsql1 = "INSERT INTO dbo.Inv (Categ, Branch, Owner, Dept, Status) VALUES ('OT', 'ADMIN', 'IT RESERVE','IT','FOR SHIPPING')";
     st.execute(newsql1);
    String sql5 = "SELECT TOP 1 Dev_ID FROM dbo.Inv ORDER BY Dev_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql5);             
            if (rs2.next()) { 
             id = rs2.getInt("Dev_ID");   
            }
            
     String newsql = "INSERT INTO dbo.invOT (Branch, Dept, Owner,Categ, Device, Name, Qty, Rem, ID, Qlt, Stat) VALUES ('ADMIN', 'IT', 'IT RESERVE','OT','"+Parts+"', '"+toNam+"', 1, 'Transfered "+dt.format(date)+"', "+id+", 'USED', 'FOR SHIPPING' )";
     st.execute(newsql);
    String sql ="UPDATE dbo.invPC SET "+Parts1+" = 'FOR SHIPPING' WHERE ID = '"+toID+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.invPC SET "+Parts1+" = 'N/A' WHERE ID = '"+frID+"'";              
    st.executeUpdate(sql2);
   String newsql3 = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transferred', 'PC', '"+frBra+"-"+frDep+"-"+frOwn+"-"+Parts+" TO "+toBra+"-"+toDep+"-"+toOwn+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql3);
     String newsql35 = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Add to Reserve', 'PC', '"+Parts+" - "+toNam+" From "+toBra+"-"+toDep+"-"+toOwn+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql35);
    String newsql13 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+frBra+"','Transferred "+Parts+"', 'PC','"+Nam+"','IT DEPARTMENT','"+frID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To "+toBra+"- "+toDep+"- "+toOwn+"')";
    st.execute(newsql13);
    String newsql14 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Transferred  "+Parts+" to Reserve', 'PC','"+toNam+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To ADMIN- IT- IT RESERVE')";
    st.execute(newsql14);
     String newsql41 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('ADMIN','Waiting for Action', 'PC','"+Parts+" "+toNam+"','IT DEPARTMENT','"+id+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+toBra+"-"+toDep+"-"+toOwn+"')";
    st.execute(newsql41);
     String sql61 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs3; 
    rs3 = st.executeQuery(sql61);             
            if (rs3.next()) { 
             hisid = rs3.getInt("HIS_ID");   
            }
    String sql81 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+id+"', '"+Parts+"', '"+toNam+"', 'FOR SHIPPING', "+hisid+" )";        
     st.executeUpdate(sql81);
    
      String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Waiting for Action', 'PC','"+toDep+"-"+toOwn+"-"+Parts+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql4);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs31; 
    rs31 = st.executeQuery(sql6);             
            if (rs31.next()) { 
             hisid = rs31.getInt("HIS_ID");   
            }
    String sql8 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+toID+"', '"+Parts+"', '"+Nam+"', 'FOR SHIPPING', "+hisid+" )";        
     st.executeUpdate(sql8);
    showRep();
JOptionPane.showMessageDialog(null,""+Parts+" for Transmittal!");
    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
    if(n == JOptionPane.NO_OPTION){ }
    if(n == JOptionPane.CLOSED_OPTION){ }
}
else {
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    
     if(Parts.equals("Processor")){
    Parts1 = "Proce";
    }
    if(Parts.equals("Motherboard")){
    Parts1 = "MBoard";
    }
    if(Parts.equals("Harddrive")){
    Parts1 = "HDD";
    }
    if(Parts.equals("RAM")){
    Parts1 = "Ram ";
    }
    if(Parts.equals("Monitor")){
    Parts1 = "Moni";
    }
    if(Parts.equals("UPS")){
    Parts1 = "UPS";
    }
    if(Parts.equals("Mouse")){
    Parts1 = "Mouse";
    }
    if(Parts.equals("Keyboard")){
    Parts1 = "KeyB";
    }
    String sql ="UPDATE dbo.invPC SET "+Parts1+" = 'FOR SHIPPING' WHERE ID = '"+toID+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.invPC SET "+Parts1+" = 'N/A' WHERE ID = '"+frID+"'";              
    st.executeUpdate(sql2);
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Pending for Transmittal', 'PC', '"+frBra+"-"+frDep+"-"+frOwn+"-"+Parts+" TO "+toBra+"-"+toDep+"-"+toOwn+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+frBra+"','Transferred "+Parts+"', 'PC','"+Nam+"','IT DEPARTMENT','"+frID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To "+toBra+"- "+toDep+"- "+toOwn+"')";
    st.execute(newsql1);
    String newsql3 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Ready for Transmittal', 'PC','"+toDep+"-"+toOwn+"-"+Parts+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql3);
      String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Waiting for Action', 'PC','"+toDep+"-"+toOwn+"-"+Parts+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"- "+frDep+"- "+frOwn+"')";
    st.execute(newsql4);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2; 
    rs2 = st.executeQuery(sql6);             
            if (rs2.next()) { 
             id = rs2.getInt("HIS_ID");   
            }
    String sql5 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+toID+"', '"+Parts+"', '"+Nam+"', 'FOR SHIPPING', "+id+" )";        
     st.executeUpdate(sql5);
    showRep();
JOptionPane.showMessageDialog(null,""+Parts+" for Transmittal!");
Homepage hp = new Homepage();
hp.showRep();
    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}}}
public void transferCCUnit() {
int selectedRowIndex = transTbl2.getSelectedRow();
String Nam = unitPro5.getText();
String Parts = "HDD";
String frID = transTbl2.getValueAt(selectedRowIndex, 3).toString();
String toBra = toBranch.getText();
String frBra = transTbl2.getValueAt(selectedRowIndex, 0).toString();
String toID = toTbl.getValueAt(toTbl.getSelectedRow(), 3).toString();
String toNam=toTbl.getValueAt(toTbl.getSelectedRow(), 2).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
if(toBranch.getText().equals("")||toBranch.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Select where to send to!");
    }
else{
if(!toNam.equals("N/A")){
Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "The selected receiver already has "+Parts+". Continue and send it to reserve?", "Conflict",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    
    Parts1 = "HDD";
    String newsql1 = "INSERT INTO dbo.Inv (Categ, Branch, Owner, Dept, Status) VALUES ('OT', 'ADMIN', 'IT RESERVE','IT','FOR SHIPPING')";
     st.execute(newsql1);
    String sql5 = "SELECT TOP 1 Dev_ID FROM dbo.Inv ORDER BY Dev_ID DESC";         
    ResultSet rs2;
    rs2 = st.executeQuery(sql5);             
            if (rs2.next()) { 
             id = rs2.getInt("Dev_ID");   
            }
            
     String newsql = "INSERT INTO dbo.invOT (Branch, Dept, Owner,Categ, Device, Name, Qty, Rem, ID, Qlt, Stat) VALUES ('ADMIN', 'IT', 'IT RESERVE','OT','"+Parts+"', '"+toNam+"', 1, 'Transfered "+dt.format(date)+"', "+id+", 'USED', 'FOR SHIPPING' )";
     st.execute(newsql);
    String sql ="UPDATE dbo.invCC SET "+Parts1+" = 'FOR SHIPPING' WHERE ID = '"+toID+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.invCC SET "+Parts1+" = 'N/A' WHERE ID = '"+frID+"'";              
    st.executeUpdate(sql2);
   String newsql3 = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transferred', 'CC', '"+frBra+"-"+Parts+" TO "+toBra+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql3);
     String newsql35 = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Add to Reserve', 'CC', '"+Parts+" - "+toNam+" From "+toBra+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql35);
    String newsql13 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+frBra+"','Transferred "+Parts+"', 'CC','"+Nam+"','IT DEPARTMENT','"+frID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To "+toBra+"')";
    st.execute(newsql13);
    String newsql14 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Transferred  "+Parts+" to Reserve', 'CC','"+toNam+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To ADMIN- IT- IT RESERVE')";
    st.execute(newsql14);
     String newsql41 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('ADMIN','Waiting for Action', 'CC','"+Parts+" "+toNam+"','IT DEPARTMENT','"+id+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+toBra+"')";
    st.execute(newsql41);
     String sql61 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs3; 
    rs3 = st.executeQuery(sql61);             
            if (rs3.next()) { 
             hisid = rs3.getInt("HIS_ID");   
            }
    String sql81 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+id+"', '"+Parts+"', '"+toNam+"', 'FOR SHIPPING', "+hisid+" )";        
     st.executeUpdate(sql81);
    
      String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Waiting for Action', 'CC','"+Parts+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"')";
    st.execute(newsql4);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs31; 
    rs31 = st.executeQuery(sql6);             
            if (rs31.next()) { 
             hisid = rs31.getInt("HIS_ID");   
            }
    String sql8 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+toID+"', '"+Parts+"', '"+Nam+"', 'FOR SHIPPING', "+hisid+" )";        
     st.executeUpdate(sql8);
    showRep();
JOptionPane.showMessageDialog(null,"CCTV HDD for Transmittal!");

    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
    if(n == JOptionPane.NO_OPTION){ }
    if(n == JOptionPane.CLOSED_OPTION){ }
}
else {
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    
    Parts1 = "HDD";
    
    String sql ="UPDATE dbo.invCC SET "+Parts1+" = 'FOR SHIPPING' WHERE ID = '"+toID+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.invCC SET "+Parts1+" = 'N/A' WHERE ID = '"+frID+"'";              
    st.executeUpdate(sql2);
   String newsql3 = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Transferred', 'CC', '"+frBra+"-"+Parts+" TO "+toBra+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st.execute(newsql3);
    String newsql13 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+frBra+"','Transferred "+Parts+"', 'CC','"+Nam+"','IT DEPARTMENT','"+frID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'To "+toBra+"')";
    st.execute(newsql13);
      String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+toBra+"','Waiting for Action', 'CC','"+Parts+"','IT DEPARTMENT','"+toID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"', 0.00 ,'From "+frBra+"')";
    st.execute(newsql4);
    String sql6 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs31; 
    rs31 = st.executeQuery(sql6);             
            if (rs31.next()) { 
             hisid = rs31.getInt("HIS_ID");   
            }
    String sql8 ="INSERT INTO dbo.Ship (Dev_ID, Ship_Item, Ship_Name, Ship_Stat, Ship_ID) Values ('"+toID+"', '"+Parts+"', '"+Nam+"', 'FOR SHIPPING', "+hisid+" )";        
     st.executeUpdate(sql8);
    showRep();
JOptionPane.showMessageDialog(null,"CCTV HDD for Transmittal!");

    }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}}}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    
//MITS JUY 31------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void FilterHP( final JTable jTable,  final JTextField jtfFilter) {
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
}
public void FilterPCtr( final JTable jTable,  final JTextField jtfFilter) {
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
}
public void FilterCCtr( final JTable jTable,  final JTextField jtfFilter) {
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
}
public void FilterPRtr( final JTable jTable,  final JTextField jtfFilter) {
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
}
public void FilterBR( final JTable jTable,  final JTextField jtfFilter) {
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
}
public void FilterDP( final JTable jTable,  final JTextField jtfFilter) {
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
}

public void showBra(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT BRANCH as Branch, ADDRESS as Address,LOCATION as Location FROM dbo.Branch WHERE STAT = 'RUNNING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
brTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterBR(brTbl,brSearchtxt);
} 
public void brAdd(){
String s1 = branchName.getText();
String s2 = branchAdd.getText();
String s3 = branchLoc.getText();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);   
String sql1 ="INSERT INTO dbo.Branch VALUES ('"+s1+"','"+s2+"','"+s3+"','RUNNING')";         
st.execute(sql1);
 String sql ="INSERT INTO dbo.Logs VALUES ('Add Branch',' 'BR', "+s1+"','"+dt.format(date)+"','"+tm.format(time)+"')";         
st.execute(sql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void brSet(){
        int selectedRowIndex = brTbl.getSelectedRow();
        branchNameedit.setText(brTbl.getValueAt(selectedRowIndex,0).toString());
        branchAddedit.setText(brTbl.getValueAt(selectedRowIndex,1).toString());
        branchLocedit.setText(brTbl.getValueAt(selectedRowIndex,2).toString());
}
public void brEdit(){
       String s1 =  branchNameedit.getText();
       String s2 = branchAddedit.getText();
       String s3 = branchLocedit.getText();   
       try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
String sql ="UPDATE dbo.Branch SET BRANCH = '"+s1+"',ADDRESS = '"+s2+"',LOCATION = '"+s3+"' WHERE BRANCH = '"+s1+"'";         
st.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Information Updated!"); 

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'Branch','"+s1+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
       
}

public void showDep(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,ID FROM dbo.Departments ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
dpTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterDP(dpTbl,dpSearchtxt);
} 
public void dpAdd(){
String s1 = deptBranch.getSelectedItem().toString();
String s2 = deptName.getText();

try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);   
String sql1 ="INSERT INTO dbo.Departments VALUES ('"+s1+"','"+s2+"')";         
st.execute(sql1);
 String sql ="INSERT INTO dbo.Logs VALUES ('Add Department','DP','Branch "+s1+" - "+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";         
st.execute(sql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void dpSet(){
        int selectedRowIndex = dpTbl.getSelectedRow();
        deptNameedit.setText(brTbl.getValueAt(selectedRowIndex,1).toString());
        deptBranchedit.setSelectedItem(brTbl.getValueAt(selectedRowIndex,0).toString());
}
public void dpEdit(){
       int selectedRowIndex = dpTbl.getSelectedRow();
       String s1 =  deptNameedit.getText();
       String s2 = deptBranchedit.getSelectedItem().toString();   
       String ID = brTbl.getValueAt(selectedRowIndex,2).toString();
       try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
String sql ="UPDATE dbo.Departments SET Branch = '"+s2+"',Dept = '"+s1+"' WHERE BRANCH = '"+ID+"'";         
st.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Information Updated!"); 

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Updated Info', 'Branch','"+s1+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
       
}


public void showDepPur(){
unitDept.removeAllItems();
String Branch = reqBranch.getSelectedItem().toString();
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Dept FROM dbo.Departments WHERE Branch = '"+Branch+"' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
while(rs.next()){
String Dept = rs.getString("Dept");
unitDept.addItem(Dept);
}
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void showPurUnit(){   
{
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk,Moni as Monitor,KeyB as Keyboard, Mouse,UPS, ID FROM dbo.invPC ORDER by ID DESC";         
ResultSet rs=st.executeQuery(sql); 
unitTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPCtr(unitTbl,unitSearch);
}
}
public void showPurOT(){
    String Parts = unitSelect.getSelectedItem().toString();
    if(Parts.equals("Processor")){
    Parts1 = "Proce AS Processor";
    }
    if(Parts.equals("Motherboard")){
    Parts1 = "MBoard AS Motherboard";
    }
    if(Parts.equals("Harddrive")){
    Parts1 = "HDD AS Harddrive";
    }
    if(Parts.equals("RAM")){
    Parts1 = "Ram ";
    }
    if(Parts.equals("Monitor")){
    Parts1 = "Moni AS Monitor";
    }
    if(Parts.equals("UPS")){
    Parts1 = "UPS";
    }
    if(Parts.equals("Mouse")){
    Parts1 = "Mouse";
    }
    if(Parts.equals("Keyboard")){
    Parts1 = "KeyB AS Keyboard";
    }
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,"+Parts1+", ID FROM dbo.invPC WHERE "+Parts1+" != 'FOR SHIPPING' OR "+Parts1+" != 'FOR REPAIR' OR "+Parts1+" != 'N/A' ORDER by ID DESC";         
ResultSet rs=st.executeQuery(sql); 
othersTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterPCtr(othersTbl,othersSearch);
}  
public void showPurCC(){   
{
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,CNum as Quantity, Camera, DVR, HDD, uN as Username,pW as Password, ID FROM dbo.invCC WHERE Stat = 'WORKING' ORDER by ID DESC";         
ResultSet rs=st.executeQuery(sql); 
cctvTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPCtr(cctvTbl,cctvSearch);
}
}
public void showPurPR(){   
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept AS Department, Manu AS Manufacturer, Owner as Name, ID FROM dbo.invPR WHERE Stat = 'WORKING' ORDER by ID DESC";         
ResultSet rs=st.executeQuery(sql); 
printerTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterPCtr(printerTbl,printerSearch);
}
public void pcSetpr(){
        int selectedRowIndex = unitTbl.getSelectedRow();
        //compBran.setText(transTbl.getValueAt(selectedRowIndex,0).toString());
        //compDept.setText(transTbl.getValueAt(selectedRowIndex,1).toString());
        //compName.setText(transTbl.getValueAt(selectedRowIndex,2).toString());
        unitPro.setText(unitTbl.getValueAt(selectedRowIndex,3).toString());
        unitMot.setText(unitTbl.getValueAt(selectedRowIndex,4).toString());
        unitRam.setText(unitTbl.getValueAt(selectedRowIndex,5).toString());
        unitHar.setText(unitTbl.getValueAt(selectedRowIndex,6).toString());
        unitMon.setText(unitTbl.getValueAt(selectedRowIndex,7).toString());
        unitKey.setText(unitTbl.getValueAt(selectedRowIndex,8).toString());
        unitMou.setText(unitTbl.getValueAt(selectedRowIndex,9).toString());
        unitUPS.setText(unitTbl.getValueAt(selectedRowIndex,10).toString());

}
public void otSetpr(){
        int selectedRowIndex = othersTbl.getSelectedRow();
        othersField.setText(othersTbl.getValueAt(selectedRowIndex,3).toString());
}
public void ccSetpr(){
        int selectedRowIndex = cctvTbl.getSelectedRow();
        cctvField.setText(cctvTbl.getValueAt(selectedRowIndex,1).toString());
}
public void pcSortpr(){   
String Parts = unitSelect.getSelectedItem().toString();   
    if(Parts.equals("Unit")){
    showPurUnit();
    }
    else
    {
    if(Parts.equals("Processor")){
    Parts1 = "Proce AS Processor";
    }
    if(Parts.equals("Motherboard")){
    Parts1 = "MBoard AS Motherboard";
    }
    if(Parts.equals("Harddrive")){
    Parts1 = "HDD AS Harddrive";
    }
    if(Parts.equals("RAM")){
    Parts1 = "Ram ";
    }
    if(Parts.equals("Monitor")){
    Parts1 = "Moni AS Monitor";
    }
    if(Parts.equals("UPS")){
    Parts1 = "UPS";
    }
    if(Parts.equals("Mouse")){
    Parts1 = "Mouse";
    }
    if(Parts.equals("Keyboard")){
    Parts1 = "KeyB AS Keyboard";
    }
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,"+Parts1+", ID FROM dbo.invPC WHERE Stat = 'WORKING' ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
othersTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 FilterPCtr(othersTbl,othersSearch);   
}  
}
public void prSetpr(){
        int selectedRowIndex = printerTbl.getSelectedRow();
        printerField.setText(printerTbl.getValueAt(selectedRowIndex,2).toString());
}

public void cartAdd(){
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        String Branch = reqBranch.getSelectedItem().toString();
        String Department = unitDept.getSelectedItem().toString();
        String dType = unitSelect.getSelectedItem().toString();
    if(jCheckBox1.isSelected())
        {purName = "IT RESERVE";}
         {purName = reqOwn.getText();
        }
        String s8 = "N/A";
         if(purName.equals("")){
        JOptionPane.showMessageDialog(null,"Owner Field cannot be empty!");
    }
         else if(othersField.getText().equals("N/A")){JOptionPane.showMessageDialog(null,"Please select a device!");}
         else{
if(jRadioButton1.isSelected()){
if(dType.equals("Unit")){
        String s1 = unitPro.getText();
        String s2 = unitMot.getText();
        String s3 = unitRam.getText();
        String s4 = unitHar.getText();
        String s5 = unitMon.getText();
        String s6 = unitKey.getText();
        String s7 = unitMou.getText();
        String s9 = unitUPS.getText();
        String qty = unitQty.getValue().toString();
 try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement(); 
String sql10 = "INSERT INTO dbo.invTEMP(Branch,Dept,Owner,First,Second,Third,Fourth,Fifth,Sixth,Seventh,Eight,Ninth,Categ,Stat) VALUES ('"+Branch+"','"+Department+"','"+purName+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','PC','PENDING')";         
st.execute(sql10);

String sq20 = "SELECT TOP 1 ID FROM dbo.invTEMP ORDER BY ID DESC";         
ResultSet rs2;
rs2 = st.executeQuery(sq20);             
if (rs2.next()) { 
id = rs2.getInt("ID");   
}

String sql1 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Processor', '"+s1+"', '"+qty+"', 'PENDING')";         
st.execute(sql1);

String sql2 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Motherboard', '"+s2+"', '"+qty+"', 'PENDING')";         
st.execute(sql2);

String sql3 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Ram', '"+s3+"', '"+qty+"', 'PENDING')";         
st.execute(sql3);

String sql4 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Harddrive', '"+s4+"', '"+qty+"', 'PENDING')";         
st.execute(sql4);

String sql5 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Monitor', '"+s5+"', '"+qty+"', 'PENDING')";         
st.execute(sql5);

String sql6 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Keyboard', '"+s6+"', '"+qty+"', 'PENDING')";         
st.execute(sql6);

String sql7 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','Mouse', '"+s7+"', '"+qty+"', 'PENDING')";
st.execute(sql7);

String sql9 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"','UPS', '"+s9+"', '"+qty+"', 'PENDING')";         
st.execute(sql9);
//TEMPORARY INVENTORY
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 showCart();
}
else
{
String qty = othersQty.getValue().toString();
String item = othersField.getText();
 try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement(); 
String sql10 = "INSERT INTO dbo.invTEMP(Branch,Dept,Owner,First,Second,Third,Fourth,Fifth,Sixth,Seventh,Eight,Ninth,Categ,Stat) VALUES ('"+Branch+"','"+Department+"','"+purName+"','"+dType+"','"+item+"','"+qty+"','"+s8+"','NEW','"+s8+"','"+s8+"','"+s8+"','"+s8+"','OT','PENDING')";         
st.execute(sql10);

String sq20 = "SELECT TOP 1 ID FROM dbo.invTEMP ORDER BY ID DESC";         
ResultSet rs2;
rs2 = st.executeQuery(sq20);             
if (rs2.next()) { 
id = rs2.getInt("ID");   
}

String sql1 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"', '"+dType+"', '"+item+"', '"+qty+"', 'PENDING')";         
st.execute(sql1);
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
}
showCart();
}
}
if(jRadioButton2.isSelected()){
String qty = cctvQty.getValue().toString();
String item = cctvField.getText();
un = una.getText();
pw = pass.getText();
cn = cctvQty.getValue().toString();
 try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement(); 
String sql10 = "INSERT INTO dbo.invTEMP(Branch,Dept,Owner,First,Second,Third,Fourth,Fifth,Sixth,Seventh,Eight,Ninth,Categ,Stat) VALUES ('"+Branch+"','"+Department+"','"+purName+"','"+dType+"','"+item+"','"+qty+"','"+s8+"','NEW','"+s8+"','"+s8+"','"+s8+"','"+s8+"','CC','PENDING')";         
st.execute(sql10);

String sq20 = "SELECT TOP 1 ID FROM dbo.invTEMP ORDER BY ID DESC";         
ResultSet rs2;
rs2 = st.executeQuery(sq20);             
if (rs2.next()) { 
id = rs2.getInt("ID");   
}

String sql1 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"', '"+dType+"', '"+item+"', '"+qty+"', 'PENDING')";         
st.execute(sql1);
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
}
showCart();
}
if(jRadioButton3.isSelected()){
String qty = printerQty.getValue().toString();
String item = printerField.getText();
 try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement(); 
String sql10 = "INSERT INTO dbo.invTEMP(Branch,Dept,Owner,First,Second,Third,Fourth,Fifth,Sixth,Seventh,Eight,Ninth,Categ,Stat) VALUES ('"+Branch+"','"+Department+"','"+purName+"','"+dType+"','"+item+"','"+qty+"','"+s8+"','NEW','"+s8+"','"+s8+"','"+s8+"','"+s8+"','PR','PENDING')";         
st.execute(sql10);

String sq20 = "SELECT TOP 1 ID FROM dbo.invTEMP ORDER BY ID DESC";         
ResultSet rs2;
rs2 = st.executeQuery(sq20);             
if (rs2.next()) { 
id = rs2.getInt("ID");   
}

String sql1 ="INSERT INTO dbo.Cart (Cart_ID,Cart_Item, Cart_Name, Cart_Qty, Cart_Stat) Values ('"+id+"', '"+dType+"', '"+item+"', '"+qty+"', 'PENDING')";         
st.execute(sql1);
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
}
showCart();
}
         }
}
public void showCart(){
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Cart_ID,Cart_Item,Cart_Name,Cart_Qty FROM dbo.Cart";         
ResultSet rs=st.executeQuery(sql); 
Cart.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void cartDel(){
        int selectedRowIndex = Cart.getSelectedRow();
        String cartID = Cart.getValueAt(selectedRowIndex,0).toString();
        String cType = Cart.getValueAt(selectedRowIndex,1).toString();
        try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st12=con.createStatement();        
String sql ="SELECT * FROM dbo.invTEMP WHERE ID = '"+cartID+"'"; 
rs1=st12.executeQuery(sql); 
if(rs1.next()){
Categ = rs1.getString("Categ");
}
        }
catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLExceptionSelect: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
if(Categ.equals("PC")){    
    if(cType.equals("Processor")){
    cName = "First";
    }
    if(cType.equals("Motherboard")){
    cName = "Second";
    }
    if(cType.equals("Ram")){
    cName = "Third";
    }
    if(cType.equals("Harddrive")){
    cName = "Fourth";
    }
    if(cType.equals("Monitor")){
    cName = "Fifth";
    }
    if(cType.equals("Keyboard")){
    cName = "Sixth";
    }
    if(cType.equals("Mouse")){
    cName = "Seventh";
    }
    if(cType.equals("UPS")){
    cName = "Ninth";
    }
Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
if(n == JOptionPane.OK_OPTION){ 
    try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invTEMP SET "+cName+" = 'N/A' WHERE ID = '"+cartID+"'"; 
st1.execute(sql);
 String sql1 ="DELETE FROM dbo.Cart WHERE Cart_Item= '"+cType+"' AND Cart_ID = '"+cartID+"'"; 
st1.execute(sql1);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLExceptionUpDel: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Item Removed!"); 
}
}
else{
Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
if(n == JOptionPane.OK_OPTION){ 
    try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="DELETE FROM dbo.invTEMP WHERE ID = '"+cartID+"'"; 
st1.execute(sql);
 String sql1 ="DELETE FROM dbo.Cart WHERE Cart_Item= '"+cType+"' AND Cart_ID = '"+cartID+"'"; 
st1.execute(sql1);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLExceptionUpDel: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Item Removed!"); 
}
}
showCart();
}
public void itemPurchase(){
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        String Branch = reqBranch.getSelectedItem().toString();
        String Department = unitDept.getSelectedItem().toString();
        String dType = unitSelect.getSelectedItem().toString();
        String Price = unitKey2.getText();
        if(jCheckBox1.isSelected())
        {purName = "IT RESERVE";}
        else
        {purName = reqOwn.getText();}
        String s8 = "N/A";
         if(purName.equals("")){
        JOptionPane.showMessageDialog(null,"Owner Field cannot be empty!");
    }
         else{
if(unitKey2.equals("")){
        JOptionPane.showMessageDialog(null,"Price Field cannot be empty!");
    }
else{
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st12=con.createStatement();        
String sql ="SELECT TOP 1 ID FROM dbo.invTEMP ORDER BY ID DESC "; 
rs1=st12.executeQuery(sql); 
if(rs1.next()){
cnt = rs1.getInt("ID");
}

for(int x = 1;x<=cnt;x++){
String sql1 ="SELECT Categ FROM dbo.invTEMP WHERE ID = '"+x+"'"; 
rs=st12.executeQuery(sql1); 
if(rs.next()){
Categ = rs.getString("Categ");
}

if(Categ.equals("PC")){
    String sql14 ="SELECT * FROM dbo.invTEMP,dbo.Cart WHERE ID = '"+x+"' AND Cart_ID = '"+x+"'"; 
    rs=st12.executeQuery(sql14); 
    if(rs.next()){
    br = rs.getString("Branch");
    dp = rs.getString("Dept");
    ow = rs.getString("Owner");
    pr = rs.getString("First");
    mb = rs.getString("Second");
    rm = rs.getString("Third");
    hd = rs.getString("Fourth");
    up = rs.getString("Fifth");
    kb = rs.getString("Sixth");
    ms = rs.getString("Seventh");
    re = rs.getString("Eight");
    mn = rs.getString("Ninth");
    ty = rs.getString("Cart_Item");
    na = rs.getString("Cart_Name");
    //JOptionPane.showMessageDialog(null,Categ+br+dp+ow+pr+mb+rm+hd+up+kb+ms+re+mn+ty+na); 
    }
    String sql43 ="INSERT INTO dbo.Inv(Categ,Branch,Owner,Dept,Status) VALUES ('"+Categ+"','"+br+"','"+ow+"','"+dp+"','PENDING')";        
    st12.execute(sql43);
    
    String sql45 = "SELECT TOP 1 Dev_ID FROM dbo.Inv ORDER BY Dev_ID DESC";         
    ResultSet rs3;
    rs3 = st12.executeQuery(sql45);             
    if (rs3.next()) { 
    dID = rs3.getInt("Dev_ID");   
    }
    String sql46 ="INSERT INTO dbo.invPC(Branch,Dept,Owner,Proce,MBoard,Ram,HDD,UPS,KeyB,Mouse,Rem,Moni,ID,Categ,Stat) VALUES ('"+br+"','"+dp+"','"+ow+"','"+pr+"','"+mb+"','"+rm+"','"+hd+"','"+up+"','"+kb+"','"+ms+"','"+rm+"','"+mn+"','"+dID+"','PC','PENDING')";        
    st12.execute(sql46);
    
    
    String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Item Requested', '"+Categ+"', '"+br+"-"+dp+"-"+ow+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st12.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+br+"','Requested', '"+Categ+"','"+dp+"-"+ow+"','IT DEPARTMENT','"+dID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','"+Price+"','Device Requested')";
    st12.execute(newsql1);
     String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+br+"','Waiting for Item', '"+Categ+"','"+dp+"-"+ow+"','IT DEPARTMENT','"+dID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','"+Price+"','Device Requested')";
    st12.execute(newsql4);
    
    String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2;
    rs2 = st12.executeQuery(sql4);             
    if (rs2.next()) { 
    tempid = rs2.getInt("HIS_ID");   
    }
    String sql44="INSERT INTO dbo.Pur(Dev_ID, Pur_Item, Pur_Name, Pur_Stat, Pur_ID) Values ('"+dID+"', 'Unit', 'N/A', 'PENDING', '"+tempid+"' )";         
     st12.execute(sql44);

     JOptionPane.showMessageDialog(null,"Item Requested!");
}
else
{
 String sql14 ="SELECT * FROM dbo.invTEMP,dbo.Cart WHERE ID = '"+x+"' AND Cart_ID = '"+x+"'"; 
    rs=st12.executeQuery(sql14); 
    if(rs.next()){
    br = rs.getString("Branch");
    dp = rs.getString("Dept");
    ow = rs.getString("Owner");
    pr = rs.getString("First");
    mb = rs.getString("Second");
    rm = rs.getString("Third");
    hd = rs.getString("Fourth");
    up = rs.getString("Fifth");
    kb = rs.getString("Sixth");
    ms = rs.getString("Seventh");
    re = rs.getString("Eight");
    mn = rs.getString("Ninth");
    ty = rs.getString("Cart_Item");
    na = rs.getString("Cart_Name");
    }
    String sql43 ="INSERT INTO dbo.Inv(Categ,Branch,Owner,Dept,Status) VALUES ('"+Categ+"','"+br+"','"+ow+"','"+dp+"','PENDING')";        
    st12.executeUpdate(sql43);
    
    String sql45 = "SELECT TOP 1 Dev_ID FROM dbo.Inv ORDER BY Dev_ID DESC";         
    ResultSet rs3;
    rs3 = st12.executeQuery(sql45);             
    if (rs3.next()) { 
    dID = rs3.getInt("Dev_ID");   
    }
    
    if(Categ.equals("OT")){
    word = "INSERT INTO dbo.invOT(Branch,Dept,Owner,Categ,Device,Name,Qty,Rem,ID,Qlt,Stat) VALUES ('"+br+"','"+dp+"','"+ow+"','"+Categ+"','"+ty+"','"+na+"','N/A','"+dID+"','NEW','PENDING')";
    }
    if(Categ.equals("PR")){
    word = "INSERT INTO dbo.invPR(Branch,ManuOwner,Dept,Rem,ID,Stat,Categ) VALUES ('"+br+"','"+na+"','"+dp+"','"+ow+"','N/A','"+dID+"','PENDING','"+Categ+"')";
    }    
    if(Categ.equals("CC")){
    word = "INSERT INTO dbo.invCC(Branch,SP,Cnum,Camera,DVR,HDD,uN,pW,ID,Stat,Categ) VALUES ('"+br+"','"+na+"','"+cn+"','WORKING','N/A','N/A','"+una+"','"+pass+"','N/A','"+dID+"','PENDING','"+Categ+"')";
    }
    st12.executeUpdate(word);
   
     String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Item Requested', 'PC', '"+br+"-"+dp+"-"+ow+"','"+dt.format(date)+"','"+tm.format(time)+"')";
    st12.execute(newsql);
    String newsql1 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+br+"','Requested', 'PC','"+dp+"-"+ow+"','IT DEPARTMENT','"+dID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','"+Price+"','Unit Requested')";
    st12.execute(newsql1);
     String newsql4 = "INSERT INTO dbo.History (Branch,Action,Categ,Name,Perf,ITEM_ID,SDate,EDate,STime,ETime,Price,Remarks) VALUES ('"+br+"','Waiting for Item', 'PC','"+dp+"-"+ow+"','IT DEPARTMENT','"+dID+"','"+dt.format(date)+"','"+dt.format(date)+"','"+tm.format(time)+"','"+tm.format(time)+"','"+Price+"','Unit Requested')";
    st12.execute(newsql4);
    
    String sql4 = "SELECT TOP 1 HIS_ID FROM dbo.History ORDER BY HIS_ID DESC";         
    ResultSet rs2;
    rs2 = st12.executeQuery(sql4);             
    if (rs2.next()) { 
    tempid = rs2.getInt("HIS_ID");   
    }
    String sql44="INSERT INTO dbo.Pur(Dev_ID, Pur_Item, Pur_Name, Pur_Stat, Pur_ID) Values ('"+dID+"', '"+ty+"', 'N/A', 'PENDING', '"+tempid+"' )";         
     st12.executeUpdate(sql44);

     JOptionPane.showMessageDialog(null,"Item Requested!");
}
try{
    String newsql = "DELETE FROM dbo.invTEMP WHERE ID = '"+x+"'";
    st12.execute(newsql);
}
catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLExceptionSelect: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 } 
}
        }
catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLExceptionSelect: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 } 
  try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "TRUNCATE TABLE dbo.Cart";         
st.execute(sql);
sql1 = "TRUNCATE TABLE dbo.invTEMP";         
st.execute(sql1);
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
}
}

public void purReceiv() {
int selectedRowIndex = reqTbl.getSelectedRow();
String Categ = reqTbl.getValueAt(selectedRowIndex,0).toString();
String Bra = reqTbl.getValueAt(selectedRowIndex,1).toString();
String Dep = reqTbl.getValueAt(selectedRowIndex,2).toString();
String Own = reqTbl.getValueAt(selectedRowIndex,3).toString();
String Ite = reqTbl.getValueAt(selectedRowIndex,4).toString();
String Nam = reqTbl.getValueAt(selectedRowIndex,5).toString();
String Dev = reqTbl.getValueAt(selectedRowIndex,6).toString();
String His= reqTbl.getValueAt(selectedRowIndex,7).toString();
DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
DateFormat tm = new SimpleDateFormat("HH:mm:ss");
Date time = new Date();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");  
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
if (Categ.equals("PC")){        
    if(Ite.equals("Unit")){
    String sql ="UPDATE dbo.invPC SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Pur SET Pur_Stat = 'RECEIVED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',Action = 'Received',Remarks = 'Device Received' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    
    }
    else {
    String sel = Ite; 
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
    String sql ="UPDATE dbo.invOT SET "+item+" = '"+Nam+"' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Pur SET Pur_Stat = 'RECEIVED' WHERE Ship_ID = '"+His+"'";         
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Received' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    }
 }

else if (Categ.equals("CC")){        
    if(Ite.equals("CCTV")){
     String sql ="UPDATE dbo.invCC SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Pur SET Pur_Stat = 'RECEIVED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    showRep();
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Received' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    }
    else {
    String sel = Ite; 
    if (sel.equals("Camera")){
        item = "Cnum";
    }
     else if (sel.equals("HDD")){
        item = "HDD";
    }
     else if (sel.equals("DVR")){
        item = "DVR";
    }
    
    String sql ="UPDATE dbo.invCC SET "+item+" = '"+Nam+"' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Ship SET Pur_Stat = 'RECEIVED' WHERE Dev_ID = '"+Dev+"' AND Ship_Item = '"+Ite+"' AND Ship_ID = '"+His+"'";      
    st.executeUpdate(sql2);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Received' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
    }
 }

else if (Categ.equals("PR")){        
    String sql ="UPDATE dbo.invPR SET Stat = 'WORKING' WHERE ID = '"+Dev+"'";         
    st.executeUpdate(sql);
    String sql2 ="UPDATE dbo.Rep SET Pur_Stat = 'RECEIVED' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql2);
    String sql3="UPDATE dbo.Inv SET Status = 'WORKING' WHERE Dev_ID = '"+Dev+"'";         
    st.executeUpdate(sql3);
    String sql4 ="UPDATE dbo.History SET EDate= CONVERT(date,'"+dt.format(date)+"',126), ETime= '"+tm.format(time)+"',  Action= 'Received' WHERE HIS_ID  = '"+His+"'";         
     st.executeUpdate(sql4);
    showRep();
}

Statement sta = con.createStatement();
String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Received', '"+Categ+"', '"+Bra+"-"+Dep+"-"+Own+"-"+Ite+"','"+dt.format(date)+"','"+tm.format(time)+"')";
sta.execute(newsql);
JOptionPane.showMessageDialog(null,"Device Received!");
Homepage hp = new Homepage();
hp.showRep();
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
//OLD REVISED
public void initBranch(){
try { 
Connection con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
Statement st1=con1.createStatement();         
String sql1 = "SELECT BRANCH FROM dbo.Branch WHERE STAT = 'RUNNING' ";         
rs1=st1.executeQuery(sql1);
while(rs1.next()){
String Branch = rs1.getString("BRANCH");
pcSort.addItem(Branch);
ccSort.addItem(Branch);
prSort.addItem(Branch);
pcBR.addItem(Branch);
ccBR.addItem(Branch);
prBR.addItem(Branch);
transBR.addItem(Branch);
deptBranch.addItem(Branch);
reqBranch.addItem(Branch);

      }
     }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLOpt22 : " + ex.getSQLState()); 
 }
}

public void printReport() throws JRException, FileNotFoundException{
//MessageFormat header = new MessageFormat("New Nemar Development Corporation");
//MessageFormat footer = new MessageFormat("try lang");
    try{
//shipTbl.print(JTable.PrintMode.NORMAL,header,footer);

    
    
    
InputStream in = new FileInputStream(new File ("C:\\Users\\CSC-MITS\\Documents\\NetBeansProjects\\NewNemar\\src\\reports\\Inventory.jrxml"));
JasperDesign jd=JRXmlLoader.load(in);
String sql= "select * from invPC where Stat = 'WORKING'";
JRDesignQuery newQuery = new JRDesignQuery();
newQuery.setText(sql);
jd.setQuery(newQuery);
JasperReport jr = JasperCompileManager.compileReport(jd);
HashMap para = new HashMap();
JasperPrint j = JasperFillManager.fillReport(jr,para,con);
JasperViewer.viewReport(j, false);
OutputStream os = new FileOutputStream(new File("C:\\Users\\CSC-MITS\\Documents\\NetBeansProjects\\NewNemar\\src\\reports\\Inventory.jrxml"));
JasperExportManager.exportReportToPdfStream(j,os);
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}

}
}