Feature: login feature

  Scenario Outline: login with username and password
    When User Navigate To AmazonSite and click for Login
    And User enters Username "<UserName>"
    And User click on Continue Button
    And User enters Password "<Password>"
    And User clicks on Login button
    Then User is successfully logged in
    When User enters Authorname "<Authorname>"
    And User click on SearchTab button
    And Validate Book "<BookName>"

    Examples: 
      | UserName                   | Password  | Authorname| BookName  |
      | borkar.laxmikant@gmail.com | Pune@12345 |Manish Pathania | Poems that do not rhyme |

  