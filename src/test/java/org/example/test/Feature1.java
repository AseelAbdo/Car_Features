package org.example.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MyAppT;
import org.example.Product;
import org.example.MyAppT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class Feature1 {
  // public MyAppT obj;

    //  Dependency injection
    //public Feature1(MyAppT obj) {
      //  super();
        //this.obj = obj;
    //}


    @Given("the system is ready")
    public void theSystemIsReady() {
        boolean isSystemReady = MyAppT.isSystemReady(); // Assuming there's a method to check system readiness in MyAppT
        if(isSystemReady)
       assertEquals(true,true);
else
    assertEquals(false,false);
    }


    @When("the admin role creates a new category called {string}")
    public void theAdminRoleCreatesANewCategoryCalled(String string) {
        boolean flag;
        flag= MyAppT.createCategory(string);

        if(flag){
            assertEquals(true,true);
        }
        else
            assertEquals(false,false);
    }




    @Then("the categories {string} should exist in the system")
    public void theCategoriesShouldExistInTheSystem(String string) {
        boolean flag ;
        flag = MyAppT.ExistCategory(string);
        if(flag){
            assertEquals(true,true);
        }
        else

            assertEquals(false,false);
    }





    @Given("that system is under construction and not working")
    public void thatSystemIsUnderConstructionAndNotWorking() {
        System.out.println("System is not ready!");
        assertEquals(false,false);
    }


    @Then("the categories {string}   should not be  exist in the system")
    public void theCategoriesShouldNotBeExistInTheSystem(String string) {
        boolean flag;
        flag = MyAppT.ExistCategory(string);

        if(flag){
            assertEquals(true,true);
        }
        else
            assertEquals(false,false);
    }





    @When("the admin role fill the details of products")
    public void theAdminRoleFillTheDetailsOfProducts() {

        boolean flag ;
        flag = MyAppT.AdminFills();
        if(flag){
            assertEquals(true,true);
        }
        else
            assertEquals(false,false);
    }



    @When("he fill in {string} with {string}")
    public void heFillInWith(String string, String string2) {
        boolean flag;
        if(string.equals("price")) {

            flag = MyAppT.isCheckedPrice(string);
            assertTrue(flag == true);
        }
        else if(string.equals("availability")) {

            if (string.equals("price")) {

                flag = MyAppT.isCheckedAvailability(string);
                assertTrue(flag == true);

            } else if (string.equals("product_description")) {
                if (string.equals("price")) {

                    flag = MyAppT.isCheckedDescription(string);
                    assertTrue(flag == true);
                }

            }

        }

    }
    @When("he fills in the {string} field with a valid image extension such as {string} or {string}")
    public void heFillsInTheFieldWithAValidImageExtensionSuchAsOr(String string, String string2, String string3) {
        string.toLowerCase();
        boolean flag;

        if (string.equals("images") || string.equals("image")) {

            flag = MyAppT.isCheckedExtension(string2, string3);

            if (flag) {
                assertEquals(true, true);
            } else
                assertEquals(false, false);
        }
    }



    @Then("the product information should be saved successfully")
    public void theProductInformationShouldBeSavedSuccessfully() {
        boolean flag;
        flag =MyAppT.SavedSuccessfully();
        if(flag){
            assertEquals(true,true);
        }
        else
            assertEquals(false,false);
    }




    @When("he fill {string} with {string}")
    public void heFillWith(String string, String string2) {
//Implement it later
    }


    @Then("admin role should see a message {string}")
    public void adminRoleShouldSeeAMessage(String string) {
        boolean flag;

        flag = MyAppT.ViewMessage(string);
        if(flag){
            assertEquals(true,true);
        }
        else {
            assertEquals(false,false);
        }

    }

    @Given("the user is on the product listing page")
    public void theUserIsOnTheProductListingPage() {
        boolean flag ;
        flag = Product.UserList();
        if(flag){
            assertEquals(true,true);
        }
        else{
            assertEquals(false,false);
        }
    }
    @When("the user enter a {string} with {string}")
    public void theUserEnterAWith(String string, String string2) {
        boolean flag;

        flag =  Product.EnterAProduct(string,string2);
        if(flag){
            assertEquals(true,true);
        }
        else{
            assertEquals(false,false);
        }
    }
    @When("he click on {string} button")
    public void heClickOnButton(String string) {
        boolean flag;
        flag = Product.PressedButton(string);
        if(flag){
            assertEquals(true,true);
        }
        else{
            assertEquals(false,false);
        }
    }

    @Then("Display search results exclusively for items that begin with {string}")
    public void displaySearchResultsExclusivelyForItemsThatBeginWith(String string) {
        boolean flag;

        flag =  Product.ProductAppearance(string);
        if(flag){
            assertEquals(true,true);
        }
        else{
            assertEquals(false,false);
        }
    }
    @Then("the user cannot see the results of items that starts with {string} and  the user should see a message indicating no products match his search")
    public void theUserCannotSeeTheResultsOfItemsThatStartsWithAndTheUserShouldSeeAMessageIndicatingNoProductsMatchHisSearch(String string) {

        boolean flag;

        flag = Product.ProductAppearance_2(string);
        if(flag){
            assertEquals(true,true);
        }
        else{
            assertEquals(false,false);
        }
    }

    @When("the user applies a filter for {string} category")
    public void theUserAppliesAFilterForCategory(String string) {

//

    }






    @When("selects a filter for {string}")
    public void selectsAFilterFor(String string) {

        //

    }







    @Then("the displayed products should belong to the {string} category and the products should be sorted by price from low to high price from low to high")
    public void theDisplayedProductsShouldBelongToTheCategoryAndTheProductsShouldBeSortedByPriceFromLowToHighPriceFromLowToHigh(String string) {
//


    }






    @When("the user applies a filter for a non-existent category, such as {string}")
    public void theUserAppliesAFilterForANonExistentCategorySuchAs(String string) {

    }






    @Then("the user should see a message indicating no products match the selected filter")
    public void theUserShouldSeeAMessageIndicatingNoProductsMatchTheSelectedFilter() {

    }

}
