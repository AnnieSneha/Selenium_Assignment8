
@tag
Feature: Simple Form


@tag1
Scenario: To validate the simple form application
    Given Open the browser and enter the URL 
    When User enters firstname,lastname,email,contactno
    And User enter the message on textbox
    Then User clicks the submit button
    And Alert message should be displayed and click on Ok

#@tag2
#Scenario Outline: To validate the simple form application
    #Given Open the browser and enter the URL 
    #When User enters "<firstname>","<lastname>","<email>","<contactno>"
    #Then User clicks the submit button
    #And Alert message should be displayed and click on Ok

    #Examples: 
       #| firstname  | lastname | email            | contactno  | 
       #| Annie      | Sneha    | asat15@gmail.com | 9202282002 |
       #| Sona       | Christia | soan15@gmail.com | 8123495678 |         |
