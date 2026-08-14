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

public class WorkflowGetPropertiesResponse_getAutomationStatus_24164670524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22726;

    public WorkflowGetPropertiesResponse_getAutomationStatus_24164670524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22907 = new Integer(-2068769794);
        Boolean term22909 = new Boolean(false);
        Boolean term22911 = new Boolean(true);
        Boolean term22937 = new Boolean(true);
        Long term22952 = new Long(4784595517102746672L);
        Long term22954 = new Long(-7612550318181586304L);
        Boolean term23016 = new Boolean(true);
        ArrayList term23174 = new ArrayList();
        ((ArrayList) term23174).add((Object)null);
        ((ArrayList) term23174).add((Object)null);
        ((ArrayList) term23174).add((Object)null);
        ((ArrayList) term23174).add((Object)null);
        ((ArrayList) term23174).add((Object)null);
        ((ArrayList) term23174).add((Object)null);
        ((ArrayList) term23174).add((Object)null);
        Object term23180 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term23180, term23180.getClass(), "name", "");
        setField(term23180, term23180.getClass(), "scope", "");
        setField(term23180, term23180.getClass(), "type", "");
        setField(term23180, term23180.getClass(), "value", "");
        setField(term23180, term23180.getClass(), "visibility", "");
        ArrayList term23178 = new ArrayList();
        ((ArrayList) term23178).add(term23180);
        term22726 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term22939 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term22726, term22726.getClass(), "workflowName", "otxkkKfDfl");
        setField(term22726, term22726.getClass(), "workflowKey", "bqIuFFFwnP");
        setField(term22726, term22726.getClass(), "workflowDescription", "hDxvvVgGlk");
        setField(term22726, term22726.getClass(), "workflowID", "XdjSvjaTqk");
        setField(term22726, term22726.getClass(), "workflowVersion", "ukrlYVcvsg");
        setField(term22726, term22726.getClass(), "workflowDefinitionFileMD5Value", "cpjqTCNflQ");
        setField(term22726, term22726.getClass(), "vendor", "wiYGATEfmw");
        setField(term22726, term22726.getClass(), "owner", "FiALSqneIg");
        setField(term22726, term22726.getClass(), "workflowArchiveSAFID", "lGVACSQceQ");
        setField(term22726, term22726.getClass(), "system", "jpgWRbSvyQ");
        setField(term22726, term22726.getClass(), "jobsOutputDirectory", "tFMlYmPEBX");
        setField(term22726, term22726.getClass(), "category", "ljkZxGNgjZ");
        setField(term22726, term22726.getClass(), "productID", "hrFtgdcZKS");
        setField(term22726, term22726.getClass(), "productName", "ZhZJvpPaTU");
        setField(term22726, term22726.getClass(), "productVersion", "NZwUsJxDLI");
        setField(term22726, term22726.getClass(), "percentComplete", term22907);
        setField(term22726, term22726.getClass(), "isCallable", term22909);
        setField(term22726, term22726.getClass(), "containsParallelSteps", term22911);
        setField(term22726, term22726.getClass(), "scope", "wlusYBOfXW");
        setField(term22726, term22726.getClass(), "statusName", "HEWWLhfKIa");
        setField(term22726, term22726.getClass(), "deleteCompletedJobs", term22937);
        setField(term22939, term22939.getClass(), "startUser", "mJJkYzNPob");
        setField(term22939, term22939.getClass(), "startedTime", term22952);
        setField(term22939, term22939.getClass(), "stoppedTime", term22954);
        setField(term22939, term22939.getClass(), "currentStepName", "mRDwekkZQg");
        setField(term22939, term22939.getClass(), "currentStepNumber", "RIGChgqpTI");
        setField(term22939, term22939.getClass(), "currentStepTitle", "YCrgXnhgoK");
        setField(term22939, term22939.getClass(), "messageID", "nQodIeQekM");
        setField(term22939, term22939.getClass(), "messageText", "YXORpHCDcd");
        setField(term22726, term22726.getClass(), "automationStatus", term22939);
        setField(term22726, term22726.getClass(), "autoDeleteOnCompletion", term23016);
        setField(term22726, term22726.getClass(), "access", "XzZbAcRADD");
        setField(term22726, term22726.getClass(), "accountInfo", "UqSNWSoTRy");
        setField(term22726, term22726.getClass(), "jobStatement", "VesRqDfjMa");
        setField(term22726, term22726.getClass(), "templateID", "AQTTebOiZR");
        setField(term22726, term22726.getClass(), "actionID", "mgeIhswNtk");
        setField(term22726, term22726.getClass(), "registryID", "QwKYpiVQlL");
        setField(term22726, term22726.getClass(), "parentRegistryID", "kSGsHNQQoW");
        setField(term22726, term22726.getClass(), "domainID", "MWezlyjdaG");
        setField(term22726, term22726.getClass(), "tenantID", "drpBJuEKQG");
        setField(term22726, term22726.getClass(), "softwareServiceInstanceName", "GGpORnLrOW");
        setField(term22726, term22726.getClass(), "templateName", "gDGZwlpOZx");
        setField(term22726, term22726.getClass(), "globalVariableGroup", "gkDpxkHPDg");
        setField(term22726, term22726.getClass(), "isInstanceVariableWithoutPrefix", "pADwkrWiMW");
        setField(term22726, term22726.getClass(), "steps", term23174);
        setField(term22726, term22726.getClass(), "variables", term23178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAutomationStatus", argTypes, term22726, args);
    }

};


