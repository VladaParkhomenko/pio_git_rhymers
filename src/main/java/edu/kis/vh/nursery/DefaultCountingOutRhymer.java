package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY = -1;
	private static final int ERROR = -1;
	private static final int MAX_SIZE = 12;


	private final int[] numbers = new int[MAX_SIZE];

	public int total = EMPTY;
	public void countIn(int in) {
		if (!isStackFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isStackFull() {
		return total == MAX_SIZE-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
