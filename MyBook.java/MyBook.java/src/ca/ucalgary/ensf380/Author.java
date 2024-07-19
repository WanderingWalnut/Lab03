package ca.ucalgary.ensf380;

public class Author {
    private String name;
    private String address;
    private int age;

    public Author(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Author() {}

    public String write() {
        // Method for author to write something
        return "Author's Writing";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}