Feature: Buy products in store
  As a Guest customer
  I wanna enter in the website http://opencart.abstracta.us/
  To purchase two items

  @AddItemsToCart
  Scenario: Add items to my cart
    Given the customer is in the home page
    When the customer adds Mac to the cart
    And the customer puts Iphone to the cart
    Then the customer could see the shopping cart
    When  the customer checkout the cart as a Guest
    And the customer completes the formulary with these data Guillermo, Azar, guillermo@azar.com, 9876543211, valle, quito, 15746, prueba, in the form
    Then the customer finish to purchase the order