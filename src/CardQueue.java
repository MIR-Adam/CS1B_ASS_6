class CardQueue extends Queue {
	
	public static final Card lastCard = null;
	
	public void addCard(Card c) {
		
		//check for null card
		if (c == null) {
			return;
		}
		
		CardNode myCardNode = new CardNode(c);
		
		//add pointing CardNode to constructor
		super.add(myCardNode);
	}
	
	public Card removeCard() {
		
		//remove the CardNode by setting it to null
		CardNode myCardNode = null;
		
		//exception test
		try
		{
			myCardNode = (CardNode)remove();
		} catch 
		(QueueEmptyException remove)
		{
			remove.printStackTrace();
		}
		
		//null CardNode test
		if (myCardNode == null) {
			return lastCard;
		}
		else {
			return myCardNode.getSubclassCard();
		}
	}
}
