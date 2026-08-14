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

public class WorkflowAutomationStatus_getStoppedTime_14113239994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28879;

    public WorkflowAutomationStatus_getStoppedTime_14113239994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28892 = new Long(4872422362414183754L);
        Long term28894 = new Long(6811161968424632369L);
        term28879 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term28879, term28879.getClass(), "startUser", "jIfbtgnHqt");
        setField(term28879, term28879.getClass(), "startedTime", term28892);
        setField(term28879, term28879.getClass(), "stoppedTime", term28894);
        setField(term28879, term28879.getClass(), "currentStepName", "vNvzjymLXH");
        setField(term28879, term28879.getClass(), "currentStepNumber", "TCadyfXzAm");
        setField(term28879, term28879.getClass(), "currentStepTitle", "rSSEpZFUMc");
        setField(term28879, term28879.getClass(), "messageID", "DJHwHjvNlc");
        setField(term28879, term28879.getClass(), "messageText", "ZSBzHqaLtQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStoppedTime", argTypes, term28879, args);
    }

};


