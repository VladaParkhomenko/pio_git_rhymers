package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] number = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isStackFull())
			number[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isStackFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return number[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return number[total--];
	}

}
