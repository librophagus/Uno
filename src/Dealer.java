import java.util.LinkedList;

public class Dealer {

	private Deck draw;
	private Deck play;
	private LinkedList<Player> players;
	
	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		
		//Setup draw pile
		dealer.draw = new Deck();
		dealer.draw.buildDeck();
		dealer.draw.shuffleDeck();
		dealer.draw.shuffleDeck();
		//dealer.draw.printDeck();
		
		//Setup play pile (empty)
		dealer.play = new Deck();
		
		//Initialize players
		dealer.players = new LinkedList<Player>(); 
		Player alice = new Player("Alice", dealer);
		Player bob = new Player("Bob", dealer);
		
		dealer.players.offer(bob);
		dealer.players.offer(alice);
		
		//Deal cards
		Card c;
		for (int i = 0 ; i < 7 ; i++) {
			for (Player p : dealer.players) {
				c = dealer.draw.drawCard();
				p.addCard(c);
			}
		}
		
		for (Player p : dealer.players) {
			p.printHand();
		}
	}

	public boolean isValid(Card c) {
		Color col = c.getColor();
		Type typ = c.getType();
		Card top = play.topCard();
		
		if (c.getType() == Type.wild) {
			return true;
		}
		if (c.getType() == Type.drawFour) {
			return true;
		}
		
		if (top.getColor() == col) {
			return true;
		}
		if (top.getType() == typ) {
			return true;
		}
		
		return false;
	}
	
	public Card drawCard() {
		return draw.drawCard();
	}
}
