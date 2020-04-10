Feature: GiftShop Login
  Background:
    Given I navigate to Giftshop website
    When  I click the My Account options drop down menu option
    And   I select Login menu option

  Scenario:  Valid Login
    And   I enter username "nicholasobagunle@gmail.com"
    And   I enter password "nicholas"
    And   I enter click on Login button
    Then  I am logged In

 Scenario: Invalid Login
    And    I enter invalid username "Adenke677"
    And    I enter invalid password "Oyinloluuara1234444"
    And   I enter click on Login button

    Then   I am unable to login

   Scenario: Valid Registration
