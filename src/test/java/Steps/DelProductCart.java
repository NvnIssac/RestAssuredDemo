package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.json.simple.JSONObject;

import java.awt.color.ProfileDataException;

public class DelProductCart {
    private static String API_URL_Delete= "https://api.demoblaze.com/deleteitem";
    private static String API_URL_View= "https://api.demoblaze.com/viewcart";

    @Given("^Product to be deleted from cart$")
    public void productToBeDeletedFromCart() {

    }

    @And("^Delete the product from cart \"([^\"]*)\"$")
    public void deleteTheProductFromCart(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        JSONObject ProdDel= new JSONObject();
        ProdDel.put("id","049fdb12-346-0eb0-1ee3-1cb0d691181c");

        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");

        int ExpectedStatus= 200;

        BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
        BDDStyled.ViewCart(ProdView,API_URL_View,ExpectedStatus,2);
    }

    @Then("^Validate Product is removed from cart$")
    public void validateProductIsRemovedFromCart() {
    }

    @Given("^Product Id to be deleted from Empty cart$")
    public void productIdToBeDeletedFromEmptyCart() {
    }

    @And("^Delete the product from empty cart \"([^\"]*)\"$")
    public void deleteTheProductFromEmptyCart(String arg0) throws Throwable {
        JSONObject ProdDel= new JSONObject();
        ProdDel.put("id","049fdb12-346-0eb0-1ee3-1cb0d691181c");

        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");

        int ExpectedStatus= 200;

        BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
        BDDStyled.ViewCart(ProdView,API_URL_View,ExpectedStatus,0);
    }

    @Then("^Validate message not found displayed in response$")
    public void validateMessageNotFoundDisplayedInResponse() {
    }

    @Given("^Product Id to be deleted from Cart where it does not exist$")
    public void productIdToBeDeletedFromCartWhereItDoesNotExist() {
    }

    @And("^Delete the product non existing from cart \"([^\"]*)\"$")
    public void deleteTheProductNonExistingFromCart(String arg0) throws Throwable {
        JSONObject ProdDel= new JSONObject();
        ProdDel.put("id","049fdb12-346-0eb0-1ee3-1cb0d691181d");

        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");

        int ExpectedStatus= 200;

        BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
        BDDStyled.ViewCart(ProdView,API_URL_View,ExpectedStatus,2);
    }

    @Given("^Product Id to be deleted with no body$")
    public void productIdToBeDeletedWithNoBody() {
    }

    @Then("^Validate Response status code is Bad Request$")
    public void validateResponseStatusCodeIsBadRequest() {
        JSONObject ProdDel= new JSONObject();
        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");
        int ExpectedStatus= 200;

        BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
        BDDStyled.ViewCart(ProdView,API_URL_View,ExpectedStatus,2);
    }

    @Given("^Product Id to be deleted with missing parameter$")
    public void productIdToBeDeletedWithMissingParameter() {
    }

    @Then("^Validate Response body displays Bad parameter missing$")
    public void validateResponseBodyDisplaysBadParameterMissing() {
        JSONObject ProdDel= new JSONObject();
        ProdDel.put("id1","abc-fd-cvd45");
        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");

        int ExpectedStatus= 200;

        BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
        BDDStyled.ViewCart(ProdView,API_URL_View,ExpectedStatus,2);
    }

    @Given("^Product Id to be deleted with id value as NULL$")
    public void productIdToBeDeletedWithIdValueAsNULL() {
    }

    @Then("^Validate response status code is internal server$")
    public void validateResponseStatusCodeIsInternalServer() {
        JSONObject ProdDel= new JSONObject();
        ProdDel.put("id","");
        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");

        int ExpectedStatus= 500;
        int ViewStatus=200;

        BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
        BDDStyled.ViewCart(ProdView,API_URL_View,ViewStatus,2);
    }

    @Given("^Product Id list to be deleted$")
    public void productIdListToBeDeleted() {
    }

    @And("^Delete all products from cart \"([^\"]*)\"$")
    public void deleteAllProductsFromCart(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String Id[]= {"049fdb13-346-0ec0-1ef3-1cb0d691181c","049fdb13-346-0ed0-1ef3-1db0d691181d"};
        JSONObject ProdDel=new JSONObject();

        int Count=0;
        int ExpectedStatus=200;

        JSONObject ProdView= new JSONObject();
        ProdView.put("cookie","user=d8f30016-1344-9521-fe08-ebeda0feeac4");

        for(int i=0;i<Id.length;i++)
        {
            ProdDel.put("id",Id[i]);
            BDDStyled.DeleteCart(ProdDel,API_URL_Delete,ExpectedStatus);
            ProdDel.remove("id");
        }
        BDDStyled.ViewCart(ProdView,API_URL_View,ExpectedStatus,Count);
    }

    @Then("^Validate Cart is Empty$")
    public void validateCartIsEmpty() {
    }
}
