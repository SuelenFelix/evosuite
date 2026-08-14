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

public class WorkflowCallingStepInfo_getCalledWorkflowMD5_16525406436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5830;

    public WorkflowCallingStepInfo_getCalledWorkflowMD5_16525406436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term5987 = new Boolean(true);
        Boolean term5989 = new Boolean(false);
        ArrayList term5991 = new ArrayList();
        ((ArrayList) term5991).add("UjIAQAHhul");
        ((ArrayList) term5991).add("oWBXOvjPUT");
        ((ArrayList) term5991).add("DcKqrrTdId");
        ((ArrayList) term5991).add("fwtOJhjXbW");
        ((ArrayList) term5991).add("ltWBKZaXwJ");
        ((ArrayList) term5991).add("FSQpgxQnsH");
        Boolean term6067 = new Boolean(false);
        Boolean term6081 = new Boolean(true);
        Boolean term6083 = new Boolean(true);
        Boolean term6133 = new Boolean(true);
        Boolean term6135 = new Boolean(true);
        ArrayList term6137 = new ArrayList();
        ((ArrayList) term6137).add((Object)null);
        ((ArrayList) term6137).add((Object)null);
        ((ArrayList) term6137).add((Object)null);
        ((ArrayList) term6137).add((Object)null);
        ((ArrayList) term6137).add((Object)null);
        ((ArrayList) term6137).add((Object)null);
        ((ArrayList) term6137).add((Object)null);
        term5830 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term5830, term5830.getClass(), "calledInstanceKey", "LNHkTUfuHX");
        setField(term5830, term5830.getClass(), "calledInstanceScope", "SVWcOAHiTp");
        setField(term5830, term5830.getClass(), "calledInstanceURI", "oShLCaneoQ");
        setField(term5830, term5830.getClass(), "calledWorkflowID", "nwKkzNpzyC");
        setField(term5830, term5830.getClass(), "calledWorkflowVersion", "CwrsdYnHpH");
        setField(term5830, term5830.getClass(), "calledWorkflowMD5", "jifjXNXluS");
        setField(term5830, term5830.getClass(), "calledWorkflowDescription", "uDayZDXPOP");
        setField(term5830, term5830.getClass(), "calledWorkflowDefinitionFile", "kbjWxMAIhY");
        setField(term5830, term5830.getClass(), "name", "GmtlSgqKcI");
        setField(term5830, term5830.getClass(), "title", "ssSbvPoMjB");
        setField(term5830, term5830.getClass(), "description", "mhRVADhaKm");
        setField(term5830, term5830.getClass(), "state", "rLldJrTAay");
        setField(term5830, term5830.getClass(), "stepNumber", "HvSKssbEES");
        setField(term5830, term5830.getClass(), "optional", term5987);
        setField(term5830, term5830.getClass(), "autoEnable", term5989);
        setField(term5830, term5830.getClass(), "prereqStep", term5991);
        setField(term5830, term5830.getClass(), "userDefined", term6067);
        setField(term5830, term5830.getClass(), "runAsUser", "LBPwnVMEpP");
        setField(term5830, term5830.getClass(), "runAsUserDynamic", term6081);
        setField(term5830, term5830.getClass(), "isRestStep", term6083);
        setField(term5830, term5830.getClass(), "owner", "cwALzyQVjH");
        setField(term5830, term5830.getClass(), "assignees", "jlYNjpdkoz");
        setField(term5830, term5830.getClass(), "skills", "DZAGnhJkeU");
        setField(term5830, term5830.getClass(), "weight", "xQuVexkiVz");
        setField(term5830, term5830.getClass(), "hasCalledWorkflow", term6133);
        setField(term5830, term5830.getClass(), "isConditionStep", term6135);
        setField(term5830, term5830.getClass(), "steps", term6137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowMD5", argTypes, term5830, args);
    }

};


