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

public class WorkflowListInputData_getWorkflowName_11223137310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38917;

    public WorkflowListInputData_getWorkflowName_11223137310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38917 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term38917, term38917.getClass(), "workflowName", null);
        setField(term38917, term38917.getClass(), "category", null);
        setField(term38917, term38917.getClass(), "system", null);
        setField(term38917, term38917.getClass(), "statusName", null);
        setField(term38917, term38917.getClass(), "owner", null);
        setField(term38917, term38917.getClass(), "vendor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowName", argTypes, term38917, args);
    }

};


