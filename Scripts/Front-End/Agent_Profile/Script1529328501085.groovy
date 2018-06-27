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

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/h4_Agent33'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Dashboard'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_Director1FirstName'), 'Alvin')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_Director1LastName'), 'Realia')

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_Director1FirstName'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_Director1FirstName'), 'Agent')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/label_Director 1 First Name'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_Website'), 'http://www.realia.com.au')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_FacebookLink'), 'https://facebook.com/realia')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_TwitterLink'), 'https://twitter.com/realia')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_YoutubeLink'), 'https://twitter.com/realia')

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_YoutubeLink'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_YoutubeLink'), 'https://youtube.com/realia')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_LinkedInLink'), 'realia')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_LinkedInLink'), 'https://twitter.com/realia')

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_LinkedInLink'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Agent_PRofile/Page_Realia/input_LinkedInLink'), 'https://linkedin.com/realia')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Save Changes'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Reviews 0'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Street Reviews 0'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Suburb Reviews 0'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Questions'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Answers'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Managers'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Followers 0'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/h4_Agent33'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Agent_PRofile/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.closeBrowser()

