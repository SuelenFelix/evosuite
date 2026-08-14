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

public class WorkflowListInputData_Builder_category_20655541332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;
     Object enum2;

    public WorkflowListInputData_Builder_category_20655541332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term994 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term993 = ((Class) term994).getDeclaredField((String) "GENERAL");
        ((Field) term993).setAccessible(true);
        enum2 = ((Field) term993).get((Object) null);
        Class<? extends Object> term1272 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term1271 = ((Class) term1272).getDeclaredField((String) "COMPLETE");
        ((Field) term1271).setAccessible(true);
        Object enum3 = ((Field) term1271).get((Object) null);
        term892 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term892, term892.getClass(), "workflowName", "EGtDIRbSSb");
        setField(term892, term892.getClass(), "category", enum2);
        setField(term892, term892.getClass(), "system", "SzjVpOQTyS");
        setField(term892, term892.getClass(), "statusName", enum3);
        setField(term892, term892.getClass(), "owner", "MjGYSRKTNF");
        setField(term892, term892.getClass(), "vendor", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "category", argTypes, term892, args);
    }

};


