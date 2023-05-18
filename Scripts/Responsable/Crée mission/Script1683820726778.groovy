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

WebUI.setText(findTestObject('Object Repository/Mission_create/Page_CAT - Authentification/input_Connexion_Input.Login'), 
    'RespCAT')

WebUI.setEncryptedText(findTestObject('Object Repository/Mission_create/Page_CAT - Authentification/input_Connexion_Input.Password'), 
    '9p0OJkwRdEnnUc/eaSo5Xw==')

WebUI.click(findTestObject('Object Repository/Mission_create/Page_CAT - Authentification/button_Connexion'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_Plateforme de gestion des sinistres li_05fe44/a_Mission dexpertise'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_Plateforme de gestion des sinistres li_05fe44/a_Cration dune mission'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_/div_Slectionner'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_/li_D.EVCAT15032022DC12_MAT82DM2'))

WebUI.click(findTestObject('Page_mission_demo/sp_Slectionner'))

WebUI.click(findTestObject('Page_mission_demo/cree_mission_li_Expert Automobile'))

WebUI.click(findTestObject('Page_ref/ref_Slectionner'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_/li_Expert Automobile (MAT)'))

WebUI.scrollToElement(findTestObject('creation mission/Page_/div_AGADIR'), 1)

WebUI.click(findTestObject('Page_/div_AGADIR'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_/li_AIT OURIR'))

WebUI.click(findTestObject('Object Repository/Mission_create/Page_/button_Crer'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Mission_create/Page_/td_D.EVCAT15032022DC12_MAT82DM2'), 0)

WebUI.closeBrowser()

