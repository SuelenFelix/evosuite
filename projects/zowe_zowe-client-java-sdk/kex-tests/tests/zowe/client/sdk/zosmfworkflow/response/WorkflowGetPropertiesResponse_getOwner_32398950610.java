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

public class WorkflowGetPropertiesResponse_getOwner_32398950610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11062;

    public WorkflowGetPropertiesResponse_getOwner_32398950610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11243 = new Integer(1227103734);
        Boolean term11245 = new Boolean(true);
        Boolean term11247 = new Boolean(true);
        Boolean term11273 = new Boolean(false);
        Long term11288 = new Long(-316468845751588286L);
        Long term11290 = new Long(5127676408959197577L);
        Boolean term11352 = new Boolean(true);
        ArrayList term11510 = new ArrayList();
        ((ArrayList) term11510).add((Object)null);
        Object term11516 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term11516, term11516.getClass(), "name", "");
        setField(term11516, term11516.getClass(), "scope", "");
        setField(term11516, term11516.getClass(), "type", "");
        setField(term11516, term11516.getClass(), "value", "");
        setField(term11516, term11516.getClass(), "visibility", "");
        Object term11522 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term11522, term11522.getClass(), "name", "");
        setField(term11522, term11522.getClass(), "scope", "");
        setField(term11522, term11522.getClass(), "type", "");
        setField(term11522, term11522.getClass(), "value", "");
        setField(term11522, term11522.getClass(), "visibility", "");
        ArrayList term11514 = new ArrayList();
        ((ArrayList) term11514).add(term11516);
        ((ArrayList) term11514).add(term11522);
        term11062 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term11275 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term11062, term11062.getClass(), "workflowName", "aZKOWhHMEh");
        setField(term11062, term11062.getClass(), "workflowKey", "YfkhviKZwl");
        setField(term11062, term11062.getClass(), "workflowDescription", "DcOhhAfJTI");
        setField(term11062, term11062.getClass(), "workflowID", "gYTIkBFOoS");
        setField(term11062, term11062.getClass(), "workflowVersion", "xmzSoVgiED");
        setField(term11062, term11062.getClass(), "workflowDefinitionFileMD5Value", "pdSvedKgPq");
        setField(term11062, term11062.getClass(), "vendor", "epPTwvcoyb");
        setField(term11062, term11062.getClass(), "owner", "UBPHmOICBs");
        setField(term11062, term11062.getClass(), "workflowArchiveSAFID", "IDJUVPgUJf");
        setField(term11062, term11062.getClass(), "system", "JmnWRJUxGr");
        setField(term11062, term11062.getClass(), "jobsOutputDirectory", "wgRGBNrTGP");
        setField(term11062, term11062.getClass(), "category", "FIdNVptZpW");
        setField(term11062, term11062.getClass(), "productID", "rQjxAhisjm");
        setField(term11062, term11062.getClass(), "productName", "ZDhASPHjDG");
        setField(term11062, term11062.getClass(), "productVersion", "HNVOAXYNEZ");
        setField(term11062, term11062.getClass(), "percentComplete", term11243);
        setField(term11062, term11062.getClass(), "isCallable", term11245);
        setField(term11062, term11062.getClass(), "containsParallelSteps", term11247);
        setField(term11062, term11062.getClass(), "scope", "gbbYBYyfvr");
        setField(term11062, term11062.getClass(), "statusName", "SrWMUlbtWV");
        setField(term11062, term11062.getClass(), "deleteCompletedJobs", term11273);
        setField(term11275, term11275.getClass(), "startUser", "VePIumgrrU");
        setField(term11275, term11275.getClass(), "startedTime", term11288);
        setField(term11275, term11275.getClass(), "stoppedTime", term11290);
        setField(term11275, term11275.getClass(), "currentStepName", "DPwIqlszZo");
        setField(term11275, term11275.getClass(), "currentStepNumber", "mNgDshwZNc");
        setField(term11275, term11275.getClass(), "currentStepTitle", "pDqgDbJoFw");
        setField(term11275, term11275.getClass(), "messageID", "iVOvTzOxwt");
        setField(term11275, term11275.getClass(), "messageText", "BjZQdecXvB");
        setField(term11062, term11062.getClass(), "automationStatus", term11275);
        setField(term11062, term11062.getClass(), "autoDeleteOnCompletion", term11352);
        setField(term11062, term11062.getClass(), "access", "iUkOOQhEkw");
        setField(term11062, term11062.getClass(), "accountInfo", "wmVoFoUVmU");
        setField(term11062, term11062.getClass(), "jobStatement", "lLiSiPCciB");
        setField(term11062, term11062.getClass(), "templateID", "PsMKIIEwdR");
        setField(term11062, term11062.getClass(), "actionID", "RbQmXqfXAT");
        setField(term11062, term11062.getClass(), "registryID", "fcCAsvfBbe");
        setField(term11062, term11062.getClass(), "parentRegistryID", "mUNcKUxghj");
        setField(term11062, term11062.getClass(), "domainID", "lnvLKbtveE");
        setField(term11062, term11062.getClass(), "tenantID", "FfrrEhTHzQ");
        setField(term11062, term11062.getClass(), "softwareServiceInstanceName", "LXnDNrMsqT");
        setField(term11062, term11062.getClass(), "templateName", "ZLQamJFBmu");
        setField(term11062, term11062.getClass(), "globalVariableGroup", "ZWcOCwKNvd");
        setField(term11062, term11062.getClass(), "isInstanceVariableWithoutPrefix", "GTmoNrziyc");
        setField(term11062, term11062.getClass(), "steps", term11510);
        setField(term11062, term11062.getClass(), "variables", term11514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term11062, args);
    }

};


