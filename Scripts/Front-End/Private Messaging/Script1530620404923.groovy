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

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), 'realia_alvin36@mailinator.com')

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/input_btn btn-primary'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Manager09'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Follow 0'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Alvin36'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_glyphicon glyphicon-envel'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Compose'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_select2-selection select2'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_select2-search__field'), 'Manager09')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/button_'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Alvin36'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), 'realia_mngr09@company.com')

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/input_btn btn-primary'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_glyphicon glyphicon-envel'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Compose'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_select2-selection select2'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_select2-search__field'), 'al')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/li_Alvin36'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/textarea_Content'), 'Hi How you Alvin 36?')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/button_Send'))

WebUI.rightClick(findTestObject('Front-end/Private Messaging/Page_Realia/p_Hi How you Alvin 36'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/p_Hi How you Alvin 36'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Manager09_1'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), 'realia_alvin36@mailinator.com')

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/input_btn btn-primary'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_1'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/div_33s ago'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Send Message'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Report'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/textarea_Description'), 'Not good Email message! Rude!')

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/button_Send Report'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Alvin36'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log in'))

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_EmailOrUserName'), 'realia_mngr09@company.com')

WebUI.setText(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.sendKeys(findTestObject('Front-end/Private Messaging/Page_Realia/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/span_1'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/div_Just Now'))

WebUI.rightClick(findTestObject('Front-end/Private Messaging/Page_Realia/p_Im good How about you'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/p_Im good How about you'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/h4_Manager09_1'))

WebUI.click(findTestObject('Front-end/Private Messaging/Page_Realia/a_Log off'))

WebUI.closeBrowser()

