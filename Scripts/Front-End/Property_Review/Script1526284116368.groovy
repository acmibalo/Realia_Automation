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

WebUI.navigateToUrl('https://realia-uat.azurewebsites.net/Account/Login')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_EmailOrUserName'), 'realia_prop02@mailinator.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Front-end/Property Review/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/span_glyphicon glyphicon-searc (1)'))

WebUI.delay(5)

'Please change the property name varialble value here.'
WebUI.setText(findTestObject('Front-end/Property Review/input_form-control input-searc'), Property_Name)

WebUI.delay(8)

WebUI.sendKeys(findTestObject('Front-end/Property Review/Page_Realia (6)/input_form-control input-searc'), Keys.chord(Keys.ENTER))

WebUI.delay(12)

'Please change the property name here.'
WebUI.click(findTestObject('Front-end/Property Review/div_1 Union Street Brunswick V'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Write a Review'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/input_Resident'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/span_Feb'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_PropertyReview.WeeklyRen'), '2')

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Front-end/Property Review/input_PropertyReview.WeeklyRen'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_PropertyReview.WeeklyRen'), '3')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/input_PropertyReview.ResidentU'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/span_Mar'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/i_cr-icon fa fa-check'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_ProsAdditions'), 'Beautiful Place')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_ConsAdditions'), 'Dirty Kitchen')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_PropertyReview.Title'), 'Wonderful House')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/textarea_PropertyReview.Review'), 'Great propperty')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/Page_Realia (2)/span_Search Name'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_select2-search__field'), 'maw')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/li_MAW Inc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_PropertyReview.ManagerNa'), 'Alvin')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_PropertyReview.ManagerEm'), 'Alvin@gmail.com')

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star_1'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star_1'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star_1'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Front-end/Property Review/i_glyphicon glyphicon-star_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Post'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/div_Review submitted for appro'), 0)

WebUI.delay(15)

WebUI.click(findTestObject('Front-end/Property Review/a_Prop02'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log off'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_EmailOrUserName'), 'admin@mailinator.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_Password'), 'admin123')

WebUI.click(findTestObject('Front-end/Property Review/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/div_Pending Post 2'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Approve'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/button_Approve'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/div_Successfully Approved'), 0)

WebUI.delay(15)

WebUI.click(findTestObject('Front-end/Property Review/a_adminmailinator.com'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Sign Out'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_EmailOrUserName'), 'realia_prop02@mailinator.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_Password'), 'P@ssw0rd')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/div_Great Your review in 1 Uni'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/h4_Wonderful House'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/p_Great propperty'), 0)

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/i_fa fa-facebook'))

WebUI.closeWindowTitle('Error')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/i_fa fa-twitter'))

WebUI.delay(5)

WebUI.closeWindowTitle('Share a link on Twitter')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Property Review/i_fa fa-ellipsis-h'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Edit'))

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Property Review/input_BeenHere'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/span_Feb'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/textarea_Great propperty'), 'Great propperty Edited')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Post'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/div_Review submitted for appro'), 0)

WebUI.delay(15)

WebUI.click(findTestObject('Front-end/Property Review/h4_Prop02'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log off'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_EmailOrUserName'), 'Admin@mailinator.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_Password'), 'admin123')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Front-end/Property Review/input_Password'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Property Review/div_Pending Post'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Approve'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/button_Approve_2'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/div_Successfully Approved'), 0)

WebUI.delay(15)

WebUI.click(findTestObject('Front-end/Property Review/a_adminmailinator.com'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Sign Out'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_EmailOrUserName'), 'realia_prop02@mailinator.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Property Review/input_Password'), 'P@ssw0rd')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/div_Great Your review in 1 Uni'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Front-end/Property Review/p_Great propperty Edited'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/h4_Prop02'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Property Review/a_Log off'))

WebUI.delay(5)

WebUI.closeBrowser()

