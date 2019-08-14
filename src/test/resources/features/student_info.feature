Feature: Test student details


  Scenario: check student details
    Given open student_deatils Page
    
    When click on student_Info button
    Then should redirect to student Info page
    