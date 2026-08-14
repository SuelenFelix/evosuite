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

public class WorkflowStartInputData_Builder_stepName_6138166912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24804;

    public WorkflowStartInputData_Builder_stepName_6138166912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24923 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term24922 = ((Class) term24923).getDeclaredField((String) "EXISTING_VALUE");
        ((Field) term24922).setAccessible(true);
        Object enum17 = ((Field) term24922).get((Object) null);
        Boolean term24862 = new Boolean(true);
        term24804 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term24804, term24804.getClass(), "workflowKey", "ZZoLNbeORl");
        setField(term24804, term24804.getClass(), "resolveConflictByUsing", enum17);
        setField(term24804, term24804.getClass(), "stepName", "XjIOUIzJUP");
        setField(term24804, term24804.getClass(), "performSubsequent", term24862);
        setField(term24804, term24804.getClass(), "notificationUrl", "iGTpXnnTqB");
        setField(term24804, term24804.getClass(), "targetSystemuid", "XgJzBOYfQB");
        setField(term24804, term24804.getClass(), "targetSystempwd", "GAPGgDekVG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WmTogHwGLE";
        callMethod(klass, "stepName", argTypes, term24804, args);
    }

};


