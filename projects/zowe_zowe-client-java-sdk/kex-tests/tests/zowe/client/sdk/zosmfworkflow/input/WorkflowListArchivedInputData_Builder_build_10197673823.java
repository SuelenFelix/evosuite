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

public class WorkflowListArchivedInputData_Builder_build_10197673823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32767;

    public WorkflowListArchivedInputData_Builder_build_10197673823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32801 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term32800 = ((Class) term32801).getDeclaredField((String) "DESC");
        ((Field) term32800).setAccessible(true);
        Object enum36 = ((Field) term32800).get((Object) null);
        Class<? extends Object> term33055 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term33054 = ((Class) term33055).getDeclaredField((String) "DOMAIN");
        ((Field) term33054).setAccessible(true);
        Object enum37 = ((Field) term33054).get((Object) null);
        term32767 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder"));
        setField(term32767, term32767.getClass(), "orderBy", enum36);
        setField(term32767, term32767.getClass(), "view", enum37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term32767, args);
    }

};


