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

WebUI.setText(findTestObject('Object Repository/evenements/Page_CAT - Authentification/input_Connexion_Input.Login'), 'cat@cat.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/evenements/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/evenements/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Plateforme de gestion des sinistres li_05fe44/a_Administration'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des vnements'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Administration - Gestion des vnements/a_Cration des vnements'))

WebUI.setText(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/input__Duree'), '15')

WebUI.setText(findTestObject('date evenment/Page_Gestion des venements  Cration/input__DateEvenement'), '12/05/2023')

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/div_Slectionner'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/li_Acte de terrorisme'))

WebUI.click(findTestObject('date evenment/Page_Gestion des venements  Cration/region_Slectionner'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/li_Bni Mellal-Khnifra'))

WebUI.click(findTestObject('date evenment/Page_Gestion des venements  Cration/province_Slectionner'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/li_Azilal'))

WebUI.scrollToElement(findTestObject('date evenment/Page_Gestion des venements  Cration/comune_Slectionner'), 1)

WebUI.click(findTestObject('date evenment/Page_Gestion des venements  Cration/comune_Slectionner'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/li_afourar'))

WebUI.click(findTestObject('date evenment/Page_Gestion des venements  Cration/postal_Slectionner'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/li_MAR_AZI'))

WebUI.click(findTestObject('date evenment/Page_Gestion des venements  Cration/ville_Slectionner'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/li_AGADIR'))

WebUI.click(findTestObject('Object Repository/evenements/Page_Gestion des venements  Cration/button_Enregistrer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/evenements/Page_Administration - Gestion des vnements/div_Lvnement a t cr avec succs sous la rfre_f62dbc'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

