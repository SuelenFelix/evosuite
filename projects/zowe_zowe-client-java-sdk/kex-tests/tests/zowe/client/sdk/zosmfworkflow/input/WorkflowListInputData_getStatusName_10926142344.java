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

public class WorkflowListInputData_getStatusName_10926142344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36152;

    public WorkflowListInputData_getStatusName_10926142344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36254 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term36253 = ((Class) term36254).getDeclaredField((String) "GENERAL");
        ((Field) term36253).setAccessible(true);
        Object enum46 = ((Field) term36253).get((Object) null);
        Class<? extends Object> term36532 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term36531 = ((Class) term36532).getDeclaredField((String) "COMPLETE");
        ((Field) term36531).setAccessible(true);
        Object enum47 = ((Field) term36531).get((Object) null);
        term36152 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term36152, term36152.getClass(), "workflowName", "QZfhwDBzyR");
        setField(term36152, term36152.getClass(), "category", enum46);
        setField(term36152, term36152.getClass(), "system", "HvnMmAOZev");
        setField(term36152, term36152.getClass(), "statusName", enum47);
        setField(term36152, term36152.getClass(), "owner", "JTPAQsfRtT");
        setField(term36152, term36152.getClass(), "vendor", "otxkkKfDfl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusName", argTypes, term36152, args);
    }

};


