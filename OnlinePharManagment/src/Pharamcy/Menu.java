package Pharamcy;

import java.util.*;

public class Menu {
	static Scanner sc=new Scanner(System.in);
	static Scanner sc2=new Scanner(System.in);
	  
	   public static Map<String, Integer> adminm(Map<String, Integer> medicine){
		System.out.println("------------"+"Medicine along with Price"+"---------------");
		   for(Map.Entry<String, Integer> me:medicine.entrySet()) {
			   System.out.println(me);
		   }
		   System.out.println();
		   System.out.println("***********************");
		   System.out.println("1.Add Medicine ");
		   System.out.println("2.Remove Medicine ");
		   int n=sc2.nextInt();
	    System.out.println();
	    switch(n) {
	    case 1:medicine=add(medicine);
	    break;
	    case 2:medicine=remove(medicine);
	    break;
	    default:
	    	System.out.println("Enter correct option");
	    }
	    return medicine;
	   }   

    static Map<String, Integer> remove(Map<String, Integer> medicine) {
		// TODO Auto-generated method stub
		 System.out.print("Remove Medicine :"+" ");
		   Scanner sc1=new Scanner(System.in);
		   String med1=sc1.nextLine();
		System.out.println();
		  if(medicine.containsKey(med1)) {
			  medicine.remove(med1);
			  System.out.println("remove successful removed");
		  }
		  return medicine;
    }

	private static Map<String, Integer> add(Map<String, Integer> medicine) {
		System.out.print("Add Medicine :"+" ");
		   String med=sc.nextLine();
		   System.out.println("Enter price : ");
		   int price=sc.nextInt();	   
		   System.out.println();
		 if(medicine.put(med,price) != null) {
			 System.out.println("Medicine Added Successfully!");
		  return medicine;
		 }
		 else {
			 System.out.println("Medicine Added Successfully!");
		 }
		return medicine;	  
	}

	public static void menu(String name) {
		// TODO Auto-generated method stub
		  System.out.println();
		   System.out.println("Welcome to Home Page");
		  
		  Map<String,Integer> medicine=new HashMap<String,Integer>();
		   medicine.put("Paracetamol",200);
		   medicine.put("Eciclo-P",270);
		   medicine.put("Amoxible",300);
		   medicine.put("NIMSE 100",600);
		   medicine.put("Parazex",540);
		   medicine.put("Dimetapp Cold and Cough",980);
		   medicine.put("Mucinex DM",730);
		   
		   if(name.equals("admin")) {
			 medicine=adminm(medicine);
		   }
		   else {
		   System.out.println("------------"+"Medicine along with Price"+"---------------");
		   for(Map.Entry<String, Integer> me:medicine.entrySet()) {
			   System.out.println(me);
		   }
		 
		   
		   System.out.println();
		   System.out.println("------------"+"Add to Cart"+"---------------");
		   System.out.println("Enter Medicine you Want buy");
		   System.out.println("Enter how many medicine u want buy");
		   int count=sc.nextInt();
		   int totalprice=0;
		   //int PriceHasToPAY=0;
		   for(int i=0;i<=count;i++) {
			   String medi1=sc.nextLine();
			   if(medicine.containsKey(medi1)) {
					totalprice+=medicine.get(medi1);
				}
			   else {
				   System.out.println("Enter medicine within menu");
			   }

		   }
		   
		   System.out.println();
		   System.out.println("------------"+"Payment"+"---------------");
		   System.out.println("Total amount to be pay:"+totalprice);
		   System.out.println("Enter payment details");
		   System.out.print("Enter Address :"+" ");
		   String add=sc.nextLine();
		   System.out.print("Payment Mode :"+" ");
		   String modd=sc.nextLine();
		   if(modd.equals("cash") || modd.equals("google pay") || modd.equals("phone pay") || modd.equals("paytm")) {
		   System.out.println("Order Placed!!..........");
		   System.out.println("Thank you.Visit Again!!!......");}
		   else {
			   System.out.println("Enter valid payment mode");  
		   }
		   }
	}


}
