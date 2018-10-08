package tasks;

public class Books {
    private String title;
    private String author;
    private Float prize;
    private boolean discount;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Float getPrize() {
        return prize;
    }

    public boolean isDiscount() {
        return discount;
    }
    
    public Books(String title, String author, Float prize, boolean discount) {
        this.title = title;
        this.author = author;
        this.prize = prize;
        this.discount = discount;
    }
}
