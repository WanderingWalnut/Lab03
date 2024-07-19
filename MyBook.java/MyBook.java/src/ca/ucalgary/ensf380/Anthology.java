package ca.ucalgary.ensf380;

public class Anthology extends Book {
    private Story[] story;

    public String storyOrder() {
        // Method to return the order of stories
        return "Story Order";
    }

    public Story[] getStory() {
        return story;
    }

    public void setStory(Story[] story) {
        this.story = story;
    }
}

