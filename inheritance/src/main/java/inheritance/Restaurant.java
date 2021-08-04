package inheritance;


import java.util.ArrayList;


public class Restaurant implements ReviewThings{

    private String restaurantName;
    private float numberOfStars;
    private float priceCategory;
    private ArrayList <Review> arrayList;

    public Restaurant(String reName, float priceCat) {
        this.restaurantName = reName;
        this.priceCategory = priceCat;
        this.arrayList = new ArrayList<Review>();
    }


    @Override
    public void addReview(Review review) {
        System.out.println(review);
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
        this.priceCategory = price;
        if (price<10){
            System.out.println("$");
        } else if (price>=10 && price<25){
            System.out.println("$$");
        } else if (price>=25 && price<45){
            System.out.println("$$$");
        }
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public float getNumberOfStars() {
        return this.numberOfStars;
    }

    public void setNumberOfStars(float numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public float getPriceCategory() {
        return this.priceCategory;
    }

    public void setPriceCategory(float priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        String s = "Name of the restaurant : " + getRestaurantName() + "\t"
                + "Number of stars : " + getNumberOfStars() +
                "\t" + "Price category : " + getPriceCategory();
        System.out.println(s);
        return s;
    }



}
