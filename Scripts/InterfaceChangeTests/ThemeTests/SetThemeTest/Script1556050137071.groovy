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

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/kuroirTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'kuroir')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/githubTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'github')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/monokaiTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'monokai')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/solarized_darkTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'solarized_dark')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/solarized_lightTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'solarized_light')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/terminalTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'terminal')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/textmateTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'textmate')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/tomorrowTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'tomorrow')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/twilightTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'twilight')

WebUI.click(findTestObject('Page_Snippet Share/Theme'))

WebUI.click(findTestObject('Page_Snippet Share/Themes/xcodeTheme'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/Theme'), 'xcode')

WebUI.closeBrowser()

