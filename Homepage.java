import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class Homepage extends javax.swing.JFrame {
public Connection con;
public PreparedStatement st, st1, st2,sta;
public ResultSet rs, rs1, rs2; 
public static String z;

    public Homepage() {
        initComponents();
        initiate();
    }
    
    public void initiate() {
    //initialize
    initBranch();
    initEdit();
    setIcon();
    showDate();
    showTime();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height*12/25-this.getSize().height/2);

    
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
        INVmaincard = new javax.swing.JPanel();
        PC = new javax.swing.JButton();
        CC = new javax.swing.JButton();
        PR = new javax.swing.JButton();
        PR1 = new javax.swing.JButton();
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
        jLabel70 = new javax.swing.JLabel();
        countHis3 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        countCC = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        ccTransfer = new javax.swing.JButton();
        ccEdit = new javax.swing.JButton();
        ccUpdate = new javax.swing.JButton();
        PRcard = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        prSearchtxt = new javax.swing.JTextField();
        prSort = new javax.swing.JComboBox();
        PRadd = new javax.swing.JButton();
        PRdel = new javax.swing.JButton();
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
        ccTransfer1 = new javax.swing.JButton();
        prUpdate = new javax.swing.JButton();
        prEdit = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        hisTbl3 = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        prTbl = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        countHis2 = new javax.swing.JLabel();
        OTcard = new javax.swing.JPanel();
        PCtable1 = new javax.swing.JScrollPane();
        compTbl1 = new javax.swing.JTable();
        pcSort1 = new javax.swing.JComboBox();
        pcSearchtxt1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
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
        Printer = new javax.swing.JPanel();
        printerSearch = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        printerTbl = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        printerField = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        printerQty = new javax.swing.JSpinner();
        printerAdd = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        unitSelect = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Cart = new javax.swing.JTable();
        reqRemove = new javax.swing.JButton();
        reqCheckout = new javax.swing.JButton();
        reqCancel = new javax.swing.JButton();
        HISmaincard = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        allHisTbl = new javax.swing.JTable();
        HISrepair = new javax.swing.JButton();
        HISreplace = new javax.swing.JButton();
        HISdispose = new javax.swing.JButton();
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
        AddHistory = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
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
        jPanel18 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        INV = new javax.swing.JButton();
        HIS = new javax.swing.JButton();
        LOG = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        INV1 = new javax.swing.JButton();
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
        jScrollPane8.setViewportView(reqTbl);

        repDone.setBackground(new java.awt.Color(255, 255, 255));
        repDone.setText("Done");

        repAdd.setBackground(new java.awt.Color(255, 255, 255));
        repAdd.setText("Add");
        repAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repAddActionPerformed(evt);
            }
        });

        repSearch.setText("jTextField1");

        shipSearch.setText("jTextField1");

        shipDone.setBackground(new java.awt.Color(255, 255, 255));
        shipDone.setText("Delivered");

        shipAdd.setBackground(new java.awt.Color(255, 255, 255));
        shipAdd.setText("Ship");

        reqSearch.setText("jTextField1");

        reqDone.setBackground(new java.awt.Color(255, 255, 255));
        reqDone.setText("Received");

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
        jLabel10.setText("Devices to Ship");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 13, 129));
        jLabel11.setText("Purchases");

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
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(751, Short.MAX_VALUE))
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

        PR1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PR1.setForeground(new java.awt.Color(0, 51, 51));
        PR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2others.jpg"))); // NOI18N
        PR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PR1ActionPerformed(evt);
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
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Computer Information");

        pcSearchtxt.setForeground(new java.awt.Color(51, 51, 51));

        pcSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        pcSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcSortActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Computer History");

        jLabel47.setText("Computer/s Found:");

        countPC.setBackground(new java.awt.Color(255, 255, 255));
        countPC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);

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
        });
        PCtable.setViewportView(compTbl);

        jLabel46.setText("History Found:");

        countHis.setBackground(new java.awt.Color(255, 255, 255));
        countHis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pcDel.setBackground(new java.awt.Color(255, 255, 255));
        pcDel.setForeground(new java.awt.Color(0, 0, 103));
        pcDel.setText("Dispose");

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

        javax.swing.GroupLayout PCcardLayout = new javax.swing.GroupLayout(PCcard);
        PCcard.setLayout(PCcardLayout);
        PCcardLayout.setHorizontalGroup(
            PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCcardLayout.createSequentialGroup()
                        .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(PCinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pcDel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PCcardLayout.createSequentialGroup()
                                .addComponent(pcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pcEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PCcardLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel42)
                                .addGap(575, 575, 575)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countHis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCcardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PCcardLayout.createSequentialGroup()
                            .addComponent(pcSort, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pcSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1000, 1000, 1000)
                            .addComponent(jLabel47)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(countPC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcEdit)
                            .addComponent(pcUpdate))
                        .addGap(18, 18, 18)
                        .addComponent(pcTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pcDel)))
                .addGap(27, 27, 27)
                .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pcSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pcSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(countPC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        jScrollPane17.setViewportView(ccTbl);

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("CCTV Information");

        ccSearchtxt.setForeground(new java.awt.Color(51, 51, 51));

        ccSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));

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
        ccDel.setText("Dispose");

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
        ccSupp.setFont(new java.awt.Font("AcadEref", 0, 16)); // NOI18N
        ccSupp.setForeground(new java.awt.Color(102, 102, 102));
        ccSupp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccSupp.setPreferredSize(new java.awt.Dimension(6, 26));

        ccBran.setEditable(false);
        ccBran.setFont(new java.awt.Font("AcadEref", 0, 16)); // NOI18N
        ccBran.setForeground(new java.awt.Color(102, 102, 102));
        ccBran.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccBran.setPreferredSize(new java.awt.Dimension(6, 26));

        ccUN.setEditable(false);
        ccUN.setFont(new java.awt.Font("AcadEref", 0, 16)); // NOI18N
        ccUN.setForeground(new java.awt.Color(102, 102, 102));
        ccUN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccUN.setPreferredSize(new java.awt.Dimension(6, 26));

        ccPW.setEditable(false);
        ccPW.setFont(new java.awt.Font("AcadEref", 0, 16)); // NOI18N
        ccPW.setForeground(new java.awt.Color(102, 102, 102));
        ccPW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccPW.setPreferredSize(new java.awt.Dimension(6, 26));

        ccNum.setEditable(false);
        ccNum.setFont(new java.awt.Font("AcadEref", 0, 16)); // NOI18N
        ccNum.setForeground(new java.awt.Color(102, 102, 102));
        ccNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccNum.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 51));
        jLabel74.setText("Remarks:");

        ccRem.setEditable(false);
        ccRem.setColumns(20);
        ccRem.setRows(5);
        jScrollPane1.setViewportView(ccRem);

        javax.swing.GroupLayout CCinfoLayout = new javax.swing.GroupLayout(CCinfo);
        CCinfo.setLayout(CCinfoLayout);
        CCinfoLayout.setHorizontalGroup(
            CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CCinfoLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel73)
                        .addGroup(CCinfoLayout.createSequentialGroup()
                            .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71)
                                .addComponent(jLabel72))
                            .addGap(18, 18, 18)
                            .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ccPW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ccUN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(ccNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CCinfoLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(42, 42, 42)
                                .addComponent(ccBran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CCinfoLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(ccSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(CCinfoLayout.createSequentialGroup()
                            .addComponent(jLabel74)
                            .addGap(354, 354, 354))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        CCinfoLayout.setVerticalGroup(
            CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCinfoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(CCinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(ccBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel73)
                    .addComponent(ccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 51));
        jLabel70.setText("CCTV History");

        countHis3.setBackground(new java.awt.Color(255, 255, 255));
        countHis3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel76.setText("History Found:");

        jLabel77.setText("CCTV/s Found:");

        countCC.setBackground(new java.awt.Color(255, 255, 255));
        countCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);

        ccTransfer.setBackground(new java.awt.Color(255, 255, 255));
        ccTransfer.setForeground(new java.awt.Color(0, 0, 102));
        ccTransfer.setText("Transfer");

        ccEdit.setBackground(new java.awt.Color(255, 255, 255));
        ccEdit.setForeground(new java.awt.Color(0, 0, 102));
        ccEdit.setText("Edit");

        ccUpdate.setBackground(new java.awt.Color(255, 255, 255));
        ccUpdate.setForeground(new java.awt.Color(0, 0, 102));
        ccUpdate.setText("Update");

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
                                    .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ccDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ccTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                    .addGroup(CCcardLayout.createSequentialGroup()
                                        .addComponent(ccUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ccEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CCcardLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CCcardLayout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel76)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(countHis3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CCcardLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel68)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1608, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CCcardLayout.setVerticalGroup(
            CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCcardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CCcardLayout.createSequentialGroup()
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccEdit)
                            .addComponent(ccUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ccTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ccDel))
                    .addGroup(CCcardLayout.createSequentialGroup()
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(countHis3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel68)
                                .addComponent(jLabel70)))
                        .addGap(7, 7, 7)
                        .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(CCinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ccSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ccSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countCC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CCcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        jLabel86.setForeground(new java.awt.Color(51, 51, 51));
        jLabel86.setText("Printer Information");

        prSearchtxt.setForeground(new java.awt.Color(51, 51, 51));

        prSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));

        PRadd.setBackground(new java.awt.Color(255, 255, 255));
        PRadd.setForeground(new java.awt.Color(0, 0, 102));
        PRadd.setText("Add");
        PRadd.setMaximumSize(new java.awt.Dimension(103, 26));
        PRadd.setMinimumSize(new java.awt.Dimension(103, 26));

        PRdel.setBackground(new java.awt.Color(255, 255, 255));
        PRdel.setForeground(new java.awt.Color(0, 0, 102));
        PRdel.setText("Delete");
        PRdel.setMaximumSize(new java.awt.Dimension(103, 26));
        PRdel.setMinimumSize(new java.awt.Dimension(103, 26));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 51, 51));
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
        prDept.setFont(new java.awt.Font("AcadEref", 0, 15)); // NOI18N
        prDept.setForeground(new java.awt.Color(102, 102, 102));
        prDept.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prBran.setEditable(false);
        prBran.setFont(new java.awt.Font("AcadEref", 0, 15)); // NOI18N
        prBran.setForeground(new java.awt.Color(102, 102, 102));
        prBran.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prName.setEditable(false);
        prName.setFont(new java.awt.Font("AcadEref", 0, 15)); // NOI18N
        prName.setForeground(new java.awt.Color(102, 102, 102));
        prName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prManu.setEditable(false);
        prManu.setFont(new java.awt.Font("AcadEref", 0, 15)); // NOI18N
        prManu.setForeground(new java.awt.Color(102, 102, 102));
        prManu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("Remarks:");

        prRem.setEditable(false);
        prRem.setColumns(20);
        prRem.setRows(5);
        jScrollPane16.setViewportView(prRem);

        javax.swing.GroupLayout PRinfoLayout = new javax.swing.GroupLayout(PRinfo);
        PRinfo.setLayout(PRinfoLayout);
        PRinfoLayout.setHorizontalGroup(
            PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRinfoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PRinfoLayout.createSequentialGroup()
                        .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel78))
                        .addGap(25, 25, 25)
                        .addGroup(PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prBran, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(prDept)))
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
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        PRinfoLayout.setVerticalGroup(
            PRinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRinfoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
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
                .addGap(41, 41, 41))
        );

        jLabel89.setText("Printer/s found:");

        countPR.setBackground(new java.awt.Color(255, 255, 255));
        countPR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);

        ccTransfer1.setBackground(new java.awt.Color(255, 255, 255));
        ccTransfer1.setForeground(new java.awt.Color(0, 0, 102));
        ccTransfer1.setText("Transfer");
        ccTransfer1.setMaximumSize(new java.awt.Dimension(103, 26));
        ccTransfer1.setMinimumSize(new java.awt.Dimension(103, 26));

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
        jScrollPane27.setViewportView(prTbl);

        jLabel48.setText("History Found:");

        countHis2.setBackground(new java.awt.Color(255, 255, 255));
        countHis2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PRcardLayout = new javax.swing.GroupLayout(PRcard);
        PRcard.setLayout(PRcardLayout);
        PRcardLayout.setHorizontalGroup(
            PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRcardLayout.createSequentialGroup()
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRcardLayout.createSequentialGroup()
                                .addComponent(PRinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PRdel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ccTransfer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PRadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRcardLayout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(countHis2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PRcardLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PRcardLayout.createSequentialGroup()
                                .addComponent(prSort, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prSearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PRcardLayout.createSequentialGroup()
                        .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PRcardLayout.createSequentialGroup()
                                .addComponent(jLabel89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countPR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PRcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 1607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PRcardLayout.createSequentialGroup()
                                    .addComponent(jLabel86)
                                    .addGap(455, 455, 455)
                                    .addComponent(jLabel88))))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addComponent(prUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ccTransfer1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PRdel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PRadd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        compTbl1.setModel(new javax.swing.table.DefaultTableModel(
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
        compTbl1.setSelectionBackground(new java.awt.Color(0, 0, 102));
        PCtable1.setViewportView(compTbl1);

        pcSort1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "Processor", "Motherboard", "RAM", "Harddisk", "Monitor", "UPS", "Keyboard-Mouse" }));

        pcSearchtxt1.setForeground(new java.awt.Color(51, 51, 51));

        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(51, 51, 51));
        jLabel93.setText("Other Devices");

        javax.swing.GroupLayout OTcardLayout = new javax.swing.GroupLayout(OTcard);
        OTcard.setLayout(OTcardLayout);
        OTcardLayout.setHorizontalGroup(
            OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OTcardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addGroup(OTcardLayout.createSequentialGroup()
                        .addComponent(pcSort1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcSearchtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PCtable1, javax.swing.GroupLayout.PREFERRED_SIZE, 1607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        OTcardLayout.setVerticalGroup(
            OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OTcardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OTcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pcSort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pcSearchtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PCtable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        INVcard.add(OTcard, "card5");

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
            .addComponent(INVcard, javax.swing.GroupLayout.DEFAULT_SIZE, 1815, Short.MAX_VALUE)
        );
        INVmaincardLayout.setVerticalGroup(
            INVmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INVmaincardLayout.createSequentialGroup()
                .addGroup(INVmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PR1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(INVcard, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE))
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

        reqBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1a.setText("Branch:");

        jLabel8a.setText("Department:");

        unitDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel19.setLayout(new java.awt.CardLayout());

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

        unitSearch.setText("Search");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Keyboard-Mouse:");

        unitKey.setForeground(new java.awt.Color(102, 102, 102));
        unitKey.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Quantity:");

        unitQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        unitAdd.setBackground(new java.awt.Color(255, 255, 255));
        unitAdd.setText("Add to Cart");

        javax.swing.GroupLayout UnitLayout = new javax.swing.GroupLayout(Unit);
        Unit.setLayout(UnitLayout);
        UnitLayout.setHorizontalGroup(
            UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnitLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UnitLayout.createSequentialGroup()
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
                                        .addComponent(unitMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel50))
                                .addGap(38, 38, 38)
                                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(UnitLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(unitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(unitAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(UnitLayout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(unitKey))
                                    .addGroup(UnitLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(18, 18, 18)
                                        .addComponent(unitRam))
                                    .addGroup(UnitLayout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(unitUPS, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addComponent(unitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        UnitLayout.setVerticalGroup(
            UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(16, 16, 16)
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UnitLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel36))
                            .addComponent(unitMot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(UnitLayout.createSequentialGroup()
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitUPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addGap(16, 16, 16)
                        .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(unitRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(unitHar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)))
                .addGap(18, 18, 18)
                .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addGroup(UnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unitMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(unitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unitAdd)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel19.add(Unit, "card2");

        othersSearch.setText("Search");

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
        jScrollPane11.setViewportView(othersTbl);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Device:");

        othersField.setForeground(new java.awt.Color(102, 102, 102));
        othersField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        othersQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setText("Quantity:");

        othersAdd.setBackground(new java.awt.Color(255, 255, 255));
        othersAdd.setText("Add to Cart");

        javax.swing.GroupLayout OthersLayout = new javax.swing.GroupLayout(Others);
        Others.setLayout(OthersLayout);
        OthersLayout.setHorizontalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OthersLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(24, 24, 24)
                        .addComponent(othersField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(othersQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(othersAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OthersLayout.createSequentialGroup()
                        .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(othersSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(41, 41, 41))
        );
        OthersLayout.setVerticalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(othersSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(othersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel51)
                    .addComponent(othersQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(othersAdd))
                .addGap(69, 69, 69))
        );

        jPanel19.add(Others, "card3");

        cctvSearch.setText("Search");

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
        jScrollPane12.setViewportView(cctvTbl);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("CCTV:");

        cctvField.setForeground(new java.awt.Color(102, 102, 102));
        cctvField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Quantity:");

        cctvQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cctvAdd.setBackground(new java.awt.Color(255, 255, 255));
        cctvAdd.setText("Add to Cart");

        javax.swing.GroupLayout CCTVLayout = new javax.swing.GroupLayout(CCTV);
        CCTV.setLayout(CCTVLayout);
        CCTVLayout.setHorizontalGroup(
            CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCTVLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CCTVLayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(24, 24, 24)
                        .addComponent(cctvField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cctvQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(cctvAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CCTVLayout.createSequentialGroup()
                        .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cctvSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(41, 41, 41))
        );
        CCTVLayout.setVerticalGroup(
            CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCTVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cctvSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(CCTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cctvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(cctvQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cctvAdd))
                .addGap(69, 69, 69))
        );

        jPanel19.add(CCTV, "card4");

        printerSearch.setText("Search");

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
        jScrollPane19.setViewportView(printerTbl);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Printer:");

        printerField.setForeground(new java.awt.Color(102, 102, 102));
        printerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setText("Quantity:");

        printerQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        printerAdd.setBackground(new java.awt.Color(255, 255, 255));
        printerAdd.setText("Add to Cart");

        javax.swing.GroupLayout PrinterLayout = new javax.swing.GroupLayout(Printer);
        Printer.setLayout(PrinterLayout);
        PrinterLayout.setHorizontalGroup(
            PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrinterLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(24, 24, 24)
                        .addComponent(printerField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(printerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrinterLayout.createSequentialGroup()
                        .addGroup(PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(41, 41, 41))
        );
        PrinterLayout.setVerticalGroup(
            PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(PrinterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(printerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printerAdd))
                .addGap(69, 69, 69))
        );

        jPanel19.add(Printer, "card5");

        jLabel18.setText("Select:");

        unitSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unit", "Processor", " " }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel18)
                .addGap(59, 59, 59)
                .addComponent(unitSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(663, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                    .addGap(0, 48, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Computer");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("CCTV");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Printer");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Cart");

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
        jScrollPane10.setViewportView(Cart);

        reqRemove.setText("Remove");

        reqCheckout.setText("Check-out");

        reqCancel.setText("Cancel");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reqCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reqRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reqCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reqCheckout)
                .addGap(7, 7, 7)
                .addComponent(reqRemove)
                .addGap(11, 11, 11)
                .addComponent(reqCancel)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout RequestLayout = new javax.swing.GroupLayout(Request);
        Request.setLayout(RequestLayout);
        RequestLayout.setHorizontalGroup(
            RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RequestLayout.createSequentialGroup()
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8a)
                            .addComponent(jLabel1a))
                        .addGap(18, 18, 18)
                        .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitDept, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reqBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RequestLayout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RequestLayout.setVerticalGroup(
            RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1a)
                    .addComponent(reqBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8a)
                    .addComponent(unitDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        AddingLayout.setVerticalGroup(
            AddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddingLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
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
        jScrollPane20.setViewportView(allHisTbl);

        HISrepair.setBackground(new java.awt.Color(255, 255, 255));
        HISrepair.setForeground(new java.awt.Color(0, 0, 102));
        HISrepair.setText("Schedule Repair");

        HISreplace.setBackground(new java.awt.Color(255, 255, 255));
        HISreplace.setForeground(new java.awt.Color(0, 0, 102));
        HISreplace.setText("Request Replacement");

        HISdispose.setBackground(new java.awt.Color(255, 255, 255));
        HISdispose.setForeground(new java.awt.Color(0, 0, 102));
        HISdispose.setText("Dispose");

        HISsearchf.setForeground(new java.awt.Color(0, 0, 102));
        HISsearchf.setText("Search");

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

        javax.swing.GroupLayout HISpcLayout = new javax.swing.GroupLayout(HISpc);
        HISpc.setLayout(HISpcLayout);
        HISpcLayout.setHorizontalGroup(
            HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpcLayout.createSequentialGroup()
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpcLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pcHisUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
            .addGroup(HISpcLayout.createSequentialGroup()
                .addContainerGap()
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
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(jLabel118))
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pcHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(pcHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpcLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel117)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pcHisETime, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(pcHisSDate)))
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pcHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpcLayout.createSequentialGroup()
                                .addComponent(jLabel141)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pcHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel120))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HISpcLayout.createSequentialGroup()
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
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
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pcHisUpdate))
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
                        .addGroup(HISpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel119)
                            .addComponent(jLabel118)
                            .addComponent(pcHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        javax.swing.GroupLayout HISccLayout = new javax.swing.GroupLayout(HIScc);
        HIScc.setLayout(HISccLayout);
        HISccLayout.setHorizontalGroup(
            HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISccLayout.createSequentialGroup()
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISccLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ccHisUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
            .addGroup(HISccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel143)
                            .addComponent(jLabel146))
                        .addGap(52, 52, 52)
                        .addComponent(ccHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel147)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccHisETime))
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114)
                            .addComponent(jLabel144)
                            .addComponent(jLabel149))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addGroup(HISccLayout.createSequentialGroup()
                                .addComponent(ccHisSDate)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel145)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISccLayout.createSequentialGroup()
                                .addComponent(jLabel151)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel148))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        HISccLayout.setVerticalGroup(
            HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISccLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel151)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISccLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccHisName))
                        .addGap(16, 16, 16)))
                .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel148)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccHisUpdate))
                    .addGroup(HISccLayout.createSequentialGroup()
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel144)
                            .addComponent(ccHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel150)
                            .addComponent(ccHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(ccHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(HISccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel147)
                            .addComponent(jLabel146)
                            .addComponent(ccHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
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

        javax.swing.GroupLayout HISprLayout = new javax.swing.GroupLayout(HISpr);
        HISpr.setLayout(HISprLayout);
        HISprLayout.setHorizontalGroup(
            HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISprLayout.createSequentialGroup()
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISprLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prHisUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
            .addGroup(HISprLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addComponent(jLabel154)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISprLayout.createSequentialGroup()
                                .addComponent(jLabel152)
                                .addGap(18, 18, 18)))
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addComponent(prHisAct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel160)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisPric, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(prHisName)))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel153)
                            .addComponent(jLabel156))
                        .addGap(34, 34, 34)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prHisSDate, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(prHisSTime))
                        .addGap(18, 18, 18)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel157, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prHisEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prHisPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISprLayout.createSequentialGroup()
                                .addComponent(jLabel161)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel158))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        HISprLayout.setVerticalGroup(
            HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISprLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisBran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel161)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISprLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prHisName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prHisUpdate))
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
                        .addGroup(HISprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prHisSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel157)
                            .addComponent(jLabel156)
                            .addComponent(prHisETime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HISprLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel154)))
                .addGap(18, 18, 18))
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

        javax.swing.GroupLayout HISpc1Layout = new javax.swing.GroupLayout(HISpc1);
        HISpc1.setLayout(HISpc1Layout);
        HISpc1Layout.setHorizontalGroup(
            HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISpc1Layout.createSequentialGroup()
                .addGroup(HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HISpc1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pcHisUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HISpc1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        HISpc1Layout.setVerticalGroup(
            HISpc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(17, 17, 17)))
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

        javax.swing.GroupLayout HIScc1Layout = new javax.swing.GroupLayout(HIScc1);
        HIScc1.setLayout(HIScc1Layout);
        HIScc1Layout.setHorizontalGroup(
            HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HIScc1Layout.createSequentialGroup()
                .addGroup(HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HIScc1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ccHisUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HIScc1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(0, 66, Short.MAX_VALUE)
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
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        HIScc1Layout.setVerticalGroup(
            HIScc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HIScc1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 59, Short.MAX_VALUE)
                .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addGroup(HISpr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HISpr1Layout.createSequentialGroup()
                                .addComponent(jLabel181)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prHisBran1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel178))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HISpr1Layout.createSequentialGroup()
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
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
                            .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HISmaincardLayout.createSequentialGroup()
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(countHis5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HISmaincardLayout.createSequentialGroup()
                                .addComponent(HISsearchf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HISfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 1570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HISmaincardLayout.createSequentialGroup()
                                .addComponent(HISrepair, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HISreplace)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HISdispose)))))
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
                .addGap(0, 0, 0)
                .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HISfilter)
                        .addComponent(HISsearchf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HISmaincardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HISrepair)
                            .addComponent(HISreplace)
                            .addComponent(HISdispose)))
                    .addGroup(HISmaincardLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(HISmaincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countHis5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))))
                .addGap(86, 86, 86))
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

        hisSave.setBackground(new java.awt.Color(255, 255, 255));
        hisSave.setForeground(new java.awt.Color(0, 0, 102));
        hisSave.setText("Save");

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
                    .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PCinfo4Layout.createSequentialGroup()
                            .addGap(372, 372, 372)
                            .addComponent(hisEDateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PCinfo4Layout.createSequentialGroup()
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
                            .addComponent(hisETimeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel142)
                        .addGroup(PCinfo4Layout.createSequentialGroup()
                            .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel134)
                                .addComponent(jLabel135)
                                .addComponent(jLabel136))
                            .addGap(18, 18, 18)
                            .addGroup(PCinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(hisPerfAdd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hisPricAdd)
                                .addComponent(hisActAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
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
                    .addComponent(PCinfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PCinfo4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
            .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddHistoryLayout = new javax.swing.GroupLayout(AddHistory);
        AddHistory.setLayout(AddHistoryLayout);
        AddHistoryLayout.setHorizontalGroup(
            AddHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddHistoryLayout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413))
        );
        AddHistoryLayout.setVerticalGroup(
            AddHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddHistoryLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
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
        jScrollPane5.setViewportView(userlogTbl);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Activity Log");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("User Log");

        ActLogSearch.setText("Search");

        jPanel14.setBackground(new java.awt.Color(227, 225, 225));

        jLabel24.setText("From:");

        jDateChooser2.setDateFormatString("MMM/dd/yy");

        jLabel25.setText("To:");

        jDateChooser1.setDateFormatString("MMM/dd/yy");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sort");

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

        jPanel16.setBackground(new java.awt.Color(227, 225, 225));

        jLabel27.setText("From:");

        jDateChooser3.setDateFormatString("MMM/dd/yy");

        jLabel29.setText("To:");

        jDateChooser4.setDateFormatString("MMM/dd/yy");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sort");

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

        ulogrefresh.setBorderPainted(false);
        ulogrefresh.setContentAreaFilled(false);

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
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LogLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addComponent(UserLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ulogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addComponent(ActLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))
                    .addGroup(LogLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LogLayout.createSequentialGroup()
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LogLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ActLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(actLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LogLayout.createSequentialGroup()
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLogSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ulogrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(uLogCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        Maincard.add(Log, "card6");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1700, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
        );

        Maincard.add(jPanel18, "card8");

        jPanel1.add(Maincard, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1, 1700, 982));
        Maincard.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        INV.setBackground(new java.awt.Color(255, 255, 255));
        INV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blueinv.jpg"))); // NOI18N
        INV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVActionPerformed(evt);
            }
        });

        HIS.setBackground(new java.awt.Color(255, 255, 255));
        HIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bluehis.jpg"))); // NOI18N
        HIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HISActionPerformed(evt);
            }
        });

        LOG.setBackground(new java.awt.Color(255, 255, 255));
        LOG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bluelog.jpg"))); // NOI18N
        LOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGActionPerformed(evt);
            }
        });

        LOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bluesign.jpg"))); // NOI18N
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.jpg"))); // NOI18N

        INV1.setBackground(new java.awt.Color(255, 255, 255));
        INV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bluehome.jpg"))); // NOI18N
        INV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INV1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INV1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(LOG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(HIS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(INV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(53, 53, 53)
                .addComponent(INV1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(INV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HIS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LOG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 600));

        datefield.setFont(new java.awt.Font("Yu Gothic Medium", 0, 20)); // NOI18N
        datefield.setForeground(new java.awt.Color(255, 255, 0));
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
    }//GEN-LAST:event_LOGActionPerformed

    private void HISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HISActionPerformed
       Filter.setVisible(false);
       INVmaincard.setVisible(false);
       Home.setVisible(false);
       Log.setVisible(false);
       HISmaincard.setVisible(true);
       Adding.setVisible(false);
       AddHistory.setVisible(false);
    }//GEN-LAST:event_HISActionPerformed

    private void INVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVActionPerformed
     INVmaincard.setVisible(true);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
     PCcard.setVisible(true);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     //July 25
     showPC();
     pcSet();
     PCcount();
    }//GEN-LAST:event_INVActionPerformed

    private void CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCActionPerformed
     PCcard.setVisible(false);
     CCcard.setVisible(true);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
    }//GEN-LAST:event_CCActionPerformed

    private void PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRActionPerformed
     PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(true);
     OTcard.setVisible(false);
    }//GEN-LAST:event_PRActionPerformed

    private void HISfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HISfilterActionPerformed
      Filter.setVisible(true);
    }//GEN-LAST:event_HISfilterActionPerformed

    private void PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCActionPerformed
     PCcard.setVisible(true);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(false);
     //July 25
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

    private void ccHisUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccHisUpdateActionPerformed
        HISpc1.setVisible(false);
        HIScc1.setVisible(true);
        HISpr1.setVisible(false);
        HISpc.setVisible(false);
        HIScc.setVisible(false);
        HISpr.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) allHisTbl.getModel();
        int selectedRowIndex = allHisTbl.getSelectedRow();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        HISdetails.setVisible(true);
        ccHisBran1.setText(model.getValueAt(selectedRowIndex,0).toString());
        ccHisName1.setText(model.getValueAt(selectedRowIndex,1).toString());
        ccHisAct1.setText(model.getValueAt(selectedRowIndex,3).toString());
        ccHisPerf1.setText(model.getValueAt(selectedRowIndex,4).toString());
        ccHisSDate2.setText(model.getValueAt(selectedRowIndex,5).toString());
        ccHisEDate2.setText(model.getValueAt(selectedRowIndex,6).toString());
        ccHisSTime1.setText(model.getValueAt(selectedRowIndex,7).toString());
        ccHisETime1.setText(model.getValueAt(selectedRowIndex,8).toString());
        ccHisPric1.setText(model.getValueAt(selectedRowIndex,9).toString());
        ccHisRem1.setText(model.getValueAt(selectedRowIndex,10).toString());
    }//GEN-LAST:event_ccHisUpdateActionPerformed

    private void prHisUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prHisUpdateActionPerformed
        HISpc1.setVisible(false);
        HIScc1.setVisible(false);
        HISpr1.setVisible(true);
        HISpc.setVisible(false);
        HIScc.setVisible(false);
        HISpr.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) allHisTbl.getModel();
        int selectedRowIndex = allHisTbl.getSelectedRow();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        HISdetails.setVisible(true);
        prHisBran1.setText(model.getValueAt(selectedRowIndex,0).toString());
        prHisName1.setText(model.getValueAt(selectedRowIndex,1).toString());
        prHisAct1.setText(model.getValueAt(selectedRowIndex,3).toString());
        prHisPerf1.setText(model.getValueAt(selectedRowIndex,4).toString());
        prHisSDate2.setText(model.getValueAt(selectedRowIndex,5).toString());
        prHisEDate2.setText(model.getValueAt(selectedRowIndex,6).toString());
        prHisSTime1.setText(model.getValueAt(selectedRowIndex,7).toString());
        prHisETime1.setText(model.getValueAt(selectedRowIndex,8).toString());
        prHisPric1.setText(model.getValueAt(selectedRowIndex,9).toString());
        prHisRem1.setText(model.getValueAt(selectedRowIndex,10).toString());        

    }//GEN-LAST:event_prHisUpdateActionPerformed

    private void INV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INV1ActionPerformed
     INVmaincard.setVisible(false);
     Home.setVisible(true);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(false);
     AddHistory.setVisible(false);
    }//GEN-LAST:event_INV1ActionPerformed

    private void repAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repAddActionPerformed
    AddRepOpen() ;
    }//GEN-LAST:event_repAddActionPerformed

    private void PR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PR1ActionPerformed
      PCcard.setVisible(false);
     CCcard.setVisible(false);
     PRcard.setVisible(false);
     OTcard.setVisible(true);
    }//GEN-LAST:event_PR1ActionPerformed

    private void reqAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqAddActionPerformed
     INVmaincard.setVisible(false);
     Home.setVisible(false);
     HISmaincard.setVisible(false);
     Log.setVisible(false);
     Adding.setVisible(true);
     AddHistory.setVisible(false);
    }//GEN-LAST:event_reqAddActionPerformed

    private void pcSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcSortActionPerformed
