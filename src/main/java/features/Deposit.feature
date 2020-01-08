# new feature
# Tags: optional

Feature: Verify Deposit feature

 Scenario Outline: Verify Deposit feature
   Given I open website https://www.way2automation.com/angularjs-protractor/banking/#/customer
   When I click customer name as <customerName>
   And I click login button
   Then I verify login successfully with <customerNameEntered>
   Examples:
     | customerName | customerNameEntered|
     | Harry Potter | Harry Potter       |