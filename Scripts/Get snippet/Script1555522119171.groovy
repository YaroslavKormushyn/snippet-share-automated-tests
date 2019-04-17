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
import groovy.json.JsonSlurper

response = WS.sendRequest(findTestObject('Create snippet'))

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())

String privateKey = jsonResponse.get('privateUid')

WS.sendRequest(findTestObject('Get snippet', [('privateId') : privateKey]))

def nonExistentKey = 'nonexistentkey'

WS.sendRequest(findTestObject('Delete snippet', [('privateSnippetId') : nonExistentKey]))

WS.sendRequest(findTestObject('Get non-existent snippet', [('privateId') : nonExistentKey]))

WS.sendRequest(findTestObject('Get snippet with POST request'))

WS.sendRequest(findTestObject('Get snippet without id'))

