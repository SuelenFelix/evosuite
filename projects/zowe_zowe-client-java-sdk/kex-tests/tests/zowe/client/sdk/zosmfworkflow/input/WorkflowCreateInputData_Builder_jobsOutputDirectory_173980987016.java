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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class WorkflowCreateInputData_Builder_jobsOutputDirectory_173980987016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21538;

    public WorkflowCreateInputData_Builder_jobsOutputDirectory_173980987016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21589 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21589, term21589.getClass(), "name", "");
        setField(term21589, term21589.getClass(), "value", "");
        ArrayList term21587 = new ArrayList();
        ((ArrayList) term21587).add(term21589);
        Boolean term21654 = new Boolean(false);
        ArrayList term21680 = new ArrayList();
        ((ArrayList) term21680).add("vbSWeJWOQh");
        Boolean term21696 = new Boolean(false);
        Boolean term21710 = new Boolean(false);
        term21538 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term21538, term21538.getClass(), "workflowName", "wIygCdQAKO");
        setField(term21538, term21538.getClass(), "workflowDefinitionFile", "JsXroBYqwr");
        setField(term21538, term21538.getClass(), "workflowDefinitionFileSystem", "YciMAObLwl");
        setField(term21538, term21538.getClass(), "variableInputFile", "qAmVqwwdyf");
        setField(term21538, term21538.getClass(), "variables", term21587);
        setField(term21538, term21538.getClass(), "resolveGlobalConflictByUsing", "EAMaFLdmaG");
        setField(term21538, term21538.getClass(), "system", "DYZSJMwbhX");
        setField(term21538, term21538.getClass(), "owner", "QGcshsIIWo");
        setField(term21538, term21538.getClass(), "workflowArchiveSAFID", "dPHtrzKWgf");
        setField(term21538, term21538.getClass(), "comments", "olmFxfIVeh");
        setField(term21538, term21538.getClass(), "assignToOwner", term21654);
        setField(term21538, term21538.getClass(), "accessType", "iSPirUEhXs");
        setField(term21538, term21538.getClass(), "accountInfo", "WWyLFmYpAy");
        setField(term21538, term21538.getClass(), "jobStatement", term21680);
        setField(term21538, term21538.getClass(), "deleteCompletedJobs", term21696);
        setField(term21538, term21538.getClass(), "jobsOutputDirectory", "hyvFdAvkOr");
        setField(term21538, term21538.getClass(), "autoDeleteOnCompletion", term21710);
        setField(term21538, term21538.getClass(), "targetSystemuid", "ewbQRtustW");
        setField(term21538, term21538.getClass(), "targetSystempwd", "cABEHYBnys");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EhlWSobaco";
        callMethod(klass, "jobsOutputDirectory", argTypes, term21538, args);
    }

};


