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

public class WorkflowCreateInputData_Builder_owner_15306567858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18319;

    public WorkflowCreateInputData_Builder_owner_15306567858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18370 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18370, term18370.getClass(), "name", "");
        setField(term18370, term18370.getClass(), "value", "");
        Object term18373 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18373, term18373.getClass(), "name", "");
        setField(term18373, term18373.getClass(), "value", "");
        Object term18376 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18376, term18376.getClass(), "name", "");
        setField(term18376, term18376.getClass(), "value", "");
        Object term18379 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18379, term18379.getClass(), "name", "");
        setField(term18379, term18379.getClass(), "value", "");
        ArrayList term18368 = new ArrayList();
        ((ArrayList) term18368).add(term18370);
        ((ArrayList) term18368).add(term18373);
        ((ArrayList) term18368).add(term18376);
        ((ArrayList) term18368).add(term18379);
        Boolean term18444 = new Boolean(false);
        ArrayList term18470 = new ArrayList();
        Boolean term18474 = new Boolean(false);
        Boolean term18488 = new Boolean(true);
        term18319 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term18319, term18319.getClass(), "workflowName", "YaDWphDOSz");
        setField(term18319, term18319.getClass(), "workflowDefinitionFile", "nnnmCgFBLw");
        setField(term18319, term18319.getClass(), "workflowDefinitionFileSystem", "hSSCyNEhyH");
        setField(term18319, term18319.getClass(), "variableInputFile", "jDFNSuvZqm");
        setField(term18319, term18319.getClass(), "variables", term18368);
        setField(term18319, term18319.getClass(), "resolveGlobalConflictByUsing", "jdQANIXSTq");
        setField(term18319, term18319.getClass(), "system", "stVcZLTNpu");
        setField(term18319, term18319.getClass(), "owner", "LgXdqWrsLL");
        setField(term18319, term18319.getClass(), "workflowArchiveSAFID", "bbHWyibNmy");
        setField(term18319, term18319.getClass(), "comments", "vYYOYhWMWZ");
        setField(term18319, term18319.getClass(), "assignToOwner", term18444);
        setField(term18319, term18319.getClass(), "accessType", "FLQJOzEXff");
        setField(term18319, term18319.getClass(), "accountInfo", "qlaIVJBSfQ");
        setField(term18319, term18319.getClass(), "jobStatement", term18470);
        setField(term18319, term18319.getClass(), "deleteCompletedJobs", term18474);
        setField(term18319, term18319.getClass(), "jobsOutputDirectory", "lYvIWBFFsq");
        setField(term18319, term18319.getClass(), "autoDeleteOnCompletion", term18488);
        setField(term18319, term18319.getClass(), "targetSystemuid", "tThwsqWKcE");
        setField(term18319, term18319.getClass(), "targetSystempwd", "bkSgsDrkCN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hwjlcimgJH";
        callMethod(klass, "owner", argTypes, term18319, args);
    }

};


