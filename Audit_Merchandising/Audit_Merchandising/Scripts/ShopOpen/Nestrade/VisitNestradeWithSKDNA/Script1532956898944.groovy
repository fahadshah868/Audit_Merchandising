import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.ct.qa.constants.ProjectConstants
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'validate shop\'s category detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_MainCategoryDetailScreen' , [('package') : ProjectConstants.PACKAGENAME]), 
    'Display Space Available')

'tap on "Shopkeeper did not Allow"'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/ShopKeeperDidNotAllow' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate category remarks screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_CategoryRemarksScreen' , [('package') : ProjectConstants.PACKAGENAME]), 'CATEGORY REMARKS')

'tap on category remark'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/CategoryRemarks_ExpiryIssue' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'tap on back button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/CategoryRemarks_BackButton' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate shop\'s category detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_MainCategoryDetailScreen' , [('package') : ProjectConstants.PACKAGENAME]), 
    'Display Space Available')

'tap on back button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/RemainingCategory_BackButton' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate shop\'s categories screen appearance'
MobileBuiltInKeywords.verifyElementExist(findTestObject('ShopOpen/Validate_ShopCategoriesListScreen' , [('package') : ProjectConstants.PACKAGENAME]), 0)

