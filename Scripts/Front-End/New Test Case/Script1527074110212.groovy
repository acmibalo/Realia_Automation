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

WebUI.navigateToUrl('https://realia-uat.azurewebsites.net/')

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Test/Page_Realia/input_EmailOrUserName'), 'realia_alvin31@mailinator.com')

WebUI.setText(findTestObject('Test/Page_Realia/input_Password'), 'P@ssw0rd')

WebUI.sendKeys(findTestObject('Test/Page_Realia/input_Password'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/a_1 Union St Brunswick VIC 305'))

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/i_fa fa-ellipsis-h'))

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/a_FlagReport'))

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/button_'))

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/h4_alvin31'))

WebUI.delay(5)

WebUI.click(findTestObject('Test/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://realia-uat.azurewebsites.net/')

WebUI.click(findTestObject('Front-end/Property Review/Page_Realia (6)/a_Log in'))

WebUI.setText(findTestObject('Front-end/Property Review/Page_Realia (6)/input_EmailOrUserName'), 'realia_alvin32@mailinator.com')

WebUI.setText(findTestObject('Front-end/Property Review/Page_Realia (6)/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Front-end/Property Review/Page_Realia (6)/input_btn btn-primary'))

WebUI.click(findTestObject('Front-end/Property Review/Page_Realia (6)/a_btn-search'))

WebUI.setText(findTestObject('Front-end/Property Review/Page_Realia (6)/input_form-control input-searc'), '1 Doncaster Rd,  ')

WebUI.sendKeys(findTestObject('Front-end/Property Review/Page_Realia (6)/input_form-control input-searc'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Front-end/Property Review/Page_Realia (6)/span_'))

WebUI.closeBrowser()

