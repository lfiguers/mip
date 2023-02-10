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

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

'Samsung s20'
WebUI.setViewPortSize(360, 800)

'One plus 9 pro\r\n'
WebUI.setViewPortSize(412, 919)

'I phone mini'
WebUI.setViewPortSize(360, 780)

'I phone 12 pro'
WebUI.setViewPortSize(390, 844)

'I phone 12 pro max\r\n'
WebUI.setViewPortSize(428, 926)

'Huawey Mate pad Pro'
WebUI.setViewPortSize(1280, 800)

'I pad air\r\n'
WebUI.setViewPortSize(834, 1180)

'I pad pro'
WebUI.setViewPortSize(1024, 1366)

'i pad 10.2 "\r\n'
WebUI.setViewPortSize(810, 1080)

'I pad mini'
WebUI.setViewPortSize(768, 1024)

WebUI.closeBrowser()

