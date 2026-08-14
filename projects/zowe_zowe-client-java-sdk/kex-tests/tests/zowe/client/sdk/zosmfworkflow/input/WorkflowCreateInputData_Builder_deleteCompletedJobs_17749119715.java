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

public class WorkflowCreateInputData_Builder_deleteCompletedJobs_17749119715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21122;
     Object term21356;

    public WorkflowCreateInputData_Builder_deleteCompletedJobs_17749119715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21173 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21173, term21173.getClass(), "name", "");
        setField(term21173, term21173.getClass(), "value", "");
        ArrayList term21171 = new ArrayList();
        ((ArrayList) term21171).add(term21173);
        Boolean term21238 = new Boolean(true);
        ArrayList term21264 = new ArrayList();
        ((ArrayList) term21264).add("soJHvZwbtF");
        ((ArrayList) term21264).add("dTGwgkfDVj");
        ((ArrayList) term21264).add("zHiuLPzYQM");
        ((ArrayList) term21264).add("ioYxUYJBrh");
        Boolean term21316 = new Boolean(true);
        Boolean term21330 = new Boolean(false);
        term21122 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term21122, term21122.getClass(), "workflowName", "VJgREHwfRM");
        setField(term21122, term21122.getClass(), "workflowDefinitionFile", "kXnpLIZTAr");
        setField(term21122, term21122.getClass(), "workflowDefinitionFileSystem", "ZiMAmqpbzk");
        setField(term21122, term21122.getClass(), "variableInputFile", "UwJtBPAtSU");
        setField(term21122, term21122.getClass(), "variables", term21171);
        setField(term21122, term21122.getClass(), "resolveGlobalConflictByUsing", "ngeHWMRjnn");
        setField(term21122, term21122.getClass(), "system", "FOKfDXQxMM");
        setField(term21122, term21122.getClass(), "owner", "gbxMvhrWpA");
        setField(term21122, term21122.getClass(), "workflowArchiveSAFID", "huNTIobUHx");
        setField(term21122, term21122.getClass(), "comments", "MrVeCmRVzF");
        setField(term21122, term21122.getClass(), "assignToOwner", term21238);
        setField(term21122, term21122.getClass(), "accessType", "CPVnQYACKw");
        setField(term21122, term21122.getClass(), "accountInfo", "sbdLhVCRsw");
        setField(term21122, term21122.getClass(), "jobStatement", term21264);
        setField(term21122, term21122.getClass(), "deleteCompletedJobs", term21316);
        setField(term21122, term21122.getClass(), "jobsOutputDirectory", "GXoLEdKEIe");
        setField(term21122, term21122.getClass(), "autoDeleteOnCompletion", term21330);
        setField(term21122, term21122.getClass(), "targetSystemuid", "EugWXkztim");
        setField(term21122, term21122.getClass(), "targetSystempwd", "DvRdOzzihn");
        term21356 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term21356;
        callMethod(klass, "deleteCompletedJobs", argTypes, term21122, args);
    }

};