pcSort();        // TODO add your handling code here:
    }//GEN-LAST:event_pcSortActionPerformed

    private void compTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compTblMouseClicked
pcSet();   
    }//GEN-LAST:event_compTblMouseClicked

    private void pcEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcEditActionPerformed
pcEditable();      
    }//GEN-LAST:event_pcEditActionPerformed

    private void pcUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcUpdateActionPerformed
pcUpdate();
pcNonEditable();
    }//GEN-LAST:event_pcUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
          
        /* Create and display the form */
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
    private javax.swing.JPanel Filter;
    private javax.swing.JButton HIS;
    private javax.swing.JPanel HIScc;
    private javax.swing.JPanel HIScc1;
    private javax.swing.JPanel HISdetails;
    private javax.swing.JButton HISdispose;
    private javax.swing.JButton HISfilter;
    private javax.swing.JPanel HISmaincard;
    private javax.swing.JPanel HISpc;
    private javax.swing.JPanel HISpc1;
    private javax.swing.JPanel HISpr;
    private javax.swing.JPanel HISpr1;
    private javax.swing.JButton HISrepair;
    private javax.swing.JButton HISreplace;
    private javax.swing.JTextField HISsearchf;
    private javax.swing.JPanel Home;
    private javax.swing.JButton INV;
    private javax.swing.JButton INV1;
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
    private javax.swing.JPanel PCinfo4;
    private javax.swing.JScrollPane PCtable;
    private javax.swing.JScrollPane PCtable1;
    private javax.swing.JButton PR;
    private javax.swing.JButton PR1;
    private javax.swing.JButton PRadd;
    private javax.swing.JPanel PRcard;
    private javax.swing.JButton PRdel;
    private javax.swing.JPanel PRinfo;
    private javax.swing.JPanel Printer;
    private javax.swing.JPanel Request;
    private javax.swing.JPanel Unit;
    private javax.swing.JTextField UserLogSearch;
    private javax.swing.JLabel actLogCnt;
    private javax.swing.JTable actlogTbl;
    private javax.swing.JTable allHisTbl;
    private javax.swing.JButton alogrefresh;
    private javax.swing.JTextField ccBran;
    private javax.swing.JButton ccDel;
    public static javax.swing.JButton ccEdit;
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
    private javax.swing.JTextField ccNum;
    private javax.swing.JTextField ccPW;
    private javax.swing.JTextArea ccRem;
    private javax.swing.JTextField ccSearchtxt;
    public static javax.swing.JComboBox ccSort;
    private javax.swing.JTextField ccSupp;
    private javax.swing.JTable ccTbl;
    public static javax.swing.JButton ccTransfer;
    public static javax.swing.JButton ccTransfer1;
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
    private javax.swing.JTable compTbl1;
    private javax.swing.JTextField compUps;
    private javax.swing.JLabel countCC;
    private javax.swing.JLabel countHis;
    private javax.swing.JLabel countHis2;
    private javax.swing.JLabel countHis3;
    private javax.swing.JLabel countHis5;
    private javax.swing.JLabel countPC;
    private javax.swing.JLabel countPR;
    private javax.swing.JLabel datefield;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
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
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
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
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel8a;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
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
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton othersAdd;
    private javax.swing.JTextField othersField;
    private javax.swing.JSpinner othersQty;
    private javax.swing.JTextField othersSearch;
    private javax.swing.JTable othersTbl;
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
    private javax.swing.JTextField pcSearchtxt;
    private javax.swing.JTextField pcSearchtxt1;
    public static javax.swing.JComboBox pcSort;
    public static javax.swing.JComboBox pcSort1;
    public static javax.swing.JButton pcTransfer;
    public static javax.swing.JButton pcUpdate;
    private javax.swing.JTextField prBran;
    private javax.swing.JTextField prDept;
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
    private javax.swing.JTextField prManu;
    private javax.swing.JTextField prName;
    private javax.swing.JTextArea prRem;
    private javax.swing.JTextField prSearchtxt;
    public static javax.swing.JComboBox prSort;
    private javax.swing.JTable prTbl;
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
    private javax.swing.JButton reqRemove;
    private javax.swing.JTextField reqSearch;
    private javax.swing.JTable reqTbl;
    private javax.swing.JButton shipAdd;
    private javax.swing.JButton shipDone;
    private javax.swing.JTextField shipSearch;
    private javax.swing.JTable shipTbl;
    private javax.swing.JLabel timefield;
    private javax.swing.JLabel uLogCnt;
    private javax.swing.JButton ulogrefresh;
    private javax.swing.JButton unitAdd;
    private javax.swing.JComboBox<String> unitDept;
    private javax.swing.JTextField unitHar;
    private javax.swing.JTextField unitKey;
    private javax.swing.JTextField unitMon;
    private javax.swing.JTextField unitMot;
    private javax.swing.JTextField unitPro;
    private javax.swing.JSpinner unitQty;
    private javax.swing.JTextField unitRam;
    private javax.swing.JTextField unitSearch;
    private javax.swing.JComboBox<String> unitSelect;
    private javax.swing.JTable unitTbl;
    private javax.swing.JTextField unitUPS;
    private javax.swing.JTable userlogTbl;
    // End of variables declaration//GEN-END:variables
    public String sql,sql1; 
    public String utype;
