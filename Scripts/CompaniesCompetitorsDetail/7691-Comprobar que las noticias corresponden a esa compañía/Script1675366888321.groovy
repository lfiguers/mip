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

WebUI.navigateToUrl('https://mip.eassets.emeal.nttdata.com/companies/alliances/detail/adobe')

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Privacy policy_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Terms of use_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/label_Companies'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/label_Alliances'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Adobe'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_17.606.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_15.441.000.000'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Market Intelligence Platform/div_YearRevenueGross profitOperating income_8c0e4f'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_6.098.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/div_storageSource  Financial Modeling Prep'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_15.785.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_12.868.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_11.171.297.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_9.030.008.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_13.920.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_11.146.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_9.498.577.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_7.835.009.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_6.098.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_5.802.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_4.237.000.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_3.268.121.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_2.840.369.000'))

