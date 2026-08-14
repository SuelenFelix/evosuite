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

public class WorkflowStartInputData_Builder_performSubsequent_10215289253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25286;
     Object term25382;

    public WorkflowStartInputData_Builder_performSubsequent_10215289253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25395 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term25394 = ((Class) term25395).getDeclaredField((String) "LEAVE_CONFLICT");
        ((Field) term25394).setAccessible(true);
        Object enum18 = ((Field) term25394).get((Object) null);
        Boolean term25344 = new Boolean(false);
        term25286 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term25286, term25286.getClass(), "workflowKey", "qYOIXsGycY");
        setField(term25286, term25286.getClass(), "resolveConflictByUsing", enum18);
        setField(term25286, term25286.getClass(), "stepName", "sJNXNshRLe");
        setField(term25286, term25286.getClass(), "performSubsequent", term25344);
        setField(term25286, term25286.getClass(), "notificationUrl", "AYnbmgRCKr");
        setField(term25286, term25286.getClass(), "targetSystemuid", "iQRfDlaoYD");
        setField(term25286, term25286.getClass(), "targetSystempwd", "kpcyrjDQzN");
        term25382 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term25382;
        callMethod(klass, "performSubsequent", argTypes, term25286, args);
    }

};


