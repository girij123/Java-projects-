package Pharamcy;

import java.util.Scanner;

public class RigisterLogin {
	static Scanner sc=new Scanner(System.in);
	static Scanner sc1=new Scanner(System.in);
	
	public static void Login() {
		String s="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		System.out.println("******"+"Welcome to Login page"+"********");
		System.out.print("Enter your emailId :"+" ");
		String Email=sc1.nextLine();
		System.out.print("Enter your Password :"+" ");
		String Password=sc1.nextLine();
		if(Email.matches(s)) {
		 System.out.println("******"+"Login Succesfully"+"******");
		  Menu.menu("user");
		  }
		else {
			  System.out.println("******"+"Enter correct Emailid"+""
			  		+ "**********");
		  }
	}


	public static void Call() {

		System.out.println("------Welcome to online pharamacey-------");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Logout");
		
		System.out.println();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Register();
			break;
		case 2:
			Login();
			break;
		case 3:
			Logout();
			break;	
		}
	}
   
		public static void Register() {
			System.out.println("******"+"Register Here"+"******");
			String s="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";	
		System.out.print("Enter your Name :"+" ");
	    String Name2221=sc1.nextLine();
	    System.out.print("Enter your PhoneNumber :"+" ");
	    String PhoneNum=sc1.nextLine();
	    System.out.print("Enter your emailId :"+" ");
	    String Email=sc1.nextLine();
	    System.out.print("Enter your Password :"+" ");
	    String Password=sc1.nextLine();
	    if(Email.matches(s)) {
	    System.out.println("******"+"Registeration Succesfully"+"******");
	    System.out.println();
	    Login();
	    }
	    else {
	    	System.out.println("******"+"Enter correct Emailid"+"******");
	    }

	    
		}
		public static void Logout() {
			System.out.print("Enter your emailId :"+" ");
			String Email=sc1.nextLine();
			System.out.print("Enter your Password :"+" ");
			String Password=sc1.nextLine();
			 System.out.println("******"+"Logout  Succesfully"+"******");
			  
		}
   
	

}
