Feature:
  Verify Deletion of Product from Cart operations using REST-assured

  Scenario: Verify Product Deletion to Cart Successfully
    Given Product to be deleted from cart
    And Delete the product from cart "deleteitem"
    Then Validate Product is removed from cart

  Scenario: Verify Product Deletion of non existing product from Cart
    Given Product Id to be deleted from Cart where it does not exist
    And Delete the product non existing from cart "deleteitem"
    Then Validate message not found displayed in response


  Scenario: Verify Product Deletion with no body in POST request
    Given Product Id to be deleted with no body
    And Delete the product non existing from cart "deleteitem"
    Then Validate Response status code is Bad Request

  Scenario: Verify Product Deletion with missing parameter value in POST request
    Given Product Id to be deleted with missing parameter
    And Delete the product non existing from cart "deleteitem"
    Then Validate Response body displays Bad parameter missing

  Scenario: Verify Product Deletion with id value having NULL in POST request
    Given Product Id to be deleted with id value as NULL
    And Delete the product non existing from cart "deleteitem"
    Then Validate response status code is internal server

  Scenario: Verify Deletion of All Products in Cart
    Given Product Id list to be deleted
    And Delete all products from cart "deleteitem"
    Then Validate Cart is Empty

  Scenario: Verify Product Deletion from Empty Cart
    Given Product Id to be deleted from Empty cart
    And Delete the product from empty cart "deleteitem"
    Then Validate message not found displayed in response