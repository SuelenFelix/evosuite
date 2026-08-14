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
import java.lang.Long;

public class WorkflowAutomationStatus_getStartedTime_17659289793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28742;

    public WorkflowAutomationStatus_getStartedTime_17659289793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28755 = new Long(5270370404989704783L);
        Long term28757 = new Long(7411271909051562686L);
        term28742 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term28742, term28742.getClass(), "startUser", "kbxuaUHTXf");
        setField(term28742, term28742.getClass(), "startedTime", term28755);
        setField(term28742, term28742.getClass(), "stoppedTime", term28757);
        setField(term28742, term28742.getClass(), "currentStepName", "CwmyQhyiUR");
        setField(term28742, term28742.getClass(), "currentStepNumber", "PxwyuZAkGy");
        setField(term28742, term28742.getClass(), "currentStepTitle", "ODhSWAnZWd");
        setField(term28742, term28742.getClass(), "messageID", "NQkFXmkuYK");
        setField(term28742, term28742.getClass(), "messageText", "kHzsJWDHsz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartedTime", argTypes, term28742, args);
    }

};


