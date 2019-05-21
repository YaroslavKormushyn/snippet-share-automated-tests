import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.openBrowser('snippet-sharing.firebaseapp.com')

WebUI.verifyElementText(findTestObject('Page_Snippet Share/TextArea'), 'Enter text here...')

WebUI.click(findTestObject('Page_Snippet Share/Share'))

WebUI.waitForElementPresent(findTestObject('Page_Snippet Share/EditableLink'), 5)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Page_Snippet Share/EditableLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_Snippet Share/ReadOnlyLink'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Snippet Share/ReadOnlyLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

