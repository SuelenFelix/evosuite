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

public class WorkflowCreateInputData_Builder_accessType_156982610612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19939;

    public WorkflowCreateInputData_Builder_accessType_156982610612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19990 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19990, term19990.getClass(), "name", "");
        setField(term19990, term19990.getClass(), "value", "");
        Object term19993 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19993, term19993.getClass(), "name", "");
        setField(term19993, term19993.getClass(), "value", "");
        Object term19996 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19996, term19996.getClass(), "name", "");
        setField(term19996, term19996.getClass(), "value", "");
        Object term19999 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19999, term19999.getClass(), "name", "");
        setField(term19999, term19999.getClass(), "value", "");
        Object term20002 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20002, term20002.getClass(), "name", "");
        setField(term20002, term20002.getClass(), "value", "");
        Object term20005 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20005, term20005.getClass(), "name", "");
        setField(term20005, term20005.getClass(), "value", "");
        Object term20008 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20008, term20008.getClass(), "name", "");
        setField(term20008, term20008.getClass(), "value", "");
        Object term20011 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20011, term20011.getClass(), "name", "");
        setField(term20011, term20011.getClass(), "value", "");
        ArrayList term19988 = new ArrayList();
        ((ArrayList) term19988).add(term19990);
        ((ArrayList) term19988).add(term19993);
        ((ArrayList) term19988).add(term19996);
        ((ArrayList) term19988).add(term19999);
        ((ArrayList) term19988).add(term20002);
        ((ArrayList) term19988).add(term20005);
        ((ArrayList) term19988).add(term20008);
        ((ArrayList) term19988).add(term20011);
        Boolean term20076 = new Boolean(true);
        ArrayList term20102 = new ArrayList();
        Boolean term20106 = new Boolean(true);
        Boolean term20120 = new Boolean(false);
        term19939 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term19939, term19939.getClass(), "workflowName", "GjdWUoUSyA");
        setField(term19939, term19939.getClass(), "workflowDefinitionFile", "YEkxWsWaUl");
        setField(term19939, term19939.getClass(), "workflowDefinitionFileSystem", "RINhPkhhct");
        setField(term19939, term19939.getClass(), "variableInputFile", "vjNPcTSqmS");
        setField(term19939, term19939.getClass(), "variables", term19988);
        setField(term19939, term19939.getClass(), "resolveGlobalConflictByUsing", "taPBiMFNEZ");
        setField(term19939, term19939.getClass(), "system", "NoAFAfGyYL");
        setField(term19939, term19939.getClass(), "owner", "MFtfkBMyOD");
        setField(term19939, term19939.getClass(), "workflowArchiveSAFID", "rdiIyXfRtL");
        setField(term19939, term19939.getClass(), "comments", "douzkltmiI");
        setField(term19939, term19939.getClass(), "assignToOwner", term20076);
        setField(term19939, term19939.getClass(), "accessType", "MFKjhvLtpe");
        setField(term19939, term19939.getClass(), "accountInfo", "xpbLKEsput");
        setField(term19939, term19939.getClass(), "jobStatement", term20102);
        setField(term19939, term19939.getClass(), "deleteCompletedJobs", term20106);
        setField(term19939, term19939.getClass(), "jobsOutputDirectory", "urlyLwPBVn");
        setField(term19939, term19939.getClass(), "autoDeleteOnCompletion", term20120);
        setField(term19939, term19939.getClass(), "targetSystemuid", "SPQVzOlOzZ");
        setField(term19939, term19939.getClass(), "targetSystempwd", "bOUAgAptAI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KSZfGbvzPE";
        callMethod(klass, "accessType", argTypes, term19939, args);
    }

};


