import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page parabank index htm'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/parabank/index.htm')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page parabank index htm, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_parabank_index_htm/input_password'), input_password)

'Step 4: At Page parabank index htm, click on body object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_parabank_index_htm/body_object'))

'Step 5: At Page parabank index htm, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_parabank_index_htm/input_password'), input_password_1)

'Step 6: At Page parabank index htm, click on body object > navigate to Page parabank index html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_parabank_index_htm/body_object'))

'Step 7: Add visual checkpoint at Page parabank index html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Access to Parabank Index Page after Logging In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
