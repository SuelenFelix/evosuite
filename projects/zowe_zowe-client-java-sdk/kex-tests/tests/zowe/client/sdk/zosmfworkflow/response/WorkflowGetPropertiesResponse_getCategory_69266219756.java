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

public class WorkflowGetPropertiesResponse_getCategory_69266219756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37817;

    public WorkflowGetPropertiesResponse_getCategory_69266219756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37817 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37817, term37817.getClass(), "workflowName", null);
        setField(term37817, term37817.getClass(), "workflowKey", null);
        setField(term37817, term37817.getClass(), "workflowDescription", null);
        setField(term37817, term37817.getClass(), "workflowID", null);
        setField(term37817, term37817.getClass(), "workflowVersion", null);
        setField(term37817, term37817.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37817, term37817.getClass(), "vendor", null);
        setField(term37817, term37817.getClass(), "owner", null);
        setField(term37817, term37817.getClass(), "workflowArchiveSAFID", null);
        setField(term37817, term37817.getClass(), "system", null);
        setField(term37817, term37817.getClass(), "jobsOutputDirectory", null);
        setField(term37817, term37817.getClass(), "category", null);
        setField(term37817, term37817.getClass(), "productID", null);
        setField(term37817, term37817.getClass(), "productName", null);
        setField(term37817, term37817.getClass(), "productVersion", null);
        setField(term37817, term37817.getClass(), "percentComplete", null);
        setField(term37817, term37817.getClass(), "isCallable", null);
        setField(term37817, term37817.getClass(), "containsParallelSteps", null);
        setField(term37817, term37817.getClass(), "scope", null);
        setField(term37817, term37817.getClass(), "statusName", null);
        setField(term37817, term37817.getClass(), "deleteCompletedJobs", null);
        setField(term37817, term37817.getClass(), "automationStatus", null);
        setField(term37817, term37817.getClass(), "autoDeleteOnCompletion", null);
        setField(term37817, term37817.getClass(), "access", null);
        setField(term37817, term37817.getClass(), "accountInfo", null);
        setField(term37817, term37817.getClass(), "jobStatement", null);
        setField(term37817, term37817.getClass(), "templateID", null);
        setField(term37817, term37817.getClass(), "actionID", null);
        setField(term37817, term37817.getClass(), "registryID", null);
        setField(term37817, term37817.getClass(), "parentRegistryID", null);
        setField(term37817, term37817.getClass(), "domainID", null);
        setField(term37817, term37817.getClass(), "tenantID", null);
        setField(term37817, term37817.getClass(), "softwareServiceInstanceName", null);
        setField(term37817, term37817.getClass(), "templateName", null);
        setField(term37817, term37817.getClass(), "globalVariableGroup", null);
        setField(term37817, term37817.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37817, term37817.getClass(), "steps", null);
        setField(term37817, term37817.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term37817, args);
    }

};


