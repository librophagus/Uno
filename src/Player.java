import java.util.Collections;
import java.util.LinkedList;

public class Player {
	private LinkedList<Card> hand;
	private String name;
	private Dealer dealer;
	
	public Player(String n, Dealer d) {
		this.name = n;
		this.hand = new LinkedList<Card>();
		this.dealer = d;
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public void getCard() {
		hand.add(dealer.drawCard());
	}
	
	public void sortHand() {
		Collections.sort(hand);
	}
	
	public void printHand() {
		System.out.println("Player: " + name);
		for (Card c : hand) {
			System.out.println(c);
		}
	}
	
	public String toString() {
		return name;
	}
}
