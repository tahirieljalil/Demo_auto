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

WebUI.setText(findTestObject('Object Repository/Déactiver Avocat/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'cat@cat.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/Déactiver Avocat/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_CAT - Authentification/button_Connexion'))

WebUI.maximizeWindow()

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Plateforme de gestion des sinistres li_05fe44/a_Administration'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Administration - Gestion des avocats/a_Gestion des utilisateurs'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Administration - Gestion des utilisateurs/a_Ajouter un nouvel utilisateur'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/span_Slectionner'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/li_Avocat'))

WebUI.click(findTestObject('Page_Gestion des utilisateurs  Cration/div_RMA'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/li_RMA'))

WebUI.scrollToElement(findTestObject('Page_Gestion des utilisateurs  Cration/div_Slectionner'), 1)

WebUI.click(findTestObject('Page_Gestion des utilisateurs  Cration/div_Slectionner'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/li_mourad mourad'))

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/span_Dsactiv_checkmark'))

String inputValue = WebUI.getAttribute(findTestObject('get_text_login_user/input__Login_text'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

//println("The value of the input field is: " + inputValue)
WebUI.scrollToElement(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/button_Enregistrer'), 
    1)

WebUI.click(findTestObject('Object Repository/Déactiver Avocat/Page_Gestion des utilisateurs  Cration/button_Enregistrer'))

/*WebUI.verifyElementText(findTestObject('Object Repository/Déactiver Avocat/Page_Administration - Gestion des utilisateurs/div_Utilisateur a t cr avec succs'), 
    'Utilisateur a été créé avec succès')

WebUI.verifyElementPresent(findTestObject('Object Repository/Déactiver Avocat/Page_Administration - Gestion des utilisateurs/div_Utilisateur a t cr avec succs'), 
    0)

WebUI.setText(findTestObject('Déactiver Avocat/Page_Administration - Gestion des utilisateurs/input_Lignes par page_searchString'), 
    inputValue)

WebUI.sendKeys(findTestObject('Admin_new_avocat/Page_Administration - Gestion des avocats/input_Lignes par page_MotCle'), 
    Keys.chord(Keys.ENTER))*/
WebUI.verifyElementVisible(findTestObject('Object Repository/Déactiver Avocat/Page_Administration - Gestion des utilisateurs/div_Utilisateur a t cr avec succs'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

