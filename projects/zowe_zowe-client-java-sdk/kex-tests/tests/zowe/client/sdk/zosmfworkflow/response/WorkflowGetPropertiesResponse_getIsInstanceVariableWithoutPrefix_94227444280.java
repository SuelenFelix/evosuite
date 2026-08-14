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

public class WorkflowGetPropertiesResponse_getIsInstanceVariableWithoutPrefix_94227444280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37841;

    public WorkflowGetPropertiesResponse_getIsInstanceVariableWithoutPrefix_94227444280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37841 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37841, term37841.getClass(), "workflowName", null);
        setField(term37841, term37841.getClass(), "workflowKey", null);
        setField(term37841, term37841.getClass(), "workflowDescription", null);
        setField(term37841, term37841.getClass(), "workflowID", null);
        setField(term37841, term37841.getClass(), "workflowVersion", null);
        setField(term37841, term37841.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37841, term37841.getClass(), "vendor", null);
        setField(term37841, term37841.getClass(), "owner", null);
        setField(term37841, term37841.getClass(), "workflowArchiveSAFID", null);
        setField(term37841, term37841.getClass(), "system", null);
        setField(term37841, term37841.getClass(), "jobsOutputDirectory", null);
        setField(term37841, term37841.getClass(), "category", null);
        setField(term37841, term37841.getClass(), "productID", null);
        setField(term37841, term37841.getClass(), "productName", null);
        setField(term37841, term37841.getClass(), "productVersion", null);
        setField(term37841, term37841.getClass(), "percentComplete", null);
        setField(term37841, term37841.getClass(), "isCallable", null);
        setField(term37841, term37841.getClass(), "containsParallelSteps", null);
        setField(term37841, term37841.getClass(), "scope", null);
        setField(term37841, term37841.getClass(), "statusName", null);
        setField(term37841, term37841.getClass(), "deleteCompletedJobs", null);
        setField(term37841, term37841.getClass(), "automationStatus", null);
        setField(term37841, term37841.getClass(), "autoDeleteOnCompletion", null);
        setField(term37841, term37841.getClass(), "access", null);
        setField(term37841, term37841.getClass(), "accountInfo", null);
        setField(term37841, term37841.getClass(), "jobStatement", null);
        setField(term37841, term37841.getClass(), "templateID", null);
        setField(term37841, term37841.getClass(), "actionID", null);
        setField(term37841, term37841.getClass(), "registryID", null);
        setField(term37841, term37841.getClass(), "parentRegistryID", null);
        setField(term37841, term37841.getClass(), "domainID", null);
        setField(term37841, term37841.getClass(), "tenantID", null);
        setField(term37841, term37841.getClass(), "softwareServiceInstanceName", null);
        setField(term37841, term37841.getClass(), "templateName", null);
        setField(term37841, term37841.getClass(), "globalVariableGroup", null);
        setField(term37841, term37841.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37841, term37841.getClass(), "steps", null);
        setField(term37841, term37841.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsInstanceVariableWithoutPrefix", argTypes, term37841, args);
    }

};


