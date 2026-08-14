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

public class WorkflowCallingStepInfo_getCalledWorkflowID_147388463814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7839;

    public WorkflowCallingStepInfo_getCalledWorkflowID_147388463814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7839 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term7839, term7839.getClass(), "calledInstanceKey", null);
        setField(term7839, term7839.getClass(), "calledInstanceScope", null);
        setField(term7839, term7839.getClass(), "calledInstanceURI", null);
        setField(term7839, term7839.getClass(), "calledWorkflowID", null);
        setField(term7839, term7839.getClass(), "calledWorkflowVersion", null);
        setField(term7839, term7839.getClass(), "calledWorkflowMD5", null);
        setField(term7839, term7839.getClass(), "calledWorkflowDescription", null);
        setField(term7839, term7839.getClass(), "calledWorkflowDefinitionFile", null);
        setField(term7839, term7839.getClass(), "name", null);
        setField(term7839, term7839.getClass(), "title", null);
        setField(term7839, term7839.getClass(), "description", null);
        setField(term7839, term7839.getClass(), "state", null);
        setField(term7839, term7839.getClass(), "stepNumber", null);
        setField(term7839, term7839.getClass(), "optional", null);
        setField(term7839, term7839.getClass(), "autoEnable", null);
        setField(term7839, term7839.getClass(), "prereqStep", null);
        setField(term7839, term7839.getClass(), "userDefined", null);
        setField(term7839, term7839.getClass(), "runAsUser", null);
        setField(term7839, term7839.getClass(), "runAsUserDynamic", null);
        setField(term7839, term7839.getClass(), "isRestStep", null);
        setField(term7839, term7839.getClass(), "owner", null);
        setField(term7839, term7839.getClass(), "assignees", null);
        setField(term7839, term7839.getClass(), "skills", null);
        setField(term7839, term7839.getClass(), "weight", null);
        setField(term7839, term7839.getClass(), "hasCalledWorkflow", null);
        setField(term7839, term7839.getClass(), "isConditionStep", null);
        setField(term7839, term7839.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowID", argTypes, term7839, args);
    }

};


