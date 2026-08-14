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

public class WorkflowCreateInputData_Builder_accountInfo_163693984913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20308;

    public WorkflowCreateInputData_Builder_accountInfo_163693984913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20359 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20359, term20359.getClass(), "name", "");
        setField(term20359, term20359.getClass(), "value", "");
        Object term20362 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20362, term20362.getClass(), "name", "");
        setField(term20362, term20362.getClass(), "value", "");
        ArrayList term20357 = new ArrayList();
        ((ArrayList) term20357).add(term20359);
        ((ArrayList) term20357).add(term20362);
        Boolean term20427 = new Boolean(false);
        ArrayList term20453 = new ArrayList();
        ((ArrayList) term20453).add("olYpqbolWL");
        ((ArrayList) term20453).add("MCMCjxXzjw");
        Boolean term20481 = new Boolean(true);
        Boolean term20495 = new Boolean(true);
        term20308 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term20308, term20308.getClass(), "workflowName", "YfgYGgzYER");
        setField(term20308, term20308.getClass(), "workflowDefinitionFile", "IDClvDZuqE");
        setField(term20308, term20308.getClass(), "workflowDefinitionFileSystem", "cMvKxpZOvg");
        setField(term20308, term20308.getClass(), "variableInputFile", "WWBYemIuiK");
        setField(term20308, term20308.getClass(), "variables", term20357);
        setField(term20308, term20308.getClass(), "resolveGlobalConflictByUsing", "YcgHACNgyo");
        setField(term20308, term20308.getClass(), "system", "MrUPJzBTEn");
        setField(term20308, term20308.getClass(), "owner", "IaSymdfFGa");
        setField(term20308, term20308.getClass(), "workflowArchiveSAFID", "FxSvJCIpul");
        setField(term20308, term20308.getClass(), "comments", "HCjKwpexJj");
        setField(term20308, term20308.getClass(), "assignToOwner", term20427);
        setField(term20308, term20308.getClass(), "accessType", "sCpIHVPdfl");
        setField(term20308, term20308.getClass(), "accountInfo", "lMUBBGRjfY");
        setField(term20308, term20308.getClass(), "jobStatement", term20453);
        setField(term20308, term20308.getClass(), "deleteCompletedJobs", term20481);
        setField(term20308, term20308.getClass(), "jobsOutputDirectory", "pZbbwCURge");
        setField(term20308, term20308.getClass(), "autoDeleteOnCompletion", term20495);
        setField(term20308, term20308.getClass(), "targetSystemuid", "RsOfgdMCMv");
        setField(term20308, term20308.getClass(), "targetSystempwd", "nsofCJqJOR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CitJiZwsjF";
        callMethod(klass, "accountInfo", argTypes, term20308, args);
    }

};


