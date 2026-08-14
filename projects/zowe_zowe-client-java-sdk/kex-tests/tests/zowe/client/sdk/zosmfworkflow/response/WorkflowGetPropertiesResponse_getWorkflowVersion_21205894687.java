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

public class WorkflowGetPropertiesResponse_getWorkflowVersion_21205894687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8572;

    public WorkflowGetPropertiesResponse_getWorkflowVersion_21205894687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8753 = new Integer(-616727354);
        Boolean term8755 = new Boolean(true);
        Boolean term8757 = new Boolean(true);
        Boolean term8783 = new Boolean(true);
        Long term8798 = new Long(-2813493605142626659L);
        Long term8800 = new Long(-8885298608300233488L);
        Boolean term8862 = new Boolean(true);
        ArrayList term9020 = new ArrayList();
        ((ArrayList) term9020).add((Object)null);
        ((ArrayList) term9020).add((Object)null);
        ((ArrayList) term9020).add((Object)null);
        ((ArrayList) term9020).add((Object)null);
        ((ArrayList) term9020).add((Object)null);
        Object term9026 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term9026, term9026.getClass(), "name", "");
        setField(term9026, term9026.getClass(), "scope", "");
        setField(term9026, term9026.getClass(), "type", "");
        setField(term9026, term9026.getClass(), "value", "");
        setField(term9026, term9026.getClass(), "visibility", "");
        Object term9032 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term9032, term9032.getClass(), "name", "");
        setField(term9032, term9032.getClass(), "scope", "");
        setField(term9032, term9032.getClass(), "type", "");
        setField(term9032, term9032.getClass(), "value", "");
        setField(term9032, term9032.getClass(), "visibility", "");
        Object term9038 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term9038, term9038.getClass(), "name", "");
        setField(term9038, term9038.getClass(), "scope", "");
        setField(term9038, term9038.getClass(), "type", "");
        setField(term9038, term9038.getClass(), "value", "");
        setField(term9038, term9038.getClass(), "visibility", "");
        Object term9044 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term9044, term9044.getClass(), "name", "");
        setField(term9044, term9044.getClass(), "scope", "");
        setField(term9044, term9044.getClass(), "type", "");
        setField(term9044, term9044.getClass(), "value", "");
        setField(term9044, term9044.getClass(), "visibility", "");
        ArrayList term9024 = new ArrayList();
        ((ArrayList) term9024).add(term9026);
        ((ArrayList) term9024).add(term9032);
        ((ArrayList) term9024).add(term9038);
        ((ArrayList) term9024).add(term9044);
        term8572 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term8785 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term8572, term8572.getClass(), "workflowName", "VSaNnhMpRc");
        setField(term8572, term8572.getClass(), "workflowKey", "QNjNTLlUaV");
        setField(term8572, term8572.getClass(), "workflowDescription", "hIYsRyOZxk");
        setField(term8572, term8572.getClass(), "workflowID", "RjNoEywJbC");
        setField(term8572, term8572.getClass(), "workflowVersion", "RTTvrwwhou");
        setField(term8572, term8572.getClass(), "workflowDefinitionFileMD5Value", "lRORwXipuk");
        setField(term8572, term8572.getClass(), "vendor", "fVdTcjgHdw");
        setField(term8572, term8572.getClass(), "owner", "wwAwLLcLPp");
        setField(term8572, term8572.getClass(), "workflowArchiveSAFID", "nHpMKOmlpQ");
        setField(term8572, term8572.getClass(), "system", "fKhrQsJToZ");
        setField(term8572, term8572.getClass(), "jobsOutputDirectory", "wsysQLGFnl");
        setField(term8572, term8572.getClass(), "category", "ckQLZGFjMX");
        setField(term8572, term8572.getClass(), "productID", "qphdrqUtNx");
        setField(term8572, term8572.getClass(), "productName", "bwlLFAfNWx");
        setField(term8572, term8572.getClass(), "productVersion", "JWodNQzjjV");
        setField(term8572, term8572.getClass(), "percentComplete", term8753);
        setField(term8572, term8572.getClass(), "isCallable", term8755);
        setField(term8572, term8572.getClass(), "containsParallelSteps", term8757);
        setField(term8572, term8572.getClass(), "scope", "CAgxWjhxNf");
        setField(term8572, term8572.getClass(), "statusName", "goAoCMhKBu");
        setField(term8572, term8572.getClass(), "deleteCompletedJobs", term8783);
        setField(term8785, term8785.getClass(), "startUser", "BWxJSgKHRT");
        setField(term8785, term8785.getClass(), "startedTime", term8798);
        setField(term8785, term8785.getClass(), "stoppedTime", term8800);
        setField(term8785, term8785.getClass(), "currentStepName", "AGXoIndFnm");
        setField(term8785, term8785.getClass(), "currentStepNumber", "mwmFMNEzkK");
        setField(term8785, term8785.getClass(), "currentStepTitle", "kVAmKknVln");
        setField(term8785, term8785.getClass(), "messageID", "MRFLbEGYKG");
        setField(term8785, term8785.getClass(), "messageText", "BYrGukTyof");
        setField(term8572, term8572.getClass(), "automationStatus", term8785);
        setField(term8572, term8572.getClass(), "autoDeleteOnCompletion", term8862);
        setField(term8572, term8572.getClass(), "access", "jiCGTTzKGB");
        setField(term8572, term8572.getClass(), "accountInfo", "MqICFYzDJj");
        setField(term8572, term8572.getClass(), "jobStatement", "YgQvdcBQKw");
        setField(term8572, term8572.getClass(), "templateID", "FiYYLuailz");
        setField(term8572, term8572.getClass(), "actionID", "XebAeSnCKZ");
        setField(term8572, term8572.getClass(), "registryID", "GeddnXjHGy");
        setField(term8572, term8572.getClass(), "parentRegistryID", "vLTbaoAxBm");
        setField(term8572, term8572.getClass(), "domainID", "BXTjEyEZxD");
        setField(term8572, term8572.getClass(), "tenantID", "oKhVzOKUFW");
        setField(term8572, term8572.getClass(), "softwareServiceInstanceName", "mNHyqmOAFy");
        setField(term8572, term8572.getClass(), "templateName", "UxgSdhxPCH");
        setField(term8572, term8572.getClass(), "globalVariableGroup", "DAujxZPHJC");
        setField(term8572, term8572.getClass(), "isInstanceVariableWithoutPrefix", "IlBhdrCvHq");
        setField(term8572, term8572.getClass(), "steps", term9020);
        setField(term8572, term8572.getClass(), "variables", term9024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowVersion", argTypes, term8572, args);
    }

};


