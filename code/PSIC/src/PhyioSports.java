import javax.swing.*;
  import javax.swing.JPanel.*;
  import javax.swing.JTable.*;
 import java.awt.event.*;
 import javax.swing.table.*;
 import java.awt.*;//color
 
 import java.sql.*;
 import java.sql.Connection.*;
 import java.sql.DriverManager.*;

 
 public class PhyioSports
 {
	JFrame jfrm,jfrm1,jfrm2,jfrm3,jfrm4;
	JPanel panel,panel1,panel2,panel3,panel4,panel5,panelxy;
	JButton jbn1,jbn2,jbn3,jbn4,jbn5,jbn6,jbn7,jbn8,jbn9,jback,jbnc;
    	JLabel jlab1,jlab2,jlab3,jlab4,jlab11,jlab12,jlab13,jlab14,jlab15,jlab16,jlab17,jlabc1,jlab6,jlab5,jlab7,jlab8;
	JTextField jtx1,jtx2,jtx3,jtx4,jtx11,jtx12,jtx13,jtx14,jtxc1,jtx6,jtx15,jtx5,jtx7,jtx8;
	 Font f;
	JRadioButton r1 ,r2,r3,r4;
	ImageIcon img=new ImageIcon("Welcome Scan.jpg");
	DefaultTableModel model; 
		JTable jtab ;
		int i;
	
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						PhyioSports L=new PhyioSports();
						L.mgmt();
						
					}
				
				}
		);
	
	}
	public void mgmt()
	{
		jfrm = new JFrame("....Physiotherapy & Sports Injury Centre....");
		jfrm.setSize(1600,1600);
		jfrm.setVisible(true);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setLayout(null);
		
		panelxy=new JPanel();
		panelxy.setBounds(0,0,1300,1300);
		panelxy.setLayout(null);
		
		jfrm.add(panelxy);
		Color c1;
		panel1=new JPanel();
		panel1.setBounds(25,0,1300,200);
		panel1.setLayout(null);
		 c1=new Color(149,183,32);
	
		panel1.setBackground(c1);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		
		panelxy.add(panel1);
		//jfrm.add(panel1);
		//panel1.setPreferredSize(new Dimension(1200,200));
			
		Color c2=new Color(125,134,157);
		
		panel2=new JPanel();
		panel2.setBounds(25,202,1300,200);
		panel2.setBackground(c2);
		//panel.setIconImage("/Welcome Scan.jpg");
		panelxy.add(panel2);
		
		//jfrm.add(panel2);
		//panel2.setPreferredSize(new Dimension(1200,200));
	
		 c2=new Color(82,133,89);
	
		panel3=new JPanel();
		panel3.setLayout(null);	
		panel3.setBounds(25,404,1300,200);
		panel3.setBackground(c2);
		//panel.setIconImage("/Welcome Scan.jpg");
		panelxy.add(panel3);
		
		//jfrm.add(panel3);
		//panel3.setPreferredSize(new Dimension(1200,200));
		
	 c2=new Color(133,82,129);
	
		panel4=new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(25,606,1300,200);
		panel4.setBackground(c2);
		//panel.setIconImage("/Welcome Scan.jpg");
		panelxy.add(panel4);
		
		//jfrm.add(panel4);
	//panel4.setPreferredSize(new Dimension(1200,200));
	
	panel5=new JPanel();
		panel5.setBounds(025,808,1300,200);
		panel5.setLayout(null);
		c1=new Color(216,205,72);
		panel5.setBackground(c1);
		//panel.setIconImage("/Welcome Scan.jpg");
		panelxy.add(panel5);
		
		//jfrm.add(panel5);
		//panel5.setPreferredSize(new Dimension(1200,200));
		
		
	jbn1=new JButton("PATEINT ENTRY");
		jbn1.setBounds(250,70,150,30);
		c1=new Color(200,144,72);
		jbn1.setBackground(c1);
		
		c1=new Color(39,45,237);
		
		jbn1.setForeground(c1);
		panel2.add(jbn1);
		panel2.setLayout(null);
		
	jbn2=new JButton("PHYSICIAN ENTRY");
		jbn2.setBounds(500,70,150,30);
		c1=new Color(200,144,72);
		jbn2.setBackground(c1);
		
			c1=new Color(39,45,237);
	
		jbn2.setForeground(c1);
		panel2.add(jbn2);
		
	jbn3=new JButton("TREATMENTS ENTRY");
		jbn3.setBounds(750,70,150,30);
		c1=new Color(200,144,72);
		jbn3.setBackground(c1);
		
		c1=new Color(39,45,237);
		
		jbn3.setForeground(c1);
		panel2.add(jbn3);
		
	jbn4=new JButton("SEARCH");
		jbn4.setBounds(325,70,150,30);
		c1=new Color(200,144,72);
		jbn4.setBackground(c1);
		
		c1=new Color(16,20,188);
		
		jbn4.setForeground(c1);
		panel3.add(jbn4);
		
		
	jbn5=new JButton("UPADATE");
		jbn5.setBounds(675,70,150,30);
		c1=new Color(200,144,72);
		jbn5.setBackground(c1);
		
		c1=new Color(16,20,188);
		
		jbn5.setForeground(c1);
		panel3.add(jbn5);
		
	jbn6=new JButton("SUBMIT");
		jbn6.setBounds(325,70,150,30);
		c1=new Color(200,144,72);
		jbn6.setBackground(c1);
		
		c1=new Color(16,20,188);
		
		jbn6.setForeground(c1);
		panel4.add(jbn6);
	
	jbn7=new JButton("BOOK TREATMENT");
		jbn7.setBounds(675,70,150,30);
		c1=new Color(200,144,72);
		jbn7.setBackground(c1);
		
		c1=new Color(16,20,188);
		
		jbn7.setForeground(c1);
		panel4.add(jbn7);
		System.out.println("1");
		
		
		jbn8=new JButton("EXIT");
		jbn8.setBounds(325,70,150,30);
		c1=new Color(200,144,72);
		jbn8.setBackground(c1);
		c1=new Color(16,20,188);
		
		jbn8.setForeground(c1);
		panel5.add(jbn8);
		
	jbn9=new JButton("ABOUT US");
		jbn9.setBounds(675,70,150,30);
		c1=new Color(200,144,72);
		jbn9.setBackground(c1);
		c1=new Color(16,20,188);
		jbn9.setForeground(c1);
		panel5.add(jbn9);
		System.out.println("1");
		
		panelxy.setPreferredSize(new Dimension(1600,1600));
			JScrollPane jsp=new JScrollPane(panelxy);
			jsp.setBounds(0,0,1350,1325);
			jfrm.add(jsp);
	jbn1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								PhyioSports b1=new PhyioSports();
								b1.PATIENT_ENTRY();
							
						}
				
					}
			);
					}
		
		});
	
	jbn2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								PhyioSports b1=new PhyioSports();
								b1.PHYSICIAN_ENTRY();
							
						}
				
					}
			);
					}
		
		});
	
	
	
	
	jbn3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
				
				PhyioSports b1=new PhyioSports();
								b1.TREATMENT_ENTRY();
							
						}
				
					}
			);
					}
		
		});
		jbn4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								PhyioSports b1=new PhyioSports();
								b1.SEARCH();
							
						}
				
					}
			);
					}
		
		});
	
	jbn5.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{		
								jfrm.setVisible(false);
								PhyioSports b1=new PhyioSports();
								b1.UPDATE();
							
							
						}
				
					}
			);
					}
		
		});

	jbn6.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
										jfrm.setVisible(false);
								PhyioSports b1=new PhyioSports();
								b1.SUBMIT();
						}
				
					}
			);
					}
		
		});
	
	
	jbn7.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								PhyioSports b1=new PhyioSports();
								b1. DATA_ENTRY();
							
						}
				
					}
			);
					}
		
		});
	jbn8.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								System.exit(0);
							
						}
				
					}
			);
					}
		
		});
		jbn9.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								PhyioSports b1=new PhyioSports();
								b1.ABOUTUS();
							
						}
				
					}
			);
					}
		
		});
	
	
	}
	
 public void PATIENT_ENTRY()
 {
	
		jfrm1=new JFrame("ADD PATIENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		
		jlab1=new JLabel("PATIENT ID");
		Color c1;
		c1=new Color(72,97,111);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab1.setForeground(c1);
		jlab1.setFont(f);
		jlab1.setBounds(300,50,150,30);
		panel2.add(jlab1);
	
		jtx1=new JTextField("ENTER PATIENT ID HERE");
		jtx1.setForeground(c1);
		f=new Font("Lucida Handwriting",Font.PLAIN,11);
		jtx1.setFont(f);
		jtx1.setBounds(550,50,150,30);
		panel2.add(jtx1);
		
		jlab2=new JLabel("ENTER PATIENT NAME");
		c1=new Color(72,97,111);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab2.setForeground(c1);
		jlab2.setFont(f);
		jlab2.setBounds(300,130,200,30);
		panel2.add(jlab2);
	
		jtx2=new JTextField("ENTER PATIENT NAME HERE");
		jtx2.setForeground(c1);
		f=new Font("Lucida Handwriting",Font.PLAIN,11);
		jtx2.setFont(f);
		jtx2.setBounds(550,130,150,30);
		panel2.add(jtx2);
		
		jlab3=new JLabel("ENTER ISSUE ");
		c1=new Color(72,97,111);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab3.setForeground(c1);
		jlab3.setFont(f);
		jlab3.setBounds(300,410,200,30);
		panel2.add(jlab3);
	
		jtx3=new JTextField("ENTER ISSUE HERE ");
		jtx3.setForeground(c1);
		f=new Font("Lucida Handwriting",Font.PLAIN,11);
		jtx3.setFont(f);
		
		jtx3.setBounds(550,410,150,30);
		panel2.add(jtx3);
		
		jbn1 =new JButton("SUBMIT");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(625,480,150,30);
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(200,480,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
							jfrm1.setVisible(false);
							main(s);
					}
			});
			
			
		//
		jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//ID
							s2=jtx2.getText();//lname
							s3=jtx3.getText();//Choose Your username
							s4=jtx4.getText();//Choose Your password
							s5=jtx5.getText();
							s6=jtx6.getText();
						
							String s="insert into PATIENT values('"+s1+"',' "+s2+"','"+s3+"','"+s4+"','"+s5+"','"+"  ','"+s6+"');";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
								
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
			
		
 }
 
 public void PHYSICIAN_ENTRY()
 {
	
		jfrm1=new JFrame("ADD PHYSICIAN DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		jlab1=new JLabel("Physician ID");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(300,50,150,30);
		panel2.add(jlab1);
	
		jtx1=new JTextField("ENTER PHYSICIAN ID HERE");
		jtx1.setForeground(Color.green);
		jtx1.setBounds(550,50,150,30);
		panel2.add(jtx1);
		
		jlab2=new JLabel("ENTER F NAME");
		jlab2.setForeground(Color.green);
		jlab2.setBounds(300,130,150,30);
		panel2.add(jlab2);
	
		jtx2=new JTextField("ENTER F NAME HERE");
		jtx2.setForeground(Color.green);
		jtx2.setBounds(550,130,150,30);
		panel2.add(jtx2);
	
	
		jlab3=new JLabel("ENTER L NAME");
		jlab3.setForeground(Color.green);
		jlab3.setBounds(300,200,150,30);
		panel2.add(jlab3);
	
		jtx3=new JTextField("ENTER L NAME HERE ");
		jtx3.setForeground(Color.green);
		jtx3.setBounds(550,200,150,30);
		panel2.add(jtx3);
	
	
		jlab4=new JLabel("ENTER EXPERTISE");
		jlab4.setForeground(Color.green);
		jlab4.setBounds(300,270,150,30);
		panel2.add(jlab4);
	
		jtx4=new JTextField("ENTER EXPERTISE HERE");
		jtx4.setForeground(Color.green);
		jtx4.setBounds(550,270,150,30);
		panel2.add(jtx4);
		
		jbn1 =new JButton("SUBMIT");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(625,340,150,30);
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(200,340,150,30);
			panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
							jfrm1.setVisible(false);

							main(s);
					}
			});
			
			
			
		jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//ID
							s2=jtx2.getText();//lname
							s3=jtx3.getText();//Choose Your username
							s4=jtx4.getText();//Choose Your password
						String s="insert into student values('"+s1+"',' "+s2+"','"+s3+"','"+s4+"');";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
							
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
		
 }
 

 
 public void TREATMENT_ENTRY()
 {
	
		jfrm1=new JFrame("ADD TREATMENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		jlab1=new JLabel("TREATMENT ID");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(300,50,150,30);
		panel2.add(jlab1);
	
		jtx1=new JTextField("ENTER TREATMENT ID HERE");
		jtx1.setForeground(Color.green);
		jtx1.setBounds(550,50,150,30);
		panel2.add(jtx1);
		
		jlab2=new JLabel("ENTER TREATMENT NAME");
		jlab2.setForeground(Color.green);
		jlab2.setBounds(300,130,150,30);
		panel2.add(jlab2);
	
		jtx2=new JTextField("ENTER TREATMENT NAME HERE");
		jtx2.setForeground(Color.green);
		jtx2.setBounds(550,130,150,30);
		panel2.add(jtx2);
		
		jbn1 =new JButton("SUBMIT");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(625,340,150,30);
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(200,340,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
						main(s);
					}
			});
			
			
			
		jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//ID
							s2=jtx2.getText();//lname
							s3=jtx3.getText();//Choose Your username
							s4=jtx4.getText();//Choose Your password
							String s="insert into patient values('"+s1+"',' "+s2+"','"+s3+"','"+s4+"');";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
							
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
		
 }//end PATIENT ENTRY
 
 
 

 public void SEARCH()
			{
				jfrm1=new JFrame("ADD PATIENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		 f=new Font("Lucida Handwriting",Font.PLAIN,26);
		
		jlab1=new JLabel("SEARCH");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(100,100,160,40);
		jlab1.setFont(f);
		panel2.add(jlab1);
		 				
		r1=new JRadioButton("SEARCH PATIENT");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r1.setBounds(500,100,300,30);
		r1.setFont(f);
		r1.setBackground(Color.cyan);
		r1.setForeground(Color.black);
		panel2.add(r1);
		
		r2=new JRadioButton("SEARCH PHYSICIAN");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r2.setBounds(500,200,400,30);
		r2.setFont(f);
		r2.setBackground(Color.cyan);
		r2.setForeground(Color.black);
		panel2.add(r2);
		
		
		
 r3=new JRadioButton("SEARCH TREATMENT");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r3.setBounds(500,300,300,30);
		r3.setFont(f);
		r3.setBackground(Color.cyan);
		r3.setForeground(Color.black);
		panel2.add(r3);
		
		
		jbn1 =new JButton("SEARCH");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(725,450,150,30);
		
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(225,450,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
								
						main(s);
					}
			});
		
		
		
		r1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								jfrm1.setVisible(false);
								b1.PATIENT();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
		
		
		
		r2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								jfrm1.setVisible(false);
								b1.STUDENT();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
			
		r3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								jfrm1.setVisible(false);
								b1.TREATMENT();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
			
		r4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								jfrm1.setVisible(false);
								b1.LOAN();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
					
 			
 	
 
	}
			  
			public void PATIENT()
			{
				
									jfrm1=new JFrame("SEARCH PATIENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		panelxy=new JPanel();
		panelxy.setLayout(null);
		panelxy.setBounds(0,0,1300,1600);
		jfrm1.add(panelxy);
		
		panel3=new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(025,704,1300,200);
		Color c1;
		c1=new Color(200,55,34);
		panel3.setBackground(c1);
		panelxy.add(panel3);
		
		
		String colHeads[]={"PATIENT ID","PATIENT TITLE","TREATMENT"};
		String  col[][]={{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
		model= new DefaultTableModel(col,colHeads);
		jtab=new JTable(model);
		jtab.setBackground(Color.green);
		
		JScrollPane jsp=new JScrollPane(jtab);
		jsp.setBounds(400,0,600,150);
		panelxy.add(jsp);
		panel3.add(jtab);	

		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		panelxy.add(panel1);
		//jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,500);
		
		panel2.setBackground(Color.cyan);
		panelxy.add(panel2);
		//jfrm1.add(panel2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
	//		panel2.add(buttonGroup);
		f=new Font("Lucida Handwriting",Font.PLAIN,26);
		
		jlab1=new JLabel("SEARCH");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(100,100,160,40);
		jlab1 .setFont(f);
		panel2.add(jlab1);
		 				System.out.println("test");
		
		
		r1=new JRadioButton("SEARCH PATIENT");
		r1.setBounds(400,100,200,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r1.setFont(f);
		r1.setForeground(Color.black);
		r1.setBackground(Color.cyan);
		buttonGroup.add(r1);
		panel2.add(r1);
	
		jlab2=new JLabel();
		jlab2.setBounds(800,100,250,30);
					
		jlab2.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab2.setFont(f);
		panel2.add(jlab2);
		
		jtx1= new JTextField();
		panel2.add(jtx1);
		
		System.out.println("test1");
		
		r2=new JRadioButton("SEARCH BY PATIENT ID");
		r2.setBounds(400,200,249,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r2.setFont(f);
		r2.setForeground(Color.black);
		r2.setBackground(Color.cyan);
		buttonGroup.add(r2);
		panel2.add(r2);
	
		jlab12=new JLabel();
		jlab12.setBounds(800,200,250,30);
					
		jlab12.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab12.setFont(f);
		panel2.add(jlab12);
		
		jtx12= new JTextField();
		panel2.add(jtx12);
		
		
		
		r3=new JRadioButton("SEARCH BY PATIENT NAME");
		r3.setBounds(400,300,300,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r3.setFont(f);
		r3.setForeground(Color.black);
		r3.setBackground(Color.cyan);
		buttonGroup.add(r3);
		panel2.add(r3);
	
		
		jlab13=new JLabel();
		jlab13.setBounds(800,300,350,30);
					
		jlab13.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab13.setFont(f);
		panel2.add(jlab13);
		
		jtx13= new JTextField();
		panel2.add(jtx13);
		
		r4=new JRadioButton("SEARCH BY PATIENT TREATMENT");
		r4.setBounds(400,400,300,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r4.setFont(f);
		r4.setForeground(Color.black);
		r4.setBackground(Color.cyan);
		buttonGroup.add(r4);
		panel2.add(r4);
	
		jlab14=new JLabel();
		jlab14.setBounds(800,400,350,30);
					
		jlab14.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab14.setFont(f);
		panel2.add(jlab14);
		
		jtx14= new JTextField();
		panel2.add(jtx14);
		System.out.println("test1");
		
		jbn1 =new JButton("SEARCH");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(725,450,150,30);
		
		panelxy.setPreferredSize(new Dimension(1600,1600));
		JScrollPane jsp1=new JScrollPane(panelxy);
		jsp1.setBounds(0,0,1350,1325);
			jfrm1.add(jsp1);

		
		
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(225,450,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
								main(s);
					}
			});
		
		
		
		r1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab2.setText("ENTER PATIENT NAME");
								
								jtx1.setBounds(1100,100,200,30);
								jtx1.setFont(f);
								
								jlab2.setVisible(true);
								jtx1.setVisible(true);
								jtx12.setVisible(false);
								jtx13.setVisible(false);
								jtx14.setVisible(false);
								jlab12.setVisible(false);
								jlab13.setVisible(false);
								jlab14.setVisible(false);
								
					}
			}	);	
			
			
		

	r2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab12.setText("ENTER PATIENT ID");
								jtx12.setBounds(1100,200,200,30);
								jtx12.setFont(f);
								jlab2.setVisible(false);
								jtx1.setVisible(false);
								jtx12.setVisible(true);
								jtx13.setVisible(false);
								jtx14.setVisible(false);
								jlab12.setVisible(true);
								jlab13.setVisible(false);
								jlab14.setVisible(false);
								
								
					}	
			}
			
				);

	r3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab13.setText("ENTER PATIENT NAME");
								jtx13.setBounds(1100,300,200,30);
								jtx13.setFont(f);
								jlab2.setVisible(false);
								jtx1.setVisible(false);
								jtx12.setVisible(false);
								jtx13.setVisible(true);
								jtx14.setVisible(false);
								jlab12.setVisible(false);
								jlab13.setVisible(true);
								jlab14.setVisible(false);
								
					}	
			}
			
				);

