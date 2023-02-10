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

WebUI.navigateToUrl('https://mip.eassets.emeal.nttdata.com/home')

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Privacy policy_mat-checkbox-inner-container'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Terms of use_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/label_Companies'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/label_Alliances'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Adobe'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Revenue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Revenue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_17.606.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_15.785.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_12.868.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_11.171.297.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_9.030.008.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Gross profit'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_15.441.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_13.920.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_11.146.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_9.498.577.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_7.835.009.000'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Operating income'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_6.098.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_5.802.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_4.237.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_3.268.121.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_2.840.369.000'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://site.financialmodelingprep.com/')

WebUI.setText(findTestObject('Object Repository/Page_Financial Modeling Prep - Home/input_Financial Modeling Prep_search-box'), 
    'adobe')

WebUI.click(findTestObject('Object Repository/Page_Financial Modeling Prep - Home/a_ADBE Adobe Inc'))

WebUI.click(findTestObject('Object Repository/Page_ADBE 379.33 -12.90 -3.29 Adobe Inc. - _ec5b4a/a_Financial Statements'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_Revenue'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_17,606,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_15,785,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_12,868,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_11,171,297'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_9,030,008'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_Gross Profit'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_15,441,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_13,920,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_11,146,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_9,498,577'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_7,835,009'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_Operating Income'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_6,098,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_5,802,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_4,237,000'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_3,268,121'))

WebUI.click(findTestObject('Object Repository/Page_ADBE Financial Statements - FinancialM_f744c1/span_2,840,369'))

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mip-test.eassets-int.emeal.nttdata.com/home')

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Terms and Conditions_mat-checkbox-inne_6ce7cb'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Terms of use_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Letsgo'))

