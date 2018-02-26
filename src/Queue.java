class Queue {

	private Node head;
	private Node tail;

	// default constructor
	public Queue() {
		head = null;
		tail = null;
	}

	// add node
	public void add(Node newNode) {

		// if newNode has no value set (null) we return
		if (newNode == null) {
			return;
		}

		// if head and tail have no value set (null), we set them to the value of
		// newNode
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		}

		tail.next = newNode;

		tail = newNode;
	}

	public Node remove() throws QueueEmptyException {

		Node storage;

		// check for throwing empty exception
		if (head == null) {
			throw new QueueEmptyException();
		}

		storage = head;
		head = head.next;

		// check for last node in order to terminate queue
		if (head == null) {
			tail = null;
		}

		// terminate storage node and return
		storage.next = null;
		return storage;
	}

	public String toString() {

		Node s;

		for (s = head; s != null; s = s.next) {
			System.out.println(s.toString());
		}
		return null;
	}
}
