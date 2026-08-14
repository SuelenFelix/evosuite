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

public class WorkflowListArchivedInputData_toString_4048642624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31177;

    public WorkflowListArchivedInputData_toString_4048642624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31207 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term31206 = ((Class) term31207).getDeclaredField((String) "DESC");
        ((Field) term31206).setAccessible(true);
        Object enum30 = ((Field) term31206).get((Object) null);
        Class<? extends Object> term31461 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term31460 = ((Class) term31461).getDeclaredField((String) "USER");
        ((Field) term31460).setAccessible(true);
        Object enum31 = ((Field) term31460).get((Object) null);
        term31177 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData"));
        setField(term31177, term31177.getClass(), "orderBy", enum30);
        setField(term31177, term31177.getClass(), "view", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31177, args);
    }

};


