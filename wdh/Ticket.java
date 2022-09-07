package wdh;

public abstract class Ticket {

	//alt + shift + s
	//Preis, Eventname, Ort und Datum
	protected float price = 0.0f;
	protected String eventname = "";
	protected String place = "";
	protected String date = "unknown";
	
	public Ticket(float price) {
		this.price = price;
	}
	
	public Ticket(float price, String eventname) {
		this(price);
		this.eventname = eventname;
	}
	
	public Ticket(float price, String eventname, String place, String date) {
		this(price, eventname);
		this.place = place;
		this.date = date;
	}
	
	public abstract float calcPrice();
	
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

//	Man kann kein Objekt von abstrakten Klassen erstellen!
//	public static void main(String[] args) {
//		Ticket ticket = new Ticket(3.99f);
//	}
	
	
	//"Ist" eine Beziehung
	
	//super class Auto
	//Kindklassen VW, BWM, ...
	
	//Auto hat ein Motor
	
	//Tiere
	//Hund, 
	//Dalmatina
	
	//Zug
	//Schnellzug
	

	//"Hat" Beziehung, Klassen nutzen andere Klassen, haben sie als Attribute
	//Lokomotive hat Wagons

}
