public class QueueEmptyException extends Exception {

	public QueueEmptyException() {
		super("(QUEUE IS NOW EMPTY!)");
	}
}
