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

public class WorkflowGetPropertiesResponse_orEmpty_193035728843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37804;

    public WorkflowGetPropertiesResponse_orEmpty_193035728843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37804 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37804, term37804.getClass(), "workflowName", null);
        setField(term37804, term37804.getClass(), "workflowKey", null);
        setField(term37804, term37804.getClass(), "workflowDescription", null);
        setField(term37804, term37804.getClass(), "workflowID", null);
        setField(term37804, term37804.getClass(), "workflowVersion", null);
        setField(term37804, term37804.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37804, term37804.getClass(), "vendor", null);
        setField(term37804, term37804.getClass(), "owner", null);
        setField(term37804, term37804.getClass(), "workflowArchiveSAFID", null);
        setField(term37804, term37804.getClass(), "system", null);
        setField(term37804, term37804.getClass(), "jobsOutputDirectory", null);
        setField(term37804, term37804.getClass(), "category", null);
        setField(term37804, term37804.getClass(), "productID", null);
        setField(term37804, term37804.getClass(), "productName", null);
        setField(term37804, term37804.getClass(), "productVersion", null);
        setField(term37804, term37804.getClass(), "percentComplete", null);
        setField(term37804, term37804.getClass(), "isCallable", null);
        setField(term37804, term37804.getClass(), "containsParallelSteps", null);
        setField(term37804, term37804.getClass(), "scope", null);
        setField(term37804, term37804.getClass(), "statusName", null);
        setField(term37804, term37804.getClass(), "deleteCompletedJobs", null);
        setField(term37804, term37804.getClass(), "automationStatus", null);
        setField(term37804, term37804.getClass(), "autoDeleteOnCompletion", null);
        setField(term37804, term37804.getClass(), "access", null);
        setField(term37804, term37804.getClass(), "accountInfo", null);
        setField(term37804, term37804.getClass(), "jobStatement", null);
        setField(term37804, term37804.getClass(), "templateID", null);
        setField(term37804, term37804.getClass(), "actionID", null);
        setField(term37804, term37804.getClass(), "registryID", null);
        setField(term37804, term37804.getClass(), "parentRegistryID", null);
        setField(term37804, term37804.getClass(), "domainID", null);
        setField(term37804, term37804.getClass(), "tenantID", null);
        setField(term37804, term37804.getClass(), "softwareServiceInstanceName", null);
        setField(term37804, term37804.getClass(), "templateName", null);
        setField(term37804, term37804.getClass(), "globalVariableGroup", null);
        setField(term37804, term37804.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37804, term37804.getClass(), "steps", null);
        setField(term37804, term37804.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "orEmpty", argTypes, term37804, args);
    }

};


