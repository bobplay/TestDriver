
import org.apache.http.auth.BasicUserPrincipal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObject {
	@FindBy(id="kw")
	private WebElement search;  
	@FindBy(id="su")
    private WebElement su;  
 
	public void searchBaidu(String text) {  
		search.sendKeys("kw");
		search.click();
    }  
}
