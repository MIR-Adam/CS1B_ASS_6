public class Foothill {
	
	public static void main (String[] args) throws QueueEmptyException {
		
		//storage card
		Card storage;
		
		Card Card1 = new Card ('k', Card.Suit.clubs);
		Card Card2 = new Card ('j', Card.Suit.spades);
		Card Card3 = new Card ('7', Card.Suit.diamonds);
		Card Card4 = new Card ('q', Card.Suit.hearts);
		
		//begin CardQueue instance
		CardQueue myQueue = new CardQueue();
		
		//add cards to CardQueue
		myQueue.addCard(Card1);
		myQueue.addCard(Card2);
		myQueue.addCard(Card3);
		myQueue.addCard(Card4);
		
		//Queue toString
		myQueue.toString();
		
		//while a card removed from queue is not null
		while ((storage = myQueue.removeCard()) != null) {
			System.out.println(storage);
		}
	}

}
