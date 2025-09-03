# Automation-script
Description:

This project contains a Selenium WebDriver automation script written in Java. The script demonstrates a basic flow of automating tasks on a live e-commerce website (e.g., Myntra):

  1)Open the website and maximize the browser window.
  2)Login using a mobile number (OTP to be entered manually).
  3)Accept terms and conditions.
  4)Select one product from the wishlist.
  5)Logout from the account.

The script uses explicit waits to handle dynamic elements, ensuring smooth interaction with web elements. It serves as an example for learning Selenium automation and writing test scripts.

Prerequisites / Setup:

  1)Java JDK installed
  2)Selenium WebDriver dependency added to the project
  3)ChromeDriver executable available in PATH

Assumptions:

 1)OTP must be entered manually in the browser during login.
 2)Only one product is selected in the wishlist before logout.