//FUNCTIONS-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void FilterJtable( final JTable jTable,  final JTextField jtfFilter) {
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
//FOR PC-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void showPC(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor, MBoard as Motherboard, Ram as Memory,HDD as HardDisk, ID FROM dbo.invPC ORDER by BRANCH";         
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
 
 FilterJtable(compTbl,pcSearchtxt);
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
sql = "SELECT Branch, Dept as Department,Owner as CurrentUser,Proce as Processor,MBoard as Motherboard, Ram as Memory,HDD as HardDisk, ID  FROM dbo.invPC WHERE BRANCH = '"+Branch+"' ORDER BY Branch ";         
rs=st.executeQuery(sql); 
compTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();

      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
FilterJtable(compTbl,pcSearchtxt);
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
JOptionPane.showMessageDialog(null,"Item Updated!"); 

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
//Output Table Contents------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public void showCC(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,CAM as Quantity,uN as Username,Pw as Password, ID FROM dbo.invCC ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
ccTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
/*ccTbl.setRowSelectionInterval(0,0);
    setJTableColumnsWidth(ccTbl, 480, 6, 42, 6, 20, 20, 6);
    Homepage.setCellsAlignment1(ccTbl, SwingConstants.CENTER);*/
}
public void showPR(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Department, Manufacturer, Printername as Name, ID FROM dbo.invPR ORDER by Branch";         
ResultSet rs=st.executeQuery(sql); 
prTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
/*prTbl.setRowSelectionInterval(0,0);
   setJTableColumnsWidth(prTbl, 480, 10, 20, 25, 40, 5);
   Homepage.setCellsAlignment1(prTbl, SwingConstants.CENTER);*/
}
public void showHis(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History;";         
ResultSet rs=st.executeQuery(sql); 
allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
 //allHisTbl.setRowSelectionInterval(0,0);
}
public void showHisCC(){
        int selectedRowIndex = ccTbl.getSelectedRow();
        String ID = ccTbl.getValueAt(selectedRowIndex,5).toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,SDate as StartDate,EDate as EndDate,Price,HIS_ID as HistoryID, ITEM_ID as ID FROM dbo.History WHERE Categ = 'CCTV' AND ITEM_ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql);