r4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab14.setText("ENTER PATIENT TREATMENT");
								jtx14.setBounds(1100,400,200,30);
								jtx14.setFont(f);
								jlab2.setVisible(false);
								jtx1.setVisible(false);
								jtx12.setVisible(false);
								jtx13.setVisible(false);
								jtx14.setVisible(true);
								jlab12.setVisible(false);
								jlab13.setVisible(false);
								jlab14.setVisible(true);
								
					}	
			}
			
				);
	
	jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String s1,s2,s3,s4,s5,s6,s10,s11;
				//s10=jtx10.getText();
				s1=jtx1.getText();
				s2=jtx12.getText();
				s3=jtx13.getText();
				s4=jtx14.getText();
				//s6=jtx6.getText();
			if(!s1.equals(""))
			{			
				String s="select * from PATIENT where PATIENT_NAME='"+s1+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s2,s3,s4});
															
									}		con.close();

				jtx1.setText("");
				
			}//if		
			if(!s2.equals(""))
			{			
				String s="select * from BOOK where id='"+s2+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
										model.insertRow(1,new String[]{s1,s2,s3,s4});
										
									}		con.close();

				jtx12.setText("");
			}//if		
			if(!s3.equals(""))
			{			
				String s="select * from BOOK where AUTHOR1='"+s3+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
				String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s2,s3,s4});				
									}	
											con.close();

				jtx13.setText("");
			}//if		
			if(!s4.equals(""))
			{			
				String s="select * from BOOK  where publisher='"+s4+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
								while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s2,s3,s4});				
									}		
			jtx14.setText("");
				con.close();
			}//if		
					
					
					
					}//try
		
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			
			catch(Exception e)
			{
			
			}
			}
			
						
						
									
									
					}	
			
			
				);
	
	}
 
 public void STUDENT()
 {
				jfrm1=new JFrame("SEARCH PHYISCIAN DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		String colHeads[]={"PHYSICIAN_ID","PHYSICIAN_F_NAME","PHYSICIAN_L_NAME","EXPERTISE"};
		String  col[][]={{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
		model= new DefaultTableModel(col,colHeads);
		jtab=new JTable(model);
		jtab.setBackground(Color.green);
		jfrm1.add(jtab);	
		JScrollPane jsp=new JScrollPane(jtab);
		jsp.setBounds(400,0,600,150);
			jfrm1.add(jsp);

		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,700);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
	//panel3.setPreferredSize(new Dimension(600,400));
		
		//JScrollPane jsp1=new JScrollPane(panel3);
			//jsp1.setBounds(0,0,1000,1000);
			//jfrm3.add(jsp1);

f=new Font("Lucida Handwriting",Font.PLAIN,16);	
		
		//panel.setIconImage("/Welcome Scan.jpg");
		
		
		jlab11=new JLabel("ENTER NAME HERE TO SEARCH DATA");
		jlab11.setForeground(Color.pink);
		jlab11.setBounds(300,50,300,30);
		jlab11.setFont(f);	
			panel2.add(jlab11);
	
		jtx11=new JTextField("ENTER NAME HERE");
		jtx11.setForeground(Color.pink);
		jtx11.setBounds(600,50,300,30);
		jtx11.setFont(f);
		panel2.add(jtx11);
		
		jbn2 =new JButton("SEARCH");
		jbn2.setBackground(Color.pink);
		panel2.add(jbn2);
		jbn2.setBounds(575,340,150,30);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(150,340,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
								main(s);
					}
			});
			
		jbn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String s1,s2,s3,s4,s5,s6,s10,s11;
				//s10=jtx10.getText();
				s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from student where name='"+s10+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
					String s2="create table student (id varchar(20),name varchar(70),Fname varchar(70),branch varchar(20));";
	*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s4=" "+rs.getString(2);
											s5=" "+rs.getString(3);
											s6=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s4,s5,s6});
															
									}		

					
		
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			
			}
			}
			}
			);
 
 
 }
 
 
 
 public void TREATMENT()
 {
				jfrm1=new JFrame("SEARCH TREATMENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		String colHeads[]={"TREATMENT_ID","TREATMENT_NAME"};
		String  col[][]={{"","","",""},{"","","",""}};
		model= new DefaultTableModel(col,colHeads);
		jtab=new JTable(model);
		jtab.setBackground(Color.green);
		jfrm1.add(jtab);	
		JScrollPane jsp=new JScrollPane(jtab);
		jsp.setBounds(400,0,600,150);
			jfrm1.add(jsp);

		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,700);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
	//panel3.setPreferredSize(new Dimension(600,400));
		
		//JScrollPane jsp1=new JScrollPane(panel3);
			//jsp1.setBounds(0,0,1000,1000);
			//jfrm3.add(jsp1);

f=new Font("Lucida Handwriting",Font.PLAIN,16);	
		
		//panel.setIconImage("/Welcome Scan.jpg");
		
		
		jlab11=new JLabel("ENTER NAME HERE TO SEARCH DATA");
		jlab11.setForeground(Color.pink);
		jlab11.setBounds(300,50,300,30);
		jlab11.setFont(f);	
			panel2.add(jlab11);
	
		jtx11=new JTextField("ENTER NAME HERE");
		jtx11.setForeground(Color.pink);
		jtx11.setBounds(600,50,300,30);
		jtx11.setFont(f);
		panel2.add(jtx11);
		
		jbn2 =new JButton("SEARCH");
		jbn2.setBackground(Color.pink);
		panel2.add(jbn2);
		jbn2.setBounds(575,340,150,30);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(150,340,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
								main(s);
					}
			});
			
		jbn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String s1,s2,s3,s4,s5,s6,s10,s11;
				//s10=jtx10.getText();
				s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from TREATMENT where name='"+s10+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
					String s2="create table student (id varchar(20),name varchar(70),Fname varchar(70),branch varchar(20));";
	*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s4=" "+rs.getString(2);
											s5=" "+rs.getString(3);
											s6=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s4,s5,s6});
															
									}		

					
		
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			
			}
			}
			}
			);
 
 
 }
 
 
 
 
 
 public void LOAN()
			{
				
									jfrm1=new JFrame("SEARCH TREATMENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		String colHeads[]={"TREATMENT ID","PATIENT ID","PHYSICIAN ID","PHYSICIAN_F_NAME"};
		String  col[][]={{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
		model= new DefaultTableModel(col,colHeads);
		jtab=new JTable(model);
		jtab.setBackground(Color.green);
		jfrm1.add(jtab);	
		JScrollPane jsp=new JScrollPane(jtab);
		jsp.setBounds(400,0,600,150);
			jfrm1.add(jsp);

		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,700);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
	//		panel2.add(buttonGroup);
		f=new Font("Lucida Handwriting",Font.PLAIN,26);
		
		jlab1=new JLabel("SEARCH");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(100,100,160,40);
		jlab1 .setFont(f);
		panel2.add(jlab1);
		 				System.out.println("test");
		
		
		r1=new JRadioButton("SEARCH TREATMENT ID");
		r1.setBounds(400,100,200,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r1.setFont(f);
		r1.setForeground(Color.black);
		r1.setBackground(Color.cyan);
		buttonGroup.add(r1);
		panel2.add(r1);
	
		jlab2=new JLabel();
		jlab2.setBounds(800,100,250,30);
					
		jlab2.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab2.setFont(f);
		panel2.add(jlab2);
		
		jtx1= new JTextField();
		panel2.add(jtx1);
		
		System.out.println("test1");
		
		r2=new JRadioButton("SEARCH BY PATIENT_ID");
		r2.setBounds(400,200,249,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r2.setFont(f);
		r2.setForeground(Color.black);
		r2.setBackground(Color.cyan);
		buttonGroup.add(r2);
		panel2.add(r2);
	
		jlab12=new JLabel();
		jlab12.setBounds(800,200,250,30);
					
		jlab12.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab12.setFont(f);
		panel2.add(jlab12);
		
		jtx12= new JTextField();
		panel2.add(jtx12);
		
		
		
		r3=new JRadioButton("SEARCH BY PATIENT_NAME");
		r3.setBounds(400,300,300,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r3.setFont(f);
		r3.setForeground(Color.black);
		r3.setBackground(Color.cyan);
		buttonGroup.add(r3);
		panel2.add(r3);
	
		
		jlab13=new JLabel();
		jlab13.setBounds(800,300,350,30);
					
		jlab13.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab13.setFont(f);
		panel2.add(jlab13);
		
		jtx13= new JTextField();
		panel2.add(jtx13);
		
		r4=new JRadioButton("SEARCH BY PATIENT_ID");
		r4.setBounds(400,400,300,30);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r4.setFont(f);
		r4.setForeground(Color.black);
		r4.setBackground(Color.cyan);
		buttonGroup.add(r4);
		panel2.add(r4);
	
		jlab14=new JLabel();
		jlab14.setBounds(800,400,350,30);
					
		jlab14.setForeground(Color.red);
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		jlab14.setFont(f);
		panel2.add(jlab14);
		
		jtx14= new JTextField();
		panel2.add(jtx14);
		System.out.println("test1");
		
		jbn1 =new JButton("SEARCH");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(725,450,150,30);
		
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(225,450,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						main(s);
					}
			});
		
		
		
		r1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab2.setText("ENTER LOAN ID");
								
								jtx1.setBounds(1100,100,200,30);
								jtx1.setFont(f);
								
								jlab2.setVisible(true);
								jtx1.setVisible(true);
								jtx12.setVisible(false);
								jtx13.setVisible(false);
								jtx14.setVisible(false);
								jlab12.setVisible(false);
								jlab13.setVisible(false);
								jlab14.setVisible(false);
								
					}
			}	);	
			
			
		

	r2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab12.setText("ENTER PATIENT ID");
								jtx12.setBounds(1100,200,200,30);
								jtx12.setFont(f);
								jlab2.setVisible(false);
								jtx1.setVisible(false);
								jtx12.setVisible(true);
								jtx13.setVisible(false);
								jtx14.setVisible(false);
								jlab12.setVisible(true);
								jlab13.setVisible(false);
								jlab14.setVisible(false);
								
								
					}	
			}
			
				);

	r3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab13.setText("ENTER PATIENT NAME");
								jtx13.setBounds(1100,300,200,30);
								jtx13.setFont(f);
								jlab2.setVisible(false);
								jtx1.setVisible(false);
								jtx12.setVisible(false);
								jtx13.setVisible(true);
								jtx14.setVisible(false);
								jlab12.setVisible(false);
								jlab13.setVisible(true);
								jlab14.setVisible(false);
								
					}	
			}
			
				);

