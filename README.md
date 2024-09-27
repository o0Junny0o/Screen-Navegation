## Android Screen Navigation and Value Passing Demo

This project demonstrates basic navigation between screens in an Android app and how to pass values between them. It includes features for incrementing/decrementing a numeric value, changing the background color, and transitioning to the next or previous screen.

### Key Components

* **`MainActivity.java`:** This is the main activity file that handles user interactions and navigation logic.
* **`activity_main.xml` (layout file):** Defines the visual elements of the screen, including buttons, text views, etc.
* **`Page2Activity.java`:** This is the second activity file that handles user interactions and navigation logic.
* **`activity_page2.xml` (layout file):** Defines the visual elements of the screen, including buttons, text views, etc.
* **`Page3Activity.java`:** This is the third activity file that handles user interactions and navigation logic.
* **`activity_page3.xml` (layout file):** Defines the visual elements of the screen, including buttons, text views, etc.

### Functionality

* **Value Display and Modification:**
    * Receives a numeric value ("num") from the previous screen via Intent.
    * Displays the value on the screen.
    * Provides buttons to increase or decrease the value.

* **Background Color Change:**
    * Includes buttons to switch the background color to three predefined options.

* **Screen Navigation:**
    * **`returnPage()`:** Returns to the previous screen and passes back the updated numeric value.
    * **`nextPage()`:** Navigates to the next screen and passes the current numeric value.

* **Edge-to-Edge Display:**
    * Configures the layout to extend to the edges of the screen, handling system bar insets.

### Demo Video



https://github.com/user-attachments/assets/d57f87f9-5a80-41f5-8e1d-2be2fd6a639c



### How to Use

1. **Run the app.** The initial screen will be `MainActivity`.
2. **Interact with the elements:**  
    * Change the numeric value using the up and down buttons.
    * Switch the background color using the provided buttons.
    * Navigate forward to the next screen using the respective button.
3. **Navigate to `Page2Activity`.** This might involve clicking a button or performing some other action on the first screen.
4. **Interact with the elements:**
    * Change the numeric value using the up and down buttons.
    * Switch the background color using the provided buttons.
    * Navigate back to the previous screen or forward to the next screen using the respective buttons.
5. **Navigate to `Page2Activity`.** This might involve clicking a button or performing some other action on the first screen.
6. **Interact with the elements:**  
    * Change the numeric value using the up and down buttons.
    * Switch the background color using the provided buttons.
    * Navigate back to the previous screen using the respective button.
   
### Additional Notes

* This project serves as a basic example and may require additional features or modifications for real-world applications.
* Ensure that you have the necessary dependencies and resources set up in your Android project to build and run this code successfully.

Feel free to explore and enhance this code to create more complex navigation flows and value-passing mechanisms within your Android app.

Please let me know if you have any other questions. 
