Feature: As a user of the yahoo application, verify that user is able to send or receive emails


Background: User is Logged In
 Given Yahoo app is launched
 When User entered "ytestemail123@yahoo.com" and "Testemail@247"
 Then User clicked on submit button


@Smoke
Scenario: Validating user is able to send emails
Given User hovers on the mail
When User clicked on compose button
Then Verify user navigates to Compose page
When User entered  toEmailAddress and SubjectLine
And User entered Body Content
Then User clicks on Send Button
And close the driver


@Smoke
Scenario: Print all the links from Home page

Given print the links from home page
Then close the driver

