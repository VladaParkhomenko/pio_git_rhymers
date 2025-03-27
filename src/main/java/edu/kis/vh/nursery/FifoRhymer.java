package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temporaryRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temporaryRhymer.countIn(super.countOut());

		int ret = temporaryRhymer.countOut();

		while (!temporaryRhymer.callCheck())
			countIn(temporaryRhymer.countOut());

		return ret;
	}
}
