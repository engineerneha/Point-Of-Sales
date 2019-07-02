import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;
public class Product {
	char ch;
int c;
int Qty,amount;
static int bill=0;
Scanner s=new Scanner(System.in);
void show() {
	
	 do {
		 System.out.println("enter items");
		 c=s.nextInt(); 	 
	switch (c) {
	case 1:System.out.println("Bread   Rs.30");
	System.out.println("enter the quantity");
		Qty=s.nextInt();
		amount=30*Qty;
		bill+=amount;
		System.out.println("Amount="+amount);
		System.out.println("bill is"+bill);
		break;
	case 2:System.out.println("Poha     Rs.60");
	System.out.println("enter the quantity");
	Qty=s.nextInt();
	amount=60*Qty;
	bill+=amount;
	System.out.println("Amount="+amount);
	System.out.println("bill is"+bill);
	break;
	case 3:System.out.println("Oats");
	System.out.println("enter the quantity");
	Qty=s.nextInt();
	amount=20*Qty;
	bill+=amount;
	System.out.println("Amount="+amount);
	System.out.println("bill is"+bill);
	break;
	case 4:System.out.println("TV");
	System.out.println("enter the quantity");
	Qty=s.nextInt();
	amount=30000*Qty;
	bill+=amount;
	System.out.println("Amount="+amount);
	System.out.println("bill is"+bill);
	break;
	case 5:System.out.println("Fridge");
	System.out.println("enter the quantity");
	Qty=s.nextInt();
	amount=35000*Qty;	bill+=amount;
	System.out.println("Amount="+amount);
	System.out.println("bill is"+bill);
	break;
	case 6:System.out.println("Crockery plates");
	System.out.println("enter the quantity");
	Qty=s.nextInt();
	amount=500*Qty;
	bill+=amount;
	System.out.println("Amount="+amount);
	System.out.println("bill is"+bill);
	
	break;
	

	default:System.out.println("Not Available");
		break;
	}
		 
	System.out.println("Do you want to add more items");
	String r=s.next();
	ch=r.charAt(0);
	}
	while(ch=='y' || ch=='Y');
	if(ch=='n') {
			
			
		
		System.out.println("Thanks for Shopping");
		System.out.println("visit again");}
	}



	public static void main(String[] args) {
		
		
			
		
		System.out.println("\t\t\t\t\t\t******WELCOME TO STORE*******");
		System.out.println("\nt\t\t\t\t\t------------------------------------");
		System.out.println("\t\t\t\tMENU");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%10s %30s %20s ", "1", "Bread", "30\n");
		System.out.printf("%10s %30s %20s ", "2", "Poha", "60\n");
		System.out.printf("%10s %30s %20s ", "3", "Oats", "20\n");
		System.out.printf("%10s %30s %20s ", "4", "Tv", "30000\n");
		System.out.printf("%10s %30s %20s ", "5", "Fridge", "35000\n");
		System.out.printf("%10s %30s %20s ", "6", "Crockery Plates", "500\n");
		Product p=new Product();
		p.show();
		try {
		File file=new File("C:\\Users\\Dell\\Desktop\\file2.txt");
		FileWriter writer = new FileWriter(file);
		writer.write("Net Bill is "+bill);
		
		System.out.println("writing success");
		writer.close();
		FileInputStream fis = new FileInputStream(file);
		
		int i = 0;
		
		while( (i = fis.read()) != -1){
			char ch = (char)i;
			System.out.print(ch);
			
			
		}
		
		
		
		fis.close(); // to release memory
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
