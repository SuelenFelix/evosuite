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

public class WorkflowGetPropertiesResponse_getContainsParallelSteps_211269632520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19372;

    public WorkflowGetPropertiesResponse_getContainsParallelSteps_211269632520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19553 = new Integer(1622346318);
        Boolean term19555 = new Boolean(false);
        Boolean term19557 = new Boolean(false);
        Boolean term19583 = new Boolean(false);
        Long term19598 = new Long(6617340557564669657L);
        Long term19600 = new Long(1439298019805881866L);
        Boolean term19662 = new Boolean(false);
        ArrayList term19820 = new ArrayList();
        ((ArrayList) term19820).add((Object)null);
        ((ArrayList) term19820).add((Object)null);
        ((ArrayList) term19820).add((Object)null);
        ((ArrayList) term19820).add((Object)null);
        ArrayList term19824 = new ArrayList();
        term19372 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term19585 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term19372, term19372.getClass(), "workflowName", "LFZNDELxUZ");
        setField(term19372, term19372.getClass(), "workflowKey", "GNIVsSTglt");
        setField(term19372, term19372.getClass(), "workflowDescription", "mzPebFiUSP");
        setField(term19372, term19372.getClass(), "workflowID", "HvbkjsQyDy");
        setField(term19372, term19372.getClass(), "workflowVersion", "wzSukELQFL");
        setField(term19372, term19372.getClass(), "workflowDefinitionFileMD5Value", "VZyeaOWYEj");
        setField(term19372, term19372.getClass(), "vendor", "PErxMBQSUv");
        setField(term19372, term19372.getClass(), "owner", "KZQwbvujui");
        setField(term19372, term19372.getClass(), "workflowArchiveSAFID", "JPUZuGxKlI");
        setField(term19372, term19372.getClass(), "system", "xqIbVsUspl");
        setField(term19372, term19372.getClass(), "jobsOutputDirectory", "GnjLRtJywq");
        setField(term19372, term19372.getClass(), "category", "TDaodpHTRK");
        setField(term19372, term19372.getClass(), "productID", "JayazbYDLK");
        setField(term19372, term19372.getClass(), "productName", "ORDuSTrpNA");
        setField(term19372, term19372.getClass(), "productVersion", "hysThIPoEJ");
        setField(term19372, term19372.getClass(), "percentComplete", term19553);
        setField(term19372, term19372.getClass(), "isCallable", term19555);
        setField(term19372, term19372.getClass(), "containsParallelSteps", term19557);
        setField(term19372, term19372.getClass(), "scope", "dfZepHfGwh");
        setField(term19372, term19372.getClass(), "statusName", "zjfMxUERFZ");
        setField(term19372, term19372.getClass(), "deleteCompletedJobs", term19583);
        setField(term19585, term19585.getClass(), "startUser", "ooVlhmiOff");
        setField(term19585, term19585.getClass(), "startedTime", term19598);
        setField(term19585, term19585.getClass(), "stoppedTime", term19600);
        setField(term19585, term19585.getClass(), "currentStepName", "dUNzDLXJcj");
        setField(term19585, term19585.getClass(), "currentStepNumber", "OrVSjRJVwa");
        setField(term19585, term19585.getClass(), "currentStepTitle", "cdZEcINJAM");
        setField(term19585, term19585.getClass(), "messageID", "qumYSwcWHz");
        setField(term19585, term19585.getClass(), "messageText", "raNzcEorkV");
        setField(term19372, term19372.getClass(), "automationStatus", term19585);
        setField(term19372, term19372.getClass(), "autoDeleteOnCompletion", term19662);
        setField(term19372, term19372.getClass(), "access", "nEgozCeoUr");
        setField(term19372, term19372.getClass(), "accountInfo", "EWGMzlcOnW");
        setField(term19372, term19372.getClass(), "jobStatement", "XeSDJYKMBf");
        setField(term19372, term19372.getClass(), "templateID", "tIsFcOGTUX");
        setField(term19372, term19372.getClass(), "actionID", "XUVRcnELFP");
        setField(term19372, term19372.getClass(), "registryID", "xIeSbezmkD");
        setField(term19372, term19372.getClass(), "parentRegistryID", "txUWLZRkSv");
        setField(term19372, term19372.getClass(), "domainID", "gHRMJRsBGm");
        setField(term19372, term19372.getClass(), "tenantID", "rZyrfnMvHa");
        setField(term19372, term19372.getClass(), "softwareServiceInstanceName", "GMyMhTZeDC");
        setField(term19372, term19372.getClass(), "templateName", "KqQOTshBOL");
        setField(term19372, term19372.getClass(), "globalVariableGroup", "cuWgFcYkPC");
        setField(term19372, term19372.getClass(), "isInstanceVariableWithoutPrefix", "HfbcOKkXBm");
        setField(term19372, term19372.getClass(), "steps", term19820);
        setField(term19372, term19372.getClass(), "variables", term19824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContainsParallelSteps", argTypes, term19372, args);
    }

};


