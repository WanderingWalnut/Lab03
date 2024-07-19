package ca.ucalgary.ensf380;

public class Classic extends Hardcover {
    private int origPubYear = 1860;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    public String createNotes() {
        // Method to create notes for Classic
        return "Classic Notes";
    }

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Publisher[] getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher[] bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
