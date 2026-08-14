package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class WorkflowCallingStepInfo_getCalledWorkflowDescription_11276984277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6381;

    public WorkflowCallingStepInfo_getCalledWorkflowDescription_11276984277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6538 = new Boolean(true);
        Boolean term6540 = new Boolean(false);
        ArrayList term6542 = new ArrayList();
        Boolean term6546 = new Boolean(true);
        Boolean term6560 = new Boolean(false);
        Boolean term6562 = new Boolean(true);
        Boolean term6612 = new Boolean(false);
        Boolean term6614 = new Boolean(false);
        ArrayList term6616 = new ArrayList();
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        term6381 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term6381, term6381.getClass(), "calledInstanceKey", "LqNgPziYtv");
        setField(term6381, term6381.getClass(), "calledInstanceScope", "wiDfuaXnrP");
        setField(term6381, term6381.getClass(), "calledInstanceURI", "btdGZUcaZl");
        setField(term6381, term6381.getClass(), "calledWorkflowID", "WnEAVdCxna");
        setField(term6381, term6381.getClass(), "calledWorkflowVersion", "lnPIxHHyEK");
        setField(term6381, term6381.getClass(), "calledWorkflowMD5", "unvQfYuBUz");
        setField(term6381, term6381.getClass(), "calledWorkflowDescription", "RqnYUpQBbG");
        setField(term6381, term6381.getClass(), "calledWorkflowDefinitionFile", "sKnuhmcjCC");
        setField(term6381, term6381.getClass(), "name", "oCBbVNwMnb");
        setField(term6381, term6381.getClass(), "title", "miJxAzOVJy");
        setField(term6381, term6381.getClass(), "description", "kjqlBVaviD");
        setField(term6381, term6381.getClass(), "state", "iVRXRDCrcM");
        setField(term6381, term6381.getClass(), "stepNumber", "WAZFhrxcSM");
        setField(term6381, term6381.getClass(), "optional", term6538);
        setField(term6381, term6381.getClass(), "autoEnable", term6540);
        setField(term6381, term6381.getClass(), "prereqStep", term6542);
        setField(term6381, term6381.getClass(), "userDefined", term6546);
        setField(term6381, term6381.getClass(), "runAsUser", "gCRUlTuVMX");
        setField(term6381, term6381.getClass(), "runAsUserDynamic", term6560);
        setField(term6381, term6381.getClass(), "isRestStep", term6562);
        setField(term6381, term6381.getClass(), "owner", "tYBgGQtkhi");
        setField(term6381, term6381.getClass(), "assignees", "PhGPFLIMKH");
        setField(term6381, term6381.getClass(), "skills", "pWCYcLhoms");
        setField(term6381, term6381.getClass(), "weight", "IWNJVfvTuw");
        setField(term6381, term6381.getClass(), "hasCalledWorkflow", term6612);
        setField(term6381, term6381.getClass(), "isConditionStep", term6614);
        setField(term6381, term6381.getClass(), "steps", term6616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowDescription", argTypes, term6381, args);
    }

};


