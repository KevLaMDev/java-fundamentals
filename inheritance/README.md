# Inheritance

### This app allows users to instantiate Restaurant and Review objects representing both of their real-life counterparts. 
### The app consists of five classes: Restaurant, Shop, Theater, TheaterReview and Review.
Theater Review is a subclass of the Review class, intended for use with the Theater class of objects. This is due to TheaterReview requiring all the fields of the Review class and also an extra field pertaining to Theater objects.


- users can:
  - instantiate Restaurant, Shops, Theater class objects and add reviews to them with the Review and TheaterReview class objects.
  - add review class objects to restaurant class objects via the addReview Restaurant class method. This method takes in a Review object and adds it to the respective Restaurant object property of reviews, which is an arraylist of review objects.
  - the addReview method also calls the updateRating method, which updates the respective Restaurant object's star rating. updateRating iterates through the Restaurant objects arraylist property of reviews and aggregates the total amount of stars. It then assigns the average of total stars divided by the amount of review objects in the arraylist.
- To test: Run the test suit provided in LibraryTest.java
- Note: When instantiating new Restaurant class objects, the stars value should be initialized at zero. This is done to accurately represent real-life reviews of restaurants. New restaurants do not open with a default rating, rather have an average rating as it accumulates ratings over time.