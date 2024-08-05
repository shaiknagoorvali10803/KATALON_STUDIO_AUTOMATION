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

/*
 * response = WS.sendRequest(findTestObject('COUNTRYCODE/SOAP
 * Service/CountryInfoServiceSoapBinding/FullCountryInfo', [('isoCode') :
 * isoCode , ('language') : language, ('currencyIsoCode') : currencyIsoCode,
 * ('phoneCode') : phoneCode, ('capital') : capital , ('countryName') :
 * countryName]))
 */

response = WS.sendRequest(findTestObject('COUNTRYCODE/SOAP Service/CountryInfoServiceSoapBinding/FullCountryInfo', [('isoCode') : isoCode]))

println(response.getResponseText())

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementText(response, 'FullCountryInfoResponse.FullCountryInfoResult.Languages.tLanguage.sName', language)

WS.verifyElementText(response, 'FullCountryInfoResponse.FullCountryInfoResult.sCurrencyISOCode', currencyIsoCode)

WS.verifyElementText(response, 'FullCountryInfoResponse.FullCountryInfoResult.sPhoneCode', phoneCode)

WS.verifyElementText(response, 'FullCountryInfoResponse.FullCountryInfoResult.sCapitalCity', capital)

WS.verifyElementText(response, 'FullCountryInfoResponse.FullCountryInfoResult.sName', countryName)

