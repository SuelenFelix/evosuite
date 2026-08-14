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
import java.lang.Boolean;

public class WorkflowCreateInputData_Builder_targetSystemuid_181375671618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22405;

    public WorkflowCreateInputData_Builder_targetSystemuid_181375671618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22454 = new ArrayList();
        Boolean term22518 = new Boolean(false);
        ArrayList term22544 = new ArrayList();
        ((ArrayList) term22544).add("KqQOTshBOL");
        ((ArrayList) term22544).add("cuWgFcYkPC");
        ((ArrayList) term22544).add("HfbcOKkXBm");
        ((ArrayList) term22544).add("pLbTzSMbsN");
        ((ArrayList) term22544).add("lFSbxerCPP");
        ((ArrayList) term22544).add("vjaZIyixCm");
        ((ArrayList) term22544).add("gAAPyftlIR");
        Boolean term22632 = new Boolean(false);
        Boolean term22646 = new Boolean(false);
        term22405 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term22405, term22405.getClass(), "workflowName", "raNzcEorkV");
        setField(term22405, term22405.getClass(), "workflowDefinitionFile", "nEgozCeoUr");
        setField(term22405, term22405.getClass(), "workflowDefinitionFileSystem", "EWGMzlcOnW");
        setField(term22405, term22405.getClass(), "variableInputFile", "XeSDJYKMBf");
        setField(term22405, term22405.getClass(), "variables", term22454);
        setField(term22405, term22405.getClass(), "resolveGlobalConflictByUsing", "tIsFcOGTUX");
        setField(term22405, term22405.getClass(), "system", "XUVRcnELFP");
        setField(term22405, term22405.getClass(), "owner", "xIeSbezmkD");
        setField(term22405, term22405.getClass(), "workflowArchiveSAFID", "txUWLZRkSv");
        setField(term22405, term22405.getClass(), "comments", "gHRMJRsBGm");
        setField(term22405, term22405.getClass(), "assignToOwner", term22518);
        setField(term22405, term22405.getClass(), "accessType", "rZyrfnMvHa");
        setField(term22405, term22405.getClass(), "accountInfo", "GMyMhTZeDC");
        setField(term22405, term22405.getClass(), "jobStatement", term22544);
        setField(term22405, term22405.getClass(), "deleteCompletedJobs", term22632);
        setField(term22405, term22405.getClass(), "jobsOutputDirectory", "kevWstoxwq");
        setField(term22405, term22405.getClass(), "autoDeleteOnCompletion", term22646);
        setField(term22405, term22405.getClass(), "targetSystemuid", "aSYOhFwzSm");
        setField(term22405, term22405.getClass(), "targetSystempwd", "pVZlzrBeDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EfSUvjuZAA";
        callMethod(klass, "targetSystemuid", argTypes, term22405, args);
    }

};


