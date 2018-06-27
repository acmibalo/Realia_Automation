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

WebUI.click(findTestObject('Page_Realia (2)/img'))

WebUI.click(findTestObject('Page_Realia (2)/a_Reviews'))

WebUI.click(findTestObject('Page_Realia (2)/a_Q  A'))

'Client Message'
WebUI.click(findTestObject('Page_Realia (2)/span_glyphicon glyphicon-envel'))

WebUI.click(findTestObject('Page_Realia (2)/span_glyphicon glyphicon-bell'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/span_glyphicon glyphicon-searc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Realia (2)/input_form-control input-searc'), 'a')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Realia (2)/div_1 Anzac Parade Moore Park'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/span_glyphicon glyphicon-searc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Realia (2)/input_form-control input-searc'), 'a')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/div_A1 Main Street Box Hill VI'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/span_glyphicon glyphicon-searc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Realia (2)/input_form-control input-searc'), 'a')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/div_Adelaide SA Australia'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Front-end/Page_Realia/Page_Realia/Page_Realia/a_REALIA.COM.AU'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/i_fa fa-facebook'))

WebUI.delay(10)

WebUI.closeWindowUrl('https://www.facebook.com/realia.com.au/')

WebUI.delay(10)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Realia (2)/i_fa fa-twitter'))

WebUI.delay(10)

WebUI.closeWindowUrl('https://twitter.com/Realiaau')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_BLOG'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_CONTACT US'))

WebUI.click(findTestObject('Page_Realia (2)/a_TERMS OF USE'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_PRIVACY POLICY'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/img'))

WebUI.click(findTestObject('Page_Realia (2)/a_Reviews_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Q  A_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_View all'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/div_Reviews'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Q  A_1'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Realia (2)/input_Title'), '1 Alvine Dr, Eagleby QLD 4207, amas?')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Realia/Page_Realia/span_Choose Category'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/li_Suburb'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Ask'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/h3_Where is adelaide'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/h4_You'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/img_rl-avatar'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/h4_Your Answer'), 0)

WebUI.click(findTestObject('Page_Realia (2)/i_fa fa-ellipsis-h'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/a_Edit'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/h3_Asked Question about Suburb'), 0)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/i_fa fa-facebook_1'))

WebUI.delay(10)

WebUI.closeWindowTitle('Error')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/i_fa fa-twitter_1'))

WebUI.delay(5)

WebUI.closeWindowTitle('Share a link on Twitter')

WebUI.delay(5)

WebUI.switchToWindowTitle('Realia')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Realia (2)/textarea_Answer'), 'Just go ahead!')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/span_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Comments  0'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/span_0'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Realia (2)/textarea_comment'), 'that\'s fine...')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Submit'))

WebUI.delay(5)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Realia (2)/p_thats fine...'), 0)

not_run: WebUI.click(findTestObject('Page_Realia (2)/a_Reply 0'))

not_run: WebUI.setText(findTestObject('Page_Realia (2)/textarea_reply'), 'yes')

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('Front-end/Tenant Review/Page_Realia/a_Submit'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Realia (2)/small_Edit'))

not_run: WebUI.setText(findTestObject('Page_Realia (2)/textarea_thats fine...'), 'that\'s fine...h')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Realia (2)/button_Update'))

not_run: WebUI.click(findTestObject('Page_Realia (2)/button_Yes'))

not_run: WebUI.rightClick(findTestObject('Page_Realia (2)/p_thats fine...h'))

not_run: WebUI.setText(findTestObject('Page_Realia (2)/textarea_comment'), 'delete me')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Realia (2)/a_Submit'))

not_run: WebUI.click(findTestObject('Page_Realia (2)/small_Delete'))

not_run: WebUI.click(findTestObject('Page_Realia (2)/button_Yes_1'))

WebUI.click(findTestObject('Page_Realia (2)/img'))

WebUI.click(findTestObject('Page_Realia (2)/a_Q  A_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Q  A'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Suburb'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Tenants rights'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Street'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Renting'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Purchase'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Mortgage'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Law'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Investment'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Housing'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_General'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_Alvin Prop'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Realia (2)/a_All'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_Realia (2)/a_Suburb'))

WebUI.delay(8)

WebUI.closeBrowser()

WebUI.delay(10)

