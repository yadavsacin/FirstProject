Feature: Test the login funcationality of OrangeHRM

Scenario Outline: Test the valid login

#Given user is on login page
#When user enters  "sachin yadav"  and "Papa@1234"
#And click on login buttom
#Then user should land on home page

Given user is on login page
When user enters  <username>  and <password>
And click on login buttom
Then user should land on home page

Examples:
|username|password|
|sachin yadav|P|
|sachin yadav|Papa@123|