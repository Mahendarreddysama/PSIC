 import java.sql.*;
 import java.sql.Connection.*;
 import java.sql.DriverManager.*;


public class PhysioDatabase1
{
	public static  void main(String args[])
	{
	
		PhysioDatabase1 l=new PhysioDatabase1();
		l.create();
	
	}
public void create()
{
	
	
	String s4="alter table data add patient name varchar(50) ;";
	int i=0;
	
	System.out.println(s4);

	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
	
	}
	catch(Exception e1)
	{
		System.out.println("Failed To Load Driver Due To"+e1 );
	
	}
	
	try
	{
		
		Connection con=DriverManager.getConnection("jdbc:odbc:PhyioSports","","");
		System.out.println("test");
		Statement S=con.createStatement();
	System.out.println("test1");
	
	
			S.executeQuery(s4);
		
	con.close();
	}//create
	catch(Exception e1)
	{
		System.out.println("Failed To Load Driver Due To"+e1 );
	
	}


} 
}





