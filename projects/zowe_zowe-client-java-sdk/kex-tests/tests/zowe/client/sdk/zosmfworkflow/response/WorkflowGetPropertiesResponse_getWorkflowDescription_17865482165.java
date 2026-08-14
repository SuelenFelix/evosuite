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

public class WorkflowGetPropertiesResponse_getWorkflowDescription_17865482165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6868;

    public WorkflowGetPropertiesResponse_getWorkflowDescription_17865482165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7049 = new Integer(391863371);
        Boolean term7051 = new Boolean(false);
        Boolean term7053 = new Boolean(true);
        Boolean term7079 = new Boolean(false);
        Long term7094 = new Long(4872422362414183754L);
        Long term7096 = new Long(6811161968424632369L);
        Boolean term7158 = new Boolean(false);
        ArrayList term7316 = new ArrayList();
        ((ArrayList) term7316).add((Object)null);
        ((ArrayList) term7316).add((Object)null);
        Object term7322 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7322, term7322.getClass(), "name", "");
        setField(term7322, term7322.getClass(), "scope", "");
        setField(term7322, term7322.getClass(), "type", "");
        setField(term7322, term7322.getClass(), "value", "");
        setField(term7322, term7322.getClass(), "visibility", "");
        Object term7328 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7328, term7328.getClass(), "name", "");
        setField(term7328, term7328.getClass(), "scope", "");
        setField(term7328, term7328.getClass(), "type", "");
        setField(term7328, term7328.getClass(), "value", "");
        setField(term7328, term7328.getClass(), "visibility", "");
        Object term7334 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7334, term7334.getClass(), "name", "");
        setField(term7334, term7334.getClass(), "scope", "");
        setField(term7334, term7334.getClass(), "type", "");
        setField(term7334, term7334.getClass(), "value", "");
        setField(term7334, term7334.getClass(), "visibility", "");
        Object term7340 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7340, term7340.getClass(), "name", "");
        setField(term7340, term7340.getClass(), "scope", "");
        setField(term7340, term7340.getClass(), "type", "");
        setField(term7340, term7340.getClass(), "value", "");
        setField(term7340, term7340.getClass(), "visibility", "");
        Object term7346 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7346, term7346.getClass(), "name", "");
        setField(term7346, term7346.getClass(), "scope", "");
        setField(term7346, term7346.getClass(), "type", "");
        setField(term7346, term7346.getClass(), "value", "");
        setField(term7346, term7346.getClass(), "visibility", "");
        Object term7352 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7352, term7352.getClass(), "name", "");
        setField(term7352, term7352.getClass(), "scope", "");
        setField(term7352, term7352.getClass(), "type", "");
        setField(term7352, term7352.getClass(), "value", "");
        setField(term7352, term7352.getClass(), "visibility", "");
        Object term7358 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term7358, term7358.getClass(), "name", "");
        setField(term7358, term7358.getClass(), "scope", "");
        setField(term7358, term7358.getClass(), "type", "");
        setField(term7358, term7358.getClass(), "value", "");
        setField(term7358, term7358.getClass(), "visibility", "");
        ArrayList term7320 = new ArrayList();
        ((ArrayList) term7320).add(term7322);
        ((ArrayList) term7320).add(term7328);
        ((ArrayList) term7320).add(term7334);
        ((ArrayList) term7320).add(term7340);
        ((ArrayList) term7320).add(term7346);
        ((ArrayList) term7320).add(term7352);
        ((ArrayList) term7320).add(term7358);
        term6868 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term7081 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term6868, term6868.getClass(), "workflowName", "RCOqfVsRHt");
        setField(term6868, term6868.getClass(), "workflowKey", "TSyCeEZPaT");
        setField(term6868, term6868.getClass(), "workflowDescription", "JeZFtaqkzW");
        setField(term6868, term6868.getClass(), "workflowID", "vOVuNSCCLe");
        setField(term6868, term6868.getClass(), "workflowVersion", "fzeqPnzpnt");
        setField(term6868, term6868.getClass(), "workflowDefinitionFileMD5Value", "RxbhrFBjkO");
        setField(term6868, term6868.getClass(), "vendor", "aanyiAOJCl");
        setField(term6868, term6868.getClass(), "owner", "VDokbsCuqq");
        setField(term6868, term6868.getClass(), "workflowArchiveSAFID", "xClUIcPECX");
        setField(term6868, term6868.getClass(), "system", "avhRaGZaBF");
        setField(term6868, term6868.getClass(), "jobsOutputDirectory", "JkgoRtImdE");
        setField(term6868, term6868.getClass(), "category", "qFGKIJjlmV");
        setField(term6868, term6868.getClass(), "productID", "IHqvyhMtuM");
        setField(term6868, term6868.getClass(), "productName", "dAldIGYAXV");
        setField(term6868, term6868.getClass(), "productVersion", "mLwibAPEsa");
        setField(term6868, term6868.getClass(), "percentComplete", term7049);
        setField(term6868, term6868.getClass(), "isCallable", term7051);
        setField(term6868, term6868.getClass(), "containsParallelSteps", term7053);
        setField(term6868, term6868.getClass(), "scope", "zsWKWiTFuo");
        setField(term6868, term6868.getClass(), "statusName", "UPUbwyHQKN");
        setField(term6868, term6868.getClass(), "deleteCompletedJobs", term7079);
        setField(term7081, term7081.getClass(), "startUser", "lgQkrXANyI");
        setField(term7081, term7081.getClass(), "startedTime", term7094);
        setField(term7081, term7081.getClass(), "stoppedTime", term7096);
        setField(term7081, term7081.getClass(), "currentStepName", "MeTmRZXErV");
        setField(term7081, term7081.getClass(), "currentStepNumber", "jNxbVmoZgq");
        setField(term7081, term7081.getClass(), "currentStepTitle", "PvmBHIXaMY");
        setField(term7081, term7081.getClass(), "messageID", "hulYxtowxw");
        setField(term7081, term7081.getClass(), "messageText", "GNEmuHPNcU");
        setField(term6868, term6868.getClass(), "automationStatus", term7081);
        setField(term6868, term6868.getClass(), "autoDeleteOnCompletion", term7158);
        setField(term6868, term6868.getClass(), "access", "IoSfuKDFRe");
        setField(term6868, term6868.getClass(), "accountInfo", "AWYyZiNfsm");
        setField(term6868, term6868.getClass(), "jobStatement", "ITRRYiuDwH");
        setField(term6868, term6868.getClass(), "templateID", "llRfwANcVF");
        setField(term6868, term6868.getClass(), "actionID", "sUEeHQTWkA");
        setField(term6868, term6868.getClass(), "registryID", "BDIRCxAWLA");
        setField(term6868, term6868.getClass(), "parentRegistryID", "eOJfbiZLnb");
        setField(term6868, term6868.getClass(), "domainID", "nKZKnxWYCK");
        setField(term6868, term6868.getClass(), "tenantID", "JOqQxuzRuZ");
        setField(term6868, term6868.getClass(), "softwareServiceInstanceName", "RSaoipUlsg");
        setField(term6868, term6868.getClass(), "templateName", "cSHGbqKqlN");
        setField(term6868, term6868.getClass(), "globalVariableGroup", "pFAfANnxup");
        setField(term6868, term6868.getClass(), "isInstanceVariableWithoutPrefix", "FbSIUZyBXZ");
        setField(term6868, term6868.getClass(), "steps", term7316);
        setField(term6868, term6868.getClass(), "variables", term7320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDescription", argTypes, term6868, args);
    }

};


