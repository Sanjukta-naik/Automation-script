# Automation-script
Description:

This project contains a Selenium WebDriver automation script written in Java. The script demonstrates a basic flow of automating tasks on a live e-commerce website (e.g., Myntra):

Open the website and maximize the browser window.

Login using a mobile number (OTP to be entered manually).

Accept terms and conditions.

Select one product from the wishlist.

Logout from the account.

The script uses explicit waits to handle dynamic elements, ensuring smooth interaction with web elements. It serves as an example for learning Selenium automation and writing test scripts.

Prerequisites / Setup:

Java JDK installed

Selenium WebDriver dependency added to the project

ChromeDriver executable available in PATH

Assumptions:

OTP must be entered manually in the browser during login.

Only one product is selected in the wishlist before logout.