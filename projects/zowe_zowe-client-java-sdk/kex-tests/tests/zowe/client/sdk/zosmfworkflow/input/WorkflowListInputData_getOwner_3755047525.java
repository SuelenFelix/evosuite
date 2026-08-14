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

public class WorkflowListInputData_getOwner_3755047525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36832;

    public WorkflowListInputData_getOwner_3755047525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36946 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term36945 = ((Class) term36946).getDeclaredField((String) "CONFIGURATION");
        ((Field) term36945).setAccessible(true);
        Object enum48 = ((Field) term36945).get((Object) null);
        Class<? extends Object> term37242 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term37241 = ((Class) term37242).getDeclaredField((String) "CANCELED");
        ((Field) term37241).setAccessible(true);
        Object enum49 = ((Field) term37241).get((Object) null);
        term36832 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term36832, term36832.getClass(), "workflowName", "bqIuFFFwnP");
        setField(term36832, term36832.getClass(), "category", enum48);
        setField(term36832, term36832.getClass(), "system", "hDxvvVgGlk");
        setField(term36832, term36832.getClass(), "statusName", enum49);
        setField(term36832, term36832.getClass(), "owner", "XdjSvjaTqk");
        setField(term36832, term36832.getClass(), "vendor", "ukrlYVcvsg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term36832, args);
    }

};


