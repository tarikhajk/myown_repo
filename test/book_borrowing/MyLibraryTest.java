package book_borrowing;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {

	// test constructor
	public void testMyLibrary() { // tests NEED to begin with the word 'test'
		MyLibrary ml = new MyLibrary("Test");
		assertEquals("Test", ml.name);
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.people instanceof ArrayList);
	}
	
	
}
