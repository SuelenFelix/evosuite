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

public class WorkflowAutomationStatus_getMessageText_11785815189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29564;

    public WorkflowAutomationStatus_getMessageText_11785815189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29577 = new Long(-316468845751588286L);
        Long term29579 = new Long(5127676408959197577L);
        term29564 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29564, term29564.getClass(), "startUser", "wIDeyLnekQ");
        setField(term29564, term29564.getClass(), "startedTime", term29577);
        setField(term29564, term29564.getClass(), "stoppedTime", term29579);
        setField(term29564, term29564.getClass(), "currentStepName", "tOGPTIqSMm");
        setField(term29564, term29564.getClass(), "currentStepNumber", "cFwZnaLmLP");
        setField(term29564, term29564.getClass(), "currentStepTitle", "cBtfnWBMkE");
        setField(term29564, term29564.getClass(), "messageID", "sFixkFlMhw");
        setField(term29564, term29564.getClass(), "messageText", "wNaCYPwDGZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessageText", argTypes, term29564, args);
    }

};


