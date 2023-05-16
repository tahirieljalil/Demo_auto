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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/FanCat/Page_CAT - Authentification/input_Connexion_Input.Login'), 'catfinance')

WebUI.setEncryptedText(findTestObject('Object Repository/FanCat/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'rG7BQPbhekFqTEZdy4bBmQ==')

WebUI.click(findTestObject('Expere/Page_Administration - Gestion des experts conseils/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/FanCat/Page_Plateforme de gestion des sinistres li_05fe44/a_Reporting  TDB'))

WebUI.click(findTestObject('Object Repository/FanCat/Page_Reporting  TDB/span_Rsidentiel_checkmark'))

WebUI.click(findTestObject('Object Repository/FanCat/Page_Reporting  TDB/input_Nombre des rsidences sinistrs_EtatByT_cd2b5f'))

WebUI.click(findTestObject('Object Repository/FanCat/Page_Reporting  TDB/div_Choisissez une option'))

String actualresult = WebUI.getText(findTestObject('FanCat/Page_Reporting  TDB/li_D.EVCAT15032022'))

WebUI.click(findTestObject('Object Repository/FanCat/Page_Reporting  TDB/li_D.EVCAT15032022'))

WebUI.click(findTestObject('Object Repository/FanCat/Page_Reporting  TDB/button_Filtrer'))

WebUI.verifyTextPresent(actualresult, false)

WebUI.verifyElementClickable(findTestObject('Object Repository/FanCat/Page_Reporting  TDB/a_Tlcharger le rapport'))

WebUI.closeBrowser()

