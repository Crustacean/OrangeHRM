import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setViewPortSize(300, 703)

WebUI.navigateToUrl('https://tryone-trials646.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Fname)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Page_Employee List/input_Add Employee_firstName (4)'), Fname)

WebUI.setText(findTestObject('Object Repository/Page_Employee List/input_Middle Name_lastName (4)'), Fname)

WebUI.click(findTestObject('Object Repository/Page_Employee List/span_'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/div_-- Select --United StatesNew York-- Select --United StatesNew York'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/span_New York (4)'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/a_Save (4)'))

WebUI.click(findTestObject('Page_Personal Details/span_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/td_0009'))

WebUI.click(findTestObject('Page_Personal Details/label_Male'))

WebUI.click(findTestObject('Page_Personal Details/button_Save'))

WebUI.click(findTestObject('Page_Personal Details/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Personal Details/a_Logout'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Fname)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.setViewPortSize(700, 703)

WebUI.navigateToUrl('https://tryone-trials646.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Fname)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Page_Employee List/input_Add Employee_firstName (4)'), Fname)

WebUI.setText(findTestObject('Object Repository/Page_Employee List/input_Middle Name_lastName (4)'), Fname)

WebUI.click(findTestObject('Object Repository/Page_Employee List/span_'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/div_-- Select --United StatesNew York-- Select --United StatesNew York'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/span_New York (4)'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/a_Save (4)'))

WebUI.click(findTestObject('Page_Personal Details/span_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/td_0009'))

WebUI.click(findTestObject('Page_Personal Details/label_Male'))

WebUI.click(findTestObject('Page_Personal Details/button_Save'))

WebUI.click(findTestObject('Page_Personal Details/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Personal Details/a_Logout'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Fname)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://tryone-trials646.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Fname)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Page_Employee List/input_Add Employee_firstName (4)'), Fname)

WebUI.setText(findTestObject('Object Repository/Page_Employee List/input_Middle Name_lastName (4)'), Fname)

WebUI.click(findTestObject('Object Repository/Page_Employee List/span_'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/div_-- Select --United StatesNew York-- Select --United StatesNew York'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/span_New York (4)'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/a_Save (4)'))

WebUI.click(findTestObject('Page_Personal Details/span_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_Employee List/td_0009'))

WebUI.click(findTestObject('Page_Personal Details/label_Male'))

WebUI.click(findTestObject('Page_Personal Details/button_Save'))

WebUI.click(findTestObject('Page_Personal Details/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Personal Details/a_Logout'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Fname)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.closeBrowser()


