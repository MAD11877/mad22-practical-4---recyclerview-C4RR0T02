# MAD Practical 4 - RecyclerView
Continuing from last week, you will be adding RecyclerView to your app. <br/>
Follow the instructions below to complete your app.

1. Create a `List` of 20 `User` objects in the `ListActivity`. Randomize the `name`, `descriptions` and value of `followed`.

2. Replace the `ImageView` in the `ListActivity` with a `RecyclerView`. Populate the `RecyclerView` with the list created in previous step.

![RecyclerView](/images/p4_rv.png)

3. Add an `onClickListener` for the image such that it will show an Alert Dialog with the corresponding name. Clicking on the view button will direct the user to the `MainActivity` to show the profile page. Toggling the `Follow` button should save the state back in the respective `User` object.

Hint: You can use static variable. <br/>
Using global static variable is not a good software engineering practice. Are you able to figure other ways of achieving these behaviours?

![AlertDialog](/images/p4_alert.png)
![Profile](/images/p4_profile.png)

4. Modify the RecyclerView such that if the last digit of the name contains 7, a different layout is used as shown below. This new layout will have an additional `ImageView` that occupies the width of the screen and has a width-to-height ratio of 1:1.

![RecylerView](/images/p4_rv2.png)
