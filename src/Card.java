
public class Card implements Comparable{
	private Color color;
	private Type type;
	
	public Card(Color col, Type typ) {
		this.color = col;
		this.type = typ;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Type getType() {
		return this.getType();
	}
	
	public boolean setColor(Color c) {
		if (this.type != Type.wild && this.type != Type.drawFour) {
			return false;
		}
		this.color = c;
		return true;
	}
	
	public String toString() {
		String s = "";
		s += color.toString();
		s += " ";
		s += type.toString();
		return s;
	}

	@Override
	public int compareTo(Object arg0) {
		Card other = (Card) arg0;
		
		return 0;
	}
}
