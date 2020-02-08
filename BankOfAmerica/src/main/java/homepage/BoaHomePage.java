package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import reporting.TestLogger;

public class BoaHomePage extends CommonAPI{

    @FindBy(how = How.ID, using = "NAV_PERSONAL")
    public static WebElement personalWebElement;

    @FindBy(how = How.CSS, using = "#NAV_BUSINESS_ADVANTAGE")
    public static WebElement smallBusinessWebElement;

    @FindBy(how = How.CSS, using = "#NAV_WEALTH_MANAGEMENT")
    public static WebElement wealthManagemetWebElement;

    @FindBy(how = How.CSS, using = "#NAV_BUSINESS_INSTITUTIONS")
    public static WebElement businessInstitutionWebElement;

    @FindBy(how = How.ID, using = "NAV_SECURITY")
    public static WebElement securityWebElement;

    @FindBy(how = How.LINK_TEXT, using = "About Us")
    public static WebElement aboutUsWebElement;

    @FindBy(how = How.CSS, using = "#NAV_EN_ES")
    public static WebElement enEspanolWebElement;

    @FindBy(how = How.CSS, using = "#NAV_CONTACT_US")
    public static WebElement contactUsWebElement;

    @FindBy(how = How.CSS, using = "#NAV_HELP")
    public static WebElement helpnWebElement;

    @FindBy(how = How.XPATH, using = "//input[@id='nav-search-query' and @class='search-query']")
    public static WebElement helpSearchBarWebElement;

    @FindBy(how = How.CSS, using = ".submit")
    public static WebElement helpSearchButtonWebElement;

    @FindBy(how = How.XPATH, using = "//a[@class='track-me' and @name='Search Module - Top Result - See More Search Results']")
    public static WebElement viewAllSearchWebElement;

    @FindBy(how = How.CSS, using = ".search-form")
    public static WebElement popUpHelpSuggestionsWebElement;

    @FindBy(how = How.CSS, using = ".feedback > a:nth-child(1)")
    public static WebElement feedbackWebElement;


    @FindBy(how = How.LINK_TEXT, using ="Locations")
    public static WebElement locationFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Contact Us")
    public static WebElement contactUsFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Help")
    public static WebElement helpFooterWebElement;

    @FindBy(how = How.XPATH, using ="//*[@id=footer_bofa_careers]")
    public static WebElement accessibleBankingFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_careers")
    public static WebElement carrearsFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_privacy_and_security")
    public static WebElement privacySecurityFooterWebElement;

    @FindBy(how = How.CSS, using ="#footer_bofa_mcafee_internet_security")
    public static WebElement mcafeeFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_sitemap")
    public static WebElement sitemapFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Advertising Practices")
    public static WebElement advertisingPracticeFooterWebElement;

    @FindBy(how = How.XPATH, using ="//a[@id='footer_bofa_feedback']")
    public static WebElement feedbackFooterWebElement;

    @FindBy(how = How.CSS, using ="#footer_bofa_view_full_online_banking_site")
    public static WebElement onlineBankingLinkrWebElement;


    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div[1]/div/section[5]/div/div/div/footer/div[2]/div/div/div/div[2]/div/div/div/div[1]/a[1]/svg")
    public static WebElement followFacebookWebElement;

    @FindBy(how = How.ID, using ="social_follow_instagram_link")
    public static WebElement followInstagramWebElement;

    @FindBy(how = How.ID, using ="social_follow_linkedin_link")
    public static WebElement followLinkedinWebElement;

    @FindBy(how = How.ID, using ="social_follow_pinterest_link")
    public static WebElement followPinterestWebElement;

    @FindBy(how = How.XPATH, using ="//a[@id=social_follow_twitter_link]")
    public static WebElement followTwitterWebElement;

    @FindBy(how = How.ID, using ="social_follow_youtube_link")
    public static WebElement followYoutubeWebElement;

    @FindBy(how = How.CSS, using =".equalhousing-container")
    public static WebElement equalHousingWebElement;

    public void helpSearchBarClick(){
        helpSearchBarWebElement.click();
    }

