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

public class WorkflowList_getWorkflowsCommon_13988750446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term72;

    public WorkflowList_getWorkflowsCommon_13988750446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowList"));
        setField(term71, term71.getClass(), "connection", null);
        setField(term71, term71.getClass(), "request", null);
        Class<? extends Object> term232 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term231 = ((Class) term232).getDeclaredField((String) "GENERAL");
        ((Field) term231).setAccessible(true);
        Object enum0 = ((Field) term231).get((Object) null);
        Class<? extends Object> term632 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term631 = ((Class) term632).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term631).setAccessible(true);
        Object enum1 = ((Field) term631).get((Object) null);
        term72 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term72, term72.getClass(), "workflowName", "xxtlPwDYFs");
        setField(term72, term72.getClass(), "category", enum0);
        setField(term72, term72.getClass(), "system", "jJCZpVmanW");
        setField(term72, term72.getClass(), "statusName", enum1);
        setField(term72, term72.getClass(), "owner", "EGtDIRbSSb");
        setField(term72, term72.getClass(), "vendor", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Object[] args = new Object[1];
        args[0] = term72;
        callMethod(klass, "getWorkflowsCommon", argTypes, term71, args);
    }

};


