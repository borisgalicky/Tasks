package tasks;

public class Stuff {
    private String name;
    private Float prize;
    private String country;
    private boolean discount;

    Stuff(String name, Float prize, String country, boolean discount) {
        this.name = name;
        this.prize = prize;
        this.country = country;
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrize(Float prize) {
        this.prize = prize;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
    public String getName() {
        return name;
    }
    public Float getPrize() {
        return prize;
    }
    public String getCountry() {
        return country;
    }
    public boolean isDiscount() {
        return discount;
    }
}
