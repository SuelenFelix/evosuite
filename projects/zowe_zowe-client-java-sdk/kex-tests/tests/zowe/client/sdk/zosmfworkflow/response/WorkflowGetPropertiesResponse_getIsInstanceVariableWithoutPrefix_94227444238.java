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

public class WorkflowGetPropertiesResponse_getIsInstanceVariableWithoutPrefix_94227444238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34384;

    public WorkflowGetPropertiesResponse_getIsInstanceVariableWithoutPrefix_94227444238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34565 = new Integer(-1530420153);
        Boolean term34567 = new Boolean(false);
        Boolean term34569 = new Boolean(true);
        Boolean term34595 = new Boolean(false);
        Long term34610 = new Long(41775768178052008L);
        Long term34612 = new Long(6682528376118987775L);
        Boolean term34674 = new Boolean(false);
        ArrayList term34832 = new ArrayList();
        ((ArrayList) term34832).add((Object)null);
        Object term34838 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term34838, term34838.getClass(), "name", "");
        setField(term34838, term34838.getClass(), "scope", "");
        setField(term34838, term34838.getClass(), "type", "");
        setField(term34838, term34838.getClass(), "value", "");
        setField(term34838, term34838.getClass(), "visibility", "");
        Object term34844 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term34844, term34844.getClass(), "name", "");
        setField(term34844, term34844.getClass(), "scope", "");
        setField(term34844, term34844.getClass(), "type", "");
        setField(term34844, term34844.getClass(), "value", "");
        setField(term34844, term34844.getClass(), "visibility", "");
        ArrayList term34836 = new ArrayList();
        ((ArrayList) term34836).add(term34838);
        ((ArrayList) term34836).add(term34844);
        term34384 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term34597 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term34384, term34384.getClass(), "workflowName", "tGgCtmAQPu");
        setField(term34384, term34384.getClass(), "workflowKey", "HokisXXNMR");
        setField(term34384, term34384.getClass(), "workflowDescription", "JbtvoXZZHr");
        setField(term34384, term34384.getClass(), "workflowID", "eMlkqCfrnK");
        setField(term34384, term34384.getClass(), "workflowVersion", "HCiwohQDUV");
        setField(term34384, term34384.getClass(), "workflowDefinitionFileMD5Value", "RRWTUIdKkl");
        setField(term34384, term34384.getClass(), "vendor", "pBnfJsGPNO");
        setField(term34384, term34384.getClass(), "owner", "hzaRTeUQpV");
        setField(term34384, term34384.getClass(), "workflowArchiveSAFID", "RlIgxHiNOB");
        setField(term34384, term34384.getClass(), "system", "kSpBCSqyfl");
        setField(term34384, term34384.getClass(), "jobsOutputDirectory", "OUrtbTvuiW");
        setField(term34384, term34384.getClass(), "category", "UnkpYLSsCR");
        setField(term34384, term34384.getClass(), "productID", "AaxnITALtd");
        setField(term34384, term34384.getClass(), "productName", "RdnRRpWglh");
        setField(term34384, term34384.getClass(), "productVersion", "YcXTXuOFYV");
        setField(term34384, term34384.getClass(), "percentComplete", term34565);
        setField(term34384, term34384.getClass(), "isCallable", term34567);
        setField(term34384, term34384.getClass(), "containsParallelSteps", term34569);
        setField(term34384, term34384.getClass(), "scope", "HGhIlMCaKM");
        setField(term34384, term34384.getClass(), "statusName", "pPxivEPfHY");
        setField(term34384, term34384.getClass(), "deleteCompletedJobs", term34595);
        setField(term34597, term34597.getClass(), "startUser", "BiitfiJmRW");
        setField(term34597, term34597.getClass(), "startedTime", term34610);
        setField(term34597, term34597.getClass(), "stoppedTime", term34612);
        setField(term34597, term34597.getClass(), "currentStepName", "ILHarzuGbn");
        setField(term34597, term34597.getClass(), "currentStepNumber", "uNGHHAwCFL");
        setField(term34597, term34597.getClass(), "currentStepTitle", "fbshyuUfqy");
        setField(term34597, term34597.getClass(), "messageID", "eupNcihLEw");
        setField(term34597, term34597.getClass(), "messageText", "iFFcolxwcm");
        setField(term34384, term34384.getClass(), "automationStatus", term34597);
        setField(term34384, term34384.getClass(), "autoDeleteOnCompletion", term34674);
        setField(term34384, term34384.getClass(), "access", "bAsZBSqnyM");
        setField(term34384, term34384.getClass(), "accountInfo", "urrmpQzmTU");
        setField(term34384, term34384.getClass(), "jobStatement", "GWoZyTTlNx");
        setField(term34384, term34384.getClass(), "templateID", "ntUYcalSmz");
        setField(term34384, term34384.getClass(), "actionID", "lnZXLpyQoO");
        setField(term34384, term34384.getClass(), "registryID", "lOIEIGbwPj");
        setField(term34384, term34384.getClass(), "parentRegistryID", "TvmWaJWmLY");
        setField(term34384, term34384.getClass(), "domainID", "TSUdwgvHgU");
        setField(term34384, term34384.getClass(), "tenantID", "YBQxTjzIrN");
        setField(term34384, term34384.getClass(), "softwareServiceInstanceName", "xfqaJVcHGx");
        setField(term34384, term34384.getClass(), "templateName", "bANxpqKESI");
        setField(term34384, term34384.getClass(), "globalVariableGroup", "sgpUSVSuVZ");
        setField(term34384, term34384.getClass(), "isInstanceVariableWithoutPrefix", "ZOYhOzwINI");
        setField(term34384, term34384.getClass(), "steps", term34832);
        setField(term34384, term34384.getClass(), "variables", term34836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsInstanceVariableWithoutPrefix", argTypes, term34384, args);
    }

};


