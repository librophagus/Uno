
public enum Type {
	zero,
	one,
	two,
	three,
	four,
	five,
	six,
	seven,
	eight,
	nine,
	skip,
	reverse,
	drawTwo,
	wild,
	drawFour;
	
	public static Type toType(int i) {
		switch(i) {
		case 0: return zero;
		case 1: return one;
		case 2: return two;
		case 3: return three;
		case 4: return four;
		case 5: return five;
		case 6: return six;
		case 7: return seven;
		case 8: return eight;
		case 9: return nine;
		case 10: return skip;
		case 11: return reverse;
		case 12: return drawTwo;
		case 13: return wild;
		case 14: return drawFour;
		default: return null;
		}
	}
}
