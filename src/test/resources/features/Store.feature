Feature: Buy products in store
  As a Guest customer
  I wanna enter in the website http://opencart.abstracta.us/
  To purchase two items

  @AddItemsToCart
  Scenario Outline: Add items to my cart
    Given the customer is in the home page
    When the customer adds <product1> to the cart
    And the customer puts <product2> to the cart
    Then the customer could see the shopping cart
    When  the customer checkout the cart as a Guest
    And the customer completes the formulary with these data <name>, <lastname>, <email>, <phone>, <address>, <city>, <code>, <text>, in the form
    Then the customer finish to purchase the order

  Examples:
    | product1   | product2       | name      | lastname | email              | phone      | address      | city  | code  | text   |
    | Mac        | Iphone         | Guillermo | Azar     | guillermo@azar.com | 9876543211 | valle        | quito | 15746 | prueba |
    | Nikon D300 | Samsung Galaxy | Elizabeth | Betz     | elizabeth@betz.com | 9877562291 | bicentenario | quito | 13776 | compra |
