package Activitat_6_2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Page> pages;

    public Book(String title) {
        this.title = title;
        this.pages = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public void addPage(Page page) {
        this.pages.add(page);
    }
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        Patron patron = new Patron();


    }
}
