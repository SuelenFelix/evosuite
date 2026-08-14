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

public class WorkflowCallingStepInfo_getCalledWorkflowVersion_19728156575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5323;

    public WorkflowCallingStepInfo_getCalledWorkflowVersion_19728156575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term5480 = new Boolean(false);
        Boolean term5482 = new Boolean(false);
        ArrayList term5484 = new ArrayList();
        ((ArrayList) term5484).add("DyUuIDzZPG");
        ((ArrayList) term5484).add("EGQLusEtRN");
        ((ArrayList) term5484).add("GwGUMPdvZq");
        ((ArrayList) term5484).add("iXRAYcFyfS");
        Boolean term5536 = new Boolean(true);
        Boolean term5550 = new Boolean(true);
        Boolean term5552 = new Boolean(true);
        Boolean term5602 = new Boolean(true);
        Boolean term5604 = new Boolean(false);
        ArrayList term5606 = new ArrayList();
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        ((ArrayList) term5606).add((Object)null);
        term5323 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term5323, term5323.getClass(), "calledInstanceKey", "uYnmxkwLfB");
        setField(term5323, term5323.getClass(), "calledInstanceScope", "RVZTQxYOUO");
        setField(term5323, term5323.getClass(), "calledInstanceURI", "tydPpKxAbv");
        setField(term5323, term5323.getClass(), "calledWorkflowID", "CJxQpJUfLJ");
        setField(term5323, term5323.getClass(), "calledWorkflowVersion", "NUUjAyqOva");
        setField(term5323, term5323.getClass(), "calledWorkflowMD5", "EoAMIIUdDX");
        setField(term5323, term5323.getClass(), "calledWorkflowDescription", "OATNwRncsv");
        setField(term5323, term5323.getClass(), "calledWorkflowDefinitionFile", "rACmzcmIPm");
        setField(term5323, term5323.getClass(), "name", "OCtePrLDhe");
        setField(term5323, term5323.getClass(), "title", "yqEphNxUPZ");
        setField(term5323, term5323.getClass(), "description", "mJJxTuZuKO");
        setField(term5323, term5323.getClass(), "state", "anSZCikKpS");
        setField(term5323, term5323.getClass(), "stepNumber", "zvMQGbTtsV");
        setField(term5323, term5323.getClass(), "optional", term5480);
        setField(term5323, term5323.getClass(), "autoEnable", term5482);
        setField(term5323, term5323.getClass(), "prereqStep", term5484);
        setField(term5323, term5323.getClass(), "userDefined", term5536);
        setField(term5323, term5323.getClass(), "runAsUser", "lokyclbLEz");
        setField(term5323, term5323.getClass(), "runAsUserDynamic", term5550);
        setField(term5323, term5323.getClass(), "isRestStep", term5552);
        setField(term5323, term5323.getClass(), "owner", "hAPmQGaxkI");
        setField(term5323, term5323.getClass(), "assignees", "ojrnLnJZjT");
        setField(term5323, term5323.getClass(), "skills", "rtvXSMjOdJ");
        setField(term5323, term5323.getClass(), "weight", "EDkfjuDpNv");
        setField(term5323, term5323.getClass(), "hasCalledWorkflow", term5602);
        setField(term5323, term5323.getClass(), "isConditionStep", term5604);
        setField(term5323, term5323.getClass(), "steps", term5606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowVersion", argTypes, term5323, args);
    }

};


