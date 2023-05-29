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
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.time.temporal.ChronoUnit as ChronoUnit

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

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/li_Dclaration'))

//WebUI.click(findTestObject('object_click_remoque/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Remorque_Type_Dommage_Id'))
WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/span_Vhicule_checkmark'))

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Police'), 
    (randomstring + R1) + R2)

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Attestation'), 
    (randomstring + R2) + R1)

String L = generateRandomLettre()

String LS = '-' + L.toString().toUpperCase()

int R4 = 1 + ((Math.random() * 9) as int)

WebUI.scrollToElement(findTestObject('B_houda_demande_element/lang_Slectionner'), 1)

WebUI.click(findTestObject('B_houda_demande_element/lang_Slectionner'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/li_Arabe'))

int R5 = 11111 + ((Math.random() * 99999) as int)

String Rstr = R5.toString()

//WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Immatriculatio'),IMMStr)
WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Immatriculation'), 
    ((R5 + LS) + R4) + R2)

String randomDate = generateRandomDateString()

String randomDateString = randomDate.toString()

//Give random Dates
WebUI.setText(findTestObject('B_houda_demande_element/input__DateDemande_dec'), randomDateString)

WebUI.setText(findTestObject('B_houda_demande_element/input__DateSinistre'), randomDateString)

WebUI.click(findTestObject('B_houda_demande_element/input_Ville sinistre_checkbox'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/ville_a_remplir'))

WebUI.click(findTestObject('B_houda_demande_element/select_li_AGADIR'))

WebUI.click(findTestObject('B_houda_demande_element/input_Commune sinistre_checkbox'))

WebUI.click(findTestObject('B_houda_demande_element/select_commune'))

WebUI.click(findTestObject('B_houda_demande_element/select_first_commune'))

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/textarea__Adresse'), 
    'tesldksfsdhfl')

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Continuer'))

String Doc = generateRandomDoc().toString().toUpperCase()

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_N CNIERC_GarantieVehicule.NCNIRC'), 
    ((Doc + R2) + R3) + R1)

WebUI.setText(findTestObject('B_houda_demande_element/input_Date dchance_GarantieVehicule.DateEcheance'), randomDateString)

String MinusDayStr = randomDateString.minus(1)

WebUI.setText(findTestObject('B_houda_demande_element/input_Date deffet_GarantieVehicule.DateEffet'), MinusDayStr.minus(
        1))

WebUI.setText(findTestObject('declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_concat(N portable de l, , assursouscr_4d4467'), 
    (('06' + R5) + R4) + R2)

String FirstName = generateRandomFirstName().toString()

String LastName = generateRandomLastName().toString()

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.Nom'), 
    FirstName)

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.Prenom'), 
    LastName)

WebUI.click(findTestObject('B_houda_demande_element/Select_typ_doc_aprs_enrg'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_CNIE'))

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.N_Type_Doc'), 
    ((Doc + R2) + R1) + R3)

WebUI.scrollToElement(findTestObject('B_houda_demande_element/Select_typ_doc_aprs_enrg'), 1)

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres_etape2/Qualit'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Assur'))

WebUI.click(findTestObject('B_houda_demande_element/select_nom_inter'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_A1009  ASMA ASSURANCES'))

WebUI.scrollToElement(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDeclaration'), 
    1)

WebUI.uploadFile(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDeclaration'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

/*WebUI.uploadFile(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/span_Parcourir'),
	'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')*/
//WebUI.rightClick(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/label_Parcourir'))
String IM = WebUI.getAttribute(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Immatriculation'), 
    'value')

String TypeDoc = WebUI.getAttribute(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.N_Type_Doc'), 
    'value')

String Police = WebUI.getAttribute(findTestObject('declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Police'), 
    'value')

String attes = WebUI.getAttribute(findTestObject('declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Attestation'), 
    'value')

println(IM)

println(Police)

println(attes)

GlobalVariable.attestion = attes

GlobalVariable.Police = Police

GlobalVariable.matricule = IM

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Sauvegarder et Publier'))

WebUI.verifyElementPresent(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/div_Success'), 
    0)

WebUI.closeBrowser()

def generateRandomName() {
    return RandomStringUtils.randomAlphabetic(2).capitalize()
}

def generateRandomLettre() {
    return RandomStringUtils.randomAlphabetic(2).capitalize()
}

def generateRandomDoc() {
    return RandomStringUtils.randomAlphabetic(2).capitalize()
}

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

