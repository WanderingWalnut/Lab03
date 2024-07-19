package ca.ucalgary.ensf380;

public class Fiction extends Paperback {
    public String coverArt() {
        // Override to provide specific Fiction cover art
        return "Fiction Cover Art";
    }

    public String genre() {
        // Method to return genre of fiction
        return "Fiction Genre";
    }
}

