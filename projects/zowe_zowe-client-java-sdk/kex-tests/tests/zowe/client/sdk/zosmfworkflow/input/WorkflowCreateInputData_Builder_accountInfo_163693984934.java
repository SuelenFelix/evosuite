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

public class WorkflowCreateInputData_Builder_accountInfo_163693984934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23863;

    public WorkflowCreateInputData_Builder_accountInfo_163693984934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23863 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term23863, term23863.getClass(), "workflowName", null);
        setField(term23863, term23863.getClass(), "workflowDefinitionFile", null);
        setField(term23863, term23863.getClass(), "workflowDefinitionFileSystem", null);
        setField(term23863, term23863.getClass(), "variableInputFile", null);
        setField(term23863, term23863.getClass(), "variables", null);
        setField(term23863, term23863.getClass(), "resolveGlobalConflictByUsing", null);
        setField(term23863, term23863.getClass(), "system", null);
        setField(term23863, term23863.getClass(), "owner", null);
        setField(term23863, term23863.getClass(), "workflowArchiveSAFID", null);
        setField(term23863, term23863.getClass(), "comments", null);
        setField(term23863, term23863.getClass(), "assignToOwner", null);
        setField(term23863, term23863.getClass(), "accessType", null);
        setField(term23863, term23863.getClass(), "accountInfo", null);
        setField(term23863, term23863.getClass(), "jobStatement", null);
        setField(term23863, term23863.getClass(), "deleteCompletedJobs", null);
        setField(term23863, term23863.getClass(), "jobsOutputDirectory", null);
        setField(term23863, term23863.getClass(), "autoDeleteOnCompletion", null);
        setField(term23863, term23863.getClass(), "targetSystemuid", null);
        setField(term23863, term23863.getClass(), "targetSystempwd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accountInfo", argTypes, term23863, args);
    }

};


