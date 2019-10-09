Feature:
  Verify adding product to Cart operations using REST-assured

  Scenario: Verify Product Addition to Cart Successfully
    Given Product Addition to cart
    When Add the product to cart "addtocart"
    Then find the product in cart

  Scenario: Verify Different Product Addition to Cart Successfully
    Given Different Product Addition to cart
    When Add the different product to cart "addtocart"
    Then find the product in cart


  Scenario: Verify Same Product Addition to Cart Successfully
    Given Product with different id Addition to cart
    When Add the product with different id to cart "addtocart"
    Then find the product in cart


  Scenario: Verify Same Product not added to cart
    Given Product with Same id Addition to cart
    When Add the product with same id is not added to cart "addtocart"
    Then find no new entry in the cart

  Scenario: Verify Product Addition to cart fails if no Flag details passed in Body
    Given Product with no flag info in body
    Then API request is a failure with Bad Parameter Request,incorrect flag


  Scenario: Verify Product Addition to cart fails if param information holds null value in Body
    Given Product with one or more information values is Null in body
    Then API request is a failure with Internal Error

