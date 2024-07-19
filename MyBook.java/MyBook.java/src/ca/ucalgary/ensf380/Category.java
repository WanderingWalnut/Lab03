package ca.ucalgary.ensf380;

public class Category {
    private Category subCategory;
    private Category superCategory;
    private String category;

    public String sort() {
        // Method to sort categories if needed
        return "";
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Category sub) {
        this.subCategory = sub;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
