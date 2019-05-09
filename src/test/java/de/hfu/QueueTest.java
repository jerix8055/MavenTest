package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {
	
	@Test(expected=IllegalStateException.class)
	public void testDequeueEmpty() {
		Queue q3 = new Queue(3);
		q3.dequeue();
	}
	
	@Test
	public void testEnqueue() {
		Queue q3 = new Queue(3);
		q3.enqueue(1);
		assertEquals("Rückgabe soll 1 sein", 1, q3.dequeue());
		q3.enqueue(1);
		q3.enqueue(2);
		assertEquals("Rückgabe soll 1 sein", 1, q3.dequeue());
		assertEquals("Rückgabe soll 2 sein", 2, q3.dequeue());
		q3.enqueue(1);
		q3.enqueue(2);
		q3.enqueue(3);
		assertEquals("Rückgabe soll 1 sein", 1, q3.dequeue());
		assertEquals("Rückgabe soll 2 sein", 2, q3.dequeue());
		assertEquals("Rückgabe soll 3 sein", 3, q3.dequeue());
	}
	
	@Test
	public void testEnqueueVoll() {
		Queue q3 = new Queue(3);
		q3.enqueue(1);
		q3.enqueue(2);
		q3.enqueue(3);
		q3.enqueue(4);
		assertEquals("Rückgabe soll 1 sein", 1, q3.dequeue());
		assertEquals("Rückgabe soll 2 sein", 2, q3.dequeue());
		assertEquals("Rückgabe soll 4 sein", 4, q3.dequeue());
	}
	
	@Test
	public void testEnqueueAnfangLeer() {
		Queue q3 = new Queue(3);
		q3.enqueue(1);
		q3.enqueue(2);
		q3.enqueue(3);
		assertEquals("Rückgabe soll 1 sein", 1, q3.dequeue());
		q3.enqueue(5);
		assertEquals("Rückgabe soll 2 sein", 2, q3.dequeue());
		assertEquals("Rückgabe soll 3 sein", 3, q3.dequeue());
		assertEquals("Rückgabe soll 5 sein", 5, q3.dequeue());
	}

}
