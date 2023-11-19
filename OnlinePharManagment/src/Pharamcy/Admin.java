package Pharamcy;

import java.util.Scanner;

public class Admin {
	static Scanner sc=new Scanner(System.in);
	static Scanner sc1=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void Call() {
		System.out.println("------Welcome to online pharamacey-------");
		System.out.println("1.Login");
		System.out.println("2.Logout");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Login();
			break;
		case 2:
			Logout();
			break;	
		}
		}
		
		public static void Login() {
			System.out.println("******"+"Welcome to Login page"+"******");
			System.out.print("Enter your emailId :"+" ");
			String Email=sc1.nextLine();
			System.out.print("Enter your Password :"+" ");
			String Password=sc1.nextLine();
			if(Email.equals("admin@gmail.com")) {
			 System.out.println("******"+"Login Succesfully"+"******");
			 Menu.menu("admin");
			}
			else {
				System.out.println("Enter correct login credential");
			}
		}
		
		public static void Logout() {
			System.out.print("Enter your emailId :"+" ");
			String Email=sc1.nextLine();
			System.out.print("Enter your Password :"+" ");
			String Password=sc1.nextLine();
			if(Email=="adamin@gmail.com") {
				 System.out.println("******"+"Logout Succesfully"+"******");
				}
				else {
					System.out.println("Enter correct login credential");
				}
			
			   
		}
		

	}

