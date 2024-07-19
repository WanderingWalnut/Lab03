package ca.ucalgary.ensf380;

public class Nonfiction extends Book {
    private Category deweyClassification;

    public String topic() {
        // Method to return the topic of the nonfiction book
        return "Nonfiction Topic";
    }

    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }
}
