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
import java.time.*
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.concurrent.ThreadLocalRandom as ThreadLocalRandom
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.time.temporal.ChronoUnit as ChronoUnit
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://catback.eastus.cloudapp.azure.com/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'GestCIE1')

WebUI.setEncryptedText(findTestObject('Object Repository/DECLARATION_RES/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    'cYkJfdYHDgXWT+JqTfP1Ow==')

WebUI.click(findTestObject('gt_param/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des dossiers sinistres'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Plateforme de gestion des sinistres li_05fe44/a_Ouverture des dossiers sinistres'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/div_Slectionner'))

WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Slectionner_search-input'), 
    '' + GlobalVariable.captureValue)

/*WebUI.setText(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Slectionner_search-input'), 
    'AC')*/

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_AC'))

WebUI.click(findTestObject('B_houda_demande_element/type_doc_Slectionner'))

WebUI.click(findTestObject('DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Demande dindemnisation'))

WebUI.click(findTestObject('A_Page_Gestion des dossiers sinistres -Radio button_Res/input_Rsidentiel_Type_Dommage_Id'))

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Police'), 
    GlobalVariable.Police)

WebUI.scrollToElement(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Police'), 
    1)

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_IF'), 
    GlobalVariable.i_fiscal)

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_TF'), 
    GlobalVariable.tireF)

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/a_Identification de la dclaration'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/span_YSODCA TgLZBRjV_checkmark'))

String td_attribut_ref = WebUI.getText(findTestObject('get_test_for_dossier_refrence/td_KI90DC1_MAT'))

println(td_attribut_ref)

WebUI.scrollToElement(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Continuer'), 
    1)

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Continuer'))

String Name = generateRandomFirstName()

String LastName = generateRandomLastName()

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Nom'), 
    Name)

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Prenom'), 
    LastName)

WebUI.click(findTestObject('AAAA_element_demande_ind/type_doc_iden'))

'ce element c pour selection CINE pour permettre d\'ecrire en format CIN'
WebUI.click(findTestObject('DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Hg92'))

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.N_Type_Doc'), 
    'DD23456')

WebUI.scrollToElement(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Prenom'), 
    1)

int R5 = 11111 + ((Math.random() * 99999) as int)

int R4 = 0 + ((Math.random() * 999) as int)

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Demandeur.Gsm'), 
    ('06' + R5) + R4)

WebUI.click(findTestObject('AAAA_element_demande_ind/Qualiter_assur'))

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Assur'))

WebUI.scrollToElement(findTestObject('AAAA_element_demande_ind/Qualiter_assur'), 1)

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Assure.Email'), 
    ((Name + '@') + LastName) + '.com')

WebUI.setText(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/textarea__Assure.Adresse'), 
    'RES TEST APRT TEST à&')

WebUI.setText(findTestObject('gestion_doss_sini_assur_gsm/input__Assure.Gsm'), ('06' + R5) + R4)

'ce element est la list déroulant de Code intermédiaire et pas la nationalité'
WebUI.click(findTestObject('AAAA_element_demande_ind/nationaliter_Marocaine'))

WebUI.scrollToElement(findTestObject('AAAA_element_demande_ind/nationaliter_Marocaine'), 0)

WebUI.click(findTestObject('Object Repository/declaration_B_H/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_A1009  ASMA ASSURANCES'))

WebUI.scrollToElement(findTestObject('Page_Gestion des dossiers sinistre_res_inde_telecharger/input__Attachement.FichierContratAssuranceResidence'), 
    1)

WebUI.uploadFile(findTestObject('Page_Gestion des dossiers sinistre_res_inde_telecharger/input__Attachement.FichierContratAssuranceResidence'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Page_Gestion des dossiers sinistre_res_inde_telecharger/input__Attachement.FichierDemandeIndemnisation'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Page_Gestion des dossiers sinistre_res_inde_telecharger/input__Attachement.FichierIdentiteDemandeur'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Page_Gestion des dossiers sinistre_res_inde_telecharger/input__Attachement.FichierTitreFoncier'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Sauvegarder et Publier'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/div_SuccessLa demande dindeminisation avec _34d358'), 
    0)

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/a_Consultation  Modification  Validation de_2cd3a9'))

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Consu_890a40/h3_Filtre de recherche'))

WebUI.click(findTestObject('A_Gestion des dossiers sinistres - Consu_Modi_Validation/Ref_select_cons_modi'))

WebUI.setText(findTestObject('A_Gestion des dossiers sinistres - Consu_Modi_Validation/input_Choisissez une option_search-input'), 
    '' + GlobalVariable.captureValue)

WebUI.click(findTestObject('A_Gestion des dossiers sinistres - Consu_Modi_Validation/First_li'))

WebUI.setText(findTestObject('gestion_doss_sinis_filtre_element_avec_detail_plus/input_N de police_N_PoliceFilter'), GlobalVariable.Police)

WebUI.click(findTestObject('gestion_doss_sinis_filtre_element_avec_detail_plus/input_Rsidentiel_Type_Dommage_Id'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('gestion_doss_sinis_filtre_element_avec_detail_plus/input_Rsidentiel_Type_Dommage_Id'), 
    1)

WebUI.click(findTestObject('Object Repository/DECLARATION_RES/Page_Gestion des dossiers sinistres - Consu_890a40/button_Filtrer'))


WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.cssSelector("td[data-title='Type du document']"))


for (WebElement element : elements) {
    String text = element.getText()
	println(element.getText())
    // Perform your check on the text here, such as:
    if (text.contains("Demande")) {
        assert true
		break
    }else {
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

