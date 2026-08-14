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

public class WorkflowTemplateStepInfo_getSaveAsUnixFile_68924302238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54967;

    public WorkflowTemplateStepInfo_getSaveAsUnixFile_68924302238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54967 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        setField(term54967, term54967.getClass(), "template", null);
        setField(term54967, term54967.getClass(), "templateSub", null);
        setField(term54967, term54967.getClass(), "submitAs", null);
        setField(term54967, term54967.getClass(), "maxLrecl", null);
        setField(term54967, term54967.getClass(), "jobInfo", null);
        setField(term54967, term54967.getClass(), "output", null);
        setField(term54967, term54967.getClass(), "outputSub", null);
        setField(term54967, term54967.getClass(), "outputVariablesPrefix", null);
        setField(term54967, term54967.getClass(), "procName", null);
        setField(term54967, term54967.getClass(), "regionSize", null);
        setField(term54967, term54967.getClass(), "returnCode", null);
        setField(term54967, term54967.getClass(), "saveAsDataset", null);
        setField(term54967, term54967.getClass(), "saveAsDatasetSub", null);
        setField(term54967, term54967.getClass(), "saveAsUnixFile", null);
        setField(term54967, term54967.getClass(), "saveAsUnixFileSub", null);
        setField(term54967, term54967.getClass(), "scriptParameters", null);
        setField(term54967, term54967.getClass(), "successPattern", null);
        setField(term54967, term54967.getClass(), "failedPattern", null);
        setField(term54967, term54967.getClass(), "timeout", null);
        setField(term54967, term54967.getClass(), "instructions", null);
        setField(term54967, term54967.getClass(), "instructionsSub", null);
        setField(term54967, term54967.getClass(), "variableReferences", null);
        setField(term54967, term54967.getClass(), "name", null);
        setField(term54967, term54967.getClass(), "title", null);
        setField(term54967, term54967.getClass(), "description", null);
        setField(term54967, term54967.getClass(), "state", null);
        setField(term54967, term54967.getClass(), "stepNumber", null);
        setField(term54967, term54967.getClass(), "optional", null);
        setField(term54967, term54967.getClass(), "autoEnable", null);
        setField(term54967, term54967.getClass(), "prereqStep", null);
        setField(term54967, term54967.getClass(), "userDefined", null);
        setField(term54967, term54967.getClass(), "runAsUser", null);
        setField(term54967, term54967.getClass(), "runAsUserDynamic", null);
        setField(term54967, term54967.getClass(), "isRestStep", null);
        setField(term54967, term54967.getClass(), "owner", null);
        setField(term54967, term54967.getClass(), "assignees", null);
        setField(term54967, term54967.getClass(), "skills", null);
        setField(term54967, term54967.getClass(), "weight", null);
        setField(term54967, term54967.getClass(), "hasCalledWorkflow", null);
        setField(term54967, term54967.getClass(), "isConditionStep", null);
        setField(term54967, term54967.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveAsUnixFile", argTypes, term54967, args);
    }

};


