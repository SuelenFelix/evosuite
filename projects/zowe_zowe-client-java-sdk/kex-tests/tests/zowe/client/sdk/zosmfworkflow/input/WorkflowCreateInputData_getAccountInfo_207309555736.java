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

public class WorkflowCreateInputData_getAccountInfo_207309555736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15171;

    public WorkflowCreateInputData_getAccountInfo_207309555736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15171 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term15171, term15171.getClass(), "workflowName", null);
        setField(term15171, term15171.getClass(), "workflowDefinitionFile", null);
        setField(term15171, term15171.getClass(), "workflowDefinitionFileSystem", null);
        setField(term15171, term15171.getClass(), "variableInputFile", null);
        setField(term15171, term15171.getClass(), "variables", null);
        setField(term15171, term15171.getClass(), "resolveGlobalConflictByUsing", null);
        setField(term15171, term15171.getClass(), "system", null);
        setField(term15171, term15171.getClass(), "owner", null);
        setField(term15171, term15171.getClass(), "workflowArchiveSAFID", null);
        setField(term15171, term15171.getClass(), "comments", null);
        setField(term15171, term15171.getClass(), "assignToOwner", null);
        setField(term15171, term15171.getClass(), "accessType", null);
        setField(term15171, term15171.getClass(), "accountInfo", null);
        setField(term15171, term15171.getClass(), "jobStatement", null);
        setField(term15171, term15171.getClass(), "deleteCompletedJobs", null);
        setField(term15171, term15171.getClass(), "jobsOutputDirectory", null);
        setField(term15171, term15171.getClass(), "autoDeleteOnCompletion", null);
        setField(term15171, term15171.getClass(), "targetSystemuid", null);
        setField(term15171, term15171.getClass(), "targetSystempwd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountInfo", argTypes, term15171, args);
    }

};


