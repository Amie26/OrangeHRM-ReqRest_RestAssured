
Feature: Login
  As an Admin I want to Login successfully

  Scenario: Verify Admin should be able to Login successfully
    Given I am on orangehrmlive homepage
    And I enter user name "Admin"
    And I enter  password "admin123"
    When I click on Login Button
    Then I can Login Successfully

    Scenario: Verify Admin can Log out successfully
      Given I am on orangehrmlive homepage
      And I enter user name "Admin"
      And I enter  password "admin123"
      When I click on Login Button
      Then I am on orangehrmlive homepage
      And I click on welcome user link
      When I click on Logout page
      Then I Logout successfully

