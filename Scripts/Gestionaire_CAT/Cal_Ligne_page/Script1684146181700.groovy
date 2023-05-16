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

WebUI.setText(findTestObject('Object Repository/Cal_ligne_page/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'ComCrise')

WebUI.setEncryptedText(findTestObject('Object Repository/Cal_ligne_page/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'rG7BQPbhekFqTEZdy4bBmQ==')

WebUI.click(findTestObject('Expere/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/Cal_ligne_page/Page_Plateforme de gestion des sinistres li_05fe44/a_Indemnisation'))

WebUI.click(findTestObject('Object Repository/Cal_ligne_page/Page_Plateforme de gestion des sinistres li_05fe44/a_Calcul des indemnits et propositions'))

WebUI.verifyElementText(findTestObject('Object Repository/Cal_ligne_page/Page_Indemnisation - Calcul des indemnits e_682afb/li_Affichage de llment  1  10 sur 160 lments'), 
    'Affichage de l\'élément 1 à 10 sur 160 éléments')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cal_ligne_page/Page_Indemnisation - Calcul des indemnits e_682afb/select_10                                  _63d86f'), 
    '20', true)

WebUI.verifyElementText(findTestObject('Object Repository/Cal_ligne_page/Page_Indemnisation - Calcul des indemnits e_682afb/li_Affichage de llment  1  20 sur 160 lments'), 
    'Affichage de l\'élément 1 à 20 sur 160 éléments')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cal_ligne_page/Page_Indemnisation - Calcul des indemnits e_682afb/select_10                                  _63d86f'), 
    '100', true)

WebUI.verifyElementText(findTestObject('Object Repository/Cal_ligne_page/Page_Indemnisation - Calcul des indemnits e_682afb/li_Affichage de llment  1  100 sur 160 lments'), 
    'Affichage de l\'élément 1 à 100 sur 160 éléments')

WebUI.closeBrowser()

