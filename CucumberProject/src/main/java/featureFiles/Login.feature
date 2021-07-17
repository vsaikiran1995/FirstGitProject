Feature: Login into Application

 
Scenario Outline: Validating login feature for valid user

Given Yahoo app is launched
When User entered <username> and <password>
And User clicked on submit button
Then verify the home page is displayed with user <firstName>

Examples:
|username		        |password     |firstName|
|ytestemail123@yahoo.com|Testemail@247|YTest	|


@Smoke11111111
Scenario Outline: Print all the links from Home page

Given Yahoo app is launched
When User entered <username> and <password>
And User clicked on submit button
Then print the links from home page

Examples:
|username		        |password     |
|ytestemail123@yahoo.com|Testemail@247|