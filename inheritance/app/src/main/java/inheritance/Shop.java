package inheritance;

import java.util.ArrayList;

public class Shop implements ReviewThings{
    private String shopName;
    private String shopDescription;
    private float numberOfDollarSigns;
    private float numberOfStars;
    private String priceCategoryV2;
    private ArrayList <Review> arrayList;

    public Shop(String shopName, String shopDescription, float dollarsSing) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.numberOfDollarSigns = dollarsSing;
        this.arrayList = new ArrayList<Review>();
        dollarsSign(this.numberOfDollarSigns);
    }


    @Override
    public void addReview(Review review) {
        arrayList.add(review);
        calculateStars(review.getNumberOfStars());
    }

    //Average and inside the addReview method
    @Override
    public void calculateStars(float numerOfStars) {
        float sum = 0;
        for (Review review1: arrayList){
            sum += review1.getNumberOfStars();
        }
        this.numberOfStars = sum/arrayList.size();
    }

    @Override
    public void dollarsSign(float price) {
        String tracer = "";
        if (this.numberOfDollarSigns<10){
            tracer = "$";
        } else if (this.numberOfDollarSigns>=10 && this.numberOfDollarSigns<25){
            tracer = "$$";
        } else if (this.numberOfDollarSigns>=25 && this.numberOfDollarSigns<45){
            tracer = "$$$";
        }
        this.priceCategoryV2 = tracer;
    }

    public String getPriceCategoryV2() {
        return priceCategoryV2;
    }

    public void setPriceCategoryV2(String priceCategoryV2) {
        this.priceCategoryV2 = priceCategoryV2;
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
        String s ="";
        s = "Name of the Shop : " + getShopName() + "\n" +
                "A brief description : " + getShopDescription() + "\n" +
                "Number of dollar signs : " + getPriceCategoryV2();
        System.out.println(s);
        return s;
    }

}
