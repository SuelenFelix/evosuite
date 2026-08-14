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

public class WorkflowGetPropertiesResponse_getStatusName_104109898864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37825;

    public WorkflowGetPropertiesResponse_getStatusName_104109898864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37825 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        setField(term37825, term37825.getClass(), "workflowName", null);
        setField(term37825, term37825.getClass(), "workflowKey", null);
        setField(term37825, term37825.getClass(), "workflowDescription", null);
        setField(term37825, term37825.getClass(), "workflowID", null);
        setField(term37825, term37825.getClass(), "workflowVersion", null);
        setField(term37825, term37825.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term37825, term37825.getClass(), "vendor", null);
        setField(term37825, term37825.getClass(), "owner", null);
        setField(term37825, term37825.getClass(), "workflowArchiveSAFID", null);
        setField(term37825, term37825.getClass(), "system", null);
        setField(term37825, term37825.getClass(), "jobsOutputDirectory", null);
        setField(term37825, term37825.getClass(), "category", null);
        setField(term37825, term37825.getClass(), "productID", null);
        setField(term37825, term37825.getClass(), "productName", null);
        setField(term37825, term37825.getClass(), "productVersion", null);
        setField(term37825, term37825.getClass(), "percentComplete", null);
        setField(term37825, term37825.getClass(), "isCallable", null);
        setField(term37825, term37825.getClass(), "containsParallelSteps", null);
        setField(term37825, term37825.getClass(), "scope", null);
        setField(term37825, term37825.getClass(), "statusName", null);
        setField(term37825, term37825.getClass(), "deleteCompletedJobs", null);
        setField(term37825, term37825.getClass(), "automationStatus", null);
        setField(term37825, term37825.getClass(), "autoDeleteOnCompletion", null);
        setField(term37825, term37825.getClass(), "access", null);
        setField(term37825, term37825.getClass(), "accountInfo", null);
        setField(term37825, term37825.getClass(), "jobStatement", null);
        setField(term37825, term37825.getClass(), "templateID", null);
        setField(term37825, term37825.getClass(), "actionID", null);
        setField(term37825, term37825.getClass(), "registryID", null);
        setField(term37825, term37825.getClass(), "parentRegistryID", null);
        setField(term37825, term37825.getClass(), "domainID", null);
        setField(term37825, term37825.getClass(), "tenantID", null);
        setField(term37825, term37825.getClass(), "softwareServiceInstanceName", null);
        setField(term37825, term37825.getClass(), "templateName", null);
        setField(term37825, term37825.getClass(), "globalVariableGroup", null);
        setField(term37825, term37825.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term37825, term37825.getClass(), "steps", null);
        setField(term37825, term37825.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusName", argTypes, term37825, args);
    }

};


