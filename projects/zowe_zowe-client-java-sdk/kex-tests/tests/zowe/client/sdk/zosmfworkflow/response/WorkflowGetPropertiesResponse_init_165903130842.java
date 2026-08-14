package zowe.client.sdk.zosmfworkflow.response;

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
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowGetPropertiesResponse_init_165903130842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public WorkflowGetPropertiesResponse_init_165903130842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[38];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.Integer");
        argTypes[16] = Class.forName("java.lang.Boolean");
        argTypes[17] = Class.forName("java.lang.Boolean");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = Class.forName("java.lang.Boolean");
        argTypes[21] = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        argTypes[22] = Class.forName("java.lang.Boolean");
        argTypes[23] = Class.forName("java.lang.String");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.String");
        argTypes[28] = Class.forName("java.lang.String");
        argTypes[29] = Class.forName("java.lang.String");
        argTypes[30] = Class.forName("java.lang.String");
        argTypes[31] = Class.forName("java.lang.String");
        argTypes[32] = Class.forName("java.lang.String");
        argTypes[33] = Class.forName("java.lang.String");
        argTypes[34] = Class.forName("java.lang.String");
        argTypes[35] = Class.forName("java.lang.String");
        argTypes[36] = Class.forName("java.util.List");
        argTypes[37] = Class.forName("java.util.List");
        Object[] args = new Object[38];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = null;
        args[13] = null;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        args[22] = null;
        args[23] = null;
        args[24] = null;
        args[25] = null;
        args[26] = null;
        args[27] = null;
        args[28] = null;
        args[29] = null;
        args[30] = null;
        args[31] = null;
        args[32] = null;
        args[33] = null;
        args[34] = null;
        args[35] = null;
        args[36] = null;
        args[37] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


