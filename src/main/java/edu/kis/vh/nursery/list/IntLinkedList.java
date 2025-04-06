package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int ERROR = -1;
	
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.value;
        last = last.getPrev();
        return ret;
    }

}
