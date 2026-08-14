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

public class WorkflowGetPropertiesResponse_getScope_164028636921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20188;

    public WorkflowGetPropertiesResponse_getScope_164028636921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20369 = new Integer(1048535127);
        Boolean term20371 = new Boolean(true);
        Boolean term20373 = new Boolean(false);
        Boolean term20399 = new Boolean(false);
        Long term20414 = new Long(-8708192233349544946L);
        Long term20416 = new Long(5907001541142728739L);
        Boolean term20478 = new Boolean(true);
        ArrayList term20636 = new ArrayList();
        ((ArrayList) term20636).add((Object)null);
        ((ArrayList) term20636).add((Object)null);
        ((ArrayList) term20636).add((Object)null);
        ((ArrayList) term20636).add((Object)null);
        ((ArrayList) term20636).add((Object)null);
        ((ArrayList) term20636).add((Object)null);
        ((ArrayList) term20636).add((Object)null);
        Object term20642 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term20642, term20642.getClass(), "name", "");
        setField(term20642, term20642.getClass(), "scope", "");
        setField(term20642, term20642.getClass(), "type", "");
        setField(term20642, term20642.getClass(), "value", "");
        setField(term20642, term20642.getClass(), "visibility", "");
        Object term20648 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term20648, term20648.getClass(), "name", "");
        setField(term20648, term20648.getClass(), "scope", "");
        setField(term20648, term20648.getClass(), "type", "");
        setField(term20648, term20648.getClass(), "value", "");
        setField(term20648, term20648.getClass(), "visibility", "");
        ArrayList term20640 = new ArrayList();
        ((ArrayList) term20640).add(term20642);
        ((ArrayList) term20640).add(term20648);
        term20188 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term20401 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term20188, term20188.getClass(), "workflowName", "pLbTzSMbsN");
        setField(term20188, term20188.getClass(), "workflowKey", "lFSbxerCPP");
        setField(term20188, term20188.getClass(), "workflowDescription", "vjaZIyixCm");
        setField(term20188, term20188.getClass(), "workflowID", "gAAPyftlIR");
        setField(term20188, term20188.getClass(), "workflowVersion", "kevWstoxwq");
        setField(term20188, term20188.getClass(), "workflowDefinitionFileMD5Value", "aSYOhFwzSm");
        setField(term20188, term20188.getClass(), "vendor", "pVZlzrBeDB");
        setField(term20188, term20188.getClass(), "owner", "EfSUvjuZAA");
        setField(term20188, term20188.getClass(), "workflowArchiveSAFID", "PrHWfHydsG");
        setField(term20188, term20188.getClass(), "system", "igruEzTbBE");
        setField(term20188, term20188.getClass(), "jobsOutputDirectory", "LFjgROsRUV");
        setField(term20188, term20188.getClass(), "category", "kHxujKiCsr");
        setField(term20188, term20188.getClass(), "productID", "cseZveWowm");
        setField(term20188, term20188.getClass(), "productName", "idfslIPhgx");
        setField(term20188, term20188.getClass(), "productVersion", "HyFLOXeoDX");
        setField(term20188, term20188.getClass(), "percentComplete", term20369);
        setField(term20188, term20188.getClass(), "isCallable", term20371);
        setField(term20188, term20188.getClass(), "containsParallelSteps", term20373);
        setField(term20188, term20188.getClass(), "scope", "crkNabVaWs");
        setField(term20188, term20188.getClass(), "statusName", "qBcAJgrABE");
        setField(term20188, term20188.getClass(), "deleteCompletedJobs", term20399);
        setField(term20401, term20401.getClass(), "startUser", "JKdZuLFRwC");
        setField(term20401, term20401.getClass(), "startedTime", term20414);
        setField(term20401, term20401.getClass(), "stoppedTime", term20416);
        setField(term20401, term20401.getClass(), "currentStepName", "hfhLLoWnRU");
        setField(term20401, term20401.getClass(), "currentStepNumber", "RpofnOPYha");
        setField(term20401, term20401.getClass(), "currentStepTitle", "CQYmAsjvPU");
        setField(term20401, term20401.getClass(), "messageID", "NNkIIFpxiB");
        setField(term20401, term20401.getClass(), "messageText", "sBmtvFPDso");
        setField(term20188, term20188.getClass(), "automationStatus", term20401);
        setField(term20188, term20188.getClass(), "autoDeleteOnCompletion", term20478);
        setField(term20188, term20188.getClass(), "access", "qsUIxrLolr");
        setField(term20188, term20188.getClass(), "accountInfo", "IlQxArYcgB");
        setField(term20188, term20188.getClass(), "jobStatement", "lIgKCvCuoH");
        setField(term20188, term20188.getClass(), "templateID", "dHuWgRwLOm");
        setField(term20188, term20188.getClass(), "actionID", "PsTQDxNIld");
        setField(term20188, term20188.getClass(), "registryID", "uoBijJjvaj");
        setField(term20188, term20188.getClass(), "parentRegistryID", "BdsLFSRWda");
        setField(term20188, term20188.getClass(), "domainID", "tMhhBYonAI");
        setField(term20188, term20188.getClass(), "tenantID", "AaQRshwIQC");
        setField(term20188, term20188.getClass(), "softwareServiceInstanceName", "rHgKCfgCsg");
        setField(term20188, term20188.getClass(), "templateName", "AWtIUOuutt");
        setField(term20188, term20188.getClass(), "globalVariableGroup", "jBgJZpHifl");
        setField(term20188, term20188.getClass(), "isInstanceVariableWithoutPrefix", "azMTTmEXnh");
        setField(term20188, term20188.getClass(), "steps", term20636);
        setField(term20188, term20188.getClass(), "variables", term20640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term20188, args);
    }

};


