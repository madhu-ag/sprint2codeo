Feature: login feature

  Background: Login
    Given Admin is on login page of Retail site
    When Admin enters the username and password
    And Admin clicks on login button
    Then he verifies that he is navigated to the Dashboard
    And admin clicks on Marketing icon
    And admin clicks on marketing

  Scenario Outline: Verify by entering details in Campaign name
    Given Admin is on Markertin tracking page
    When Admin verifies Campaign name text field
    Then Admin enters "<cname>" by already existing data in list and non existing data in the list
    And clicks on filter
    And verifies the list

    Examples: 
      | cname   |
      | abc     |
      | fddxgxd |

  Scenario Outline: Verify by entering details in Date added field
    Given Admin is on Markertin tracking page
    When Admin verifies Date added text field and calender icon
    Then Admin enters "<date>"
    And clicks on filter
    And verifies the list

    Examples: 
      | date       |
      | 2021-10-06 |
      | 2021-10-07 |

  Scenario Outline: Verify by entering details in Tracking code
    Given Admin is on Markertin tracking page
    When Admin verifies Tracking code text field
    Then Admin enters "<tcode>" in trabking code field by already existing data in listand non existing data in the list
    And clicks on filter
    And verifies the list

    Examples: 
      | tcode         |
      | 6135a8f3283d9 |
      | jriwod234edee |

  Scenario Outline: Verify the Add button and Add valid data
    Given Admin is on Markertin tracking page
    When Admin verifies and clicks the add button
    Then admin verifies that he is navigated to add marketing tracking page
    And verifies Campaign name, Campaign Description, Tracking code and Examples text field
    And add "<Cname>", "<Cdesc>" with alphanumeric,special character,twenty five characters
    And verifies tracking code is given by default example field has default URL
    And verifies and click on Save icon
    And verifeis the successful modification message

    Examples: 
      | Cname                     | Cdesc                     |
      | Naya123                   | Rggdf123d                 |
      | Nayd$@$                   | fsdmfmsgk%$$              |
      | Acbhdyehdjfkvhilidsxcdcdc | Achejmjmjnjjjddddccccccuu |

  @Sanity
  Scenario Outline: Verify the Add button and Add invalid tracking code
    Given Admin is on Markertin tracking page
    When Admin verifies and clicks the add button
    Then admin verifies that he is navigated to add marketing tracking page
    And verifies Campaign name, Campaign Description, Tracking code and Examples text field
    And add "<cname>" with any value and "<tcode>" with two hundred fifty seven characters
    And verifies and click on Save icon
    And verifies the Error message

    Examples: 
      | cname    | tcode                                                                                                                                                                                                                                                          |
      | adgxvxdv | Axnjkloiuytghjklpoiuytrewsdfghjklmnbvcxz4567890ioklcfsfdfqwertyuioplkjhgfdsazxcvbnmkjhgfdsaqwertyhg5678904567890-=ojhtgnjkmljhgvftyuhjkloiuytrewsdfghjklmnbvcxzsdfghjkloiuhbnm,loiuytvbbbbbbbbbbbbbbbbbbbbbbbbbbbbhhhhhhhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjuuuuuu |

  Scenario Outline: Verify the Add button and Add invalid data
    Given Admin is on Markertin tracking page
    When Admin verifies and clicks the add button
    Then admin verifies that he is navigated to add marketing tracking page
    And verifies Campaign name, Campaign Description, Tracking code and Examples text field
    And add "<Cname>", "<Cdesc>" with null value and two hundred fifty seven characters
    And verifies and click on Save icon
    And verifies the Error message

    Examples: 
      | Cname                                                                                                                                                                                                                                                          | Cdesc                                  |
      |                                                                                                                                                                                                                                                                |                                        |
      | Axnjkloiuytghjklpoiuytrewsdfghjklmnbvcxz4567890ioklcfsfdfqwertyuioplkjhgfdsazxcvbnmkjhgfdsaqwertyhg5678904567890-=ojhtgnjkmljhgvftyuhjkloiuytrewsdfghjklmnbvcxzsdfghjkloiuhbnm,loiuytvbbbbbbbbbbbbbbbbbbbbbbbbbbbbhhhhhhhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjuuuuuu | Axnjkloiuytghjklpoiuytrewsdfghjklmnbvc |

  Scenario: Verify Cancel button
    Given Admin is on Markertin tracking page
    When Admin verifies and clicks the add button
    Then admin verifies that he is navigated to add marketing tracking page
    And Verifies and clicks on save button
    And verifies he is navigated to previous Marketing Tracking page

  Scenario Outline: Verify checkbox and Delete icon and dismiss in the alert box
    Given Admin is on Marketing Tracking page
    When Admin verifies the checkbox "<value>" and delete button
    Then he checks the checkbox "<value>"
    And click on delete button
    And admin checks the alert message
    And admin cancel in the alert box

    Examples: 
      | value |
      |    20 |

  Scenario Outline: Verify checkbox and Delete icon and accept in the alert box
    Given Admin is on Marketing Tracking page
    When Admin verifies the checkbox "<value>" and delete button
    Then he checks the checkbox "<value>"
    And click on delete button
    And admin checks the alert message
    And admin accept the message in the alert box
    And Validate the modification message

    Examples: 
      | value |
      |    20 |

  Scenario Outline: Verify Edit icon
    Given Admin is on Marketing Tracking page
    When Admin verifies and click on edit icon
    Then admin verifies that he is navigated to edit marketing tracking page
    And verifies Campaign name, Campaign Description, Tracking code and Examples text field
    And edit "<cname>"
    And verifies and click on Save icon
    And verifeis the successful modification message

    Examples: 
      | cname  |
      | abcdef |
