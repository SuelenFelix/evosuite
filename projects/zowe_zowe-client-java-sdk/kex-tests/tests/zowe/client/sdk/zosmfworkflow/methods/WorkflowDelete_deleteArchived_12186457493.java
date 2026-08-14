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

public class WorkflowDelete_deleteArchived_12186457493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4026;

    public WorkflowDelete_deleteArchived_12186457493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4026 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowDelete"));
        setField(term4026, term4026.getClass(), "connection", null);
        setField(term4026, term4026.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowDelete");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "deleteArchived", argTypes, term4026, args);
    }

};


