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

public class WorkflowListInputData_init_5127283760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33302;

    public WorkflowListInputData_init_5127283760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33404 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term33403 = ((Class) term33404).getDeclaredField((String) "GENERAL");
        ((Field) term33403).setAccessible(true);
        Object enum38 = ((Field) term33403).get((Object) null);
        Class<? extends Object> term33682 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term33681 = ((Class) term33682).getDeclaredField((String) "COMPLETE");
        ((Field) term33681).setAccessible(true);
        Object enum39 = ((Field) term33681).get((Object) null);
        term33302 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term33302, term33302.getClass(), "workflowName", "cHqLMqZSmc");
        setField(term33302, term33302.getClass(), "category", enum38);
        setField(term33302, term33302.getClass(), "system", "hkWmAkXSOW");
        setField(term33302, term33302.getClass(), "statusName", enum39);
        setField(term33302, term33302.getClass(), "owner", "DwQmZEKeOp");
        setField(term33302, term33302.getClass(), "vendor", "DbxrFiyttv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term33302;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


