package katalon.truetest

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class TrueTestScripts {
    
    public static void login() {
        try {
            TestObject inputUsername = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@name='username']")
            TestObject inputPassword = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@name='password']")
            TestObject btnLogin = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@type='submit']")
            
            WebUI.waitForElementVisible(inputUsername, 0)
            WebUI.setText(inputUsername, "locnguyent3108", FailureHandling.CONTINUE_ON_FAILURE)
            WebUI.setText(inputPassword, "Auvjdaj1992@", FailureHandling.CONTINUE_ON_FAILURE)
            WebUI.enhancedClick(btnLogin, FailureHandling.CONTINUE_ON_FAILURE)
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
}


