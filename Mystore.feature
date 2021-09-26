 Feature: Register user on Website and verify product is added
  
  scenario: Navigate to log in page
  Given: I am on automationpractice.com/index.php
  When:I click on sign in on landing page
  Then:Verify I am navigated to log in page
  
  scenario:Enter email id and authenticate
  Given: I am on log in page
  And:I enter email id
  And:I click on create an account
  And: I enter my personal details
  When:I click on register button
  Then:Verify I am navigated to my account page
  And: First name and last name is displayed on my account page
  
  scenario: sign out
  Given: I am on my account page
  When:I click on sign out button
  Then:Verify I am navigated to login page
  
  scenario:Login
  Given:I am on log in page
  When:I click on sign in button
  And:I enter username and password
  And:I click on sign in
  Then:Verify I am navigated to My Account page
  
  scenario: Add product to cart
  Given:I am on My Account page
  When:I click on dresses
  And:I click on casual dresses
  And: I click on Add to cart
  And:I click on cart
  Then:Verify 1 item is added to cart

  Scenario: Validate the payment page
    When:I click on proceed to check out
    And: I click on proceed to check out in carts page
    And: I click on proceed to check out in address page
    And: I accept terms and condition in shipping page
    And: I click on proceed to check out in shipping page
    Then: Verify navigated to payment page

