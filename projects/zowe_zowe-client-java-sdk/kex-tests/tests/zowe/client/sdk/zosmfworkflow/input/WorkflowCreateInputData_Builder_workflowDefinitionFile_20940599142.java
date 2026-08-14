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

public class WorkflowCreateInputData_Builder_workflowDefinitionFile_20940599142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15616;

    public WorkflowCreateInputData_Builder_workflowDefinitionFile_20940599142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15667 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15667, term15667.getClass(), "name", "");
        setField(term15667, term15667.getClass(), "value", "");
        Object term15670 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15670, term15670.getClass(), "name", "");
        setField(term15670, term15670.getClass(), "value", "");
        Object term15673 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15673, term15673.getClass(), "name", "");
        setField(term15673, term15673.getClass(), "value", "");
        Object term15676 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15676, term15676.getClass(), "name", "");
        setField(term15676, term15676.getClass(), "value", "");
        Object term15679 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15679, term15679.getClass(), "name", "");
        setField(term15679, term15679.getClass(), "value", "");
        Object term15682 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term15682, term15682.getClass(), "name", "");
        setField(term15682, term15682.getClass(), "value", "");
        ArrayList term15665 = new ArrayList();
        ((ArrayList) term15665).add(term15667);
        ((ArrayList) term15665).add(term15670);
        ((ArrayList) term15665).add(term15673);
        ((ArrayList) term15665).add(term15676);
        ((ArrayList) term15665).add(term15679);
        ((ArrayList) term15665).add(term15682);
        Boolean term15747 = new Boolean(false);
        ArrayList term15773 = new ArrayList();
        ((ArrayList) term15773).add("UEdzEKEEEV");
        ((ArrayList) term15773).add("BcENaQFYSd");
        ((ArrayList) term15773).add("POPYycoDBy");
        ((ArrayList) term15773).add("LuWMOXdAPA");
        ((ArrayList) term15773).add("blSffTnsOv");
        ((ArrayList) term15773).add("qbUMcIvEXH");
        ((ArrayList) term15773).add("TVxGTjeDcu");
        ((ArrayList) term15773).add("ABPtcyCzkR");
        Boolean term15873 = new Boolean(false);
        Boolean term15887 = new Boolean(false);
        term15616 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term15616, term15616.getClass(), "workflowName", "MpJsPKLTIU");
        setField(term15616, term15616.getClass(), "workflowDefinitionFile", "IiNCZfdouL");
        setField(term15616, term15616.getClass(), "workflowDefinitionFileSystem", "AhOHzCsHKW");
        setField(term15616, term15616.getClass(), "variableInputFile", "UqgLPaaAHi");
        setField(term15616, term15616.getClass(), "variables", term15665);
        setField(term15616, term15616.getClass(), "resolveGlobalConflictByUsing", "ATSXJPySio");
        setField(term15616, term15616.getClass(), "system", "XZkOUcbfFg");
        setField(term15616, term15616.getClass(), "owner", "TGiJfagfky");
        setField(term15616, term15616.getClass(), "workflowArchiveSAFID", "BJklinBmhN");
        setField(term15616, term15616.getClass(), "comments", "IOddzvEWcl");
        setField(term15616, term15616.getClass(), "assignToOwner", term15747);
        setField(term15616, term15616.getClass(), "accessType", "bIrtpkYJWT");
        setField(term15616, term15616.getClass(), "accountInfo", "VuLLXpvPpZ");
        setField(term15616, term15616.getClass(), "jobStatement", term15773);
        setField(term15616, term15616.getClass(), "deleteCompletedJobs", term15873);
        setField(term15616, term15616.getClass(), "jobsOutputDirectory", "QgHhxMyKvr");
        setField(term15616, term15616.getClass(), "autoDeleteOnCompletion", term15887);
        setField(term15616, term15616.getClass(), "targetSystemuid", "VGiXZZTWRO");
        setField(term15616, term15616.getClass(), "targetSystempwd", "MlPtwXnJOJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DbfiyFeaTe";
        callMethod(klass, "workflowDefinitionFile", argTypes, term15616, args);
    }

};


