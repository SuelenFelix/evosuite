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

public class WorkflowListInputData_Builder_build_762359267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4906;

    public WorkflowListInputData_Builder_build_762359267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5048 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term5047 = ((Class) term5048).getDeclaredField((String) "CONFIGURATION");
        ((Field) term5047).setAccessible(true);
        Object enum13 = ((Field) term5047).get((Object) null);
        Class<? extends Object> term5344 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term5343 = ((Class) term5344).getDeclaredField((String) "AUTOMATION_IN_PROGRESS");
        ((Field) term5343).setAccessible(true);
        Object enum14 = ((Field) term5343).get((Object) null);
        term4906 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term4906, term4906.getClass(), "workflowName", "IoAlmYsBwc");
        setField(term4906, term4906.getClass(), "category", enum13);
        setField(term4906, term4906.getClass(), "system", "TEParAifyi");
        setField(term4906, term4906.getClass(), "statusName", enum14);
        setField(term4906, term4906.getClass(), "owner", "OWDIEULEFu");
        setField(term4906, term4906.getClass(), "vendor", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4906, args);
    }

};


