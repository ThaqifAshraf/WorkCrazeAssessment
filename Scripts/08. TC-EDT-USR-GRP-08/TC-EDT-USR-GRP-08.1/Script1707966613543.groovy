import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('01. TC-LOG-01/TC-LOG-01.1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Dashboard/a_UserGroups'))

WebUI.click(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Add User Group/Page_BusyZeus  User Groups/button_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Add User Group/input_groupName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Add User Group/input_groupName'), 'Automation Testing')

WebUI.doubleClick(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Add User Group/input_groupName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Add User Group/input_Description'), 'Lorem Ipsum Pasta Linguini ')

WebUI.click(findTestObject('Object Repository/0.1 TC-LOG-01/Page_BusyZeus  Add User Group/checkbox_Status'))

WebUI.click(findTestObject('0.1 TC-LOG-01/Page_BusyZeus  Add User Group/Page_BusyZeus  Add User Group/input_Users_Add'))

WebUI.click(findTestObject('0.1 TC-LOG-01/Page_BusyZeus  Add User Group/Page_BusyZeus  Add User Group/input_Users_Delete'))

WebUI.click(findTestObject('0.1 TC-LOG-01/Page_BusyZeus  Add User Group/Page_BusyZeus  Add User Group/input_Users_Edit'))

WebUI.click(findTestObject('0.1 TC-LOG-01/Page_BusyZeus  Add User Group/Page_BusyZeus  Add User Group/input_Users_List'))

WebUI.click(findTestObject('0.1 TC-LOG-01/Page_BusyZeus  Add User Group/Page_BusyZeus  Add User Group/button_Save'))
