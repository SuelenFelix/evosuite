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

public class WorkflowCreateInputData_Builder_variableInputFile_284387264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16681;

    public WorkflowCreateInputData_Builder_variableInputFile_284387264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16732 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16732, term16732.getClass(), "name", "");
        setField(term16732, term16732.getClass(), "value", "");
        Object term16735 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16735, term16735.getClass(), "name", "");
        setField(term16735, term16735.getClass(), "value", "");
        Object term16738 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16738, term16738.getClass(), "name", "");
        setField(term16738, term16738.getClass(), "value", "");
        ArrayList term16730 = new ArrayList();
        ((ArrayList) term16730).add(term16732);
        ((ArrayList) term16730).add(term16735);
        ((ArrayList) term16730).add(term16738);
        Boolean term16803 = new Boolean(false);
        ArrayList term16829 = new ArrayList();
        ((ArrayList) term16829).add("TKOMaGswbU");
        ((ArrayList) term16829).add("YcTbglHiUq");
        ((ArrayList) term16829).add("TiUqHrjoEU");
        ((ArrayList) term16829).add("eoEvZbdLjL");
        Boolean term16881 = new Boolean(true);
        Boolean term16895 = new Boolean(false);
        term16681 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term16681, term16681.getClass(), "workflowName", "AdYzLPMcwe");
        setField(term16681, term16681.getClass(), "workflowDefinitionFile", "FrTZLybkKk");
        setField(term16681, term16681.getClass(), "workflowDefinitionFileSystem", "FlxVmiMYKP");
        setField(term16681, term16681.getClass(), "variableInputFile", "fgOpAWlGYN");
        setField(term16681, term16681.getClass(), "variables", term16730);
        setField(term16681, term16681.getClass(), "resolveGlobalConflictByUsing", "xVFgeyYxZS");
        setField(term16681, term16681.getClass(), "system", "iQiGTulJiH");
        setField(term16681, term16681.getClass(), "owner", "utCuuVCKqE");
        setField(term16681, term16681.getClass(), "workflowArchiveSAFID", "zSfoqzJbPT");
        setField(term16681, term16681.getClass(), "comments", "QUymMnsCIj");
        setField(term16681, term16681.getClass(), "assignToOwner", term16803);
        setField(term16681, term16681.getClass(), "accessType", "ikTtOgdVYS");
        setField(term16681, term16681.getClass(), "accountInfo", "JptuwlirlS");
        setField(term16681, term16681.getClass(), "jobStatement", term16829);
        setField(term16681, term16681.getClass(), "deleteCompletedJobs", term16881);
        setField(term16681, term16681.getClass(), "jobsOutputDirectory", "BkIxsyPkGy");
        setField(term16681, term16681.getClass(), "autoDeleteOnCompletion", term16895);
        setField(term16681, term16681.getClass(), "targetSystemuid", "mrMGwoRgVY");
        setField(term16681, term16681.getClass(), "targetSystempwd", "mxVLTgCwki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wCurppnDSA";
        callMethod(klass, "variableInputFile", argTypes, term16681, args);
    }

};


