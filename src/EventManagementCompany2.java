public class EventManagementCompany2 {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Resha Kunkalekar");
		
		Options option1 = new Options("Air_Hall",500);
		
		AdOn a1 = new AdOn("Sound",1000);
		
		Options opl1[] = new Options[1];
		opl1[0] = option1;
		
		AdOn adl1[] = new AdOn[1];
		adl1[0] = a1;
		
		Services s1 = new Services("Hall_Booking",1000,10,opl1,adl1);
		
		s1.bookService(option1, adl1);
		s1.printBill();
	}
}