r4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
								System.out.println("test3");
								//jfrm.setVisible(false);
								jlab14.setText("ENTER PHYSICIAN NAME");
								jtx14.setBounds(1100,400,200,30);
								jtx14.setFont(f);
								jlab2.setVisible(false);
								jtx1.setVisible(false);
								jtx12.setVisible(false);
								jtx13.setVisible(false);
								jtx14.setVisible(true);
								jlab12.setVisible(false);
								jlab13.setVisible(false);
								jlab14.setVisible(true);
								
					}	
			}
			
				);
	
	jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String s1,s2,s3,s4,s5,s6,s10,s11;
				//s10=jtx10.getText();
				s1=jtx1.getText();
				s2=jtx12.getText();
				s3=jtx13.getText();
				s4=jtx14.getText();
				//s6=jtx6.getText();
			if(!s1.equals(""))
			{			
				String s="select * from loan where id='"+s1+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
String s4="create table loan (id varchar(20),student_id varchar(20),book_id varchar(20)); ";
	*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s2,s3,s4});
															
									}		con.close();

				jtx1.setText("");
				
			}//if		
			if(!s2.equals(""))
			{			
				String s="select * from loan where student_id='"+s2+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
										model.insertRow(1,new String[]{s1,s2,s3,s4});
										
									}		con.close();

				jtx12.setText("");
			}//if		
			if(!s3.equals(""))
			{			
				String s="select * from loan where book_title='"+s3+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
	String s4="create table loan (id varchar(20),student_id varchar(20),book_id varchar(20)); ";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s2,s3,s4});				
									}	
											con.close();

				jtx13.setText("");
			}//if		
			if(!s4.equals(""))
			{			
				String s="select * from loan where book_id='"+s4+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s2,s3,s4});				
									}		
			jtx14.setText("");
				con.close();
			}//if		
					
					
					
					}//try
		
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			
			catch(Exception e)
			{
			
			}
			}
			
						
						
									
									
					}	
			
			
				);
	
	}
 
 
 
 
 public void UPDATE()
			{
				jfrm1=new JFrame("UPDATE DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcome.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		 f=new Font("Lucida Handwriting",Font.PLAIN,26);
		
		jlab1=new JLabel("SEARCH");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(100,100,160,40);
		jlab1.setFont(f);
		panel2.add(jlab1);
		 				
		r1=new JRadioButton("UPDATE PATIENT LIST");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r1.setBounds(500,100,300,30);
		r1.setFont(f);
		r1.setBackground(Color.cyan);
		r1.setForeground(Color.black);
		panel2.add(r1);
		
		r2=new JRadioButton("UPDATE PHYSICIAN NAME");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r2.setBounds(500,200,400,30);
		r2.setFont(f);
		r2.setBackground(Color.cyan);
		r2.setForeground(Color.black);
		panel2.add(r2);
		
		
		
 r3=new JRadioButton("UPDATE TREATMENT NAME");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r3.setBounds(500,300,300,30);
		r3.setFont(f);
		r3.setBackground(Color.cyan);
		r3.setForeground(Color.black);
		panel2.add(r3);
		
		
		
 r4=new JRadioButton("UPDATE TREATMENT");
		 f=new Font("Lucida Handwriting",Font.PLAIN,16);
		r4.setBounds(500,400,300,30);
		r4.setFont(f);
		r4.setBackground(Color.cyan);
		r4.setForeground(Color.black);
		panel2.add(r4);
		
		
		jbn1 =new JButton("UPDATE");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(725,450,150,30);
		
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(225,450,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
						main(s);
					}
			});
		
		
		
		r1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								b1.UPDATEPATIENT();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
		
		
		
		r2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								//jfrm.setVisible(false);
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
									b1.UPDATEPHYSICIAN();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
			
		r3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								//jfrm.setVisible(false);
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								b1.UPDATETREATMENT();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
			
		r4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
							SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{			
								//jfrm.setVisible(false);
								jfrm1.setVisible(false);
									System.out.println("test");
								PhyioSports b1=new PhyioSports();
								//b1.UPDATELOAN();
							
						}
				
					}
			);
					
					}	
			}
			
				);
			
					
 			
 	
 
	}
	
	final public void UPDATEPATIENT()
	{
		jfrm4=new JFrame("UPDATE PATIENT IN DATABASE");
		jfrm4.setSize(1600,1600);
		jfrm4.setVisible(true);
		jfrm4.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm4.setLayout(null);
		 jfrm4.setBackground(Color.yellow);
		
		
		panel4=new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(100,100,1200,1000);
		
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm4.add(panel4);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(0,340,150,30);
		panel4.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm4.setVisible(false);
						main(s);
					}
			});
		
		
		jlabc1=new JLabel("ENTER PATIENT NAME");
		jlabc1.setForeground(Color.yellow);
		jlabc1.setBounds(30,30,150,30);
		panel4.add(jlabc1);
	
		jtxc1=new JTextField("ENTER PATIENT NAME");
		jtxc1.setForeground(Color.yellow);
		jtxc1.setBounds(200,30,150,30);
		panel4.add(jtxc1);
		
		
		String s=jtxc1.getText();
		
		
		
		if(!s.equals(""))
		{
		
		jlab1=new JLabel("ENTER PATIENT NAME");
		jlab1.setForeground(Color.yellow);
		jlab1.setBounds(350,150,150,30);
		panel4.add(jlab1);
	
		jtx1=new JTextField("ENTER PATIENT NAME HERE");
		jtx1.setForeground(Color.yellow);
		jtx1.setBounds(800,150,150,30);
		panel4.add(jtx1);
		
		jbnc =new JButton("ENTER");
		jbnc.setBackground(Color.pink);
		panel4.add(jbnc);
		jbnc.setBounds(30,100,150,30);
		
		jlab2=new JLabel("ENTER PATIENT ID");
		jlab2.setForeground(Color.yellow);
		jlab2.setBounds(350,230,150,30);
		panel4.add(jlab2);
	
		jtx2=new JTextField("ENTER PATIENT HERE");
		jtx2.setForeground(Color.yellow);
		jtx2.setBounds(800,230,150,30);
		panel4.add(jtx2);
	
			
			jlab3=new JLabel("ENTER TREATMENT");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,510,150,30);
		panel4.add(jlab3);
	
		jtx3=new JTextField("ENTER TREATMENT HERE");
		jtx3.setForeground(Color.yellow);
		jtx3.setBounds(800,510,150,30);
		panel4.add(jtx3);
	
	
		jlab4=new JLabel("ENTER ISSUES");
		jlab4.setForeground(Color.yellow);
		jlab4.setBounds(350,580,150,30);
		panel4.add(jlab4);
	
		jtx4=new JTextField("ENTER ISSUES HERE");
		jtx4.setForeground(Color.yellow);
		jtx4.setBounds(800,580,150,30);
		panel4.add(jtx4);

			panel4.setBackground(Color.green);
		
		jbn1 =new JButton("UPDATE");
		jbn1.setBackground(Color.pink);
		panel4.add(jbn1);
		jbn1.setBounds(425,650,150,30);
		
		jlab11 = new JLabel();
		jlab11.setBounds(525,150,170,30);
		jlab11.setForeground(Color.red);
		panel4.add(jlab11);
		
		jlab12 = new JLabel();
		jlab12.setBounds(525,230,170,30);
		jlab12.setForeground(Color.red);
		panel4.add(jlab12);

