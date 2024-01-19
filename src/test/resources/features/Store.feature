Feature: Buy products in store
  As a Guest customer
  I wanna enter in the website http://opencart.abstracta.us/
  To purchase two items

  @AddItemsToCart
  Scenario Outline: Add items to my cart
    Given the customer is in the home page
    When the customer adds the firts item to the cart
      | <type> | <product> |
    And the customer adds the second item to the cart
      | <type> | <product> |
    Then the customer could the shopping cart
    When  the customer checkout the cart as a Guest
    And the customer completes the formulary with the following information
      | <firstName> | <LastName> | <Email> | <Phone> | <Address> | <City> | <PostCode> | <Country> | <Region> | <Observation> |
    Then the customer finish to purchase the order

    Examples:
      | type   | product | firstName | LastName | Email              | Phone      | Address | City  | PostCode | Country | Region    | Observation |
      | LAPTOP | Iphone  | Guillermo | Azar     | guillermo@azar.com | 9876543211 | valle   | quito | 15746    | ecuador | pichincha | prueba      |
      | PHONE  | Mac     | Guillermo | Azar     | guillermo@azar.com | 9876543211 | valle   | quito | 15746    | ecuador | pichincha | prueba           |
