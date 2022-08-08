  Feature: Some feature

    Scenario: User successfully logs in as Admin
      Given user navigates to login page
      When user login as admin
      Then user sees admin landing page
