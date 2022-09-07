package wdh;

//Kinderticket, Tagesticket, 9EuroTicket, Kinoticket, Zugticket, Schwimmbadticket
public class Schwimmbadticket extends Ticket {

	public Schwimmbadticket(float price) {
		super(price);
	}
	
	public Schwimmbadticket(float price, String eventname) {
		super(price, eventname);
	}

	public Schwimmbadticket(float price, String eventname, String place, String date) {
		super(price, eventname, place, date);
	}

	@Override
	public float calcPrice() {
		return price;
	}

	
}
