public class Services {

	public String name;
	public int price;
	public int taxRt;
	public int amount;
	
	Options op[];
	AdOn ao[];
	
	Options opp;
	AdOn aon[];
	
	public Services(String n, int p, int t,Options o[],AdOn a[]) {
		name = n;
		price = p;
		taxRt = t;
		op = o;
		ao = a;
		amount = 0;
	}
	
	public void bookService(Options o, AdOn a[]){
		
		opp = o;
		aon = a;
		amount= amount + price;
		amount= amount + o.price;
		
		for(int i=0; i<aon.length; i++){
			amount = amount + aon[i].price;
		}
	}
	
	public void printBill(){
		Debuger.Log("\nName : "+name);
		Debuger.Log("\nPrice : "+price);
		Debuger.Log("\nOption : "+opp.name);
		Debuger.Log("\nOption : "+opp.price);
		
		for(int i=0; i<aon.length; i++){
			Debuger.Log("\nAdon : "+aon[i].name+" Price : "+aon[i].price);
		}
		Debuger.Log("\nTotal : "+amount);
	}
}
