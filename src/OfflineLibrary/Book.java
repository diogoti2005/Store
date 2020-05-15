package OfflineLibrary;

public class Books {
    public String name;
    public Books(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                '}';
    }
}
