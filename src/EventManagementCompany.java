public class EventManagementCompany {
	
	public static void main(String[] args) {
		
		Person cl1 = new Person("Resha");
		
		Options op1 = new Options("Air_Hall",500);
		
		AdOn a1 = new AdOn("Sound",1000);
		
		Options opl1[] = new Options[1];
		opl1[0] = op1;
		
		AdOn adl1[] = new AdOn[1];
		adl1[0] = a1;
		
		Services s1 = new Services("Hall_Booking",1000,10,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}
}
