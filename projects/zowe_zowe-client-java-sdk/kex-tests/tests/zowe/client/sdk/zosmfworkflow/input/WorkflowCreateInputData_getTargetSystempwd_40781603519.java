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
import java.lang.Boolean;

public class WorkflowCreateInputData_getTargetSystempwd_40781603519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13742;

    public WorkflowCreateInputData_getTargetSystempwd_40781603519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13791 = new ArrayList();
        Boolean term13855 = new Boolean(true);
        ArrayList term13881 = new ArrayList();
        ((ArrayList) term13881).add("QZBHZqZope");
        ((ArrayList) term13881).add("VBUahCvyxC");
        ((ArrayList) term13881).add("MlzTkzKMCX");
        ((ArrayList) term13881).add("UqKUbMyPMJ");
        ((ArrayList) term13881).add("QpYltHAdyY");
        ((ArrayList) term13881).add("lbmSGBwIiV");
        ((ArrayList) term13881).add("DAxyHoTLzZ");
        ((ArrayList) term13881).add("fhZgTouhCC");
        ((ArrayList) term13881).add("wrikqJwXvL");
        Boolean term13993 = new Boolean(false);
        Boolean term14007 = new Boolean(false);
        term13742 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term13742, term13742.getClass(), "workflowName", "zMsSLTfGhl");
        setField(term13742, term13742.getClass(), "workflowDefinitionFile", "bEmHScVZaQ");
        setField(term13742, term13742.getClass(), "workflowDefinitionFileSystem", "TcuXODkzBV");
        setField(term13742, term13742.getClass(), "variableInputFile", "coJPjrBZNe");
        setField(term13742, term13742.getClass(), "variables", term13791);
        setField(term13742, term13742.getClass(), "resolveGlobalConflictByUsing", "vMsWjuPTnO");
        setField(term13742, term13742.getClass(), "system", "zHvfKaOstO");
        setField(term13742, term13742.getClass(), "owner", "tOszriqETr");
        setField(term13742, term13742.getClass(), "workflowArchiveSAFID", "ncSPTkhKjO");
        setField(term13742, term13742.getClass(), "comments", "jcWKHRWhyj");
        setField(term13742, term13742.getClass(), "assignToOwner", term13855);
        setField(term13742, term13742.getClass(), "accessType", "nrQjODRMLD");
        setField(term13742, term13742.getClass(), "accountInfo", "PNoWXrsFic");
        setField(term13742, term13742.getClass(), "jobStatement", term13881);
        setField(term13742, term13742.getClass(), "deleteCompletedJobs", term13993);
        setField(term13742, term13742.getClass(), "jobsOutputDirectory", "UiWhvbypdr");
        setField(term13742, term13742.getClass(), "autoDeleteOnCompletion", term14007);
        setField(term13742, term13742.getClass(), "targetSystemuid", "CgleElJNje");
        setField(term13742, term13742.getClass(), "targetSystempwd", "ZrchvNGMtd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetSystempwd", argTypes, term13742, args);
    }

};


