package aggregation;

public class Market {
	
	VegitableShop vegitableshop;
	
	int phoneno;
	String nameofmarket;
	
	Market(String nameofmarket, int phoneno, VegitableShop vegitableshop){
		this.phoneno = phoneno;
		this.nameofmarket = nameofmarket;
		this.vegitableshop = vegitableshop;
	}
	public void display() {
		System.out.println(nameofmarket + " " + phoneno);
		System.out.println(vegitableshop.veg + " " + vegitableshop.vegjuice);
	}

	public static void main(String[] args) {
		VegitableShop obj = new VegitableShop("Carrot", "Carrot Juice");
		
		Market obj1 = new Market("KAYAMKULAM", 2800 , obj);
		obj1.display();
	}

}
