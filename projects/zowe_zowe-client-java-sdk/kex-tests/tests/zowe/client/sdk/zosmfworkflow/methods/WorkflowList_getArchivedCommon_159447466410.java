package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class WorkflowList_getArchivedCommon_159447466410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1523;
     Object term1524;

    public WorkflowList_getArchivedCommon_159447466410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1523 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowList"));
        setField(term1523, term1523.getClass(), "connection", null);
        setField(term1523, term1523.getClass(), "request", null);
        Class<? extends Object> term1554 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term1553 = ((Class) term1554).getDeclaredField((String) "DESC");
        ((Field) term1553).setAccessible(true);
        Object enum4 = ((Field) term1553).get((Object) null);
        Class<? extends Object> term1808 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term1807 = ((Class) term1808).getDeclaredField((String) "USER");
        ((Field) term1807).setAccessible(true);
        Object enum5 = ((Field) term1807).get((Object) null);
        term1524 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData"));
        setField(term1524, term1524.getClass(), "orderBy", enum4);
        setField(term1524, term1524.getClass(), "view", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData");
        Object[] args = new Object[1];
        args[0] = term1524;
        callMethod(klass, "getArchivedCommon", argTypes, term1523, args);
    }

};


