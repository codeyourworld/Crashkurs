package wdh;

public class Lokomotive {

	//eigenschaften oder hat-Beziehung sind Objektvariablen
	private Wagon wagons[] = new Wagon[5];
	private String bezeichnung = "";
	
	public Lokomotive(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public Lokomotive(String bezeichnung, Wagon [] wagons) {
		this(bezeichnung);
		this.wagons = wagons;
	}
	
	public void addWagon(Wagon wagon) {
		//...
	}
	
	public void removeWagon(Wagon wagon) {
		//...
	}
	
	public static void main(String[] args) {
		Lokomotive lokomotive = new Lokomotive("RE2"); 		//ref01
		Wagon wagons[] = new Wagon[1];
		wagons[0] = new Wagon();
		Lokomotive lokomotive2 = new Lokomotive("ME263", wagons);	//ref02
		//lokomotive = new Lokomotive("RE2", wagons);					//ref03
		lokomotive.addWagon(wagons[0]);
		
		
	}
	
}
