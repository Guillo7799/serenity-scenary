Feature: Buy products in store
  As a Guest customer
  I wanna enter in the website http://opencart.abstracta.us/
  To purchase two items

  @AddItemsToCart
  Scenario Outline: Add items to my cart
    Given the customer is in the home page
    When the customer adds Mac to the cart
    And the customer puts Iphone to the cart
    Then the customer could the shopping cart
    When  the customer checkout the cart as a Guest
    And the customer completes the formulary with the following information
      | <firstName> | <LastName> | <Email> | <Phone> | <Address> | <City> | <PostCode> | <Country> | <Region> | <Observation> |
    Then the customer finish to purchase the order

    Examples:
      | type   | product | firstName | LastName | Email              | Phone      | Address | City  | PostCode | Country | Region    | Observation |
      | LAPTOP | Iphone  | Guillermo | Azar     | guillermo@azar.com | 9876543211 | valle   | quito | 15746    | ecuador | pichincha | prueba      |
