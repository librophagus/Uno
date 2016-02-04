
public enum Color {
	RED,
	BLUE,
	YELLOW,
	GREEN,
	WILD;
	
	public static Color toColor(int i) {
		switch (i) {
		case 0: return RED;
		case 1: return BLUE;
		case 2: return YELLOW;
		case 3: return GREEN;
		case 4: return WILD;
		default: return null;
		}
	}
}