jlab13 = new JLabel();
		jlab13.setBounds(525,300,170,30);
		jlab13.setForeground(Color.red);
		panel4.add(jlab13);
		
	jlab14 = new JLabel();
		jlab14.setBounds(525,370,170,30);
		jlab14.setForeground(Color.red);
		panel4.add(jlab14);
			
	jlab15 = new JLabel();
		jlab15.setBounds(525,440,170,30);
		jlab15.setForeground(Color.red);
		panel4.add(jlab15);
	jlab16 = new JLabel();
		jlab16.setBounds(525,510,170,30);
		jlab16.setForeground(Color.red);
		panel4.add(jlab16);
	jlab17 = new JLabel();
		jlab17.setBounds(525,580,170,30);
		jlab17.setForeground(Color.red);
		panel4.add(jlab17);
		
									
		
		jbnc.addActionListener(new ActionListener()
		
		{
					
					public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String name1=jtxc1.getText();
			//	System.out.println("String is : "+a);
				String s1,s2,s3,s4,s5,s6,s7,s10,s11;
				//s10=jtx10.getText();
				//s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from PATIENT where PATIENT NAME='"+name1+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
				String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											s5=" "+rs.getString(5);
											
											s6=" "+rs.getString(6);
											s7=" "+rs.getString(7);
											//jlab.setText(s2);
											jlab11.setText(s2);
											jlab12.setText(s1);
											jlab13.setText(s3);
											jlab14.setText(s4);
											jlab15.setText(s5);
											jlab16.setText(s6);
											jlab17.setText(s7);
											
											
										
											
									}		
											
										
					
		
			
			
			
			
			
			//	jlab9.setText("inserted into table");
				con.close();
			}
			catch(Exception e)
			{
			
			}
			}
			
			}
			);
			
			jbn1.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
						try{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


							}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}
						i=0;
						while(i<4)
	{
					try{ 		
								final	String a=jtx1.getText();
										System.out.println("String is : "+a);
										final	String b=jtx2.getText();

										final	String c=jtx3.getText();

										final	String d=jtx4.getText();

										final	String e=jtx5.getText();
					
										final	String f=jtx6.getText();

										final	String g=jtx7.getText();
								
								
										String name1=jtxc1.getText();
										Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
										Statement S = con.createStatement();
								if(i==0)
										if(!a.equals(""))	
										{
									    	String S1="update PATIENT set to PATIENT_ID='"+a+"' where PATIENT_ID="+"'"+name1+"';";
										    System.out.println(S1);
											S.executeUpdate(S1);
										}
									if(i==1)
								if(!b.equals(""))	
										{
											String S2="update PATIENT set id='"+b+"' where PATIENT_ID="+"'"+name1+"';";
											System.out.println(S2);
											S.executeUpdate(S2);
										}
										
										if(i==2)
										if(!e.equals(""))	
										{
											String S4="update PATIENT set TREATMENT='"+d+"' where PATIENT_ID="+"'"+name1+"';";
											S.executeUpdate(S4);
											System.out.println(S4);
										}


										if(i==3)
										if(!f.equals(""))	
										{
											String S4="update PATIENT set issues='"+d+"' where PATIENT_ID="+"'"+name1+"';";
											S.executeUpdate(S4);
											System.out.println(S4);
										}






										i++;
					
		con.close();
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
				
			}//while
			}//try
			}//action performed
			
			);
			
		}
		else 
		{
			
		jlab3=new JLabel("PLEASE ENTER NAME");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
		
		
		}
		
		
		
		}//en
			
			
