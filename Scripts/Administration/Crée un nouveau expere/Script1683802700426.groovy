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

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'cat@cat.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Plateforme de gestion des sinistres li_05fe44/a_Administration'))

WebUI.scrollToElement(findTestObject('Click_sur_consiel_expere/a_Gestion des experts Conseil'), 1)

//WebUI.executeJavaScript('document.querySelector(\'.sidebar\').scrollTo(0, document.querySelector(\'.sidebar\').scrollHeight)', null)
WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des experts Conseil'))

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/a_Ajouter un expert'))

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/div_Slectionner'))

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/li_TPE  Profession Librale'))

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input_concat(Nom l, , expert)_Nom'), 
    'Abdelghafour')

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input_concat(Prnom de l, , expert)_Prenom'), 
    'soubella')

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input__RaisonSociale'), 
    'SRAL')

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/div_0Slectionner'))

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/li_RMA'))

WebUI.click(findTestObject('Expere/Page_Administration - Gestion des experts conseils/input__RaisonSociale'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Administration - Gestion des experts conseils/ville_aff'))

WebUI.scrollToElement(findTestObject('Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/li_AGADIR'), 
    1)

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/li_AGADIR'))

WebUI.scrollToElement(findTestObject('Expere/Page_Administration - Gestion des experts conseils/div_0Slectionner'), 1)

WebUI.click(findTestObject('Page_Administration - Gestion des experts conseils/ville_res'))

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/li_AIN AOUDA'))

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input__ICE'), 
    '0000665476676')

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/textarea__Adresse'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input__Email'), 
    'soubella_abdel@gmail.com')

WebUI.setText(findTestObject('Page_Administration - Gestion des experts conseils/Tele_cab'), '0634227657')

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input__GSM'), 
    '0643568744')

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input__Capacite'), 
    '1')

WebUI.scrollToElement(findTestObject('evenements/Page_Gestion des venements  Cration/button_Enregistrer'), 1)

WebUI.click(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/button_Enregistrer'))

WebUI.setText(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/input_Lignes par page_searchString'), 
    'Abdelghafour')

WebUI.sendKeys(findTestObject('Expere/Page_Administration - Gestion des experts conseils/input_Lignes par page_searchString'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Object Repository/Expere/Page_Administration - Gestion des experts conseils/Page_Administration - Gestion des experts conseils/td_marwan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

