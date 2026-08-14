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

public class WorkflowCreateInputData_getOwner_1878472198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9153;

    public WorkflowCreateInputData_getOwner_1878472198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9202 = new ArrayList();
        Boolean term9266 = new Boolean(true);
        ArrayList term9292 = new ArrayList();
        ((ArrayList) term9292).add("UBRmXJmfrt");
        ((ArrayList) term9292).add("WZzvmIHhzZ");
        Boolean term9320 = new Boolean(false);
        Boolean term9334 = new Boolean(false);
        term9153 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term9153, term9153.getClass(), "workflowName", "WBAOTqErtm");
        setField(term9153, term9153.getClass(), "workflowDefinitionFile", "PqtVXXZMqK");
        setField(term9153, term9153.getClass(), "workflowDefinitionFileSystem", "rYbtIDVdnd");
        setField(term9153, term9153.getClass(), "variableInputFile", "UKAReurpHG");
        setField(term9153, term9153.getClass(), "variables", term9202);
        setField(term9153, term9153.getClass(), "resolveGlobalConflictByUsing", "WVRMUmrljA");
        setField(term9153, term9153.getClass(), "system", "NTlKJDDWlk");
        setField(term9153, term9153.getClass(), "owner", "vOuMEpOQAg");
        setField(term9153, term9153.getClass(), "workflowArchiveSAFID", "SIODFGaQhr");
        setField(term9153, term9153.getClass(), "comments", "qYzsiuXOgS");
        setField(term9153, term9153.getClass(), "assignToOwner", term9266);
        setField(term9153, term9153.getClass(), "accessType", "bxrCBbrrct");
        setField(term9153, term9153.getClass(), "accountInfo", "CKWpJaaaxX");
        setField(term9153, term9153.getClass(), "jobStatement", term9292);
        setField(term9153, term9153.getClass(), "deleteCompletedJobs", term9320);
        setField(term9153, term9153.getClass(), "jobsOutputDirectory", "doQLHkjpNm");
        setField(term9153, term9153.getClass(), "autoDeleteOnCompletion", term9334);
        setField(term9153, term9153.getClass(), "targetSystemuid", "lCyLIcSuom");
        setField(term9153, term9153.getClass(), "targetSystempwd", "CGOpQSZZwI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term9153, args);
    }

};


