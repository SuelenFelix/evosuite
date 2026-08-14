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

public class WorkflowCreateInputData_Builder_autoDeleteOnCompletion_42048553417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21908;
     Object term22193;

    public WorkflowCreateInputData_Builder_autoDeleteOnCompletion_42048553417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21959 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21959, term21959.getClass(), "name", "");
        setField(term21959, term21959.getClass(), "value", "");
        Object term21962 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21962, term21962.getClass(), "name", "");
        setField(term21962, term21962.getClass(), "value", "");
        Object term21965 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21965, term21965.getClass(), "name", "");
        setField(term21965, term21965.getClass(), "value", "");
        Object term21968 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21968, term21968.getClass(), "name", "");
        setField(term21968, term21968.getClass(), "value", "");
        Object term21971 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21971, term21971.getClass(), "name", "");
        setField(term21971, term21971.getClass(), "value", "");
        Object term21974 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term21974, term21974.getClass(), "name", "");
        setField(term21974, term21974.getClass(), "value", "");
        ArrayList term21957 = new ArrayList();
        ((ArrayList) term21957).add(term21959);
        ((ArrayList) term21957).add(term21962);
        ((ArrayList) term21957).add(term21965);
        ((ArrayList) term21957).add(term21968);
        ((ArrayList) term21957).add(term21971);
        ((ArrayList) term21957).add(term21974);
        Boolean term22039 = new Boolean(true);
        ArrayList term22065 = new ArrayList();
        ((ArrayList) term22065).add("JayazbYDLK");
        ((ArrayList) term22065).add("ORDuSTrpNA");
        ((ArrayList) term22065).add("hysThIPoEJ");
        ((ArrayList) term22065).add("dfZepHfGwh");
        ((ArrayList) term22065).add("zjfMxUERFZ");
        ((ArrayList) term22065).add("ooVlhmiOff");
        ((ArrayList) term22065).add("dUNzDLXJcj");
        Boolean term22153 = new Boolean(true);
        Boolean term22167 = new Boolean(false);
        term21908 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term21908, term21908.getClass(), "workflowName", "hEuycunsSe");
        setField(term21908, term21908.getClass(), "workflowDefinitionFile", "IMFzXhpNCx");
        setField(term21908, term21908.getClass(), "workflowDefinitionFileSystem", "xAtFmANjwD");
        setField(term21908, term21908.getClass(), "variableInputFile", "ICysuFllEZ");
        setField(term21908, term21908.getClass(), "variables", term21957);
        setField(term21908, term21908.getClass(), "resolveGlobalConflictByUsing", "VZyeaOWYEj");
        setField(term21908, term21908.getClass(), "system", "PErxMBQSUv");
        setField(term21908, term21908.getClass(), "owner", "KZQwbvujui");
        setField(term21908, term21908.getClass(), "workflowArchiveSAFID", "JPUZuGxKlI");
        setField(term21908, term21908.getClass(), "comments", "xqIbVsUspl");
        setField(term21908, term21908.getClass(), "assignToOwner", term22039);
        setField(term21908, term21908.getClass(), "accessType", "GnjLRtJywq");
        setField(term21908, term21908.getClass(), "accountInfo", "TDaodpHTRK");
        setField(term21908, term21908.getClass(), "jobStatement", term22065);
        setField(term21908, term21908.getClass(), "deleteCompletedJobs", term22153);
        setField(term21908, term21908.getClass(), "jobsOutputDirectory", "OrVSjRJVwa");
        setField(term21908, term21908.getClass(), "autoDeleteOnCompletion", term22167);
        setField(term21908, term21908.getClass(), "targetSystemuid", "cdZEcINJAM");
        setField(term21908, term21908.getClass(), "targetSystempwd", "qumYSwcWHz");
        term22193 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term22193;
        callMethod(klass, "autoDeleteOnCompletion", argTypes, term21908, args);
    }

};