public void 	UPDATEPHYSICIAN()

		{
		
				jfrm4=new JFrame("UPDATE PHYISCIAN IN DATABASE");
		jfrm4.setSize(1600,1600);
		jfrm4.setVisible(true);
		jfrm4.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm4.setLayout(null);
		 jfrm4.setBackground(Color.yellow);
		
		
		panel4=new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(100,100,1200,1000);
		
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm4.add(panel4);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(350,440,150,30);
		panel4.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm4.setVisible(false);
						main(s);
					}
			});
		
		
		jlabc1=new JLabel("ENTER PHYSICIAN F NAME");
		jlabc1.setForeground(Color.yellow);
		jlabc1.setBounds(30,30,150,30);
		panel4.add(jlabc1);
	
		jtxc1=new JTextField("ENTER PHYSICIAN F NAME HERE");
		jtxc1.setForeground(Color.yellow);
		jtxc1.setBounds(200,30,150,30);
		panel4.add(jtxc1);
		
		
		String s=jtxc1.getText();
		
		
		
		if(!s.equals(""))
		{
		
		
		jlab1=new JLabel("ENTER PHYSICIAN F NAME");
		jlab1.setForeground(Color.yellow);
		jlab1.setBounds(350,150,150,30);
		panel4.add(jlab1);
	
		jtx1=new JTextField("ENTER PHYSICIAN F NAME HERE");
		jtx1.setForeground(Color.yellow);
		jtx1.setBounds(800,150,150,30);
		panel4.add(jtx1);
		
		jbnc =new JButton("ENTER");
		jbnc.setBackground(Color.pink);
		panel4.add(jbnc);
		jbnc.setBounds(30,100,150,30);
		
		jlab2=new JLabel("ENTER PHYSICIAN L NAME ");
		jlab2.setForeground(Color.yellow);
		jlab2.setBounds(350,230,150,30);
		panel4.add(jlab2);
	
		jtx2=new JTextField("ENTER PHYSICIAN L NAME HERE");
		jtx2.setForeground(Color.yellow);
		jtx2.setBounds(800,230,150,30);
		panel4.add(jtx2);
	
	
		jlab3=new JLabel("ENTER PHYSICIAN ID");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
	
		jtx3=new JTextField("ENTER PHYSICIAN ID HERE ");
		jtx3.setForeground(Color.yellow);	
		jtx3.setBounds(800,300,150,30);
		panel4.add(jtx3);
	
		jlab4=new JLabel("ENTER EXPERTISE");
		jlab4.setForeground(Color.yellow);
		jlab4.setBounds(350,370,150,30);
		panel4.add(jlab4);
	
		jtx4=new JTextField("ENTER EXPERTISE HERE");
		jtx4.setForeground(Color.yellow);
		jtx4.setBounds(800,370,150,30);
		panel4.add(jtx4);
		
			panel4.setBackground(Color.green);
		
		jbn1 =new JButton("UPDATE");
		jbn1.setBackground(Color.pink);
		panel4.add(jbn1);
		jbn1.setBounds(725,440,150,30);
		
		jlab11 = new JLabel();
		jlab11.setBounds(525,150,170,30);
		jlab11.setForeground(Color.red);
		panel4.add(jlab11);
		
		jlab12 = new JLabel();
		jlab12.setBounds(525,230,170,30);
		jlab12.setForeground(Color.red);
		panel4.add(jlab12);

jlab13 = new JLabel();
		jlab13.setBounds(525,300,170,30);
		jlab13.setForeground(Color.red);
		panel4.add(jlab13);
		
	jlab14 = new JLabel();
		jlab14.setBounds(525,370,170,30);
		jlab14.setForeground(Color.red);
		panel4.add(jlab14);
			
		
									
		
		jbnc.addActionListener(new ActionListener()
		
		{
					
					public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String name1=jtxc1.getText();
			//	System.out.println("String is : "+a);
				String s1,s2,s3,s4,s5,s6,s7,s10,s11;
				//s10=jtx10.getText();
				//s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from student where name='"+name1+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
				String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											jlab11.setText(s2);
											jlab12.setText(s1);
											jlab13.setText(s3);
											jlab14.setText(s4);
									
										
											
									}		
											
				
			//	jlab9.setText("inserted into table");
				con.close();
			}
			catch(Exception e)
			{
			
			}
			}
			
			}
			);
			
			jbn1.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
						try{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


							}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}
						i=0;
						while(i<4)
	{
					try{ 		
								final	String a=jtx1.getText();
										System.out.println("String is : "+a);
										final	String b=jtx2.getText();

										final	String c=jtx3.getText();

										final	String d=jtx4.getText();

										final	String e=jtx5.getText();
					
										final	String f=jtx6.getText();

										final	String g=jtx7.getText();
								
								
										String name1=jtxc1.getText();
										Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
										Statement S = con.createStatement();
								if(i==0)
										if(!a.equals(""))	
										{
									    	String S1="update PHYSICIAN set L NAME='"+a+"' where name="+"'"+name1+"';";
										    System.out.println(S1);
											S.executeUpdate(S1);
										}
									if(i==1)
								if(!b.equals(""))	
										{
											String S2="update PHYSICIAN set F NAME='"+b+"' where name="+"'"+name1+"';";
											System.out.println(S2);
											S.executeUpdate(S2);
										}
										if(i==2)
										if(!c.equals(""))	
										{
											String S3="update PHYSICIAN set ID='"+c+"' where name="+"'"+name1+"';";

											System.out.println(S3);
											S.executeUpdate(S3);
										}
										if(i==3)
										if(!d.equals(""))	
										{
											String S4="update PHYSICIAN set EXPERTISE='"+d+"' where =name"+"'"+name1+"';";
											S.executeUpdate(S4);
											System.out.println(S4);
										}

										




										i++;
					
		con.close();
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
				
			}//while
			}//try
			}//action performed
			
			);
			
		}
		else 
		{
			
		jlab3=new JLabel("PLEASE ENTER NAME");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
		
		
		}
		
		}
	
			
