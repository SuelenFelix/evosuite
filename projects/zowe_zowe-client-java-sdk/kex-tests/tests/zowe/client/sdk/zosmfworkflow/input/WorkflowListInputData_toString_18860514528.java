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

public class WorkflowListInputData_toString_18860514528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38222;

    public WorkflowListInputData_toString_18860514528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38330 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term38329 = ((Class) term38330).getDeclaredField((String) "GENERAL");
        ((Field) term38329).setAccessible(true);
        Object enum52 = ((Field) term38329).get((Object) null);
        Class<? extends Object> term38608 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term38607 = ((Class) term38608).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term38607).setAccessible(true);
        Object enum53 = ((Field) term38607).get((Object) null);
        term38222 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term38222, term38222.getClass(), "workflowName", "jpgWRbSvyQ");
        setField(term38222, term38222.getClass(), "category", enum52);
        setField(term38222, term38222.getClass(), "system", "tFMlYmPEBX");
        setField(term38222, term38222.getClass(), "statusName", enum53);
        setField(term38222, term38222.getClass(), "owner", "ljkZxGNgjZ");
        setField(term38222, term38222.getClass(), "vendor", "hrFtgdcZKS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term38222, args);
    }

};


