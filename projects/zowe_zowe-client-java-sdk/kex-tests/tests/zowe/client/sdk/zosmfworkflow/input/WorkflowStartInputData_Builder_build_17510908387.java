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

public class WorkflowStartInputData_Builder_build_17510908387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27208;

    public WorkflowStartInputData_Builder_build_17510908387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27320 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term27319 = ((Class) term27320).getDeclaredField((String) "OUTPUT_FILE_VALUE");
        ((Field) term27319).setAccessible(true);
        Object enum22 = ((Field) term27319).get((Object) null);
        Boolean term27271 = new Boolean(false);
        term27208 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term27208, term27208.getClass(), "workflowKey", "IyOhWYyaDV");
        setField(term27208, term27208.getClass(), "resolveConflictByUsing", enum22);
        setField(term27208, term27208.getClass(), "stepName", "omWrkCSFzy");
        setField(term27208, term27208.getClass(), "performSubsequent", term27271);
        setField(term27208, term27208.getClass(), "notificationUrl", "VFYvUTgYFB");
        setField(term27208, term27208.getClass(), "targetSystemuid", "BrWqhEIUUj");
        setField(term27208, term27208.getClass(), "targetSystempwd", "WfUmxdiHcU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term27208, args);
    }

};


