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

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/a_apartmentCompaniesexpand_more'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/label_Competitors'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_61.594.305.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/span_Accenture'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/td_61.594.305.000'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/a_Accenture to acquire SKS Group'))

'link de la noticia\r\n'
WebUI.delay(15)

'verificar que el titulo este visible\r\n'
WebUI.verifyTextPresent('Accenture to acquire SKS Group', false)

'Se cambia de ventana a a de UptoDate\r\n'
WebUI.switchToWindowTitle('Accenture to acquire SKS Group')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Accenture to acquire SKS Group/h2_Accenture to acquire SKS Group_Uptodate'), 
    'Accenture to acquire SKS Group')

WebUI.click(findTestObject('Object Repository/Page_Accenture to acquire SKS Group/h2_Accenture to acquire SKS Group'))

WebUI.click(findTestObject('Object Repository/Page_Accenture to acquire SKS Group/div_Accenture to acquire SKS Group143 min r_70339d'))

WebUI.click(findTestObject('Object Repository/Page_Accenture to acquire SKS Group/h2_Accenture to acquire SKS Group'))

