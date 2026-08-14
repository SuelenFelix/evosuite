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

public class WorkflowStartInputData_Builder_build_175109083815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27688;

    public WorkflowStartInputData_Builder_build_175109083815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27688 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term27688, term27688.getClass(), "workflowKey", null);
        setField(term27688, term27688.getClass(), "resolveConflictByUsing", null);
        setField(term27688, term27688.getClass(), "stepName", null);
        setField(term27688, term27688.getClass(), "performSubsequent", null);
        setField(term27688, term27688.getClass(), "notificationUrl", null);
        setField(term27688, term27688.getClass(), "targetSystemuid", null);
        setField(term27688, term27688.getClass(), "targetSystempwd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term27688, args);
    }

};


