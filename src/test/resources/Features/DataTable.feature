Feature: Test the login funcationality of OrangeHRM using DataTable

Scenario Outline: Test the valid login

#Given user is on login page
#When user enters  "sachin yadav"  and "Papa@1234"
#And click on login buttom
#Then user should land on home page

Given user is on login page using DataTable
When user enters  credentails using DataTable 
|sachin yadav|Papa@1234|
And click on login buttom
Then user should land on home page

