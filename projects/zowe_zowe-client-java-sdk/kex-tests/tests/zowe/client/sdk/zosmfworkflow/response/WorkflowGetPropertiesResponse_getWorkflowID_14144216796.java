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

public class WorkflowGetPropertiesResponse_getWorkflowID_14144216796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7726;

    public WorkflowGetPropertiesResponse_getWorkflowID_14144216796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7907 = new Integer(-1922583790);
        Boolean term7909 = new Boolean(true);
        Boolean term7911 = new Boolean(true);
        Boolean term7937 = new Boolean(false);
        Long term7952 = new Long(-7237588299778557629L);
        Long term7954 = new Long(6967924379644551255L);
        Boolean term8016 = new Boolean(false);
        ArrayList term8174 = new ArrayList();
        ((ArrayList) term8174).add((Object)null);
        Object term8180 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term8180, term8180.getClass(), "name", "");
        setField(term8180, term8180.getClass(), "scope", "");
        setField(term8180, term8180.getClass(), "type", "");
        setField(term8180, term8180.getClass(), "value", "");
        setField(term8180, term8180.getClass(), "visibility", "");
        Object term8186 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term8186, term8186.getClass(), "name", "");
        setField(term8186, term8186.getClass(), "scope", "");
        setField(term8186, term8186.getClass(), "type", "");
        setField(term8186, term8186.getClass(), "value", "");
        setField(term8186, term8186.getClass(), "visibility", "");
        Object term8192 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term8192, term8192.getClass(), "name", "");
        setField(term8192, term8192.getClass(), "scope", "");
        setField(term8192, term8192.getClass(), "type", "");
        setField(term8192, term8192.getClass(), "value", "");
        setField(term8192, term8192.getClass(), "visibility", "");
        Object term8198 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term8198, term8198.getClass(), "name", "");
        setField(term8198, term8198.getClass(), "scope", "");
        setField(term8198, term8198.getClass(), "type", "");
        setField(term8198, term8198.getClass(), "value", "");
        setField(term8198, term8198.getClass(), "visibility", "");
        Object term8204 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term8204, term8204.getClass(), "name", "");
        setField(term8204, term8204.getClass(), "scope", "");
        setField(term8204, term8204.getClass(), "type", "");
        setField(term8204, term8204.getClass(), "value", "");
        setField(term8204, term8204.getClass(), "visibility", "");
        ArrayList term8178 = new ArrayList();
        ((ArrayList) term8178).add(term8180);
        ((ArrayList) term8178).add(term8186);
        ((ArrayList) term8178).add(term8192);
        ((ArrayList) term8178).add(term8198);
        ((ArrayList) term8178).add(term8204);
        term7726 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term7939 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term7726, term7726.getClass(), "workflowName", "WPxXsahPRq");
        setField(term7726, term7726.getClass(), "workflowKey", "IENRuqmwUU");
        setField(term7726, term7726.getClass(), "workflowDescription", "GsWxOwXvSu");
        setField(term7726, term7726.getClass(), "workflowID", "bKBSncrMEZ");
        setField(term7726, term7726.getClass(), "workflowVersion", "yeSXGqQExb");
        setField(term7726, term7726.getClass(), "workflowDefinitionFileMD5Value", "uXYcXVYJZM");
        setField(term7726, term7726.getClass(), "vendor", "BJhjdJUhkz");
        setField(term7726, term7726.getClass(), "owner", "cdHYQDgUZR");
        setField(term7726, term7726.getClass(), "workflowArchiveSAFID", "KAORSSPSeV");
        setField(term7726, term7726.getClass(), "system", "UimMMORkzd");
        setField(term7726, term7726.getClass(), "jobsOutputDirectory", "huVIXUWLtI");
        setField(term7726, term7726.getClass(), "category", "vhKzFyKPOT");
        setField(term7726, term7726.getClass(), "productID", "nQhIgWXdRc");
        setField(term7726, term7726.getClass(), "productName", "EusenEbIoF");
        setField(term7726, term7726.getClass(), "productVersion", "SScVQYSvWH");
        setField(term7726, term7726.getClass(), "percentComplete", term7907);
        setField(term7726, term7726.getClass(), "isCallable", term7909);
        setField(term7726, term7726.getClass(), "containsParallelSteps", term7911);
        setField(term7726, term7726.getClass(), "scope", "MnovcqFhCl");
        setField(term7726, term7726.getClass(), "statusName", "qYtAeLzOhW");
        setField(term7726, term7726.getClass(), "deleteCompletedJobs", term7937);
        setField(term7939, term7939.getClass(), "startUser", "tJzmOfcUnY");
        setField(term7939, term7939.getClass(), "startedTime", term7952);
        setField(term7939, term7939.getClass(), "stoppedTime", term7954);
        setField(term7939, term7939.getClass(), "currentStepName", "TKlccZUpjz");
        setField(term7939, term7939.getClass(), "currentStepNumber", "GGzwMoHZXC");
        setField(term7939, term7939.getClass(), "currentStepTitle", "IpmgwHTgnG");
        setField(term7939, term7939.getClass(), "messageID", "tIpkeYIezR");
        setField(term7939, term7939.getClass(), "messageText", "YkZtEtthvz");
        setField(term7726, term7726.getClass(), "automationStatus", term7939);
        setField(term7726, term7726.getClass(), "autoDeleteOnCompletion", term8016);
        setField(term7726, term7726.getClass(), "access", "dwlZSxlXOo");
        setField(term7726, term7726.getClass(), "accountInfo", "lKrEAkypza");
        setField(term7726, term7726.getClass(), "jobStatement", "KtuuNAqGCQ");
        setField(term7726, term7726.getClass(), "templateID", "OGQsfjmReM");
        setField(term7726, term7726.getClass(), "actionID", "YsUtbngnRO");
        setField(term7726, term7726.getClass(), "registryID", "JisaWUxcNb");
        setField(term7726, term7726.getClass(), "parentRegistryID", "NxgmYPzWCI");
        setField(term7726, term7726.getClass(), "domainID", "SqjyKmayBx");
        setField(term7726, term7726.getClass(), "tenantID", "XjDhvToxJy");
        setField(term7726, term7726.getClass(), "softwareServiceInstanceName", "nxSTJflLQy");
        setField(term7726, term7726.getClass(), "templateName", "FlHzxEfFzI");
        setField(term7726, term7726.getClass(), "globalVariableGroup", "aSATgQUpoe");
        setField(term7726, term7726.getClass(), "isInstanceVariableWithoutPrefix", "VkPSXewZfB");
        setField(term7726, term7726.getClass(), "steps", term8174);
        setField(term7726, term7726.getClass(), "variables", term8178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowID", argTypes, term7726, args);
    }

};


