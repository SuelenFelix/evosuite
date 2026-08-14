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

public class WorkflowListArchivedInputData_getView_14823043362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30655;

    public WorkflowListArchivedInputData_getView_14823043362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30685 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term30684 = ((Class) term30685).getDeclaredField((String) "DESC");
        ((Field) term30684).setAccessible(true);
        Object enum28 = ((Field) term30684).get((Object) null);
        Class<? extends Object> term30939 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term30938 = ((Class) term30939).getDeclaredField((String) "USER");
        ((Field) term30938).setAccessible(true);
        Object enum29 = ((Field) term30938).get((Object) null);
        term30655 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData"));
        setField(term30655, term30655.getClass(), "orderBy", enum28);
        setField(term30655, term30655.getClass(), "view", enum29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getView", argTypes, term30655, args);
    }

};


