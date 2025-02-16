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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Login/btn_Login'), 10)

WebUI.setText(findTestObject('Login/field_Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Login/field_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Section Catalog/header_container'), 10)

WebUI.click(findTestObject('Object Repository/Section Catalog/btn_product backpack'))

WebUI.verifyElementText(findTestObject('Section Catalog/icon_cart'), '1')

WebUI.click(findTestObject('Section Catalog/icon_cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Section Cart/txt_inventory item name'), 'Sauce Labs Backpack')

'======================================= CHECKOUT ======================================='

WebUI.click(findTestObject('Section Cart/btn_Checkout'))

WebUI.setText(findTestObject('Section Checkout/Checkout Information/field_FirstName'), 'Bootcamp')

WebUI.setText(findTestObject('Section Checkout/Checkout Information/field_LastName'), 'Dans')

WebUI.setText(findTestObject('Section Checkout/Checkout Information/field_PostalCode'), '13330')

WebUI.click(findTestObject('Section Checkout/Checkout Information/btn_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Section Cart/txt_inventory item name'), 'Sauce Labs Backpack')

WebUI.click(findTestObject('Section Checkout/btn_Finish'))

WebUI.scrollToElement(findTestObject('Section Catalog/header_container'), 3)

WebUI.verifyElementPresent(findTestObject('Section Catalog/container_checkout complete'), 3)
