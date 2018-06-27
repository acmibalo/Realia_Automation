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

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/input_Title'), 'What is the capital of Melbourne4?')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/input_input-suburbstreet-searc'), 'Melbou')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/Page_Realia/div_MelbourneVIC Australia'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Ask'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/textarea_Answer'), 'ne')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/textarea_Answer'), 'near the table street')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/span_Submit'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/textarea_comment (1)'), 'Th')

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/textarea_comment (1)'), 'This is auwsome')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Reply 0'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/small_Edit'))

WebUI.delay(5)

WebUI.setText(findTestObject('Front-end/Questions/Page_Realia/textarea_This is auwsome'), 'This is auwsome edit')

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/button_Update'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/button_Yes'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/small_Delete'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/button_Yes_1'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Back to Suburb'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Photos'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Street View'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/h4_alvin35'))

WebUI.delay(5)

WebUI.click(findTestObject('Front-end/Questions/Page_Realia/a_Log off'))

WebUI.delay(5)

WebUI.closeBrowser()

