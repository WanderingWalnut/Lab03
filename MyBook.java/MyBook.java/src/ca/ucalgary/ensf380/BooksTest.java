package ca.ucalgary.ensf380;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BooksTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("123456789", 300);
    }

    @Test
    public void testGetIsbn() {
        assertEquals("123456789", book.getIsbn());
    }

    @Test
    public void testGetPages() {
        assertEquals(300, book.getPages());
    }
}

