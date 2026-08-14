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
import java.util.LinkedList;

public class WorkflowCreateInputData_Builder_variables_20031967105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17123;
     Object term17372;

    public WorkflowCreateInputData_Builder_variables_20031967105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17174 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17174, term17174.getClass(), "name", "");
        setField(term17174, term17174.getClass(), "value", "");
        Object term17177 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17177, term17177.getClass(), "name", "");
        setField(term17177, term17177.getClass(), "value", "");
        ArrayList term17172 = new ArrayList();
        ((ArrayList) term17172).add(term17174);
        ((ArrayList) term17172).add(term17177);
        Boolean term17242 = new Boolean(false);
        ArrayList term17268 = new ArrayList();
        ((ArrayList) term17268).add("pMfTuAFXxg");
        ((ArrayList) term17268).add("XCZmhkblRc");
        ((ArrayList) term17268).add("gFUWMydGCU");
        ((ArrayList) term17268).add("LLegSTfqJt");
        ((ArrayList) term17268).add("XQfmqLbqHS");
        Boolean term17332 = new Boolean(true);
        Boolean term17346 = new Boolean(false);
        term17123 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term17123, term17123.getClass(), "workflowName", "JydxSNTMYt");
        setField(term17123, term17123.getClass(), "workflowDefinitionFile", "KpurAcrHYT");
        setField(term17123, term17123.getClass(), "workflowDefinitionFileSystem", "QjvDwgKJGz");
        setField(term17123, term17123.getClass(), "variableInputFile", "ngYxiXTZrk");
        setField(term17123, term17123.getClass(), "variables", term17172);
        setField(term17123, term17123.getClass(), "resolveGlobalConflictByUsing", "wdtiuPgTVJ");
        setField(term17123, term17123.getClass(), "system", "HUgzMgrpsK");
        setField(term17123, term17123.getClass(), "owner", "ubaBUfLolu");
        setField(term17123, term17123.getClass(), "workflowArchiveSAFID", "itAUCFhZhq");
        setField(term17123, term17123.getClass(), "comments", "bIqaKgXgPm");
        setField(term17123, term17123.getClass(), "assignToOwner", term17242);
        setField(term17123, term17123.getClass(), "accessType", "uOJFOUcNvv");
        setField(term17123, term17123.getClass(), "accountInfo", "tkmmGweDwJ");
        setField(term17123, term17123.getClass(), "jobStatement", term17268);
        setField(term17123, term17123.getClass(), "deleteCompletedJobs", term17332);
        setField(term17123, term17123.getClass(), "jobsOutputDirectory", "jLVLqQSjqg");
        setField(term17123, term17123.getClass(), "autoDeleteOnCompletion", term17346);
        setField(term17123, term17123.getClass(), "targetSystemuid", "JKGueoHesL");
        setField(term17123, term17123.getClass(), "targetSystempwd", "CRAUqtVBkU");
        term17372 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term17372;
        callMethod(klass, "variables", argTypes, term17123, args);
    }

};


