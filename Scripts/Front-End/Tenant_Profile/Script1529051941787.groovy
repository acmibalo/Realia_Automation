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

WebUI.callTestCase(findTestCase('Front-End/Global_Login'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/h4_alvin33'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_My Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Street (10)'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Suburb (3)'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Questions (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Answers (0)'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/input_DisplayNameOnPost'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/input_DisplayNameOnPost_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/input_DisplayNameOnPost'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Tenant_Profile/Page_Realia/textarea_Bio'), 'I am awesome!')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/div_First Name'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Social Network'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Tenant_Profile/Page_Realia/input_FacebookLink'), 'facebook.com/alvin33')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Tenant_Profile/Page_Realia/input_TwitterLink'), '@alvin33realia')

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/div_My Activity            Pro'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Followers (0)'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Settings'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Password'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Notification'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Privacy'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Invite Friends'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Facebook'))

WebUI.delay(5)

WebUI.closeWindowTitle('Facebook')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Twitter'))

WebUI.delay(5)

WebUI.closeWindowTitle('Share a link on Twitter')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/h4_alvin33'))

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Tenant_Profile/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.closeBrowser()

