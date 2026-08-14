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

public class WorkflowTemplateStepInfo_getVariableReferences_3866634446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54975;

    public WorkflowTemplateStepInfo_getVariableReferences_3866634446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54975 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        setField(term54975, term54975.getClass(), "template", null);
        setField(term54975, term54975.getClass(), "templateSub", null);
        setField(term54975, term54975.getClass(), "submitAs", null);
        setField(term54975, term54975.getClass(), "maxLrecl", null);
        setField(term54975, term54975.getClass(), "jobInfo", null);
        setField(term54975, term54975.getClass(), "output", null);
        setField(term54975, term54975.getClass(), "outputSub", null);
        setField(term54975, term54975.getClass(), "outputVariablesPrefix", null);
        setField(term54975, term54975.getClass(), "procName", null);
        setField(term54975, term54975.getClass(), "regionSize", null);
        setField(term54975, term54975.getClass(), "returnCode", null);
        setField(term54975, term54975.getClass(), "saveAsDataset", null);
        setField(term54975, term54975.getClass(), "saveAsDatasetSub", null);
        setField(term54975, term54975.getClass(), "saveAsUnixFile", null);
        setField(term54975, term54975.getClass(), "saveAsUnixFileSub", null);
        setField(term54975, term54975.getClass(), "scriptParameters", null);
        setField(term54975, term54975.getClass(), "successPattern", null);
        setField(term54975, term54975.getClass(), "failedPattern", null);
        setField(term54975, term54975.getClass(), "timeout", null);
        setField(term54975, term54975.getClass(), "instructions", null);
        setField(term54975, term54975.getClass(), "instructionsSub", null);
        setField(term54975, term54975.getClass(), "variableReferences", null);
        setField(term54975, term54975.getClass(), "name", null);
        setField(term54975, term54975.getClass(), "title", null);
        setField(term54975, term54975.getClass(), "description", null);
        setField(term54975, term54975.getClass(), "state", null);
        setField(term54975, term54975.getClass(), "stepNumber", null);
        setField(term54975, term54975.getClass(), "optional", null);
        setField(term54975, term54975.getClass(), "autoEnable", null);
        setField(term54975, term54975.getClass(), "prereqStep", null);
        setField(term54975, term54975.getClass(), "userDefined", null);
        setField(term54975, term54975.getClass(), "runAsUser", null);
        setField(term54975, term54975.getClass(), "runAsUserDynamic", null);
        setField(term54975, term54975.getClass(), "isRestStep", null);
        setField(term54975, term54975.getClass(), "owner", null);
        setField(term54975, term54975.getClass(), "assignees", null);
        setField(term54975, term54975.getClass(), "skills", null);
        setField(term54975, term54975.getClass(), "weight", null);
        setField(term54975, term54975.getClass(), "hasCalledWorkflow", null);
        setField(term54975, term54975.getClass(), "isConditionStep", null);
        setField(term54975, term54975.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariableReferences", argTypes, term54975, args);
    }

};


