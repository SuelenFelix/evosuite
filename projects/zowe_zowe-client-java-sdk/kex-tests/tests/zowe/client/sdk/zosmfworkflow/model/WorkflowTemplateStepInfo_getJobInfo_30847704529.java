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

public class WorkflowTemplateStepInfo_getJobInfo_30847704529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54958;

    public WorkflowTemplateStepInfo_getJobInfo_30847704529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54958 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        setField(term54958, term54958.getClass(), "template", null);
        setField(term54958, term54958.getClass(), "templateSub", null);
        setField(term54958, term54958.getClass(), "submitAs", null);
        setField(term54958, term54958.getClass(), "maxLrecl", null);
        setField(term54958, term54958.getClass(), "jobInfo", null);
        setField(term54958, term54958.getClass(), "output", null);
        setField(term54958, term54958.getClass(), "outputSub", null);
        setField(term54958, term54958.getClass(), "outputVariablesPrefix", null);
        setField(term54958, term54958.getClass(), "procName", null);
        setField(term54958, term54958.getClass(), "regionSize", null);
        setField(term54958, term54958.getClass(), "returnCode", null);
        setField(term54958, term54958.getClass(), "saveAsDataset", null);
        setField(term54958, term54958.getClass(), "saveAsDatasetSub", null);
        setField(term54958, term54958.getClass(), "saveAsUnixFile", null);
        setField(term54958, term54958.getClass(), "saveAsUnixFileSub", null);
        setField(term54958, term54958.getClass(), "scriptParameters", null);
        setField(term54958, term54958.getClass(), "successPattern", null);
        setField(term54958, term54958.getClass(), "failedPattern", null);
        setField(term54958, term54958.getClass(), "timeout", null);
        setField(term54958, term54958.getClass(), "instructions", null);
        setField(term54958, term54958.getClass(), "instructionsSub", null);
        setField(term54958, term54958.getClass(), "variableReferences", null);
        setField(term54958, term54958.getClass(), "name", null);
        setField(term54958, term54958.getClass(), "title", null);
        setField(term54958, term54958.getClass(), "description", null);
        setField(term54958, term54958.getClass(), "state", null);
        setField(term54958, term54958.getClass(), "stepNumber", null);
        setField(term54958, term54958.getClass(), "optional", null);
        setField(term54958, term54958.getClass(), "autoEnable", null);
        setField(term54958, term54958.getClass(), "prereqStep", null);
        setField(term54958, term54958.getClass(), "userDefined", null);
        setField(term54958, term54958.getClass(), "runAsUser", null);
        setField(term54958, term54958.getClass(), "runAsUserDynamic", null);
        setField(term54958, term54958.getClass(), "isRestStep", null);
        setField(term54958, term54958.getClass(), "owner", null);
        setField(term54958, term54958.getClass(), "assignees", null);
        setField(term54958, term54958.getClass(), "skills", null);
        setField(term54958, term54958.getClass(), "weight", null);
        setField(term54958, term54958.getClass(), "hasCalledWorkflow", null);
        setField(term54958, term54958.getClass(), "isConditionStep", null);
        setField(term54958, term54958.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobInfo", argTypes, term54958, args);
    }

};


