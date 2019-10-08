package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.json.simple.JSONObject;

public class AddProductCart {
    private static String API_URL_Add= "https://api.demoblaze.com/addtocart";
    private static String API_URL_View= "https://api.demoblaze.com/viewcart";

    @Given("^Product Addition to cart$")
    public void productAdditionToCart() {
    }

    @And("^Add the product to cart \"([^\"]*)\"$")
    public void addTheProductToCart(String arg0) throws Throwable {
        JSONObject ProdAdd= new JSONObject();
        ProdAdd.put("id","049fdb12-346-0eb0-1ee3-1cb0d691181c");
        ProdAdd.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        ProdAdd.put("prod_id",7);
        ProdAdd.put("flag",false);

        int Expected_StatusCode= 200;

        BDDStyled.Addtocart(ProdAdd,API_URL_Add,Expected_StatusCode);
        BDDStyled.ViewCart(ProdAdd,API_URL_View,Expected_StatusCode,1);

    }

    @Then("^find the product in cart$")
    public void findTheProductInCart() {
    }

    @Given("^Different Product Addition to cart$")
    public void differentProductAdditionToCart() {
    }

    @And("^Add the different product to cart \"([^\"]*)\"$")
    public void addTheDifferentProductToCart(String arg0) throws Throwable {
        JSONObject ProdAdd= new JSONObject();
        ProdAdd.put("id","049fdb13-346-0ec0-1ef3-1cb0d691181c");
        ProdAdd.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        ProdAdd.put("prod_id",2);
        ProdAdd.put("flag",false);

        int Expected_StatusCode= 200;

        BDDStyled.Addtocart(ProdAdd,API_URL_Add,Expected_StatusCode);
        BDDStyled.ViewCart(ProdAdd,API_URL_View,Expected_StatusCode,2);
    }

    @Given("^Product with different id Addition to cart$")
    public void productWithDifferentIdAdditionToCart() {
    }

    @And("^Add the product with different id to cart \"([^\"]*)\"$")
    public void addTheProductWithDifferentIdToCart(String arg0) throws Throwable {
        JSONObject ProdAdd= new JSONObject();
        ProdAdd.put("id","049fdb13-346-0ed0-1ef3-1db0d691181d");
        ProdAdd.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        ProdAdd.put("prod_id",2);
        ProdAdd.put("flag",false);

        int Expected_StatusCode= 200;

        BDDStyled.Addtocart(ProdAdd,API_URL_Add,Expected_StatusCode);
        BDDStyled.ViewCart(ProdAdd,API_URL_View,Expected_StatusCode,3);
    }

    @Given("^Product with Same id Addition to cart$")
    public void productWithSameIdAdditionToCart() {
    }

    @And("^Add the product with same id is not added to cart \"([^\"]*)\"$")
    public void addTheProductWithSameIdIsNotAddedToCart(String arg0) throws Throwable {
        JSONObject ProdAdd= new JSONObject();
        ProdAdd.put("id","049fdb13-346-0ed0-1ef3-1db0d691181d");
        ProdAdd.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        ProdAdd.put("prod_id",2);
        ProdAdd.put("flag",false);

        int Expected_StatusCode= 200;

        BDDStyled.Addtocart(ProdAdd,API_URL_Add,Expected_StatusCode);
        BDDStyled.ViewCart(ProdAdd,API_URL_View,Expected_StatusCode,3);
    }

    @Then("^find no new entry in the cart$")
    public void findNoNewEntryInTheCart() {
    }

    @Given("^Product with no flag info in body$")
    public void productWithNoFlagInfoInBody() {
    }

    @Then("^API request is a failure with Bad Parameter Request,incorrect flag$")
    public void apiRequestIsAFailureWithBadParameterRequestIncorrectFlag() {
        JSONObject ProdAdd= new JSONObject();
        ProdAdd.put("id","049fdb13-346-0ed0-1ef3-1db0d691181d");
        ProdAdd.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        ProdAdd.put("prod_id",2);

        int Expected_StatusCode= 200;
        int View_StatusCode= 200;


        BDDStyled.Addtocart(ProdAdd,API_URL_Add,Expected_StatusCode);
        BDDStyled.ViewCart(ProdAdd,API_URL_View,View_StatusCode,3);
    }

    @Given("^Product with one or more information values is Null in body$")
    public void productWithOneOrMoreInformationValuesIsNullInBody() {
    }

    @Then("^API request is a failure with Internal Error$")
    public void apiRequestIsAFailureWithInternalError() {
        JSONObject ProdAdd= new JSONObject();
        ProdAdd.put("id","");
        ProdAdd.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        ProdAdd.put("prod_id","");
        ProdAdd.put("flag",false);

        int Expected_StatusCode= 500;
        int View_StatusCode= 200;


        BDDStyled.Addtocart(ProdAdd,API_URL_Add,Expected_StatusCode);
        BDDStyled.ViewCart(ProdAdd,API_URL_View,View_StatusCode,3);
    }
}
