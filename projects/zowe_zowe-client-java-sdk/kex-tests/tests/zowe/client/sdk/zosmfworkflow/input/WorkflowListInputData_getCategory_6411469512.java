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

public class WorkflowListInputData_getCategory_6411469512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34762;

    public WorkflowListInputData_getCategory_6411469512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34864 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term34863 = ((Class) term34864).getDeclaredField((String) "GENERAL");
        ((Field) term34863).setAccessible(true);
        Object enum42 = ((Field) term34863).get((Object) null);
        Class<? extends Object> term35142 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term35141 = ((Class) term35142).getDeclaredField((String) "COMPLETE");
        ((Field) term35141).setAccessible(true);
        Object enum43 = ((Field) term35141).get((Object) null);
        term34762 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term34762, term34762.getClass(), "workflowName", "UMMXkhuqzw");
        setField(term34762, term34762.getClass(), "category", enum42);
        setField(term34762, term34762.getClass(), "system", "KyGXZcXJwq");
        setField(term34762, term34762.getClass(), "statusName", enum43);
        setField(term34762, term34762.getClass(), "owner", "TqiCjeuoWE");
        setField(term34762, term34762.getClass(), "vendor", "GWWfkXOYLP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term34762, args);
    }

};


