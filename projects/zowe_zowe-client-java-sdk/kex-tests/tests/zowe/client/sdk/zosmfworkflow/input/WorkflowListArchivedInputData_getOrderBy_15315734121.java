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

public class WorkflowListArchivedInputData_getOrderBy_15315734121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30133;

    public WorkflowListArchivedInputData_getOrderBy_15315734121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30163 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term30162 = ((Class) term30163).getDeclaredField((String) "DESC");
        ((Field) term30162).setAccessible(true);
        Object enum26 = ((Field) term30162).get((Object) null);
        Class<? extends Object> term30417 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term30416 = ((Class) term30417).getDeclaredField((String) "USER");
        ((Field) term30416).setAccessible(true);
        Object enum27 = ((Field) term30416).get((Object) null);
        term30133 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData"));
        setField(term30133, term30133.getClass(), "orderBy", enum26);
        setField(term30133, term30133.getClass(), "view", enum27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderBy", argTypes, term30133, args);
    }

};


