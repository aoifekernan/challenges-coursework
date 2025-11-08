package librarysystem_testingchallenge;

import java.util.ArrayList;

/**
 * Class enables various utility searches in libary books
 * 
 * @author aoifekernan
 *
 */

public class LibrarySearch {

	/**
	 * Search by title
	 * 
	 * @param title - String
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByTitle(ArrayList<Book> allBooks, String title) {
		ArrayList<Book> results = new ArrayList<Book>();
		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getTitle().equals(title)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}

	/**
	 * Search by Author
	 * 
	 * @param author - string
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByAuthor(ArrayList<Book> allBooks, String author) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getAuthor().equals(author)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}
	
	/**
	 * search by rating
	 * 
	 * @param rating
	 * @return array list of found books matching criteria
	 */

	public static ArrayList<Book> searchByRating(ArrayList<Book> allBooks, int rating) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (int i = 0; i < allBooks.size(); i++) {
			if (allBooks.get(i).getRating() == rating) {
				results.add(allBooks.get(i));

			}

		}
		return results;
	}
	/**
	 * Search by ISBN
	 * @param allBooks
	 * @param iSBN
	 * @return
	 */
	public static ArrayList<Book> searchByiSBN (ArrayList<Book> allBooks, String iSBN) {
		
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getiSBN().equals(iSBN)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}

}
