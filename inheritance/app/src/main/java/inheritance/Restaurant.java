package inheritance;


import java.util.ArrayList;


public class Restaurant implements ReviewThings{

    private String restaurantName;
    private float numberOfStars;
    private float priceCategory;
    private String priceCategoryV2;
    private ArrayList <Review> arrayList;

    public Restaurant(String reName, float priceCat) {
        this.restaurantName = reName;
        this.priceCategory = priceCat;
        this.arrayList = new ArrayList<Review>();
        dollarsSign(this.priceCategory);
    }



    @Override
    public void addReview(Review review) {
        System.out.println(" Get Number of stars : " + review.getNumberOfStars());
        arrayList.add(review);
        calculateStars(review.getNumberOfStars());
        System.out.println(review);
    }


    @Override
    public void calculateStars(float numberOfStars) {
        float sum = 0;
        for (Review review1: arrayList){
            sum += review1.getNumberOfStars();
        }
        this.numberOfStars = sum/arrayList.size();
        System.out.println(this.numberOfStars);
    }

    @Override
    public void dollarsSign(float price) {
        String tracer = "";
        if (this.priceCategory<10){
            tracer = "$";
        } else if (this.priceCategory>=10 && this.priceCategory<25){
            tracer = "$$";
        } else if (this.priceCategory>=25 && this.priceCategory<45){
            tracer = "$$$";
        }
        this.priceCategoryV2 = tracer;
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

    public String getPriceCategoryV2() {
        return priceCategoryV2;
    }

    public void setPriceCategoryV2(String priceCategoryV2) {
        this.priceCategoryV2 = priceCategoryV2;
    }

    @Override
    public String toString() {
        String s = null;
//        for (Review i: arrayList){
        s =  "Name of the restaurant : " + getRestaurantName() + "\t"
                + "Number of stars : " + getNumberOfStars() +
                "\t" + "Price category : " + this.priceCategoryV2;;
//        }
        System.out.println(s);
        return s;
    }



}
