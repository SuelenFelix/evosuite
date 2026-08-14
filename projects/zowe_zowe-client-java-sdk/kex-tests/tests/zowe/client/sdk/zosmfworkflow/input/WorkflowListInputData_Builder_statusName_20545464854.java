package zowe.client.sdk.zosmfworkflow.input;

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
import static zowe.client.sdk.zosmfworkflow.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class WorkflowListInputData_Builder_statusName_20545464854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2274;
     Object enum8;

    public WorkflowListInputData_Builder_statusName_20545464854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2444 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term2443 = ((Class) term2444).getDeclaredField((String) "CONFIGURATION");
        ((Field) term2443).setAccessible(true);
        Object enum6 = ((Field) term2443).get((Object) null);
        Class<? extends Object> term2740 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term2739 = ((Class) term2740).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term2739).setAccessible(true);
        Object enum7 = ((Field) term2739).get((Object) null);
        term2274 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term2274, term2274.getClass(), "workflowName", "oVcInYnLWB");
        setField(term2274, term2274.getClass(), "category", enum6);
        setField(term2274, term2274.getClass(), "system", "aJlieCFVtF");
        setField(term2274, term2274.getClass(), "statusName", enum7);
        setField(term2274, term2274.getClass(), "owner", "ZiaGIbnzTs");
        setField(term2274, term2274.getClass(), "vendor", "tbcdzjIfER");
        Class<? extends Object> term3050 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term3049 = ((Class) term3050).getDeclaredField((String) "AUTOMATION_IN_PROGRESS");
        ((Field) term3049).setAccessible(true);
        enum8 = ((Field) term3049).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Object[] args = new Object[1];
        args[0] = enum8;
        callMethod(klass, "statusName", argTypes, term2274, args);
    }

};


