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
import java.lang.Boolean;

public class WorkflowStartInputData_init_226811120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27991;

    public WorkflowStartInputData_init_226811120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28103 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term28102 = ((Class) term28103).getDeclaredField((String) "OUTPUT_FILE_VALUE");
        ((Field) term28102).setAccessible(true);
        Object enum23 = ((Field) term28102).get((Object) null);
        Boolean term28054 = new Boolean(false);
        term27991 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term27991, term27991.getClass(), "workflowKey", "LWEYaXeKBe");
        setField(term27991, term27991.getClass(), "resolveConflictByUsing", enum23);
        setField(term27991, term27991.getClass(), "stepName", "cNoFvpHBHw");
        setField(term27991, term27991.getClass(), "performSubsequent", term28054);
        setField(term27991, term27991.getClass(), "notificationUrl", "DoSWbCtsBg");
        setField(term27991, term27991.getClass(), "targetSystemuid", "NrXtkbXwDc");
        setField(term27991, term27991.getClass(), "targetSystempwd", "EUapSrAmOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term27991;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


