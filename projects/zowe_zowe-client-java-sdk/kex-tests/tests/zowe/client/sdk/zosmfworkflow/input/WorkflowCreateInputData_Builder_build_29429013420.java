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

public class WorkflowCreateInputData_Builder_build_29429013420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23384;

    public WorkflowCreateInputData_Builder_build_29429013420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23435 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term23435, term23435.getClass(), "name", "");
        setField(term23435, term23435.getClass(), "value", "");
        Object term23438 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term23438, term23438.getClass(), "name", "");
        setField(term23438, term23438.getClass(), "value", "");
        Object term23441 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term23441, term23441.getClass(), "name", "");
        setField(term23441, term23441.getClass(), "value", "");
        Object term23444 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term23444, term23444.getClass(), "name", "");
        setField(term23444, term23444.getClass(), "value", "");
        ArrayList term23433 = new ArrayList();
        ((ArrayList) term23433).add(term23435);
        ((ArrayList) term23433).add(term23438);
        ((ArrayList) term23433).add(term23441);
        ((ArrayList) term23433).add(term23444);
        Boolean term23509 = new Boolean(true);
        ArrayList term23535 = new ArrayList();
        ((ArrayList) term23535).add("yejonZnVuy");
        ((ArrayList) term23535).add("ouesGIsvuG");
        ((ArrayList) term23535).add("pHBHlmLIZQ");
        ((ArrayList) term23535).add("ZWRAbOuktl");
        ((ArrayList) term23535).add("iqFRvFmVID");
        ((ArrayList) term23535).add("pNAEtppZdv");
        Boolean term23611 = new Boolean(false);
        Boolean term23625 = new Boolean(false);
        term23384 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term23384, term23384.getClass(), "workflowName", "AaQRshwIQC");
        setField(term23384, term23384.getClass(), "workflowDefinitionFile", "rHgKCfgCsg");
        setField(term23384, term23384.getClass(), "workflowDefinitionFileSystem", "AWtIUOuutt");
        setField(term23384, term23384.getClass(), "variableInputFile", "jBgJZpHifl");
        setField(term23384, term23384.getClass(), "variables", term23433);
        setField(term23384, term23384.getClass(), "resolveGlobalConflictByUsing", "YYwIEARNxi");
        setField(term23384, term23384.getClass(), "system", "rblXBUdTFc");
        setField(term23384, term23384.getClass(), "owner", "rbsXSOJFKW");
        setField(term23384, term23384.getClass(), "workflowArchiveSAFID", "sAgGDoUNlf");
        setField(term23384, term23384.getClass(), "comments", "TSTZcXdFFi");
        setField(term23384, term23384.getClass(), "assignToOwner", term23509);
        setField(term23384, term23384.getClass(), "accessType", "RyaaOzWfYO");
        setField(term23384, term23384.getClass(), "accountInfo", "HAkxFBZZzz");
        setField(term23384, term23384.getClass(), "jobStatement", term23535);
        setField(term23384, term23384.getClass(), "deleteCompletedJobs", term23611);
        setField(term23384, term23384.getClass(), "jobsOutputDirectory", "VsFWNMdyRt");
        setField(term23384, term23384.getClass(), "autoDeleteOnCompletion", term23625);
        setField(term23384, term23384.getClass(), "targetSystemuid", "QaoYFZhScg");
        setField(term23384, term23384.getClass(), "targetSystempwd", "UTvXIenLCR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term23384, args);
    }

};


