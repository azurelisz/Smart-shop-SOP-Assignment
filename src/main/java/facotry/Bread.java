package facotry;

public class Bread implements Bakery {
    private String bakeryName;
    private String bakeryDescription;
    private String bakeryType;
    private double price;
    private String expireDate;
    private int quantity;


    @Override
    public String getBakeryName() {
        return bakeryName;
    }

    @Override
    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    @Override
    public String getBakeryDescription() {
        return bakeryDescription;
    }

    @Override
    public void setBakeryDescription(String bakeryDescription) {
        this.bakeryDescription = bakeryDescription;
    }
    @Override
    public String getBakeryType() {
        return bakeryType;
    }

    @Override
    public void setBakeryType(String bakeryType) {
        this.bakeryType = bakeryType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getExpireDate() {
        return expireDate;
    }

    @Override
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
