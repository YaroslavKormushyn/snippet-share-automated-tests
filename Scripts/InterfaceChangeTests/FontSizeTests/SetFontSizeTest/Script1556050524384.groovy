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

WebUI.openBrowser('snippet-sharing.firebaseapp.com')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/20FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '20')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/14FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '14')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/16FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '16')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/18ontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '18')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/24FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '24')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/28FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '28')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/32FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '32')

WebUI.click(findTestObject('Page_Snippet Share/FontSize'))

WebUI.click(findTestObject('Page_Snippet Share/Fonts/40FontSize'))

WebUI.verifyElementText(findTestObject('Page_Snippet Share/FontSize'), '40')

WebUI.closeBrowser()

