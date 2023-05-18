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

WebUI.setText(findTestObject('Object Repository/Page_CAT - Authentification/input_Connexion_Input.Login (1)'), 'cat@cat.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CAT - Authentification/input_Connexion_Input.Password (1)'), 
    'R7+G68P4LMrw4PaWyLZvYQ==')

WebUI.click(findTestObject('Object Repository/Page_CAT - Authentification/button_Connexion (1)'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de gestion des sinistres li_05fe44/a_Gestion des dossiers sinistres'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de gestion des sinistres li_05fe44/a_Ouverture des dossiers sinistres'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/RfrenceEVCAT_Slectionner'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Test-1304'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/type_doc_Slectionner'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Dclaration'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/span_Vhicule_checkmark'))

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Police'), '112233')

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Attestation'), 
    '556677')

WebUI.scrollToElement(findTestObject('Page_Gestion des dossiers sinistres/Format_imm_Slectionner'), 1)

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/Format_imm_Slectionner'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_Arabe'))

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__N_Immatriculation'), 
    '34232-D213')

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/textarea__Adresse'), 
    'TESTING ADRESS')

WebUI.sendKeys(findTestObject('les_cas_a_chocher_et_la_date/input__DateDemande'), '16/05/2023')

WebUI.sendKeys(findTestObject('les_cas_a_chocher_et_la_date/input__DateSinistre'), '13/05/2023')

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input_Ville sinistre_checkbox'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/ville_a_remplir'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_AGADIR'))

WebUI.click(findTestObject('les_cas_a_chocher_et_la_date/input_Commune sinistre_checkbox'))

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres/commune_a_remplir'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_rass oumlil'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/button_Continuer'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.Nom'), 
    1)

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.Nom'), 
    'MOURAD')

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.Prenom'), 
    'HASMIDI')

WebUI.scrollToElement(findTestObject('ZZ_Page_Gestion des dossiers sinistres_ZZ/scrollTo'), 1)

WebUI.click(findTestObject('Page_Gestion des dossiers sinistres_etape2/Type_document_identit'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/li_CNIE'))

WebUI.click(findTestObject('ZZ_Page_Gestion des dossiers sinistres_ZZ/Qualite'))

WebUI.click(findTestObject('ZZ_Page_Gestion des dossiers sinistres_ZZ/li_Assur'))

WebUI.click(findTestObject('Z_inter/inter'))

WebUI.click(findTestObject('ZZ_Page_Gestion des dossiers sinistres_ZZ/li_A1001_NOM_inter'))

/*WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.N_Type_Doc'))

WebUI.click(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/div_Type du document didentit              _5a9f8a'))
*/
'à change'
int RN = ((Math.random() * 99) as int)

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Declarant.N_Type_Doc'), 
    'NZ54'+ RN + RN)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDeclaration'), 
    1)

WebUI.uploadFile(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDeclaration'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

//WebUI.uploadFile(findTedstObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDeclaration'), 'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')
WebUI.uploadFile(findTestObject('Page_Gestion des dossiers_telecharger_test/tele_Attachement.FichierDeclaration'), 'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.uploadFile(findTestObject('Z_inter/label_Parcourir'), 'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

/*WebUI.setText(findTestObject('Page_Gestion des dossiers_telecharger_test/tele_Attachement.FichierDeclaration'), 'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')

WebUI.setText(findTestObject('Object Repository/Page_Gestion des dossiers sinistres - Ouver_cd5ce2/input__Attachement.FichierDeclaration'), 
    'C:\\Users\\atahiri\\Downloads\\Test plate forme.pdf')*/
WebUI.click(findTestObject('Page_Gestion des dossiers_telecharger_test/button_Enregistrer le brouillon'))

WebUI.verifyElementPresent(findTestObject('Page_Gestion des dossiers sinistres - Ouver_cd5ce2/div_Success'), 1)

WebUI.closeBrowser()

