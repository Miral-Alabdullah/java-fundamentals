package inheritance;

import java.util.ArrayList;

public class Shop implements ReviewThings{
    private String shopName;
    private String shopDescription;
    private float numberOfDollarSigns;
    private float numberOfStars;
    private ArrayList <Review> arrayList;

    public Shop(String shopName, String shopDescription, float dollarsSing) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.numberOfDollarSigns = dollarsSing;
        this.arrayList = new ArrayList<Review>();
    }


    @Override
    public void addReview(Review review) {
        arrayList.add(review);
    }

    @Override
    public void calculateStars(Review review) {
        float sum = 0;
        for (Review review1: arrayList){
            sum += review1.getNumberOfStars();
        }
        this.numberOfStars = sum;
    }

    @Override
    public void dollarsSign(float price) {
        this.numberOfDollarSigns = price;
        if (price<10){
            System.out.println("$");
        } else if (price>=10 && price<25){
            System.out.println("$$");
        } else if (price>=25 && price<45){
            System.out.println("$$$");
        }
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public float getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public void setNumberOfDollarSigns(float numberOfDollarSigns) {
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName ='" + getShopName() + '\'' +
                ", shopDescription ='" + getShopDescription() + '\'' +
                ", numberOfDollarSigns ='" + getNumberOfDollarSigns() + '\'' +
                '}';
    }

}
