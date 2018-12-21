import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class Main extends JFrame {

    private JPanel contentPane;
    //	private String colTitl[]= {"ÀÛ¾÷ ¸í¼¼", "»ó¼¼ ÀÛ¾÷ ³»¿ë"};
    private String colTitl[] = {"Job Description", "Job Details"};
    //	private String colName[]= {"ÇÏ¿ì½º", "ÀÛ¾÷ÀÏÀÚ", "ÀÛ¾÷½Ã°£", "ÀÛ¾÷ÀÚ", "ÀÛ¾÷ÀÚ ¿Ü ¸î¸í", "ÀÛ¾÷ ³»¿ë 1", "ÀÛ¾÷ ³»¿ë 2", "ÀÛ¾÷ ³»¿ë 3", "ÀÛ¾÷ ³»¿ë 4", "ÀÛ¾÷ ³»¿ë 5", "±âÅ¸ »çÇ×"};
    private String colName[] = {"House No.", "Work Date", "Work Time", "Worker Name", "No. of Worker", "Work Contents 1", "Work Contents 2", "Work Contents 3", "Work Contents 4", "Work Contents 5", "Other Details"};
    ComboBoxModel FarmHouse = new DefaultComboBoxModel(new String[]{"Select House", "A-Dong", "B-Dong", "C-Dong", "D-Dong", "E-Dong", "F-Dong", "G-Dong", "H-Dong", "I-Dong", "J-Dong"});
    ComboBoxModel ComboHouse = new DefaultComboBoxModel(new String[]{"Select House", "A-Dong", "B-Dong", "C-Dong", "D-Dong", "E-Dong", "F-Dong", "G-Dong", "H-Dong", "I-Dong", "J-Dong"});
    private DefaultTableModel model = new DefaultTableModel(colName, 0);
    private JTable table = new JTable(model);

    static String Work_Data[] = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String getFarmItmes[] = {"0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String getFarmVaris[] = {"0", "0", "0", "0", "0", "0", "0", "0", "0"};

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 1500, 1000);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
//
        JLabel lmaintitle = new JLabel("Farm Work Log");
        lmaintitle.setBorder(new LineBorder(new Color(0, 0, 0)));
        lmaintitle.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 30));
        lmaintitle.setHorizontalAlignment(SwingConstants.CENTER);
        lmaintitle.setForeground(Color.BLUE);
        lmaintitle.setBounds(410, 31, 600, 41);
        contentPane.add(lmaintitle);
//
//Á¶È¸ Panel
        JLabel sItemtitl = new JLabel("Work Date");
        sItemtitl.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_SubTitle(contentPane, sItemtitl, 1156, 100, 100, 23, Color.BLUE, Color.lightGray);

        JTextField WorkDay = new JTextField(null);
        WorkDay.setHorizontalAlignment(SwingConstants.CENTER);
        WorkDay.setBounds(1256, 100, 100, 23);
        contentPane.add(WorkDay);

        JButton btnInputs = new JButton("Search");
        btnInputs.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
        btnInputs.setForeground(Color.RED);
//		btnInputs.setBackground(SystemColor.inactiveCaption);
        btnInputs.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnInputs.setBounds(1360, 100, 120, 23);
        contentPane.add(btnInputs);

        btnInputs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.addRow(Work_Data);
/*			   String[] sRow= new String[35];
			   for(int j= 0; j<100; j++) {
				   for(int i=0; i< 35; i++) {
					   sRow[i]= String.format("%d", i+j);
				   }
				   model.addRow(sRow);
			   }
//			   InputtoFarm();
//				setContentPane(contentPane);
*/
            }
        });
//
        JLabel lcompany = new JLabel("Copy right to --- Sein Tech Co., Ltd. (TEL : +82-033-823-9509, FAX : +82-033-823-9609, Home Page : //www.sein-tech.co.kr");
        lcompany.setBorder(new LineBorder(new Color(0, 0, 0)));                            //
        lcompany.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));                    //
        lcompany.setHorizontalAlignment(SwingConstants.LEFT);                            //
        lcompany.setBackground(Color.LIGHT_GRAY);                                        //
        lcompany.setForeground(Color.BLUE);                                                //
        lcompany.setBounds(192, 945, 1279, 15);                                            //
        contentPane.add(lcompany);
