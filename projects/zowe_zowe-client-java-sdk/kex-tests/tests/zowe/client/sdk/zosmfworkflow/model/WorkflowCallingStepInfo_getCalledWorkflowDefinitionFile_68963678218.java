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

public class WorkflowCallingStepInfo_getCalledWorkflowDefinitionFile_68963678218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7843;

    public WorkflowCallingStepInfo_getCalledWorkflowDefinitionFile_68963678218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7843 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term7843, term7843.getClass(), "calledInstanceKey", null);
        setField(term7843, term7843.getClass(), "calledInstanceScope", null);
        setField(term7843, term7843.getClass(), "calledInstanceURI", null);
        setField(term7843, term7843.getClass(), "calledWorkflowID", null);
        setField(term7843, term7843.getClass(), "calledWorkflowVersion", null);
        setField(term7843, term7843.getClass(), "calledWorkflowMD5", null);
        setField(term7843, term7843.getClass(), "calledWorkflowDescription", null);
        setField(term7843, term7843.getClass(), "calledWorkflowDefinitionFile", null);
        setField(term7843, term7843.getClass(), "name", null);
        setField(term7843, term7843.getClass(), "title", null);
        setField(term7843, term7843.getClass(), "description", null);
        setField(term7843, term7843.getClass(), "state", null);
        setField(term7843, term7843.getClass(), "stepNumber", null);
        setField(term7843, term7843.getClass(), "optional", null);
        setField(term7843, term7843.getClass(), "autoEnable", null);
        setField(term7843, term7843.getClass(), "prereqStep", null);
        setField(term7843, term7843.getClass(), "userDefined", null);
        setField(term7843, term7843.getClass(), "runAsUser", null);
        setField(term7843, term7843.getClass(), "runAsUserDynamic", null);
        setField(term7843, term7843.getClass(), "isRestStep", null);
        setField(term7843, term7843.getClass(), "owner", null);
        setField(term7843, term7843.getClass(), "assignees", null);
        setField(term7843, term7843.getClass(), "skills", null);
        setField(term7843, term7843.getClass(), "weight", null);
        setField(term7843, term7843.getClass(), "hasCalledWorkflow", null);
        setField(term7843, term7843.getClass(), "isConditionStep", null);
        setField(term7843, term7843.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowDefinitionFile", argTypes, term7843, args);
    }

};