hisTbl2.setModel(DbUtils.resultSetToTableModel(rs));
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void showHisPR(){
        int selectedRowIndex = prTbl.getSelectedRow();
        String ID = prTbl.getValueAt(selectedRowIndex,4).toString();
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Action,SDate as StartDate,EDate as EndDate,Price,HIS_ID as HistoryID, ITEM_ID as ID FROM dbo.History WHERE Categ = 'Printer' AND ITEM_ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql); 
TableColumnModel columnModel = hisTbl3.getColumnModel();
hisTbl3.setModel(DbUtils.resultSetToTableModel(rs));
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
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
//actlogTbl.setRowSelectionInterval(0,0);
}
public void showUserLog(){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT uType as UserType, Laction as Action, Ldate as Date, Ltime as Time FROM dbo.userLogs ORDER by LOG_ID";         
ResultSet rs=st.executeQuery(sql); 
userlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
//userlogTbl.setRowSelectionInterval(0,0);
}
//End of Table Output------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Initializing Content------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void initBranch(){
try { 
Connection con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
Statement st1=con1.createStatement();         
String sql1 = "SELECT BRANCH FROM dbo.Branch";         
rs1=st1.executeQuery(sql1);
while(rs1.next()){
String Branch = rs1.getString("BRANCH");
pcSort.addItem(Branch);
ccSort.addItem(Branch);
prSort.addItem(Branch);



      }
     }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLOpt22 : " + ex.getSQLState()); 
 }
}
private void setIcon() {
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/NEMAR LOGO 2.png")));
    }
