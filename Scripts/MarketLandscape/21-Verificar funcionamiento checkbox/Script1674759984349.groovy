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

WebUI.callTestCase(findTestCase('Casos de prueba transversales/NavegacionInicialDev'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/label_Market Landscape'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/a_News'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Select all industry categories'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Select all service categories'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Innovation Services_mat-checkbox-inner_92ff86'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Travel, Transportation  Logistics_mat-_e33459'))

WebUI.closeBrowser()

