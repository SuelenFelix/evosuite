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

public class WorkflowListInputData_getSystem_5986174163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35442;

    public WorkflowListInputData_getSystem_5986174163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35556 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term35555 = ((Class) term35556).getDeclaredField((String) "CONFIGURATION");
        ((Field) term35555).setAccessible(true);
        Object enum44 = ((Field) term35555).get((Object) null);
        Class<? extends Object> term35852 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term35851 = ((Class) term35852).getDeclaredField((String) "CANCELED");
        ((Field) term35851).setAccessible(true);
        Object enum45 = ((Field) term35851).get((Object) null);
        term35442 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term35442, term35442.getClass(), "workflowName", "qvykDllgpT");
        setField(term35442, term35442.getClass(), "category", enum44);
        setField(term35442, term35442.getClass(), "system", "hzdUbcLZhZ");
        setField(term35442, term35442.getClass(), "statusName", enum45);
        setField(term35442, term35442.getClass(), "owner", "GlxnEJvYeC");
        setField(term35442, term35442.getClass(), "vendor", "SLdOGaqmNv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystem", argTypes, term35442, args);
    }

};


