Feature: Test user details


  Scenario: check user details
    Given open user_deatils Page
    
    When click on user_Info button
    Then should redirect to user Info page
    