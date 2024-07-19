package ca.ucalgary.ensf380;

public class Story extends Book {
    private Author[] theAuthor;

    public String plot() {
        // Method to return the plot of the story
        return "Story Plot";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }
}

