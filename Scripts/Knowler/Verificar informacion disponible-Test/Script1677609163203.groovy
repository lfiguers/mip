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

WebUI.navigateToUrl('https://mip-test.eassets-int.emeal.nttdata.com/home')

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/span_I have read the Terms of use'))

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/span_I have read and agree to the Privacy policy'))

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/button_Next Step'))

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/button_Get Started Now'))

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/a_diamondOffering  Capabilitiesexpand_more'))

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/label_Global Portfolio'))

WebUI.click(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/button_Next'))

WebUI.click(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/button_Lets go'))

WebUI.verifyElementText(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/a_Smart Operations'), 
    'Smart Operations')

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/a_category Assets  Products'))

WebUI.verifyElementText(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/td_Agility, Connectivity, Data control'), 
    'Agility, Connectivity, Data control')

WebUI.click(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/a_cases Projects'))

WebUI.verifyElementText(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/a_AXA MEDITERRANEAN SYSTEMS,A.E.I.E.,SUCURSAL EM PORTUGAL'), 
    'AXA MEDITERRANEAN SYSTEMS,A.E.I.E.,SUCURSAL EM PORTUGAL')

WebUI.click(findTestObject('Object Repository/ObjetosManuales/knowler/Page_Market Intelligence Platform/a_article Success Stories'))

WebUI.verifyElementText(findTestObject('ObjetosManuales/knowler/Page_Market Intelligence Platform/a_Working Group for Standard API in Insurance Agency Channel'), 
    'Working Group for Standard API in Insurance Agency Channel')

