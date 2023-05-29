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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.time.temporal.ChronoUnit as ChronoUnit
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'GestCIE1')

WebUI.setEncryptedText(findTestObject('Object Repository/declaration_B_H/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'cYkJfdYHDgXWT+JqTfP1Ow==')

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des dossiers sinistres'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Plateforme de gestion des sinistres li_05fe44/a_Ouverture des dossiers sinistres'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/div_Slectionner'))

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Slectionner_search-input'), 
    '' + GlobalVariable.captureValue)

/*WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Slectionner_search-input'),
	'AC')*/
WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_AC'))

int R1 = 10 + ((Math.random() * 11 // For a random number between 10 and 20
    ) as int)

int R2 = 30 + ((Math.random() * 31 // For a random number between 30 and 60
    ) as int)

int R3 = 60 + ((Math.random() * 21 // For a random number between 60 and 80
    ) as int)

String random = generateRandomName()

String randomstring = random.toString().toUpperCase()

WebUI.click(findTestObject('B_houda_demande_element/type_doc_Slectionner'))

WebUI.click(findTestObject('declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Demande dindemnisation'))

WebUI.click(findTestObject('declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Remorque_Type_Dommage_Id'))

WebUI.click(findTestObject('1_veh_iden_manquant/type_garantie'))

WebUI.click(findTestObject('1_Page_Gestion des dossiers sinistres_veh_iden_manquant/li_RC'))

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Police'), 
    GlobalVariable.Police)

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Attestation'), 
    GlobalVariable.attestion)

WebUI.scrollToElement(findTestObject('B_houda_demande_element/lang_Slectionner'), 1)

WebUI.click(findTestObject('B_houda_demande_element/lang_Slectionner'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/li_Arabe'))

//WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Immatriculatio'),IMMStr)
WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Immatriculation'), 
    GlobalVariable.matricule)

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/a_Identification de la dclaration'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/span_YSODCA TgLZBRjV_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Continuer'), 
    1)

WebUI.click(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Continuer'))

String Name = generateRandomFirstName()

String FirstName = generateRandomLastName()

WebUI.setText(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Nom'), 
    Name)

WebUI.setText(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Prenom'), 
    FirstName)

WebUI.scrollToElement(findTestObject('vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Prenom'), 
    1)

WebUI.click(findTestObject('1_Page_Gestion des dossiers sinistres_veh_iden_manquant/type_doc_inde'))

WebUI.click(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_CNIE'))

String CIN = generateRandomName()

WebUI.setText(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.N_Type_Doc'), 
    ((CIN + R3) + R1) + R2)

WebUI.setText(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Gsm'), 
    ((('06' + R3) + R1) + R2) + R1)

WebUI.scrollToElement(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Gsm'), 
    1)

WebUI.click(findTestObject('1_veh_iden_manquant/qualite_veh_iden'))

WebUI.click(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Assur'))

WebUI.setText(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Assure.Email'), 
    ((Name + '@') + FirstName) + '.com')

WebUI.setText(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/textarea__Assure.Adresse'), 
    'res test imm testing aprt test')

WebUI.scrollToElement(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/textarea__Assure.Adresse'), 
    1)

WebUI.click(findTestObject('1_Page_Gestion des dossiers sinistres_veh_iden_manquant/code_inte'))

WebUI.click(findTestObject('1_Page_Gestion des dossiers sinistres_veh_iden_manquant/li_A1009  ASMA ASSURANCES'))

WebUI.scrollToElement(findTestObject('1_Page_Gestion des dossiers sinistres_veh_iden_manquant/code_inte'), 1)

WebUI.uploadFile(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDemandeIndemnisation'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierCarteGriseVehicule'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierContratAssuranceVehicule'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierIdentiteAssure'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('1_A_Page_Gestion des dossiers sinistres - download_fiche_remoque/input__Attachement.FichierContratAssuranceRemorque'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('1_A_Page_Gestion des dossiers sinistres - download_fiche_remoque/input_concat(Document d, , identit du souscripteur)_Attachement.FichierIdentiteSouscripteur'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('1_A_Page_Gestion des dossiers sinistres - download_fiche_remoque/input__Attachement.FichierCarteGriseRemorque'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.scrollToElement(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Sauvegarder et Publier'), 
    0)

WebUI.click(findTestObject('Object Repository/vehicule_for_inde/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Sauvegarder et Publier'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/a_Consultation  Modification  Validation de_2cd3a9'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Consu_890a40/h3_Filtre de recherche'))

WebUI.click(findTestObject('A_Gestion des dossiers sinistres - Consu_Modi_Validation/Ref_select_cons_modi'))

WebUI.setText(findTestObject('A_Gestion des dossiers sinistres - Consu_Modi_Validation/input_Choisissez une option_search-input'), 
    '' + GlobalVariable.captureValue)

WebUI.click(findTestObject('A_Gestion des dossiers sinistres - Consu_Modi_Validation/First_li'))

WebUI.scrollToElement(findTestObject('declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Remorque_Type_Dommage_Id'), 
    1)

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Consu_890a40/button_Filtrer'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.cssSelector('td[data-title=\'Type du document\']'))

for (WebElement element : elements) {
    String text = element.getText()

    println(element.getText())

    // check the text 
    if (text.contains('Demande')) {
        assert true

        break
    } else {
        assert false
    }
}

WebUI.closeBrowser()

def generateRandomFirstName() {
    return RandomStringUtils.randomAlphabetic(6).capitalize()
}

def generateRandomLastName() {
    return RandomStringUtils.randomAlphabetic(8).capitalize()
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

def generateRandomName() {
    return RandomStringUtils.randomAlphabetic(2).capitalize()
}

def generateRandomLettre() {
    return RandomStringUtils.randomAlphabetic(2).capitalize()
}

