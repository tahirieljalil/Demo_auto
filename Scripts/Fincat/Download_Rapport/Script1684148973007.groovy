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

WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Download_rappot_TDB/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'catfinance')

WebUI.setEncryptedText(findTestObject('Object Repository/Download_rappot_TDB/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'rG7BQPbhekFqTEZdy4bBmQ==')

WebUI.click(findTestObject('Object Repository/Download_rappot_TDB/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/Download_rappot_TDB/Page_Plateforme de gestion des sinistres li_05fe44/a_Reporting  TDB'))

WebUI.click(findTestObject('Object Repository/Download_rappot_TDB/Page_Reporting  TDB/span_Vhicule_checkmark'))

WebUI.scrollToElement(findTestObject('Download_rappot_TDB/Page_Reporting  TDB/span_Rglement_checkmark'), 1)

WebUI.click(findTestObject('Object Repository/Download_rappot_TDB/Page_Reporting  TDB/span_Rglement_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/Download_rappot_TDB/Page_Reporting  TDB/a_Tlcharger le rapport'), 
    1)

WebUI.click(findTestObject('Object Repository/Download_rappot_TDB/Page_Reporting  TDB/a_Tlcharger le rapport'))

/*File DownloadFile = new File("C:\\Users\\atahiri\\Downloads")

List nameOffiles = Arrays.asList(DownloadFile.list())

println(nameOffiles.toListString())

if (nameOffiles.contains("Règlement_")) {
	
	println "Passé"
}
else {
	println "échoué"
}*/
File downloadDir = new File('C:\\Users\\atahiri\\Downloads')

List<String> nameOfFiles = Arrays.asList(downloadDir.list())

println(nameOfFiles)

boolean fileFound = false

for (String fileName : nameOfFiles) {
    if (fileName.contains('Règlement_')) {
        fileFound = true

        break
    }
}

if (fileFound) {
    println('Passé')
} else {
    assert false
}

WebUI.closeBrowser()