/*
		JPanel panel = new JPanel();
//		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(5, 150, 1475, 500);
		contentPane.add(panel);
		panel.setLayout(null);
*/
        JLabel lItemtitl = new JLabel(colTitl[0]);
        lItemtitl.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_SubTitle(contentPane, lItemtitl, 5, 125, 322, 23, Color.BLUE, Color.lightGray);

        JLabel lTemptitl = new JLabel(colTitl[1]);
        lTemptitl.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_SubTitle(contentPane, lTemptitl, 323, 125, 1157, 23, Color.BLUE, Color.lightGray);

//Á¶È¸ panel
        JPanel panel0 = new JPanel();
        panel0.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel0.setLayout(new BorderLayout());
        panel0.add(table, BorderLayout.CENTER);
        panel0.setBounds(5, 150, 1475, 630);
        contentPane.add(panel0);

//Search data display table
//		JTable table= null;
        table = new JTable(model);
        JScrollPane scrollpane = new JScrollPane(table);
        table.setBounds(30, 40, 1000, 400);
//		Dimension dim= new Dimension(500, 500);
//		table.setPreferredSize(dim);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(90);
        table.getColumnModel().getColumn(2).setPreferredWidth(90);
        table.getColumnModel().getColumn(3).setPreferredWidth(90);
        table.getColumnModel().getColumn(4).setPreferredWidth(90);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);
        table.getColumnModel().getColumn(6).setPreferredWidth(200);
        table.getColumnModel().getColumn(7).setPreferredWidth(200);
        table.getColumnModel().getColumn(8).setPreferredWidth(200);
        table.getColumnModel().getColumn(9).setPreferredWidth(200);
        table.getColumnModel().getColumn(10).setPreferredWidth(150);

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
//		renderer.setVerticalAlignment((int) JTable.CENTER_ALIGNMENT);
//		renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);

        table.getColumnModel().getColumn(0).setCellRenderer(renderer);
        table.getColumnModel().getColumn(1).setCellRenderer(renderer);
        table.getColumnModel().getColumn(2).setCellRenderer(renderer);
        table.getColumnModel().getColumn(3).setCellRenderer(renderer);
        table.getColumnModel().getColumn(4).setCellRenderer(renderer);
        table.getColumnModel().getColumn(5).setCellRenderer(renderer);
        table.getColumnModel().getColumn(6).setCellRenderer(renderer);
        table.getColumnModel().getColumn(7).setCellRenderer(renderer);
        table.getColumnModel().getColumn(8).setCellRenderer(renderer);
        table.getColumnModel().getColumn(9).setCellRenderer(renderer);
        table.getColumnModel().getColumn(10).setCellRenderer(renderer);
        panel0.add(scrollpane);
        contentPane.add(panel0);


        /*
         * Filling the Table
         * */
        List<WorkDiary> workDiaries = DbHandler.getInstance().getWorkDiaries();

        for (WorkDiary wd : workDiaries) {
            ((DefaultTableModel) table.getModel()).addRow(new Object[]{
                    wd.getHous_Name(),
                    wd.getWorkDiary(), //we don't have any work date in database
                    wd.getWork_time(),
                    wd.getWork_man(),
                    wd.getWork_empl(),
                    wd.getWork_cont1(),
                    wd.getWork_cont2(),
                    wd.getWork_cont3(),
                    wd.getWork_cont4(),
                    wd.getWork_cont5(),
                    wd.getWork_contetc()
            });
        }


//Input Panel
        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel1.setBounds(5, 830, 1475, 50);
        contentPane.add(panel1);
        panel1.setLayout(new BorderLayout());
        GridBagLayout gbl_pnl1 = new GridBagLayout();
        panel1.setLayout(gbl_pnl1);

        GridBagConstraints gbc_pnl1 = new GridBagConstraints();
        gbc_pnl1.fill = GridBagConstraints.BOTH;
