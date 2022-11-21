 import java.sql.*;
 import java.sql.Connection.*;
 import java.sql.DriverManager.*;


public class PhyioSportsDatabase
{
	public static  void main(String args[])
	{
	
		PhyioSportsDatabase l=new PhyioSportsDatabase();
		l.create();
	
	}
public void create()
{
	
	
	String s1="create table PATIENT (id varchar(40),Patient_Name varchar(40),Patient_treatment varchar(40),patient_issue varchar(40),issue  varchar(20) );";
	String s2="create table physician (id varchar(20),Fname varchar(70),Lname varchar(70),expertise varchar(20));";
	String s3="create table treatment (id varchar(20),name varchar(70),treatname_physician varchar(70),expertise varchar(20));";
	String s4="create table data (id varchar(20),patient_id varchar(20),physician_id varchar(20)); ";
	int i=0;
	System.out.println(s1);
	System.out.println(s3);
	System.out.println(s2);
	System.out.println(s4);
	while(i<4)
	{	i=i+1;
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
	
		if(i==0)
		{
			S.executeQuery(s1);
		
		}
	
	if(i==1)
		{
			S.executeQuery(s2);
		}
	if(i==2)
		{
			S.executeQuery(s3);
		}
	if(i==3)
		{
			S.executeQuery(s4);
		}

	con.close();
	
	}
	
	catch(Exception e2)
	{
		System.out.println("Failed to create table "+e2);
	
	
	}
	}//while
	}//create


} 





