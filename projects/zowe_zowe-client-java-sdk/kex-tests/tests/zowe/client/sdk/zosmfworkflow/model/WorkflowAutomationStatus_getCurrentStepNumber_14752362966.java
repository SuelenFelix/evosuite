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

public class WorkflowAutomationStatus_getCurrentStepNumber_14752362966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29153;

    public WorkflowAutomationStatus_getCurrentStepNumber_14752362966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29166 = new Long(-2813493605142626659L);
        Long term29168 = new Long(-8885298608300233488L);
        term29153 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29153, term29153.getClass(), "startUser", "GnPrxkKUmR");
        setField(term29153, term29153.getClass(), "startedTime", term29166);
        setField(term29153, term29153.getClass(), "stoppedTime", term29168);
        setField(term29153, term29153.getClass(), "currentStepName", "gVgLmqgxMh");
        setField(term29153, term29153.getClass(), "currentStepNumber", "QWknVCpJTU");
        setField(term29153, term29153.getClass(), "currentStepTitle", "XhnCbWwpIr");
        setField(term29153, term29153.getClass(), "messageID", "BVMUadSiyU");
        setField(term29153, term29153.getClass(), "messageText", "OhWrgFwvJi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentStepNumber", argTypes, term29153, args);
    }

};


