package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import librarysystem_testingchallenge.Book;

class BookTest {

	public static final int ISBN_LOWER = 10;
	public static final int ISBN_UPPER = 13;
	public static final int AUTHOR_MINIMUM = 1;
	public static final int TITLE_MINIMUM = 1;
	public static final int RATING_LOWER = 1;
	public static final int RATING_UPPER = 5;

	Book book1;
	String authorValid, titleValid, iSBNValid, authorInvalid, titleInvalid, iSBNInvalid;
	int lowerRatingValid, lowerRatingInvalid, midRatingValid, upperRatingValid, upperRatingInvalid;

	@BeforeEach
	void setUp() throws Exception {

		book1 = new Book();

		authorValid = "Valid Author";
		titleValid = "aaa";
		iSBNValid = "VALIDISBNISBN";
		authorInvalid = "";
		titleInvalid = "";
		iSBNInvalid = "";
		lowerRatingValid = 1;
		lowerRatingInvalid = 0;
		midRatingValid = 3;
		upperRatingValid = 5;
		upperRatingInvalid = 6;
	}

	@Test
	void testBook() {
		// asserts that the actual value is not null
		assertNotNull(book1);
	}

	@Test
	void testBookStringStringStringIntValid() {

		book1 = new Book(iSBNValid, authorValid, titleValid, lowerRatingValid);

		assertEquals(iSBNValid, book1.getiSBN());
		assertEquals(authorValid, book1.getAuthor());
		assertEquals(titleValid, book1.getTitle());
		assertEquals(lowerRatingValid, book1.getRating());

	}

	@Test
	void testBookStringStringStringIntInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book(iSBNInvalid, authorValid, titleValid, lowerRatingValid);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Book(iSBNValid, authorInvalid, titleValid, lowerRatingValid);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Book(iSBNValid, authorValid, titleInvalid, lowerRatingValid);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Book(iSBNValid, authorValid, titleValid, lowerRatingInvalid);
		});
	}

	@Test
	void testGetSetiSBNValid() {
		book1.setiSBN(iSBNValid);
		assertEquals(iSBNValid, book1.getiSBN());
	}

	@Test
	void testGetSetiSBNInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book1.setiSBN(iSBNInvalid);
		});

		assertEquals("Number of characters must be " + ISBN_LOWER + " or " + ISBN_UPPER,
				exception.getMessage());

	}

	@Test
	void testGetSetAuthorValid() {
		book1.setAuthor(authorValid);
		assertEquals(authorValid, book1.getAuthor());

	}

	@Test
	void testGetSetAuthorInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book1.setAuthor(authorInvalid);
		});

		assertEquals("Number of characters must be at least " + AUTHOR_MINIMUM, exception.getMessage());

	}

	@Test
	void testGetSetTitleValid() {
		book1.setTitle(titleValid);
		assertEquals(titleValid, book1.getTitle());
	}

	@Test
	void testGetSetTitleInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book1.setTitle(titleInvalid);
		});

		assertEquals("Number of characters must be at least " + TITLE_MINIMUM, exception.getMessage());

	}

	@Test
	void testGetSetRatingValid() {

		// lower valid
		book1.setRating(lowerRatingValid);
		assertEquals(lowerRatingValid, book1.getRating());

		// mid valid
		book1.setRating(midRatingValid);
		assertEquals(midRatingValid, book1.getRating());

		// upper valid
		book1.setRating(upperRatingValid);
		assertEquals(upperRatingValid, book1.getRating());
	}

	@Test
	void testGetSetRatingInvalid() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book1.setRating(lowerRatingInvalid);
		});

		assertEquals("Rating must be between " + RATING_LOWER + " and " + RATING_UPPER, exception.getMessage());

	}
}
