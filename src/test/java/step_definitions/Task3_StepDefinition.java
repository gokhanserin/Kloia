package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.FooterPage;
import utilities.Driver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3_StepDefinition {

    FooterPage footerPage = new FooterPage();

    @When("user write all the links at the footer to the text file")
    public void user_write_all_the_links_at_the_footer_to_the_text_file() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",footerPage.markaKoruma);

        List<String> links = new ArrayList<>();

        List<WebElement> footerElements = footerPage.footer.findElements(By.tagName("a"));
        for (WebElement footerElement : footerElements) {
            String href = footerElement.getAttribute("href");
            links.add(href);
        }
        System.out.println("links = " + links);

        BufferedWriter bw = new BufferedWriter(new FileWriter("footerlinks.txt"));
        for (String each : links) {
            bw.write(each + System.lineSeparator());
        }
        bw.close();
    }
    @When("user clicks on Brands \\(Markalar) at the footer")
    public void user_clicks_on_brands_markalar_at_the_footer() {
        footerPage.brands.click();
    }
    @Then("verify the footer links with the text file")
    public void verify_the_footer_links_with_the_text_file() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("footerlinks.txt"));
        ArrayList<String> textList = new ArrayList<>();
        String eachLine = br.readLine();
        while (eachLine!=null){
            textList.add(eachLine);
            eachLine= br.readLine();
        }
        br.close();
        System.out.println("textList = " + textList);

    }

}
