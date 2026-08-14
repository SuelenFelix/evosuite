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

public class WorkflowCreate_createLocal_8298924884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3208;
     Object term3211;
     Object term3469;

    public WorkflowCreate_createLocal_8298924884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3208 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate"));
        Object term3209 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        Object term3210 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssDelete"));
        setField(term3208, term3208.getClass(), "connection", null);
        setField(term3208, term3208.getClass(), "request", null);
        setField(term3209, term3209.getClass(), "connection", null);
        setField(term3209, term3209.getClass(), "request", null);
        setField(term3208, term3208.getClass(), "ussWrite", term3209);
        setField(term3210, term3210.getClass(), "connection", null);
        setField(term3210, term3210.getClass(), "request", null);
        setField(term3208, term3208.getClass(), "ussDelete", term3210);
        Object term3262 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term3262, term3262.getClass(), "name", "");
        setField(term3262, term3262.getClass(), "value", "");
        ArrayList term3260 = new ArrayList();
        ((ArrayList) term3260).add(term3262);
        Boolean term3327 = new Boolean(true);
        ArrayList term3353 = new ArrayList();
        ((ArrayList) term3353).add("cAPeiZHKGJ");
        ((ArrayList) term3353).add("LvJFtLBaxj");
        ((ArrayList) term3353).add("PHvxnGHptP");
        ((ArrayList) term3353).add("TimdotUuNC");
        ((ArrayList) term3353).add("PkWMRdJcBb");
        ((ArrayList) term3353).add("jSpAteRute");
        Boolean term3429 = new Boolean(true);
        Boolean term3443 = new Boolean(false);
        term3211 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term3211, term3211.getClass(), "workflowName", "IgRJUzaCwW");
        setField(term3211, term3211.getClass(), "workflowDefinitionFile", "JUmudUmaaV");
        setField(term3211, term3211.getClass(), "workflowDefinitionFileSystem", "KoyGrUJeJW");
        setField(term3211, term3211.getClass(), "variableInputFile", "HqBOwkVqjD");
        setField(term3211, term3211.getClass(), "variables", term3260);
        setField(term3211, term3211.getClass(), "resolveGlobalConflictByUsing", "vQVyKLdtaz");
        setField(term3211, term3211.getClass(), "system", "OWKQODBLzb");
        setField(term3211, term3211.getClass(), "owner", "wGmYcqUkgE");
        setField(term3211, term3211.getClass(), "workflowArchiveSAFID", "idgaQsnJpQ");
        setField(term3211, term3211.getClass(), "comments", "VgZnGoIFwQ");
        setField(term3211, term3211.getClass(), "assignToOwner", term3327);
        setField(term3211, term3211.getClass(), "accessType", "jUbSRrkrYZ");
        setField(term3211, term3211.getClass(), "accountInfo", "bWWfajKbEX");
        setField(term3211, term3211.getClass(), "jobStatement", term3353);
        setField(term3211, term3211.getClass(), "deleteCompletedJobs", term3429);
        setField(term3211, term3211.getClass(), "jobsOutputDirectory", "swZVeJAxjt");
        setField(term3211, term3211.getClass(), "autoDeleteOnCompletion", term3443);
        setField(term3211, term3211.getClass(), "targetSystemuid", "xOcJIiQQDu");
        setField(term3211, term3211.getClass(), "targetSystempwd", "GVizqqzXpy");
        term3469 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term3211;
        args[1] = term3469;
        args[2] = "JqXGgAhZPl";
        callMethod(klass, "createLocal", argTypes, term3208, args);
    }

};


