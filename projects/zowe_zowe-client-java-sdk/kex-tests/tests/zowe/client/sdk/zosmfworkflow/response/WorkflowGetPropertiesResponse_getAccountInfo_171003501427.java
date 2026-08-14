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

public class WorkflowGetPropertiesResponse_getAccountInfo_171003501427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25186;

    public WorkflowGetPropertiesResponse_getAccountInfo_171003501427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25367 = new Integer(1135664017);
        Boolean term25369 = new Boolean(true);
        Boolean term25371 = new Boolean(true);
        Boolean term25397 = new Boolean(false);
        Long term25412 = new Long(-5788180182343976541L);
        Long term25414 = new Long(2936323121573284007L);
        Boolean term25476 = new Boolean(false);
        ArrayList term25634 = new ArrayList();
        ((ArrayList) term25634).add((Object)null);
        ((ArrayList) term25634).add((Object)null);
        ((ArrayList) term25634).add((Object)null);
        ((ArrayList) term25634).add((Object)null);
        ArrayList term25638 = new ArrayList();
        term25186 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term25399 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term25186, term25186.getClass(), "workflowName", "cTCixEbHYT");
        setField(term25186, term25186.getClass(), "workflowKey", "bqKksqtAdT");
        setField(term25186, term25186.getClass(), "workflowDescription", "jAIAdEmULK");
        setField(term25186, term25186.getClass(), "workflowID", "EuAshkmbna");
        setField(term25186, term25186.getClass(), "workflowVersion", "JwQlbBbGJR");
        setField(term25186, term25186.getClass(), "workflowDefinitionFileMD5Value", "HdWLwfVsAM");
        setField(term25186, term25186.getClass(), "vendor", "SxeKEdHXSl");
        setField(term25186, term25186.getClass(), "owner", "BCAlJpNjIX");
        setField(term25186, term25186.getClass(), "workflowArchiveSAFID", "PKClfBAwUr");
        setField(term25186, term25186.getClass(), "system", "JqbKrmVEMy");
        setField(term25186, term25186.getClass(), "jobsOutputDirectory", "VygCEWaefB");
        setField(term25186, term25186.getClass(), "category", "PqhYfEyDDA");
        setField(term25186, term25186.getClass(), "productID", "fSLHLeuNoa");
        setField(term25186, term25186.getClass(), "productName", "IwgPFurObw");
        setField(term25186, term25186.getClass(), "productVersion", "WLaHlrYQyz");
        setField(term25186, term25186.getClass(), "percentComplete", term25367);
        setField(term25186, term25186.getClass(), "isCallable", term25369);
        setField(term25186, term25186.getClass(), "containsParallelSteps", term25371);
        setField(term25186, term25186.getClass(), "scope", "CaeIUTuUFo");
        setField(term25186, term25186.getClass(), "statusName", "rzoDGjHkzG");
        setField(term25186, term25186.getClass(), "deleteCompletedJobs", term25397);
        setField(term25399, term25399.getClass(), "startUser", "NsphHxYiuC");
        setField(term25399, term25399.getClass(), "startedTime", term25412);
        setField(term25399, term25399.getClass(), "stoppedTime", term25414);
        setField(term25399, term25399.getClass(), "currentStepName", "XYJztkznbY");
        setField(term25399, term25399.getClass(), "currentStepNumber", "NeTiWVoyjZ");
        setField(term25399, term25399.getClass(), "currentStepTitle", "CGeclMyIOP");
        setField(term25399, term25399.getClass(), "messageID", "yyWOYvIBsp");
        setField(term25399, term25399.getClass(), "messageText", "mmpgARMYFV");
        setField(term25186, term25186.getClass(), "automationStatus", term25399);
        setField(term25186, term25186.getClass(), "autoDeleteOnCompletion", term25476);
        setField(term25186, term25186.getClass(), "access", "NUqhsZprdZ");
        setField(term25186, term25186.getClass(), "accountInfo", "jkzgCqWJrA");
        setField(term25186, term25186.getClass(), "jobStatement", "rawiXxuyRn");
        setField(term25186, term25186.getClass(), "templateID", "ZyAecZGope");
        setField(term25186, term25186.getClass(), "actionID", "uYnmxkwLfB");
        setField(term25186, term25186.getClass(), "registryID", "RVZTQxYOUO");
        setField(term25186, term25186.getClass(), "parentRegistryID", "tydPpKxAbv");
        setField(term25186, term25186.getClass(), "domainID", "CJxQpJUfLJ");
        setField(term25186, term25186.getClass(), "tenantID", "NUUjAyqOva");
        setField(term25186, term25186.getClass(), "softwareServiceInstanceName", "EoAMIIUdDX");
        setField(term25186, term25186.getClass(), "templateName", "OATNwRncsv");
        setField(term25186, term25186.getClass(), "globalVariableGroup", "rACmzcmIPm");
        setField(term25186, term25186.getClass(), "isInstanceVariableWithoutPrefix", "OCtePrLDhe");
        setField(term25186, term25186.getClass(), "steps", term25634);
        setField(term25186, term25186.getClass(), "variables", term25638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountInfo", argTypes, term25186, args);
    }

};


