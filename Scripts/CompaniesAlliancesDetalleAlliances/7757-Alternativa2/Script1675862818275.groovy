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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Casos de prueba transversales/NavegacionInicialTestNewIntro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/label_Companies'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/label_Alliances'))

WebUI.click(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Page_Market Intelligence Platform/Page_Market Intelligence Platform/button_Close'))
'desde aqui ingresar el ciclo for para recorrer la lista de compañias'
WebUI.click(findTestObject('Page_Market Intelligence Platform/span_Adobe'))

/*Revenue22 = WebUI.getText(findTestObject('TablesAlliances/Fila2022ColRevenue'))
//numEntero = Integer.valueOf(filaRevenue2022)
//println(numEntero)
println(filaRevenue22)*/


public void testWebTable()  {
	WebElement simpleTable = driver.findElement(By.xpath("//table[@id='pr_id_10-table']/tbody"));
	// Get all rows
	List<WebElement> rows = simpleTable.findElements(By.tagName("tr"));
	List<String> webTableData = new ArrayList<String>();

	// Print/Save data from each row

	for (WebElement row : rows) {
		List<WebElement> cols = row.findElements(By.tagName("td"));
		for (WebElement col : cols) {
			webTableData.add(col.getText());
			 println(col.getText() + "\t");
		   } 
	   }
	}

WebUI.closeBrowser()

