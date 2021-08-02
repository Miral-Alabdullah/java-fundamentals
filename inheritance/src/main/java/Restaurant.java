

public class Restaurant {

        private String restaurantName;
        private float numberOfStars;
        private float priceCategory;

    public Restaurant(String reName, float priceCat) {
        this.restaurantName = reName;
        this.priceCategory = priceCat;
    }


    public String getReataurantName() {
        return reataurantName;
    }

    public void setReataurantName(String reataurantName) {
        this.reataurantName = reataurantName;
    }

    public float getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(float numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public float getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(float priceCategory) {
        this.priceCategory = priceCategory;
    }





}