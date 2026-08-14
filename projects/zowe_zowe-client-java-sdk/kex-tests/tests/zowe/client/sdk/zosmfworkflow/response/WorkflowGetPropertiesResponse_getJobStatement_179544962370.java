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

public class WorkflowGetPropertiesResponse_getJobStatement_179544962370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37831;

    public WorkflowGetPropertiesResponse_getJobStatement_179544962370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37831 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37831, term37831.getClass(), "workflowName", null);
        setField(term37831, term37831.getClass(), "workflowKey", null);
        setField(term37831, term37831.getClass(), "workflowDescription", null);
        setField(term37831, term37831.getClass(), "workflowID", null);
        setField(term37831, term37831.getClass(), "workflowVersion", null);
        setField(term37831, term37831.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37831, term37831.getClass(), "vendor", null);
        setField(term37831, term37831.getClass(), "owner", null);
        setField(term37831, term37831.getClass(), "workflowArchiveSAFID", null);
        setField(term37831, term37831.getClass(), "system", null);
        setField(term37831, term37831.getClass(), "jobsOutputDirectory", null);
        setField(term37831, term37831.getClass(), "category", null);
        setField(term37831, term37831.getClass(), "productID", null);
        setField(term37831, term37831.getClass(), "productName", null);
        setField(term37831, term37831.getClass(), "productVersion", null);
        setField(term37831, term37831.getClass(), "percentComplete", null);
        setField(term37831, term37831.getClass(), "isCallable", null);
        setField(term37831, term37831.getClass(), "containsParallelSteps", null);
        setField(term37831, term37831.getClass(), "scope", null);
        setField(term37831, term37831.getClass(), "statusName", null);
        setField(term37831, term37831.getClass(), "deleteCompletedJobs", null);
        setField(term37831, term37831.getClass(), "automationStatus", null);
        setField(term37831, term37831.getClass(), "autoDeleteOnCompletion", null);
        setField(term37831, term37831.getClass(), "access", null);
        setField(term37831, term37831.getClass(), "accountInfo", null);
        setField(term37831, term37831.getClass(), "jobStatement", null);
        setField(term37831, term37831.getClass(), "templateID", null);
        setField(term37831, term37831.getClass(), "actionID", null);
        setField(term37831, term37831.getClass(), "registryID", null);
        setField(term37831, term37831.getClass(), "parentRegistryID", null);
        setField(term37831, term37831.getClass(), "domainID", null);
        setField(term37831, term37831.getClass(), "tenantID", null);
        setField(term37831, term37831.getClass(), "softwareServiceInstanceName", null);
        setField(term37831, term37831.getClass(), "templateName", null);
        setField(term37831, term37831.getClass(), "globalVariableGroup", null);
        setField(term37831, term37831.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37831, term37831.getClass(), "steps", null);
        setField(term37831, term37831.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobStatement", argTypes, term37831, args);
    }

};


