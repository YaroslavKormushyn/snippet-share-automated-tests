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

WebUI.openBrowser(GlobalVariable.clientUrl)

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/csharp'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'csharp')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/css'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'css')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/html'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'html')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/java'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'java')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/javascript'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'javascript')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/json'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'json')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/markdown'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'markdown')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/mysql'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'mysql')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/plain_text'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'plain_text')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/python'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'python')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/ruby'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'ruby')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/sass'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'sass')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/sass'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'sass')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/typescript'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'typescript')

WebUI.click(findTestObject('Page_Snippet Share/Language'))

WebUI.click(findTestObject('Page_Snippet Share/Languages/xml'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Language'), 'xml')

WebUI.closeBrowser()

