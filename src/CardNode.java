class CardNode extends Node {
	
	//private subclass reference
	private Card subclassCard;

	//default constructor
	public CardNode(Card c) {
		super(); //construct from base class
		
		subclassCard = c;
	}
	
	//accessor for subclass Card
	public Card getSubclassCard() {
		return subclassCard;
	}
	
	//toString() for subclassCard
	public String toString() {
		return subclassCard.toString();
	}
}
