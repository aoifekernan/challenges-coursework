package librarysystem_testingchallenge;

/**
 * book class - represents a book in a system
 * 
 * @author aoifekernan
 */

public class Book {

	public static final int ISBN_LOWER = 10;
	public static final int ISBN_UPPER = 13;
	public static final int AUTHOR_MINIMUM = 1;
	public static final int TITLE_MINIMUM = 1;
	public static final int RATING_LOWER = 1;
	public static final int RATING_UPPER = 5;

	/**
	 * The book's ISBN
	 */
	private String iSBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * The rating of the book
	 */
	private int rating;

	/**
	 * default constructor
	 */
	public Book() {

	}

	/**
	 * @throws IllegalArgumentException
	 * @param iSBN
	 * @param author
	 * @param title
	 * @param rating
	 */
	public Book(String iSBN, String author, String title, int rating) {
		this.setiSBN(iSBN);
		this.setAuthor(author);
		this.setTitle(title);
		this.setRating(rating);
	}

	/**
	 * @return the iSBN
	 */
	public String getiSBN() {
		return iSBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 * @throws IllegalArgumentException
	 */
	public void setiSBN(String iSBN) throws IllegalArgumentException {
		if (iSBN.length() == ISBN_LOWER || iSBN.length() == ISBN_UPPER) {
			this.iSBN = iSBN;
		} else {
			throw new IllegalArgumentException(
					"Number of characters must be " + ISBN_LOWER + " or " + ISBN_UPPER);
		}
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 * @throws IllegalArgumentException
	 */
	public void setAuthor(String author) {
		if (author.length() >= AUTHOR_MINIMUM) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Number of characters must be at least " + AUTHOR_MINIMUM);
		}
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 * @throws IllegalArgumentException
	 */
	public void setTitle(String title) {
		if (title.length() >= TITLE_MINIMUM) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Number of characters must be at least " + TITLE_MINIMUM);
		}
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 * @throws IllegalArgumentException
	 */
	public void setRating(int rating) {
		if (rating >= RATING_LOWER && rating <= RATING_UPPER) {
			this.rating = rating;

		} else {
			throw new IllegalArgumentException("Rating must be between " + RATING_LOWER + " and " + RATING_UPPER);
		}

	}
}
