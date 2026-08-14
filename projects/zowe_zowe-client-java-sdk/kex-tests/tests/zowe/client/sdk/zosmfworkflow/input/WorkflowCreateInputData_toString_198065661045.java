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

public class WorkflowCreateInputData_toString_198065661045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15180;

    public WorkflowCreateInputData_toString_198065661045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15180 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term15180, term15180.getClass(), "workflowName", null);
        setField(term15180, term15180.getClass(), "workflowDefinitionFile", null);
        setField(term15180, term15180.getClass(), "workflowDefinitionFileSystem", null);
        setField(term15180, term15180.getClass(), "variableInputFile", null);
        setField(term15180, term15180.getClass(), "variables", null);
        setField(term15180, term15180.getClass(), "resolveGlobalConflictByUsing", null);
        setField(term15180, term15180.getClass(), "system", null);
        setField(term15180, term15180.getClass(), "owner", null);
        setField(term15180, term15180.getClass(), "workflowArchiveSAFID", null);
        setField(term15180, term15180.getClass(), "comments", null);
        setField(term15180, term15180.getClass(), "assignToOwner", null);
        setField(term15180, term15180.getClass(), "accessType", null);
        setField(term15180, term15180.getClass(), "accountInfo", null);
        setField(term15180, term15180.getClass(), "jobStatement", null);
        setField(term15180, term15180.getClass(), "deleteCompletedJobs", null);
        setField(term15180, term15180.getClass(), "jobsOutputDirectory", null);
        setField(term15180, term15180.getClass(), "autoDeleteOnCompletion", null);
        setField(term15180, term15180.getClass(), "targetSystemuid", null);
        setField(term15180, term15180.getClass(), "targetSystempwd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15180, args);
    }

};