//End of Initialization------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Search Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void searchCC(){
String ID = ccSearchtxt.getText();  
String Branch = ccSort.getSelectedItem().toString();
if((Branch == "ALL")||(ID == "")){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,CAM as Quantity,uN as Username,Pw as Password, ID FROM dbo.invCC WHERE Branch LIKE '"+Branch+"%' OR SP LIKE  '%"+ID+"%' OR CAM LIKE '%"+ID+"%' OR uN = '"+ID+"' OR Pw = '"+ID+"' ";         
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
else{
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, SP as ServiceProvider,CAM as Quantity,uN as Username,Pw as Password, ID   FROM dbo.invCC WHERE Branch = '"+Branch+"' AND SP LIKE  '%"+ID+"%' OR Branch = '"+Branch+"' AND CAM LIKE '%"+ID+"%' OR Branch = '"+Branch+"' AND uN = '"+ID+"' OR Branch = '"+Branch+"' AND Pw = '"+ID+"' ";         
ResultSet rs=st.executeQuery(sql); 
ccTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }

//ccTbl.setRowSelectionInterval(0,0);
//ccSet();
}
}
public void searchPR(){
String ID = prSearchtxt.getText();
String Branch = prSort.getSelectedItem().toString();
if((Branch == "ALL")||(ID == "")){
   try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Manufacturer,Printername as Name,Department, ID  FROM dbo.invPR WHERE Branch LIKE '"+ID+"%' OR Manufacturer LIKE '%"+ID+"%' OR Printername LIKE '%"+ID+"%' OR Department LIKE '"+ID+"%'";         
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
else{
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Branch, Manufacturer,Printername as Name,Department, ID  FROM dbo.invPR WHERE Branch = '"+Branch+"' AND Manufacturer LIKE '%"+ID+"%' OR Branch = '"+Branch+"' AND Printername LIKE '%"+ID+"%' OR Branch = '"+Branch+"' AND Department LIKE '"+ID+"%'";         
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
//prTbl.setRowSelectionInterval(0,0);
//prSet();
}
public void searchALog(){
String ID = ActLogSearch.getText();
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT Action, Categ as Category, Item, Date, Time FROM dbo.Logs WHERE Action LIKE '%"+ID+"%' OR Categ LIKE '%"+ID+"%' OR Item LIKE '%"+ID+"%' OR Date LIKE '"+ID+"%' OR Time LIKE '%"+ID+"%'";         
ResultSet rs=st.executeQuery(sql); 
actlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
public void searchULog(){
String ID = UserLogSearch.getText();
try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT uType as UserType, Laction as Action, Ldate as Date, Ltime as Time FROM dbo.userLogs WHERE uType LIKE '%"+ID+"%' OR Laction LIKE '%"+ID+"%' OR Ldate LIKE '%"+ID+"%' OR Ltime LIKE '"+ID+"%'";         
ResultSet rs=st.executeQuery(sql); 
userlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }}
//End of Search Function ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
        dispose();   
}
public void AddRepOpen(){
        AddRep l = new AddRep();
        l.setVisible(true);  
}
//Opening of Window Opening------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Logs----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void logoutLog(){
    Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
        try {
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        Statement sta = con.createStatement();
        String newsql = "INSERT INTO dbo.userLogs(uType,Laction,Ldate,Ltime) VALUES ('" + utype+"','Logout','"+dt.format(date)+"','"+tm.format(time)+"')";					
        sta.execute(newsql);        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }
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
//End Of Logs---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Basic Add Functions------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//End of Add Functions-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Basic Editing Functions------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public void ccUpdate(){
int selectedRowIndex = ccTbl.getSelectedRow();
String ID = ccTbl.getValueAt(selectedRowIndex,5).toString();
String s1 = ccBran.getText();
String s2 = ccSupp.getText();
String s3 = ccUN.getText();
String s4 = ccPW.getText();
String s5 = ccNum.getText();
String s6 = ccRem.getText();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invCC SET Branch = '"+s1+"',SP = '"+s2+"',CAM = '"+s3+"',uN = '"+s4+"',pW ='"+s5+"',REM = '"+s6+"' WHERE ID = '"+ID+"'";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Update', 'CCTV','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Item Added!"); 
//refreshCC();    
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
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="UPDATE dbo.invPR Branch = '"+s1+"',Manufacturer = '"+s2+"',Printername = '"+s3+"' ,Department = '"+s4+"',REM = '"+s5+"' WHERE ID = '"+ID+"'";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Update', 'Printer','"+s1+"-"+s4+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Item Updated!"); 
//refreshPR();    
}
//End of Editing Functions------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//TRANFER CODE
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
                    DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
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
public void ccTransfer(String sb){

            int selectedRowIndex = ccTbl.getSelectedRow();
            String ID = ccTbl.getValueAt(selectedRowIndex,5).toString();
            String s2 = ccSupp.getText();
            String s3 = ccUN.getText();
            String s4 = ccPW.getText();
            String s5 = ccNum.getText();
            String s6 = ccRem.getText();
            try{
                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");
                DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
                Date date = new Date();
                DateFormat tm = new SimpleDateFormat("HH:mm:ss");
                Date time = new Date();
                Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                String sql ="UPDATE dbo.invCC SET Branch = '"+sb+"' WHERE ID = '"+ID+"'";
                st.execute(sql);
                
                Statement sta = con.createStatement();
                String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Update', 'CCTV','"+sb+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
                sta.execute(newsql);
}
 catch (SQLException ex) {    
     JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
     JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }              JOptionPane.showMessageDialog(null,"Device Transfered!");
 //refreshCC();  
 //showCC();
}
public void prTransfer(String sb){
            int selectedRowIndex = prTbl.getSelectedRow();
            String ID = prTbl.getValueAt(selectedRowIndex,4).toString();
            String s2 = prManu.getText();
            String s3 = prName.getText();
            String s4 = prDept.getText();
            String s5 = prRem.getText();
            try{
                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");
                DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
                Date date = new Date();
                DateFormat tm = new SimpleDateFormat("HH:mm:ss");
                Date time = new Date();
                Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                String sql ="UPDATE dbo.invPR Branch = '"+sb+"' WHERE ID = '"+ID+"'";
                st.execute(sql);
                
                Statement sta = con.createStatement();
                String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Update', 'Printer','"+sb+"-"+s4+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
                sta.execute(newsql);
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }              JOptionPane.showMessageDialog(null,"Item Updated!");
                refreshPR();
       
}