public void 	UPDATETREATMENT()

		{
		
				jfrm4=new JFrame("UPDATE TREATMENT IN DATABASE");
		jfrm4.setSize(1600,1600);
		jfrm4.setVisible(true);
		jfrm4.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm4.setLayout(null);
		 jfrm4.setBackground(Color.yellow);
		
		
		panel4=new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(100,100,1200,1000);
		
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm4.add(panel4);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(350,440,150,30);
		panel4.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm4.setVisible(false);
						main(s);
					}
			});
		
		
		jlabc1=new JLabel("ENTER TREATMENT NAME");
		jlabc1.setForeground(Color.yellow);
		jlabc1.setBounds(30,30,150,30);
		panel4.add(jlabc1);
	
		jtxc1=new JTextField("ENTER TREATMENT NAME HERE");
		jtxc1.setForeground(Color.yellow);
		jtxc1.setBounds(200,30,150,30);
		panel4.add(jtxc1);
		
		
		String s=jtxc1.getText();
		
		
		
		if(!s.equals(""))
		{
		
		
		jlab1=new JLabel("ENTER TREATMENT NAME");
		jlab1.setForeground(Color.yellow);
		jlab1.setBounds(350,150,150,30);
		panel4.add(jlab1);
	
		jtx1=new JTextField("ENTER TREATMENT NAME HERE");
		jtx1.setForeground(Color.yellow);
		jtx1.setBounds(800,150,150,30);
		panel4.add(jtx1);
		
		jbnc =new JButton("ENTER");
		jbnc.setBackground(Color.pink);
		panel4.add(jbnc);
		jbnc.setBounds(30,100,150,30);
		
		jlab2=new JLabel("ENTER PHYSICIAN NAME ");
		jlab2.setForeground(Color.yellow);
		jlab2.setBounds(350,230,150,30);
		panel4.add(jlab2);
	
		jtx2=new JTextField("ENTER PHYSICIAN NAME HERE");
		jtx2.setForeground(Color.yellow);
		jtx2.setBounds(800,230,150,30);
		panel4.add(jtx2);
	
	
		jlab3=new JLabel("ENTER TREATMENT ID");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
	
		jtx3=new JTextField("ENTER TREATMENT ID HERE");
		jtx3.setForeground(Color.yellow);	
		jtx3.setBounds(800,300,150,30);
		panel4.add(jtx3);
	
	
	
		jlab4=new JLabel("ENTER BRANCH");
		jlab4.setForeground(Color.yellow);
		jlab4.setBounds(350,370,150,30);
		panel4.add(jlab4);
	
		jtx4=new JTextField("ENTER BRANCH HERE");
		jtx4.setForeground(Color.yellow);
		jtx4.setBounds(800,370,150,30);
		panel4.add(jtx4);
		
		
		
		
			panel4.setBackground(Color.green);
		
		jbn1 =new JButton("UPDATE");
		jbn1.setBackground(Color.pink);
		panel4.add(jbn1);
		jbn1.setBounds(725,440,150,30);
		
		jlab11 = new JLabel();
		jlab11.setBounds(525,150,170,30);
		jlab11.setForeground(Color.red);
		panel4.add(jlab11);
		
		jlab12 = new JLabel();
		jlab12.setBounds(525,230,170,30);
		jlab12.setForeground(Color.red);
		panel4.add(jlab12);

jlab13 = new JLabel();
		jlab13.setBounds(525,300,170,30);
		jlab13.setForeground(Color.red);
		panel4.add(jlab13);
		
	jlab14 = new JLabel();
		jlab14.setBounds(525,370,170,30);
		jlab14.setForeground(Color.red);
		panel4.add(jlab14);
			
		
									
		
		jbnc.addActionListener(new ActionListener()
		
		{
					
					public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String name1=jtxc1.getText();
			//	System.out.println("String is : "+a);
				String s1,s2,s3,s4,s5,s6,s7,s10,s11;
				//s10=jtx10.getText();
				//s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from treatment where name='"+name1+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
				String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											s2=" "+rs.getString(2);
											s3=" "+rs.getString(3);
											s4=" "+rs.getString(4);
											//jlab.setText(s2);
											jlab11.setText(s2);
											jlab12.setText(s1);
											jlab13.setText(s3);
											jlab14.setText(s4);
									
										
											
									}		
											
										
					
		
			
			
			
			
			
			//	jlab9.setText("inserted into table");
				con.close();
			}
			catch(Exception e)
			{
			
			}
			}
			
			}
			);
			
			jbn1.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
						try{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


							}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}
						i=0;
						while(i<4)
	{
					try{ 		
								final	String a=jtx1.getText();
										System.out.println("String is : "+a);
										final	String b=jtx2.getText();

										final	String c=jtx3.getText();

										final	String d=jtx4.getText();

										final	String e=jtx5.getText();
					
										final	String f=jtx6.getText();

										final	String g=jtx7.getText();
								
								
										String name1=jtxc1.getText();
										Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
										Statement S = con.createStatement();
								if(i==0)
										if(!a.equals(""))	
										{
									    	String S1="update TREATMENT set name='"+a+"' where name="+"'"+name1+"';";
										    System.out.println(S1);
											S.executeUpdate(S1);
										}
									if(i==1)
								if(!b.equals(""))	
										{
											String S2="update TREATMENT set mobile='"+b+"' where name="+"'"+name1+"';";
											System.out.println(S2);
											S.executeUpdate(S2);
										}
										if(i==2)
										if(!c.equals(""))	
										{
											String S3="update TREATMENT set id='"+c+"' where name="+"'"+name1+"';";

											System.out.println(S3);
											S.executeUpdate(S3);
										}
										if(i==3)
										if(!d.equals(""))	
										{
											String S4="update TREATMENT set BRANCH='"+d+"' where =name"+"'"+name1+"';";
											S.executeUpdate(S4);
											System.out.println(S4);
										}

										




										i++;
					
		con.close();
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
				
			}//while
			}//try
			}//action performed
			
			);
			
		}
		else 
		{
			
		jlab3=new JLabel("PLEASE ENTER NAME");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
		
		
		}
		
		}

 public void DATA_ENTRY()
 {
	
		jfrm1=new JFrame("ADD DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcom.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
		
		panel2.setBackground(Color.cyan);
		jfrm1.add(panel2);
		
		jlab1=new JLabel("PATEINT ID");
		jlab1.setForeground(Color.green);
		jlab1.setBounds(300,50,150,30);
		panel2.add(jlab1);
	
		jtx1=new JTextField("ENTER PATEINT ID HERE");
		jtx1.setForeground(Color.green);
		jtx1.setBounds(550,50,150,30);
		panel2.add(jtx1);
		
		jlab2=new JLabel("ENTER PHYSICIAN ID");
		jlab2.setForeground(Color.green);
		jlab2.setBounds(300,130,150,30);
		panel2.add(jlab2);
	
		jtx2=new JTextField("ENTER PHYSICIAN ID HERE");
		jtx2.setForeground(Color.green);
		jtx2.setBounds(550,130,150,30);
		panel2.add(jtx2);
	
	
		jlab3=new JLabel("ENTER PHYSICIAN ID");
		jlab3.setForeground(Color.green);
		jlab3.setBounds(300,200,150,30);
		panel2.add(jlab3);
	
		jtx3=new JTextField("ENTER PHYSICIAN ID HERE ");
		jtx3.setForeground(Color.green);
		jtx3.setBounds(550,200,150,30);
		panel2.add(jtx3);

		jlab4=new JLabel("ENTER PHYSICIAN NAME");
		jlab4.setForeground(Color.green);
		jlab4.setBounds(300,270,150,30);
		panel2.add(jlab4);
	
		jtx4=new JTextField("ENTER PHYSICIAN NAME HERE");
		jtx4.setForeground(Color.green);
		jtx4.setBounds(550,270,150,30);
		panel2.add(jtx4);
		
		jbn1 =new JButton("patient");
		jbn1.setBackground(Color.pink);
		panel2.add(jbn1);
		jbn1.setBounds(625,340,150,30);
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(200,340,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
						main(s);
					}
			});
			
			
			
		jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//ID
							s2=jtx2.getText();//lname
							s3=jtx3.getText();//Choose Your username
							s4=jtx4.getText();//Choose Your password
		/*					String s2="create table student (id varchar(20),name varchar(70),
											Fname varchar(70),branch varchar(20));";
	*/
							String s="insert into loan values('"+s1+"',' "+s2+"','"+s3+"','"+s4+"');";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports"
                                                                + "","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
							
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
		
 }
