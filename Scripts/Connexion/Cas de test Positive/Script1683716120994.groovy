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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/input_Connexion_Input.Login'), 'cat@cat.com')

WebUI.setEncryptedText(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/button_Connexion'))

WebUI.rightClick(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/li_Votre login ou mot de passe est incorrect'))

WebUI.setEncryptedText(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'tFA8b+TFXdY=')

WebUI.click(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/button_Connexion'))

WebUI.setText(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/input_Connexion_Input.Login'), 'cat@cat.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/demo_connex/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/demo_connex/Page_Plateforme de gestion des sinistres li_05fe44/a_Administration'))

WebUI.click(findTestObject('Object Repository/demo_connex/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des vnements'))

