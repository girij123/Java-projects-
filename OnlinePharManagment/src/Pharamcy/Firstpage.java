package Pharamcy;

import java.util.Scanner;

public class Firstpage {
	 static String name="Admin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.println("Welcome online Pharamcy");
    System.out.println("1.Admin");
    System.out.println("2.User");
    int choice=sc.nextInt();
    switch(choice) {
    case 1:
    	Admin.Call();
    	break;
    case 2:
    	RigisterLogin.Call();
    }
	}

}
