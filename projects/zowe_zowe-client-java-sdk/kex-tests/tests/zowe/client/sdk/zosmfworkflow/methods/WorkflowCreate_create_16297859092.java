package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class WorkflowCreate_create_16297859092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2356;
     Object term2359;

    public WorkflowCreate_create_16297859092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2356 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate"));
        Object term2357 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        Object term2358 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssDelete"));
        setField(term2356, term2356.getClass(), "connection", null);
        setField(term2356, term2356.getClass(), "request", null);
        setField(term2357, term2357.getClass(), "connection", null);
        setField(term2357, term2357.getClass(), "request", null);
        setField(term2356, term2356.getClass(), "ussWrite", term2357);
        setField(term2358, term2358.getClass(), "connection", null);
        setField(term2358, term2358.getClass(), "request", null);
        setField(term2356, term2356.getClass(), "ussDelete", term2358);
        Object term2410 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2410, term2410.getClass(), "name", "");
        setField(term2410, term2410.getClass(), "value", "");
        Object term2413 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2413, term2413.getClass(), "name", "");
        setField(term2413, term2413.getClass(), "value", "");
        Object term2416 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2416, term2416.getClass(), "name", "");
        setField(term2416, term2416.getClass(), "value", "");
        Object term2419 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2419, term2419.getClass(), "name", "");
        setField(term2419, term2419.getClass(), "value", "");
        Object term2422 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2422, term2422.getClass(), "name", "");
        setField(term2422, term2422.getClass(), "value", "");
        ArrayList term2408 = new ArrayList();
        ((ArrayList) term2408).add(term2410);
        ((ArrayList) term2408).add(term2413);
        ((ArrayList) term2408).add(term2416);
        ((ArrayList) term2408).add(term2419);
        ((ArrayList) term2408).add(term2422);
        Boolean term2487 = new Boolean(false);
        ArrayList term2513 = new ArrayList();
        ((ArrayList) term2513).add("wSQxaModmm");
        ((ArrayList) term2513).add("UlajhuVLaP");
        ((ArrayList) term2513).add("gGSMzuGICf");
        ((ArrayList) term2513).add("hxCBltsObl");
        Boolean term2565 = new Boolean(false);
        Boolean term2579 = new Boolean(false);
        term2359 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term2359, term2359.getClass(), "workflowName", "pCTimMblYc");
        setField(term2359, term2359.getClass(), "workflowDefinitionFile", "hNxWaHcfhY");
        setField(term2359, term2359.getClass(), "workflowDefinitionFileSystem", "RkybSrpybU");
        setField(term2359, term2359.getClass(), "variableInputFile", "xOEqzGAmDU");
        setField(term2359, term2359.getClass(), "variables", term2408);
        setField(term2359, term2359.getClass(), "resolveGlobalConflictByUsing", "SbAoxhfrkn");
        setField(term2359, term2359.getClass(), "system", "kuTXqwMtDB");
        setField(term2359, term2359.getClass(), "owner", "Ghbwtircqb");
        setField(term2359, term2359.getClass(), "workflowArchiveSAFID", "xrwlQZdwCp");
        setField(term2359, term2359.getClass(), "comments", "IDCWpPLRkE");
        setField(term2359, term2359.getClass(), "assignToOwner", term2487);
        setField(term2359, term2359.getClass(), "accessType", "nyiiPDVjAc");
        setField(term2359, term2359.getClass(), "accountInfo", "aKnKipADSo");
        setField(term2359, term2359.getClass(), "jobStatement", term2513);
        setField(term2359, term2359.getClass(), "deleteCompletedJobs", term2565);
        setField(term2359, term2359.getClass(), "jobsOutputDirectory", "BndsHwAFMv");
        setField(term2359, term2359.getClass(), "autoDeleteOnCompletion", term2579);
        setField(term2359, term2359.getClass(), "targetSystemuid", "GzFkzHGYFt");
        setField(term2359, term2359.getClass(), "targetSystempwd", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Object[] args = new Object[1];
        args[0] = term2359;
        callMethod(klass, "create", argTypes, term2356, args);
    }

};


