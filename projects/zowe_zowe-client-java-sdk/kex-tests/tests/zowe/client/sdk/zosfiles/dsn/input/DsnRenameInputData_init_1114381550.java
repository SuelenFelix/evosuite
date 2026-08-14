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

public class DsnRenameInputData_init_1114381550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public DsnRenameInputData_init_1114381550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9089 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term9088 = ((Class) term9089).getDeclaredField((String) "DATASET");
        ((Field) term9088).setAccessible(true);
        enum0 = ((Field) term9088).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.types.RenameType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = enum0;
        args[1] = "GsWxOwXvSu";
        args[2] = "bKBSncrMEZ";
        args[3] = "yeSXGqQExb";
        args[4] = "uXYcXVYJZM";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


