package facotry;

public interface Bakery {
    public String getBakeryName();
    public void setBakeryName(String bakeryName);

    public String getBakeryDescription();
    public void setBakeryDescription(String bakeryDescription);

    public String getBakeryType();
    public void setBakeryType(String bakeryType);

    public double getPrice();
    public void setPrice(double price);

    public String getExpireDate();
    public void setExpireDate(String expireDate);

    public int getQuantity();
    public void setQuantity(int quantity);
}
