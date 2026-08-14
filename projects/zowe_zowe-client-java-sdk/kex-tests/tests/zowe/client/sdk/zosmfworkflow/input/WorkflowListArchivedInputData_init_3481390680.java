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

public class WorkflowListArchivedInputData_init_3481390680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29553;

    public WorkflowListArchivedInputData_init_3481390680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29609 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term29608 = ((Class) term29609).getDeclaredField((String) "DESC");
        ((Field) term29608).setAccessible(true);
        Object enum24 = ((Field) term29608).get((Object) null);
        Class<? extends Object> term29895 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term29894 = ((Class) term29895).getDeclaredField((String) "USER");
        ((Field) term29894).setAccessible(true);
        Object enum25 = ((Field) term29894).get((Object) null);
        term29553 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder"));
        setField(term29553, term29553.getClass(), "orderBy", enum24);
        setField(term29553, term29553.getClass(), "view", enum25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term29553;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


