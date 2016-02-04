import java.util.Collections;
import java.util.LinkedList;

public class Deck {
	private LinkedList<Card> contents;
	
	public Deck() {
		this.contents = new LinkedList<Card>();
	}
	
	public void buildDeck() {
		Color cl;
		Type t;
		
		cl = Color.RED;
		for (int i = 0; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.YELLOW;
		for (int i = 0; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.GREEN;
		for (int i = 0; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.BLUE;
		for (int i = 0; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.RED;
		for (int i = 1; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.YELLOW;
		for (int i = 1; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.GREEN;
		for (int i = 1; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		cl = Color.BLUE;
		for (int i = 1; i < 13 ; i++) {
			t = Type.toType(i);
			contents.add(new Card(cl, t));
		}
		for (int i = 0 ; i < 4; i++) {
			contents.add(new Card(Color.WILD, Type.wild));
			contents.add(new Card(Color.WILD, Type.drawFour));
		}		
	}
	
	public void shuffleDeck() {
		Collections.shuffle(contents);
	}
	
	public Card drawCard() {
		return contents.pop();
	}
	
	public void addCard(Card c) {
		contents.push(c);
	}
	
	public Card topCard() {
		return contents.getFirst();
	}
	
	public void printDeck() {
		for (Card c : contents) {
			System.out.println(c);
		}
	}
}
