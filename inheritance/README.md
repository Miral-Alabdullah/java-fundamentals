# This project conatins the following : 

# Classes : 

## Review =>

   * Fields : 

     - body

	 - author

	 - numberOfStars

	 - movieName
 
 <br>
 <br>

   * Methods : 

      - Two construcors => 

	    - One without movie and the other has it. 

 <br>
 <br>

## ReviewThings (Interface) =>


   * Methods : 

      - **addReview(Review review)**

	  - **calculateStars(float numberOfStars)**

	  - **calculateStars(float numberOfStars)**


<br>
<br>


## Restaurant => This class implements the ReviewThings and override its methods

   * Fields : 

     - restaurantName

	 - numberOfStars

	 - priceCategory

	 - priceCategoryV2

	 - arrayList
 
 <br>
 <br>

   * Methods : 

      - **addReview(Review review)** => To add the review for each restaurant.

	  - **calculateStars(float numberOfStars)** => This method it takes a float number and it called in the addReview(), as soon as the review been added, the average of the reviews's stars will be calculated for each reastaurant.

	  - **cdollarsSign(float price)** => This method takes a float number and based on the condition of it's implementaion, the number of dollar signs will be set.

	  - **toString()** => This method takes the review and the information of the restaurant to be presented as a string.

 <br>
 <br>

## Shop => This class implements the ReviewThings and override its methods

   * Fields : 

     - shopName

	 - shopDescription

	 - numberOfDollarSigns

	 - numberOfStars

	 - priceCategoryV2

	 - arrayList
 
 <br>
 <br>

   * Methods : 

      - **addReview(Review review)** => To add the review for each shop.

	  - **calculateStars(float numberOfStars)** => This method it takes a float number and it called in the addReview(), as soon as the review been added, the average of the reviews's stars will be calculated for each shop.

	  - **cdollarsSign(float price)** => This method takes a float number and based on the condition of it's implementaion, the number of dollar signs will be set.

	  - **toString()** => This method takes the review and the information of the shop to be presented as a string.

<br>
<br>

## Theater => This class implements the ReviewThings and override its methods

   * Fields : 

     - shopName

	 - shopDescription

	 - numberOfDollarSigns

	 - numberOfStars

	 - priceCategoryV2

	 - arrayList
 
 <br>
 <br>

   * Methods : 

      - **addReview(Review review)** => To add the review with or without movie for each theater.

	  - **calculateStars(float numberOfStars)** => This method it takes a float number and it called in the addReview(), as soon as the review been added, the average of the reviews's stars will be calculated for each theater.

	  - **toString()** => This method takes the review with movie and the information of the theater to be presented as a string.

	  - **addMovie()** => This method will add a movie to a movies' list.

	  - **removeMovie(**) => Removes the movie from the list.