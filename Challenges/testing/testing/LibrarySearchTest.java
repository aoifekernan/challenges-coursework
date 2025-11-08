package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import librarysystem_testingchallenge.Book;
import librarysystem_testingchallenge.LibrarySearch;

class LibrarySearchTest {

	// test arrays

	Book book1, book2, book3;

	String titleB1, titleB2, titleB3;

	String authorB1, authorB2, authorB3;

	String iSBNB1, iSBNB2, iSBNB3;

	int ratingB1, ratingB2, ratingB3;

	ArrayList<Book> arrayList;

	@BeforeEach
	void setUp() throws Exception {

		titleB1 = "BookTitle1";
		titleB2 = "BookTitle2";
		titleB3 = "BookTitle3";
		authorB1 = "AuthorB1";
		authorB2 = "AuthorB2";
		authorB3 = "AuthorB3";

		iSBNB1 = "ISBN000001";
		iSBNB2 = "ISBN000002";
		iSBNB3 = "ISBN000001";

		ratingB1 = 1;
		ratingB2 = 3;
		ratingB3 = 5;

		// create the test book objects
		book1 = new Book(iSBNB1, authorB1, titleB1, ratingB1);
		book2 = new Book(iSBNB2, authorB2, titleB2, ratingB2);
		book3 = new Book(iSBNB3, authorB3, titleB3, ratingB3);

		// create array list of books
		arrayList = new ArrayList<Book>();

		arrayList.add(book1);
		arrayList.add(book2);
		arrayList.add(book3);

	}

	@Test
	void testSearchByTitle() {

		ArrayList<Book> results = LibrarySearch.searchByTitle(arrayList, titleB1);

		if (results.contains(book1)) {
			assertTrue(true);

		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByAuthor() {

		ArrayList<Book> results = LibrarySearch.searchByAuthor(arrayList, authorB2);

		if (results.contains(book2)) {
			assertTrue(true);

		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByRating() {

		ArrayList<Book> results = LibrarySearch.searchByRating(arrayList, ratingB3);

		if (results.contains(book3)) {
			assertTrue(true);

		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByiSBN() {
		ArrayList<Book> results = LibrarySearch.searchByiSBN(arrayList, iSBNB2);

		if (results.contains(book2)) {
			assertTrue(true);

		} else {
			assertTrue(false);
		}
	}
}
