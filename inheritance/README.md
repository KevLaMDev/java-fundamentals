# Inheritance

### This app allows users to instantiate Restaurant and Review objects representing both of their real-life counterparts. 
### The app consists of two classes: Restaurant and Review. Restaurant includes 3 public class methods: a toString method, addReview which adds a review object to the respective restaurant object's arraylist of reviews property, and updateRating, which updates the restaurant instance's rating. The Review class, has two public class methods: a toString and a modifyReview, allowing the rating and body of review instances to be changed.

- users can:
  - instantiate Restaurant and Review class objects
  - add review class objects to restaurant class objects via the addReview Restaurant class method. This method takes in a Review object and adds it to the respective Restaurant object property of reviews, which is an arraylist of review objects.
  - the addReview method also calls the updateRating method, which updates the respective Restaurant object's star rating. updateRating iterates through the Restaurant objects arraylist property of reviews and aggregates the total amount of stars. It then assigns the average of total stars divided by the amount of review objects in the arraylist.
- To test: Run the test suit provided in LibraryTest.java
- Note: When instantiating new Restaurant class objects, the stars value should be initialized at zero. This is done to accurately represent real-life reviews of restaurants. New restaurants do not open with a default rating, rather have an average rating as it accumulates ratings over time.