//		gbc_pnl4.insets= new Insets(1, 1, 1, 1);
        gbc_pnl1.weightx = 1.0;
        gbc_pnl1.weighty = 1.0;
        gbl_pnl1.setConstraints(panel1, gbc_pnl1);

        JLabel sHousName = new JLabel(colName[0]);
        sHousName.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sHousName, 0, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JLabel HousName = new JLabel("");
        HousName.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, HousName, 0, 1, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JLabel sWork_time = new JLabel(colName[2]);
        sWork_time.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_time, 1, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_time = new JTextField(null);
        Work_time.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_time, 1, 1, 1, 1);

        JLabel sWork_man = new JLabel(colName[3]);
        sWork_man.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_man, 2, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_man = new JTextField(null);
        Work_man.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_man, 2, 1, 1, 1);

        JLabel sWork_empl = new JLabel(colName[4]);
        sWork_empl.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_empl, 3, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_empl = new JTextField(null);
        Work_empl.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_empl, 3, 1, 1, 1);

        JLabel sWork_cont1 = new JLabel(colName[5]);
        sWork_cont1.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_cont1, 4, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_cont1 = new JTextField(null);
        Work_cont1.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_cont1, 4, 1, 1, 1);

        JLabel sWork_cont2 = new JLabel(colName[6]);
        sWork_cont2.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_cont2, 5, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_cont2 = new JTextField(null);
        Work_cont2.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_cont2, 5, 1, 1, 1);

        JLabel sWork_cont3 = new JLabel(colName[7]);
        sWork_cont3.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_cont3, 6, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_cont3 = new JTextField(null);
        Work_cont3.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_cont3, 6, 1, 1, 1);

        JLabel sWork_cont4 = new JLabel(colName[8]);
        sWork_cont4.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_cont4, 7, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_cont4 = new JTextField(null);
        Work_cont4.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_cont4, 7, 1, 1, 1);

        JLabel sWork_cont5 = new JLabel(colName[9]);
        sWork_cont5.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_cont5, 8, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_cont5 = new JTextField(null);
        Work_cont5.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_cont5, 8, 1, 1, 1);

        JLabel sWork_contetc = new JLabel(colName[10]);
        sWork_contetc.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_Title(panel1, gbc_pnl1, sWork_contetc, 9, 0, 1, 1, Color.BLACK, Color.LIGHT_GRAY);

        JTextField Work_contetc = new JTextField(null);
        Work_contetc.setHorizontalAlignment(SwingConstants.CENTER);
        addCom(panel1, gbc_pnl1, Work_contetc, 9, 1, 1, 1);

//ÀÔ·Â/¼öÁ¤ panel
        JLabel sItemDate = new JLabel("Work Date");
        sItemDate.setHorizontalAlignment(SwingConstants.CENTER);
        addCom_SubTitle(contentPane, sItemDate, 1056, 805, 100, 23, Color.BLUE, Color.lightGray);

        JTextField Work_Days = new JTextField(null);
        Work_Days.setHorizontalAlignment(SwingConstants.CENTER);
        Work_Days.setBounds(1156, 805, 100, 23);
        contentPane.add(Work_Days);

        JComboBox comboHouse = new JComboBox();
        comboHouse.setModel(FarmHouse);
        comboHouse.setBounds(1256, 805, 100, 23);
        contentPane.add(comboHouse);
        comboHouse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    Work_Data[0] = (String) comboHouse.getSelectedItem();
                    HousName.setText((String) comboHouse.getSelectedItem());
//					comboitems
                } catch (NumberFormatException e1) {
                }
            }
        });

        JButton btnInput = new JButton("Save");
        btnInput.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 12));
        btnInput.setForeground(Color.RED);
