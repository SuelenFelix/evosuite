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

public class WorkflowListInputData_getVendor_3929775196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37542;

    public WorkflowListInputData_getVendor_3929775196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37644 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term37643 = ((Class) term37644).getDeclaredField((String) "GENERAL");
        ((Field) term37643).setAccessible(true);
        Object enum50 = ((Field) term37643).get((Object) null);
        Class<? extends Object> term37922 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term37921 = ((Class) term37922).getDeclaredField((String) "COMPLETE");
        ((Field) term37921).setAccessible(true);
        Object enum51 = ((Field) term37921).get((Object) null);
        term37542 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term37542, term37542.getClass(), "workflowName", "cpjqTCNflQ");
        setField(term37542, term37542.getClass(), "category", enum50);
        setField(term37542, term37542.getClass(), "system", "wiYGATEfmw");
        setField(term37542, term37542.getClass(), "statusName", enum51);
        setField(term37542, term37542.getClass(), "owner", "FiALSqneIg");
        setField(term37542, term37542.getClass(), "vendor", "lGVACSQceQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVendor", argTypes, term37542, args);
    }

};


