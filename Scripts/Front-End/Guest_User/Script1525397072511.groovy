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

WebUI.click(findTestObject('Guest_User/img'))

WebUI.click(findTestObject('Guest_User/a_Reviews'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_Q  A'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_Sign up'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_Log in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Guest_User/input_EmailOrUserName'), 'test email')

WebUI.setText(findTestObject('Guest_User/input_Password'), 'dfddfdf')

WebUI.click(findTestObject('Guest_User/input_RememberMe'))

WebUI.verifyElementPresent(findTestObject('Guest_User/input_btn btn-primary'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Sign up_1'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Forgot your password'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/button_Google'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/button_Facebook'), 0)

WebUI.click(findTestObject('Guest_User/a_Sign up'))

WebUI.delay(8)

WebUI.verifyElementPresent(findTestObject('Guest_User/select_I am a TenantI am an Ag'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_FirstName'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_LastName'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_DisplayName'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_PostCode'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_ConfirmPassword'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/img_CaptchaImage'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Try another'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_CaptchaInputText'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_check_agree_termofservic'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Terms of Use'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_btn btn-primary'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_ (1)'))

WebUI.verifyElementPresent(findTestObject('Guest_User/span_glyphicon glyphicon-searc'), 0)

WebUI.click(findTestObject('Guest_User/span_glyphicon glyphicon-searc'))

WebUI.delay(10)

WebUI.setText(findTestObject('Guest_User/input_form-control input-searc'), 'fre')

WebUI.delay(10)

WebUI.click(findTestObject('Guest_User/div_1 High Street Fremantle WA'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Follow 0'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/h3_Marina Village 1 High St Fr'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/canvas_widget-scene-canvas'), 0)

WebUI.click(findTestObject('Guest_User/a_Photos'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_Map'))

WebUI.verifyElementPresent(findTestObject('Guest_User/div'), 0)

WebUI.delay(8)

WebUI.click(findTestObject('Guest_User/i_cr-icon fa fa-check'))

WebUI.delay(8)

WebUI.click(findTestObject('Guest_User/Page_Realia (1)/button_Close'))

WebUI.verifyElementPresent(findTestObject('Guest_User/div_(0) Reviews'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Write a Review'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Ask a Question'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/h4_Questions and Answers'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/div_'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/div_Submit'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/h3_Fremantle local expert'), 0)

WebUI.delay(8)

WebUI.click(findTestObject('Guest_User/a_Ask a Question'))

WebUI.delay(8)

WebUI.setText(findTestObject('Guest_User/textarea_Title'), 'test question')

WebUI.delay(8)

WebUI.click(findTestObject('Guest_User/a_Submit'))

WebUI.delay(15)

WebUI.verifyElementPresent(findTestObject('Guest_User/div_You are not logged in'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/div_You need to login to post'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Sign up here'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Guest_User/button_'))

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_REALIA.COM.AU'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/i_fa fa-facebook'), 0)

WebUI.verifyElementPresent(findTestObject('Guest_User/i_fa fa-twitter'), 0)

WebUI.click(findTestObject('Guest_User/a_BLOG'))

WebUI.delay(7)

WebUI.click(findTestObject('Guest_User/a_TERMS OF USE (1)'))

WebUI.delay(7)

WebUI.click(findTestObject('Guest_User/a_PRIVACY POLICY (1)'))

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_CONTACT US'), 0)

WebUI.click(findTestObject('Guest_User/img'))

WebUI.delay(7)

WebUI.click(findTestObject('Guest_User/li_Ask a Question'))

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_Title'), 0)

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Guest_User/input_input-suburbstreet-searc'), 0)

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Guest_User/span_Choose Category'), 0)

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Guest_User/a_Ask'), 0)

WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Guest_User/input_Title'), 'What is the address of fremantle?')

WebUI.delay(7)

WebUI.setText(findTestObject('Guest_User/input_input-suburbstreet-searc'), 'Fre')

WebUI.delay(7)

WebUI.click(findTestObject('Guest_User/Page_Realia/div_FremantleWA Australia'))

WebUI.click(findTestObject('Guest_User/a_Ask'))

WebUI.verifyElementPresent(findTestObject('Guest_User/div_You need to login first. N'), 0)

WebUI.click(findTestObject('Guest_User/button_'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/h4_Leave a Review'))

WebUI.verifyElementPresent(findTestObject('Guest_User/div_Reviews                   _1'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_Reviews_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_Q  A_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Guest_User/a_View all'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Guest_User/div_alvin14'), 0)

WebUI.delay(5)

not_run: WebUI.verifyElementPresent(findTestObject('Guest_User/div_Question for Suburb'), 0)

WebUI.switchToWindowTitle('Realia')

WebUI.click(findTestObject('Guest_User/i_fa fa-facebook_1'))

WebUI.switchToWindowTitle('Realia')

WebUI.click(findTestObject('Guest_User/i_fa fa-facebook_1'))

WebUI.click(findTestObject('Guest_User/i_fa fa-twitter_1'))

WebUI.click(findTestObject('Guest_User/i_fa fa-ellipsis-h'))

WebUI.closeBrowser()

