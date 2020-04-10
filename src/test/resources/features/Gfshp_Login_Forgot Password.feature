Feature: GiftShop Forgot password
  Background:
    Given I navigate to Giftshop website
    When  I click the My Account options drop down menu option
    And   I select Login menu option
    And   I enter username "<username>"
    And   I click on Forgot Password link
    And   I enter email address for recovery "<recoveryemail> "
    And I click on continue button
  Scenario Outline: forgot password
      Examples:
        | username          | recoveryemail           |
        |adenike@gmail.com  | adenike@gmail.com       |
    Then  I get a success notification

    Scenario Outline: Invalid Forgot password
        Examples:
          | username | recoveryemail|
          |r@gmail.com|U@gmail.com  |

      Then  I get an error message " Warning: The E-Mail Address was not found in our records, please try again!"