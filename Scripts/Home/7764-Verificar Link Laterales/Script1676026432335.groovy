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

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Terms of use_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Find the market information you need an_f4055d'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/a_I need a Competitor trackingreport'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/img_Market Intelligence Platform_mip-header_e49a12'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/a_I need to learn about the Analyst perspec_3de133'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/img_Market Intelligence Platform_mip-header_e49a12'))

WebUI.verifyElementClickable(findTestObject('Page_Market Intelligence Platform/a_I need to know the Insurance Portfolio'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/a_I need to know the Insurance Portfolio'))

WebUI.closeBrowser()

