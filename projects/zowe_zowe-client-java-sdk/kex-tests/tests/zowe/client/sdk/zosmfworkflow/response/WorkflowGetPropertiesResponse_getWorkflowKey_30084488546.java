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

public class WorkflowGetPropertiesResponse_getWorkflowKey_30084488546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37807;

    public WorkflowGetPropertiesResponse_getWorkflowKey_30084488546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37807 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37807, term37807.getClass(), "workflowName", null);
        setField(term37807, term37807.getClass(), "workflowKey", null);
        setField(term37807, term37807.getClass(), "workflowDescription", null);
        setField(term37807, term37807.getClass(), "workflowID", null);
        setField(term37807, term37807.getClass(), "workflowVersion", null);
        setField(term37807, term37807.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37807, term37807.getClass(), "vendor", null);
        setField(term37807, term37807.getClass(), "owner", null);
        setField(term37807, term37807.getClass(), "workflowArchiveSAFID", null);
        setField(term37807, term37807.getClass(), "system", null);
        setField(term37807, term37807.getClass(), "jobsOutputDirectory", null);
        setField(term37807, term37807.getClass(), "category", null);
        setField(term37807, term37807.getClass(), "productID", null);
        setField(term37807, term37807.getClass(), "productName", null);
        setField(term37807, term37807.getClass(), "productVersion", null);
        setField(term37807, term37807.getClass(), "percentComplete", null);
        setField(term37807, term37807.getClass(), "isCallable", null);
        setField(term37807, term37807.getClass(), "containsParallelSteps", null);
        setField(term37807, term37807.getClass(), "scope", null);
        setField(term37807, term37807.getClass(), "statusName", null);
        setField(term37807, term37807.getClass(), "deleteCompletedJobs", null);
        setField(term37807, term37807.getClass(), "automationStatus", null);
        setField(term37807, term37807.getClass(), "autoDeleteOnCompletion", null);
        setField(term37807, term37807.getClass(), "access", null);
        setField(term37807, term37807.getClass(), "accountInfo", null);
        setField(term37807, term37807.getClass(), "jobStatement", null);
        setField(term37807, term37807.getClass(), "templateID", null);
        setField(term37807, term37807.getClass(), "actionID", null);
        setField(term37807, term37807.getClass(), "registryID", null);
        setField(term37807, term37807.getClass(), "parentRegistryID", null);
        setField(term37807, term37807.getClass(), "domainID", null);
        setField(term37807, term37807.getClass(), "tenantID", null);
        setField(term37807, term37807.getClass(), "softwareServiceInstanceName", null);
        setField(term37807, term37807.getClass(), "templateName", null);
        setField(term37807, term37807.getClass(), "globalVariableGroup", null);
        setField(term37807, term37807.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37807, term37807.getClass(), "steps", null);
        setField(term37807, term37807.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowKey", argTypes, term37807, args);
    }

};


