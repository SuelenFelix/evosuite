package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class WorkflowStart_startCommon_21240376953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3817;
     Object term3818;

    public WorkflowStart_startCommon_21240376953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3817 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowStart"));
        setField(term3817, term3817.getClass(), "connection", null);
        setField(term3817, term3817.getClass(), "request", null);
        Boolean term3855 = new Boolean(true);
        term3818 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term3818, term3818.getClass(), "workflowKey", "BKLfkLiZTH");
        setField(term3818, term3818.getClass(), "resolveConflictByUsing", "SPpkrGcPRr");
        setField(term3818, term3818.getClass(), "stepName", "sEccwbJKYE");
        setField(term3818, term3818.getClass(), "performSubsequent", term3855);
        setField(term3818, term3818.getClass(), "notificationUrl", "AWRooQKkdW");
        setField(term3818, term3818.getClass(), "targetSystemuid", "vjxIhXHxGR");
        setField(term3818, term3818.getClass(), "targetSystempwd", "QXzGXbEXMu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowStart");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Object[] args = new Object[1];
        args[0] = term3818;
        callMethod(klass, "startCommon", argTypes, term3817, args);
    }

};


