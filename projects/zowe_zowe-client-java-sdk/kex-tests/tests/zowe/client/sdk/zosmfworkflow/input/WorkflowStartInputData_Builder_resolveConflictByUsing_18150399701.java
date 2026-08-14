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

public class WorkflowStartInputData_Builder_resolveConflictByUsing_18150399701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23893;
     Object enum16;

    public WorkflowStartInputData_Builder_resolveConflictByUsing_18150399701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24137 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term24136 = ((Class) term24137).getDeclaredField((String) "EXISTING_VALUE");
        ((Field) term24136).setAccessible(true);
        Object enum15 = ((Field) term24136).get((Object) null);
        Boolean term23951 = new Boolean(true);
        term23893 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term23893, term23893.getClass(), "workflowKey", "EBSKhqDdUW");
        setField(term23893, term23893.getClass(), "resolveConflictByUsing", enum15);
        setField(term23893, term23893.getClass(), "stepName", "LvLbdICdfA");
        setField(term23893, term23893.getClass(), "performSubsequent", term23951);
        setField(term23893, term23893.getClass(), "notificationUrl", "rtifrlITwl");
        setField(term23893, term23893.getClass(), "targetSystemuid", "yGWXZDjnPS");
        setField(term23893, term23893.getClass(), "targetSystempwd", "vZucxbGVyo");
        Class<? extends Object> term24491 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term24490 = ((Class) term24491).getDeclaredField((String) "LEAVE_CONFLICT");
        ((Field) term24490).setAccessible(true);
        enum16 = ((Field) term24490).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "resolveConflictByUsing", argTypes, term23893, args);
    }

};


