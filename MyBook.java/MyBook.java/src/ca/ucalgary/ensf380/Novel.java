package ca.ucalgary.ensf380;

public class Novel extends Book {
    private Author[] theAuthor;
    private Series mySeries;

    public String theme() {
        // Method to return the theme of the novel
        return "Novel Theme";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series mySeries) {
        this.mySeries = mySeries;
    }
}
