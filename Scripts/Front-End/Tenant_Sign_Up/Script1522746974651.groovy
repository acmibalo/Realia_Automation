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

WebUI.navigateToUrl('http://realia-uat.azurewebsites.net/Account/Register')

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Page_Realia (1)/select_I am a TenantI am an Ag'), '0', true)

WebUI.delay(10)

WebUI.setText(findTestObject('Front-end/Page_Realia/input_Email'), tenant_email)

WebUI.setText(findTestObject('Front-end/Page_Realia/input_FirstName'), tenant_firstname)

WebUI.setText(findTestObject('Front-end/Page_Realia/input_LastName'), 'UAT')

WebUI.setText(findTestObject('Front-end/Page_Realia/input_DisplayName'), tenant_firstname)

WebUI.setText(findTestObject('Front-end/Page_Realia/input_PostCode'), '9407')

WebUI.setText(findTestObject('Front-end/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.setText(findTestObject('Front-end/Page_Realia/input_ConfirmPassword'), 'P@ssw0rd')

WebUI.setText(findTestObject('Front-end/Page_Realia/input_CaptchaInputText'), capcha)

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Page_Realia/input_check_agree_termofservic'))

WebUI.click(findTestObject('Front-end/Page_Realia/input_btn btn-primary'))

WebUI.navigateToUrl('http://www.mailinator.com/')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Mailinator/input_inboxfield'), tenant_email)

WebUI.click(findTestObject('Page_Mailinator/button_Go'))

WebUI.click(findTestObject('Page_Mailinator (1)/div_Confirm Your Account'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Mailinator (1)/a_Click Here'))

WebUI.delay(10)

WebUI.switchToWindowTitle('Realia')

WebUI.click(findTestObject('Page_Realia/a_Click here to Log in'))

WebUI.setText(findTestObject('Front-end/Page_Realia/input_EmailOrUserName'), tenant_email)

WebUI.setText(findTestObject('Front-end/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Front-end/Page_Realia/input_btn btn-primary'))

