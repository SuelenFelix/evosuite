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

public class WorkflowGetPropertiesResponse_getAccountInfo_171003501469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37830;

    public WorkflowGetPropertiesResponse_getAccountInfo_171003501469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37830 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37830, term37830.getClass(), "workflowName", null);
        setField(term37830, term37830.getClass(), "workflowKey", null);
        setField(term37830, term37830.getClass(), "workflowDescription", null);
        setField(term37830, term37830.getClass(), "workflowID", null);
        setField(term37830, term37830.getClass(), "workflowVersion", null);
        setField(term37830, term37830.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37830, term37830.getClass(), "vendor", null);
        setField(term37830, term37830.getClass(), "owner", null);
        setField(term37830, term37830.getClass(), "workflowArchiveSAFID", null);
        setField(term37830, term37830.getClass(), "system", null);
        setField(term37830, term37830.getClass(), "jobsOutputDirectory", null);
        setField(term37830, term37830.getClass(), "category", null);
        setField(term37830, term37830.getClass(), "productID", null);
        setField(term37830, term37830.getClass(), "productName", null);
        setField(term37830, term37830.getClass(), "productVersion", null);
        setField(term37830, term37830.getClass(), "percentComplete", null);
        setField(term37830, term37830.getClass(), "isCallable", null);
        setField(term37830, term37830.getClass(), "containsParallelSteps", null);
        setField(term37830, term37830.getClass(), "scope", null);
        setField(term37830, term37830.getClass(), "statusName", null);
        setField(term37830, term37830.getClass(), "deleteCompletedJobs", null);
        setField(term37830, term37830.getClass(), "automationStatus", null);
        setField(term37830, term37830.getClass(), "autoDeleteOnCompletion", null);
        setField(term37830, term37830.getClass(), "access", null);
        setField(term37830, term37830.getClass(), "accountInfo", null);
        setField(term37830, term37830.getClass(), "jobStatement", null);
        setField(term37830, term37830.getClass(), "templateID", null);
        setField(term37830, term37830.getClass(), "actionID", null);
        setField(term37830, term37830.getClass(), "registryID", null);
        setField(term37830, term37830.getClass(), "parentRegistryID", null);
        setField(term37830, term37830.getClass(), "domainID", null);
        setField(term37830, term37830.getClass(), "tenantID", null);
        setField(term37830, term37830.getClass(), "softwareServiceInstanceName", null);
        setField(term37830, term37830.getClass(), "templateName", null);
        setField(term37830, term37830.getClass(), "globalVariableGroup", null);
        setField(term37830, term37830.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37830, term37830.getClass(), "steps", null);
        setField(term37830, term37830.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountInfo", argTypes, term37830, args);
    }

};


