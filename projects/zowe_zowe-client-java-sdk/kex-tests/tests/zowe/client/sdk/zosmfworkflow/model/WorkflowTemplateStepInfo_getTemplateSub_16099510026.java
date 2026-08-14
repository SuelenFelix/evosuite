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

public class WorkflowTemplateStepInfo_getTemplateSub_16099510026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54955;

    public WorkflowTemplateStepInfo_getTemplateSub_16099510026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54955 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        setField(term54955, term54955.getClass(), "template", null);
        setField(term54955, term54955.getClass(), "templateSub", null);
        setField(term54955, term54955.getClass(), "submitAs", null);
        setField(term54955, term54955.getClass(), "maxLrecl", null);
        setField(term54955, term54955.getClass(), "jobInfo", null);
        setField(term54955, term54955.getClass(), "output", null);
        setField(term54955, term54955.getClass(), "outputSub", null);
        setField(term54955, term54955.getClass(), "outputVariablesPrefix", null);
        setField(term54955, term54955.getClass(), "procName", null);
        setField(term54955, term54955.getClass(), "regionSize", null);
        setField(term54955, term54955.getClass(), "returnCode", null);
        setField(term54955, term54955.getClass(), "saveAsDataset", null);
        setField(term54955, term54955.getClass(), "saveAsDatasetSub", null);
        setField(term54955, term54955.getClass(), "saveAsUnixFile", null);
        setField(term54955, term54955.getClass(), "saveAsUnixFileSub", null);
        setField(term54955, term54955.getClass(), "scriptParameters", null);
        setField(term54955, term54955.getClass(), "successPattern", null);
        setField(term54955, term54955.getClass(), "failedPattern", null);
        setField(term54955, term54955.getClass(), "timeout", null);
        setField(term54955, term54955.getClass(), "instructions", null);
        setField(term54955, term54955.getClass(), "instructionsSub", null);
        setField(term54955, term54955.getClass(), "variableReferences", null);
        setField(term54955, term54955.getClass(), "name", null);
        setField(term54955, term54955.getClass(), "title", null);
        setField(term54955, term54955.getClass(), "description", null);
        setField(term54955, term54955.getClass(), "state", null);
        setField(term54955, term54955.getClass(), "stepNumber", null);
        setField(term54955, term54955.getClass(), "optional", null);
        setField(term54955, term54955.getClass(), "autoEnable", null);
        setField(term54955, term54955.getClass(), "prereqStep", null);
        setField(term54955, term54955.getClass(), "userDefined", null);
        setField(term54955, term54955.getClass(), "runAsUser", null);
        setField(term54955, term54955.getClass(), "runAsUserDynamic", null);
        setField(term54955, term54955.getClass(), "isRestStep", null);
        setField(term54955, term54955.getClass(), "owner", null);
        setField(term54955, term54955.getClass(), "assignees", null);
        setField(term54955, term54955.getClass(), "skills", null);
        setField(term54955, term54955.getClass(), "weight", null);
        setField(term54955, term54955.getClass(), "hasCalledWorkflow", null);
        setField(term54955, term54955.getClass(), "isConditionStep", null);
        setField(term54955, term54955.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateSub", argTypes, term54955, args);
    }

};


