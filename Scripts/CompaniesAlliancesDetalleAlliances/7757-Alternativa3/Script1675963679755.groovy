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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Casos de prueba transversales/NavegacionInicialTestNewIntro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Market Intelligence Platform/mat-icon_navigate_before'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/label_Companies'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/label_Alliances'))

//Activar en test descativad en dev
WebUI.click(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Page_Market Intelligence Platform/Page_Market Intelligence Platform/button_Close'))
'desde aqui ingresar el ciclo for para recorrer la lista de compañias'
WebUI.click(findTestObject('Page_Market Intelligence Platform/span_Adobe'))

WebUI.waitForPageLoad(20)

String ExpectedValue = '17.606.000.000'

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.ByXPath("//*[@id='pr_id_10-table']/tbody"))
'Para localizar la tabla'
//WebElement Table = WebUI.click(findTestObject('TablesAlliances/tabla_aliances_dev'))

'Para ubicar las filas de la tabla, capturará todas las filas disponibles en la tabla'
List<WebElement> rows_table = Table.findElements(By.tagName('tr _ngcontent-srr-c125'))

'Para calcular el número de filas en la tabla'
int rows_count = rows_table.size()

'Loop se ejecutará para todas las filas de la tabla'
Loop: for (int row = 0; row < rows_count; row++) {
    'Para ubicar columnas (celdas) de esa fila específica'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'Para calcular el número de columnas (celdas) en esa fila específica'
    int columns_count = Columns_row.size()

    println((('NUmero de celdas en la fila ' + row) + ' son ') + columns_count)

    'Loop se ejecutará hasta la última celda de esa fila específica'
    for (int column = 0; column < columns_count; column++) {
        'Recuperará el texto de cada celda.'
        String celltext = Columns_row.get(column).getText()

        println((((('Valor de la celda en la fila: ' + row) + ' y el numero de la columna ') + column) + ' Es: ') + celltext)

        'Comprobando si el texto de la celda coincide con el valor esperado'
        if (celltext == ExpectedValue) {
            'Obtener el nombre del país si el texto de la celda, es decir, el nombre de la empresa coincide con el valor esperado'
            println('Text present in row number 3 is: ' + Columns_row.get(2).getText())

            'Después de obtener el valor esperado de la tabla, terminaremos el ciclo'
            break
        }
    }
}

