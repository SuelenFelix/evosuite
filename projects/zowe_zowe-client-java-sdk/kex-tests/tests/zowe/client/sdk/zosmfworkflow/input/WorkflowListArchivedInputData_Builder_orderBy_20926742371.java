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

public class WorkflowListArchivedInputData_Builder_orderBy_20926742371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31703;
     Object enum32;

    public WorkflowListArchivedInputData_Builder_orderBy_20926742371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31737 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term31736 = ((Class) term31737).getDeclaredField((String) "DESC");
        ((Field) term31736).setAccessible(true);
        enum32 = ((Field) term31736).get((Object) null);
        Class<? extends Object> term31991 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term31990 = ((Class) term31991).getDeclaredField((String) "DOMAIN");
        ((Field) term31990).setAccessible(true);
        Object enum33 = ((Field) term31990).get((Object) null);
        term31703 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder"));
        setField(term31703, term31703.getClass(), "orderBy", enum32);
        setField(term31703, term31703.getClass(), "view", enum33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Object[] args = new Object[1];
        args[0] = enum32;
        callMethod(klass, "orderBy", argTypes, term31703, args);
    }

};


