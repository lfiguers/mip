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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mip.eassets.emeal.nttdata.com')

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Privacy policy_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Terms of use_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_expand_more'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/label_Competitors'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Accenture'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_61.594.305.000'))

string value1 = WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_61.594.305.000'))


WebUI.navigateToUrl('https://site.financialmodelingprep.com/financial-statements/FJTSY')

WebUI.setText(findTestObject('Object Repository/Page_FJTSY Financial Statements - Financial_cb6e93/input_Financial Modeling Prep_search-box'), 
    'accenture')

WebUI.click(findTestObject('Object Repository/Page_FJTSY Financial Statements - Financial_cb6e93/a_ACN Accenture plc'))

WebUI.click(findTestObject('Object Repository/Page_ACN 279.05 4.73 1.72 Accenture plc - F_93e3b9/a_Financial Statements'))

WebUI.click(findTestObject('Object Repository/Page_ACN Financial Statements - FinancialMo_e40790/span_61,594,305'))


string value2= WebUI.click(findTestObject('Object Repository/Page_ACN Financial Statements - FinancialMo_e40790/span_61,594,305'))

WebUI.verifyEqual(value1, value2)

WebUI.verifyMatch('61,594,305', '61,594,305', false)

