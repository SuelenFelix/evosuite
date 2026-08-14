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

public class WorkflowListInputData_Builder_statusName_205454648512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5689;

    public WorkflowListInputData_Builder_statusName_205454648512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5689 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term5689, term5689.getClass(), "workflowName", null);
        setField(term5689, term5689.getClass(), "category", null);
        setField(term5689, term5689.getClass(), "system", null);
        setField(term5689, term5689.getClass(), "statusName", null);
        setField(term5689, term5689.getClass(), "owner", null);
        setField(term5689, term5689.getClass(), "vendor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "statusName", argTypes, term5689, args);
    }

};


