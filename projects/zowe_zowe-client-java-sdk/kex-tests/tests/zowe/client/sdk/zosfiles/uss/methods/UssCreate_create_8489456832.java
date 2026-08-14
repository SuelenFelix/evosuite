package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssCreate_create_8489456832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1982;
     Object term1995;

    public UssCreate_create_8489456832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1982 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssCreate"));
        setField(term1982, term1982.getClass(), "connection", null);
        setField(term1982, term1982.getClass(), "request", null);
        Class<? extends Object> term2059 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.CreateType");
        Field term2058 = ((Class) term2059).getDeclaredField((String) "FILE");
        ((Field) term2058).setAccessible(true);
        Object enum5 = ((Field) term2058).get((Object) null);
        term1995 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData"));
        setField(term1995, term1995.getClass(), "type", enum5);
        setField(term1995, term1995.getClass(), "mode", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssCreate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData");
        Object[] args = new Object[2];
        args[0] = "oVcInYnLWB";
        args[1] = term1995;
        callMethod(klass, "create", argTypes, term1982, args);
    }

};


