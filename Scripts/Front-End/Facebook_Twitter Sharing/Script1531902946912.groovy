import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.delay(7)

WebUI.navigateToUrl('https://realia-uat.azurewebsites.net/')

WebUI.delay(7)

WebUI.click(findTestObject('Front-end/Facebook_twitter Sharing/a_Log in'))

WebUI.delay(7)

WebUI.setText(findTestObject('Front-end/Facebook_twitter Sharing/input_EmailOrUserName'), username)

WebUI.delay(7)

WebUI.setText(findTestObject('Front-end/Facebook_twitter Sharing/input_Password'), password)

WebUI.delay(7)

WebUI.click(findTestObject('Front-end/Facebook_twitter Sharing/input_btn btn-primary'))

WebUI.delay(7)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(7)

WebUI.click(findTestObject('Front-end/Facebook_twitter Sharing/i_fa fa-facebook'))

WebUI.delay(7)

WebUI.closeWindowTitle('Error')

WebUI.delay(7)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(7)

WebUI.click(findTestObject('Front-end/Facebook_twitter Sharing/i_fa fa-twitter'))

WebUI.delay(7)

WebUI.switchToWindowTitle('Share a link on Twitter')

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Front-end/Facebook_twitter Sharing/input_button selected submit'), 0)

WebUI.delay(7)

WebUI.closeWindowTitle('Share a link on Twitter')

WebUI.delay(7)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(7)

WebUI.click(findTestObject('Front-end/Facebook_twitter Sharing/h4_alvin41'))

WebUI.delay(7)

WebUI.click(findTestObject('Front-end/Facebook_twitter Sharing/a_Log off'))

WebUI.delay(7)

WebUI.closeBrowser()

