Feature: Product Categories

  Scenario: Successful In Making Categories
    Given the system is ready
    When the admin role creates a new category called "Interior"
    Then the categories "Interior" should exist in the system



    Scenario: Failure In Making Categories
    Given that system is under construction and not working
    When the admin role creates a new category called "Interior"
    Then the categories "Interior"   should not be  exist in the system



    Scenario: Success With Inputs
      When the admin role fill the details of products
      And he fill in 'Detailed product descriptions' with 'Your in-car assistant for a smarter drive.'
      And he fills in the 'images' field with a valid image extension such as '.jpg'
      And he fill in 'prices' with '20'
      And he fill in 'availability' with '35'
      Then the product information should be saved successfully




    Scenario Outline: Errors with input
    When the admin role fill the details of products
    And he fill in 'Detailed product descriptions' with '<Detailed product descriptions>'
    And he fill in 'images' with '<images>'
    And he fill in 'prices' with '<prices>'
    And he fill in 'availability' with '<availability>'
    Then admin role should see a message '<message>'

    Examples:
    Examples:
      | Detailed product descriptions | images | prices    | availability | message                                   |
      | 2                                | png    | 20     | 5            | Description should start with  string     |
      | Your in-car assistant for a smarter drive                 | exe    | 20     | 5            | The extension of images should be png     |
      | Your in-car assistant for a smarter drive.                | png    | -2     | 5            | prices must be over zero                  |
      | Your in-car assistant for a smarter drive.               | png    | 0      | 5            | prices must be over zero                  |
      | Your in-car assistant for a smarter drive.                 | png    | 60     | -3           | Availability should be from zero and over |



     Scenario: Product Search Successfully
      Given the user is on the product listing page
      When the user enter a 'character' with 'P'
      And  he click on "Search" button
      Then Display search results exclusively for items that begin with 'P'


    Scenario: Product Search Failed
    Given the user is on the product listing page
    When the user enter a 'character' with 'P'
    And   he click on "Search" button
    Then  the user cannot see the results of items that starts with 'P' and  the user should see a message indicating no products match his search


    Scenario: Successful Product Filtering
    Given the user is on the product listing page
    When the user applies a filter for "Electronics" category
    And selects a filter for "Price: Low to High"
    Then the displayed products should belong to the "Electronics" category and the products should be sorted by price from low to high price from low to high

    Scenario: Failed Product Filtering
    Given the user is on the product listing page
    When the user applies a filter for a non-existent category, such as "Nonexistent Category"
    Then the user should see a message indicating no products match the selected filter