//Basic Deleting Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void pcDel(){
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
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
String s8 = compRem.getText();
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
 String sql ="DELETE FROM dbo.invPC WHERE ID = '"+ID+"'";
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Delete', 'Computer','"+s1+"-"+s2+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Device Deleted!"); 
PCaddArchives();
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
public void ccDel(){
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
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
       String ID = ccTbl.getValueAt(selectedRowIndex,5).toString();

Object[] options = { "OK", "CANCEL" };
int n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?", "Delete",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, options, options[0]);
 
    if(n == JOptionPane.OK_OPTION){ 
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");              
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="DELETE FROM dbo.invCC WHERE ID = '"+ID+"'";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Delete', 'CCTV','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Device Deleted!"); 
CCaddArchives();
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
public void prDel(){
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
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
 String sql ="DELETE FROM dbo.invPR WHERE ID = '"+ID+"'";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('Delete', 'Printer','"+s1+"-"+s4+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Device Deleted!"); 
PRaddArchives();
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
//End of Basic Deleting Functions------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Click Set Contents Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public void ccSet(){
        int selectedRowIndex = ccTbl.getSelectedRow();
        ccBran.setText(ccTbl.getValueAt(selectedRowIndex,0).toString());
        ccSupp.setText(ccTbl.getValueAt(selectedRowIndex,1).toString());
        ccNum.setText(ccTbl.getValueAt(selectedRowIndex,2).toString());
        ccUN.setText(ccTbl.getValueAt(selectedRowIndex,3).toString());
        ccPW.setText(ccTbl.getValueAt(selectedRowIndex,4).toString());
        //showHisCC();
        //setCCRem();
}
public void prSet(){
        int selectedRowIndex = prTbl.getSelectedRow();
        prBran.setText(prTbl.getValueAt(selectedRowIndex,0).toString());
        prDept.setText(prTbl.getValueAt(selectedRowIndex,1).toString());
        prManu.setText(prTbl.getValueAt(selectedRowIndex,2).toString());
        prName.setText(prTbl.getValueAt(selectedRowIndex,3).toString());
        //showHisPR();
        //setPRRem();
}
public void hisSet(){
        int selectedRowIndex = allHisTbl.getSelectedRow();
        String categ = allHisTbl.getValueAt(selectedRowIndex,2).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.print(categ);
        if(categ.equals("Computer")){
        HISdetails.setVisible(true);
        HISpc.setVisible(true);
        HIScc.setVisible(false);
        HISpr.setVisible(false);
        pcHisBran.setText(allHisTbl.getValueAt(selectedRowIndex,0).toString());
        pcHisName.setText(allHisTbl.getValueAt(selectedRowIndex,1).toString());
        pcHisAct.setText(allHisTbl.getValueAt(selectedRowIndex,3).toString());
        pcHisPerf.setText(allHisTbl.getValueAt(selectedRowIndex,4).toString());
        pcHisSDate.setText(allHisTbl.getValueAt(selectedRowIndex,5).toString());
        pcHisEDate.setText(allHisTbl.getValueAt(selectedRowIndex,6).toString());
        pcHisSTime.setText(allHisTbl.getValueAt(selectedRowIndex,7).toString());
        pcHisETime.setText(allHisTbl.getValueAt(selectedRowIndex,8).toString());
        pcHisPric.setText(allHisTbl.getValueAt(selectedRowIndex,9).toString());
        pcHisRem.setText(allHisTbl.getValueAt(selectedRowIndex,10).toString());
   
        }
        else if(categ.equals("CCTV")){
        HISdetails.setVisible(true);
        HISpc.setVisible(false);
        HIScc.setVisible(true);
        HISpr.setVisible(false);
        ccHisBran.setText(allHisTbl.getValueAt(selectedRowIndex,0).toString());
        ccHisName.setText(allHisTbl.getValueAt(selectedRowIndex,1).toString());
        ccHisAct.setText(allHisTbl.getValueAt(selectedRowIndex,3).toString());
        ccHisPerf.setText(allHisTbl.getValueAt(selectedRowIndex,4).toString());
        ccHisSDate.setText(allHisTbl.getValueAt(selectedRowIndex,5).toString());
        ccHisEDate.setText(allHisTbl.getValueAt(selectedRowIndex,6).toString());
        ccHisSTime.setText(allHisTbl.getValueAt(selectedRowIndex,7).toString());
        ccHisETime.setText(allHisTbl.getValueAt(selectedRowIndex,8).toString());
        ccHisPric.setText(allHisTbl.getValueAt(selectedRowIndex,9).toString());
        ccHisRem.setText(allHisTbl.getValueAt(selectedRowIndex,10).toString());
        }
        else if(categ.equals("Printer")){
        HISdetails.setVisible(true);
        HISpc.setVisible(false);
        HIScc.setVisible(false);
        HISpr.setVisible(true);
        prHisBran.setText(allHisTbl.getValueAt(selectedRowIndex,0).toString());
        prHisName.setText(allHisTbl.getValueAt(selectedRowIndex,1).toString());
        prHisAct.setText(allHisTbl.getValueAt(selectedRowIndex,3).toString());
        prHisPerf.setText(allHisTbl.getValueAt(selectedRowIndex,4).toString());
        prHisSDate.setText(allHisTbl.getValueAt(selectedRowIndex,5).toString());
        prHisEDate.setText(allHisTbl.getValueAt(selectedRowIndex,6).toString());
        prHisSTime.setText(allHisTbl.getValueAt(selectedRowIndex,7).toString());
        prHisETime.setText(allHisTbl.getValueAt(selectedRowIndex,8).toString());
        prHisPric.setText(allHisTbl.getValueAt(selectedRowIndex,9).toString());
        prHisRem.setText(allHisTbl.getValueAt(selectedRowIndex,10).toString());
        }
        
}

public void setCCRem(){
        int selectedRowIndex = ccTbl.getSelectedRow();
        String ID = ccTbl.getValueAt(selectedRowIndex,5).toString();
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT REM FROM dbo.invCC WHERE ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql); 
if(rs.next()){
String Rem = rs.getString("REM");
ccRem.setText(Rem);
      }
   }
      
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
public void setPRRem(){
        int selectedRowIndex = prTbl.getSelectedRow();
        String ID = prTbl.getValueAt(selectedRowIndex,4).toString();
    try {
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
Statement st=con.createStatement();         
sql = "SELECT REM FROM dbo.invPR WHERE ID = '"+ID+"'";         
ResultSet rs=st.executeQuery(sql); 
if(rs.next()){
String Rem = rs.getString("REM");
prRem.setText(Rem);
      }
   }
      
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}

//End of Contents Setting Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Choose Sort Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
sql = "SELECT Branch, SP as ServiceProvider,CAM as Quantity,uN as Username,Pw as Password,ID  FROM dbo.invCC WHERE Branch = '"+Branch1+"'";   
ResultSet rs=st.executeQuery(sql); 
TableColumnModel columnModel = ccTbl.getColumnModel();
ccTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
}
//ccTbl.setRowSelectionInterval(0,0);
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
sql = "SELECT Branch, Manufacturer,Printername as Name,Department, ID FROM dbo.invPR  WHERE Branch = '"+Branch2+"'";  
ResultSet rs=st.executeQuery(sql); 
TableColumnModel columnModel = prTbl.getColumnModel();
prTbl.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
st.close();
      }
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }  
}
//prTbl.setRowSelectionInterval(0,0);
}
public void alogSort(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMM/dd/yy");
        String startD = sdf.format(jDateChooser2.getDate());
        String endD = sdf.format(jDateChooser1.getDate());
        System.out.print(startD+endD);

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
        }}
