import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.util.logging.Log as Log
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/1.LoginUsingVariables'), [('url') : url, ('username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)
WebUI.navigateToUrl(custUrl)
WebUI.click(findTestObject('FieldVisibility/div_Field Visibility'))

if (visible == 'true') {
    WebUI.verifyElementVisible(findTestObject('FieldVisibility/deliveryEmail'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('FieldVisibility/deliverySMS'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementNotVisible(findTestObject('FieldVisibility/deliveryEmail'))

    WebUI.verifyElementNotVisible(findTestObject('FieldVisibility/deliverySMS'))
}

WebUI.closeBrowser()

