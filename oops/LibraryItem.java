import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId(){ return itemId; }
    public void setItemId(String id){ this.itemId = id; }
    public String getTitle(){ return title; }
    public void setTitle(String t){ this.title = t; }
    public String getAuthor(){ return author; }
    public void setAuthor(String a){ this.author = a; }
    public abstract int getLoanDuration();
    public void getItemDetails(){ System.out.println("ID: " + itemId + " | Title: " + title + " | Author: " + author + " | Loan days: " + getLoanDuration()); }
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(String id, String title, String author){ super(id,title,author); }
    public int getLoanDuration(){ return 21; }
    public boolean reserveItem(String userId){
        if(available){ available = false; return true; }
        return false;
    }
    public boolean checkAvailability(){ return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    public Magazine(String id, String title, String author){ super(id,title,author); }
    public int getLoanDuration(){ return 7; }
    public boolean reserveItem(String userId){
        if(available){ available = false; return true; }
        return false;
    }
    public boolean checkAvailability(){ return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(String id, String title, String author){ super(id,title,author); }
    public int getLoanDuration(){ return 14; }
    public boolean reserveItem(String userId){
        if(available){ available = false; return true; }
        return false;
    }
    public boolean checkAvailability(){ return available; }
}

public class LibraryManagement {
    public static void main(String[] args){
        List<LibraryItem> items = new ArrayList<>();
        Book b = new Book("B001","Java Programming","Author A");
        Magazine m = new Magazine("M001","Tech Today","Editor X");
        DVD d = new DVD("D001","Movie X","Director Y");
        items.add(b);
        items.add(m);
        items.add(d);
        for(LibraryItem it : items){
            it.getItemDetails();
            if(it instanceof Reservable){
                Reservable r = (Reservable)it;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("user123");
                System.out.println("Available after reserve: " + r.checkAvailability());
            }
        }
    }
}
