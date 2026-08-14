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

public class WorkflowGetPropertiesResponse_getDeleteCompletedJobs_16790603223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21868;

    public WorkflowGetPropertiesResponse_getDeleteCompletedJobs_16790603223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22049 = new Integer(-6029667);
        Boolean term22051 = new Boolean(true);
        Boolean term22053 = new Boolean(false);
        Boolean term22079 = new Boolean(true);
        Long term22094 = new Long(-6292278961887936280L);
        Long term22096 = new Long(-6645965768855543712L);
        Boolean term22158 = new Boolean(false);
        ArrayList term22316 = new ArrayList();
        ((ArrayList) term22316).add((Object)null);
        Object term22322 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22322, term22322.getClass(), "name", "");
        setField(term22322, term22322.getClass(), "scope", "");
        setField(term22322, term22322.getClass(), "type", "");
        setField(term22322, term22322.getClass(), "value", "");
        setField(term22322, term22322.getClass(), "visibility", "");
        Object term22328 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22328, term22328.getClass(), "name", "");
        setField(term22328, term22328.getClass(), "scope", "");
        setField(term22328, term22328.getClass(), "type", "");
        setField(term22328, term22328.getClass(), "value", "");
        setField(term22328, term22328.getClass(), "visibility", "");
        Object term22334 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22334, term22334.getClass(), "name", "");
        setField(term22334, term22334.getClass(), "scope", "");
        setField(term22334, term22334.getClass(), "type", "");
        setField(term22334, term22334.getClass(), "value", "");
        setField(term22334, term22334.getClass(), "visibility", "");
        Object term22340 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22340, term22340.getClass(), "name", "");
        setField(term22340, term22340.getClass(), "scope", "");
        setField(term22340, term22340.getClass(), "type", "");
        setField(term22340, term22340.getClass(), "value", "");
        setField(term22340, term22340.getClass(), "visibility", "");
        Object term22346 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22346, term22346.getClass(), "name", "");
        setField(term22346, term22346.getClass(), "scope", "");
        setField(term22346, term22346.getClass(), "type", "");
        setField(term22346, term22346.getClass(), "value", "");
        setField(term22346, term22346.getClass(), "visibility", "");
        Object term22352 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22352, term22352.getClass(), "name", "");
        setField(term22352, term22352.getClass(), "scope", "");
        setField(term22352, term22352.getClass(), "type", "");
        setField(term22352, term22352.getClass(), "value", "");
        setField(term22352, term22352.getClass(), "visibility", "");
        Object term22358 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term22358, term22358.getClass(), "name", "");
        setField(term22358, term22358.getClass(), "scope", "");
        setField(term22358, term22358.getClass(), "type", "");
        setField(term22358, term22358.getClass(), "value", "");
        setField(term22358, term22358.getClass(), "visibility", "");
        ArrayList term22320 = new ArrayList();
        ((ArrayList) term22320).add(term22322);
        ((ArrayList) term22320).add(term22328);
        ((ArrayList) term22320).add(term22334);
        ((ArrayList) term22320).add(term22340);
        ((ArrayList) term22320).add(term22346);
        ((ArrayList) term22320).add(term22352);
        ((ArrayList) term22320).add(term22358);
        term21868 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term22081 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term21868, term21868.getClass(), "workflowName", "cNoFvpHBHw");
        setField(term21868, term21868.getClass(), "workflowKey", "DoSWbCtsBg");
        setField(term21868, term21868.getClass(), "workflowDescription", "NrXtkbXwDc");
        setField(term21868, term21868.getClass(), "workflowID", "EUapSrAmOe");
        setField(term21868, term21868.getClass(), "workflowVersion", "dUHylIprea");
        setField(term21868, term21868.getClass(), "workflowDefinitionFileMD5Value", "FKDqHRpMcc");
        setField(term21868, term21868.getClass(), "vendor", "mIRMQIxHUD");
        setField(term21868, term21868.getClass(), "owner", "FbBMtntDbw");
        setField(term21868, term21868.getClass(), "workflowArchiveSAFID", "zRnpRGaHlI");
        setField(term21868, term21868.getClass(), "system", "dVHfxjbMRK");
        setField(term21868, term21868.getClass(), "jobsOutputDirectory", "LzwyLxKJpw");
        setField(term21868, term21868.getClass(), "category", "ZhWJlplAVK");
        setField(term21868, term21868.getClass(), "productID", "pnmjTuTojv");
        setField(term21868, term21868.getClass(), "productName", "eMtshhmGEm");
        setField(term21868, term21868.getClass(), "productVersion", "VJUbzHGOvg");
        setField(term21868, term21868.getClass(), "percentComplete", term22049);
        setField(term21868, term21868.getClass(), "isCallable", term22051);
        setField(term21868, term21868.getClass(), "containsParallelSteps", term22053);
        setField(term21868, term21868.getClass(), "scope", "SiwcigIrfD");
        setField(term21868, term21868.getClass(), "statusName", "MFIdGVLoDo");
        setField(term21868, term21868.getClass(), "deleteCompletedJobs", term22079);
        setField(term22081, term22081.getClass(), "startUser", "kbxgTcnXyU");
        setField(term22081, term22081.getClass(), "startedTime", term22094);
        setField(term22081, term22081.getClass(), "stoppedTime", term22096);
        setField(term22081, term22081.getClass(), "currentStepName", "lnJvDbbuwo");
        setField(term22081, term22081.getClass(), "currentStepNumber", "KExnWkKGvF");
        setField(term22081, term22081.getClass(), "currentStepTitle", "luGUNfvmKk");
        setField(term22081, term22081.getClass(), "messageID", "oOUHomyJff");
        setField(term22081, term22081.getClass(), "messageText", "KnnoLMOuur");
        setField(term21868, term21868.getClass(), "automationStatus", term22081);
        setField(term21868, term21868.getClass(), "autoDeleteOnCompletion", term22158);
        setField(term21868, term21868.getClass(), "access", "buRpVghIvt");
        setField(term21868, term21868.getClass(), "accountInfo", "oTGxFdiaIW");
        setField(term21868, term21868.getClass(), "jobStatement", "jlyFvaZlmv");
        setField(term21868, term21868.getClass(), "templateID", "sofyLEfomV");
        setField(term21868, term21868.getClass(), "actionID", "zHcDSJHKAb");
        setField(term21868, term21868.getClass(), "registryID", "WRIQkTdeMl");
        setField(term21868, term21868.getClass(), "parentRegistryID", "rLSEheWsHd");
        setField(term21868, term21868.getClass(), "domainID", "DoUKDhlGCY");
        setField(term21868, term21868.getClass(), "tenantID", "IeoToWsQWU");
        setField(term21868, term21868.getClass(), "softwareServiceInstanceName", "QxiiHtQAzN");
        setField(term21868, term21868.getClass(), "templateName", "gQgTBlRIvX");
        setField(term21868, term21868.getClass(), "globalVariableGroup", "ulKaKnANzj");
        setField(term21868, term21868.getClass(), "isInstanceVariableWithoutPrefix", "ABwhdjjeJi");
        setField(term21868, term21868.getClass(), "steps", term22316);
        setField(term21868, term21868.getClass(), "variables", term22320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleteCompletedJobs", argTypes, term21868, args);
    }

};


