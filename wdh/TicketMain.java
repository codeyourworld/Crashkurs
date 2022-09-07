package wdh;

public class TicketMain {

	public static void main(String[] args) {
		
		Ticket [] tickets = new Ticket [4];
		
		tickets[0] = new Kinderticket(3.50f);
		tickets[1] = new Kinderticket(9.4f);
		tickets[2] = new Schwimmbadticket(10.98f, "Holthusenbad - Party");
		tickets[3] = new Schwimmbadticket(15.40f, "Bäderland - Jahresfeier", "Hamburg", "heute");
		
		for(int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i].calcPrice());
		}

		float sum = 0.0f;
		for(Ticket t : tickets) {
			sum += t.calcPrice();
//			System.out.println(t.calcPrice());
		}
		System.out.println("Der Gesamtpreis ist " + sum);
	}

}
