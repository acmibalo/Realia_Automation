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

WebUI.delay(5)

WebUI.navigateToUrl('http://realia-uat.azurewebsites.net/')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Flag Report/Page_Realia (1)/input_EmailOrUserName'), 'realia_mngr09@company.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Flag Report/Page_Realia (1)/input_Password'), 'P@ssw0rd')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/input_btn btn-primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/span_glyphicon glyphicon-searc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Flag Report/Page_Realia (1)/input_form-control input-searc'), 'se')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/div_Seaview Road West Beach SA'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/a_Write a Review'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/input'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/button_Submit Review'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Flag Report/Page_Realia (1)/input_StreetComment.ReviewTitl'), 'Airy Rooms')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Flag Report/Page_Realia (1)/textarea_StreetComment.TellUsA'), 'We spent two nights here. The Rooms were large and airy and the shower was really great. The location is on a hill, a ten minute walk from the center of town. There is a spa, that does decent massages and a bar. The breakfast is fairly substantial. There is nothing much in terms of restaurants in town for the evening, so in future I would eat here.')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/button_Submit Review'))

WebUI.delay(5)

WebUI.waitForElementNotPresent(findTestObject('Front-end/Flag Report/Page_Realia (2)/span_Rating is required.'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/h4_Agent33'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia (1)/a_Log off'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Front-End/Global_Login'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/i_fa fa-ellipsis-h'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/a_FlagReport'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Flag Report/Page_Realia/textarea_Description'), 'Not good Review!')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/button_Send Report'))

WebUI.delay(12)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/h4_alvin35'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Administration/Admin_Login'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.navigateToUrl('http://realia-uat.azurewebsites.net/admin/home/flaggedusers')

WebUI.delay(15)

WebUI.verifyElementPresent(findTestObject('Front-end/Flag Report/Page_Realia/a_Not good Review'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/a_Close'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/span_adminmailinator.com'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Flag Report/Page_Realia/a_Sign Out'))

WebUI.delay(5)

WebUI.closeBrowser()

WebUI.acceptAlert()

