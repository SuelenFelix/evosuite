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

public class WorkflowGetPropertiesResponse_getContainsParallelSteps_211269632562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37823;

    public WorkflowGetPropertiesResponse_getContainsParallelSteps_211269632562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37823 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37823, term37823.getClass(), "workflowName", null);
        setField(term37823, term37823.getClass(), "workflowKey", null);
        setField(term37823, term37823.getClass(), "workflowDescription", null);
        setField(term37823, term37823.getClass(), "workflowID", null);
        setField(term37823, term37823.getClass(), "workflowVersion", null);
        setField(term37823, term37823.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37823, term37823.getClass(), "vendor", null);
        setField(term37823, term37823.getClass(), "owner", null);
        setField(term37823, term37823.getClass(), "workflowArchiveSAFID", null);
        setField(term37823, term37823.getClass(), "system", null);
        setField(term37823, term37823.getClass(), "jobsOutputDirectory", null);
        setField(term37823, term37823.getClass(), "category", null);
        setField(term37823, term37823.getClass(), "productID", null);
        setField(term37823, term37823.getClass(), "productName", null);
        setField(term37823, term37823.getClass(), "productVersion", null);
        setField(term37823, term37823.getClass(), "percentComplete", null);
        setField(term37823, term37823.getClass(), "isCallable", null);
        setField(term37823, term37823.getClass(), "containsParallelSteps", null);
        setField(term37823, term37823.getClass(), "scope", null);
        setField(term37823, term37823.getClass(), "statusName", null);
        setField(term37823, term37823.getClass(), "deleteCompletedJobs", null);
        setField(term37823, term37823.getClass(), "automationStatus", null);
        setField(term37823, term37823.getClass(), "autoDeleteOnCompletion", null);
        setField(term37823, term37823.getClass(), "access", null);
        setField(term37823, term37823.getClass(), "accountInfo", null);
        setField(term37823, term37823.getClass(), "jobStatement", null);
        setField(term37823, term37823.getClass(), "templateID", null);
        setField(term37823, term37823.getClass(), "actionID", null);
        setField(term37823, term37823.getClass(), "registryID", null);
        setField(term37823, term37823.getClass(), "parentRegistryID", null);
        setField(term37823, term37823.getClass(), "domainID", null);
        setField(term37823, term37823.getClass(), "tenantID", null);
        setField(term37823, term37823.getClass(), "softwareServiceInstanceName", null);
        setField(term37823, term37823.getClass(), "templateName", null);
        setField(term37823, term37823.getClass(), "globalVariableGroup", null);
        setField(term37823, term37823.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37823, term37823.getClass(), "steps", null);
        setField(term37823, term37823.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContainsParallelSteps", argTypes, term37823, args);
    }

};


