package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer i nadpisuje
 * metodę countIn, aby obsłużyć odrzucenie liczb na podstawie problemu Wieży
 * Hanoi. Klasa ta śledzi liczbę odrzuconych wartości.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0; // Zmienna przechowująca liczbę odrzuconych elementów

	/**
	 * Zwraca liczbę odrzuconych elementów, które nie spełniają warunków do dodania
	 * do stosu.
	 * 
	 * @return całkowita liczba odrzuconych elementów
	 */
	public int getRejectedCount() {
		return totalRejected;
	}

	/**
	 * Nadpisuje metodę countIn z klasy DefaultCountingOutRhymer. Jeśli stos nie
	 * jest pusty i wprowadzona liczba jest większa niż ta, która jest na szczycie
	 * stosu, liczba jest odrzucana. W przeciwnym razie liczba jest dodawana do
	 * stosu.
	 * 
	 * @param in liczba do dodania na stos
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++; // Zwiększa licznik odrzuconych elementów
		} else {
			super.countIn(in); // Dodaje liczbę do stosu, jeśli warunki są spełnione
		}
	}
}
