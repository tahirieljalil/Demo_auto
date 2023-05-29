package customKeywords
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject

public class ScrollAndClick {

	@Keyword
	def scrollToAndClick(TestObject to) {
		WebUI.scrollToElement(to, 2) // adjust the timeout as needed
		WebUI.click(to)
	}
}