package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnDeleteInputData_init_15360293320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;

    public DsnDeleteInputData_init_15360293320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15379 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        Field term15378 = ((Class) term15379).getDeclaredField((String) "MEMBER");
        ((Field) term15378).setAccessible(true);
        enum6 = ((Field) term15378).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = enum6;
        args[1] = "wmVoFoUVmU";
        args[2] = "lLiSiPCciB";
        args[3] = "PsMKIIEwdR";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


