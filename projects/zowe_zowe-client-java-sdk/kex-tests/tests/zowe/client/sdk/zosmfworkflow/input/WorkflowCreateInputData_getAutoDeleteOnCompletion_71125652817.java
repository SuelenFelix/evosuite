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

public class WorkflowCreateInputData_getAutoDeleteOnCompletion_71125652817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12940;

    public WorkflowCreateInputData_getAutoDeleteOnCompletion_71125652817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12991 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12991, term12991.getClass(), "name", "");
        setField(term12991, term12991.getClass(), "value", "");
        Object term12994 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12994, term12994.getClass(), "name", "");
        setField(term12994, term12994.getClass(), "value", "");
        Object term12997 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12997, term12997.getClass(), "name", "");
        setField(term12997, term12997.getClass(), "value", "");
        ArrayList term12989 = new ArrayList();
        ((ArrayList) term12989).add(term12991);
        ((ArrayList) term12989).add(term12994);
        ((ArrayList) term12989).add(term12997);
        Boolean term13062 = new Boolean(false);
        ArrayList term13088 = new ArrayList();
        ((ArrayList) term13088).add("CNqMxLvtcJ");
        ((ArrayList) term13088).add("ktbqerIaKW");
        ((ArrayList) term13088).add("VoghngXfsK");
        ((ArrayList) term13088).add("GbahCBMvct");
        ((ArrayList) term13088).add("iiHBhsNFgk");
        Boolean term13152 = new Boolean(true);
        Boolean term13166 = new Boolean(false);
        term12940 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term12940, term12940.getClass(), "workflowName", "BYrGukTyof");
        setField(term12940, term12940.getClass(), "workflowDefinitionFile", "jiCGTTzKGB");
        setField(term12940, term12940.getClass(), "workflowDefinitionFileSystem", "MqICFYzDJj");
        setField(term12940, term12940.getClass(), "variableInputFile", "YgQvdcBQKw");
        setField(term12940, term12940.getClass(), "variables", term12989);
        setField(term12940, term12940.getClass(), "resolveGlobalConflictByUsing", "mNHyqmOAFy");
        setField(term12940, term12940.getClass(), "system", "UxgSdhxPCH");
        setField(term12940, term12940.getClass(), "owner", "DAujxZPHJC");
        setField(term12940, term12940.getClass(), "workflowArchiveSAFID", "IlBhdrCvHq");
        setField(term12940, term12940.getClass(), "comments", "OirVUQhauU");
        setField(term12940, term12940.getClass(), "assignToOwner", term13062);
        setField(term12940, term12940.getClass(), "accessType", "GLbyDfbNZI");
        setField(term12940, term12940.getClass(), "accountInfo", "oNLcCYDAsO");
        setField(term12940, term12940.getClass(), "jobStatement", term13088);
        setField(term12940, term12940.getClass(), "deleteCompletedJobs", term13152);
        setField(term12940, term12940.getClass(), "jobsOutputDirectory", "HknsTajwxJ");
        setField(term12940, term12940.getClass(), "autoDeleteOnCompletion", term13166);
        setField(term12940, term12940.getClass(), "targetSystemuid", "XtiurrVYKw");
        setField(term12940, term12940.getClass(), "targetSystempwd", "rsumfoDNHa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAutoDeleteOnCompletion", argTypes, term12940, args);
    }

};


