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

public class WorkflowTemplateStepInfo_getSubmitAs_80960463527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54956;

    public WorkflowTemplateStepInfo_getSubmitAs_80960463527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54956 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        setField(term54956, term54956.getClass(), "template", null);
        setField(term54956, term54956.getClass(), "templateSub", null);
        setField(term54956, term54956.getClass(), "submitAs", null);
        setField(term54956, term54956.getClass(), "maxLrecl", null);
        setField(term54956, term54956.getClass(), "jobInfo", null);
        setField(term54956, term54956.getClass(), "output", null);
        setField(term54956, term54956.getClass(), "outputSub", null);
        setField(term54956, term54956.getClass(), "outputVariablesPrefix", null);
        setField(term54956, term54956.getClass(), "procName", null);
        setField(term54956, term54956.getClass(), "regionSize", null);
        setField(term54956, term54956.getClass(), "returnCode", null);
        setField(term54956, term54956.getClass(), "saveAsDataset", null);
        setField(term54956, term54956.getClass(), "saveAsDatasetSub", null);
        setField(term54956, term54956.getClass(), "saveAsUnixFile", null);
        setField(term54956, term54956.getClass(), "saveAsUnixFileSub", null);
        setField(term54956, term54956.getClass(), "scriptParameters", null);
        setField(term54956, term54956.getClass(), "successPattern", null);
        setField(term54956, term54956.getClass(), "failedPattern", null);
        setField(term54956, term54956.getClass(), "timeout", null);
        setField(term54956, term54956.getClass(), "instructions", null);
        setField(term54956, term54956.getClass(), "instructionsSub", null);
        setField(term54956, term54956.getClass(), "variableReferences", null);
        setField(term54956, term54956.getClass(), "name", null);
        setField(term54956, term54956.getClass(), "title", null);
        setField(term54956, term54956.getClass(), "description", null);
        setField(term54956, term54956.getClass(), "state", null);
        setField(term54956, term54956.getClass(), "stepNumber", null);
        setField(term54956, term54956.getClass(), "optional", null);
        setField(term54956, term54956.getClass(), "autoEnable", null);
        setField(term54956, term54956.getClass(), "prereqStep", null);
        setField(term54956, term54956.getClass(), "userDefined", null);
        setField(term54956, term54956.getClass(), "runAsUser", null);
        setField(term54956, term54956.getClass(), "runAsUserDynamic", null);
        setField(term54956, term54956.getClass(), "isRestStep", null);
        setField(term54956, term54956.getClass(), "owner", null);
        setField(term54956, term54956.getClass(), "assignees", null);
        setField(term54956, term54956.getClass(), "skills", null);
        setField(term54956, term54956.getClass(), "weight", null);
        setField(term54956, term54956.getClass(), "hasCalledWorkflow", null);
        setField(term54956, term54956.getClass(), "isConditionStep", null);
        setField(term54956, term54956.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubmitAs", argTypes, term54956, args);
    }

};


