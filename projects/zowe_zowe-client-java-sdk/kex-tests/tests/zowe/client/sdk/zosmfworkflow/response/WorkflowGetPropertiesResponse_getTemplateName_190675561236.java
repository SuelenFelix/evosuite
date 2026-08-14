package zowe.client.sdk.zosmfworkflow.response;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class WorkflowGetPropertiesResponse_getTemplateName_190675561236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32656;

    public WorkflowGetPropertiesResponse_getTemplateName_190675561236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32837 = new Integer(1193880199);
        Boolean term32839 = new Boolean(false);
        Boolean term32841 = new Boolean(false);
        Boolean term32867 = new Boolean(true);
        Long term32882 = new Long(305759998609888272L);
        Long term32884 = new Long(-8654565919063661957L);
        Boolean term32946 = new Boolean(true);
        ArrayList term33104 = new ArrayList();
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        ((ArrayList) term33104).add((Object)null);
        Object term33110 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33110, term33110.getClass(), "name", "");
        setField(term33110, term33110.getClass(), "scope", "");
        setField(term33110, term33110.getClass(), "type", "");
        setField(term33110, term33110.getClass(), "value", "");
        setField(term33110, term33110.getClass(), "visibility", "");
        Object term33116 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33116, term33116.getClass(), "name", "");
        setField(term33116, term33116.getClass(), "scope", "");
        setField(term33116, term33116.getClass(), "type", "");
        setField(term33116, term33116.getClass(), "value", "");
        setField(term33116, term33116.getClass(), "visibility", "");
        Object term33122 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33122, term33122.getClass(), "name", "");
        setField(term33122, term33122.getClass(), "scope", "");
        setField(term33122, term33122.getClass(), "type", "");
        setField(term33122, term33122.getClass(), "value", "");
        setField(term33122, term33122.getClass(), "visibility", "");
        Object term33128 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33128, term33128.getClass(), "name", "");
        setField(term33128, term33128.getClass(), "scope", "");
        setField(term33128, term33128.getClass(), "type", "");
        setField(term33128, term33128.getClass(), "value", "");
        setField(term33128, term33128.getClass(), "visibility", "");
        Object term33134 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33134, term33134.getClass(), "name", "");
        setField(term33134, term33134.getClass(), "scope", "");
        setField(term33134, term33134.getClass(), "type", "");
        setField(term33134, term33134.getClass(), "value", "");
        setField(term33134, term33134.getClass(), "visibility", "");
        Object term33140 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33140, term33140.getClass(), "name", "");
        setField(term33140, term33140.getClass(), "scope", "");
        setField(term33140, term33140.getClass(), "type", "");
        setField(term33140, term33140.getClass(), "value", "");
        setField(term33140, term33140.getClass(), "visibility", "");
        Object term33146 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33146, term33146.getClass(), "name", "");
        setField(term33146, term33146.getClass(), "scope", "");
        setField(term33146, term33146.getClass(), "type", "");
        setField(term33146, term33146.getClass(), "value", "");
        setField(term33146, term33146.getClass(), "visibility", "");
        Object term33152 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33152, term33152.getClass(), "name", "");
        setField(term33152, term33152.getClass(), "scope", "");
        setField(term33152, term33152.getClass(), "type", "");
        setField(term33152, term33152.getClass(), "value", "");
        setField(term33152, term33152.getClass(), "visibility", "");
        ArrayList term33108 = new ArrayList();
        ((ArrayList) term33108).add(term33110);
        ((ArrayList) term33108).add(term33116);
        ((ArrayList) term33108).add(term33122);
        ((ArrayList) term33108).add(term33128);
        ((ArrayList) term33108).add(term33134);
        ((ArrayList) term33108).add(term33140);
        ((ArrayList) term33108).add(term33146);
        ((ArrayList) term33108).add(term33152);
        term32656 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term32869 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term32656, term32656.getClass(), "workflowName", "HcfabJkuEQ");
        setField(term32656, term32656.getClass(), "workflowKey", "JlnoFYxLfk");
        setField(term32656, term32656.getClass(), "workflowDescription", "tMMLkDkFYW");
        setField(term32656, term32656.getClass(), "workflowID", "EYJXMlkLoO");
        setField(term32656, term32656.getClass(), "workflowVersion", "qJtkJJhOSV");
        setField(term32656, term32656.getClass(), "workflowDefinitionFileMD5Value", "vQbiGKncal");
        setField(term32656, term32656.getClass(), "vendor", "NTSNSiYeUu");
        setField(term32656, term32656.getClass(), "owner", "SBTEFDmQVY");
        setField(term32656, term32656.getClass(), "workflowArchiveSAFID", "ohZpRiNDZM");
        setField(term32656, term32656.getClass(), "system", "qEXIxhmUwz");
        setField(term32656, term32656.getClass(), "jobsOutputDirectory", "RlyxtfCqKY");
        setField(term32656, term32656.getClass(), "category", "kyTUkLCRYm");
        setField(term32656, term32656.getClass(), "productID", "oAotZgNUFH");
        setField(term32656, term32656.getClass(), "productName", "TowhQcovXu");
        setField(term32656, term32656.getClass(), "productVersion", "UFGOnIMOzf");
        setField(term32656, term32656.getClass(), "percentComplete", term32837);
        setField(term32656, term32656.getClass(), "isCallable", term32839);
        setField(term32656, term32656.getClass(), "containsParallelSteps", term32841);
        setField(term32656, term32656.getClass(), "scope", "ySiyRlAQpt");
        setField(term32656, term32656.getClass(), "statusName", "MiankJgKCp");
        setField(term32656, term32656.getClass(), "deleteCompletedJobs", term32867);
        setField(term32869, term32869.getClass(), "startUser", "lmZBCmpOeb");
        setField(term32869, term32869.getClass(), "startedTime", term32882);
        setField(term32869, term32869.getClass(), "stoppedTime", term32884);
        setField(term32869, term32869.getClass(), "currentStepName", "cPlYOAUqsP");
        setField(term32869, term32869.getClass(), "currentStepNumber", "ritBUyuuKt");
        setField(term32869, term32869.getClass(), "currentStepTitle", "YfziBBiPvL");
        setField(term32869, term32869.getClass(), "messageID", "lNBaHEkYui");
        setField(term32869, term32869.getClass(), "messageText", "BqxRCYZwmn");
        setField(term32656, term32656.getClass(), "automationStatus", term32869);
        setField(term32656, term32656.getClass(), "autoDeleteOnCompletion", term32946);
        setField(term32656, term32656.getClass(), "access", "KHPDZjrXQp");
        setField(term32656, term32656.getClass(), "accountInfo", "fpyUFzdCwQ");
        setField(term32656, term32656.getClass(), "jobStatement", "OQqBkSGDem");
        setField(term32656, term32656.getClass(), "templateID", "vZzZOvsIYn");
        setField(term32656, term32656.getClass(), "actionID", "pAIBwhAbDu");
        setField(term32656, term32656.getClass(), "registryID", "iqhNUjVbRG");
        setField(term32656, term32656.getClass(), "parentRegistryID", "SSqIrPwJXd");
        setField(term32656, term32656.getClass(), "domainID", "jAxYagPvcV");
        setField(term32656, term32656.getClass(), "tenantID", "ZXLgGUqgyW");
        setField(term32656, term32656.getClass(), "softwareServiceInstanceName", "PdeSzTcBgY");
        setField(term32656, term32656.getClass(), "templateName", "PmSvMYNoIS");
        setField(term32656, term32656.getClass(), "globalVariableGroup", "zejWtMxJdV");
        setField(term32656, term32656.getClass(), "isInstanceVariableWithoutPrefix", "YUIUZeZiMK");
        setField(term32656, term32656.getClass(), "steps", term33104);
        setField(term32656, term32656.getClass(), "variables", term33108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateName", argTypes, term32656, args);
    }

};


