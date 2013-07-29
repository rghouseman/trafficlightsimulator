
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class TrafficStatFrame extends javax.swing.JFrame {

    public TrafficStatFrame() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        NHeader = new javax.swing.JTextField();
        NHeader.setBackground(Color.GREEN);
        SHeader = new javax.swing.JTextField();
        SHeader.setBackground(Color.GREEN);
        EHeader = new javax.swing.JTextField();
        EHeader.setBackground(Color.RED);
        WHeader = new javax.swing.JTextField();
        WHeader.setBackground(Color.RED);
        THeader = new javax.swing.JTextField();
        NHeader.setBackground(Color.GREEN);
        Thrutag = new javax.swing.JTextField();
        Thrutag1 = new javax.swing.JTextField();
        Thrutag2 = new javax.swing.JTextField();
        Thrutag3 = new javax.swing.JTextField();
        Thrutag4 = new javax.swing.JTextField();
        CurPlate = new javax.swing.JLabel();
        CurPlate1 = new javax.swing.JLabel();
        CurPlate3 = new javax.swing.JLabel();
        CurPlate2 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        Total1 = new javax.swing.JTextField();
        Total2 = new javax.swing.JTextField();
        Total3 = new javax.swing.JTextField();
        Total4 = new javax.swing.JTextField();
        ThruPic = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon("CAR1.jpg");
        Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon.setImage(image);
        ThruPic.setIcon(icon);
        ThruPic1 = new javax.swing.JLabel();
        ImageIcon icon1 = new ImageIcon("CAR1.jpg");
        Image image1 = icon1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon1.setImage(image1);
        ThruPic1.setIcon(icon1);
        ThruPic2 = new javax.swing.JLabel();
        ImageIcon icon2 = new ImageIcon("CAR1.jpg");
        Image image2 = icon2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon2.setImage(image2);
        ThruPic2.setIcon(icon2);
        ThruPic3 = new javax.swing.JLabel();
        ImageIcon icon3 = new ImageIcon("CAR1.jpg");
        Image image3 = icon3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon3.setImage(image3);
        ThruPic3.setIcon(icon3);
        ThruPic4 = new javax.swing.JLabel();
        ImageIcon icon4 = new ImageIcon("CAR1.jpg");
        Image image4 = icon4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon4.setImage(image4);
        ThruPic4.setIcon(icon4);
        jScrollPane6 = new javax.swing.JScrollPane();
        SouthQueue = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        NorthQueue = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        WestQueue = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        EastQueue = new javax.swing.JTable();
        NorthWait = new javax.swing.JLabel();
        SouthWait = new javax.swing.JLabel();
        EastWait = new javax.swing.JLabel();
        WestWait = new javax.swing.JLabel();
        AvWait = new javax.swing.JLabel();
        Navg = new javax.swing.JLabel();
        Savg = new javax.swing.JLabel();
        Eavg = new javax.swing.JLabel();
        Wavg = new javax.swing.JLabel();
        Cavg = new javax.swing.JLabel();
        NB = new javax.swing.JLabel();
        SB = new javax.swing.JLabel();
        EB = new javax.swing.JLabel();
        WB = new javax.swing.JLabel();
        CT = new javax.swing.JLabel();
        Seconds = new javax.swing.JLabel();
        Seconds1 = new javax.swing.JLabel();
        Seconds2 = new javax.swing.JLabel();
        Seconds3 = new javax.swing.JLabel();
        Seconds4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NorthLog = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        SouthLog = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        EastLog = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        WestLog = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        TotalLog = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Intersection Monitor");

        NHeader.setEditable(false);
        NHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NHeader.setForeground(new java.awt.Color(255, 255, 255));
        NHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NHeader.setText("North Bound");
        NHeader.setBounds(40, 30, 220, 40);
        jLayeredPane1.add(NHeader, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SHeader.setEditable(false);
        SHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SHeader.setForeground(new java.awt.Color(255, 255, 255));
        SHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SHeader.setText("South Bound");
        SHeader.setBounds(290, 30, 220, 40);
        jLayeredPane1.add(SHeader, javax.swing.JLayeredPane.DEFAULT_LAYER);

        EHeader.setEditable(false);
        EHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EHeader.setForeground(new java.awt.Color(255, 255, 255));
        EHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EHeader.setText("East Bound");
        EHeader.setBounds(540, 30, 220, 40);
        jLayeredPane1.add(EHeader, javax.swing.JLayeredPane.DEFAULT_LAYER);

        WHeader.setEditable(false);
        WHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WHeader.setForeground(new java.awt.Color(255, 255, 255));
        WHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WHeader.setText("West Bound");
        WHeader.setBounds(790, 30, 220, 40);
        jLayeredPane1.add(WHeader, javax.swing.JLayeredPane.DEFAULT_LAYER);

        THeader.setEditable(false);
        THeader.setBackground(new java.awt.Color(0, 0, 0));
        THeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        THeader.setForeground(new java.awt.Color(255, 255, 255));
        THeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        THeader.setText("Cumulative");
        THeader.setBounds(1040, 30, 220, 40);
        jLayeredPane1.add(THeader, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Thrutag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Thrutag.setText("THRU");
        Thrutag.setBorder(null);
        Thrutag.setBounds(60, 180, 69, 22);
        jLayeredPane1.add(Thrutag, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Thrutag1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Thrutag1.setText("THRU");
        Thrutag1.setBorder(null);
        Thrutag1.setBounds(310, 180, 69, 22);
        jLayeredPane1.add(Thrutag1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Thrutag2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Thrutag2.setText("THRU");
        Thrutag2.setBorder(null);
        Thrutag2.setBounds(560, 180, 69, 22);
        jLayeredPane1.add(Thrutag2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Thrutag3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Thrutag3.setText("THRU");
        Thrutag3.setBorder(null);
        Thrutag3.setBounds(810, 180, 69, 22);
        jLayeredPane1.add(Thrutag3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Thrutag4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Thrutag4.setText("THRU");
        Thrutag4.setBorder(null);
        Thrutag4.setBounds(1060, 180, 69, 22);
        jLayeredPane1.add(Thrutag4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CurPlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurPlate.setBounds(160, 180, 70, 20);
        jLayeredPane1.add(CurPlate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CurPlate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurPlate1.setBounds(410, 180, 70, 20);
        jLayeredPane1.add(CurPlate1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CurPlate3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurPlate3.setBounds(910, 180, 70, 20);
        jLayeredPane1.add(CurPlate3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CurPlate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurPlate2.setBounds(660, 180, 70, 20);
        jLayeredPane1.add(CurPlate2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Total.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total.setText("0");
        Total.setBorder(null);
        Total.setBounds(150, 120, 90, 50);
        jLayeredPane1.add(Total, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Total1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Total1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total1.setText("0");
        Total1.setBorder(null);
        Total1.setBounds(400, 120, 90, 50);
        jLayeredPane1.add(Total1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Total2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Total2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total2.setText("0");
        Total2.setBorder(null);
        Total2.setBounds(650, 120, 90, 50);
        jLayeredPane1.add(Total2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Total3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Total3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total3.setText("0");
        Total3.setBorder(null);
        Total3.setBounds(900, 120, 90, 50);
        jLayeredPane1.add(Total3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Total4.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Total4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total4.setText("0");
        Total4.setBorder(null);
        Total4.setBounds(1130, 130, 110, 70);
        jLayeredPane1.add(Total4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ThruPic.setPreferredSize(new java.awt.Dimension(80, 80));
        ThruPic.setBounds(50, 120, 90, 60);
        jLayeredPane1.add(ThruPic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ThruPic1.setPreferredSize(new java.awt.Dimension(80, 80));
        ThruPic1.setBounds(300, 120, 90, 60);
        jLayeredPane1.add(ThruPic1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ThruPic2.setPreferredSize(new java.awt.Dimension(80, 80));
        ThruPic2.setBounds(550, 120, 90, 60);
        jLayeredPane1.add(ThruPic2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ThruPic3.setPreferredSize(new java.awt.Dimension(80, 80));
        ThruPic3.setBounds(800, 120, 90, 60);
        jLayeredPane1.add(ThruPic3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ThruPic4.setPreferredSize(new java.awt.Dimension(80, 80));
        ThruPic4.setBounds(1050, 120, 90, 60);
        jLayeredPane1.add(ThruPic4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SouthQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "}
            },
            new String [] {
                "ID #", "Wait (sec)"
            }
        ));
        jScrollPane6.setViewportView(SouthQueue);

        jScrollPane6.setBounds(310, 300, 180, 190);
        jLayeredPane1.add(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NorthQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " "},
                {" ", "  "},
                {" ", " "},
                {" ", " "},
                {"  ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "}
            },
            new String [] {
                "ID #", "Wait (sec)"
            }
        ));
        jScrollPane7.setViewportView(NorthQueue);

        jScrollPane7.setBounds(60, 300, 180, 190);
        jLayeredPane1.add(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        WestQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "}
            },
            new String [] {
                "ID #", "Wait (sec)"
            }
        ));
        jScrollPane8.setViewportView(WestQueue);

        jScrollPane8.setBounds(810, 300, 180, 190);
        jLayeredPane1.add(jScrollPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        EastQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "},
                {" ", " "}
            },
            new String [] {
                "ID #", "Wait (sec)"
            }
        ));
        jScrollPane9.setViewportView(EastQueue);

        jScrollPane9.setBounds(560, 300, 180, 190);
        jLayeredPane1.add(jScrollPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NorthWait.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NorthWait.setForeground(new java.awt.Color(255, 255, 255));
        NorthWait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NorthWait.setText("Current Queue");
        NorthWait.setToolTipText("");
        NorthWait.setBounds(100, 270, 100, 20);
        jLayeredPane1.add(NorthWait, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SouthWait.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SouthWait.setForeground(new java.awt.Color(255, 255, 255));
        SouthWait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SouthWait.setText("Current Queue");
        SouthWait.setToolTipText("");
        SouthWait.setBounds(350, 270, 100, 20);
        jLayeredPane1.add(SouthWait, javax.swing.JLayeredPane.DEFAULT_LAYER);

        EastWait.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EastWait.setForeground(new java.awt.Color(255, 255, 255));
        EastWait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EastWait.setText("Current Queue");
        EastWait.setToolTipText("");
        EastWait.setBounds(600, 270, 100, 20);
        jLayeredPane1.add(EastWait, javax.swing.JLayeredPane.DEFAULT_LAYER);

        WestWait.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        WestWait.setForeground(new java.awt.Color(255, 255, 255));
        WestWait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WestWait.setText("Current Queue");
        WestWait.setToolTipText("");
        WestWait.setBounds(850, 270, 100, 20);
        jLayeredPane1.add(WestWait, javax.swing.JLayeredPane.DEFAULT_LAYER);

        AvWait.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AvWait.setForeground(new java.awt.Color(255, 255, 255));
        AvWait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvWait.setText("Average Wait TImes");
        AvWait.setToolTipText("");
        AvWait.setBounds(1070, 270, 160, 20);
        jLayeredPane1.add(AvWait, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Navg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Navg.setForeground(new java.awt.Color(255, 255, 255));
        Navg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Navg.setText("0");
        Navg.setToolTipText("");
        Navg.setBounds(1150, 320, 30, 20);
        jLayeredPane1.add(Navg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Savg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Savg.setForeground(new java.awt.Color(255, 255, 255));
        Savg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Savg.setText("0");
        Savg.setToolTipText("");
        Savg.setBounds(1150, 350, 30, 20);
        jLayeredPane1.add(Savg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Eavg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Eavg.setForeground(new java.awt.Color(255, 255, 255));
        Eavg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eavg.setText("0");
        Eavg.setToolTipText("");
        Eavg.setBounds(1150, 380, 30, 20);
        jLayeredPane1.add(Eavg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Wavg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wavg.setForeground(new java.awt.Color(255, 255, 255));
        Wavg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wavg.setText("0");
        Wavg.setToolTipText("");
        Wavg.setBounds(1150, 410, 30, 20);
        jLayeredPane1.add(Wavg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cavg.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cavg.setForeground(new java.awt.Color(255, 255, 255));
        Cavg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cavg.setText("0");
        Cavg.setToolTipText("");
        Cavg.setBounds(1150, 460, 30, 20);
        jLayeredPane1.add(Cavg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NB.setForeground(new java.awt.Color(255, 255, 255));
        NB.setText("North Bound   -");
        NB.setBounds(1060, 320, 100, 20);
        jLayeredPane1.add(NB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SB.setForeground(new java.awt.Color(255, 255, 255));
        SB.setText("South Bound   -");
        SB.setBounds(1060, 350, 100, 20);
        jLayeredPane1.add(SB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        EB.setForeground(new java.awt.Color(255, 255, 255));
        EB.setText("East Bound    -");
        EB.setBounds(1060, 380, 100, 20);
        jLayeredPane1.add(EB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        WB.setForeground(new java.awt.Color(255, 255, 255));
        WB.setText("West Bound   -");
        WB.setBounds(1060, 410, 100, 20);
        jLayeredPane1.add(WB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CT.setForeground(new java.awt.Color(255, 255, 255));
        CT.setText("Cumulative    -");
        CT.setToolTipText("");
        CT.setBounds(1050, 460, 100, 20);
        jLayeredPane1.add(CT, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seconds.setForeground(new java.awt.Color(255, 255, 255));
        Seconds.setText("seconds");
        Seconds.setToolTipText("");
        Seconds.setBounds(1190, 350, 60, 20);
        jLayeredPane1.add(Seconds, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seconds1.setForeground(new java.awt.Color(255, 255, 255));
        Seconds1.setText("seconds");
        Seconds1.setToolTipText("");
        Seconds1.setBounds(1190, 380, 60, 20);
        jLayeredPane1.add(Seconds1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seconds2.setForeground(new java.awt.Color(255, 255, 255));
        Seconds2.setText("seconds");
        Seconds2.setToolTipText("");
        Seconds2.setBounds(1190, 410, 60, 20);
        jLayeredPane1.add(Seconds2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seconds3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Seconds3.setForeground(new java.awt.Color(255, 255, 255));
        Seconds3.setText("seconds");
        Seconds3.setToolTipText("");
        Seconds3.setBounds(1200, 460, 60, 20);
        jLayeredPane1.add(Seconds3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seconds4.setForeground(new java.awt.Color(255, 255, 255));
        Seconds4.setText("seconds");
        Seconds4.setToolTipText("");
        Seconds4.setBounds(1190, 320, 60, 20);
        jLayeredPane1.add(Seconds4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(5, 5, 47));
        jLabel2.setOpaque(true);
        jLabel2.setBounds(1040, 260, 220, 260);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setBackground(new java.awt.Color(5, 5, 47));
        jLabel3.setOpaque(true);
        jLabel3.setBounds(540, 260, 220, 260);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setBackground(new java.awt.Color(5, 5, 47));
        jLabel4.setOpaque(true);
        jLabel4.setBounds(790, 260, 220, 260);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setBackground(new java.awt.Color(5, 5, 47));
        jLabel5.setOpaque(true);
        jLabel5.setBounds(40, 260, 220, 260);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(5, 5, 47));
        jLabel6.setOpaque(true);
        jLabel6.setBounds(290, 260, 220, 260);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane1.setHorizontalScrollBar(null);

        NorthLog.setEditable(false);
        NorthLog.setColumns(20);
        NorthLog.setRows(5);
        jScrollPane1.setViewportView(NorthLog);

        jScrollPane1.setBounds(40, 70, 220, 450);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane2.setHorizontalScrollBar(null);

        SouthLog.setEditable(false);
        SouthLog.setColumns(20);
        SouthLog.setRows(5);
        jScrollPane2.setViewportView(SouthLog);

        jScrollPane2.setBounds(290, 70, 220, 450);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane3.setHorizontalScrollBar(null);

        EastLog.setEditable(false);
        EastLog.setColumns(20);
        EastLog.setRows(5);
        jScrollPane3.setViewportView(EastLog);

        jScrollPane3.setBounds(540, 70, 220, 450);
        jLayeredPane1.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane4.setHorizontalScrollBar(null);

        WestLog.setEditable(false);
        WestLog.setColumns(20);
        WestLog.setRows(5);
        jScrollPane4.setViewportView(WestLog);

        jScrollPane4.setBounds(790, 70, 220, 450);
        jLayeredPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane5.setHorizontalScrollBar(null);

        TotalLog.setEditable(false);
        TotalLog.setColumns(20);
        TotalLog.setRows(5);
        jScrollPane5.setViewportView(TotalLog);

        jScrollPane5.setBounds(1040, 70, 220, 450);
        jLayeredPane1.add(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-01.jpg"))); // NOI18N
        jLabel1.setBounds(1, 0, 1300, 550);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvWait;
    private javax.swing.JLabel CT;
    public static javax.swing.JLabel Cavg;
    public static javax.swing.JLabel CurPlate;
    public static javax.swing.JLabel CurPlate1;
    public static javax.swing.JLabel CurPlate2;
    public static javax.swing.JLabel CurPlate3;
    private javax.swing.JLabel EB;
    public static javax.swing.JTextField EHeader;
    public static javax.swing.JTextArea EastLog;
    public static javax.swing.JTable EastQueue;
    private javax.swing.JLabel EastWait;
    public static javax.swing.JLabel Eavg;
    private javax.swing.JLabel NB;
    public static javax.swing.JTextField NHeader;
    public static javax.swing.JLabel Navg;
    public static javax.swing.JTextArea NorthLog;
    public static javax.swing.JTable NorthQueue;
    private javax.swing.JLabel NorthWait;
    private javax.swing.JLabel SB;
    public static javax.swing.JTextField SHeader;
    public static javax.swing.JLabel Savg;
    private javax.swing.JLabel Seconds;
    private javax.swing.JLabel Seconds1;
    private javax.swing.JLabel Seconds2;
    private javax.swing.JLabel Seconds3;
    private javax.swing.JLabel Seconds4;
    public static javax.swing.JTextArea SouthLog;
    public static javax.swing.JTable SouthQueue;
    private javax.swing.JLabel SouthWait;
    public static javax.swing.JTextField THeader;
    public javax.swing.JLabel ThruPic;
    public javax.swing.JLabel ThruPic1;
    public javax.swing.JLabel ThruPic2;
    public javax.swing.JLabel ThruPic3;
    public javax.swing.JLabel ThruPic4;
    private javax.swing.JTextField Thrutag;
    private javax.swing.JTextField Thrutag1;
    private javax.swing.JTextField Thrutag2;
    private javax.swing.JTextField Thrutag3;
    private javax.swing.JTextField Thrutag4;
    public static javax.swing.JTextField Total;
    public static javax.swing.JTextField Total1;
    public static javax.swing.JTextField Total2;
    public static javax.swing.JTextField Total3;
    public static javax.swing.JTextField Total4;
    public static javax.swing.JTextArea TotalLog;
    private javax.swing.JLabel WB;
    public static javax.swing.JTextField WHeader;
    public static javax.swing.JLabel Wavg;
    public static javax.swing.JTextArea WestLog;
    public static javax.swing.JTable WestQueue;
    private javax.swing.JLabel WestWait;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables



}
