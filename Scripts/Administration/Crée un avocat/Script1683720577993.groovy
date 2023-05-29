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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'cat@cat.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin_new_avocat/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_Plateforme de gestion des sinistres li_05fe44/a_Administration'))

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des avocats'))

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_Administration - Gestion des avocats/a_Ajouter un avocat conseil'))

String name = generateRandomName()

String lastName = generateRandomLastName()

String email = generateRandomEmail(name, lastName)

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Nom'), name)

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Prenom'), lastName)

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Email'), email)

String inputValue = WebUI.getAttribute(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Email'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Nom'), 'zineb')
//WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Prenom'), 'tnhari')
WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__GSM'), '0644332255')

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/span_Slectionner'))

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/li_AGADIR'))

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__GSM'), '0644110055')

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__RaisonSociale'), 
    'XXX')

//WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__Email'), 'zineb@tnhari.ma')
'à change'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/select_Slectionner                         _c50728'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/select_Slectionner                         _c50728'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__ICE'), '3588887655')

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/textarea__Adresse'), 
    'RES TEST APRT TEST IMM TEST RUE TEST HAY TEST ')

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__OrdreAvocat'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__JuridicationCA'), 
    '58854')

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/input__JuridicationTPI'), 
    '5765')

WebUI.scrollToElement(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/button_Enregistrer'), 
    1)

WebUI.click(findTestObject('Object Repository/Admin_new_avocat/Page_Gestion des avocats  Cration/button_Enregistrer'))

WebUI.setText(findTestObject('Object Repository/Admin_new_avocat/Page_Administration - Gestion des avocats/input_Lignes par page_MotCle'), 
    inputValue)

WebUI.sendKeys(findTestObject('Object Repository/Admin_new_avocat/Page_Administration - Gestion des avocats/input_Lignes par page_MotCle'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_new_avocat/Page_Administration - Gestion des avocats/td_mouradmourad.mo'), 
    0)

WebUI.closeBrowser()

def generateRandomName() {
    return RandomStringUtils.randomAlphabetic(5).capitalize()
}

def generateRandomLastName() {
    return RandomStringUtils.randomAlphabetic(8).capitalize()
}

def generateRandomEmail(def name, def lastName) {
}

