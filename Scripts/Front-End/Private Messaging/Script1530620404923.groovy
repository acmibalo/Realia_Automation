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

WebUI.navigateToUrl('http://realia-uat.azurewebsites.net/')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), GlobalVariable.Tenant_Username)

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), GlobalVariable.Tenant_Password)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Manager09'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Follow 0'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Alvin36'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_glyphicon glyphicon-envel'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Alvin36'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), GlobalVariable.Manager_username)

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), GlobalVariable.Manager_Password)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_glyphicon glyphicon-envel'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Compose'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_select2-selection select2'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_select2-search__field'), 'al')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/li_Alvin36'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/textarea_Content'), 'Hi How you Alvin 36?')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/button_Send'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Front-end/Private Messaging/Page_Realia/p_Hi How you Alvin 36'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/p_Hi How you Alvin 36'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Manager09_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), GlobalVariable.Tenant_Username)

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), GlobalVariable.Tenant_Password)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/div_33s ago'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Send Message'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Report'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/textarea_Description'), 'Not good Email message! Rude!')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/button_Send Report'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Alvin36'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), GlobalVariable.Manager_username)

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), GlobalVariable.Manager_Password)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/div_Just Now'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Front-end/Private Messaging/Page_Realia/p_Im good How about you'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/p_Im good How about you'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Manager09_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.closeBrowser()

