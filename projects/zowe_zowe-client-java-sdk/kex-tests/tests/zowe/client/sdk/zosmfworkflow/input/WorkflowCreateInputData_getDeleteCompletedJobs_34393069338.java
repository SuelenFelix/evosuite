package zowe.client.sdk.zosmfworkflow.input;

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
import static zowe.client.sdk.zosmfworkflow.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowCreateInputData_getDeleteCompletedJobs_34393069338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15173;

    public WorkflowCreateInputData_getDeleteCompletedJobs_34393069338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15173 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term15173, term15173.getClass(), "workflowName", null);
        setField(term15173, term15173.getClass(), "workflowDefinitionFile", null);
        setField(term15173, term15173.getClass(), "workflowDefinitionFileSystem", null);
        setField(term15173, term15173.getClass(), "variableInputFile", null);
        setField(term15173, term15173.getClass(), "variables", null);
        setField(term15173, term15173.getClass(), "resolveGlobalConflictByUsing", null);
        setField(term15173, term15173.getClass(), "system", null);
        setField(term15173, term15173.getClass(), "owner", null);
        setField(term15173, term15173.getClass(), "workflowArchiveSAFID", null);
        setField(term15173, term15173.getClass(), "comments", null);
        setField(term15173, term15173.getClass(), "assignToOwner", null);
        setField(term15173, term15173.getClass(), "accessType", null);
        setField(term15173, term15173.getClass(), "accountInfo", null);
        setField(term15173, term15173.getClass(), "jobStatement", null);
        setField(term15173, term15173.getClass(), "deleteCompletedJobs", null);
        setField(term15173, term15173.getClass(), "jobsOutputDirectory", null);
        setField(term15173, term15173.getClass(), "autoDeleteOnCompletion", null);
        setField(term15173, term15173.getClass(), "targetSystemuid", null);
        setField(term15173, term15173.getClass(), "targetSystempwd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleteCompletedJobs", argTypes, term15173, args);
    }

};


