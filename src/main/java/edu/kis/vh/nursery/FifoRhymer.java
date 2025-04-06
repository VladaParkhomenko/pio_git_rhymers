package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temporaryRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        // TODO: Consider adding a limit to the number of iterations to avoid potential infinite loops in case of stack issues.
        while (!callCheck())  
            getTemporaryRhymer().countIn(super.countOut());

        int ret = getTemporaryRhymer().countOut();  

        // TODO: Ensure the temporary rhymer is emptied after operation to avoid memory issues.
        while (!getTemporaryRhymer().callCheck()) 
            countIn(getTemporaryRhymer().countOut());

        return ret;
    }

    private DefaultCountingOutRhymer getTemporaryRhymer() {
        return temporaryRhymer;
    }
}
