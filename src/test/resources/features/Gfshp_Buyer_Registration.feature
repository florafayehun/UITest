Feature: GiftShop Buyer Registration

  Background:

    Given I navigate to the Giftshop website
    When  I click the My Account options drop down menu option
    And I select Register menu option
    And I Enter password1
    And I confirm password1
    And I enter one thing
    And I click Tolu
    And I enter telephone
    And I select Yes to Newsletter subscription
    And I check the Privacy Policy
    And I click Continue button

  Scenario: Valid Buyer Registration
    And  I enter firstname "Adenke"
    And  I enter lastname "Oyinloluuara"
    And I enter email "funmi@gmail.com"
    And I select No to Become Seller

    Then I am registered

  Scenario: InValid Buyer Registration

    And  I enter an invalid firstname "Adenike"
    And  I enter an invalid lastname "Oyinlola"
    And I enter an already registered email
    And I select No to Become Seller

    Then I get a validation message'Already registered email