public void ulogSort(){ 
        SimpleDateFormat sdf = new SimpleDateFormat("MMM/dd/yy");
        String startD = sdf.format(jDateChooser3.getDate());
        String endD = sdf.format(jDateChooser4.getDate());
        System.out.print(startD+endD);

        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");; 
            ResultSet rs;
            Statement st=con.createStatement();
            String sql = "SELECT uType as UserType, Laction as Action, Ldate as Date, Ltime as Time FROM dbo.userLogs WHERE CONVERT(VARCHAR(50),Ldate, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' ORDER BY LOG_ID";
            rs=st.executeQuery(sql);
            userlogTbl.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState());
        }}
public void hisFilter(){
String Branch2 = hisSortCateg.getSelectedItem().toString();

        if (hisSortSDate.getDate() == null && hisSortEDate.getDate() == null)
        {  
            if(hisSortCateg.getSelectedItem()=="ALL"){
            showHis(); 
            }
            else
            {
            try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE Categ = '"+Branch2+"'";  
            ResultSet rs=st.executeQuery(sql); 
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }  
}       
        }
        
        
        else {
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String startD = sdf.format(hisSortSDate.getDate());
String endD = sdf.format(hisSortEDate.getDate());
 System.out.print(startD+endD);           
           if(hisSortCateg.getSelectedItem()=="ALL"){
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' ORDER BY HIS_ID";  
            ResultSet rs=st.executeQuery(sql); 
            TableColumnModel columnModel = allHisTbl.getColumnModel();
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }  
        }
            else
            {
            try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");;         
            Statement st=con.createStatement();         
            sql = "SELECT Branch, Action,Categ as Classification,Name,Perf as PerformedBy,SDate as StartDate,EDate as EndDate,STime as StartTime,ETime as EndTime,Price,Remarks,HIS_ID as ID FROM dbo.History  WHERE CONVERT(VARCHAR(50),SDAte, 126) BETWEEN '"+startD+"%' AND '"+endD+"%' AND Categ = '"+Branch2+"' ORDER BY HIS_ID";  
            ResultSet rs=st.executeQuery(sql); 
            TableColumnModel columnModel = allHisTbl.getColumnModel();
            allHisTbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
                }
            catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
            JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }  
}}
        allHisTbl.setRowSelectionInterval(0,0);
        hisSet();
}