public void SUBMIT()
 {
	
		jfrm1=new JFrame("ADD PATIENT DATA IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,1300,200);
		ImageIcon icon=new ImageIcon("welcom.jpg");
		jlab1=new JLabel(icon);
		jlab1.setBounds(0,0,1300,200);
		panel1.add(jlab1);
		jfrm1.add(panel1);
	
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25,202,1300,600);
				Color c1=new Color(173,154,207);
		panel2.setBackground(c1);
		jfrm1.add(panel2);
		
		f=new Font("Lucida Handwriting",Font.PLAIN,16);
		
		jlab11=new JLabel("ENTER Pateint ID");
		jlab11.setBounds(105,200,400,35);
		jlab11.setFont(f);
		Color c3=new Color(141,190,202);
		jlab11.setBackground(c3);
		panel2.add(jlab11);
		
		
		jtx1=new JTextField("Enter Patient ID HERE.");
		jtx1.setBounds(600,200,400,35);
		jtx1.setFont(f);
		Color c2=new Color(141,190,202);
		jtx1.setBackground(c2);
		panel2.add(jtx1);
		
		jbn1 =new JButton("SUBMIT");
		jbn1.setBackground(Color.pink);
		jbn1.setFont(f );
		panel2.add(jbn1);
		jbn1.setBounds(625,340,150,30);
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(200,340,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						jfrm1.setVisible(false);
						main(s);
					}
			});
			
			
			
		jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//ID
	
							String s="delete * from loan where PATIENT_id='"+s1+"';";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
							
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
		
 }
	public void ABOUTUS()
	{
	
		JOptionPane.showMessageDialog(null,"SUCCESSFULLY CREATED", "Physiotherapy & Sports Injury Centre", 1);
		
	
	}
 }