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

public class WorkflowCallingStepInfo_getCalledWorkflowVersion_197281565715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7840;

    public WorkflowCallingStepInfo_getCalledWorkflowVersion_197281565715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7840 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term7840, term7840.getClass(), "calledInstanceKey", null);
        setField(term7840, term7840.getClass(), "calledInstanceScope", null);
        setField(term7840, term7840.getClass(), "calledInstanceURI", null);
        setField(term7840, term7840.getClass(), "calledWorkflowID", null);
        setField(term7840, term7840.getClass(), "calledWorkflowVersion", null);
        setField(term7840, term7840.getClass(), "calledWorkflowMD5", null);
        setField(term7840, term7840.getClass(), "calledWorkflowDescription", null);
        setField(term7840, term7840.getClass(), "calledWorkflowDefinitionFile", null);
        setField(term7840, term7840.getClass(), "name", null);
        setField(term7840, term7840.getClass(), "title", null);
        setField(term7840, term7840.getClass(), "description", null);
        setField(term7840, term7840.getClass(), "state", null);
        setField(term7840, term7840.getClass(), "stepNumber", null);
        setField(term7840, term7840.getClass(), "optional", null);
        setField(term7840, term7840.getClass(), "autoEnable", null);
        setField(term7840, term7840.getClass(), "prereqStep", null);
        setField(term7840, term7840.getClass(), "userDefined", null);
        setField(term7840, term7840.getClass(), "runAsUser", null);
        setField(term7840, term7840.getClass(), "runAsUserDynamic", null);
        setField(term7840, term7840.getClass(), "isRestStep", null);
        setField(term7840, term7840.getClass(), "owner", null);
        setField(term7840, term7840.getClass(), "assignees", null);
        setField(term7840, term7840.getClass(), "skills", null);
        setField(term7840, term7840.getClass(), "weight", null);
        setField(term7840, term7840.getClass(), "hasCalledWorkflow", null);
        setField(term7840, term7840.getClass(), "isConditionStep", null);
        setField(term7840, term7840.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowVersion", argTypes, term7840, args);
    }

};


