package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : url for ptk021
Profile staging : url for ptk021
Profile test : url for ptk021</p>
     */
    public static Object ptk021
     
    /**
     * <p>Profile default : url for vig999
Profile test : url for vig999</p>
     */
    public static Object vig999
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            ptk021 = selectedVariables['ptk021']
            vig999 = selectedVariables['vig999']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
