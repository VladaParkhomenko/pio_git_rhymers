package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temporaryRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			getTemporaryRhymer().countIn(super.countOut());

		int ret = getTemporaryRhymer().countOut();

		while (!getTemporaryRhymer().callCheck())
			countIn(getTemporaryRhymer().countOut());

		return ret;
	}

	private DefaultCountingOutRhymer getTemporaryRhymer() {
		return temporaryRhymer;
	}
}

