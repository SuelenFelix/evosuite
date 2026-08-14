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

public class WorkflowCreateInputData_Builder_workflowName_615184381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15181;

    public WorkflowCreateInputData_Builder_workflowName_615184381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15232 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15232, term15232.getClass(), "name", "");
        setField(term15232, term15232.getClass(), "value", "");
        Object term15235 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15235, term15235.getClass(), "name", "");
        setField(term15235, term15235.getClass(), "value", "");
        Object term15238 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15238, term15238.getClass(), "name", "");
        setField(term15238, term15238.getClass(), "value", "");
        Object term15241 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15241, term15241.getClass(), "name", "");
        setField(term15241, term15241.getClass(), "value", "");
        Object term15244 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15244, term15244.getClass(), "name", "");
        setField(term15244, term15244.getClass(), "value", "");
        Object term15247 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15247, term15247.getClass(), "name", "");
        setField(term15247, term15247.getClass(), "value", "");
        Object term15250 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15250, term15250.getClass(), "name", "");
        setField(term15250, term15250.getClass(), "value", "");
        Object term15253 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15253, term15253.getClass(), "name", "");
        setField(term15253, term15253.getClass(), "value", "");
        ArrayList term15230 = new ArrayList();
        ((ArrayList) term15230).add(term15232);
        ((ArrayList) term15230).add(term15235);
        ((ArrayList) term15230).add(term15238);
        ((ArrayList) term15230).add(term15241);
        ((ArrayList) term15230).add(term15244);
        ((ArrayList) term15230).add(term15247);
        ((ArrayList) term15230).add(term15250);
        ((ArrayList) term15230).add(term15253);
        Boolean term15318 = new Boolean(true);
        ArrayList term15344 = new ArrayList();
        ((ArrayList) term15344).add("njvnWFTMxN");
        ((ArrayList) term15344).add("fLRqcTSfzF");
        ((ArrayList) term15344).add("EBYHwsuWAU");
        Boolean term15384 = new Boolean(true);
        Boolean term15398 = new Boolean(true);
        term15181 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term15181, term15181.getClass(), "workflowName", "wgRGBNrTGP");
        setField(term15181, term15181.getClass(), "workflowDefinitionFile", "FIdNVptZpW");
        setField(term15181, term15181.getClass(), "workflowDefinitionFileSystem", "rQjxAhisjm");
        setField(term15181, term15181.getClass(), "variableInputFile", "ZDhASPHjDG");
        setField(term15181, term15181.getClass(), "variables", term15230);
        setField(term15181, term15181.getClass(), "resolveGlobalConflictByUsing", "lnvLKbtveE");
        setField(term15181, term15181.getClass(), "system", "FfrrEhTHzQ");
        setField(term15181, term15181.getClass(), "owner", "LXnDNrMsqT");
        setField(term15181, term15181.getClass(), "workflowArchiveSAFID", "ZLQamJFBmu");
        setField(term15181, term15181.getClass(), "comments", "ZWcOCwKNvd");
        setField(term15181, term15181.getClass(), "assignToOwner", term15318);
        setField(term15181, term15181.getClass(), "accessType", "GTmoNrziyc");
        setField(term15181, term15181.getClass(), "accountInfo", "LvztehSlhM");
        setField(term15181, term15181.getClass(), "jobStatement", term15344);
        setField(term15181, term15181.getClass(), "deleteCompletedJobs", term15384);
        setField(term15181, term15181.getClass(), "jobsOutputDirectory", "PtIjKpiSix");
        setField(term15181, term15181.getClass(), "autoDeleteOnCompletion", term15398);
        setField(term15181, term15181.getClass(), "targetSystemuid", "NZdTuwSCIM");
        setField(term15181, term15181.getClass(), "targetSystempwd", "dDHcmzPAmP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HEaTkWYBgv";
        callMethod(klass, "workflowName", argTypes, term15181, args);
    }

};


