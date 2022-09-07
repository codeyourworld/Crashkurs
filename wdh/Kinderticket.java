package wdh;

public class Kinderticket extends Schwimmbadticket {

	public Kinderticket(float price) {
		super(price);
	}
	
	public Kinderticket(float price, String eventname) {
		super(price, eventname);
	}

	public Kinderticket(float price, String eventname, String place, String date) {
		super(price, eventname, place, date);
	}

	@Override
	public float calcPrice() {
		return price/2;
	}
	
	@Override
	public String toString() {
		
		return "Der Preis ist : " + price;
	}
}