//		btnInput.setBackground(SystemColor.inactiveCaption);
        btnInput.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnInput.setBounds(1360, 805, 120, 23);
        contentPane.add(btnInput);

        btnInput.addActionListener(e -> {
//			   Work_Data[0]= Hous_Name.getText();
            Work_Data[1] = Work_Days.getText();
            Work_Data[2] = Work_time.getText();
            Work_Data[3] = Work_man.getText();
            Work_Data[4] = Work_empl.getText();
            Work_Data[5] = Work_cont1.getText();
            Work_Data[6] = Work_cont2.getText();
            Work_Data[7] = Work_cont3.getText();
            Work_Data[8] = Work_cont4.getText();
            Work_Data[9] = Work_cont5.getText();
            Work_Data[10] = Work_contetc.getText();
            for (int i = 0; i < 10; i++) {
                System.out.println(Work_Data[i]);
            }
            String data = Work_Data[1];
            if (Work_Data[0].equals("") || Work_Data[2].equals("")) {
                JOptionPane.showMessageDialog(null, "ÇÏ¿ì½º ¼±ÅÃ, ÀÛ¾÷ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä", "ÀÔ·Â ¿À·ù", JOptionPane.ERROR_MESSAGE);
            } else {
                Connection conn;
                Statement stmt = null;
                int rst = 0;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc.mysql://localhost:3306/WorkDiary", "root", "Sein0704");
                    System.out.println("DB ¿¬°á ¿Ï·á");
                    stmt = (Statement) conn.createStatement();
                    ((Connection) stmt).close();
                    conn.close();
                } catch (ClassNotFoundException e1) {
                    System.out.println("JDBC µå¶óÀÌ¹ö ·Îµå ¿¡·¯");
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    System.out.println("DB ¿¬°á ½ÇÆÐ" + e1.getMessage());
                }
            }
            add(btnInput);
//				setContentPane(contentPane);
        });
    }

    public void addCom_Title(JPanel p, GridBagConstraints g, Component c, int x, int y, int w, int h, Color cgb, Color cgf) {
        g.gridx = x;
        g.gridy = y;
        g.gridwidth = w;
        g.gridheight = h;
        ((JComponent) c).setOpaque(true);
        ((JComponent) c).setFont(new Font("±¼¸²", Font.BOLD | Font.PLAIN, 12));
        ((JComponent) c).setBorder(new LineBorder(new Color(0, 0, 0)));
        ((JComponent) c).setBackground(cgf);
        ((JComponent) c).setForeground(cgb);
        ((JComponent) c).setBounds(x, y, w, h);
        p.add(c, g);
    }

    public void addCom_SubTitle(JPanel p, Component c, int x, int y, int w, int h, Color cgf, Color cgb) {
        ((JComponent) c).setOpaque(true);
        ((JComponent) c).setFont(new Font("±¼¸²", Font.BOLD | Font.PLAIN, 12));
        ((JComponent) c).setBorder(new LineBorder(new Color(0, 0, 0)));
        ((JComponent) c).setBackground(cgb);
        ((JComponent) c).setForeground(cgf);
        ((JComponent) c).setBounds(x, y, w, h);
        p.add(c);
    }

    public void addCom_Index(JPanel p, GridBagConstraints g, Component c, int x, int y, int w, int h, Color cgb) {
        g.gridx = x;
        g.gridy = y;
        g.gridwidth = w;
        g.gridheight = h;
        ((JComponent) c).setBorder(new LineBorder(new Color(0, 0, 0)));
        ((JComponent) c).setBackground(cgb);
        ((JComponent) c).setOpaque(true);
        ((JComponent) c).setBackground(cgb);
        ((JTextComponent) c).setEditable(false);
        p.add(c, g);
    }

    public void addCom(JPanel p, GridBagConstraints g, Component c, int x, int y, int w, int h) {
        g.gridx = x;
        g.gridy = y;
        g.gridwidth = w;
        g.gridheight = h;
        ((JComponent) c).setBorder(new LineBorder(new Color(0, 0, 0)));
        ((JComponent) c).setBackground(new Color(210, 255, 255));
        p.add(c, g);
    }
}
