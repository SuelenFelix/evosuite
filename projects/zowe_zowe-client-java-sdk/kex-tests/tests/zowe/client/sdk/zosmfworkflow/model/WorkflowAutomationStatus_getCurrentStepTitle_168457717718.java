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

public class WorkflowAutomationStatus_getCurrentStepTitle_168457717718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29844;

    public WorkflowAutomationStatus_getCurrentStepTitle_168457717718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29844 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29844, term29844.getClass(), "startUser", null);
        setField(term29844, term29844.getClass(), "startedTime", null);
        setField(term29844, term29844.getClass(), "stoppedTime", null);
        setField(term29844, term29844.getClass(), "currentStepName", null);
        setField(term29844, term29844.getClass(), "currentStepNumber", null);
        setField(term29844, term29844.getClass(), "currentStepTitle", null);
        setField(term29844, term29844.getClass(), "messageID", null);
        setField(term29844, term29844.getClass(), "messageText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentStepTitle", argTypes, term29844, args);
    }

};