//End of Sort Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Data Archives Functions------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void PCaddArchives(){
String s1 = compBran.getText();
String s2 = compDept.getText();
String s3 = compName.getText();
String s4 = compProc.getText();
String s5 = compRam.getText();
String s6 = compHdd.getText();
String s7 = compUps.getText();
String s8 = compRem.getText();
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="INSERT INTO dbo.pcArchives VALUES ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+dt.format(date)+"','"+tm.format(time)+"')";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('AddArchives', 'Computer','"+s1+"-"+s2+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Sent to Archives"); 
//refreshPC();
}
public void CCaddArchives(){
String s1 = ccBran.getText();
String s2 = ccSupp.getText();
String s3 = ccUN.getText();
String s4 = ccPW.getText();
String s5 = ccNum.getText();
/*
String s6 = ccRem.getText();
*/
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="INSERT INTO dbo.ccArchives VALUES ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+dt.format(date)+"','"+tm.format(time)+"')";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('AddArchives', 'CCTV','"+s1+"-"+s2+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Sent to Archives"); 
//refreshCC();    
}
public void PRaddArchives(){
String s1 = prBran.getText();
String s2 = prManu.getText();
String s3 = prName.getText();
String s4 = prDept.getText();
/*
String s5 = prRem.getText();
*/
try{
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Newnemar", "sa", "123");           
        DateFormat dt = new SimpleDateFormat("MMM/dd/yy");
        Date date = new Date();
        DateFormat tm = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);      
 String sql ="INSERT INTO dbo.prArchives VALUES ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+dt.format(date)+"','"+tm.format(time)+"')";         
st.execute(sql);

Statement sta = con.createStatement();
            String newsql = "INSERT INTO dbo.Logs (Action,Categ,Item,Date,Time) VALUES ('AddArchives', 'Printer','"+s1+"-"+s4+"-"+s3+"','"+dt.format(date)+"','"+tm.format(time)+"')";
            sta.execute(newsql);
}
 catch (SQLException ex) {    
JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage()); 
JOptionPane.showMessageDialog(null,"SQLState: " + ex.getSQLState()); 
 }
JOptionPane.showMessageDialog(null,"Sent to Archives"); 
//refreshPR();    
}
//End of Data Archive Functions------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Setting Text Box Editable------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void ccEditable(){
ccBran.setEditable(true);
ccSupp.setEditable(true);
ccUN.setEditable(true);
ccPW.setEditable(true);
ccNum.setEditable(true);
ccRem.setEditable(true);
ccUpdate.setVisible(true);
ccEdit.setVisible(false);
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
//End of Text Box Editable Function------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Setting Text Box Non-Editable------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void ccNonEditable(){
ccBran.setEditable(false);
ccSupp.setEditable(false);
ccUN.setEditable(false);
ccPW.setEditable(false);
ccNum.setEditable(false);
ccRem.setEditable(false); 
ccUpdate.setVisible(false);
ccEdit.setVisible(true);
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
public void initEdit(){
pcNonEditable();
ccNonEditable();
prNonEditable();
}
//End of Text Box non-Editable function------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//Table component count------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void CCcount(){
int rowCount = ccTbl.getRowCount();
countCC.setText(String.valueOf(rowCount));
}
public void PRcount(){
int rowCount = prTbl.getRowCount();
countPR.setText(String.valueOf(rowCount));
}

public void CChiscount(){
int rowCount = hisTbl2.getRowCount();
countHis3.setText(String.valueOf(rowCount));
}
public void PRhiscount(){
int rowCount = hisTbl3.getRowCount();
countHis2.setText(String.valueOf(rowCount));
}
public void Hiscount(){
int rowCount = allHisTbl.getRowCount();
countHis5.setText(String.valueOf(rowCount));
}
public void ALogcount(){
int rowCount = actlogTbl.getRowCount();
actLogCnt.setText(
        String.valueOf(rowCount));
}
public void ULogcount(){
int rowCount = userlogTbl.getRowCount();
uLogCnt.setText(String.valueOf(rowCount));
}
//End of Text Box non-Editable function------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//THIS IS FOR TABLE FILTER AND SEARCHING----------------------------------------------------------------------------------------------------------------------------------------------------

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//END-OF-FUNCTIONS---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
}

