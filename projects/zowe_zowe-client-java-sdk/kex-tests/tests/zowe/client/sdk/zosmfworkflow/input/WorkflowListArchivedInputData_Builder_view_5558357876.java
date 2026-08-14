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

public class WorkflowListArchivedInputData_Builder_view_5558357876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33300;

    public WorkflowListArchivedInputData_Builder_view_5558357876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33300 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder"));
        setField(term33300, term33300.getClass(), "orderBy", null);
        setField(term33300, term33300.getClass(), "view", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.ViewType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "view", argTypes, term33300, args);
    }

};


