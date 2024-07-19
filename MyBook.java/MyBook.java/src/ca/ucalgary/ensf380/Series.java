package ca.ucalgary.ensf380;

public class Series {
    private String seriesName = "Unknown";

    public String theme() {
        // Method to return the theme of the series
        return "Series Theme";
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