    @Parameters({"smallBusinessUrl"})
    public void smallBusinessPageTitle (String smallBusinessUrl){
        driver.navigate().to(smallBusinessUrl);
        String smallBusinessPageTitle = driver.getTitle();
        navigateBack();
        smallBusinessWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, smallBusinessPageTitle);
    }

    @Parameters({"wealthManagementUrl"})
    public void wealthManagementPageTitle (String wealthManagementUrl){
        driver.navigate().to(wealthManagementUrl);
        String wealthManagementPageTitle = driver.getTitle();
        navigateBack();
        wealthManagemetWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, wealthManagementPageTitle);
    }
    @Parameters({"businessInstitutionUrl"})
    public void businessNInstitutionPageTitle (String businessInstitutionUrl){
        driver.navigate().to(businessInstitutionUrl);
        String businessInstitutionPageTitle = driver.getTitle();
        navigateBack();
        businessInstitutionWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, businessInstitutionPageTitle);
    }

    @Parameters({"securityUrl"})
    public void securityPageTitle (String securityUrl){
        driver.navigate().to(securityUrl);
        String securityPageTitle = driver.getTitle();
        navigateBack();
        securityWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, securityPageTitle);
    }
    @Parameters({"aboutUsUrl"})
    public void aboutUsPageTitle (String aboutUsUrl){
        driver.navigate().to(aboutUsUrl);
        String aboutUsPageTitle = driver.getTitle();
        navigateBack();
        aboutUsWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, aboutUsPageTitle);
    }
    @Parameters({"enEspanolUrl"})
    public void EnEspañolPageTitle (String enEspanolUrl){
        driver.navigate().to(enEspanolUrl);
        String EnEspañolPageTitle = driver.getTitle();
        navigateBack();
        enEspanolWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, EnEspañolPageTitle);
    }
    @Parameters({"contactUsUrl"})
    public void contactUsPageTitle (String contactUsUrl){
        driver.navigate().to(contactUsUrl);
        String contactUsPageTitle = driver.getTitle();
        navigateBack();
        contactUsWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, contactUsPageTitle);
    }
    public void helpTabPopUp() throws InterruptedException {
        helpnWebElement.click();
        WebDriverWait wait = new WebDriverWait(driver, 6);
        Thread.sleep(6000);
        isPopUpWindowDisplayed(driver, "#stateModalContent > h3:nth-child(1)");
    }
    public void checkingClick(){
        helpnWebElement.click();
    }

    @Parameters({"locationsUrl"})
    public void locationPageTitle(String locationsUrl) {
        driver.navigate().to(locationsUrl);
        String locationsPageTitle=driver.getTitle();
        navigateBack();
        locationFooterWebElement.click();
        String currentPageTitle=driver.getTitle();
        Assert.assertEquals(currentPageTitle, locationsPageTitle);
    }

    @Parameters({"contactUsUrl"})
    public void contactUsFooterPageTitle(String contactUsUrl) {
        driver.navigate().to(contactUsUrl);
        String contactUsFooterPageTitle=driver.getTitle();
        navigateBack();
        contactUsFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), contactUsFooterPageTitle);
    }

    @Parameters({"helpUrl"})
    public void helpFooterPageTitle(String helpUrl) {
        driver.navigate().to(helpUrl);
        String actualPageTitle=driver.getTitle();
        navigateBack();
        helpFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), actualPageTitle);
    }

    @Parameters({"accessibleBankingUrl"})
    public void accessibleBankingFooterPageTitle(String accessibleBankingUrl) throws InterruptedException {
        driver.navigate().to(accessibleBankingUrl);
        String actualPageTitle=driver.getTitle();
        navigateBack();
        sleepFor(3);
        accessibleBankingFooterWebElement.click();
        waitUntilVisible(By.xpath("//*[@id=footer_bofa_careers]"));
        Assert.assertEquals(driver.getTitle(), actualPageTitle);
    }
    public void followFbClick (){
        followFacebookWebElement.click();
    }
    public void followInstagramClick (){
        followInstagramWebElement.click();
    }
    public void followLinkedInClick(){
        followLinkedinWebElement.click();
    }
    public void followPinterestClick (){
        followPinterestWebElement.click();
    }
    public void followTwitterClick (){
        followTwitterWebElement.click();
    }
    public void followYouTubeClick (){
        followYoutubeWebElement.click();
    }

    public void feedBackFooterClick (){
        feedbackFooterWebElement.click();
    }



    public void searchBarPopUp() throws InterruptedException {
        helpSearchBarWebElement.click();
       // Thread.sleep(5000);
        boolean result=isPopUpWindowDisplayed(driver, ".search-container");
        Assert.assertEquals(result, true);
    }
    @Parameters({"searchBarValue"})
    public void searchBarSuggestionWindow(String searchBarValue){
        typeOnElement("#nav-search-query", searchBarValue);
        clickOnElement(".submit");
        isPopUpWindowDisplayed(driver, ".search-container");
    }
    @Parameters({"searchBarValue2"})
    public void searchBarResultCheck(String searchBarValue2) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue2);
        sleepFor(3);
        waitUntilVisible(By.className("results-heading"));
        clickByXpath("//a[@name='Search Module - Search Results - Result 2']");
        System.out.println(searchBarValue2);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(searchBarValue2.toLowerCase()));
    }
    @Parameters({"searchBarValue", "searchPageUrl"})
    public void viewAllSearchPageFromSearchPopUp(String searchBarValue, String searchPageUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue);
        waitUntilVisible(By.className("results-heading"));
        viewAllSearchWebElement.click();
        Assert.assertEquals(getCurrentPageUrl(), searchPageUrl);
    }
    @Parameters({"searchBarValue2", "feedbackPageUrl"})
    public void feedbackWebElementBringsNewWindow(String searchBarValue2, String feedbackPageUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue2);
        waitUntilVisible(By.className("results-heading"));
        BoaHomePage.feedbackWebElement.click();
        handleNewTab(driver);
        Assert.assertEquals(driver.getCurrentUrl(), feedbackPageUrl);
    }

    public void enEspanolClick(){
        enEspanolWebElement.click();
    }
    public void helpClick(){
        helpnWebElement.click();
    }
    public void businessInstitutionClick(){
        businessInstitutionWebElement.click();
    }
    public void smallBusinessClick(){
        smallBusinessWebElement.click();
    }
    public void securityClick(){
        securityWebElement.click();
    }
    public void contactUsClick(){
        contactUsWebElement.click();
    }
    public void wealthManagementClick(){
        wealthManagemetWebElement.click();
    }
}
