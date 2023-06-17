#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And : To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios

@TC1
Feature: Login Validation

Scenario: Validation of Login Page 

Given User Launches the application
When User tries to Login
Then Validate whether user is giving proper credentials 
And USer navigates to home page successfuly 
And Closes the browser