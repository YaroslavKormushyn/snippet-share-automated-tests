<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create snippet</name>
   <tag></tag>
   <elementGuidId>5f1886b0-03f8-4b73-bf87-937daad5d314</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{ \n  \&quot;author\&quot;: \&quot;Author\&quot;, \n  \&quot;title\&quot;: \&quot;Title\&quot;, \n  \&quot;data\&quot;: \&quot;Sample text\&quot;, \n  \&quot;type\&quot;: \&quot;plain_text\&quot; \n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://us-central1-snippet-sharing.cloudfunctions.net/createSnippet</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assert response.contentType == &quot;application/json; charset=utf-8&quot;

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())

boolean privateKeyPresent = jsonResponse.keySet().contains(&quot;privateUid&quot;)
boolean publicKeyPresent = jsonResponse.keySet().contains(&quot;publicUid&quot;)
if(!privateKeyPresent) 
{
	KeywordUtil.markFailed(&quot;Private key is not present&quot;)
}
if(!publicKeyPresent) {
	KeywordUtil.markFailed(&quot;Public key is not present&quot;)
}</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
