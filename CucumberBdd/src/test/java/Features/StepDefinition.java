package Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("^User visit the website as guest user$")
	public void user_visit_the_website_as_guest_user() {

		System.out.println("User visit the website as guest user");

	}

	@When("^User select books option from the drowpdwon$")
	public void user_select_books_option_from_the_drowpdwon() {

		System.out.println("User select books option from the drowpdwon");
	}

	@When("^User select baby option from the drowpdwon$")
	public void user_select_baby_option_from_the_drowpdwon() {

		System.out.println("User select baby option from the drowpdwon");

	}

	@Then("^User should see the page having haeading as Amaxon Best Reading is displayed$")
	public void user_should_see_the_page_having_haeading_as_amaxon_best_reading_is_displayed() {
		System.out.println("User should see the page having haeading as Amaxon Best Reading is displaye");
	}

	@Then("^User should see the page having haeading as Offer on Baby's Products is displayed$")
	public void user_should_see_the_page_having_haeading_as_offer_on_babys_products_is_displayed() {
		System.out.println("User should see the page having haeading as Offer on Baby's Products is displayed");
	}

	@And("^User click on search icon option$")
	public void user_click_on_search_icon_option() {
		System.out.println("User click on search icon option");
	}

	@But("^USer should not see the other category prodcuts$")
	public void user_should_not_see_the_other_category_prodcuts() {

		System.out.println("USer should not see the other category prodcuts");
	}

}
