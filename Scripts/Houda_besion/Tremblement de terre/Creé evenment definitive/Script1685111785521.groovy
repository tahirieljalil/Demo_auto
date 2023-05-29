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
import java.time.*
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.concurrent.ThreadLocalRandom as ThreadLocalRandom

WebUI.openBrowser('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')
WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_CAT - Authentification/input_Connexion_Input.Login'))

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'ComCrise')

WebUI.setEncryptedText(findTestObject('Object Repository/Modifi_even_reche_present/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'rG7BQPbhekFqTEZdy4bBmQ==')

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Plateforme de gestion des sinistres li_05fe44/a_Administration'))

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des vnements'))

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Administration - Gestion des vnements/a_Cration des vnements'))

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/span_Dfinitive_checkmark'))

String random = generateRandomName()

int RN = ((Math.random() * 99) as int)

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/input_concat(Rfrence de l, , acte administr_59de6f'), 
    ('' + random) + RN)

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/input_Dure_ActeAdministratif.Duree'), 
    '' + RN)

// Use the function to generate a random date
String randomDate = generateRandomDateString()

String randomDateString = randomDate.toString()

// Use the generated date as an input for a date field
//WebUI.setText(findTestObject('YourTestObjectPath/DateField'), randomDate)
// Convert the LocalDate to a String, because most WebUI interactions will need it in this format
WebUI.setText(findTestObject('Object Repository/cree_even_dates/date_surv'), randomDateString)

WebUI.setText(findTestObject('Object Repository/cree_even_dates/date_rec'), randomDateString)

WebUI.setText(findTestObject('Object Repository/cree_even_dates/date_pub'), randomDateString)

int R1 = 10 + ((Math.random() * 11 // For a random number between 10 and 20
    ) as int)

int R2 = 30 + ((Math.random() * 31 // For a random number between 30 and 60
    ) as int)

int R3 = 60 + ((Math.random() * 21 // For a random number between 60 and 80
    ) as int)

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/input_r1 (en )_ActeAdministratif.r1'), 
    '' + R1)

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/input_r2 (en )_ActeAdministratif.r2'), 
    '' + R2)

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/input_r3 (en )_ActeAdministratif.r3'), 
    '' + R3)

String inputValue = WebUI.getAttribute(findTestObject('Object Repository/EVEN_DEF_CREE/input_Rfrence EVCAT_a_capturer'), 
    'value')

GlobalVariable.captureValue = inputValue

WebUI.scrollToElement(findTestObject('Object Repository/cree_even_dates/date_pub'), 1)

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/div_Slectionner'))

WebUI.click(findTestObject('A_TIRE_F_ - Copy/li_for_even/li_Tremblement_terre'))

WebUI.scrollToElement(findTestObject('Object Repository/Crée_even_besion_H/Page_Gestion des venements  Edition/input_r3 (en )_Evenement.ActeAdministratif.r3'), 
    1)

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/reg_Slectionner'))

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/REG_li_Bni Mellal-Khnifra'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/pro_Slectionner'))

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/PROV_li_Beni Mellal'))

WebUI.scrollToElement(findTestObject('Object Repository/EVEN_DEF_CREE/reg_Slectionner'), 1)

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/commune_Slectionner'))

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/COM_li_bni mellal'))

WebUI.scrollToElement(findTestObject('Object Repository/Crée_even_besion_H/Page_Gestion des venements  Edition/input_r3 (en )_Evenement.ActeAdministratif.r3'), 
    1)

WebUI.click(findTestObject('Object Repository/EVEN_DEF_CREE/code_Slectionner'))

WebUI.click(findTestObject('EVEN_DEF_CREE/li_MAR_BEM'))

WebUI.click(findTestObject('Object Repository/Cree_even_Ville_rech_first/Page_Gestion des venements  Cration/vill_Slectionner'))

WebUI.setText(findTestObject('Object Repository/Cree_even_Ville_rech_first/Page_Gestion des venements  Cration/input_Slectionner_search-input'), 
    'BENI MELLAL')

WebUI.click(findTestObject('Object Repository/Cree_even_Ville_rech_first/Page_Gestion des venements  Cration/First_element'))

//WebUI.rightClick(findTestObject('Object Repository/even_definitive/Page_Gestion des venements  Cration/label_Parcourir'))
WebUI.scrollToElement(findTestObject('Object Repository/Crée_even_besion_H/Page_Gestion des venements  Edition/label_Parcourir'), 
    1 // Get today's date
    )

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Cration/button_Enregistrer'))

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Administration - Gestion des vnements/a_Consultation  Modification des vnements'))

WebUI.setText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Consultation/input_Rfrence EVCAT (provisoire dfinitive)_MotCle'), 
    inputValue)

WebUI.click(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Consultation/button_Chercher'))

WebUI.verifyElementText(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Consultation/td_AC'), 
    inputValue)

WebUI.verifyElementPresent(findTestObject('Object Repository/Modifi_even_reche_present/Page_Gestion des venements  Consultation/td_AC'), 
    0)

WebUI.closeBrowser()

def generateRandomName() {
    return RandomStringUtils.randomAlphabetic(2).capitalize()
}

def generateRandomDateString() {
    long minDay = LocalDate.now().minusDays(4).toEpochDay()

    long maxDay = LocalDate.now().toEpochDay()

    long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay)

    LocalDate randomDate = LocalDate.ofEpochDay(randomDay)

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd/MM/yyyy')

    String formattedDate = randomDate.format(formatter)

    return formattedDate
}

