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

public class WorkflowAutomationStatus_getStartUser_13880237512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28605;

    public WorkflowAutomationStatus_getStartUser_13880237512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28618 = new Long(-8257434502486459194L);
        Long term28620 = new Long(-8400487765614892086L);
        term28605 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term28605, term28605.getClass(), "startUser", "vepOtOxlWM");
        setField(term28605, term28605.getClass(), "startedTime", term28618);
        setField(term28605, term28605.getClass(), "stoppedTime", term28620);
        setField(term28605, term28605.getClass(), "currentStepName", "XZmoxlxcKh");
        setField(term28605, term28605.getClass(), "currentStepNumber", "aHNGawFCfD");
        setField(term28605, term28605.getClass(), "currentStepTitle", "cHjhnXKTVF");
        setField(term28605, term28605.getClass(), "messageID", "NVsXpTZPoM");
        setField(term28605, term28605.getClass(), "messageText", "OlbhHDRGng");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartUser", argTypes, term28605, args);
    }

};


